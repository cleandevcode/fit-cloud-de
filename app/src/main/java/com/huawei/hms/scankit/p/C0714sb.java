package com.huawei.hms.scankit.p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.huawei.hms.scankit.p.sb */
/* loaded from: classes.dex */
public class C0714sb {
    public static String a() {
        return Build.VERSION.RELEASE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
                return "Unknown";
            }
            String subtypeName = activeNetworkInfo.getSubtypeName();
            switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return "2G";
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    break;
                case 13:
                    return "4G";
                default:
                    if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                        return subtypeName;
                    }
                    break;
            }
            return "3G";
        }
        return "wifi";
    }

    public static String a(Context context, boolean z10) {
        return new C0643ab(context, z10).a();
    }

    public static String b() {
        return "";
    }

    public static String b(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
    }

    public static String c() {
        return Build.MODEL;
    }

    public static String d() {
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Method declaredMethod = cls.getDeclaredMethod("get", String.class);
                Object[] objArr = new Object[1];
                objArr[0] = "ro.build.version.emui";
                return (String) declaredMethod.invoke(cls, objArr);
            } catch (RuntimeException | InvocationTargetException | Exception unused) {
                return "";
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            return null;
        }
    }
}
