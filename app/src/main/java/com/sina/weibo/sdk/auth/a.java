package com.sina.weibo.sdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.b.a;
import com.sina.weibo.sdk.b.c;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.net.h;
import com.sina.weibo.sdk.web.WebActivity;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d */
    public WbAuthListener f9493d;

    public final void a(Activity activity) {
        c.a("WBSsoTag", "startClientAuth()");
        try {
            a.C0120a e10 = com.sina.weibo.sdk.b.a.e(activity);
            Intent intent = new Intent();
            if (e10 == null) {
                intent.setClassName(BuildConfig.APPLICATION_ID, "com.sina.weibo.SSOActivity");
            } else {
                intent.setClassName(e10.packageName, e10.f9496ag);
            }
            AuthInfo a10 = com.sina.weibo.sdk.a.a();
            intent.putExtra("appKey", a10.getAppKey());
            intent.putExtra("redirectUri", a10.getRedirectUrl());
            intent.putExtra("scope", a10.getScope());
            intent.putExtra("packagename", a10.getPackageName());
            intent.putExtra("key_hash", a10.getHash());
            intent.putExtra("_weibo_command_type", 3);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            intent.putExtra("_weibo_transaction", sb2.toString());
            if (activity == null) {
                this.f9493d.onError(new UiError(-1, "activity is null", ""));
            } else if (!com.sina.weibo.sdk.b.a.a(activity, intent)) {
                this.f9493d.onError(new UiError(-2, "your app is illegal", ""));
            } else {
                activity.startActivityForResult(intent, 32973);
                c.a("WBSsoTag", "start SsoActivity ");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            c.b("WBSsoTag", e11.getMessage());
            this.f9493d.onError(new UiError(-3, "occur exception", e11.getMessage()));
        }
    }

    public final void b(Activity activity) {
        h hVar = new h();
        AuthInfo a10 = com.sina.weibo.sdk.a.a();
        if (a10 == null) {
            return;
        }
        hVar.put("client_id", a10.getAppKey());
        hVar.put("redirect_uri", a10.getRedirectUrl());
        hVar.put("scope", a10.getScope());
        hVar.put("packagename", a10.getPackageName());
        hVar.put("key_hash", a10.getHash());
        hVar.put("response_type", "code");
        hVar.put(WiseOpenHianalyticsData.UNION_VERSION, "0041005000");
        hVar.put("luicode", "10000360");
        hVar.put("lfid", "OP_" + a10.getAppKey());
        Oauth2AccessToken readAccessToken = AccessTokenHelper.readAccessToken(activity);
        if (readAccessToken != null) {
            String accessToken = readAccessToken.getAccessToken();
            if (!TextUtils.isEmpty(readAccessToken.getAccessToken())) {
                hVar.put("trans_token", accessToken);
                hVar.put("trans_access_token", accessToken);
            }
        }
        String str = "https://open.weibo.cn/oauth2/authorize?" + hVar.g();
        if (this.f9493d != null) {
            b b10 = b.b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            String sb3 = sb2.toString();
            b10.a(sb3, this.f9493d);
            Intent intent = new Intent(activity, WebActivity.class);
            com.sina.weibo.sdk.web.b.a aVar = new com.sina.weibo.sdk.web.b.a(a10, str, sb3);
            Bundle bundle = new Bundle();
            aVar.writeToBundle(bundle);
            intent.putExtras(bundle);
            activity.startActivity(intent);
        }
    }
}
