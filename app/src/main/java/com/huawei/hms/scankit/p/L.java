package com.huawei.hms.scankit.p;

/* loaded from: classes.dex */
public class L implements Comparable<L> {

    /* renamed from: a */
    private float f7581a;

    /* renamed from: b */
    private float f7582b;

    /* renamed from: c */
    private float f7583c;

    /* renamed from: d */
    private float f7584d;

    /* renamed from: e */
    private float f7585e;

    /* renamed from: f */
    private float f7586f;

    /* renamed from: g */
    private float f7587g;

    /* renamed from: h */
    private float f7588h;

    /* renamed from: i */
    private float f7589i;

    /* renamed from: j */
    private float f7590j;

    /* renamed from: k */
    private float f7591k;

    /* renamed from: l */
    public C0728w f7592l;

    /* renamed from: m */
    public float[] f7593m = new float[5];

    /* renamed from: n */
    public float f7594n = 0.0f;

    /* renamed from: o */
    public float f7595o = 0.0f;

    /* renamed from: p */
    public int f7596p = 0;

    /* renamed from: q */
    public int f7597q = 0;

    /* renamed from: r */
    public int f7598r = 0;

    /* renamed from: s */
    public int f7599s = 0;

    /* renamed from: t */
    public int f7600t = 0;

    /* renamed from: u */
    public int f7601u = 0;

    /* renamed from: v */
    public float f7602v = 0.0f;

    public L(boolean z10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f7581a = f10;
        this.f7582b = f11;
        this.f7583c = f12;
        this.f7584d = f13;
        this.f7585e = f14;
        this.f7586f = f15;
        this.f7591k = f19;
        if (!z10) {
            this.f7589i = f18;
            this.f7590j = f17;
            return;
        }
        this.f7587g = f16;
        this.f7588h = f17;
        this.f7590j = f18;
    }

    private float a(float f10, int i10, int i11) {
        float f11 = i10;
        if (f10 <= f11) {
            f10 = f11;
        }
        float f12 = i11 - 1;
        return f10 < f12 ? f10 : f12;
    }

    public float a() {
        return this.f7595o;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(L l10) {
        return Float.compare(l10.h() + (-l10.g()), h() + (-g()));
    }

    public void a(float f10, float f11) {
        this.f7581a += f10;
        this.f7582b += f11;
        this.f7585e += f10;
        this.f7586f += f11;
    }

    public void a(int i10, int i11, float f10, float f11) {
        float f12 = this.f7581a + f10;
        this.f7581a = f12;
        float f13 = this.f7582b + f11;
        this.f7582b = f13;
        if (f12 < 0.0f) {
            this.f7583c += f12;
        }
        if (f13 < 0.0f) {
            this.f7584d += f13;
        }
        this.f7585e += f10;
        this.f7586f += f11;
        this.f7581a = a(f12, 0, i10);
        this.f7585e = a(this.f7585e, 0, i10);
        this.f7582b = a(this.f7582b, 0, i11);
        this.f7586f = a(this.f7586f, 0, i11);
        float f14 = this.f7581a;
        float f15 = i10 - f10;
        if (this.f7583c + f14 >= f15) {
            this.f7583c = (f15 - 1.0f) - f14;
        }
        float f16 = this.f7582b;
        float f17 = i11 - f11;
        if (this.f7584d + f16 >= f17) {
            this.f7584d = (f17 - 1.0f) - f16;
        }
    }

    public float b() {
        return this.f7594n;
    }

    public void b(float f10, float f11) {
        this.f7581a = 0.0f;
        this.f7582b = 0.0f;
        this.f7583c = f10;
        this.f7584d = f11;
        this.f7585e = f10 / 2.0f;
        this.f7586f = f11 / 2.0f;
        this.f7587g = f10;
        this.f7588h = f11;
        this.f7590j = 0.0f;
    }

    public float c() {
        return this.f7584d;
    }

    public float d() {
        return this.f7581a;
    }

    public float e() {
        return this.f7582b;
    }

    public float f() {
        return this.f7583c;
    }

    public float g() {
        return this.f7591k;
    }

    public float h() {
        return this.f7589i;
    }

    public float i() {
        return this.f7590j;
    }

    public float j() {
        return this.f7585e;
    }

    public float k() {
        return this.f7586f;
    }

    public float l() {
        return this.f7588h;
    }

    public float m() {
        return this.f7587g;
    }

    public float n() {
        return this.f7602v;
    }
}
