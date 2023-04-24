package j4;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class u0 implements t0 {

    /* renamed from: a */
    public static u0 f17468a = new u0();

    @Override // j4.t0
    public final void e(i0 i0Var, Object obj, Object obj2, Type type, int i10) {
        String str;
        d1 d1Var = i0Var.f17406j;
        if (obj == null) {
            d1Var.X(e1.WriteNullListAsEmpty);
            return;
        }
        int i11 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            d1Var.write(91);
            while (i11 < iArr.length) {
                if (i11 != 0) {
                    d1Var.write(44);
                }
                d1Var.L(iArr[i11]);
                i11++;
            }
            d1Var.write(93);
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            d1Var.write(91);
            while (i11 < sArr.length) {
                if (i11 != 0) {
                    d1Var.write(44);
                }
                d1Var.L(sArr[i11]);
                i11++;
            }
            d1Var.write(93);
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            d1Var.write(91);
            while (i11 < jArr.length) {
                if (i11 != 0) {
                    d1Var.write(44);
                }
                d1Var.P(jArr[i11]);
                i11++;
            }
            d1Var.write(93);
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            d1Var.write(91);
            while (i11 < zArr.length) {
                if (i11 != 0) {
                    d1Var.write(44);
                }
                if (zArr[i11]) {
                    str = "true";
                } else {
                    str = "false";
                }
                d1Var.write(str);
                i11++;
            }
            d1Var.write(93);
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            d1Var.write(91);
            while (i11 < fArr.length) {
                if (i11 != 0) {
                    d1Var.write(44);
                }
                float f10 = fArr[i11];
                if (Float.isNaN(f10)) {
                    d1Var.R();
                } else {
                    d1Var.b(Float.toString(f10));
                }
                i11++;
            }
            d1Var.write(93);
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            d1Var.write(91);
            while (i11 < dArr.length) {
                if (i11 != 0) {
                    d1Var.write(44);
                }
                double d10 = dArr[i11];
                if (Double.isNaN(d10)) {
                    d1Var.R();
                } else {
                    d1Var.b(Double.toString(d10));
                }
                i11++;
            }
            d1Var.write(93);
        } else if (obj instanceof byte[]) {
            d1Var.s((byte[]) obj);
        } else {
            char[] cArr = (char[]) obj;
            if (d1Var.f17357e) {
                int length = cArr.length;
                int i12 = d1Var.f17354b + length + 2;
                if (i12 > d1Var.f17353a.length) {
                    if (d1Var.f17356d != null) {
                        d1Var.write(39);
                        while (i11 < cArr.length) {
                            char c10 = cArr[i11];
                            if (c10 <= '\r' || c10 == '\\' || c10 == '\'' || (c10 == '/' && d1Var.q(e1.WriteSlashAsSpecial))) {
                                d1Var.write(92);
                                c10 = n4.g.f21975i[c10];
                            }
                            d1Var.write(c10);
                            i11++;
                        }
                        d1Var.write(39);
                        return;
                    }
                    d1Var.j(i12);
                }
                int i13 = d1Var.f17354b;
                int i14 = i13 + 1;
                int i15 = length + i14;
                char[] cArr2 = d1Var.f17353a;
                cArr2[i13] = '\'';
                System.arraycopy(cArr, 0, cArr2, i14, cArr.length);
                d1Var.f17354b = i12;
                int i16 = -1;
                char c11 = 0;
                for (int i17 = i14; i17 < i15; i17++) {
                    char c12 = d1Var.f17353a[i17];
                    if (c12 <= '\r' || c12 == '\\' || c12 == '\'' || (c12 == '/' && d1Var.q(e1.WriteSlashAsSpecial))) {
                        i11++;
                        i16 = i17;
                        c11 = c12;
                    }
                }
                int i18 = i12 + i11;
                if (i18 > d1Var.f17353a.length) {
                    d1Var.j(i18);
                }
                d1Var.f17354b = i18;
                if (i11 == 1) {
                    char[] cArr3 = d1Var.f17353a;
                    int i19 = i16 + 1;
                    System.arraycopy(cArr3, i19, cArr3, i16 + 2, (i15 - i16) - 1);
                    char[] cArr4 = d1Var.f17353a;
                    cArr4[i16] = '\\';
                    cArr4[i19] = n4.g.f21975i[c11];
                } else if (i11 > 1) {
                    char[] cArr5 = d1Var.f17353a;
                    int i20 = i16 + 1;
                    System.arraycopy(cArr5, i20, cArr5, i16 + 2, (i15 - i16) - 1);
                    char[] cArr6 = d1Var.f17353a;
                    cArr6[i16] = '\\';
                    cArr6[i20] = n4.g.f21975i[c11];
                    int i21 = i15 + 1;
                    for (int i22 = i20 - 2; i22 >= i14; i22--) {
                        char c13 = d1Var.f17353a[i22];
                        if (c13 <= '\r' || c13 == '\\' || c13 == '\'' || (c13 == '/' && d1Var.q(e1.WriteSlashAsSpecial))) {
                            char[] cArr7 = d1Var.f17353a;
                            int i23 = i22 + 1;
                            System.arraycopy(cArr7, i23, cArr7, i22 + 2, (i21 - i22) - 1);
                            char[] cArr8 = d1Var.f17353a;
                            cArr8[i22] = '\\';
                            cArr8[i23] = n4.g.f21975i[c13];
                            i21++;
                        }
                    }
                }
                d1Var.f17353a[d1Var.f17354b - 1] = '\'';
                return;
            }
            d1Var.b0(new String(cArr), (char) 0);
        }
    }
}
