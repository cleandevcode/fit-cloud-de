package yb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes.dex */
public final class l {
    public static long a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty("Privacy_MY") && !TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, "Privacy_MY"), 0);
            if (sharedPreferences == null) {
                return -1L;
            }
            return sharedPreferences.getLong(str, -1L);
        }
        m2.f.h("hmsSdk", "context is null or spName empty or spkey is empty");
        return -1L;
    }

    public static String b(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, str), 0);
            if (sharedPreferences == null) {
                return "";
            }
            return sharedPreferences.getString(str2, "");
        }
        m2.f.h("hmsSdk", "context is null or spName empty or spkey is empty");
        return "";
    }

    public static void c(Context context, String str, String... strArr) {
        if (context != null && !TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, str), 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (strArr.length == 0) {
                    edit.clear();
                    edit.commit();
                    return;
                }
                for (String str2 : strArr) {
                    if (sharedPreferences.contains(str2)) {
                        edit.remove(str2);
                        edit.commit();
                    }
                }
                return;
            }
            return;
        }
        m2.f.h("hmsSdk", "clearData(): parameter error.context,spname");
    }

    public static void d(Context context, String str, long j10) {
        if (context != null && !TextUtils.isEmpty("Privacy_MY") && !TextUtils.isEmpty(str)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, "Privacy_MY"), 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, j10);
                edit.commit();
                return;
            }
            return;
        }
        m2.f.h("hmsSdk", "context is null or spName empty or spkey is empty");
    }

    public static void e(Context context, String str, String str2, String str3) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, str), 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str2, str3);
                edit.commit();
                return;
            }
            return;
        }
        m2.f.e("hmsSdk", "context is null or spName empty or spkey is empty");
    }

    public static String f(Context context, String str) {
        String str2;
        String packageName = context.getPackageName();
        w r10 = y.r("_hms_config_tag", "oper");
        if (r10 != null) {
            str2 = r10.f31412p;
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return "hms_" + str + "_" + packageName;
        }
        return "hms_" + str + "_" + packageName + "_" + str2;
    }
}
