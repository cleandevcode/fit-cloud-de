package com.huawei.hms.scankit.p;

import androidx.appcompat.widget.u0;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.EnumC0630c;
import com.mob.commons.ForbThrowable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Fc {

    /* renamed from: c */
    private static final byte[] f7510c;

    /* renamed from: a */
    private static final byte[] f7508a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f7509b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d */
    private static final byte[] f7511d = new byte[128];

    /* renamed from: e */
    private static final Charset f7512e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f7510c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f7508a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f7510c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f7511d, (byte) -1);
        while (true) {
            byte[] bArr3 = f7509b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f7511d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    private static int a(CharSequence charSequence, int i10) {
        return C0672hc.a(charSequence, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x009d, code lost:
        if (r10 == ' ') goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Fc.a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0029, code lost:
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L9:
            if (r1 >= r0) goto L5b
            char r2 = r5.charAt(r1)
            r3 = 0
        L10:
            r4 = 13
            if (r3 >= r4) goto L26
            boolean r2 = c(r2)
            if (r2 == 0) goto L26
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 < r0) goto L21
            goto L26
        L21:
            char r2 = r5.charAt(r2)
            goto L10
        L26:
            if (r3 < r4) goto L2a
            int r1 = r1 - r6
            return r1
        L2a:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L37
            int r1 = r1 + 1
            goto L9
        L37:
            com.huawei.hms.hmsscankit.WriterException r5 = new com.huawei.hms.hmsscankit.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Non-encodable character detected: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L5b:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Fc.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    public static String a(String str, Ac ac2, Charset charset) {
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f7512e;
        } else if (f7512e.equals(charset)) {
            com.huawei.hms.scankit.util.a.a("PDF417", "else");
        } else {
            EnumC0630c a10 = EnumC0630c.a(charset.name());
            if (a10 != null) {
                a(a10.a(), sb2);
            }
        }
        int length = str.length();
        int i10 = Ec.f7500a[ac2.ordinal()];
        if (i10 == 1) {
            a(str, 0, length, sb2, 0);
        } else if (i10 == 2) {
            byte[] bytes = str.getBytes(charset);
            a(bytes, 0, bytes.length, 1, sb2);
        } else if (i10 != 3) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                int i13 = 0;
                while (i11 < length) {
                    int a11 = a(str, i11);
                    if (a11 >= 13) {
                        sb2.append((char) 902);
                        a(str, i11, a11, sb2);
                        i11 += a11;
                        i12 = 2;
                    } else {
                        int b10 = b(str, i11);
                        if (b10 >= 5 || a11 == length) {
                            if (i12 != 0) {
                                sb2.append((char) 900);
                                i12 = 0;
                                i13 = 0;
                            }
                            i13 = a(str, i11, b10, sb2, i13);
                            i11 += b10;
                        } else {
                            int a12 = a(str, i11, charset);
                            if (a12 == 0) {
                                a12 = 1;
                            }
                            int i14 = a12 + i11;
                            byte[] bytes2 = str.substring(i11, i14).getBytes(charset);
                            if (bytes2.length == 1 && i12 == 0) {
                                a(bytes2, 0, 1, 0, sb2);
                                i11 = i14;
                            } else {
                                a(bytes2, 0, bytes2.length, i12, sb2);
                                i11 = i14;
                                i12 = 1;
                            }
                        }
                    }
                }
                break loop0;
            }
        } else {
            sb2.append((char) 902);
            a(str, 0, length, sb2);
        }
        return sb2.toString();
    }

    private static void a(int i10, StringBuilder sb2) {
        char c10;
        if (i10 >= 0 && i10 < 900) {
            sb2.append((char) 927);
        } else if (i10 < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i10 / ForbThrowable.CODE_NO_GMS) - 1));
            i10 %= ForbThrowable.CODE_NO_GMS;
        } else if (i10 < 811800) {
            sb2.append((char) 925);
            c10 = (char) (810900 - i10);
            sb2.append(c10);
        } else {
            throw new WriterException(u0.a("ECI number not in valid range from 0..811799, but was ", i10));
        }
        c10 = (char) i10;
        sb2.append(c10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[LOOP:2: B:28:0x0062->B:30:0x0066, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(java.lang.String r9, int r10, int r11, java.lang.StringBuilder r12) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r11 / 3
            int r1 = r1 + 1
            r0.<init>(r1)
            r1 = 900(0x384, double:4.447E-321)
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            r2 = 0
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r2)
            r3 = 0
            r4 = 0
        L17:
            if (r4 >= r11) goto L70
            r0.setLength(r3)
            int r5 = r11 - r4
            r6 = 44
            int r5 = java.lang.Math.min(r6, r5)
            int r6 = r9.length()
            if (r6 <= 0) goto L5e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 49
            r6.append(r7)
            int r7 = r10 + r4
            int r8 = r7 + r5
            java.lang.String r7 = r9.substring(r7, r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r6)
        L48:
            java.math.BigInteger r6 = r7.mod(r1)
            int r6 = r6.intValue()
            char r6 = (char) r6
            r0.append(r6)
            java.math.BigInteger r7 = r7.divide(r1)
            boolean r6 = r7.equals(r2)
            if (r6 == 0) goto L48
        L5e:
            int r6 = r0.length()
        L62:
            int r6 = r6 + (-1)
            if (r6 < 0) goto L6e
            char r7 = r0.charAt(r6)
            r12.append(r7)
            goto L62
        L6e:
            int r4 = r4 + r5
            goto L17
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Fc.a(java.lang.String, int, int, java.lang.StringBuilder):void");
    }

    private static void a(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
        int i13;
        sb2.append((i11 == 1 && i12 == 0) ? (char) 913 : i11 % 6 == 0 ? (char) 924 : (char) 901);
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + (bArr[i13 + i14] & 255);
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    private static boolean a(char c10) {
        return c10 == ' ' || (c10 >= 'a' && c10 <= 'z');
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0027, code lost:
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int b(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = r7
        L5:
            if (r1 >= r0) goto L39
            char r2 = r6.charAt(r1)
            r3 = 0
        Lc:
            r4 = 13
            if (r3 >= r4) goto L23
            boolean r5 = c(r2)
            if (r5 == 0) goto L23
            if (r1 >= r0) goto L23
            int r3 = r3 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Lc
            char r2 = r6.charAt(r1)
            goto Lc
        L23:
            if (r3 < r4) goto L28
            int r1 = r1 - r7
            int r1 = r1 - r3
            return r1
        L28:
            if (r3 <= 0) goto L2b
            goto L5
        L2b:
            char r2 = r6.charAt(r1)
            boolean r2 = f(r2)
            if (r2 != 0) goto L36
            goto L39
        L36:
            int r1 = r1 + 1
            goto L5
        L39:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Fc.b(java.lang.CharSequence, int):int");
    }

    private static boolean b(char c10) {
        return c10 == ' ' || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean c(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    private static boolean d(char c10) {
        try {
            byte[] bArr = f7510c;
            if (com.huawei.hms.scankit.util.b.a(bArr, (int) c10)) {
                return bArr[c10] != -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    private static boolean e(char c10) {
        try {
            if (com.huawei.hms.scankit.util.b.a(f7510c, (int) c10)) {
                return f7511d[c10] != -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        }
    }

    private static boolean f(char c10) {
        return c10 == '\t' || c10 == '\n' || c10 == '\r' || (c10 >= ' ' && c10 <= '~');
    }
}
