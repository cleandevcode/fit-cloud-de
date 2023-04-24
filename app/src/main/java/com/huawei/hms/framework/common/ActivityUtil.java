package com.huawei.hms.framework.common;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import cn.sharesdk.framework.InnerShareParams;
import java.util.List;

/* loaded from: classes.dex */
public class ActivityUtil {
    public static PendingIntent getActivities(Context context, int i10, Intent[] intentArr, int i11) {
        if (context == null) {
            Logger.w("ActivityUtil", "context is null");
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i10, intentArr, i11);
        } catch (RuntimeException e10) {
            Logger.e("ActivityUtil", "dealType rethrowFromSystemServer:", e10);
            return null;
        }
    }

    public static boolean isForeground(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) ContextCompat.getSystemService(context, InnerShareParams.ACTIVITY)) == null) {
            return false;
        }
        List<ActivityManager.RunningAppProcessInfo> list = null;
        try {
            list = activityManager.getRunningAppProcesses();
        } catch (RuntimeException e10) {
            Logger.w("ActivityUtil", "activityManager getRunningAppProcesses occur exception: ", e10);
        }
        if (list != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                String str = runningAppProcessInfo.processName;
                if (str != null && str.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                    Logger.v("ActivityUtil", "isForeground true");
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
