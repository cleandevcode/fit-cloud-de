package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class S extends Y {

    /* renamed from: a */
    private static final char[] f7698a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: b */
    public static final int[] f7699b;

    /* renamed from: c */
    private static final int f7700c;

    /* renamed from: d */
    private final StringBuilder f7701d = new StringBuilder(20);

    /* renamed from: e */
    private final int[] f7702e = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f7699b = iArr;
        f7700c = iArr[47];
    }

    private static char a(char c10, char c11) {
        int i10;
        switch (c10) {
            case 'a':
                if (c11 >= 'A' && c11 <= 'Z') {
                    i10 = c11 - '@';
                    break;
                } else {
                    throw C0628a.a();
                }
            case 'b':
                if (c11 >= 'A' && c11 <= 'E') {
                    i10 = c11 - '&';
                    break;
                } else if (c11 >= 'F' && c11 <= 'J') {
                    i10 = c11 - 11;
                    break;
                } else if (c11 >= 'K' && c11 <= 'O') {
                    i10 = c11 + 16;
                    break;
                } else if (c11 >= 'P' && c11 <= 'S') {
                    i10 = c11 + '+';
                    break;
                } else if (c11 < 'T' || c11 > 'Z') {
                    throw C0628a.a();
                } else {
                    return (char) 127;
                }
                break;
            case 'c':
                if (c11 >= 'A' && c11 <= 'O') {
                    i10 = c11 - ' ';
                    break;
                } else if (c11 == 'Z') {
                    return ':';
                } else {
                    throw C0628a.a();
                }
            case 'd':
                if (c11 >= 'A' && c11 <= 'Z') {
                    i10 = c11 + ' ';
                    break;
                } else {
                    throw C0628a.a();
                }
            default:
                return (char) 0;
        }
        return (char) i10;
    }

    private static char a(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f7699b;
            if (i11 >= iArr.length) {
                throw C0628a.a();
            }
            if (iArr[i11] == i10) {
                return f7698a[i11];
            }
            i11++;
        }
    }

    private static void a(CharSequence charSequence) {
        int length = charSequence.length();
        a(charSequence, length - 2, 20);
        a(charSequence, length - 1, 15);
    }

    private static void a(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) != f7698a[i12 % 47]) {
            throw C0628a.a();
        }
    }

    private int[] a(C0732x c0732x) {
        int d10 = c0732x.d();
        int b10 = c0732x.b(0);
        Arrays.fill(this.f7702e, 0);
        int[] iArr = this.f7702e;
        int length = iArr.length;
        int i10 = b10;
        boolean z10 = false;
        int i11 = 0;
        while (b10 < d10) {
            if (c0732x.a(b10) == z10) {
                if (i11 != length - 1) {
                    i11++;
                } else if (b(iArr) == f7700c) {
                    return new int[]{i10, b10};
                } else {
                    i10 += iArr[0] + iArr[1];
                    int i12 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i11] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z10 = !z10;
            } else if (i11 < 0 || i11 >= iArr.length) {
                throw C0628a.a();
            } else {
                iArr[i11] = iArr[i11] + 1;
            }
            b10++;
        }
        throw C0628a.a();
    }

    private static int b(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int round = Math.round((iArr[i13] * 9.0f) / i10);
            if (round < 1 || round > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < round; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= round;
            }
        }
        return i12;
    }

    private static String b(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i10 >= length - 1) {
                    throw C0628a.a();
                }
                i10++;
                charAt = a(charAt, charSequence.charAt(i10));
            }
            sb2.append(charAt);
            i10++;
        }
        return sb2.toString();
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        int[] a10;
        int b10 = c0732x.b(a(c0732x)[1]);
        int d10 = c0732x.d();
        int[] iArr = this.f7702e;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f7701d;
        sb2.setLength(0);
        while (true) {
            Y.a(c0732x, b10, iArr);
            int b11 = b(iArr);
            if (b11 < 0) {
                throw C0628a.a();
            }
            char a11 = a(b11);
            sb2.append(a11);
            int i11 = b10;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int b12 = c0732x.b(i11);
            if (a11 == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                if (b12 == d10 || !c0732x.a(b12)) {
                    throw C0628a.a();
                }
                if (sb2.length() >= 2) {
                    a(sb2);
                    sb2.setLength(sb2.length() - 2);
                    float f10 = i10;
                    return new com.huawei.hms.scankit.aiscan.common.x(b(sb2), null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(a10[0], f10), new com.huawei.hms.scankit.aiscan.common.z(((i13 * 10) / 9) + b10, f10)}, BarcodeFormat.CODE_93);
                }
                throw C0628a.a();
            }
            b10 = b12;
        }
    }
}
