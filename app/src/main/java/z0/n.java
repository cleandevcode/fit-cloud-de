package z0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: k */
    public static final n f31869k;

    /* renamed from: a */
    public final float f31870a;

    /* renamed from: b */
    public final float f31871b;

    /* renamed from: c */
    public final float f31872c;

    /* renamed from: d */
    public final float f31873d;

    /* renamed from: e */
    public final float f31874e;

    /* renamed from: f */
    public final float f31875f;

    /* renamed from: g */
    public final float[] f31876g;

    /* renamed from: h */
    public final float f31877h;

    /* renamed from: i */
    public final float f31878i;

    /* renamed from: j */
    public final float f31879j;

    static {
        float f10;
        float[] fArr = b0.c.f3933c;
        float v10 = (float) ((b0.c.v() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b0.c.f3931a;
        float f11 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f12 = fArr[1];
        float f13 = fArr3[1] * f12;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13 + (fArr3[0] * f11);
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f11);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f11 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f10 = 0.69f;
        } else {
            f10 = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp(((-v10) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * v10) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(v10 * 5.0d))) + (f19 * v10);
        float v11 = b0.c.v() / fArr[1];
        double d11 = v11;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f17) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f16) / 100.0d, 0.42d), pow2};
        float f21 = fArr7[0];
        float f22 = fArr7[1];
        f31869k = new n(v11, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f21 * 400.0f) / (f21 + 27.13f)) * 2.0f) + ((f22 * 400.0f) / (f22 + 27.13f))) * pow, pow, pow, f10, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public n(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f31875f = f10;
        this.f31870a = f11;
        this.f31871b = f12;
        this.f31872c = f13;
        this.f31873d = f14;
        this.f31874e = f15;
        this.f31876g = fArr;
        this.f31877h = f16;
        this.f31878i = f17;
        this.f31879j = f18;
    }
}
