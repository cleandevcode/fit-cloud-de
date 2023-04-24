package cn.sharesdk.sina.weibo.utils;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.mob.tools.FakeActivity;
import com.mob.tools.RxMob;
import com.mob.tools.network.KVPair;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class WebAuthPage extends FakeActivity implements View.OnClickListener {
    private static final String AUTH_URL = "https://open.weibo.cn/oauth2/authorize";
    public static final String SCOPE = "email,direct_messages_read,direct_messages_write,friendships_groups_read,friendships_groups_write,statuses_to_me_read,follow_app_official_microblog,invitation_write";
    private AuthorizeListener actionListener;
    private String appKey;
    private Button btnRetry;
    private cn.sharesdk.sina.weibo.sdk.a.a layout;
    private LinearLayout llRetry;
    private int pageStatus;
    private String redirectUrl;
    private String token;
    private TextView tvBack;
    private WebView webView;

    public String getAuthorizeUrl() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KVPair("client_id", this.appKey));
        arrayList.add(new KVPair("response_type", "code"));
        arrayList.add(new KVPair("redirect_uri", this.redirectUrl));
        arrayList.add(new KVPair("packagename", this.activity.getPackageName()));
        arrayList.add(new KVPair("response_type", "code"));
        arrayList.add(new KVPair("luicode", "10000360"));
        String str = this.token;
        if (str != null && !TextUtils.isEmpty(str)) {
            arrayList.add(new KVPair("trans_token", this.token));
            arrayList.add(new KVPair("trans_access_token", this.token));
        }
        arrayList.add(new KVPair(WiseOpenHianalyticsData.UNION_VERSION, "0041005000"));
        arrayList.add(new KVPair("scope", SCOPE));
        arrayList.add(new KVPair("display", "mobile"));
        return "https://open.weibo.cn/oauth2/authorize?" + ResHelper.encodeUrl(arrayList);
    }

    private void initView() {
        this.tvBack = this.layout.b();
        this.webView = this.layout.c();
        this.llRetry = this.layout.d();
        this.btnRetry = this.layout.a();
        this.tvBack.setOnClickListener(this);
        this.btnRetry.setOnClickListener(this);
        if (ShareSDK.isRemoveCookieOnAuthorize()) {
            CookieSyncManager.createInstance(this.activity);
            CookieManager.getInstance().removeAllCookie();
        }
        this.webView.setWebViewClient(new WebViewClient() { // from class: cn.sharesdk.sina.weibo.utils.WebAuthPage.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                if (WebAuthPage.this.pageStatus == -1) {
                    WebAuthPage.this.llRetry.setVisibility(0);
                    WebAuthPage.this.webView.setVisibility(8);
                }
                WebAuthPage.this.pageStatus = 0;
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                String url = webView.getUrl();
                if (TextUtils.isEmpty(url) || TextUtils.isEmpty(str2)) {
                    return;
                }
                Uri parse = Uri.parse(url);
                Uri parse2 = Uri.parse(str2);
                if (parse.getHost().equals(parse2.getHost()) && parse.getScheme().equals(parse2.getScheme())) {
                    WebAuthPage.this.pageStatus = -1;
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.startsWith(WebAuthPage.this.redirectUrl)) {
                    if (WebAuthPage.this.actionListener != null) {
                        WebAuthPage.this.reCode(str);
                        return true;
                    }
                    return true;
                }
                return false;
            }
        });
        loadWebView();
    }

    private String loadWebView() {
        RxMob.Subscribable create = RxMob.create(new RxMob.OnSubscribe<String>() { // from class: cn.sharesdk.sina.weibo.utils.WebAuthPage.2
            @Override // com.mob.tools.RxMob.OnSubscribe
            public void call(RxMob.Subscriber<String> subscriber) {
                WebAuthPage.this.webView.loadUrl(WebAuthPage.this.getAuthorizeUrl());
                subscriber.onCompleted();
            }
        });
        RxMob.Thread thread = RxMob.Thread.UI_THREAD;
        create.subscribeOn(thread);
        create.observeOn(thread);
        create.subscribe(new RxMob.Subscriber<String>() { // from class: cn.sharesdk.sina.weibo.utils.WebAuthPage.3
            @Override // com.mob.tools.RxMob.Subscriber
            public void onCompleted() {
                super.onCompleted();
            }

            @Override // com.mob.tools.RxMob.Subscriber
            public void onError(Throwable th2) {
                SSDKLog.b().a(th2);
            }
        });
        return null;
    }

    public void reCode(String str) {
        Bundle urlToBundle = ResHelper.urlToBundle(str);
        if (urlToBundle.containsKey(Oauth2AccessToken.KEY_ACCESS_TOKEN)) {
            this.actionListener.onComplete(urlToBundle);
        } else if (urlToBundle.containsKey("error")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_uri:", urlToBundle.containsKey("error_uri") ? urlToBundle.getString("error_uri") : "");
                jSONObject.put("error:", urlToBundle.containsKey("error") ? urlToBundle.getString("error") : "");
                jSONObject.put("error_description:", urlToBundle.containsKey("error_description") ? urlToBundle.getString("error_description") : "");
                jSONObject.put("error_code:", urlToBundle.containsKey("error_code") ? urlToBundle.getString("error_code") : "");
                this.actionListener.onError(new Throwable(jSONObject.toString()));
            } catch (Throwable th2) {
                SSDKLog.b().d(th2);
                this.actionListener.onError(th2);
            }
        }
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AuthorizeListener authorizeListener;
        if (view == this.tvBack && (authorizeListener = this.actionListener) != null) {
            authorizeListener.onCancel();
            finish();
        } else if (view == this.btnRetry) {
            this.llRetry.setVisibility(8);
            this.webView.setVisibility(0);
            loadWebView();
        }
    }

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        this.layout = new cn.sharesdk.sina.weibo.sdk.a.a(getContext());
        this.activity.setContentView(this.layout.a(ResHelper.getStringRes(getContext(), "ssdk_sina_web_login_title")));
        initView();
    }

    @Override // com.mob.tools.FakeActivity
    public void onDestroy() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.setFocusable(false);
        }
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onFinish() {
        if (this.actionListener != null) {
            this.actionListener = null;
        }
        return super.onFinish();
    }

    @Override // com.mob.tools.FakeActivity
    public boolean onKeyEvent(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && keyEvent.getAction() == 0) {
            AuthorizeListener authorizeListener = this.actionListener;
            if (authorizeListener != null) {
                authorizeListener.onCancel();
            }
            finish();
            return true;
        }
        return false;
    }

    public void setAuthParams(String str, String str2, String str3) {
        this.appKey = str;
        this.redirectUrl = str2;
        this.token = str3;
    }

    public void setListener(AuthorizeListener authorizeListener) {
        this.actionListener = authorizeListener;
    }
}
