package com.huawei.hms.scankit.p;

import androidx.appcompat.widget.e2;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.EnumC0630c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Lc {

    /* renamed from: a */
    private static final int[] f7605a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static int a(int i10) {
        int[] iArr = f7605a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    private static int a(Ic ic2) {
        return Mc.a(ic2) + Mc.b(ic2) + Mc.c(ic2) + Mc.d(ic2);
    }

    private static int a(Va va2, C0732x c0732x, C0732x c0732x2, Ya ya2) {
        return c0732x2.d() + va2.a(ya2) + c0732x.d();
    }

    private static int a(C0732x c0732x, Pa pa2, Ya ya2, Ic ic2) {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            Nc.a(c0732x, pa2, ya2, i12, ic2);
            int a10 = a(ic2);
            if (a10 < i10) {
                i11 = i12;
                i10 = a10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.huawei.hms.scankit.p.Oc a(java.lang.String r7, com.huawei.hms.scankit.p.Pa r8, java.util.Map<com.huawei.hms.scankit.p.Jc, ?> r9) {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Le
            com.huawei.hms.scankit.p.Jc r2 = com.huawei.hms.scankit.p.Jc.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L1c
            com.huawei.hms.scankit.p.Jc r3 = com.huawei.hms.scankit.p.Jc.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L1e
        L1c:
            java.lang.String r3 = "ISO-8859-1"
        L1e:
            com.huawei.hms.scankit.p.Va r4 = a(r7, r3)
            com.huawei.hms.scankit.p.x r5 = new com.huawei.hms.scankit.p.x
            r5.<init>()
            com.huawei.hms.scankit.p.Va r6 = com.huawei.hms.scankit.p.Va.BYTE
            if (r4 != r6) goto L36
            if (r2 == 0) goto L36
            com.huawei.hms.scankit.aiscan.common.c r2 = com.huawei.hms.scankit.aiscan.common.EnumC0630c.a(r3)
            if (r2 == 0) goto L36
            a(r2, r5)
        L36:
            if (r9 == 0) goto L41
            com.huawei.hms.scankit.p.Jc r2 = com.huawei.hms.scankit.p.Jc.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            if (r0 == 0) goto L5d
            com.huawei.hms.scankit.p.Jc r0 = com.huawei.hms.scankit.p.Jc.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            com.huawei.hms.scankit.p.Va r0 = com.huawei.hms.scankit.p.Va.FNC1_FIRST_POSITION
            a(r0, r5)
        L5d:
            a(r4, r5)
            com.huawei.hms.scankit.p.x r0 = new com.huawei.hms.scankit.p.x
            r0.<init>()
            a(r7, r4, r0, r3)
            if (r9 == 0) goto L97
            com.huawei.hms.scankit.p.Jc r1 = com.huawei.hms.scankit.p.Jc.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L97
            java.lang.Object r9 = r9.get(r1)     // Catch: java.lang.Exception -> L95
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L95
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L95
            com.huawei.hms.scankit.p.Ya r9 = com.huawei.hms.scankit.p.Ya.c(r9)     // Catch: java.lang.Exception -> L95
            int r1 = a(r4, r5, r0, r9)
            boolean r1 = a(r1, r9, r8)
            if (r1 == 0) goto L8d
            goto L9b
        L8d:
            com.huawei.hms.hmsscankit.WriterException r7 = new com.huawei.hms.hmsscankit.WriterException
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>(r8)
            throw r7
        L95:
            r7 = move-exception
            throw r7
        L97:
            com.huawei.hms.scankit.p.Ya r9 = a(r8, r4, r5, r0)
        L9b:
            com.huawei.hms.scankit.p.x r1 = new com.huawei.hms.scankit.p.x
            r1.<init>()
            r1.a(r5)
            if (r4 != r6) goto Laa
            int r7 = r0.e()
            goto Lae
        Laa:
            int r7 = r7.length()
        Lae:
            a(r7, r9, r4, r1)
            r1.a(r0)
            com.huawei.hms.scankit.p.Ya$b r7 = r9.a(r8)
            int r0 = r9.d()
            int r2 = r7.d()
            int r0 = r0 - r2
            a(r0, r1)
            int r2 = r9.d()
            int r7 = r7.c()
            com.huawei.hms.scankit.p.x r7 = a(r1, r2, r0, r7)
            com.huawei.hms.scankit.p.Oc r0 = new com.huawei.hms.scankit.p.Oc
            r0.<init>()
            r0.a(r8)
            r0.a(r4)
            r0.a(r9)
            int r1 = r9.c()
            com.huawei.hms.scankit.p.Ic r2 = new com.huawei.hms.scankit.p.Ic
            r2.<init>(r1, r1)
            int r1 = a(r7, r8, r9, r2)
            r0.b(r1)
            com.huawei.hms.scankit.p.Nc.a(r7, r8, r9, r1, r2)
            r0.a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Lc.a(java.lang.String, com.huawei.hms.scankit.p.Pa, java.util.Map):com.huawei.hms.scankit.p.Oc");
    }

    private static Va a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && a(str)) {
            return Va.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else if (a(charAt) == -1) {
                return Va.BYTE;
            } else {
                z10 = true;
            }
        }
        return z10 ? Va.ALPHANUMERIC : z11 ? Va.NUMERIC : Va.BYTE;
    }

    private static Ya a(int i10, Pa pa2) {
        for (int i11 = 1; i11 <= 40; i11++) {
            Ya c10 = Ya.c(i11);
            if (a(i10, c10, pa2)) {
                return c10;
            }
        }
        throw new WriterException("Data too big");
    }

    private static Ya a(Pa pa2, Va va2, C0732x c0732x, C0732x c0732x2) {
        return a(a(va2, c0732x, c0732x2, a(a(va2, c0732x, c0732x2, Ya.c(1)), pa2)), pa2);
    }

    public static C0732x a(C0732x c0732x, int i10, int i11, int i12) {
        if (c0732x.e() == i11) {
            ArrayList arrayList = new ArrayList(i12);
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                a(i10, i11, i12, i16, iArr, iArr2);
                int i17 = iArr[0];
                byte[] bArr = new byte[i17];
                c0732x.a(i13 * 8, bArr, 0, i17);
                byte[] a10 = a(bArr, iArr2[0]);
                arrayList.add(new Hc(bArr, a10));
                i15 = Math.max(i15, i17);
                i14 = Math.max(i14, a10.length);
                i13 += iArr[0];
            }
            if (i11 == i13) {
                C0732x c0732x2 = new C0732x();
                for (int i18 = 0; i18 < i15; i18++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] a11 = ((Hc) it.next()).a();
                        if (i18 < a11.length) {
                            c0732x2.a(a11[i18], 8);
                        }
                    }
                }
                for (int i19 = 0; i19 < i14; i19++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] b10 = ((Hc) it2.next()).b();
                        if (i19 < b10.length) {
                            c0732x2.a(b10[i19], 8);
                        }
                    }
                }
                if (i10 == c0732x2.e()) {
                    return c0732x2;
                }
                StringBuilder a12 = e2.a("Interleaving error: ", i10, " and ");
                a12.append(c0732x2.e());
                a12.append(" differ.");
                throw new WriterException(a12.toString());
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    public static void a(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 >= i12) {
            throw new WriterException("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i10 != ((i19 + i21) * i14) + ((i18 + i20) * i15)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
            return;
        }
        iArr[0] = i19;
        iArr2[0] = i21;
    }

    public static void a(int i10, Ya ya2, Va va2, C0732x c0732x) {
        int a10 = va2.a(ya2);
        int i11 = 1 << a10;
        if (i10 < i11) {
            c0732x.a(i10, a10);
            return;
        }
        throw new WriterException(i10 + " is bigger than " + (i11 - 1));
    }

    private static void a(EnumC0630c enumC0630c, C0732x c0732x) {
        c0732x.a(Va.ECI.a(), 4);
        c0732x.a(enumC0630c.a(), 8);
    }

    public static void a(Va va2, C0732x c0732x) {
        c0732x.a(va2.a(), 4);
    }

    public static void a(CharSequence charSequence, C0732x c0732x) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int a10 = a(charSequence.charAt(i10));
            if (a10 == -1) {
                throw new WriterException();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int a11 = a(charSequence.charAt(i11));
                if (a11 == -1) {
                    throw new WriterException();
                }
                c0732x.a((a10 * 45) + a11, 11);
                i10 += 2;
            } else {
                c0732x.a(a10, 6);
                i10 = i11;
            }
        }
    }

    public static void a(String str, Va va2, C0732x c0732x, String str2) {
        int i10 = Kc.f7580a[va2.ordinal()];
        if (i10 == 1) {
            b(str, c0732x);
        } else if (i10 == 2) {
            a((CharSequence) str, c0732x);
        } else if (i10 == 3) {
            a(str, c0732x, str2);
        } else if (i10 == 4) {
            a(str, c0732x);
        } else {
            throw new WriterException("Invalid mode: " + va2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0035 A[LOOP:0: B:34:0x0008->B:47:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.lang.String r6, com.huawei.hms.scankit.p.C0732x r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = -1
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.a(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            com.huawei.hms.hmsscankit.WriterException r6 = new com.huawei.hms.hmsscankit.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            com.huawei.hms.hmsscankit.WriterException r7 = new com.huawei.hms.hmsscankit.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Lc.a(java.lang.String, com.huawei.hms.scankit.p.x):void");
    }

    public static void a(String str, C0732x c0732x, String str2) {
        try {
            for (byte b10 : str.getBytes(str2)) {
                c0732x.a(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new WriterException(e10);
        }
    }

    private static boolean a(int i10, Ya ya2, Pa pa2) {
        return ya2.d() - ya2.a(pa2).d() >= (i10 + 7) / 8;
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = bytes[i10] & 255;
                if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    public static byte[] a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new com.huawei.hms.scankit.aiscan.common.v(com.huawei.hms.scankit.aiscan.common.h.f7245e).a(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    public static void b(CharSequence charSequence, C0732x c0732x) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                c0732x.a(((charSequence.charAt(i10 + 1) - '0') * 10) + (charAt * 100) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    c0732x.a((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    c0732x.a(charAt, 4);
                }
            }
        }
    }

    public static void a(int i10, C0732x c0732x) {
        int i11 = i10 * 8;
        if (c0732x.d() > i11) {
            StringBuilder a10 = android.support.v4.media.d.a("data bits cannot fit in the QR Code");
            a10.append(c0732x.d());
            a10.append(" > ");
            a10.append(i11);
            throw new WriterException(a10.toString());
        }
        for (int i12 = 0; i12 < 4 && c0732x.d() < i11; i12++) {
            c0732x.a(false);
        }
        int d10 = c0732x.d() & 7;
        if (d10 > 0) {
            while (d10 < 8) {
                c0732x.a(false);
                d10++;
            }
        }
        int e10 = i10 - c0732x.e();
        for (int i13 = 0; i13 < e10; i13++) {
            c0732x.a((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (c0732x.d() != i11) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }
}
