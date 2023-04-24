package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.b.a;
import com.sina.weibo.sdk.openapi.SdkListener;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static boolean f9480a = false;

    /* renamed from: b */
    private static AuthInfo f9481b;

    public static AuthInfo a() {
        if (f9480a) {
            return f9481b;
        }
        throw new RuntimeException("please init sdk before use it. Wb.install()");
    }

    public static void a(AuthInfo authInfo, SdkListener sdkListener) {
        if (f9480a) {
            return;
        }
        if (authInfo == null) {
            throw new RuntimeException("authInfo must not be null.");
        }
        f9481b = authInfo;
        f9480a = true;
        if (sdkListener != null) {
            sdkListener.onInitSuccess();
        }
    }

    public static boolean a(Context context) {
        List<ResolveInfo> queryIntentServices;
        String[] strArr = {BuildConfig.APPLICATION_ID, "com.sina.weibog3"};
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (context != null && (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) != null && !queryIntentServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        a.C0120a e10;
        return a(context) && (e10 = com.sina.weibo.sdk.b.a.e(context)) != null && e10.f9497ah >= 10772;
    }
}
