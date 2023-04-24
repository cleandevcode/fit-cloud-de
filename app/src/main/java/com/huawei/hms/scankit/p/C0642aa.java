package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;

/* renamed from: com.huawei.hms.scankit.p.aa */
/* loaded from: classes.dex */
public final class C0642aa {

    /* renamed from: a */
    private final int[] f7809a = new int[4];

    /* renamed from: b */
    private final StringBuilder f7810b = new StringBuilder();

    private int a(C0732x c0732x, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f7809a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d10 = c0732x.d();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 2 && i10 < d10; i12++) {
            int a10 = AbstractC0654da.a(c0732x, iArr2, i10, AbstractC0654da.f7846e);
            sb2.append((char) ((a10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (a10 >= 10) {
                i11 |= 1 << (1 - i12);
            }
            if (i12 != 1) {
                i10 = c0732x.c(c0732x.b(i10));
            }
        }
        if (sb2.length() == 2) {
            try {
                if (Integer.parseInt(sb2.toString()) % 4 == i11) {
                    return i10;
                }
                throw C0628a.a();
            } catch (NumberFormatException unused) {
                throw C0628a.a();
            }
        }
        throw C0628a.a();
    }

    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, int[] iArr) {
        StringBuilder sb2 = this.f7810b;
        sb2.setLength(0);
        float f10 = i10;
        return new com.huawei.hms.scankit.aiscan.common.x(sb2.toString(), null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z((iArr[0] + iArr[1]) / 2.0f, f10), new com.huawei.hms.scankit.aiscan.common.z(a(c0732x, iArr, sb2), f10)}, BarcodeFormat.UPC_EAN_EXTENSION);
    }
}
