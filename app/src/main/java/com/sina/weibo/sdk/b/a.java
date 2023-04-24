package com.sina.weibo.sdk.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.sina.weibo.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: com.sina.weibo.sdk.b.a$a */
    /* loaded from: classes.dex */
    public static class C0120a {

        /* renamed from: ah */
        public int f9497ah;
        public String packageName = BuildConfig.APPLICATION_ID;

        /* renamed from: ag */
        public String f9496ag = "com.sina.weibo.SSOActivity";
    }

    private static C0120a a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream open = context.createPackageContext(str, 2).getAssets().open("weibo_for_sdk.json");
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = open.read(bArr, 0, 4096);
                if (read == -1) {
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    C0120a c0120a = new C0120a();
                    c0120a.f9497ah = jSONObject.optInt("support_api", -1);
                    c0120a.f9496ag = jSONObject.optString("authActivityName", null);
                    c0120a.packageName = str;
                    return c0120a;
                }
                sb2.append(new String(bArr, 0, read));
            }
        } catch (PackageManager.NameNotFoundException | IOException | JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static boolean a(Context context, Intent intent) {
        PackageManager packageManager;
        ResolveInfo resolveActivity;
        if (context == null || (packageManager = context.getPackageManager()) == null || (resolveActivity = packageManager.resolveActivity(intent, 0)) == null) {
            return false;
        }
        try {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures;
            if (signatureArr == null) {
                return false;
            }
            for (Signature signature : signatureArr) {
                if ("18da2bf10352443a00a5e046d9fca6bd".equals(d.a(signature.toByteArray()))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static C0120a c(Context context) {
        return e(context);
    }

    public static boolean d(Context context) {
        C0120a e10 = e(context);
        return e10 != null && e10.f9497ah >= 10791;
    }

    public static C0120a e(Context context) {
        List<ResolveInfo> queryIntentServices;
        C0120a a10;
        String[] strArr = {BuildConfig.APPLICATION_ID, "com.sina.weibog3"};
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (context != null && (queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) != null && !queryIntentServices.isEmpty()) {
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && serviceInfo.applicationInfo != null && !TextUtils.isEmpty(serviceInfo.packageName)) {
                        String str2 = resolveInfo.serviceInfo.packageName;
                        if (TextUtils.equals(str, str2) && (a10 = a(context, str2)) != null) {
                            return a10;
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }
}
