package cn.sharesdk.framework.authorize;

import android.webkit.WebView;
import cn.sharesdk.framework.g;

/* loaded from: classes.dex */
public abstract class b extends g {
    public WebAuthorizeActivity activity;
    public AuthorizeListener listener;
    public String redirectUri;

    public b(WebAuthorizeActivity webAuthorizeActivity) {
        this.activity = webAuthorizeActivity;
        AuthorizeHelper helper = webAuthorizeActivity.getHelper();
        this.redirectUri = helper.getRedirectUri();
        this.listener = helper.getAuthorizeListener();
    }

    public abstract void onComplete(String str);

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        webView.stopLoading();
        AuthorizeListener authorizeListener = this.activity.getHelper().getAuthorizeListener();
        this.activity.finish();
        if (authorizeListener != null) {
            authorizeListener.onError(new Throwable(str + " (" + i10 + "): " + str2));
        }
    }
}
