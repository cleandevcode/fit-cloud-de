package com.huawei.hms.scankit.aiscan.common;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    private final float f7278a;

    /* renamed from: b */
    private final float f7279b;

    /* renamed from: c */
    private final float f7280c;

    /* renamed from: d */
    private final float f7281d;

    /* renamed from: e */
    private final float f7282e;

    /* renamed from: f */
    private final float f7283f;

    /* renamed from: g */
    private final float f7284g;

    /* renamed from: h */
    private final float f7285h;

    /* renamed from: i */
    private final float f7286i;

    /* renamed from: j */
    private float f7287j;

    /* renamed from: k */
    private float f7288k;

    /* renamed from: l */
    private float f7289l;

    /* renamed from: m */
    private float f7290m;

    /* renamed from: n */
    private float f7291n;

    /* renamed from: o */
    private float f7292o;

    /* renamed from: p */
    private float f7293p;

    /* renamed from: q */
    private float f7294q;

    /* renamed from: r */
    private float f7295r;

    /* renamed from: s */
    private float f7296s = 0.0f;

    /* renamed from: t */
    private float f7297t = 0.0f;

    /* renamed from: u */
    private float f7298u = 0.0f;

    /* renamed from: v */
    private float f7299v = 0.0f;

    /* renamed from: w */
    private float f7300w = 0.0f;

    public q(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f7278a = f10;
        this.f7279b = f13;
        this.f7280c = f16;
        this.f7281d = f11;
        this.f7282e = f14;
        this.f7283f = f17;
        this.f7284g = f12;
        this.f7285h = f15;
        this.f7286i = f18;
        this.f7287j = f10;
        this.f7288k = f11;
        this.f7289l = f12;
        this.f7290m = f13;
        this.f7291n = f14;
        this.f7292o = f15;
        this.f7293p = f16;
        this.f7294q = f17;
        this.f7295r = f18;
    }

    public static q a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return b(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }

    public static q a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return b(f18, f19, f20, f21, f22, f23, f24, f25).a(a(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static q b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new q(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new q((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f25 * f13) + (f13 - f11), (f26 * f17) + (f17 - f11), f11, f25, f26, 1.0f);
    }

    public q a() {
        float f10 = this.f7282e;
        float f11 = this.f7286i;
        float f12 = this.f7283f;
        float f13 = this.f7285h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f7284g;
        float f16 = this.f7281d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f7280c;
        float f20 = this.f7279b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f7278a;
        return new q(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    public q a(q qVar) {
        float f10 = this.f7278a;
        float f11 = qVar.f7278a;
        float f12 = this.f7281d;
        float f13 = qVar.f7279b;
        float f14 = this.f7284g;
        float f15 = qVar.f7280c;
        float f16 = (f12 * f13) + (f10 * f11) + (f14 * f15);
        float f17 = qVar.f7281d;
        float f18 = qVar.f7282e;
        float f19 = qVar.f7283f;
        float f20 = (f12 * f18) + (f10 * f17) + (f14 * f19);
        float f21 = qVar.f7284g;
        float f22 = qVar.f7285h;
        float f23 = qVar.f7286i;
        float f24 = f14 * f23;
        float f25 = f24 + (f12 * f22) + (f10 * f21);
        float f26 = this.f7279b;
        float f27 = this.f7282e;
        float f28 = this.f7285h;
        float f29 = (f28 * f15) + (f27 * f13) + (f26 * f11);
        float f30 = (f28 * f19) + (f27 * f18) + (f26 * f17);
        float f31 = f28 * f23;
        float f32 = f31 + (f27 * f22) + (f26 * f21);
        float f33 = this.f7280c;
        float f34 = this.f7283f;
        float f35 = (f13 * f34) + (f11 * f33);
        float f36 = this.f7286i;
        return new q(f16, f20, f25, f29, f30, f32, (f15 * f36) + f35, (f19 * f36) + (f18 * f34) + (f17 * f33), (f36 * f23) + (f34 * f22) + (f33 * f21));
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        this.f7287j = f10;
        this.f7288k = f11;
        this.f7289l = f12;
        this.f7290m = f13;
        this.f7291n = f14;
        this.f7292o = f15;
        this.f7293p = f16;
        this.f7294q = f17;
        this.f7295r = f18;
        this.f7296s = f19;
        this.f7297t = f20;
        this.f7298u = f21;
        this.f7299v = f22;
        this.f7300w = f23;
    }

    public void a(float[] fArr) {
        int length = fArr.length;
        float f10 = this.f7278a;
        float f11 = this.f7279b;
        float f12 = this.f7280c;
        float f13 = this.f7281d;
        float f14 = this.f7282e;
        float f15 = this.f7283f;
        float f16 = this.f7284g;
        float f17 = this.f7285h;
        float f18 = this.f7286i;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f15 * f20) + (f12 * f19) + f18;
            fArr[i10] = (((f13 * f20) + (f10 * f19)) + f16) / f21;
            fArr[i11] = (((f20 * f14) + (f19 * f11)) + f17) / f21;
        }
    }

    public void b(float[] fArr) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f10 = fArr[i10];
            int i11 = i10 + 1;
            float f11 = fArr[i11];
            float f12 = (this.f7300w * f11 * f11) + (this.f7299v * f10 * f10) + (this.f7298u * f11) + (this.f7297t * f10) + 1.0f;
            fArr[i10] = ((((this.f7290m * f11) * f11) + (((this.f7289l * f10) * f10) + ((this.f7288k * f11) + (this.f7287j * f10)))) + this.f7291n) / f12;
            float f13 = (this.f7293p * f11) + (this.f7292o * f10);
            fArr[i11] = ((((this.f7295r * f11) * f11) + (((this.f7294q * f10) * f10) + f13)) + this.f7296s) / f12;
        }
    }
}
