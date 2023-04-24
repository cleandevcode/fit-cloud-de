package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* loaded from: classes.dex */
public final class Gc implements Pb {
    private static C0736y a(Oc oc2, int i10, int i11, int i12, boolean z10) {
        int max;
        int max2;
        int i13;
        int i14;
        Ic a10 = oc2.a();
        if (a10 != null) {
            int c10 = a10.c();
            int b10 = a10.b();
            if (z10) {
                max = Math.max(i10, c10);
                max2 = Math.max(i11, b10);
                int i15 = i12 * 2;
                i13 = (max - i15) / c10;
                i14 = (max2 - i15) / b10;
            } else {
                int i16 = i12 * 2;
                int i17 = c10 + i16;
                int i18 = i16 + b10;
                max = Math.max(i10, i17);
                max2 = Math.max(i11, i18);
                i13 = max / i17;
                i14 = max2 / i18;
            }
            int min = Math.min(i13, i14);
            int i19 = (max - (c10 * min)) / 2;
            int i20 = (max2 - (b10 * min)) / 2;
            C0736y c0736y = new C0736y(max, max2);
            int i21 = 0;
            while (i21 < b10) {
                int i22 = i19;
                int i23 = 0;
                while (i23 < c10) {
                    if (a10.a(i23, i21) == 1) {
                        c0736y.a(i22, i20, min, min);
                    }
                    i23++;
                    i22 += min;
                }
                i21++;
                i20 += min;
            }
            return c0736y;
        }
        throw new IllegalStateException();
    }

    @Override // com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + barcodeFormat);
        } else if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        } else {
            Pa pa2 = Pa.L;
            int i12 = 4;
            Boolean bool = Boolean.FALSE;
            if (map != null) {
                Jc jc2 = Jc.ERROR_CORRECTION;
                if (map.containsKey(jc2)) {
                    pa2 = Pa.valueOf(map.get(jc2).toString());
                }
                Jc jc3 = Jc.MARGIN;
                if (map.containsKey(jc3)) {
                    try {
                        i12 = Integer.parseInt(map.get(jc3).toString());
                    } catch (Exception e10) {
                        throw e10;
                    }
                }
                Jc jc4 = Jc.LOGO;
                if (map.containsKey(jc4)) {
                    try {
                        bool = (Boolean) map.get(jc4);
                    } catch (Exception e11) {
                        throw e11;
                    }
                }
            }
            return a(Lc.a(str, pa2, map), i10, i11, i12, bool.booleanValue());
        }
    }
}
