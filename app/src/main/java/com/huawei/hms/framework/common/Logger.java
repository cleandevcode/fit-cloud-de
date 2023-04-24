package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;

/* loaded from: classes.dex */
public class Logger {

    /* renamed from: a */
    public static ExtLogger f7035a = null;

    /* renamed from: b */
    public static boolean f7036b = true;

    /* loaded from: classes.dex */
    public static class ThrowableWrapper extends Throwable {

        /* renamed from: a */
        public String f7037a;

        /* renamed from: b */
        public Throwable f7038b;

        /* renamed from: c */
        public Throwable f7039c;

        public ThrowableWrapper(Throwable th2, AnonymousClass1 anonymousClass1) {
            this.f7039c = th2;
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int i10 = ((th2 instanceof IOException) || (th2 instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i10) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i10));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th2.getMessage()));
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th2 = this.f7038b;
            if (th2 == this) {
                return null;
            }
            return th2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f7037a;
        }

        public void setMessage(String str) {
            this.f7037a = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th2 = this.f7039c;
            if (th2 == null) {
                return "";
            }
            String name = th2.getClass().getName();
            if (this.f7037a != null) {
                String b10 = a.b.b(name, ": ");
                if (this.f7037a.startsWith(b10)) {
                    return this.f7037a;
                }
                StringBuilder a10 = android.support.v4.media.d.a(b10);
                a10.append(this.f7037a);
                return a10.toString();
            }
            return name;
        }
    }

    public static String a(String str) {
        return a.b.b("NetworkSdk_", str);
    }

    public static String b(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            return f(i10);
        }
        return f(i10) + "|" + str;
    }

    public static String c(String str) {
        return a.b.b("NetworkKit_", str);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, Object obj) {
        println(3, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    public static void e(String str, Object obj) {
        println(6, str, obj);
    }

    public static void e(String str, String str2, Throwable th2) {
        boolean z10;
        ExtLogger extLogger = f7035a;
        if (extLogger != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            extLogger.e(a(str), b(5, str2), g(th2));
        }
        if (f7036b) {
            Log.e(c(str), b(5, str2), g(th2));
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    public static String f(int i10) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > i10) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            return Thread.currentThread().getName() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
        }
        return "";
    }

    public static Throwable g(Throwable th2) {
        if (isLoggable(3)) {
            return th2;
        }
        if (th2 == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th2, null);
        Throwable cause = th2.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause, null);
            throwableWrapper2.f7038b = throwableWrapper3;
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    public static void h(int i10, String str, String str2) {
        boolean z10;
        boolean z11 = true;
        if (f7035a != null && i10 >= 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String a10 = a(str);
            String b10 = b(7, str2);
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 == 6) {
                                f7035a.e(a10, b10);
                            }
                        } else {
                            f7035a.w(a10, b10);
                        }
                    } else {
                        f7035a.i(a10, b10);
                    }
                } else {
                    f7035a.d(a10, b10);
                }
            } else {
                f7035a.v(a10, b10);
            }
        }
        if ((f7036b && isLoggable(i10)) ? false : false) {
            Log.println(i10, c(str), b(7, str2));
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, Object obj) {
        println(4, str, obj);
    }

    @SuppressLint({"LogTagMismatch"})
    public static void i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static boolean isLoggable(int i10) {
        return Log.isLoggable("NetworkKit_", i10);
    }

    public static void println(int i10, String str, Object obj) {
        if (i10 < 3) {
            return;
        }
        h(i10, str, obj == null ? "null" : obj.toString());
    }

    public static void println(int i10, String str, String str2, Object... objArr) {
        if (i10 < 3) {
            return;
        }
        if (str2 == null) {
            Log.w("NetworkKit_Logger", "format is null, not log");
            return;
        }
        try {
            h(i10, str, StringUtils.format(str2, objArr));
        } catch (IllegalFormatException e10) {
            w("NetworkKit_Logger", "log format error" + str2, e10);
        }
    }

    public static void setExtLogger(ExtLogger extLogger, boolean z10) {
        f7035a = extLogger;
        f7036b = z10;
        i("NetworkKit_Logger", "logger = " + extLogger + z10);
    }

    public static void v(String str, Object obj) {
        println(2, str, obj);
    }

    public static void v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    public static void w(String str, Object obj) {
        println(5, str, obj);
    }

    public static void w(String str, String str2, Throwable th2) {
        boolean z10;
        ExtLogger extLogger = f7035a;
        if (extLogger != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            extLogger.w(a(str), b(5, str2), g(th2));
        }
        if (f7036b) {
            Log.w(c(str), b(5, str2), g(th2));
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }
}
