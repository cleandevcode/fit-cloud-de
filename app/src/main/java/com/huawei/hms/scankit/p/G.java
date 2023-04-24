package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
final class G {

    /* renamed from: b */
    private static final char[] f7514b;

    /* renamed from: d */
    private static final char[] f7516d;

    /* renamed from: a */
    private static final char[] f7513a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: c */
    private static final char[] f7515c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e */
    private static final char[] f7517e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* loaded from: classes.dex */
    public enum a {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        UPPER_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f7514b = cArr;
        f7516d = cArr;
    }

    private static int a(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
    }

    public static C0632e a(byte[] bArr, Map<EnumC0631d, ?> map) {
        C0740z c0740z = new C0740z(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        a aVar = a.ASCII_ENCODE;
        do {
            a aVar2 = a.ASCII_ENCODE;
            if (aVar == aVar2) {
                aVar = a(c0740z, sb2, sb3);
            } else {
                int i10 = F.f7501a[aVar.ordinal()];
                if (i10 == 1) {
                    b(c0740z, sb2);
                } else if (i10 == 2) {
                    d(c0740z, sb2);
                } else if (i10 == 3) {
                    a(c0740z, sb2);
                } else if (i10 == 4) {
                    c(c0740z, sb2);
                } else if (i10 != 5) {
                    throw C0628a.a("AIScanException");
                } else {
                    a(c0740z, sb2, arrayList);
                }
                aVar = aVar2;
            }
            if (aVar == a.PAD_ENCODE) {
                break;
            }
        } while (c0740z.a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        int length = sb2.length();
        byte[] bArr2 = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr2[i11] = (byte) sb2.charAt(i11);
        }
        try {
            String str = new String(bArr2, com.huawei.hms.scankit.aiscan.common.B.a(bArr2, map));
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            return new C0632e(bArr, str, arrayList, null);
        } catch (UnsupportedEncodingException unused) {
            throw C0628a.a();
        }
    }

    private static a a(int i10, StringBuilder sb2, StringBuilder sb3, C0740z c0740z) {
        String str;
        switch (i10) {
            case 230:
                return a.C40_ENCODE;
            case 231:
                return a.BASE256_ENCODE;
            case 232:
                sb2.append((char) 29);
                return null;
            case 233:
            case 234:
            case 241:
                return null;
            case 235:
                return a.UPPER_ENCODE;
            case 236:
                str = "[)>\u001e05\u001d";
                break;
            case 237:
                str = "[)>\u001e06\u001d";
                break;
            case 238:
                return a.ANSIX12_ENCODE;
            case 239:
                return a.TEXT_ENCODE;
            case 240:
                return a.EDIFACT_ENCODE;
            default:
                if (i10 == 254 && c0740z.a() == 0) {
                    return null;
                }
                throw C0628a.a("AIScanException");
        }
        sb2.append(str);
        sb3.insert(0, "\u001e\u0004");
        return null;
    }

    private static a a(C0740z c0740z, StringBuilder sb2, StringBuilder sb3) {
        boolean z10 = false;
        do {
            int a10 = c0740z.a(8);
            if (a10 == 0) {
                throw C0628a.a("AIScanException");
            }
            if (a10 <= 128) {
                if (z10) {
                    a10 += 128;
                }
                sb2.append((char) (a10 - 1));
                return a.ASCII_ENCODE;
            } else if (a10 == 129) {
                return a.PAD_ENCODE;
            } else {
                if (a10 <= 229) {
                    int i10 = a10 - 130;
                    if (i10 < 10) {
                        sb2.append('0');
                    }
                    sb2.append(i10);
                } else {
                    a a11 = a(a10, sb2, sb3, c0740z);
                    if (a11 != null) {
                        if (a11 != a.UPPER_ENCODE) {
                            return a11;
                        }
                        z10 = true;
                    }
                }
            }
        } while (c0740z.a() > 0);
        return a.ASCII_ENCODE;
    }

    private static void a(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    private static void a(C0740z c0740z, StringBuilder sb2) {
        int a10;
        char c10;
        int i10;
        int[] iArr = new int[3];
        while (c0740z.a() != 8 && (a10 = c0740z.a(8)) != 254) {
            a(a10, c0740z.a(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    c10 = '\r';
                } else if (i12 == 1) {
                    c10 = '*';
                } else if (i12 == 2) {
                    c10 = '>';
                } else if (i12 != 3) {
                    if (i12 < 14) {
                        i10 = i12 + 44;
                    } else if (i12 >= 40) {
                        throw C0628a.a("AIScanException");
                    } else {
                        i10 = i12 + 51;
                    }
                    c10 = (char) i10;
                } else {
                    c10 = ' ';
                }
                sb2.append(c10);
            }
            if (c0740z.a() <= 0) {
                return;
            }
        }
    }

    private static void a(C0740z c0740z, StringBuilder sb2, Collection<byte[]> collection) {
        int c10 = c0740z.c() + 1;
        int i10 = c10 + 1;
        int a10 = a(c0740z.a(8), c10);
        if (a10 == 0) {
            a10 = c0740z.a() / 8;
        } else if (a10 >= 250) {
            a10 = ((a10 - 249) * 250) + a(c0740z.a(8), i10);
            i10++;
        }
        if (a10 < 0) {
            throw C0628a.a("AIScanException");
        }
        byte[] bArr = new byte[a10];
        int i11 = 0;
        while (i11 < a10) {
            if (c0740z.a() < 8) {
                throw C0628a.a("AIScanException");
            }
            bArr[i11] = (byte) a(c0740z.a(8), i10);
            i11++;
            i10++;
        }
        collection.add(bArr);
        try {
            sb2.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalStateException("Platform does not support required encoding: " + e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    private static int[] a(StringBuilder sb2, int i10, int i11, boolean z10) {
        ?? r92;
        boolean z11;
        if (i10 == 0) {
            if (i11 < 3) {
                i10 = i11 + 1;
                r92 = z10;
                return new int[]{i10, r92};
            }
            char[] cArr = f7515c;
            if (i11 < cArr.length) {
                char c10 = cArr[i11];
                if (z10) {
                    c10 = (char) (c10 + 128);
                }
                sb2.append(c10);
                r92 = 0;
                return new int[]{i10, r92};
            }
            throw C0628a.a("AIScanException");
        }
        if (i10 == 1) {
            if (z10) {
                i11 = (char) (i11 + 128);
            }
            sb2.append(i11);
        } else if (i10 == 2) {
            char[] cArr2 = f7516d;
            if (i11 < cArr2.length) {
                char c11 = cArr2[i11];
                if (z10) {
                    c11 = (char) (c11 + 128);
                }
                sb2.append(c11);
                z11 = false;
            } else if (i11 == 27) {
                sb2.append((char) 29);
                z11 = z10;
            } else if (i11 != 30) {
                throw C0628a.a("AIScanException");
            } else {
                z11 = true;
            }
            i10 = 0;
            r92 = z11;
            return new int[]{i10, r92};
        } else if (i10 != 3) {
            throw C0628a.a("AIScanException");
        } else {
            char[] cArr3 = f7517e;
            if (i11 >= cArr3.length) {
                throw C0628a.a("AIScanException");
            }
            char c12 = cArr3[i11];
            if (z10) {
                c12 = (char) (c12 + 128);
            }
            sb2.append(c12);
        }
        i10 = 0;
        r92 = 0;
        return new int[]{i10, r92};
    }

    private static void b(C0740z c0740z, StringBuilder sb2) {
        int a10;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (c0740z.a() != 8 && (a10 = c0740z.a(8)) != 254) {
            a(a10, c0740z.a(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int[] b10 = b(sb2, i10, iArr[i11], z10);
                i10 = b10[0];
                z10 = b10[1] == 1;
            }
            if (c0740z.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    private static int[] b(StringBuilder sb2, int i10, int i11, boolean z10) {
        ?? r92;
        boolean z11;
        if (i10 == 0) {
            if (i11 < 3) {
                i10 = i11 + 1;
                r92 = z10;
                return new int[]{i10, r92};
            }
            char[] cArr = f7513a;
            if (i11 < cArr.length) {
                char c10 = cArr[i11];
                if (z10) {
                    c10 = (char) (c10 + 128);
                }
                sb2.append(c10);
                r92 = 0;
                return new int[]{i10, r92};
            }
            throw C0628a.a("AIScanException");
        }
        if (i10 != 1) {
            if (i10 == 2) {
                char[] cArr2 = f7514b;
                if (i11 < cArr2.length) {
                    char c11 = cArr2[i11];
                    if (z10) {
                        c11 = (char) (c11 + 128);
                    }
                    sb2.append(c11);
                    z11 = false;
                } else if (i11 == 27) {
                    sb2.append((char) 29);
                    z11 = z10;
                } else if (i11 != 30) {
                    throw C0628a.a("AIScanException");
                } else {
                    z11 = true;
                }
                i10 = 0;
                r92 = z11;
                return new int[]{i10, r92};
            } else if (i10 != 3) {
                throw C0628a.a("AIScanException");
            } else {
                i11 = z10 ? i11 + 224 : i11 + 96;
            }
        } else if (z10) {
            i11 += 128;
        }
        sb2.append((char) i11);
        i10 = 0;
        r92 = 0;
        return new int[]{i10, r92};
    }

    private static void c(C0740z c0740z, StringBuilder sb2) {
        while (c0740z.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int a10 = c0740z.a(6);
                if (a10 == 31) {
                    int b10 = 8 - c0740z.b();
                    if (b10 != 8) {
                        c0740z.a(b10);
                        return;
                    }
                    return;
                }
                if ((a10 & 32) == 0) {
                    a10 |= 64;
                }
                sb2.append((char) a10);
            }
            if (c0740z.a() <= 0) {
                return;
            }
        }
    }

    private static void d(C0740z c0740z, StringBuilder sb2) {
        int a10;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (c0740z.a() != 8 && (a10 = c0740z.a(8)) != 254) {
            a(a10, c0740z.a(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int[] a11 = a(sb2, i10, iArr[i11], z10);
                i10 = a11[0];
                z10 = a11[1] == 1;
            }
            if (c0740z.a() <= 0) {
                return;
            }
        }
    }
}
