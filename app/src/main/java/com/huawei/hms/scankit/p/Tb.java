package com.huawei.hms.scankit.p;

import java.util.Locale;

/* loaded from: classes.dex */
public final class Tb {

    /* renamed from: a */
    private static final int[] f7723a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int a(int i10, boolean z10) {
        return ((i10 * 16) + (z10 ? 88 : 112)) * i10;
    }

    private static com.huawei.hms.scankit.aiscan.common.h a(int i10) {
        if (i10 != 4) {
            if (i10 != 6) {
                if (i10 != 8) {
                    if (i10 != 10) {
                        if (i10 == 12) {
                            return com.huawei.hms.scankit.aiscan.common.h.f7241a;
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unsupported word size ");
                            sb2.append(i10);
                            throw new IllegalArgumentException(sb2.toString());
                        } catch (Exception e10) {
                            throw e10;
                        }
                    }
                    return com.huawei.hms.scankit.aiscan.common.h.f7242b;
                }
                return com.huawei.hms.scankit.aiscan.common.h.f7247g;
            }
            return com.huawei.hms.scankit.aiscan.common.h.f7243c;
        }
        return com.huawei.hms.scankit.aiscan.common.h.f7244d;
    }

    public static Rb a(byte[] bArr, int i10, int i11) {
        C0732x c0732x;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        C0732x a10 = new Ub(bArr).a();
        int d10 = ((a10.d() * i10) / 100) + 11;
        int d11 = a10.d() + d10;
        int i16 = 0;
        int i17 = 1;
        if (i11 == 0) {
            C0732x c0732x2 = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 <= 32) {
                boolean z11 = i18 <= 3;
                int i20 = z11 ? i18 + 1 : i18;
                int a11 = a(i20, z11);
                if (d11 <= a11) {
                    if (c0732x2 == null || i19 != f7723a[i20]) {
                        int i21 = f7723a[i20];
                        i19 = i21;
                        c0732x2 = a(a10, i21);
                    }
                    int i22 = a11 - (a11 % i19);
                    if ((!z11 || c0732x2.d() <= i19 * 64) && c0732x2.d() + d10 <= i22) {
                        c0732x = c0732x2;
                        i12 = i19;
                        z10 = z11;
                        i13 = i20;
                        i14 = a11;
                    }
                }
                i18++;
                i16 = 0;
                i17 = 1;
            }
            try {
                throw new IllegalArgumentException("Data too large for an Aztec code");
            } catch (Exception e10) {
                throw e10;
            }
        }
        z10 = i11 < 0;
        i13 = Math.abs(i11);
        if (i13 > (z10 ? 4 : 32)) {
            try {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Illegal value %s for layers", Integer.valueOf(i11)));
            } catch (Exception e11) {
                throw e11;
            }
        }
        i14 = a(i13, z10);
        i12 = f7723a[i13];
        int i23 = i14 - (i14 % i12);
        c0732x = a(a10, i12);
        if (c0732x.d() + d10 > i23) {
            try {
                throw new IllegalArgumentException("Data to large for user specified layer");
            } catch (Exception e12) {
                throw e12;
            }
        } else if (z10 && c0732x.d() > i12 * 64) {
            try {
                throw new IllegalArgumentException("Data to large for user specified layer");
            } catch (Exception e13) {
                throw e13;
            }
        }
        C0732x b10 = b(c0732x, i14, i12);
        int d12 = c0732x.d() / i12;
        C0732x a12 = a(z10, i13, d12);
        int i24 = (i13 * 4) + (z10 ? 11 : 14);
        int[] iArr = new int[i24];
        int i25 = 2;
        if (z10) {
            for (int i26 = 0; i26 < i24; i26++) {
                iArr[i26] = i26;
            }
            i15 = i24;
        } else {
            int i27 = i24 / 2;
            i15 = (((i27 - 1) / 15) * 2) + i24 + 1;
            int i28 = i15 / 2;
            for (int i29 = 0; i29 < i27; i29++) {
                int i30 = (i29 / 15) + i29;
                iArr[(i27 - i29) - 1] = (i28 - i30) - 1;
                iArr[i27 + i29] = i30 + i28 + i17;
            }
        }
        C0736y c0736y = new C0736y(i15);
        int i31 = 0;
        int i32 = 0;
        while (i31 < i13) {
            int i33 = ((i13 - i31) * 4) + (z10 ? 9 : 12);
            int i34 = 0;
            while (i34 < i33) {
                int i35 = i34 * 2;
                while (i16 < i25) {
                    if (b10.a(i32 + i35 + i16)) {
                        int i36 = i31 * 2;
                        c0736y.c(iArr[i36 + i16], iArr[i36 + i34]);
                    }
                    if (b10.a((i33 * 2) + i32 + i35 + i16)) {
                        int i37 = i31 * 2;
                        c0736y.c(iArr[i37 + i34], iArr[((i24 - 1) - i37) - i16]);
                    }
                    if (b10.a((i33 * 4) + i32 + i35 + i16)) {
                        int i38 = (i24 - 1) - (i31 * 2);
                        c0736y.c(iArr[i38 - i16], iArr[i38 - i34]);
                    }
                    if (b10.a((i33 * 6) + i32 + i35 + i16)) {
                        int i39 = i31 * 2;
                        c0736y.c(iArr[((i24 - 1) - i39) - i34], iArr[i39 + i16]);
                    }
                    i16++;
                    i25 = 2;
                }
                i34++;
                i16 = 0;
                i25 = 2;
            }
            i32 += i33 * 8;
            i31++;
            i16 = 0;
            i25 = 2;
        }
        a(c0736y, z10, i15, a12);
        int i40 = i15 / 2;
        if (z10) {
            a(c0736y, i40, 5);
        } else {
            a(c0736y, i40, 7);
            int i41 = 0;
            int i42 = 0;
            while (i41 < (i24 / 2) - 1) {
                for (int i43 = i40 & 1; i43 < i15; i43 += 2) {
                    int i44 = i40 - i42;
                    c0736y.c(i44, i43);
                    int i45 = i40 + i42;
                    c0736y.c(i45, i43);
                    c0736y.c(i43, i44);
                    c0736y.c(i43, i45);
                }
                i41 += 15;
                i42 += 16;
            }
        }
        Rb rb2 = new Rb();
        rb2.a(z10);
        rb2.c(i15);
        rb2.b(i13);
        rb2.a(d12);
        rb2.a(c0736y);
        return rb2;
    }

    public static C0732x a(C0732x c0732x, int i10) {
        C0732x c0732x2 = new C0732x();
        int d10 = c0732x.d();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < d10) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= d10 || c0732x.a(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 != i11) {
                if (i16 == 0) {
                    i16 = i13 | 1;
                } else {
                    c0732x2.a(i13, i10);
                    i12 += i10;
                }
            }
            c0732x2.a(i16, i10);
            i12--;
            i12 += i10;
        }
        return c0732x2;
    }

    public static C0732x a(boolean z10, int i10, int i11) {
        int i12;
        C0732x c0732x = new C0732x();
        int i13 = i10 - 1;
        if (z10) {
            c0732x.a(i13, 2);
            c0732x.a(i11 - 1, 6);
            i12 = 28;
        } else {
            c0732x.a(i13, 5);
            c0732x.a(i11 - 1, 11);
            i12 = 40;
        }
        return b(c0732x, i12, 4);
    }

    private static void a(C0736y c0736y, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    c0736y.c(i14, i13);
                    c0736y.c(i14, i15);
                    c0736y.c(i13, i14);
                    c0736y.c(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        c0736y.c(i16, i16);
        int i17 = i16 + 1;
        c0736y.c(i17, i16);
        c0736y.c(i16, i17);
        int i18 = i10 + i11;
        c0736y.c(i18, i16);
        c0736y.c(i18, i17);
        c0736y.c(i18, i18 - 1);
    }

    private static void a(C0736y c0736y, boolean z10, int i10, C0732x c0732x) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (c0732x.a(i12)) {
                    c0736y.c(i13, i11 - 5);
                }
                if (c0732x.a(i12 + 7)) {
                    c0736y.c(i11 + 5, i13);
                }
                if (c0732x.a(20 - i12)) {
                    c0736y.c(i13, i11 + 5);
                }
                if (c0732x.a(27 - i12)) {
                    c0736y.c(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i12 / 5) + (i11 - 5) + i12;
            if (c0732x.a(i12)) {
                c0736y.c(i14, i11 - 7);
            }
            if (c0732x.a(i12 + 10)) {
                c0736y.c(i11 + 7, i14);
            }
            if (c0732x.a(29 - i12)) {
                c0736y.c(i14, i11 + 7);
            }
            if (c0732x.a(39 - i12)) {
                c0736y.c(i11 - 7, i14);
            }
            i12++;
        }
    }

    private static int[] a(C0732x c0732x, int i10, int i11) {
        int[] iArr = new int[i11];
        int d10 = c0732x.d() / i10;
        for (int i12 = 0; i12 < d10; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= c0732x.a((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    private static C0732x b(C0732x c0732x, int i10, int i11) {
        com.huawei.hms.scankit.aiscan.common.v vVar = new com.huawei.hms.scankit.aiscan.common.v(a(i11));
        int i12 = i10 / i11;
        int[] a10 = a(c0732x, i11, i12);
        vVar.a(a10, i12 - (c0732x.d() / i11));
        C0732x c0732x2 = new C0732x();
        c0732x2.a(0, i10 % i11);
        for (int i13 : a10) {
            c0732x2.a(i13, i11);
        }
        return c0732x2;
    }
}
