package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes.dex */
public final class Qb implements Pb {
    private static C0736y a(Rb rb2, int i10, int i11, int i12) {
        C0736y a10 = rb2.a();
        if (a10 != null) {
            int d10 = a10.d();
            int b10 = a10.b();
            int i13 = i12 * 2;
            int i14 = d10 + i13;
            int i15 = i13 + b10;
            int max = Math.max(i10, i14);
            int max2 = Math.max(i11, i15);
            int min = Math.min(max / i14, max2 / i15);
            int i16 = (max - (d10 * min)) / 2;
            int i17 = (max2 - (b10 * min)) / 2;
            C0736y c0736y = new C0736y(max, max2);
            int i18 = 0;
            while (i18 < b10) {
                int i19 = i16;
                int i20 = 0;
                while (i20 < d10) {
                    if (a10.b(i20, i18)) {
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
        throw new IllegalStateException();
    }

    private static C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Charset charset, int i12, int i13, int i14) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return a(Tb.a(str.getBytes(charset), i12, i13), i10, i11, i14);
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can only encode AZTEC, but got ");
            sb2.append(barcodeFormat);
            throw new IllegalArgumentException(sb2.toString());
        } catch (Exception e10) {
            throw e10;
        }
    }

    @Override // com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        Charset charset;
        int i12;
        int i13;
        int i14;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        int i15 = 33;
        int i16 = 0;
        if (map != null) {
            Jc jc2 = Jc.CHARACTER_SET;
            if (map.containsKey(jc2)) {
                charset2 = Charset.forName(map.get(jc2).toString());
            }
            Jc jc3 = Jc.ERROR_CORRECTION;
            if (map.containsKey(jc3)) {
                try {
                    i15 = Integer.parseInt(map.get(jc3).toString());
                } catch (Exception e10) {
                    throw e10;
                }
            }
            Jc jc4 = Jc.AZTEC_LAYERS;
            if (map.containsKey(jc4)) {
                try {
                    i16 = Integer.parseInt(map.get(jc4).toString());
                } catch (Exception e11) {
                    throw e11;
                }
            }
            Jc jc5 = Jc.MARGIN;
            if (map.containsKey(jc5)) {
                try {
                    int parseInt = Integer.parseInt(map.get(jc5).toString());
                    charset = charset2;
                    i12 = i15;
                    i13 = i16;
                    i14 = parseInt;
                    return a(str, barcodeFormat, i10, i11, charset, i12, i13, i14);
                } catch (Exception e12) {
                    throw e12;
                }
            }
            charset = charset2;
            i12 = i15;
            i13 = i16;
        } else {
            charset = charset2;
            i12 = 33;
            i13 = 0;
        }
        i14 = 4;
        return a(str, barcodeFormat, i10, i11, charset, i12, i13, i14);
    }
}
