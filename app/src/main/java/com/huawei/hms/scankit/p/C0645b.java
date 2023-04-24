package com.huawei.hms.scankit.p;

import android.graphics.Point;

/* renamed from: com.huawei.hms.scankit.p.b */
/* loaded from: classes.dex */
public class C0645b {

    /* renamed from: a */
    private int f7814a;

    /* renamed from: b */
    private int f7815b;

    /* renamed from: c */
    private String f7816c;

    /* renamed from: d */
    private Point f7817d;

    /* renamed from: e */
    private int f7818e;

    /* renamed from: f */
    private boolean f7819f;

    /* renamed from: g */
    private boolean f7820g;

    /* renamed from: com.huawei.hms.scankit.p.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e */
        private Point f7825e;

        /* renamed from: a */
        private int f7821a = 0;

        /* renamed from: b */
        private int f7822b = 1;

        /* renamed from: c */
        private int f7823c = 0;

        /* renamed from: d */
        private String f7824d = "off";

        /* renamed from: f */
        private boolean f7826f = true;

        /* renamed from: g */
        private boolean f7827g = false;

        public a a(int i10) {
            this.f7822b = i10;
            return this;
        }

        public a a(Point point) {
            this.f7825e = point;
            return this;
        }

        public a a(boolean z10) {
            this.f7827g = z10;
            return this;
        }

        public C0645b a() {
            return new C0645b(this.f7821a, this.f7822b, this.f7823c, this.f7824d, this.f7825e, this.f7826f).a(this.f7827g);
        }

        public a b(int i10) {
            this.f7823c = i10;
            return this;
        }

        public a b(boolean z10) {
            this.f7826f = z10;
            return this;
        }
    }

    private C0645b(int i10, int i11, int i12, String str, Point point, boolean z10) {
        this.f7814a = i10;
        this.f7815b = i11;
        this.f7818e = i12;
        this.f7816c = str;
        this.f7817d = point;
        this.f7819f = z10;
    }

    public C0645b a(boolean z10) {
        this.f7820g = z10;
        return this;
    }

    public Point a() {
        return this.f7817d;
    }

    public void a(int i10) {
        this.f7818e = i10;
    }

    public int b() {
        return this.f7814a;
    }

    public int c() {
        return this.f7815b;
    }

    public int d() {
        return this.f7818e;
    }

    public boolean e() {
        return this.f7819f;
    }

    public String f() {
        return this.f7816c;
    }

    public boolean g() {
        return this.f7820g;
    }
}
