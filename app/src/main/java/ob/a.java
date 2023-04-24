package ob;

import a.b;
import android.os.Process;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: ob.a$a */
    /* loaded from: classes.dex */
    public static class C0410a extends Throwable {

        /* renamed from: a */
        public String f22915a;

        /* renamed from: b */
        public Throwable f22916b;

        /* renamed from: c */
        public Throwable f22917c;

        public C0410a(Throwable th2) {
            this.f22917c = th2;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            Throwable th2 = this.f22916b;
            if (th2 == this) {
                return null;
            }
            return th2;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f22915a;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            Throwable th2 = this.f22917c;
            if (th2 == null) {
                return "";
            }
            String name = th2.getClass().getName();
            if (this.f22915a != null) {
                String b10 = b.b(name, ": ");
                if (this.f22915a.startsWith(b10)) {
                    return this.f22915a;
                }
                StringBuilder a10 = d.a(b10);
                a10.append(this.f22915a);
                return a10.toString();
            }
            return name;
        }
    }

    public static String a(int i10) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > i10) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            return Process.myPid() + "-" + Process.myTid() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
        }
        return "";
    }

    public static String b(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return a(i10);
        }
        return a(i10) + "|" + str;
    }

    public static String c(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (i10 % 2 == 1) {
                charArray[i10] = '*';
            }
        }
        return new String(charArray);
    }

    public static void d(int i10, String str, String str2) {
        String obj;
        if (i10 >= 3 && Log.isLoggable("dynamic-api_", i10)) {
            if (str2 == null) {
                obj = "null";
            } else {
                obj = str2.toString();
            }
            Log.println(i10, "dynamic-api_".concat(String.valueOf(str)), b(obj, 7));
        }
    }

    public static void e(String str, String str2, Exception exc) {
        String concat = "dynamic-api_".concat(String.valueOf(str));
        String b10 = b(str2, 5);
        if (!Log.isLoggable("dynamic-api_", 3)) {
            int i10 = 20;
            i10 = ((exc instanceof IOException) || (exc instanceof JSONException)) ? 8 : 8;
            C0410a c0410a = new C0410a(exc);
            StackTraceElement[] stackTrace = c0410a.getStackTrace();
            if (stackTrace.length > i10) {
                c0410a.setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i10));
            } else {
                c0410a.setStackTrace(stackTrace);
            }
            c0410a.f22915a = c(exc.getMessage());
            Throwable cause = exc.getCause();
            C0410a c0410a2 = c0410a;
            while (cause != null) {
                C0410a c0410a3 = new C0410a(cause);
                c0410a3.f22915a = c(cause.getMessage());
                c0410a2.f22916b = c0410a3;
                cause = cause.getCause();
                c0410a2 = c0410a3;
            }
            exc = c0410a;
        }
        Log.w(concat, b10, exc);
    }
}
