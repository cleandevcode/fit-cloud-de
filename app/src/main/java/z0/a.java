package z0;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public final float f31833a;

    /* renamed from: b */
    public final float f31834b;

    /* renamed from: c */
    public final float f31835c;

    /* renamed from: d */
    public final float f31836d;

    /* renamed from: e */
    public final float f31837e;

    /* renamed from: f */
    public final float f31838f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f31833a = f10;
        this.f31834b = f11;
        this.f31835c = f12;
        this.f31836d = f13;
        this.f31837e = f14;
        this.f31838f = f15;
    }

    public static a a(int i10) {
        float f10;
        float pow;
        n nVar = n.f31869k;
        float q10 = b0.c.q(Color.red(i10));
        float q11 = b0.c.q(Color.green(i10));
        float q12 = b0.c.q(Color.blue(i10));
        float[][] fArr = b0.c.f3934d;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[2] * q12) + (fArr2[1] * q11) + (fArr2[0] * q10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[2] * q12) + (fArr3[1] * q11) + (fArr3[0] * q10);
        float[] fArr4 = fArr[2];
        float f13 = (q12 * fArr4[2]) + (q11 * fArr4[1]) + (q10 * fArr4[0]);
        float[][] fArr5 = b0.c.f3931a;
        float[] fArr6 = fArr5[0];
        float f14 = (fArr6[2] * f13) + (fArr6[1] * f12) + (fArr6[0] * f11);
        float[] fArr7 = fArr5[1];
        float f15 = fArr7[1] * f12;
        float f16 = fArr7[2] * f13;
        float[] fArr8 = fArr5[2];
        float f17 = f11 * fArr8[0];
        float f18 = f13 * fArr8[2];
        float[] fArr9 = nVar.f31876g;
        float f19 = fArr9[0] * f14;
        float f20 = fArr9[1] * (f16 + f15 + (fArr7[0] * f11));
        float f21 = fArr9[2] * (f18 + (f12 * fArr8[1]) + f17);
        float pow2 = (float) Math.pow((Math.abs(f19) * nVar.f31877h) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f20) * nVar.f31877h) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f21) * nVar.f31877h) / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f21) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d10 = signum3;
        float f22 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d10)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = ((21.0f * signum3) + ((signum * 20.0f) + f24)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = atan2;
        float f28 = (3.1415927f * f27) / 180.0f;
        float pow5 = ((float) Math.pow((f26 * nVar.f31871b) / nVar.f31870a, nVar.f31873d * nVar.f31879j)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        if (f27 < 20.14d) {
            f10 = 360.0f + f27;
        } else {
            f10 = f27;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, nVar.f31875f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f10 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * nVar.f31874e) * nVar.f31872c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * nVar.f31873d) / (nVar.f31870a + 4.0f));
        float f29 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((nVar.f31878i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f28;
        return new a(f27, pow6, pow5, f29, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public static a b(float f10, float f11, float f12) {
        n nVar;
        double d10;
        float f13 = n.f31869k.f31873d;
        Math.sqrt(f10 / 100.0d);
        Math.sqrt(((f11 / ((float) Math.sqrt(d10))) * nVar.f31873d) / (nVar.f31870a + 4.0f));
        float f14 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((nVar.f31878i * f11 * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f14, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    public final int c(n nVar) {
        float f10;
        float[] fArr;
        float f11 = this.f31834b;
        if (f11 != 0.0d) {
            double d10 = this.f31835c;
            if (d10 != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, nVar.f31875f), 0.73d), 1.1111111111111112d);
                double d11 = (this.f31833a * 3.1415927f) / 180.0f;
                float pow2 = nVar.f31870a * ((float) Math.pow(this.f31835c / 100.0d, (1.0d / nVar.f31873d) / nVar.f31879j));
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f * 3846.1538f * nVar.f31874e * nVar.f31872c;
                float f12 = pow2 / nVar.f31871b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f13 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f14 = cos2 * f13;
                float f15 = f13 * sin;
                float f16 = f12 * 460.0f;
                float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
                float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
                float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / nVar.f31877h) * Math.signum(f17) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
                float signum2 = (100.0f / nVar.f31877h) * Math.signum(f18) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float signum3 = Math.signum(f19);
                float[] fArr2 = nVar.f31876g;
                float f20 = signum / fArr2[0];
                float f21 = signum2 / fArr2[1];
                float pow3 = (((100.0f / nVar.f31877h) * signum3) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = b0.c.f3932b;
                float[] fArr4 = fArr3[0];
                float f22 = (fArr4[2] * pow3) + (fArr4[1] * f21) + (fArr4[0] * f20);
                float[] fArr5 = fArr3[1];
                float f23 = fArr5[1] * f21;
                float f24 = fArr5[2] * pow3;
                float f25 = f20 * fArr3[2][0];
                return a1.a.a(f22, f24 + f23 + (fArr5[0] * f20), (pow3 * fArr[2]) + (f21 * fArr[1]) + f25);
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, nVar.f31875f), 0.73d), 1.1111111111111112d);
        double d112 = (this.f31833a * 3.1415927f) / 180.0f;
        float pow22 = nVar.f31870a * ((float) Math.pow(this.f31835c / 100.0d, (1.0d / nVar.f31873d) / nVar.f31879j));
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f * 3846.1538f * nVar.f31874e * nVar.f31872c;
        float f122 = pow22 / nVar.f31871b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f132 = (((0.305f + f122) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f142 = cos22 * f132;
        float f152 = f132 * sin2;
        float f162 = f122 * 460.0f;
        float f172 = ((288.0f * f152) + ((451.0f * f142) + f162)) / 1403.0f;
        float f182 = ((f162 - (891.0f * f142)) - (261.0f * f152)) / 1403.0f;
        float f192 = ((f162 - (f142 * 220.0f)) - (f152 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / nVar.f31877h) * Math.signum(f172) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172))), 2.380952380952381d));
        float signum22 = (100.0f / nVar.f31877h) * Math.signum(f182) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float signum32 = Math.signum(f192);
        float[] fArr22 = nVar.f31876g;
        float f202 = signum4 / fArr22[0];
        float f212 = signum22 / fArr22[1];
        float pow32 = (((100.0f / nVar.f31877h) * signum32) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = b0.c.f3932b;
        float[] fArr42 = fArr32[0];
        float f222 = (fArr42[2] * pow32) + (fArr42[1] * f212) + (fArr42[0] * f202);
        float[] fArr52 = fArr32[1];
        float f232 = fArr52[1] * f212;
        float f242 = fArr52[2] * pow32;
        float f252 = f202 * fArr32[2][0];
        return a1.a.a(f222, f242 + f232 + (fArr52[0] * f202), (pow32 * fArr[2]) + (f212 * fArr[1]) + f252);
    }
}
