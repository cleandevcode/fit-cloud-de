package com.huawei.hms.scankit.p;

import android.graphics.Rect;

/* renamed from: com.huawei.hms.scankit.p.f */
/* loaded from: classes.dex */
public class C0661f {

    /* renamed from: a */
    private int f7878a;

    /* renamed from: b */
    private Rect f7879b;

    /* renamed from: com.huawei.hms.scankit.p.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public Rect f7880a;

        /* renamed from: b */
        public int f7881b;

        public a(Rect rect, int i10) {
            this.f7880a = rect;
            this.f7881b = i10;
        }
    }

    public C0661f(int i10, Rect rect) {
        this.f7878a = i10;
        this.f7879b = new Rect(rect);
    }

    public int a() {
        return this.f7878a;
    }

    public Rect b() {
        return this.f7879b;
    }
}
