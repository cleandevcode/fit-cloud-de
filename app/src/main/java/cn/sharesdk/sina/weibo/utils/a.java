package cn.sharesdk.sina.weibo.utils;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import cn.sharesdk.framework.Platform;
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
    private boolean f5406a;

    public a(WebAuthorizeActivity webAuthorizeActivity) {
        super(webAuthorizeActivity);
    }

    private Intent a(String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", "");
        intent.setFlags(268435456);
        return intent;
    }

    public static /* synthetic */ AuthorizeListener a(a aVar) {
        return aVar.listener;
    }

    private void a(final Platform platform, final String str) {
        new Thread() { // from class: cn.sharesdk.sina.weibo.utils.a.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    String b10 = cn.sharesdk.sina.weibo.a.a(platform).b(str);
                    if (b10 == null) {
                        a.this.listener.onError(new Throwable("Authorize token is empty"));
                        return;
                    }
                    HashMap fromJson = new Hashon().fromJson(b10);
                    Bundle bundle = new Bundle();
                    bundle.putString(Oauth2AccessToken.KEY_UID, String.valueOf(fromJson.get(Oauth2AccessToken.KEY_UID)));
                    bundle.putString("remind_in", String.valueOf(fromJson.get("remind_in")));
                    bundle.putString(Oauth2AccessToken.KEY_EXPIRES_IN, String.valueOf(fromJson.get(Oauth2AccessToken.KEY_EXPIRES_IN)));
                    bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, String.valueOf(fromJson.get(Oauth2AccessToken.KEY_ACCESS_TOKEN)));
                    a.this.listener.onComplete(bundle);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        }.start();
    }

    @Override // cn.sharesdk.framework.authorize.b
    public void onComplete(String str) {
        if (this.f5406a) {
            return;
        }
        this.f5406a = true;
        Bundle urlToBundle = ResHelper.urlToBundle(str);
        String string = urlToBundle.getString("error");
        String string2 = urlToBundle.getString("error_code");
        if (this.listener != null) {
            if (string == null && string2 == null) {
                String string3 = urlToBundle.getString("code");
                if (TextUtils.isEmpty(string3)) {
                    this.listener.onError(new Throwable("Authorize code is empty"));
                }
                a(this.activity.getHelper().getPlatform(), string3);
            } else if (string.equals("access_denied")) {
                this.listener.onCancel();
            } else {
                int i10 = 0;
                try {
                    i10 = ResHelper.parseInt(string2);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
                this.listener.onError(new Throwable(string + " (" + i10 + ")"));
            }
        }
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!TextUtils.isEmpty(this.redirectUri) && str.startsWith(this.redirectUri)) {
            webView.stopLoading();
            this.activity.finish();
            onComplete(str);
        } else if (!str.startsWith("sms:")) {
            super.onPageStarted(webView, str, bitmap);
        } else {
            String substring = str.substring(4);
            try {
                try {
                    Intent a10 = a(substring);
                    a10.setPackage("com.android.mms");
                    webView.getContext().startActivity(a10);
                } catch (Throwable unused) {
                    webView.getContext().startActivity(a(substring));
                }
            } catch (Throwable th2) {
                AuthorizeListener authorizeListener = this.listener;
                if (authorizeListener != null) {
                    authorizeListener.onError(th2);
                }
            }
        }
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!TextUtils.isEmpty(this.redirectUri) && str.startsWith(this.redirectUri)) {
            webView.stopLoading();
            this.activity.finish();
            onComplete(str);
            return true;
        } else if (str.startsWith("sms:")) {
            String substring = str.substring(4);
            try {
                try {
                    Intent a10 = a(substring);
                    a10.setPackage("com.android.mms");
                    webView.getContext().startActivity(a10);
                } catch (Throwable unused) {
                    webView.getContext().startActivity(a(substring));
                }
            } catch (Throwable th2) {
                AuthorizeListener authorizeListener = this.listener;
                if (authorizeListener != null) {
                    authorizeListener.onError(th2);
                }
            }
            return true;
        } else {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
