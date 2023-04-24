package s7;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: f */
    public u7.c f26635f;

    /* renamed from: l */
    public int f26641l;

    /* renamed from: m */
    public int f26642m;

    /* renamed from: s */
    public ArrayList f26648s;

    /* renamed from: g */
    public int f26636g = -7829368;

    /* renamed from: h */
    public float f26637h = 1.0f;

    /* renamed from: i */
    public int f26638i = -7829368;

    /* renamed from: j */
    public float f26639j = 1.0f;

    /* renamed from: k */
    public float[] f26640k = new float[0];

    /* renamed from: n */
    public int f26643n = 6;

    /* renamed from: o */
    public boolean f26644o = false;

    /* renamed from: p */
    public boolean f26645p = true;

    /* renamed from: q */
    public boolean f26646q = true;

    /* renamed from: r */
    public boolean f26647r = true;

    /* renamed from: t */
    public boolean f26649t = true;

    /* renamed from: u */
    public float f26650u = 0.0f;

    /* renamed from: v */
    public float f26651v = 0.0f;

    /* renamed from: w */
    public boolean f26652w = false;

    /* renamed from: x */
    public boolean f26653x = false;

    /* renamed from: y */
    public float f26654y = 0.0f;

    /* renamed from: z */
    public float f26655z = 0.0f;
    public float A = 0.0f;

    public a() {
        this.f26659d = a8.f.c(10.0f);
        this.f26657b = a8.f.c(5.0f);
        this.f26658c = a8.f.c(5.0f);
        this.f26648s = new ArrayList();
    }

    public void a(float f10, float f11) {
        float f12 = this.f26652w ? this.f26655z : f10 - this.f26650u;
        float f13 = this.f26653x ? this.f26654y : f11 + this.f26651v;
        if (Math.abs(f13 - f12) == 0.0f) {
            f13 += 1.0f;
            f12 -= 1.0f;
        }
        this.f26655z = f12;
        this.f26654y = f13;
        this.A = Math.abs(f13 - f12);
    }

    public final String b(int i10) {
        return (i10 < 0 || i10 >= this.f26640k.length) ? "" : d().a(this.f26640k[i10]);
    }

    public final String c() {
        String str = "";
        for (int i10 = 0; i10 < this.f26640k.length; i10++) {
            String b10 = b(i10);
            if (b10 != null && str.length() < b10.length()) {
                str = b10;
            }
        }
        return str;
    }

    public final u7.c d() {
        u7.c cVar = this.f26635f;
        if (cVar == null || ((cVar instanceof u7.a) && ((u7.a) cVar).f28639b != this.f26642m)) {
            this.f26635f = new u7.a(this.f26642m);
        }
        return this.f26635f;
    }

    public final void e(float f10) {
        this.f26653x = true;
        this.f26654y = f10;
        this.A = Math.abs(f10 - this.f26655z);
    }

    public final void f(float f10) {
        this.f26652w = true;
        this.f26655z = f10;
        this.A = Math.abs(this.f26654y - f10);
    }

    public final void g(int i10) {
        if (i10 > 25) {
            i10 = 25;
        }
        if (i10 < 2) {
            i10 = 2;
        }
        this.f26643n = i10;
        this.f26644o = false;
    }
}
