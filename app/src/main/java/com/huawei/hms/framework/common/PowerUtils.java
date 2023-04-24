package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;

/* loaded from: classes.dex */
public class PowerUtils {

    /* loaded from: classes.dex */
    public static final class PowerMode {
        public static int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        public static int POWER_SAVER_MODE = 4;
        public static String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
        boolean isAppInactive;
        if (context == null) {
            Logger.i("PowerUtils", "isAppIdleMode Context is null!");
            return false;
        }
        String packageName = context.getPackageName();
        UsageStatsManager usageStatsManager = null;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 22) {
            Object systemService = context.getSystemService("usagestats");
            if (!(systemService instanceof UsageStatsManager)) {
                return false;
            }
            usageStatsManager = (UsageStatsManager) systemService;
        }
        if (usageStatsManager == null) {
            Logger.i("PowerUtils", "isAppIdleMode statsManager is null!");
            return false;
        } else if (i10 >= 23) {
            isAppInactive = usageStatsManager.isAppInactive(packageName);
            return isAppInactive;
        } else {
            return false;
        }
    }

    public static boolean isDozeIdleMode(Context context) {
        String str;
        boolean isDeviceIdleMode;
        if (context == null) {
            Logger.i("PowerUtils", "isDozeIdleMode Context is null!");
            return false;
        }
        Object systemService = ContextCompat.getSystemService(context, "power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            str = "isDozeIdleMode powerManager is null!";
        } else if (Build.VERSION.SDK_INT >= 23) {
            try {
                isDeviceIdleMode = powerManager.isDeviceIdleMode();
                return isDeviceIdleMode;
            } catch (RuntimeException e10) {
                Logger.e("PowerUtils", "dealType rethrowFromSystemServer:", e10);
                return false;
            }
        } else {
            str = "isDozeIdleMode is version control state!";
        }
        Logger.i("PowerUtils", str);
        return false;
    }

    public static boolean isInteractive(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                try {
                    return ((PowerManager) systemService).isInteractive();
                } catch (RuntimeException e10) {
                    StringBuilder a10 = android.support.v4.media.d.a("getActiveNetworkInfo failed, exception:");
                    a10.append(e10.getClass().getSimpleName());
                    a10.append(e10.getMessage());
                    Logger.i("PowerUtils", a10.toString());
                }
            }
        }
        return false;
    }

    public static boolean isWhilteList(Context context) {
        boolean isIgnoringBatteryOptimizations;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            String packageName = context.getPackageName();
            if (powerManager != null && Build.VERSION.SDK_INT >= 23) {
                try {
                    isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(packageName);
                    return isIgnoringBatteryOptimizations;
                } catch (RuntimeException e10) {
                    Logger.e("PowerUtils", "dealType rethrowFromSystemServer:", e10);
                }
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        int restrictBackgroundStatus;
        if (context == null) {
            Logger.i("PowerUtils", "readDataSaverMode manager is null!");
            return 0;
        }
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            Logger.i("PowerUtils", "readDataSaverMode Context is null!");
            return 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 0;
        }
        if (!connectivityManager.isActiveNetworkMetered()) {
            Logger.v("PowerUtils", "ConnectType is not Mobile Network!");
            return 0;
        } else if (i10 >= 24) {
            restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            return restrictBackgroundStatus;
        } else {
            return 0;
        }
    }

    public static int readPowerSaverMode(Context context) {
        if (context == null) {
            Logger.i("PowerUtils", "readPowerSaverMode Context is null!");
            return 0;
        }
        int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), PowerMode.SMART_MODE_STATUS, PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE);
        if (systemInt == PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                try {
                    return powerManager.isPowerSaveMode() ? PowerMode.POWER_SAVER_MODE : PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE;
                } catch (RuntimeException e10) {
                    Logger.e("PowerUtils", "dealType rethrowFromSystemServer:", e10);
                    return systemInt;
                }
            }
            return systemInt;
        }
        return systemInt;
    }
}
