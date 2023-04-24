package com.huawei.hms.framework.common.check;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;

/* loaded from: classes.dex */
public class ProviderCheckUtil {
    public static boolean isValid(Uri uri) {
        if (uri != null) {
            PackageManager packageManager = ContextHolder.getAppContext().getPackageManager();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
            if (resolveContentProvider == null) {
                Logger.w("ProviderCheckUtil", "Invalid param");
                return false;
            }
            ApplicationInfo applicationInfo = resolveContentProvider.applicationInfo;
            if (applicationInfo != null) {
                String str = applicationInfo.packageName;
                Logger.v("ProviderCheckUtil", "Target provider service's package name is : " + str);
                return str != null && packageManager.checkSignatures("com.huawei.hwid", str) == 0;
            }
            return false;
        }
        return false;
    }
}
