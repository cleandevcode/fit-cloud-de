package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C0628a;
import com.huawei.hms.scankit.aiscan.common.C0632e;
import com.huawei.hms.scankit.aiscan.common.EnumC0630c;
import com.huawei.hms.scankit.aiscan.common.EnumC0631d;
import com.mob.commons.ForbThrowable;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.huawei.hms.scankit.p.ka */
/* loaded from: classes.dex */
final class C0682ka {

    /* renamed from: a */
    private static final char[] f7977a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f7978b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final BigInteger[] f7979c;

    /* renamed from: com.huawei.hms.scankit.p.ka$a */
    /* loaded from: classes.dex */
    public enum a {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f7979c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f7979c;
            if (i10 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
            i10++;
        }
    }

    private static int a(int i10, int[] iArr, Charset charset, int i11, StringBuilder sb2) {
        int a10;
        int i12;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i13 = 0;
        long j10 = 0;
        boolean z10 = false;
        if (i10 == 901) {
            int[] iArr2 = new int[6];
            int i14 = i11 + 1;
            int i15 = iArr[i11];
            while (true) {
                i12 = iArr[0];
                if (i14 < i12 && !z10) {
                    int i16 = i13 + 1;
                    iArr2[i13] = i15;
                    j10 = (j10 * 900) + i15;
                    int i17 = i14 + 1;
                    i15 = iArr[i14];
                    if (i15 != 928) {
                        switch (i15) {
                            case ForbThrowable.CODE_NO_GMS /* 900 */:
                            case 901:
                            case 902:
                                break;
                            default:
                                switch (i15) {
                                    case 922:
                                    case 923:
                                    case 924:
                                        break;
                                    default:
                                        if (i16 % 5 != 0 || i16 <= 0) {
                                            i14 = i17;
                                            break;
                                        } else {
                                            for (int i18 = 0; i18 < 6; i18++) {
                                                byteArrayOutputStream.write((byte) (j10 >> ((5 - i18) * 8)));
                                            }
                                            j10 = 0;
                                            i14 = i17;
                                            i13 = 0;
                                            continue;
                                            continue;
                                        }
                                        break;
                                }
                        }
                        i13 = i16;
                    }
                    i14 = i17 - 1;
                    z10 = true;
                    i13 = i16;
                }
            }
            if (i14 == i12 && i15 < 900) {
                iArr2[i13] = i15;
                i13++;
            }
            for (int i19 = 0; i19 < i13; i19++) {
                byteArrayOutputStream.write((byte) iArr2[i19]);
            }
            a10 = i14;
        } else {
            a10 = i10 == 924 ? a(i11, iArr, false, 0, 0L, byteArrayOutputStream) : i11;
        }
        sb2.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return a10;
    }

