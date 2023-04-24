package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;

/* renamed from: com.huawei.hms.scankit.p.ba */
/* loaded from: classes.dex */
public final class C0646ba {

    /* renamed from: a */
    private static final int[] f7828a = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: b */
    private final int[] f7829b = new int[4];

    /* renamed from: c */
    private final StringBuilder f7830c = new StringBuilder();

    private static int a(int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f7828a[i11]) {
                return i11;
            }
        }
        throw C0628a.a();
    }

    private int a(C0732x c0732x, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f7829b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d10 = c0732x.d();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && i10 < d10; i12++) {
            int a10 = AbstractC0654da.a(c0732x, iArr2, i10, AbstractC0654da.f7846e);
            sb2.append((char) ((a10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (a10 >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                i10 = c0732x.c(c0732x.b(i10));
            }
        }
        if (sb2.length() == 5) {
            if (a(sb2.toString()) == a(i11)) {
                return i10;
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            i10 += charSequence.charAt(i11) - '0';
        }
        int i12 = i10 * 3;
        for (int i13 = length - 1; i13 >= 0; i13 -= 2) {
            i12 += charSequence.charAt(i13) - '0';
        }
        return (i12 * 3) % 10;
    }

    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, int[] iArr) {
        StringBuilder sb2 = this.f7830c;
        sb2.setLength(0);
        float f10 = i10;
        return new com.huawei.hms.scankit.aiscan.common.x(sb2.toString(), null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z((iArr[0] + iArr[1]) / 2.0f, f10), new com.huawei.hms.scankit.aiscan.common.z(a(c0732x, iArr, sb2), f10)}, BarcodeFormat.UPC_EAN_EXTENSION);
    }
}
