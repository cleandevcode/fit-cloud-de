package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* loaded from: classes.dex */
public final class Yb implements Pb {
    private static C0736y a(Ic ic2, int i10, int i11, int i12) {
        C0736y c0736y;
        int c10 = ic2.c();
        int b10 = ic2.b();
        int i13 = i12 * 2;
        int i14 = c10 + i13;
        int i15 = i13 + b10;
        int max = Math.max(i10, i14);
        int max2 = Math.max(i11, i15);
        int min = Math.min(max / i14, max2 / i15);
        int i16 = (max - (c10 * min)) / 2;
        int i17 = (max2 - (b10 * min)) / 2;
        if (i11 < b10 || i10 < c10) {
            c0736y = new C0736y(c10, b10);
            i16 = 0;
            i17 = 0;
        } else {
            c0736y = new C0736y(i10, i11);
        }
        c0736y.a();
        int i18 = 0;
        while (i18 < b10) {
            int i19 = i16;
            int i20 = 0;
            while (i20 < c10) {
                if (ic2.a(i20, i18) == 1) {
                    c0736y.a(i19, i17, min, min);
                }
                i20++;
                i19 += min;
            }
            i18++;
            i17 += min;
        }
        return c0736y;
    }

    private static C0736y a(C0652cc c0652cc, C0676ic c0676ic, int i10, int i11, int i12) {
        int e10 = c0676ic.e();
        int d10 = c0676ic.d();
        Ic ic2 = new Ic(c0676ic.g(), c0676ic.f());
        int i13 = 0;
        for (int i14 = 0; i14 < d10; i14++) {
            if (i14 % c0676ic.f7963g == 0) {
                int i15 = 0;
                for (int i16 = 0; i16 < c0676ic.g(); i16++) {
                    ic2.a(i15, i13, i16 % 2 == 0);
                    i15++;
                }
                i13++;
            }
            int i17 = 0;
            for (int i18 = 0; i18 < e10; i18++) {
                if (i18 % c0676ic.f7962f == 0) {
                    ic2.a(i17, i13, true);
                    i17++;
                }
                ic2.a(i17, i13, c0652cc.a(i18, i14));
                i17++;
                int i19 = c0676ic.f7962f;
                if (i18 % i19 == i19 - 1) {
                    ic2.a(i17, i13, i14 % 2 == 0);
                    i17++;
                }
            }
            i13++;
            int i20 = c0676ic.f7963g;
            if (i14 % i20 == i20 - 1) {
                int i21 = 0;
                for (int i22 = 0; i22 < c0676ic.g(); i22++) {
                    ic2.a(i21, i13, true);
                    i21++;
                }
                i13++;
            }
        }
        return a(ic2, i10, i11, i12);
    }

    @Override // com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        Mb mb2;
        if (str.isEmpty()) {
            try {
                throw new IllegalArgumentException("Found empty contents");
            } catch (Exception e10) {
                throw e10;
            }
        } else if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can only encode DATA_MATRIX, but got ");
                sb2.append(barcodeFormat);
                throw new IllegalArgumentException(sb2.toString());
            } catch (Exception e11) {
                throw e11;
            }
        } else if (i10 < 0 || i11 < 0) {
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Requested dimensions can't be negative: ");
                sb3.append(i10);
                sb3.append('x');
                sb3.append(i11);
                throw new IllegalArgumentException(sb3.toString());
            } catch (Exception e12) {
                throw e12;
            }
        } else {
            EnumC0680jc enumC0680jc = EnumC0680jc.FORCE_SQUARE;
            int i12 = 4;
            if (map != null) {
                EnumC0680jc enumC0680jc2 = (EnumC0680jc) map.get(Jc.DATA_MATRIX_SHAPE);
                if (enumC0680jc2 != null) {
                    enumC0680jc = enumC0680jc2;
                }
                Mb mb3 = (Mb) map.get(Jc.MIN_SIZE);
                if (mb3 == null) {
                    mb3 = null;
                }
                Mb mb4 = (Mb) map.get(Jc.MAX_SIZE);
                r1 = mb4 != null ? mb4 : null;
                Jc jc2 = Jc.MARGIN;
                if (map.containsKey(jc2)) {
                    try {
                        i12 = Integer.parseInt(map.get(jc2).toString());
                    } catch (Exception e13) {
                        throw e13;
                    }
                }
                mb2 = r1;
                r1 = mb3;
            } else {
                mb2 = null;
            }
            String a10 = C0672hc.a(str, enumC0680jc, r1, mb2);
            C0676ic a11 = C0676ic.a(a10.length(), enumC0680jc, r1, mb2, true);
            C0652cc c0652cc = new C0652cc(C0668gc.a(a10, a11), a11.e(), a11.d());
            c0652cc.a();
            return a(c0652cc, a11, i10, i11, i12);
        }
    }
}