    private static int a(int i10, int[] iArr, boolean z10, int i11, long j10, ByteArrayOutputStream byteArrayOutputStream) {
        while (i10 < iArr[0] && !z10) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i13 < 900) {
                i11++;
                j10 = (j10 * 900) + i13;
                i10 = i12;
            } else {
                if (i13 != 928) {
                    switch (i13) {
                        case ForbThrowable.CODE_NO_GMS /* 900 */:
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i13) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                                default:
                                    throw C0628a.a();
                            }
                    }
                }
                i10 = i12 - 1;
                z10 = true;
            }
            if (i11 % 5 == 0 && i11 > 0) {
                for (int i14 = 0; i14 < 6; i14++) {
                    byteArrayOutputStream.write((byte) (j10 >> ((5 - i14) * 8)));
                }
                j10 = 0;
                i11 = 0;
            }
        }
        return i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    private static int a(java.lang.StringBuilder r1, int r2, int[] r3, int r4, java.nio.charset.Charset r5, com.huawei.hms.scankit.p.C0729wa r6) {
        /*
            r0 = 913(0x391, float:1.28E-42)
            if (r2 == r0) goto L30
            r0 = 928(0x3a0, float:1.3E-42)
            if (r2 == r0) goto L2b
            switch(r2) {
                case 900: goto L16;
                case 901: goto L21;
                case 902: goto L11;
                default: goto Lb;
            }
        Lb:
            switch(r2) {
                case 922: goto L26;
                case 923: goto L26;
                case 924: goto L21;
                case 925: goto L1e;
                case 926: goto L1b;
                default: goto Le;
            }
        Le:
            int r4 = r4 + (-1)
            goto L16
        L11:
            int r1 = a(r3, r4, r1)
            goto L39
        L16:
            int r1 = b(r3, r4, r1)
            goto L39
        L1b:
            int r1 = r4 + 2
            goto L39
        L1e:
            int r1 = r4 + 1
            goto L39
        L21:
            int r1 = a(r2, r3, r5, r4, r1)
            goto L39
        L26:
            com.huawei.hms.scankit.aiscan.common.a r1 = com.huawei.hms.scankit.aiscan.common.C0628a.a()
            throw r1
        L2b:
            int r1 = a(r3, r4, r6)
            goto L39
        L30:
            int r2 = r4 + 1
            r3 = r3[r4]
            char r3 = (char) r3
            r1.append(r3)
            r1 = r2
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C0682ka.a(java.lang.StringBuilder, int, int[], int, java.nio.charset.Charset, com.huawei.hms.scankit.p.wa):int");
    }

    public static int a(int[] iArr, int i10, C0729wa c0729wa) {
        int i11 = 0;
        if (i10 + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            while (i11 < 2) {
                iArr2[i11] = iArr[i10];
                i11++;
                i10++;
            }
            try {
                c0729wa.c(Integer.parseInt(a(iArr2, 2)));
                StringBuilder sb2 = new StringBuilder();
                int b10 = b(iArr, i10, sb2);
                c0729wa.b(sb2.toString());
                int i12 = iArr[b10] == 923 ? b10 + 1 : -1;
                a(b10, iArr, c0729wa);
                if (i12 != -1) {
                    int i13 = b10 - i12;
                    if (c0729wa.a()) {
                        i13--;
                    }
                    c0729wa.a(Arrays.copyOfRange(iArr, i12, i13 + i12));
                }
                return b10;
            } catch (Exception unused) {
                throw C0628a.a();
            }
        }
        throw C0628a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0049, code lost:
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(int[] r7, int r8, java.lang.StringBuilder r9) {
        /*
            r0 = 15
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            r4 = r7[r1]
            if (r8 >= r4) goto L49
            if (r2 != 0) goto L49
            int r5 = r8 + 1
            r8 = r7[r8]
            r6 = 1
            if (r5 != r4) goto L15
            r2 = 1
        L15:
            r4 = 900(0x384, float:1.261E-42)
            if (r8 >= r4) goto L1e
            r0[r3] = r8
            int r3 = r3 + 1
            goto L33
        L1e:
            if (r8 == r4) goto L30
            r2 = 901(0x385, float:1.263E-42)
            if (r8 == r2) goto L30
            r2 = 928(0x3a0, float:1.3E-42)
            if (r8 == r2) goto L30
            switch(r8) {
                case 922: goto L30;
                case 923: goto L30;
                case 924: goto L30;
                default: goto L2b;
            }
        L2b:
            com.huawei.hms.scankit.aiscan.common.a r7 = com.huawei.hms.scankit.aiscan.common.C0628a.a()
            throw r7
        L30:
            int r5 = r5 + (-1)
            r2 = 1
        L33:
            int r4 = r3 % 15
            if (r4 == 0) goto L3d
            r4 = 902(0x386, float:1.264E-42)
            if (r8 == r4) goto L3d
            if (r2 == 0) goto L47
        L3d:
            if (r3 <= 0) goto L47
            java.lang.String r8 = a(r0, r3)
            r9.append(r8)
            r3 = 0
        L47:
            r8 = r5
            goto L7
        L49:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C0682ka.a(int[], int, java.lang.StringBuilder):int");
    }

    public static C0632e a(int[] iArr, String str, Map<EnumC0631d, ?> map) {
        int i10;
        C0632e c0632e;
        int a10;
        StringBuilder sb2 = new StringBuilder(iArr.length * 2);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i11 = iArr[1];
        C0729wa c0729wa = new C0729wa();
        Charset charset2 = charset;
        int i12 = i11;
        int i13 = 2;
        while (true) {
            int i14 = iArr[0];
            if (i13 > i14 || (i13 == i14 && sb2.length() > 0)) {
                break;
            }
            if (i12 == 927) {
                a10 = i13 + 1;
                charset2 = Charset.forName(EnumC0630c.a(iArr[i13]).name());
            } else {
                a10 = a(sb2, i12, iArr, i13, charset2, c0729wa);
            }
            if (a10 >= iArr.length) {
                throw C0628a.a();
            }
            i13 = a10 + 1;
            i12 = iArr[a10];
        }
        if (sb2.length() != 0) {
            if (charset2 == StandardCharsets.ISO_8859_1) {
                int length = sb2.length();
                byte[] bArr = new byte[length];
                for (i10 = 0; i10 < length; i10++) {
                    bArr[i10] = (byte) sb2.charAt(i10);
                }
                try {
                    c0632e = new C0632e(null, new String(bArr, com.huawei.hms.scankit.aiscan.common.B.a(bArr, map)), null, str);
                } catch (UnsupportedEncodingException unused) {
                    throw C0628a.a();
                }
            } else {
                c0632e = new C0632e(null, sb2.toString(), null, str);
            }
            c0632e.a(c0729wa);
            return c0632e;
        }
        throw C0628a.a();
    }

    private static String a(int[] iArr, int i10) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(f7979c[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C0628a.a();
    }

    private static void a(int i10, int[] iArr, C0729wa c0729wa) {
        while (i10 < iArr[0]) {
            int i11 = iArr[i10];
            if (i11 == 923) {
                int i12 = i10 + 1;
                int i13 = iArr[i12];
                if (i13 == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    i10 = b(iArr, i12 + 1, sb2);
                    c0729wa.c(sb2.toString());
                } else if (i13 == 3) {
                    StringBuilder sb3 = new StringBuilder();
                    i10 = b(iArr, i12 + 1, sb3);
                    c0729wa.d(sb3.toString());
                } else if (i13 == 4) {
                    StringBuilder sb4 = new StringBuilder();
                    i10 = b(iArr, i12 + 1, sb4);
                    c0729wa.a(sb4.toString());
                } else if (i13 == 1) {
                    StringBuilder sb5 = new StringBuilder();
                    i10 = a(iArr, i12 + 1, sb5);
                    c0729wa.b(Integer.parseInt(sb5.toString()));
                } else if (i13 == 2) {
                    StringBuilder sb6 = new StringBuilder();
                    i10 = a(iArr, i12 + 1, sb6);
                    c0729wa.b(Long.parseLong(sb6.toString()));
                } else if (i13 == 6) {
                    StringBuilder sb7 = new StringBuilder();
                    i10 = a(iArr, i12 + 1, sb7);
                    c0729wa.a(Integer.parseInt(sb7.toString()));
                } else if (i13 != 5) {
                    throw C0628a.a();
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    i10 = a(iArr, i12 + 1, sb8);
                    c0729wa.a(Long.parseLong(sb8.toString()));
                }
            } else if (i11 != 922) {
                throw C0628a.a();
            } else {
                i10++;
                c0729wa.a(true);
            }
        }
    }

    private static void a(int[] iArr, int[] iArr2, int i10, StringBuilder sb2) {
        a aVar = a.ALPHA;
        a aVar2 = aVar;
        int i11 = 0;
        while (i11 < i10) {
            int[] iArr3 = {i11, iArr[i11], 0};
            a[] aVarArr = {aVar, aVar2};
            switch (C0678ja.f7970a[aVar.ordinal()]) {
                case 1:
                    aVarArr = a(sb2, iArr2, aVar, aVar2, iArr3);
                    break;
                case 2:
                    aVarArr = c(sb2, iArr2, aVar, aVar2, iArr3);
                    break;
                case 3:
                    aVarArr = d(sb2, iArr2, aVar, aVar2, iArr3);
                    break;
                case 4:
                    aVarArr = e(sb2, iArr2, aVar, aVar2, iArr3);
                    break;
                case 5:
                    aVarArr = b(sb2, iArr2, aVar, aVar2, iArr3);
                    break;
                case 6:
                    aVarArr = f(sb2, iArr2, aVar, aVar2, iArr3);
                    break;
            }
            aVar = aVarArr[0];
            aVar2 = aVarArr[1];
            int i12 = iArr3[0];
            char c10 = (char) iArr3[2];
            if (c10 != 0) {
                sb2.append(c10);
            }
            i11 = 1 + i12;
        }
    }

    private static boolean a(int i10) {
        return i10 == 901 || i10 == 924 || i10 == 902 || i10 == 928 || i10 == 923 || i10 == 922;
    }

    private static a[] a(StringBuilder sb2, int[] iArr, a aVar, a aVar2, int[] iArr2) {
        int i10 = iArr2[1];
        if (i10 < 26) {
            iArr2[2] = (char) (i10 + 65);
        } else if (i10 == 900) {
            aVar = a.ALPHA;
        } else if (i10 != 913) {
            switch (i10) {
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    aVar = a.LOWER;
                    break;
                case 28:
                    aVar = a.MIXED;
                    break;
                case 29:
                    aVar2 = aVar;
                    aVar = a.PUNCT_SHIFT;
                    break;
                default:
                    throw C0628a.a();
            }
        } else {
            sb2.append((char) iArr[iArr2[0]]);
        }
        return new a[]{aVar, aVar2};
    }

    private static int b(int[] iArr, int i10, StringBuilder sb2) {
        int i11 = iArr[0];
        int[] iArr2 = new int[(i11 - i10) * 2];
        int[] iArr3 = new int[(i11 - i10) * 2];
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iArr[0] && !z10) {
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i14 < 900) {
                iArr2[i12] = i14 / 30;
                iArr2[i12 + 1] = i14 % 30;
                i12 += 2;
            } else if (i14 == 900) {
                iArr2[i12] = 900;
                i12++;
            } else if (i14 == 913) {
                iArr2[i12] = 913;
                i10 = i13 + 1;
                iArr3[i12] = iArr[i13];
                i12++;
            } else if (!a(i14)) {
                throw C0628a.a();
            } else {
                i10 = i13 - 1;
                z10 = true;
            }
            i10 = i13;
        }
        a(iArr2, iArr3, i12, sb2);
        return i10;
    }

    private static a[] b(StringBuilder sb2, int[] iArr, a aVar, a aVar2, int[] iArr2) {
        a aVar3;
        int i10 = iArr2[1];
        if (i10 < 26) {
            iArr2[2] = (char) (i10 + 65);
        } else if (i10 != 26) {
            if (i10 == 900) {
                aVar3 = a.ALPHA;
                return new a[]{aVar3, aVar2};
            }
            throw C0628a.a();
        } else {
            iArr2[2] = 32;
        }
        aVar3 = aVar2;
        return new a[]{aVar3, aVar2};
    }

    private static a[] c(StringBuilder sb2, int[] iArr, a aVar, a aVar2, int[] iArr2) {
        a aVar3;
        int i10 = iArr2[1];
        if (i10 < 26) {
            iArr2[2] = (char) (i10 + 97);
        } else if (i10 == 900) {
            aVar = a.ALPHA;
        } else if (i10 != 913) {
            switch (i10) {
                case 26:
                    iArr2[2] = 32;
                    break;
                case 27:
                    aVar3 = a.ALPHA_SHIFT;
                    aVar2 = aVar;
                    aVar = aVar3;
                    break;
                case 28:
                    aVar = a.MIXED;
                    break;
                case 29:
                    aVar3 = a.PUNCT_SHIFT;
                    aVar2 = aVar;
                    aVar = aVar3;
                    break;
                default:
                    throw C0628a.a();
            }
        } else {
            sb2.append((char) iArr[iArr2[0]]);
        }
        return new a[]{aVar, aVar2};
    }

    private static a[] d(StringBuilder sb2, int[] iArr, a aVar, a aVar2, int[] iArr2) {
        int i10 = iArr2[1];
        if (i10 < 25) {
            iArr2[2] = f7978b[i10];
        } else {
            if (i10 != 900) {
                if (i10 != 913) {
                    switch (i10) {
                        case 25:
                            aVar = a.PUNCT;
                            break;
                        case 26:
                            iArr2[2] = 32;
                            break;
                        case 27:
                            aVar = a.LOWER;
                            break;
                        case 28:
                            break;
                        case 29:
                            aVar2 = aVar;
                            aVar = a.PUNCT_SHIFT;
                            break;
                        default:
                            throw C0628a.a();
                    }
                } else {
                    sb2.append((char) iArr[iArr2[0]]);
                }
            }
            aVar = a.ALPHA;
        }
        return new a[]{aVar, aVar2};
    }

    private static a[] e(StringBuilder sb2, int[] iArr, a aVar, a aVar2, int[] iArr2) {
        int i10 = iArr2[1];
        if (i10 < 29) {
            iArr2[2] = f7977a[i10];
        } else if (i10 == 29 || i10 == 900) {
            aVar = a.ALPHA;
        } else if (i10 != 913) {
            throw C0628a.a();
        } else {
            sb2.append((char) iArr[iArr2[0]]);
        }
        return new a[]{aVar, aVar2};
    }

    private static a[] f(StringBuilder sb2, int[] iArr, a aVar, a aVar2, int[] iArr2) {
        a aVar3;
        int i10 = iArr2[1];
        if (i10 < 29) {
            iArr2[2] = f7977a[i10];
        } else if (i10 == 29 || i10 == 900) {
            aVar3 = a.ALPHA;
            return new a[]{aVar3, aVar2};
        } else if (i10 != 913) {
            throw C0628a.a();
        } else {
            sb2.append((char) iArr[iArr2[0]]);
        }
        aVar3 = aVar2;
        return new a[]{aVar3, aVar2};
    }
}
