package y;

import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a */
    public static int f30782a = 3;

    public static void a(String str, String str2) {
        String g10 = g(str);
        if (f(3, g10)) {
            Log.d(g10, str2);
        }
    }

    public static void b(String str, String str2) {
        String g10 = g(str);
        if (f(6, g10)) {
            Log.e(g10, str2);
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        String g10 = g(str);
        if (f(6, g10)) {
            Log.e(g10, str2, th2);
        }
    }

    public static void d(String str, String str2) {
        String g10 = g(str);
        if (f(4, g10)) {
            Log.i(g10, str2);
        }
    }

    public static boolean e(String str) {
        return f(3, g(str));
    }

    public static boolean f(int i10, String str) {
        return f30782a <= i10 || Log.isLoggable(str, i10);
    }

    public static String g(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void h(String str, String str2) {
        String g10 = g(str);
        if (f(5, g10)) {
            Log.w(g10, str2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        String g10 = g(str);
        if (f(5, g10)) {
            Log.w(g10, str2, th2);
        }
    }
}
