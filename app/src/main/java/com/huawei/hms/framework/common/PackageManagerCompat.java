package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class PackageManagerCompat {

    /* renamed from: a */
    public static String f7041a = "";

    public static Bundle a(Context context) {
        PackageManager packageManager;
        Bundle bundle = Bundle.EMPTY;
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        if (context == null || (packageManager = context.getPackageManager()) == null) {
            return bundle;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle2 = applicationInfo.metaData;
                return bundle2 != null ? bundle2 : bundle;
            }
            return bundle;
        } catch (PackageManager.NameNotFoundException | RuntimeException e10) {
            Logger.w("PackageUtils", "NameNotFoundException:", e10);
            return bundle;
        }
    }

    public static Bundle b(Context context) {
        String str;
        if (ContextHolder.getKitContext() != null) {
            context = ContextHolder.getKitContext();
        }
        if (context == null) {
            str = "the kitContext is null";
        } else if (context.getApplicationInfo() != null) {
            Bundle bundle = context.getApplicationInfo().metaData;
            return bundle == null ? Bundle.EMPTY : bundle;
        } else {
            str = "the kit applicationInfo is null";
        }
        Logger.v("PackageUtils", str);
        return Bundle.EMPTY;
    }

    public static Bundle c(Context context) {
        Bundle b10 = b(context);
        return (b10 == null || b10.isEmpty()) ? a(context) : b10;
    }

    public static String getAppPackageName(Context context) {
        if (ContextHolder.getAppContext() != null) {
            context = ContextHolder.getAppContext();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return "";
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), DfuBaseService.ERROR_CONNECTION_MASK).packageName;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            Logger.w("PackageUtils", "Failed to get Package managers Package Info");
            return "";
        }
    }

    public static String getAppVersion(Context context) {
        if (TextUtils.isEmpty(f7041a)) {
            if (ContextHolder.getAppContext() != null) {
                context = ContextHolder.getAppContext();
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return f7041a;
            }
            try {
                f7041a = String.valueOf(packageManager.getPackageInfo(context.getPackageName(), DfuBaseService.ERROR_CONNECTION_MASK).versionCode);
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                Logger.w("PackageUtils", "Failed to get Package managers Package Info");
            }
            return f7041a;
        }
        return f7041a;
    }

    public static String getMetaDataFromApp(Context context, String str, String str2) {
        Bundle a10 = a(context);
        return a10 != null ? a10.getString(str, str2) : str2;
    }

    public static String getMetaDataFromKit(Context context, String str, String str2) {
        try {
            Bundle b10 = b(context);
            return b10 == null ? str2 : b10.getString(str, str2);
        } catch (RuntimeException unused) {
            Logger.v("PackageUtils", "the kit metaData is runtimeException");
            return str2;
        }
    }

    public static String getMetaDataFromKitOrApp(Context context, String str, String str2) {
        return c(context).getString(str, str2);
    }

    public static Map<String, String> getMetaDataMapFromKitOrApp(Context context, String str) {
        HashMap hashMap = new HashMap();
        Bundle c10 = c(context);
        for (String str2 : c(context).keySet()) {
            if (str2.startsWith(str)) {
                String string = c10.getString(str2);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str2.substring(str.length()), string);
                }
            }
        }
        return hashMap;
    }
}
