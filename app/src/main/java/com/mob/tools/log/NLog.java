package com.mob.tools.log;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.mob.commons.i;
import com.mob.commons.m;
import com.mob.tools.b;
import com.mob.tools.proguard.ClassKeeper;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class NLog implements ClassKeeper, PublicMemberKeeper {

    /* renamed from: a */
    private static final HashMap<String, NLog> f9109a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, String> f9110b = new HashMap<>();

    /* renamed from: c */
    private String f9111c;

    /* renamed from: d */
    private int f9112d;

    /* renamed from: e */
    private boolean f9113e;

    static {
        b.a();
    }

    public NLog() {
        this.f9113e = false;
        this.f9111c = null;
        this.f9112d = -1;
    }

    private NLog(String str, int i10) {
        this.f9113e = false;
        this.f9111c = str;
        this.f9112d = i10;
    }

    private int a(int i10, int i11, String str) {
        String str2;
        try {
            str2 = Process.myPid() + "-" + Process.myTid() + "(" + Thread.currentThread().getName() + ") " + str;
        } catch (Throwable unused) {
            str2 = str;
        }
        try {
            if (i11 == 1) {
                String str3 = this.f9111c;
                int i12 = this.f9112d;
                HashMap<String, String> hashMap = f9110b;
                if (!hashMap.isEmpty()) {
                    NLog nLog = null;
                    Iterator<Map.Entry<String, String>> it = hashMap.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, String> next = it.next();
                        if (next.getValue() != null && str.contains(next.getValue())) {
                            nLog = f9109a.get(next.getKey());
                            break;
                        }
                    }
                    if (nLog != null) {
                        str3 = nLog.f9111c;
                        i12 = nLog.f9112d;
                    }
                }
                m.a().a(1, str3, i12, str2);
            } else if (i11 == 2) {
                m.a().a(2, this.f9111c, this.f9112d, str2);
            }
            m.a().a(i10, str2);
            return 0;
        } catch (Throwable unused2) {
            return 0;
        }
    }

    private String a(Throwable th2) {
        try {
            return Log.getStackTraceString(th2);
        } catch (Throwable th3) {
            return th3 instanceof OutOfMemoryError ? i.a("023+hh@kf$gj.f7fhfiflgkfjfhfi?kEgj>f+fjfgfmhhkegegeSn") : th3.getMessage();
        }
    }

    private String b(Throwable th2) {
        try {
            String name = th2.getClass().getName();
            String c10 = c(th2);
            String stackTraceElement = th2.getStackTrace().length > 0 ? th2.getStackTrace()[0].toString() : "";
            Throwable th3 = th2;
            while (th3 != null && th3.getCause() != null) {
                th3 = th3.getCause();
            }
            if (th3 == null || th3 == th2) {
                return a(th2);
            }
            return name + ":" + c10 + "\n" + stackTraceElement + "\n......\nCaused by:\n" + a(th3);
        } catch (Throwable unused) {
            return a(th2);
        }
    }

    private static String c(Throwable th2) {
        String message = th2.getMessage();
        if (TextUtils.isEmpty(message)) {
            return "";
        }
        if (message.length() <= 1000) {
            return message;
        }
        return message.substring(0, 1000) + "\n[Message over limit size:1000, cut!]";
    }

    @Deprecated
    public static NLog getInstance(String str) {
        NLog nLog;
        HashMap<String, NLog> hashMap = f9109a;
        synchronized (hashMap) {
            nLog = hashMap.get(str);
            if (nLog == null) {
                nLog = new NLog(str, -1);
                f9110b.put(str, null);
                hashMap.put(str, nLog);
            }
        }
        return nLog;
    }

    public static NLog getInstance(String str, int i10, String str2) {
        NLog nLog;
        HashMap<String, NLog> hashMap = f9109a;
        synchronized (hashMap) {
            nLog = hashMap.get(str);
            if (nLog == null) {
                nLog = new NLog(str, i10);
                f9110b.put(str, str2);
                hashMap.put(str, nLog);
            }
        }
        return nLog;
    }

    public static NLog getInstanceForSDK(String str, boolean z10) {
        return getInstance(str);
    }

    public static void setCollector(String str, LogCollector logCollector) {
        getInstance(str).setCollector(logCollector);
    }

    public final void crash(Throwable th2) {
        a(6, 1, b(th2));
    }

    public final int d(Object obj, Object... objArr) {
        return log(3, obj, objArr);
    }

    public final int d(Throwable th2) {
        return log(3, th2);
    }

    public final int d(Throwable th2, Object obj, Object... objArr) {
        return log(3, th2, obj, objArr);
    }

    public final void dg() {
        this.f9113e = true;
    }

    public final int e(Object obj, Object... objArr) {
        return log(6, obj, objArr);
    }

    public final int e(String str) {
        return log(6, str, new Object[0]);
    }

    public final int e(Throwable th2) {
        return log(6, th2);
    }

    public final int e(Throwable th2, Object obj, Object... objArr) {
        return log(6, th2, obj, objArr);
    }

    public final void error(String str) {
        a(6, 2, str);
    }

    public final void error(Throwable th2) {
        error(a(th2));
    }

    public final int i(Object obj, Object... objArr) {
        return log(4, obj, objArr);
    }

    public final int i(String str) {
        return log(4, str, new Object[0]);
    }

    public final int i(Throwable th2) {
        return log(4, th2);
    }

    public final int i(Throwable th2, Object obj, Object... objArr) {
        return log(4, th2, obj, objArr);
    }

    public final int log(int i10, Object obj, Object... objArr) {
        String obj2 = obj.toString();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        return a(i10, 0, obj2);
    }

    public final int log(int i10, Throwable th2) {
        return a(i10, 0, a(th2));
    }

    public final int log(int i10, Throwable th2, Object obj, Object... objArr) {
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder();
        if (objArr.length > 0) {
            obj2 = String.format(obj2, objArr);
        }
        sb2.append(obj2);
        sb2.append('\n');
        sb2.append(a(th2));
        return a(i10, 0, sb2.toString());
    }

    public NLog setCollector(LogCollector logCollector) {
        return this;
    }

    public final int v(Object obj, Object... objArr) {
        return log(2, obj, objArr);
    }

    public final int v(Throwable th2) {
        return log(2, th2);
    }

    public final int v(Throwable th2, Object obj, Object... objArr) {
        return log(2, th2, obj, objArr);
    }

    public final int w(Object obj, Object... objArr) {
        return log(5, obj, objArr);
    }

    public final int w(String str) {
        return log(5, str, new Object[0]);
    }

    public final int w(Throwable th2) {
        return log(5, th2);
    }

    public final int w(Throwable th2, Object obj, Object... objArr) {
        return log(5, th2, obj, objArr);
    }
}
