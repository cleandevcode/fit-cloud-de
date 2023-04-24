package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;

/* loaded from: classes.dex */
public final class T extends AbstractC0654da {

    /* renamed from: h */
    public static final int[] f7717h = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: j */
    private String f7719j = "";

    /* renamed from: i */
    private final int[] f7718i = new int[4];

    private static void a(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f7717h[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw C0628a.a();
    }

    private static boolean a(StringBuilder sb2) {
        int charAt = sb2.charAt(sb2.length() - 1) - '0';
        int i10 = 0;
        for (int i11 = 0; i11 < sb2.length() - 1; i11++) {
            i10 = (i11 % 2 == 0 ? sb2.charAt(i11) - '0' : (sb2.charAt(i11) - '0') * 3) + i10;
        }
        return (i10 + charAt) % 10 == 0;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public int a(C0732x c0732x, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f7718i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d10 = c0732x.d();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < d10; i12++) {
            int a10 = AbstractC0654da.a(c0732x, iArr2, i10, AbstractC0654da.f7846e);
            sb2.append((char) ((a10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (a10 >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        a(sb2, i11);
        this.f7719j = sb2.substring(0, 1);
        int i14 = AbstractC0654da.a(c0732x, i10, true, AbstractC0654da.f7843b)[1];
        for (int i15 = 0; i15 < 6 && i14 < d10; i15++) {
            sb2.append((char) (AbstractC0654da.a(c0732x, iArr2, i14, AbstractC0654da.f7845d) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        if (a(sb2)) {
            return i14;
        }
        throw C0628a.a();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public BarcodeFormat a() {
        return BarcodeFormat.EAN_13;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public boolean a(int i10, int i11, C0732x c0732x) {
        return c0732x.a(i11, (i11 - i10) + i11, false, false);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public boolean a(int[] iArr, int[] iArr2) {
        int i10 = iArr2[1];
        int i11 = iArr[1];
        int i12 = iArr[0];
        int round = (int) Math.round((i10 - i12) / (((i11 - i12) + (i10 - iArr2[0])) / 6.0d));
        return this.f7719j.equals("0") ? ((double) Math.abs(round + (-95))) <= 18.05d || ((double) Math.abs(round + (-113))) <= 21.47d : ((double) Math.abs(round + (-95))) <= 18.05d;
    }
}
