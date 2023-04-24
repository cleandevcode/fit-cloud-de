package cn.sharesdk.instagram;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import cn.sharesdk.facebook.e;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends cn.sharesdk.framework.authorize.b {

    /* renamed from: a */
    private boolean f5332a;

    public a(WebAuthorizeActivity webAuthorizeActivity) {
        super(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.b
    public void onComplete(String str) {
        if (this.f5332a) {
            return;
        }
        this.f5332a = true;
        Bundle urlToBundle = ResHelper.urlToBundle(str);
        if (urlToBundle.containsKey("code")) {
            final String string = urlToBundle.getString("code");
            new Thread() { // from class: cn.sharesdk.instagram.a.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    String str2;
                    AuthorizeListener authorizeListener;
                    try {
                        str2 = b.a(a.this.activity.getHelper().getPlatform()).a(string);
                    } catch (Throwable th2) {
                        a.this.listener.onError(th2);
                        str2 = null;
                    }
                    if (str2 == null) {
                        a.this.listener.onError(new Throwable("Authorize token is empty"));
                        return;
                    }
                    try {
                        HashMap fromJson = new Hashon().fromJson(str2);
                        Bundle bundle = new Bundle();
                        bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, String.valueOf(fromJson.get(Oauth2AccessToken.KEY_ACCESS_TOKEN)));
                        if (!ShareSDK.isFBInstagram()) {
                            bundle.putString("user_id", String.valueOf(fromJson.get("user_id")));
                            authorizeListener = a.this.listener;
                        } else {
                            HashMap hashMap = (HashMap) fromJson.get("user");
                            bundle.putString("username", String.valueOf(hashMap.get("username")));
                            bundle.putString("bio", String.valueOf(hashMap.get("bio")));
                            bundle.putString("website", String.valueOf(hashMap.get("website")));
                            bundle.putString("profile_picture", String.valueOf(hashMap.get("profile_picture")));
                            bundle.putString("full_name", String.valueOf(hashMap.get("full_name")));
                            bundle.putString("id", String.valueOf(hashMap.get("id")));
                            authorizeListener = a.this.listener;
                        }
                        authorizeListener.onComplete(bundle);
                    } catch (Throwable th3) {
                        SSDKLog.b().a(e.a("InstagramAuthorizeWebviewClient ", th3), new Object[0]);
                    }
                }
            }.start();
            return;
        }
        AuthorizeListener authorizeListener = this.listener;
        if (authorizeListener != null) {
            authorizeListener.onError(new Throwable("code is null"));
        }
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2 = this.redirectUri;
        if (str2 == null || !str.startsWith(str2)) {
            super.onPageStarted(webView, str, bitmap);
            return;
        }
        webView.setVisibility(4);
        webView.stopLoading();
        this.activity.finish();
        onComplete(str);
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = this.redirectUri;
        if (str2 == null || !str.startsWith(str2)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        webView.setVisibility(4);
        webView.stopLoading();
        this.activity.finish();
        onComplete(str);
        return true;
    }
}
