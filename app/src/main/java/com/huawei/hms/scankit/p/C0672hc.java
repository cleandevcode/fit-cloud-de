package com.huawei.hms.scankit.p;

import java.util.Arrays;

/* renamed from: com.huawei.hms.scankit.p.hc */
/* loaded from: classes.dex */
public final class C0672hc {
    private static char a(char c10, int i10) {
        int i11 = ((i10 * 149) % 253) + 1 + c10;
        if (i11 > 254) {
            i11 -= 254;
        }
        return (char) i11;
    }

    public static int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            loop0: while (true) {
                char charAt = charSequence.charAt(i10);
                while (b(charAt) && i10 < length) {
                    i11++;
                    i10++;
                    if (i10 < length) {
                        break;
                    }
                }
            }
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x01c9, code lost:
        r1 = (r20 + r5) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x01cf, code lost:
        if (r1 >= r19.length()) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x01d1, code lost:
        r2 = r19.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01d9, code lost:
        if (i(r2) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x01db, code lost:
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x01e0, code lost:
        if (g(r2) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x01e3, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x01e6, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C0672hc.a(java.lang.CharSequence, int, int):int");
    }

    private static int a(byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 += bArr[i11];
        }
        return i10;
    }

    private static int a(float[] fArr, int[] iArr, int i10, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i11 = 0; i11 < 6; i11++) {
            int ceil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = ceil;
            if (i10 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = ceil;
            }
            if (i10 == ceil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bc A[LOOP:1: B:73:0x00b6->B:75:0x00bc, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r8, com.huawei.hms.scankit.p.EnumC0680jc r9, com.huawei.hms.scankit.p.Mb r10, com.huawei.hms.scankit.p.Mb r11) {
        /*
            r0 = 6
            com.huawei.hms.scankit.p.ec[] r1 = new com.huawei.hms.scankit.p.InterfaceC0660ec[r0]
            com.huawei.hms.scankit.p.Zb r2 = new com.huawei.hms.scankit.p.Zb
            r2.<init>()
            r3 = 0
            r1[r3] = r2
            com.huawei.hms.scankit.p.ac r2 = new com.huawei.hms.scankit.p.ac
            r2.<init>()
            r4 = 1
            r1[r4] = r2
            com.huawei.hms.scankit.p.kc r2 = new com.huawei.hms.scankit.p.kc
            r2.<init>()
            r5 = 2
            r1[r5] = r2
            com.huawei.hms.scankit.p.lc r2 = new com.huawei.hms.scankit.p.lc
            r2.<init>()
            r6 = 3
            r1[r6] = r2
            com.huawei.hms.scankit.p.dc r2 = new com.huawei.hms.scankit.p.dc
            r2.<init>()
            r6 = 4
            r1[r6] = r2
            com.huawei.hms.scankit.p._b r2 = new com.huawei.hms.scankit.p._b
            r2.<init>()
            r7 = 5
            r1[r7] = r2
            com.huawei.hms.scankit.p.fc r2 = new com.huawei.hms.scankit.p.fc
            r2.<init>(r8)
            r2.a(r9)
            r2.a(r10, r11)
            java.lang.String r9 = "[)>\u001e05\u001d"
            boolean r9 = r8.startsWith(r9)
            java.lang.String r10 = "\u001e\u0004"
            if (r9 == 0) goto L5d
            boolean r9 = r8.endsWith(r10)
            if (r9 == 0) goto L5d
            r8 = 236(0xec, float:3.31E-43)
        L50:
            r2.a(r8)
            r2.a(r5)
            int r8 = r2.f7895f
            int r8 = r8 + 7
            r2.f7895f = r8
            goto L6e
        L5d:
            java.lang.String r9 = "[)>\u001e06\u001d"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L6e
            boolean r8 = r8.endsWith(r10)
            if (r8 == 0) goto L6e
            r8 = 237(0xed, float:3.32E-43)
            goto L50
        L6e:
            boolean r8 = r2.h()
            if (r8 == 0) goto L8b
            if (r3 < 0) goto L7d
            if (r3 >= r0) goto L7d
            r8 = r1[r3]
            r8.a(r2)
        L7d:
            int r8 = r2.e()
            if (r8 < 0) goto L6e
            int r3 = r2.e()
            r2.i()
            goto L6e
        L8b:
            int r8 = r2.a()
            r2.k()
            com.huawei.hms.scankit.p.ic r9 = r2.g()
            int r9 = r9.a()
            if (r8 >= r9) goto La7
            if (r3 == 0) goto La7
            if (r3 == r7) goto La7
            if (r3 == r6) goto La7
            r8 = 254(0xfe, float:3.56E-43)
            r2.a(r8)
        La7:
            java.lang.StringBuilder r8 = r2.b()
            int r10 = r8.length()
            r11 = 129(0x81, float:1.81E-43)
            if (r10 >= r9) goto Lb6
            r8.append(r11)
        Lb6:
            int r10 = r8.length()
            if (r10 >= r9) goto Lc9
            int r10 = r8.length()
            int r10 = r10 + r4
            char r10 = a(r11, r10)
            r8.append(r10)
            goto Lb6
        Lc9:
            java.lang.StringBuilder r8 = r2.b()
            java.lang.String r8 = r8.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C0672hc.a(java.lang.String, com.huawei.hms.scankit.p.jc, com.huawei.hms.scankit.p.Mb, com.huawei.hms.scankit.p.Mb):java.lang.String");
    }

    public static void a(char c10) {
        String hexString;
        String str = "0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c10);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal character: ");
            sb2.append(c10);
            sb2.append(" (0x");
            sb2.append(str);
            sb2.append(')');
            throw new IllegalArgumentException(sb2.toString());
        } catch (Exception e10) {
            throw e10;
        }
    }

    public static boolean b(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    public static boolean c(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    private static boolean d(char c10) {
        return c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean e(char c10) {
        return c10 >= ' ' && c10 <= '^';
    }

    private static boolean f(char c10) {
        return c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'a' && c10 <= 'z');
    }

    private static boolean g(char c10) {
        return i(c10) || c10 == ' ' || (c10 >= '0' && c10 <= '9') || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean h(char c10) {
        return false;
    }

    private static boolean i(char c10) {
        return c10 == '\r' || c10 == '*' || c10 == '>';
    }
}
