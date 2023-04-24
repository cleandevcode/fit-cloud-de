package com.huawei.hms.scankit.p;

import androidx.appcompat.widget.u0;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.pc */
/* loaded from: classes.dex */
public class C0704pc extends AbstractC0719tc {
    private static int a(String str, int i10) {
        int i11 = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i11 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i10) {
                i12 = 1;
            }
        }
        return i11 % 47;
    }

    private static int a(boolean[] zArr, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            zArr[i10] = iArr[i11] != 0;
            i11++;
            i10 = i12;
        }
        return 9;
    }

    private static void a(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0719tc, com.huawei.hms.scankit.p.Pb
    public C0736y a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<Jc, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.a(str, barcodeFormat, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0719tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            a(S.f7699b[47], iArr);
            boolean[] zArr = new boolean[((str.length() + 2 + 2) * 9) + 1];
            int a10 = a(zArr, 0, iArr);
            for (int i10 = 0; i10 < length; i10++) {
                int indexOf = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i10));
                if (indexOf >= 0) {
                    a(S.f7699b[indexOf], iArr);
                    a10 += a(zArr, a10, iArr);
                } else {
                    throw new IllegalArgumentException("Bad contents: please check contents");
                }
            }
            int a11 = a(str, 20);
            int[] iArr2 = S.f7699b;
            a(iArr2[a11], iArr);
            int a12 = a10 + a(zArr, a10, iArr);
            StringBuilder a13 = android.support.v4.media.d.a(str);
            a13.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(a11));
            a(iArr2[a(a13.toString(), 15)], iArr);
            int a14 = a12 + a(zArr, a12, iArr);
            a(iArr2[47], iArr);
            zArr[a14 + a(zArr, a14, iArr)] = true;
            return zArr;
        }
        throw new IllegalArgumentException(u0.a("Requested contents should be less than 80 digits long, but got ", length));
    }
}
