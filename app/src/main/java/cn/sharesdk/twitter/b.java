package cn.sharesdk.twitter;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.network.SSDKNetworkHelper;
import cn.sharesdk.framework.utils.SSDKLog;
import com.huawei.hms.framework.common.ContainerUtils;
import com.mob.tools.network.KVPair;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends cn.sharesdk.framework.authorize.b {

    /* renamed from: a */
    private boolean f5501a;

    public b(WebAuthorizeActivity webAuthorizeActivity) {
        super(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.b
    public void onComplete(String str) {
        if (this.f5501a) {
            return;
        }
        this.f5501a = true;
        c a10 = c.a(this.activity.getHelper().getPlatform());
        String c10 = a10.c(str);
        if (c10 != null && c10.length() > 0) {
            String[] split = c10.split(ContainerUtils.FIELD_DELIMITER);
            Bundle bundle = new Bundle();
            for (String str2 : split) {
                if (str2 != null) {
                    String[] split2 = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (split2.length < 2) {
                        continue;
                    } else {
                        bundle.putString(split2[0], split2[1]);
                        if (a10.d()) {
                            ArrayList<KVPair<String>> arrayList = new ArrayList<>();
                            ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
                            arrayList.add(new KVPair<>("grant_type", "client_credentials"));
                            arrayList2.add(new KVPair<>("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8"));
                            arrayList2.add(new KVPair<>("Authorization", a.b.b("Basic ", Base64.encodeToString((a10.a() + ":" + a10.c()).getBytes(), 2))));
                            try {
                                String str3 = (String) new Hashon().fromJson(SSDKNetworkHelper.getInstance().httpPost("https://api.twitter.com/oauth2/token", arrayList, null, arrayList2, "/oauth2/token", 11)).get(Oauth2AccessToken.KEY_ACCESS_TOKEN);
                                if (!TextUtils.isEmpty(str3)) {
                                    bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, str3);
                                }
                                if (bundle.size() <= 0) {
                                    AuthorizeListener authorizeListener = this.listener;
                                    if (authorizeListener != null) {
                                        authorizeListener.onError(new Throwable());
                                        return;
                                    }
                                    return;
                                }
                                AuthorizeListener authorizeListener2 = this.listener;
                                if (authorizeListener2 != null) {
                                    authorizeListener2.onComplete(bundle);
                                }
                            } catch (Throwable th2) {
                                SSDKLog b10 = SSDKLog.b();
                                StringBuilder a11 = android.support.v4.media.d.a("twitter get token error");
                                a11.append(th2.getMessage());
                                b10.a(a11.toString());
                            }
                        } else if (bundle.size() <= 0) {
                            AuthorizeListener authorizeListener3 = this.listener;
                            if (authorizeListener3 != null) {
                                authorizeListener3.onError(new Throwable());
                                return;
                            }
                            return;
                        } else {
                            AuthorizeListener authorizeListener4 = this.listener;
                            if (authorizeListener4 != null) {
                                authorizeListener4.onComplete(bundle);
                            }
                        }
                    }
                }
            }
            return;
        }
        AuthorizeListener authorizeListener5 = this.listener;
        if (authorizeListener5 != null) {
            authorizeListener5.onError(new Throwable());
        }
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2 = this.redirectUri;
        if (str2 != null && str.startsWith(str2)) {
            webView.stopLoading();
            this.activity.finish();
            final String valueOf = String.valueOf(ResHelper.urlToBundle(str).get("oauth_verifier"));
            new Thread() { // from class: cn.sharesdk.twitter.b.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        b.this.onComplete(valueOf);
                    } catch (Throwable th2) {
                        SSDKLog.b().a(th2);
                    }
                }
            }.start();
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = this.redirectUri;
        if (str2 == null || !str.startsWith(str2)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        webView.stopLoading();
        this.activity.finish();
        final String valueOf = String.valueOf(ResHelper.urlToBundle(str).get("oauth_verifier"));
        new Thread() { // from class: cn.sharesdk.twitter.b.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    b.this.onComplete(valueOf);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        }.start();
        return true;
    }
}
