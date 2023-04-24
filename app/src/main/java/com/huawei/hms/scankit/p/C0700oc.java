package com.huawei.hms.scankit.p;

import androidx.appcompat.widget.u0;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.oc */
/* loaded from: classes.dex */
public final class C0700oc extends AbstractC0719tc {
    private static void a(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0719tc, com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0719tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int i10 = length + 25;
            for (int i11 = 0; i11 < length; i11++) {
                int indexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11));
                if (indexOf >= 0) {
                    a(Q.f7659a[indexOf], iArr);
                    for (int i12 = 0; i12 < 9; i12++) {
                        i10 += iArr[i12];
                    }
                } else {
                    throw new IllegalArgumentException("Bad contents: error contents");
                }
            }
            boolean[] zArr = new boolean[i10];
            a(148, iArr);
            int a10 = AbstractC0719tc.a(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int a11 = AbstractC0719tc.a(zArr, a10, iArr2, false) + a10;
            for (int i13 = 0; i13 < length; i13++) {
                a(Q.f7659a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i13))], iArr);
                int a12 = AbstractC0719tc.a(zArr, a11, iArr, true) + a11;
                a11 = AbstractC0719tc.a(zArr, a12, iArr2, false) + a12;
            }
            a(148, iArr);
            AbstractC0719tc.a(zArr, a11, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException(u0.a("Requested contents should be less than 80 digits long, but got ", length));
    }
}
