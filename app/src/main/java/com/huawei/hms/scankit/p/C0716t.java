package com.huawei.hms.scankit.p;

import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.scankit.C0637e;
import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.t */
/* loaded from: classes.dex */
public final class C0716t {

    /* renamed from: a */
    private static final String[] f8058a = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: b */
    private static final String[] f8059b = {"CTRL_PS", " ", "a", "b", "c", "d", C0637e.f7371a, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f8060c = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f8061d = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", ContainerUtils.FIELD_DELIMITER, "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", ContainerUtils.KEY_VALUE_DELIMITER, ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: e */
    private static final String[] f8062e = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: f */
    private C0705q f8063f;

    /* renamed from: com.huawei.hms.scankit.p.t$a */
    /* loaded from: classes.dex */
    public enum a {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    private static byte a(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? a(zArr, i10, 8) : a(zArr, i10, length) << (8 - length));
    }

    private static int a(int i10, boolean z10) {
        return ((i10 * 16) + (z10 ? 88 : 112)) * i10;
    }

    private static int a(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    private static a a(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? a.UPPER : a.MIXED : a.LOWER : a.PUNCT : a.DIGIT : a.BINARY;
    }

    private static String a(a aVar, int i10) {
        int i11 = C0712s.f8054a[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return f8062e[i10];
                        }
                        throw new IllegalStateException("Bad table");
                    }
                    return f8061d[i10];
                }
                return f8060c[i10];
            }
            return f8059b[i10];
        }
        return f8058a[i10];
    }

    private static String a(boolean[] zArr, Map<EnumC0631d, ?> map) {
        a aVar = a.UPPER;
        StringBuilder a10 = a(zArr, aVar, aVar);
        int length = a10.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) a10.charAt(i10);
        }
        try {
            return new String(bArr, com.huawei.hms.scankit.aiscan.common.B.a(bArr, map));
        } catch (UnsupportedEncodingException unused) {
            throw C0628a.a();
        }
    }

    private static StringBuilder a(boolean[] zArr, a aVar, a aVar2) {
        int length = zArr.length;
        StringBuilder sb2 = new StringBuilder(20);
        int i10 = 0;
        loop0: while (true) {
            a aVar3 = aVar2;
            aVar2 = aVar;
            aVar = aVar3;
            while (i10 < length) {
                if (aVar != a.BINARY) {
                    int i11 = aVar == a.DIGIT ? 4 : 5;
                    if (length - i10 < i11) {
                        break loop0;
                    }
                    int a10 = a(zArr, i10, i11);
                    i10 += i11;
                    String a11 = a(aVar, a10);
                    if (a11.startsWith("CTRL_")) {
                        aVar2 = a(a11.charAt(5));
                        if (a11.charAt(6) == 'L') {
                        }
                    } else {
                        sb2.append(a11);
                    }
                    aVar = aVar2;
                } else if (length - i10 < 5) {
                    break loop0;
                } else {
                    int a12 = a(zArr, i10, 5);
                    i10 += 5;
                    if (a12 == 0) {
                        if (length - i10 < 11) {
                            break loop0;
                        }
                        a12 = a(zArr, i10, 11) + 31;
                        i10 += 11;
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 >= a12) {
                            break;
                        } else if (length - i10 < 8) {
                            i10 = length;
                            break;
                        } else {
                            sb2.append((char) a(zArr, i10, 8));
                            i10 += 8;
                            i12++;
                        }
                    }
                    aVar = aVar2;
                }
            }
        }
        return sb2;
    }

    public static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = a(zArr, i10 * 8);
        }
        return bArr;
    }

    private boolean[] a(int i10, int i11, int[] iArr) {
        int i12 = (1 << i11) - 1;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = iArr[i14];
            if (i15 == 0 || i15 == i12) {
                throw C0628a.a();
            }
            if (i15 == 1 || i15 == i12 - 1) {
                i13++;
            }
        }
        boolean[] zArr = new boolean[(i10 * i11) - i13];
        int i16 = 0;
        for (int i17 = 0; i17 < i10; i17++) {
            int i18 = iArr[i17];
            if (i18 == 1 || i18 == i12 - 1) {
                Arrays.fill(zArr, i16, (i16 + i11) - 1, i18 > 1);
                i16 = (i11 - 1) + i16;
            } else {
                int i19 = i11 - 1;
                while (i19 >= 0) {
                    int i20 = i16 + 1;
                    zArr[i16] = ((1 << i19) & i18) != 0;
                    i19--;
                    i16 = i20;
                }
            }
        }
        return zArr;
    }

    private boolean[] a(C0736y c0736y) {
        C0705q c0705q = this.f8063f;
        boolean z10 = c0705q != null && c0705q.g();
        C0705q c0705q2 = this.f8063f;
        int f10 = c0705q2 != null ? c0705q2.f() : 0;
        int i10 = (f10 * 4) + (z10 ? 11 : 14);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[a(f10, z10)];
        int i11 = 2;
        if (z10) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((((i13 - 1) / 15) * 2) + (i10 + 1)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i15 / 15) + i15;
                iArr[(i13 - i15) - 1] = (i14 - i16) - 1;
                iArr[i13 + i15] = i16 + i14 + 1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < f10) {
            int i19 = ((f10 - i17) * 4) + (z10 ? 9 : 12);
            int i20 = i17 * 2;
            int i21 = (i10 - 1) - i20;
            int i22 = 0;
            while (i22 < i19) {
                int i23 = i22 * 2;
                int i24 = 0;
                while (i24 < i11) {
                    int i25 = i20 + i24;
                    int i26 = i20 + i22;
                    zArr[i18 + i23 + i24] = c0736y.b(iArr[i25], iArr[i26]);
                    int i27 = i21 - i24;
                    zArr[(i19 * 2) + i18 + i23 + i24] = c0736y.b(iArr[i26], iArr[i27]);
                    int i28 = i21 - i22;
                    zArr[(i19 * 4) + i18 + i23 + i24] = c0736y.b(iArr[i27], iArr[i28]);
                    zArr[(i19 * 6) + i18 + i23 + i24] = c0736y.b(iArr[i28], iArr[i25]);
                    i24++;
                    z10 = z10;
                    i11 = 2;
                }
                i22++;
                i11 = 2;
            }
            i18 += i19 * 8;
            i17++;
            i11 = 2;
        }
        return zArr;
    }

    private boolean[] b(boolean[] zArr) {
        com.huawei.hms.scankit.aiscan.common.h hVar;
        C0705q c0705q = this.f8063f;
        if (c0705q != null) {
            int i10 = 8;
            if (c0705q.f() <= 2) {
                i10 = 6;
                hVar = com.huawei.hms.scankit.aiscan.common.h.f7243c;
            } else if (this.f8063f.f() <= 8) {
                hVar = com.huawei.hms.scankit.aiscan.common.h.f7247g;
            } else if (this.f8063f.f() <= 22) {
                i10 = 10;
                hVar = com.huawei.hms.scankit.aiscan.common.h.f7242b;
            } else {
                i10 = 12;
                hVar = com.huawei.hms.scankit.aiscan.common.h.f7241a;
            }
            int e10 = this.f8063f.e();
            int length = zArr.length / i10;
            if (length >= e10) {
                int length2 = zArr.length % i10;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    iArr[i11] = a(zArr, length2, i10);
                    i11++;
                    length2 += i10;
                }
                try {
                    new com.huawei.hms.scankit.aiscan.common.u(hVar).a(iArr, length - e10);
                    return a(e10, i10, iArr);
                } catch (C0628a e11) {
                    throw C0628a.a(e11.getMessage());
                }
            }
            throw C0628a.a();
        }
        throw C0628a.a();
    }

    public C0632e a(C0705q c0705q, Map<EnumC0631d, ?> map) {
        this.f8063f = c0705q;
        boolean[] b10 = b(a(c0705q.a()));
        C0632e c0632e = new C0632e(a(b10), a(b10, map), null, null);
        c0632e.a(b10.length);
        return c0632e;
    }
}
