package com.huawei.hms.framework.common;

import android.content.Context;
import android.content.pm.PackageManager;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class PackageUtils {
    public static String getVersionName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), DfuBaseService.ERROR_CONNECTION_MASK).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.w("PackageUtils", "", e10);
            return "";
        }
    }
}
