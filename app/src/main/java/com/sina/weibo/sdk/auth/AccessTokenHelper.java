package com.sina.weibo.sdk.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.sina.weibo.sdk.a.b;
import com.sina.weibo.sdk.a.e;
import com.sina.weibo.sdk.net.c;

/* loaded from: classes.dex */
public class AccessTokenHelper {
    private static final String PREFERENCES_NAME = "com_weibo_sdk_android";

    public static void clearAccessToken(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES_NAME, 0).edit();
        edit.clear();
        edit.apply();
    }

    public static Oauth2AccessToken readAccessToken(Context context) {
        if (context == null) {
            return null;
        }
        Oauth2AccessToken oauth2AccessToken = new Oauth2AccessToken();
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        oauth2AccessToken.setUid(sharedPreferences.getString(Oauth2AccessToken.KEY_UID, ""));
        oauth2AccessToken.setScreenName(sharedPreferences.getString(Oauth2AccessToken.KEY_SCREEN_NAME, ""));
        oauth2AccessToken.setAccessToken(sharedPreferences.getString(Oauth2AccessToken.KEY_ACCESS_TOKEN, ""));
        oauth2AccessToken.setRefreshToken(sharedPreferences.getString(Oauth2AccessToken.KEY_REFRESH_TOKEN, ""));
        oauth2AccessToken.setExpiresTime(sharedPreferences.getLong(Oauth2AccessToken.KEY_EXPIRES_IN, 0L));
        return oauth2AccessToken;
    }

    public static void refreshAccessToken(final Context context, String str) {
        com.sina.weibo.sdk.a.b bVar;
        Oauth2AccessToken readAccessToken = readAccessToken(context);
        if (readAccessToken != null) {
            e eVar = new e(str, readAccessToken, new c<String>() { // from class: com.sina.weibo.sdk.auth.AccessTokenHelper.1
                @Override // com.sina.weibo.sdk.net.c
                public final /* synthetic */ void a(String str2) {
                    AccessTokenHelper.writeAccessToken(context, Oauth2AccessToken.parseAccessToken(str2));
                }

                @Override // com.sina.weibo.sdk.net.c
                public final void onError(Throwable th2) {
                }
            });
            bVar = b.a.K;
            bVar.a(eVar);
        }
    }

    public static void writeAccessToken(Context context, Oauth2AccessToken oauth2AccessToken) {
        if (context == null || oauth2AccessToken == null || TextUtils.isEmpty(oauth2AccessToken.getAccessToken())) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(PREFERENCES_NAME, 0).edit();
        edit.putString(Oauth2AccessToken.KEY_UID, oauth2AccessToken.getUid());
        edit.putString(Oauth2AccessToken.KEY_SCREEN_NAME, oauth2AccessToken.getScreenName());
        edit.putString(Oauth2AccessToken.KEY_ACCESS_TOKEN, oauth2AccessToken.getAccessToken());
        edit.putString(Oauth2AccessToken.KEY_REFRESH_TOKEN, oauth2AccessToken.getRefreshToken());
        edit.putLong(Oauth2AccessToken.KEY_EXPIRES_IN, oauth2AccessToken.getExpiresTime());
        edit.apply();
    }
}
