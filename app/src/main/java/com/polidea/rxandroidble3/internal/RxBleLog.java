package com.polidea.rxandroidble3.internal;

import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kc.i0;

/* loaded from: classes.dex */
public class RxBleLog {
    @Deprecated
    public static final int DEBUG = 3;
    @Deprecated
    public static final int ERROR = 6;
    @Deprecated
    public static final int INFO = 4;
    private static final i0.a LOGCAT_LOGGER;
    @Deprecated
    public static final int NONE = Integer.MAX_VALUE;
    @Deprecated
    public static final int VERBOSE = 2;
    @Deprecated
    public static final int WARN = 5;
    private static pc.a loggerSetup;
    private static final Pattern ANONYMOUS_CLASS = Pattern.compile("\\$\\d+$");
    private static final ThreadLocal<String> NEXT_TAG = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public class a implements i0.a {
        @Override // kc.i0.a
        public final void a(int i10, String str, String str2) {
            Log.println(i10, str, str2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements i0.a {
        public b(c cVar) {
        }

        @Override // kc.i0.a
        public final void a(int i10, String str, String str2) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    static {
        a aVar = new a();
        LOGCAT_LOGGER = aVar;
        loggerSetup = new pc.a(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, false, true, aVar);
    }

    private RxBleLog() {
    }

    private static String createTag() {
        String substring;
        ThreadLocal<String> threadLocal = NEXT_TAG;
        String str = threadLocal.get();
        if (str != null) {
            threadLocal.remove();
            return str;
        }
        int i10 = 0;
        List asList = Arrays.asList(RxBleLog.class.getName(), pc.b.class.getName(), pc.c.class.getName());
        Throwable th2 = new Throwable();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        while (i10 < stackTrace.length && asList.contains(stackTrace[i10].getClassName())) {
            i10++;
        }
        if (stackTrace.length > i10) {
            String className = stackTrace[i10].getClassName();
            Matcher matcher = ANONYMOUS_CLASS.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String replace = className.replace("Impl", "").replace("RxBle", "");
            int indexOf = replace.indexOf(36);
            if (indexOf <= 0) {
                substring = replace.substring(replace.lastIndexOf(46) + 1);
            } else {
                substring = replace.substring(replace.lastIndexOf(46) + 1, indexOf);
            }
            return a.b.b("RxBle#", substring);
        }
        throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?", th2);
    }

    public static void d(String str, Object... objArr) {
        throwShade(3, null, str, objArr);
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        throwShade(3, th2, str, objArr);
    }

    public static void e(String str, Object... objArr) {
        throwShade(6, null, str, objArr);
    }

    public static void e(Throwable th2, String str, Object... objArr) {
        throwShade(6, th2, str, objArr);
    }

    private static String formatString(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(str, objArr);
    }

    public static int getMacAddressLogSetting() {
        return loggerSetup.f24002b;
    }

    public static boolean getShouldLogAttributeValues() {
        return loggerSetup.f24004d;
    }

    public static boolean getShouldLogScannedPeripherals() {
        return loggerSetup.f24005e;
    }

    public static int getUuidLogSetting() {
        return loggerSetup.f24003c;
    }

    public static void i(String str, Object... objArr) {
        throwShade(4, null, str, objArr);
    }

    public static void i(Throwable th2, String str, Object... objArr) {
        throwShade(4, th2, str, objArr);
    }

    public static boolean isAtLeast(int i10) {
        return loggerSetup.f24001a <= i10;
    }

    private static void println(int i10, String str, String str2) {
        if (str2.length() < 4000) {
            loggerSetup.f24006f.a(i10, str, str2);
            return;
        }
        for (String str3 : str2.split("\n")) {
            loggerSetup.f24006f.a(i10, str, str3);
        }
    }

    @Deprecated
    public static void setLogLevel(int i10) {
        updateLogOptions(new i0(Integer.valueOf(i10), null, null, null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [kc.i0$a] */
    @Deprecated
    public static void setLogger(c cVar) {
        b bVar;
        if (cVar == null) {
            bVar = LOGCAT_LOGGER;
        } else {
            bVar = new b(cVar);
        }
        updateLogOptions(new i0(null, null, null, null, null, bVar));
    }

    private static void throwShade(int i10, Throwable th2, String str, Object... objArr) {
        if (i10 < loggerSetup.f24001a) {
            return;
        }
        String formatString = formatString(str, objArr);
        if (formatString != null && formatString.length() != 0) {
            if (th2 != null) {
                StringBuilder a10 = p.a.a(formatString, "\n");
                a10.append(Log.getStackTraceString(th2));
                formatString = a10.toString();
            }
        } else if (th2 != null) {
            formatString = Log.getStackTraceString(th2);
        } else {
            return;
        }
        println(i10, createTag(), formatString);
    }

    public static void updateLogOptions(i0 i0Var) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        pc.a aVar = loggerSetup;
        aVar.getClass();
        Integer num = i0Var.f18335a;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = aVar.f24001a;
        }
        int i13 = i10;
        Integer num2 = i0Var.f18336b;
        if (num2 != null) {
            i11 = num2.intValue();
        } else {
            i11 = aVar.f24002b;
        }
        int i14 = i11;
        Integer num3 = i0Var.f18337c;
        if (num3 != null) {
            i12 = num3.intValue();
        } else {
            i12 = aVar.f24003c;
        }
        int i15 = i12;
        Boolean bool = i0Var.f18338d;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = aVar.f24004d;
        }
        boolean z12 = z10;
        Boolean bool2 = i0Var.f18339e;
        if (bool2 != null) {
            z11 = bool2.booleanValue();
        } else {
            z11 = aVar.f24005e;
        }
        boolean z13 = z11;
        i0.a aVar2 = i0Var.f18340f;
        if (aVar2 == null) {
            aVar2 = aVar.f24006f;
        }
        pc.a aVar3 = new pc.a(i13, i14, i15, z12, z13, aVar2);
        d("Received new options (%s) and merged with old setup: %s. New setup: %s", i0Var, aVar, aVar3);
        loggerSetup = aVar3;
    }

    public static void v(String str, Object... objArr) {
        throwShade(2, null, str, objArr);
    }

    public static void v(Throwable th2, String str, Object... objArr) {
        throwShade(2, th2, str, objArr);
    }

    public static void w(String str, Object... objArr) {
        throwShade(5, null, str, objArr);
    }

    public static void w(Throwable th2, String str, Object... objArr) {
        throwShade(5, th2, str, objArr);
    }
}
