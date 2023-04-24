package com.huawei.hms.scankit.p;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class Pc {

    /* renamed from: b */
    private float f7642b;

    /* renamed from: c */
    private float f7643c;

    /* renamed from: h */
    private long f7648h;

    /* renamed from: i */
    private float f7649i;

    /* renamed from: j */
    private float f7650j;

    /* renamed from: l */
    private float f7652l;

    /* renamed from: m */
    private float f7653m;

    /* renamed from: n */
    private int f7654n;

    /* renamed from: o */
    private int f7655o;

    /* renamed from: p */
    private long f7656p;

    /* renamed from: r */
    private Sc f7658r;

    /* renamed from: a */
    private float f7641a = 1.0f;

    /* renamed from: d */
    private int f7644d = 255;

    /* renamed from: e */
    private float f7645e = 0.0f;

    /* renamed from: f */
    private float f7646f = 0.0f;

    /* renamed from: q */
    private int f7657q = 0;

    /* renamed from: k */
    private float f7651k = 1.0f;

    /* renamed from: g */
    private int f7647g = 255;

    public Pc(Bitmap bitmap) {
        if (bitmap != null) {
            this.f7654n = bitmap.getWidth() / 2;
            this.f7655o = bitmap.getHeight() / 2;
        }
    }

    public int a() {
        return this.f7647g;
    }

    public void a(float f10) {
        this.f7641a = f10;
    }

    public void a(int i10) {
        this.f7647g = i10;
    }

    public void a(long j10, float f10, float f11, long j11, Sc sc2) {
        float f12 = f10 - this.f7654n;
        this.f7652l = f12;
        float f13 = f11 - this.f7655o;
        this.f7653m = f13;
        this.f7649i = f12;
        this.f7650j = f13;
        this.f7656p = j10;
        this.f7648h = j11;
        this.f7658r = sc2;
    }

    public boolean a(long j10) {
        long j11 = j10 - this.f7648h;
        if (j11 > this.f7656p) {
            return false;
        }
        float f10 = (float) j11;
        float f11 = (float) (j11 * j11);
        this.f7649i = (this.f7642b * f11) + (this.f7645e * f10) + this.f7652l;
        this.f7650j = (this.f7643c * f11) + (this.f7646f * f10) + this.f7653m;
        this.f7658r.a(this, j11);
        return true;
    }

    public int b() {
        return this.f7657q;
    }

    public void b(float f10) {
        this.f7651k = f10;
    }

    public void b(int i10) {
        this.f7657q = i10;
    }

    public float c() {
        return this.f7649i;
    }

    public float d() {
        return this.f7650j;
    }

    public int e() {
        return this.f7644d;
    }

    public float f() {
        return this.f7651k;
    }
}
