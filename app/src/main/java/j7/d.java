package j7;

import ga.e;
import ga.l;

/* loaded from: classes.dex */
public final class d extends e implements Cloneable {

    /* renamed from: a */
    public float f17516a;

    /* renamed from: b */
    public float f17517b;

    /* renamed from: c */
    public float f17518c;

    /* renamed from: d */
    public float f17519d;

    /* renamed from: e */
    public float f17520e;

    /* renamed from: f */
    public float f17521f = -1.0f;

    public d(float f10, float f11, float f12) {
        this.f17517b = f10;
        this.f17516a = f11;
        if (f12 >= 0.0f) {
            this.f17519d = f12;
            this.f17520e = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    @Override // ga.e
    public final void a(float f10, float f11, float f12, l lVar) {
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21 = this.f17518c;
        if (f21 == 0.0f) {
            lVar.d(f10, 0.0f);
            return;
        }
        float f22 = ((this.f17517b * 2.0f) + f21) / 2.0f;
        float f23 = f12 * this.f17516a;
        float f24 = f11 + this.f17520e;
        float a10 = t0.e.a(1.0f, f12, f22, this.f17519d * f12);
        if (a10 / f22 >= 1.0f) {
            lVar.d(f10, 0.0f);
            return;
        }
        float f25 = this.f17521f;
        float f26 = f25 * f12;
        boolean z10 = f25 == -1.0f || Math.abs((f25 * 2.0f) - f21) < 0.1f;
        if (z10) {
            f13 = 0.0f;
            f14 = a10;
        } else {
            f13 = 1.75f;
            f14 = 0.0f;
        }
        float f27 = f22 + f23;
        float f28 = f14 + f23;
        float sqrt = (float) Math.sqrt((f27 * f27) - (f28 * f28));
        float f29 = f24 - sqrt;
        float f30 = f24 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f28));
        float f31 = (90.0f - degrees) + f13;
        lVar.d(f29, 0.0f);
        float f32 = f23 * 2.0f;
        lVar.a(f29 - f23, 0.0f, f29 + f23, f32, 270.0f, degrees);
        if (z10) {
            f15 = f24 - f22;
            f16 = (-f22) - f14;
            f20 = 180.0f - f31;
            f18 = f22 - f14;
            f17 = f24 + f22;
            f19 = (f31 * 2.0f) - 180.0f;
        } else {
            float f33 = this.f17517b;
            float f34 = f26 * 2.0f;
            float f35 = f24 - f22;
            float f36 = f26 + f33;
            lVar.a(f35, -f36, f35 + f33 + f34, f36, 180.0f - f31, ((f31 * 2.0f) - 180.0f) / 2.0f);
            float f37 = f24 + f22;
            float f38 = this.f17517b;
            lVar.d(f37 - ((f38 / 2.0f) + f26), f38 + f26);
            float f39 = this.f17517b;
            f15 = f37 - (f34 + f39);
            float f40 = f26 + f39;
            f16 = -f40;
            f17 = f37;
            f18 = f40;
            f19 = f31 - 90.0f;
            f20 = 90.0f;
        }
        lVar.a(f15, f16, f17, f18, f20, f19);
        lVar.a(f30 - f23, 0.0f, f30 + f23, f32, 270.0f - degrees, degrees);
        lVar.d(f10, 0.0f);
    }
}
