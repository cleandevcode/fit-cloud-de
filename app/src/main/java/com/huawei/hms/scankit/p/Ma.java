package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0630c;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class Ma {

    /* renamed from: a */
    private static final char[] f7608a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    private static char a(int i10) {
        char[] cArr = f7608a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw C0628a.a();
    }

    private static int a(C0740z c0740z) {
        int a10 = c0740z.a(8);
        if ((a10 & 128) == 0) {
            return a10 & 127;
        }
        if ((a10 & 192) == 128) {
            return c0740z.a(8) | ((a10 & 63) << 8);
        }
        if ((a10 & 224) == 192) {
            return c0740z.a(16) | ((a10 & 31) << 16);
        }
        throw C0628a.a();
    }

    public static C0632e a(byte[] bArr, Ya ya2, Pa pa2, Map<EnumC0631d, ?> map) {
        int i10;
        int i11;
        C0740z c0740z = new C0740z(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            try {
                Va a10 = c0740z.a() < 4 ? Va.TERMINATOR : Va.a(c0740z.a(4));
                int[] iArr = {i14, i12, i13};
                a(a10, c0740z, sb2, ya2, iArr, null, arrayList, map);
                i14 = iArr[0] == 1 ? 1 : 0;
                i10 = iArr[1];
                i11 = iArr[2];
                if (a10 == Va.TERMINATOR) {
                    break;
                }
                i12 = i10;
                i13 = i11;
            } catch (IllegalArgumentException unused) {
                throw C0628a.a();
            }
        }
        return new C0632e(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, pa2 == null ? null : pa2.toString(), i10, i11);
    }

    private static void a(Va va2, C0740z c0740z, StringBuilder sb2, Ya ya2, int[] iArr, EnumC0630c enumC0630c, List<byte[]> list, Map<EnumC0631d, ?> map) {
        int[] iArr2 = La.f7603a;
        switch (iArr2[va2.ordinal()]) {
            case 5:
                return;
            case 6:
            case 7:
                iArr[0] = 1;
                return;
            case 8:
                if (c0740z.a() < 16) {
                    throw C0628a.a();
                }
                iArr[1] = c0740z.a(8);
                iArr[2] = c0740z.a(8);
                return;
            case 9:
                if (EnumC0630c.a(a(c0740z)) == null) {
                    throw C0628a.a();
                }
                return;
            case 10:
                int a10 = c0740z.a(4);
                int a11 = c0740z.a(va2.a(ya2));
                if (a10 == 1) {
                    a(c0740z, sb2, a11);
                    return;
                }
                return;
            default:
                int a12 = c0740z.a(va2.a(ya2));
                int i10 = iArr2[va2.ordinal()];
                if (i10 == 1) {
                    c(c0740z, sb2, a12);
                    return;
                } else if (i10 == 2) {
                    a(c0740z, sb2, a12, iArr[0] == 1);
                    return;
                } else if (i10 == 3) {
                    a(c0740z, sb2, a12, enumC0630c, list, map);
                    return;
                } else if (i10 != 4) {
                    throw C0628a.a();
                } else {
                    b(c0740z, sb2, a12);
                    return;
                }
        }
    }

    private static void a(C0740z c0740z, StringBuilder sb2, int i10) {
        if (i10 * 13 > c0740z.a()) {
            throw C0628a.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int a10 = c0740z.a(13);
            int i12 = (a10 % 96) | ((a10 / 96) << 8);
            int i13 = i12 + (i12 < 959 ? 41377 : 42657);
            try {
                if (com.huawei.hms.scankit.util.b.a(bArr, i11)) {
                    int i14 = i11 + 1;
                    if (com.huawei.hms.scankit.util.b.a(bArr, i14)) {
                        bArr[i11] = (byte) ((i13 >> 8) & 255);
                        bArr[i14] = (byte) (i13 & 255);
                        i11 += 2;
                        i10--;
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw e10;
            }
        }
        try {
            sb2.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw C0628a.a();
        }
    }

    private static void a(C0740z c0740z, StringBuilder sb2, int i10, EnumC0630c enumC0630c, Collection<byte[]> collection, Map<EnumC0631d, ?> map) {
        if (i10 * 8 > c0740z.a()) {
            throw C0628a.a();
        }
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) c0740z.a(8);
        }
        try {
            sb2.append(new String(bArr, enumC0630c == null ? com.huawei.hms.scankit.aiscan.common.B.a(bArr, map) : enumC0630c.name()));
            collection.add(bArr);
        } catch (UnsupportedEncodingException unused) {
            throw C0628a.a();
        }
    }

    private static void a(C0740z c0740z, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (c0740z.a() < 11) {
                throw C0628a.a();
            }
            int a10 = c0740z.a(11);
            sb2.append(a(a10 / 45));
            sb2.append(a(a10 % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (c0740z.a() < 6) {
                throw C0628a.a();
            }
            sb2.append(a(c0740z.a(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static void b(C0740z c0740z, StringBuilder sb2, int i10) {
        if (i10 * 13 > c0740z.a()) {
            throw C0628a.a();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int a10 = c0740z.a(13);
            int i12 = (a10 % 192) | ((a10 / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            try {
                if (com.huawei.hms.scankit.util.b.a(bArr, i11)) {
                    int i14 = i11 + 1;
                    if (com.huawei.hms.scankit.util.b.a(bArr, i14)) {
                        bArr[i11] = (byte) (i13 >> 8);
                        bArr[i14] = (byte) i13;
                        i11 += 2;
                        i10--;
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw e10;
            }
        }
        try {
            sb2.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw C0628a.a();
        }
    }

    private static void c(C0740z c0740z, StringBuilder sb2, int i10) {
        int a10;
        while (i10 >= 3) {
            if (c0740z.a() < 10) {
                throw C0628a.a();
            }
            int a11 = c0740z.a(10);
            if (a11 >= 1000) {
                throw C0628a.a();
            }
            sb2.append(a(a11 / 100));
            sb2.append(a((a11 / 10) % 10));
            sb2.append(a(a11 % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (c0740z.a() < 7) {
                throw C0628a.a();
            }
            int a12 = c0740z.a(7);
            if (a12 >= 100) {
                throw C0628a.a();
            }
            sb2.append(a(a12 / 10));
            a10 = a12 % 10;
        } else if (i10 != 1) {
            return;
        } else {
            if (c0740z.a() < 4) {
                throw C0628a.a();
            }
            a10 = c0740z.a(4);
            if (a10 >= 10) {
                throw C0628a.a();
            }
        }
        sb2.append(a(a10));
    }
}
