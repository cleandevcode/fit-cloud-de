package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.tc */
/* loaded from: classes.dex */
public abstract class AbstractC0719tc implements Pb {
    public static int a(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    private static C0736y a(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int max = Math.max(i10, i13);
        int max2 = Math.max(1, i11);
        int i14 = max / i13;
        int i15 = (max - (length * i14)) / 2;
        C0736y c0736y = new C0736y(max, max2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                c0736y.a(i15, 0, i14, max2);
            }
            i16++;
            i15 += i14;
        }
        return c0736y;
    }

    public int a() {
        return 10;
    }

    @Override // com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        int a10 = a();
        if (map != null) {
            Jc jc2 = Jc.MARGIN;
            if (map.containsKey(jc2)) {
                try {
                    a10 = Integer.parseInt(map.get(jc2).toString());
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("EncodeHintType MARGIN can not format integer");
                }
            }
        }
        return a(a(str), i10, i11, a10);
    }

    public abstract boolean[] a(String str);
}
