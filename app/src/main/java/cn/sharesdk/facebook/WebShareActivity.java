package cn.sharesdk.facebook;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.authorize.RegisterView;
import cn.sharesdk.framework.g;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import com.mob.tools.FakeActivity;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import java.util.HashMap;

/* loaded from: classes.dex */
public class WebShareActivity extends FakeActivity {
    private a adapter;

    /* renamed from: pa */
    private PlatformActionListener f4996pa;
    private boolean resultFailed;
    private boolean resultOk;
    private RegisterView rv;
    private String scheme;
    private WebView webView;

    public void afterShare(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = new String(str);
        }
        Bundle urlToBundle = ResHelper.urlToBundle(str);
        if (urlToBundle == null) {
            this.resultFailed = true;
            finish();
            this.f4996pa.onError(null, 0, new Throwable(a.b.b("failed to parse callback uri: ", str2)));
            return;
        }
        String string = urlToBundle.getString("post_id");
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(string)) {
            hashMap.put("post_id", string);
        }
        if (!urlToBundle.containsKey("error_code") && !urlToBundle.containsKey("error")) {
            this.resultOk = true;
            finish();
            this.f4996pa.onComplete(null, 0, hashMap);
            return;
        }
        if (this.f4996pa != null) {
            String string2 = urlToBundle.getString("error_code");
            if (urlToBundle.containsKey("error_code") && string2.equals("4201")) {
                this.f4996pa.onCancel(null, 9);
            } else {
                this.f4996pa.onError(null, 9, new Throwable(ResHelper.encodeUrl(urlToBundle)));
            }
        }
        this.resultFailed = true;
        finish();
    }

    private a getAdapter() {
        try {
            String string = this.activity.getPackageManager().getActivityInfo(this.activity.getComponentName(), 128).metaData.getString("FBWebShareAdapter");
            if (string != null && string.length() > 0) {
                Object newInstance = Class.forName(string).newInstance();
                if (newInstance instanceof a) {
                    return (a) newInstance;
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            return null;
        }
    }

    public RegisterView getBodyView() {
        RegisterView registerView = new RegisterView(this.activity);
        registerView.c().getChildAt(registerView.c().getChildCount() - 1).setVisibility(8);
        registerView.a().setOnClickListener(new View.OnClickListener() { // from class: cn.sharesdk.facebook.WebShareActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                new Thread() { // from class: cn.sharesdk.facebook.WebShareActivity.2.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            new Instrumentation().sendKeyDownUpSync(4);
                        } catch (Throwable th2) {
                            SSDKLog.b().a(th2);
                            WebShareActivity.this.finish();
                            WebShareActivity.this.f4996pa.onCancel(null, 0);
                        }
                    }
                }.start();
            }
        });
        WebView b10 = registerView.b();
        this.webView = b10;
        WebSettings settings = b10.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSavePassword(false);
        settings.setDatabasePath(this.activity.getDir("database", 0).getPath());
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.setWebViewClient(new g() { // from class: cn.sharesdk.facebook.WebShareActivity.3
            @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str != null) {
                    try {
                        if (str.startsWith("fbconnect://success")) {
                            WebShareActivity.this.afterShare(str);
                        }
                    } catch (Exception e10) {
                        SSDKLog.b().a(e10.getMessage(), new Object[0]);
                    }
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }
        });
        return registerView;
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        this.rv = getBodyView();
        try {
            int stringRes = ResHelper.getStringRes(getContext(), "ssdk_share_to_facebook");
            if (stringRes > 0) {
                this.rv.c().getTvTitle().setText(stringRes);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
            this.rv.c().setVisibility(8);
        }
        this.adapter.a(this.rv.d());
        this.adapter.a(this.rv.b());
        this.adapter.a(this.rv.c());
        this.adapter.a();
        disableScreenCapture();
        this.activity.setContentView(this.rv);
        DH.requester(MobSDK.getContext()).getNetworkTypeForStatic().request(new DH.DHResponder() { // from class: cn.sharesdk.facebook.WebShareActivity.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    if (!"none".equals(dHResponse.getNetworkTypeForStatic())) {
                        WebShareActivity.this.rv.b().loadUrl(WebShareActivity.this.scheme);
                        return;
                    }
                    WebShareActivity.this.resultFailed = true;
                    WebShareActivity.this.finish();
                    WebShareActivity.this.f4996pa.onError(null, 0, new Throwable("failed to load webpage, network disconnected."));
                } catch (Throwable th3) {
                    SSDKLog.b().a(th3);
                }
            }
        });
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        if (!this.resultFailed && !this.resultOk) {
            this.f4996pa.onCancel(null, 0);
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.setFocusable(false);
        }
        a aVar = this.adapter;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onFinish() {
        a aVar = this.adapter;
        return aVar != null ? aVar.h() : super.onFinish();
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        a aVar = this.adapter;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onRestart() {
        a aVar = this.adapter;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        a aVar = this.adapter;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onStart() {
        a aVar = this.adapter;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        a aVar = this.adapter;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void setActivity(Activity activity) {
        super.setActivity(activity);
        if (this.adapter == null) {
            a adapter = getAdapter();
            this.adapter = adapter;
            if (adapter == null) {
                this.adapter = new a();
            }
        }
        this.adapter.a(activity);
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setSharedCallback(PlatformActionListener platformActionListener) {
        this.f4996pa = platformActionListener;
    }
}
