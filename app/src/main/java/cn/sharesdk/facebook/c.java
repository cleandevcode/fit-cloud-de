package cn.sharesdk.facebook;

import android.os.Bundle;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.utils.ResHelper;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;

/* loaded from: classes.dex */
public class c extends cn.sharesdk.framework.authorize.b {
    public c(WebAuthorizeActivity webAuthorizeActivity) {
        super(webAuthorizeActivity);
    }

    @Override // cn.sharesdk.framework.authorize.b
    public void onComplete(String str) {
        String str2;
        int i10;
        Bundle urlToBundle = ResHelper.urlToBundle(str);
        String string = urlToBundle.getString("error_message");
        if (string != null && this.listener != null) {
            StringBuilder a10 = androidx.activity.result.d.a("error_message ==>>", string, "\nerror_code ==>>");
            a10.append(urlToBundle.getString("error_code"));
            string = a10.toString();
            this.listener.onError(new Throwable(str));
        }
        if (string == null) {
            String string2 = urlToBundle.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN);
            if (urlToBundle.containsKey(Oauth2AccessToken.KEY_EXPIRES_IN)) {
                str2 = urlToBundle.getString(Oauth2AccessToken.KEY_EXPIRES_IN);
            } else {
                str2 = "-1";
            }
            if (this.listener != null) {
                Bundle bundle = new Bundle();
                bundle.putString("oauth_token", string2);
                bundle.putString("oauth_token_secret", "");
                try {
                    i10 = ResHelper.parseInt(str2);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                    i10 = -1;
                }
                bundle.putInt("oauth_token_expires", i10);
                this.listener.onComplete(bundle);
            }
        }
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            String str2 = this.redirectUri;
            if (str2 != null && str.startsWith(str2)) {
                webView.stopLoading();
                webView.postDelayed(new Runnable() { // from class: cn.sharesdk.facebook.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.activity.finish();
                    }
                }, 500L);
                onComplete(str);
                return true;
            }
        } catch (Exception e10) {
            SSDKLog.b().d(e10.getMessage(), new Object[0]);
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
