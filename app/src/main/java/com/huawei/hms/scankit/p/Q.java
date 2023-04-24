package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class Q extends Y {

    /* renamed from: a */
    public static final int[] f7659a = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: b */
    private final boolean f7660b;

    /* renamed from: c */
    private final boolean f7661c;

    /* renamed from: d */
    private final StringBuilder f7662d;

    /* renamed from: e */
    private final int[] f7663e;

    public Q() {
        this(false);
    }

    public Q(boolean z10) {
        this(z10, false);
    }

    public Q(boolean z10, boolean z11) {
        this.f7660b = z10;
        this.f7661c = z11;
        this.f7662d = new StringBuilder(20);
        this.f7663e = new int[9];
    }

    private static char a(char c10, char c11) {
        int i10;
        if (c10 != '$') {
            if (c10 != '%') {
                if (c10 != '+') {
                    if (c10 == '/') {
                        if (c11 < 'A' || c11 > 'O') {
                            if (c11 == 'Z') {
                                return ':';
                            }
                            throw C0628a.a();
                        }
                        i10 = c11 - ' ';
                    }
                    return (char) 0;
                } else if (c11 < 'A' || c11 > 'Z') {
                    throw C0628a.a();
                } else {
                    i10 = c11 + ' ';
                }
            } else if (c11 >= 'A' && c11 <= 'E') {
                i10 = c11 - '&';
            } else if (c11 >= 'F' && c11 <= 'J') {
                i10 = c11 - 11;
            } else if (c11 >= 'K' && c11 <= 'O') {
                i10 = c11 + 16;
            } else if (c11 < 'P' || c11 > 'T') {
                if (c11 != 'U') {
                    if (c11 == 'V') {
                        return '@';
                    }
                    if (c11 == 'W') {
                        return '`';
                    }
                    if (c11 == 'X' || c11 == 'Y' || c11 == 'Z') {
                        return (char) 127;
                    }
                    throw C0628a.a();
                }
                return (char) 0;
            } else {
                i10 = c11 + '+';
            }
        } else if (c11 < 'A' || c11 > 'Z') {
            throw C0628a.a();
        } else {
            i10 = c11 - '@';
        }
        return (char) i10;
    }

    private static char a(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f7659a;
            if (i11 >= iArr.length) {
                if (i10 == 148) {
                    return '*';
                }
                throw C0628a.a();
            } else if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
            } else {
                i11++;
            }
        }
    }

    private com.huawei.hms.scankit.aiscan.common.x a(StringBuilder sb2, int[] iArr, int i10, int i11, int i12) {
        if (this.f7660b) {
            int length = sb2.length() - 1;
            int i13 = 0;
            for (int i14 = 0; i14 < length; i14++) {
                i13 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f7662d.charAt(i14));
            }
            if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i13 % 43)) {
                throw C0628a.a();
            }
            sb2.setLength(length);
        }
        if (sb2.length() != 0) {
            float f10 = i12;
            return new com.huawei.hms.scankit.aiscan.common.x(this.f7661c ? a(sb2) : sb2.toString(), null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(iArr[0], f10), new com.huawei.hms.scankit.aiscan.common.z(i10 + i11, f10)}, BarcodeFormat.CODE_39);
        }
        throw C0628a.a();
    }

    private static String a(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i10++;
                charAt = a(charAt, charSequence.charAt(i10));
            }
            sb2.append(charAt);
            i10++;
        }
        return sb2.toString();
    }

    private static int[] a(C0732x c0732x, int[] iArr) {
        int d10 = c0732x.d();
        int b10 = c0732x.b(0);
        int length = iArr.length;
        int i10 = b10;
        boolean z10 = false;
        int i11 = 0;
        while (b10 < d10) {
            if (c0732x.a(b10) == z10) {
                if (i11 != length - 1) {
                    i11++;
                } else if (c(iArr) == 148 && c0732x.a(Math.max(0, i10 - ((b10 - i10) / 5)), i10, false, true)) {
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

    private static boolean b(int[] iArr) {
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 < i10) {
                i10 = i12;
            }
            if (i12 > i11) {
                i11 = i12;
            }
        }
        return i11 / i10 > 6;
    }

    private static int c(int[] iArr) {
        int length = iArr.length;
        if (b(iArr)) {
            return -1;
        }
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i15 |= 1 << ((length - 1) - i16);
                    i13++;
                    i14 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if (i19 * 2 >= i14) {
                            return -1;
                        }
                    }
                }
                return i15;
            } else if (i13 <= 3) {
                return -1;
            } else {
                i10 = i11;
            }
        }
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i10, C0732x c0732x, Map<EnumC0631d, ?> map) {
        int[] iArr = this.f7663e;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f7662d;
        sb2.setLength(0);
        int[] a10 = a(c0732x, iArr);
        int b10 = c0732x.b(a10[1]);
        int d10 = c0732x.d();
        while (true) {
            Y.a(c0732x, b10, iArr);
            int c10 = c(iArr);
            if (c10 < 0) {
                throw C0628a.a();
            }
            char a11 = a(c10);
            sb2.append(a11);
            int i11 = b10;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int b11 = c0732x.b(i11);
            if (a11 == '*') {
                sb2.setLength(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                int i15 = (b11 - b10) - i13;
                if (b11 == d10 || i15 * 5 >= i13) {
                    return a(sb2, a10, b10, i13, i10);
                }
                throw C0628a.a();
            }
            b10 = b11;
        }
    }
}
