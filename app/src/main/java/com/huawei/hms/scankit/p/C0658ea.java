package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;

/* renamed from: com.huawei.hms.scankit.p.ea */
/* loaded from: classes.dex */
public final class C0658ea extends AbstractC0654da {

    /* renamed from: h */
    private static final int[] f7874h = {1, 1, 1, 1, 1, 1};

    /* renamed from: i */
    public static final int[][] f7875i = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: j */
    private final int[] f7876j = new int[4];

    private static void a(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 <= 1; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (i10 == f7875i[i11][i12]) {
                    sb2.insert(0, (char) (i11 + 48));
                    sb2.append((char) (i12 + 48));
                    return;
                }
            }
        }
        throw C0628a.a();
    }

    private int b(C0732x c0732x, int[] iArr, int i10, int[][] iArr2) {
        Y.a(c0732x, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.45f;
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

    public static String b(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public int a(C0732x c0732x, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f7876j;
        int i10 = 0;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d10 = c0732x.d();
        int i11 = iArr[1];
        float f10 = 10000.0f;
        int i12 = 0;
        int i13 = 0;
        float f11 = 0.0f;
        while (i12 < 6 && i11 < d10) {
            int b10 = b(c0732x, iArr2, i11, AbstractC0654da.f7846e);
            sb2.append((char) ((b10 % 10) + 48));
            int i14 = 0;
            float f12 = 0.0f;
            while (true) {
                int[] iArr3 = AbstractC0654da.f7846e[b10];
                if (i14 >= iArr3.length) {
                    break;
                }
                f12 += iArr3[i14];
                i14++;
            }
            float f13 = (((iArr2[i10] + iArr2[1]) + iArr2[2]) + iArr2[3]) / f12;
            if (f13 > f11) {
                f11 = f13;
            }
            if (f13 < f10) {
                f10 = f13;
            }
            int length = iArr2.length;
            while (i10 < length) {
                i11 += iArr2[i10];
                i10++;
            }
            if (b10 >= 10) {
                i13 |= 1 << (5 - i12);
            }
            i12++;
            i10 = 0;
        }
        if (f11 / f10 <= 2.89d) {
            a(sb2, i13);
            return i11;
        }
        throw C0628a.a();
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public BarcodeFormat a() {
        return BarcodeFormat.UPC_E;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public boolean a(int i10, int i11, C0732x c0732x) {
        return c0732x.a(i11, (i11 - i10) + i11, false, true);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public boolean a(String str) {
        return super.a(b(str));
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public boolean a(int[] iArr, int[] iArr2) {
        int i10 = iArr[1];
        int i11 = iArr[0];
        double d10 = (i10 - i11) / 3.0d;
        int i12 = iArr2[1];
        int i13 = iArr2[0];
        return ((double) Math.abs(((int) Math.round(((double) (i12 - i11)) / (((double) ((i10 - i11) + (i12 - i13))) / 9.0d))) + (-51))) <= 10.200000000000001d && Math.abs(1.0d - (d10 / (((double) (i12 - i13)) / 6.0d))) < 0.2d;
    }

    @Override // com.huawei.hms.scankit.p.AbstractC0654da
    public int[] a(C0732x c0732x, int i10) {
        return AbstractC0654da.a(c0732x, i10, true, f7874h);
    }
}
