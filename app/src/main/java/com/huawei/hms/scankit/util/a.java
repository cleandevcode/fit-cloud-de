package com.huawei.hms.scankit.util;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private static final Pattern f8177a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 1;
        if (1 == length) {
            return String.valueOf('*');
        }
        StringBuilder sb2 = new StringBuilder(length);
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (f8177a.matcher(String.valueOf(charAt)).matches()) {
                if (i10 % 2 == 0) {
                    charAt = '*';
                }
                i10++;
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    private static String a(String str, boolean z10) {
        StringBuilder sb2 = new StringBuilder((int) DfuBaseService.ERROR_REMOTE_TYPE_SECURE);
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                str = a(str);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    private static Throwable a(Throwable th2) {
        return th2;
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(str, a(str2, false));
    }

    public static void a(String str, String str2, Throwable th2) {
        if (TextUtils.isEmpty(str2) && th2 == null) {
            return;
        }
        Log.w(str, a(str2, false), a(th2));
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, a(str2, false));
    }

    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, a(str2, false));
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, a(str2, false));
    }
}
