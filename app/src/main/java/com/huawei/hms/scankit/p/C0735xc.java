package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.xc */
/* loaded from: classes.dex */
public final class C0735xc implements Pb {
    private static C0736y a(Cc cc2, String str, int i10, int i11, int i12, int i13) {
        cc2.a(str, i10);
        byte[][] a10 = cc2.a().a(1, 4);
        int length = i11 / a10[0].length;
        int length2 = i12 / a10.length;
        if (length >= length2) {
            length = length2;
        }
        return length > 1 ? a(cc2.a().a(length, length * 4), i13) : a(a10, i13);
    }

    private static C0736y a(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        C0736y c0736y = new C0736y(bArr[0].length + i11, bArr.length + i11);
        c0736y.a();
        int b10 = (c0736y.b() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    c0736y.c(i13 + i10, b10);
                }
            }
            i12++;
            b10--;
        }
        return c0736y;
    }

    @Override // com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        int i12;
        int i13;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got " + barcodeFormat);
        }
        Cc cc2 = new Cc();
        int i14 = 30;
        int i15 = 2;
        if (map != null) {
            Jc jc2 = Jc.PDF417_COMPACT;
            if (map.containsKey(jc2)) {
                cc2.a(Boolean.valueOf(map.get(jc2).toString()).booleanValue());
            }
            Jc jc3 = Jc.PDF417_COMPACTION;
            if (map.containsKey(jc3)) {
                cc2.a(Ac.valueOf(map.get(jc3).toString()));
            }
            Jc jc4 = Jc.PDF417_DIMENSIONS;
            if (map.containsKey(jc4)) {
                Bc bc2 = (Bc) map.get(jc4);
                cc2.a(bc2.a(), bc2.c(), bc2.b(), bc2.d());
            }
            Jc jc5 = Jc.MARGIN;
            if (map.containsKey(jc5)) {
                try {
                    i14 = Integer.parseInt(map.get(jc5).toString());
                } catch (Exception e10) {
                    throw e10;
                }
            }
            Jc jc6 = Jc.ERROR_CORRECTION;
            if (map.containsKey(jc6)) {
                try {
                    i15 = Integer.parseInt(map.get(jc6).toString());
                } catch (Exception e11) {
                    throw e11;
                }
            }
            Jc jc7 = Jc.CHARACTER_SET;
            if (map.containsKey(jc7)) {
                cc2.a(Charset.forName(map.get(jc7).toString()));
            }
            i13 = i14;
            i12 = i15;
        } else {
            i12 = 2;
            i13 = 30;
        }
        return a(cc2, str, i12, i10, i11, i13);
    }
}
