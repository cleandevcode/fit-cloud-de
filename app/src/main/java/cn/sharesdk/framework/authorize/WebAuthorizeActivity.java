package cn.sharesdk.framework.authorize;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.TitleLayout;
import cn.sharesdk.framework.authorize.ResizeLayout;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.MobSDK;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.ResHelper;
import com.mob.tools.utils.UIHandler;

/* loaded from: classes.dex */
public class WebAuthorizeActivity extends AbstractAuthorizeActivity implements Handler.Callback, ResizeLayout.OnResizeListener {
    public static final int MSG_AUTH_URL_GOT = 2;
    private AuthorizeAdapter adapter;
    public AuthorizeListener listener;
    private RegisterView rv;
    private WebView webView;

    /* loaded from: classes.dex */
    public static class a implements Interpolator {

        /* renamed from: a */
        private float[] f5199a;

        private a() {
            this.f5199a = new float[]{0.0f, 0.02692683f, 0.053847015f, 0.080753915f, 0.10764089f, 0.13450131f, 0.16132854f, 0.18811597f, 0.21485697f, 0.24154496f, 0.26817337f, 0.2947356f, 0.3212251f, 0.34763536f, 0.37395984f, 0.40019205f, 0.42632553f, 0.4523538f, 0.47827047f, 0.50406915f, 0.52974343f, 0.555287f, 0.5806936f, 0.60595685f, 0.6310707f, 0.65602875f, 0.68082494f, 0.70545316f, 0.72990733f, 0.75418144f, 0.7782694f, 0.8021654f, 0.8258634f, 0.8493577f, 0.8726424f, 0.89571184f, 0.9185602f, 0.94118196f, 0.9635715f, 0.9857233f, 1.0076319f, 1.0292919f, 1.0506978f, 1.0718446f, 1.0927268f, 1.1133395f, 1.1336775f, 1.1537358f, 1.1735094f, 1.1929934f, 1.1893399f, 1.1728106f, 1.1565471f, 1.1405534f, 1.1248333f, 1.1093911f, 1.0942302f, 1.0793544f, 1.0647675f, 1.050473f, 1.0364745f, 1.0227754f, 1.0093791f, 0.99628896f, 0.9835081f, 0.9710398f, 0.958887f, 0.9470527f, 0.93553996f, 0.9243516f, 0.91349024f, 0.90295863f, 0.90482706f, 0.9114033f, 0.91775465f, 0.9238795f, 0.9297765f, 0.93544406f, 0.9408808f, 0.94608533f, 0.95105654f, 0.955793f, 0.9602937f, 0.9645574f, 0.96858317f, 0.9723699f, 0.97591674f, 0.97922283f, 0.9822872f, 0.9851093f, 0.98768836f, 0.9900237f, 0.9921147f, 0.993961f, 0.99556196f, 0.9969173f, 0.9980267f, 0.99888986f, 0.99950653f, 0.9998766f, 1.0f};
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) (f10 * 100.0f);
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 > 100) {
                i10 = 100;
            }
            return this.f5199a[i10];
        }
    }

    private AuthorizeAdapter getAdapter() {
        String string;
        try {
            ActivityInfo activityInfo = this.activity.getPackageManager().getActivityInfo(this.activity.getComponentName(), 128);
            Bundle bundle = activityInfo.metaData;
            if (bundle != null && !bundle.isEmpty() && (((string = activityInfo.metaData.getString("AuthorizeAdapter")) != null && string.length() > 0) || ((string = activityInfo.metaData.getString("Adapter")) != null && string.length() > 0))) {
                Object newInstance = Class.forName(string).newInstance();
                if (newInstance instanceof AuthorizeAdapter) {
                    return (AuthorizeAdapter) newInstance;
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            SSDKLog.b().b(th2);
            return null;
        }
    }

    @Override // cn.sharesdk.framework.authorize.ResizeLayout.OnResizeListener
    public void OnResize(int i10, int i11, int i12, int i13) {
        AuthorizeAdapter authorizeAdapter = this.adapter;
        if (authorizeAdapter != null) {
            authorizeAdapter.onResize(i10, i11, i12, i13);
        }
    }

    public RegisterView getBodyView() {
        String str;
        RegisterView registerView = new RegisterView(this.activity);
        registerView.a().setOnClickListener(new View.OnClickListener() { // from class: cn.sharesdk.framework.authorize.WebAuthorizeActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                new Thread() { // from class: cn.sharesdk.framework.authorize.WebAuthorizeActivity.1.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            new Instrumentation().sendKeyDownUpSync(4);
                        } catch (Throwable th2) {
                            SSDKLog.b().b(th2);
                            AuthorizeListener authorizeListener = WebAuthorizeActivity.this.helper.getAuthorizeListener();
                            if (authorizeListener != null) {
                                authorizeListener.onCancel();
                            }
                            WebAuthorizeActivity.this.finish();
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
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        b authorizeWebviewClient = this.helper.getAuthorizeWebviewClient(this);
        if (authorizeWebviewClient != null) {
            str = authorizeWebviewClient.getClass().getSimpleName();
        } else {
            str = "";
        }
        if ((!TextUtils.isEmpty(str) && str.equals("GooglePlusAuthorizeWebviewClient")) || ((!TextUtils.isEmpty(str) && str.contains("GooglePlus")) || str.equals("YoutubeAuthorizeWebviewClient"))) {
            this.webView.getSettings().setUserAgentString(a.b.b(a.b.b(a.b.b("Mozilla/5.0 (Linux; Android 5.1; m2 note Build/LMY47D) AppleWebKit/537.36 (KHTML, like Gecko) ", "Version/4.0 "), "Chrome/40.0.2214.127 "), "Mobile Safari/537.36"));
        }
        this.webView.setWebViewClient(authorizeWebviewClient);
        new Thread() { // from class: cn.sharesdk.framework.authorize.WebAuthorizeActivity.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.authorize.WebAuthorizeActivity.2.1
                        @Override // com.mob.tools.utils.DH.DHResponder
                        public void onResponse(DH.DHResponse dHResponse) {
                            String detailNetworkTypeForStatic = dHResponse.getDetailNetworkTypeForStatic();
                            Message message = new Message();
                            message.what = 2;
                            if ("none".equals(detailNetworkTypeForStatic)) {
                                message.arg1 = 1;
                            } else {
                                if (ShareSDK.isRemoveCookieOnAuthorize()) {
                                    CookieSyncManager.createInstance(WebAuthorizeActivity.this.activity);
                                    CookieManager.getInstance().removeAllCookie();
                                }
                                message.obj = WebAuthorizeActivity.this.helper.getAuthorizeUrl();
                            }
                            UIHandler.sendMessage(message, WebAuthorizeActivity.this);
                        }
                    });
                } catch (Throwable th2) {
                    SSDKLog.b().b(th2);
                }
            }
        }.start();
        return registerView;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AuthorizeListener authorizeListener;
        Throwable th2;
        if (message.what == 2) {
            if (message.arg1 == 1) {
                authorizeListener = this.helper.getAuthorizeListener();
                if (authorizeListener != null) {
                    StringBuilder a10 = d.a("Network error (platform: ");
                    a10.append(this.helper.getPlatform().getName());
                    a10.append(")");
                    th2 = new Throwable(a10.toString());
                } else {
                    return false;
                }
            } else {
                String str = (String) message.obj;
                if (TextUtils.isEmpty(str)) {
                    finish();
                    authorizeListener = this.helper.getAuthorizeListener();
                    if (authorizeListener != null) {
                        StringBuilder a11 = d.a("Authorize URL is empty (platform: ");
                        a11.append(this.helper.getPlatform().getName());
                        a11.append(")");
                        th2 = new Throwable(a11.toString());
                    } else {
                        return false;
                    }
                } else {
                    this.webView.loadUrl(str);
                    return false;
                }
            }
            authorizeListener.onError(th2);
            return false;
        }
        return false;
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        if (this.rv == null) {
            RegisterView bodyView = getBodyView();
            this.rv = bodyView;
            bodyView.a(this);
            this.rv.a(this.adapter.isNotitle());
            this.adapter.setBodyView(this.rv.d());
            this.adapter.setWebView(this.rv.b());
            TitleLayout c10 = this.rv.c();
            this.adapter.setTitleView(c10);
            String name = this.helper.getPlatform().getName();
            this.adapter.setPlatformName(this.helper.getPlatform().getName());
            try {
                Context context = getContext();
                c10.getTvTitle().setText(ResHelper.getStringRes(context, "ssdk_" + name.toLowerCase()));
            } catch (Throwable th2) {
                try {
                    c10.getTvTitle().setText(ResHelper.getStringRes(getContext(), "ssdk_weibo_oauth_regiseter"));
                } catch (Throwable unused) {
                    SSDKLog.b().b(th2);
                }
            }
        }
        this.adapter.onCreate();
        AuthorizeAdapter authorizeAdapter = this.adapter;
        if (authorizeAdapter != null && !authorizeAdapter.isPopUpAnimationDisable()) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(550L);
            scaleAnimation.setInterpolator(new a());
            this.rv.setAnimation(scaleAnimation);
        }
        disableScreenCapture();
        this.activity.setContentView(this.rv);
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        AuthorizeAdapter authorizeAdapter = this.adapter;
        if (authorizeAdapter != null) {
            authorizeAdapter.onDestroy();
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.setFocusable(false);
        }
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onFinish() {
        AuthorizeAdapter authorizeAdapter = this.adapter;
        if (authorizeAdapter != null) {
            return authorizeAdapter.onFinish();
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.destroy();
            this.webView.removeAllViews();
        }
        Activity activity = this.activity;
        if (activity != null) {
            ((ViewGroup) activity.getWindow().getDecorView()).removeAllViews();
        }
        return super.onFinish();
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onKeyEvent(int i10, KeyEvent keyEvent) {
        AuthorizeListener authorizeListener;
        AuthorizeAdapter authorizeAdapter = this.adapter;
        boolean onKeyEvent = authorizeAdapter != null ? authorizeAdapter.onKeyEvent(i10, keyEvent) : false;
        if (!onKeyEvent && i10 == 4 && keyEvent.getAction() == 0 && (authorizeListener = this.helper.getAuthorizeListener()) != null) {
            authorizeListener.onCancel();
        }
        if (onKeyEvent) {
            return true;
        }
        return super.onKeyEvent(i10, keyEvent);
    }

    @Override // com.mob.tools.FakeActivity
    public void onPause() {
        AuthorizeAdapter authorizeAdapter = this.adapter;
        if (authorizeAdapter != null) {
            authorizeAdapter.onPause();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onRestart() {
        AuthorizeAdapter authorizeAdapter = this.adapter;
        if (authorizeAdapter != null) {
            authorizeAdapter.onRestart();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onResume() {
        AuthorizeAdapter authorizeAdapter = this.adapter;
        if (authorizeAdapter != null) {
            authorizeAdapter.onResume();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onStart() {
        AuthorizeAdapter authorizeAdapter = this.adapter;
        if (authorizeAdapter != null) {
            authorizeAdapter.onStart();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onStop() {
        AuthorizeAdapter authorizeAdapter = this.adapter;
        if (authorizeAdapter != null) {
            authorizeAdapter.onStop();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void setActivity(Activity activity) {
        super.setActivity(activity);
        if (this.adapter == null) {
            AuthorizeAdapter adapter = getAdapter();
            this.adapter = adapter;
            if (adapter == null) {
                this.adapter = new AuthorizeAdapter();
            }
        }
        this.adapter.setActivity(activity);
    }

    public void setAuthorizeListener(AuthorizeListener authorizeListener) {
        this.listener = authorizeListener;
    }
}
