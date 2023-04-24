package com.huawei.hms.scankit.p;

import androidx.appcompat.widget.u0;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.sc */
/* loaded from: classes.dex */
public final class C0715sc extends AbstractC0719tc {

    /* renamed from: a */
    private static final int[] f8056a = {1, 1, 1, 1};

    /* renamed from: b */
    private static final int[] f8057b = {3, 1, 1};

    @Override // com.huawei.hms.scankit.p.AbstractC0719tc, com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        if (barcodeFormat == BarcodeFormat.ITF) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0719tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                boolean[] zArr = new boolean[(length * 9) + 9];
                int a10 = AbstractC0719tc.a(zArr, 0, f8056a, true);
                for (int i10 = 0; i10 < length; i10 += 2) {
                    int digit = Character.digit(str.charAt(i10), 10);
                    int digit2 = Character.digit(str.charAt(i10 + 1), 10);
                    int[] iArr = new int[10];
                    for (int i11 = 0; i11 < 5; i11++) {
                        int i12 = i11 * 2;
                        int[][] iArr2 = V.f7743d;
                        iArr[i12] = iArr2[digit][i11];
                        iArr[i12 + 1] = iArr2[digit2][i11];
                    }
                    a10 += AbstractC0719tc.a(zArr, a10, iArr, true);
                }
                AbstractC0719tc.a(zArr, a10, f8057b, true);
                return zArr;
            }
            throw new IllegalArgumentException(u0.a("Requested contents should be less than 80 digits long, but got ", length));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
