package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class Utils {
    public static long getCurrentTime(boolean z10) {
        return z10 ? SystemClock.elapsedRealtime() : System.currentTimeMillis();
    }

    public static boolean is64Bit(Context context) {
        boolean is64Bit;
        boolean z10 = false;
        if (context == null) {
            Logger.e("Utils", "Null context, please check it.");
            return false;
        }
        Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 23) {
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
        try {
            return applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).nativeLibraryDir.contains("64");
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.e("Utils", "Get application info failed: name not found, try to get baseContext.");
            if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                if (baseContext == null) {
                    Logger.w("Utils", "Get baseContext failed: null. Return default: is64-bit.");
                    return true;
                }
                try {
                    z10 = baseContext.getPackageManager().getApplicationInfo(baseContext.getPackageName(), 128).nativeLibraryDir.contains("64");
                } catch (PackageManager.NameNotFoundException unused2) {
                    Logger.e("Utils", "Get baseContext application info failed: name not found");
                    z10 = true;
                }
            }
            return z10;
        }
    }
}
