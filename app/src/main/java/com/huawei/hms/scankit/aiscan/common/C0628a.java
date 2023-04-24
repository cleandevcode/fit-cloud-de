package com.huawei.hms.scankit.aiscan.common;

/* renamed from: com.huawei.hms.scankit.aiscan.common.a */
/* loaded from: classes.dex */
public class C0628a extends Exception {

    /* renamed from: a */
    public static final boolean f7187a;

    /* renamed from: b */
    public static final StackTraceElement[] f7188b;

    /* renamed from: c */
    private static final C0628a f7189c;

    static {
        f7187a = System.getProperty("surefire.test.class.path") != null;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[0];
        f7188b = stackTraceElementArr;
        C0628a c0628a = new C0628a();
        f7189c = c0628a;
        c0628a.setStackTrace(stackTraceElementArr);
    }

    private C0628a() {
    }

    private C0628a(String str) {
        super(str);
    }

    public static C0628a a() {
        return f7187a ? new C0628a() : f7189c;
    }

    public static C0628a a(String str) {
        return new C0628a(str);
    }
}
