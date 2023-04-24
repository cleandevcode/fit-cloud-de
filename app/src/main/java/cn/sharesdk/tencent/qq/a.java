package cn.sharesdk.tencent.qq;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.authorize.WebAuthorizeActivity;
import cn.sharesdk.framework.utils.SSDKLog;
import com.huawei.hms.framework.common.ContainerUtils;
import com.mob.tools.utils.DH;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.net.URLDecoder;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends cn.sharesdk.framework.authorize.b {
    public a(WebAuthorizeActivity webAuthorizeActivity) {
        super(webAuthorizeActivity);
    }

    private void a(HashMap<String, String> hashMap) {
        String str = hashMap.get(Oauth2AccessToken.KEY_ACCESS_TOKEN);
        String str2 = hashMap.get(Oauth2AccessToken.KEY_EXPIRES_IN);
        String str3 = hashMap.get("error");
        String str4 = hashMap.get("error_description");
        String str5 = hashMap.get("pf");
        String str6 = hashMap.get("pfkey");
        String str7 = hashMap.get("pay_token");
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str3)) {
                this.listener.onError(new Throwable());
                return;
            }
            String str8 = str4 + " (" + str3 + ")";
            AuthorizeListener authorizeListener = this.listener;
            if (authorizeListener != null) {
                authorizeListener.onError(new Throwable(str8));
                return;
            }
            return;
        }
        try {
            HashMap<String, Object> c10 = cn.sharesdk.tencent.qq.utils.a.a(this.activity.getHelper().getPlatform()).c(str);
            if (c10 != null && c10.size() > 0) {
                if (!c10.containsKey("openid")) {
                    AuthorizeListener authorizeListener2 = this.listener;
                    if (authorizeListener2 != null) {
                        authorizeListener2.onError(new Throwable());
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, str);
                bundle.putString("open_id", String.valueOf(c10.get("openid")));
                bundle.putString(Oauth2AccessToken.KEY_EXPIRES_IN, str2);
                bundle.putString("pf", str5);
                bundle.putString("pfkey", str6);
                bundle.putString("pay_token", str7);
                AuthorizeListener authorizeListener3 = this.listener;
                if (authorizeListener3 != null) {
                    authorizeListener3.onComplete(bundle);
                    return;
                }
                return;
            }
            AuthorizeListener authorizeListener4 = this.listener;
            if (authorizeListener4 != null) {
                authorizeListener4.onError(new Throwable());
            }
        } catch (Throwable th2) {
            AuthorizeListener authorizeListener5 = this.listener;
            if (authorizeListener5 != null) {
                authorizeListener5.onError(th2);
            }
        }
    }

    @Override // cn.sharesdk.framework.authorize.b
    public void onComplete(String str) {
        if (str.startsWith(this.redirectUri)) {
            str = str.substring(str.indexOf(35) + 1);
        }
        String[] split = str.split(ContainerUtils.FIELD_DELIMITER);
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : split) {
            String[] split2 = str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (split2.length < 2) {
                hashMap.put(URLDecoder.decode(split2[0]), "");
            } else {
                String decode = URLDecoder.decode(split2[0]);
                String str3 = split2[1];
                hashMap.put(decode, URLDecoder.decode(str3 != null ? str3 : ""));
            }
        }
        a(hashMap);
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        String[] strArr;
        String str;
        String str2;
        if (!(webView.getContext() instanceof Activity)) {
            sslErrorHandler.cancel();
            return;
        }
        Activity activity = (Activity) webView.getContext();
        if ("zh".equals(DH.SyncMtd.getOSLanguage())) {
            strArr = new String[]{String.valueOf(new char[]{19981, 21463, 20449, 20219, 30340, 35777, 20070, 12290, 20320, 35201, 32487, 32493, 21527, 65311}), String.valueOf(new char[]{35777, 20070, 24050, 36807, 26399, 12290, 20320, 35201, 32487, 32493, 21527, 65311}), String.valueOf(new char[]{35777, 20070, 'I', 'D', 19981, 21305, 37197, 12290, 20320, 35201, 32487, 32493, 21527, 65311}), String.valueOf(new char[]{35777, 20070, 23578, 26410, 29983, 25928, 12290, 20320, 35201, 32487, 32493, 21527, 65311}), String.valueOf(new char[]{35777, 20070, 38169, 35823, 12290, 20320, 35201, 32487, 32493, 21527, 65311})};
            str = String.valueOf(new char[]{35777, 20070, 38169, 35823});
            String.valueOf(new char[]{32487, 32493});
            str2 = String.valueOf(new char[]{20572, 27490});
        } else {
            strArr = new String[]{"Certificate is untrusted. Do you want to continue anyway?", "Certificate has expired. Do you want to continue anyway?", "Certificate ID is mismatched. Do you want to continue anyway?", "Certificate is not yet valid. Do you want to continue anyway?", "Certificate error. Do you want to continue anyway?"};
            str = "SSL Certificate Error";
            str2 = "No";
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(str);
        int primaryError = sslError.getPrimaryError();
        builder.setMessage(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? strArr[4] : strArr[0] : strArr[2] : strArr[1] : strArr[3]);
        builder.setCancelable(false);
        builder.setNegativeButton(str2, new DialogInterface.OnClickListener() { // from class: cn.sharesdk.tencent.qq.a.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
                sslErrorHandler.cancel();
            }
        });
        try {
            builder.create().show();
        } catch (Throwable th2) {
            SSDKLog.b().b(th2);
        }
    }

    @Override // cn.sharesdk.framework.g, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, final String str) {
        if (!str.startsWith(this.redirectUri)) {
            webView.loadUrl(str);
            return true;
        }
        webView.setVisibility(4);
        webView.stopLoading();
        this.activity.finish();
        new Thread() { // from class: cn.sharesdk.tencent.qq.a.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    a.this.onComplete(str);
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                }
            }
        }.start();
        return true;
    }
}
