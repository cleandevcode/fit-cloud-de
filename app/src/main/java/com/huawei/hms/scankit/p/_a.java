package com.huawei.hms.scankit.p;

import java.util.Stack;

/* loaded from: classes.dex */
public class _a {

    /* renamed from: a */
    public static boolean f7790a = true;

    /* renamed from: b */
    public static boolean f7791b = false;

    /* renamed from: c */
    public static boolean f7792c = false;

    /* renamed from: d */
    public static boolean f7793d = false;

    /* renamed from: e */
    public static float f7794e = -1.0f;

    /* renamed from: f */
    public static int f7795f = 0;

    /* renamed from: g */
    public static int f7796g = 0;

    /* renamed from: h */
    public static boolean f7797h = false;

    /* renamed from: i */
    public static boolean f7798i = false;

    /* renamed from: j */
    public static boolean f7799j = false;

    /* renamed from: k */
    public static boolean f7800k = false;

    /* renamed from: l */
    public static boolean f7801l = false;

    /* renamed from: m */
    public static boolean f7802m = false;

    /* renamed from: n */
    public static boolean f7803n = false;

    /* renamed from: o */
    public static boolean f7804o = false;

    /* renamed from: p */
    public static boolean f7805p = false;

    /* renamed from: q */
    public static boolean[] f7806q = new boolean[8];

    /* renamed from: r */
    public static Stack<Integer> f7807r = new Stack<>();

    /* renamed from: s */
    public static boolean f7808s = true;

    public static void a() {
        f7793d = false;
        f7794e = -1.0f;
        f7795f = 0;
        f7800k = false;
        f7801l = false;
        f7802m = false;
        f7804o = false;
        f7797h = false;
        f7798i = false;
        f7799j = false;
        f7803n = false;
        f7806q = new boolean[8];
        f7807r = new Stack<>();
        f7808s = true;
    }

    public static void a(int i10) {
        if (i10 % 2 == 1) {
            f7800k = true;
        }
        if (i10 % 3 == 2) {
            f7801l = true;
        }
        if (i10 % 5 == 4) {
            f7802m = true;
        }
    }

    public static void a(com.huawei.hms.scankit.E e10) {
        a();
        boolean z10 = e10.f7097e;
        f7792c = z10;
        f7808s = e10.f7099g;
        a(!z10 ? e10.f7098f : 1);
    }
}
