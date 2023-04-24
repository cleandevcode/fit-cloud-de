package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;

/* loaded from: classes.dex */
public final class U extends AbstractC0654da {

    /* renamed from: h */
    private final int[] f7730h = new int[4];

    private int b(C0732x c0732x, int[] iArr, int i10, int[][] iArr2) {
        Y.a(c0732x, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.43f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float a10 = Y.a(iArr, iArr2[i12], 0.7f);
            if (a10 < f10) {
                i11 = i12;
                f10 = a10;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw C0628a.a();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public int a(C0732x c0732x, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f7730h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d10 = c0732x.d();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < d10; i11++) {
            sb2.append((char) (b(c0732x, iArr2, i10, AbstractC0654da.f7845d) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = AbstractC0654da.a(c0732x, i10, true, AbstractC0654da.f7843b)[1];
        for (int i14 = 0; i14 < 4 && i13 < d10; i14++) {
            sb2.append((char) (b(c0732x, iArr2, i13, AbstractC0654da.f7845d) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public BarcodeFormat a() {
        return BarcodeFormat.EAN_8;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public boolean a(int i10, int i11, C0732x c0732x) {
        return c0732x.a(i11, ((int) ((i11 - i10) * 1.5d)) + i11, false, true);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public boolean a(int[] iArr, int[] iArr2) {
        int i10 = iArr[1];
        int i11 = iArr[0];
        double d10 = (i10 - i11) / 3.0d;
        int i12 = iArr2[1];
        int i13 = iArr2[0];
        return ((double) Math.abs(((int) Math.round(((double) (i12 - i11)) / (((double) ((i10 - i11) + (i12 - i13))) / 6.0d))) + (-67))) <= 6.7d && Math.abs(1.0d - (d10 / (((double) (i12 - i13)) / 3.0d))) < 0.2d;
    }
}
