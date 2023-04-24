package com.sina.weibo.sdk.web.a;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.sina.weibo.sdk.auth.AccessTokenHelper;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.b.e;
import com.sina.weibo.sdk.common.UiError;

/* loaded from: classes.dex */
public final class a extends b {
    public a(Activity activity, com.sina.weibo.sdk.web.a aVar, com.sina.weibo.sdk.web.b.b bVar) {
        super(activity, aVar, bVar);
    }

    private boolean l(String str) {
        Bundle g10;
        AuthInfo a10 = this.aA.u().a();
        return (a10 == null || !str.startsWith(a10.getRedirectUrl()) || (g10 = e.g(str)) == null || TextUtils.isEmpty(g10.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN))) ? false : true;
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        WbAuthListener wbAuthListener;
        UiError uiError;
        super.onPageFinished(webView, str);
        AuthInfo a10 = this.aA.u().a();
        if (a10 == null || !str.startsWith(a10.getRedirectUrl())) {
            return;
        }
        String r10 = this.aA.u().r();
        if (!TextUtils.isEmpty(r10)) {
            WbAuthListener a11 = this.ax.a(r10);
            this.aB = a11;
            if (a11 != null) {
                Bundle g10 = e.g(str);
                if (g10 != null) {
                    String string = g10.getString("error");
                    String string2 = g10.getString("error_code");
                    String string3 = g10.getString("error_description");
                    if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                        Oauth2AccessToken parseAccessToken = Oauth2AccessToken.parseAccessToken(g10);
                        AccessTokenHelper.writeAccessToken(this.ay, parseAccessToken);
                        this.aB.onComplete(parseAccessToken);
                        this.ax.b(r10);
                    } else {
                        wbAuthListener = this.aB;
                        uiError = new UiError(-1, string2, string3);
                    }
                } else {
                    wbAuthListener = this.aB;
                    uiError = new UiError(-1, "bundle is null", "parse url error");
                }
                wbAuthListener.onError(uiError);
                this.ax.b(r10);
            }
        }
        com.sina.weibo.sdk.web.a aVar = this.az;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final void q() {
        super.q();
        String r10 = this.aA.u().r();
        if (!TextUtils.isEmpty(r10)) {
            WbAuthListener a10 = this.ax.a(r10);
            this.aB = a10;
            if (a10 != null) {
                a10.onCancel();
            }
            this.ax.b(r10);
        }
        com.sina.weibo.sdk.web.a aVar = this.az;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.sina.weibo.sdk.web.a.b
    public final boolean s() {
        q();
        return true;
    }

    @Override // com.sina.weibo.sdk.web.a.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return l(webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return l(str);
    }
}
