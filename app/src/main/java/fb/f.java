package fb;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c */
    public static final byte[] f14225c;

    /* renamed from: a */
    public static final byte[] f14223a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    public static final byte[] f14224b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d */
    public static final byte[] f14226d = new byte[128];

    /* renamed from: e */
    public static final Charset f14227e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f14225c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f14223a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f14225c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f14226d, (byte) -1);
        while (true) {
            byte[] bArr3 = f14224b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f14226d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    public static void a(byte[] bArr, int i10, int i11, StringBuilder sb2) {
        int i12;
        sb2.append((i10 == 1 && i11 == 0) ? (char) 913 : i10 % 6 == 0 ? (char) 924 : (char) 901);
        if (i10 >= 6) {
            char[] cArr = new char[5];
            i12 = 0;
            while ((0 + i10) - i12 >= 6) {
                long j10 = 0;
                for (int i13 = 0; i13 < 6; i13++) {
                    j10 = (j10 << 8) + (bArr[i12 + i13] & 255);
                }
                for (int i14 = 0; i14 < 5; i14++) {
                    cArr[i14] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i15 = 4; i15 >= 0; i15--) {
                    sb2.append(cArr[i15]);
                }
                i12 += 6;
            }
        } else {
            i12 = 0;
        }
        while (i12 < 0 + i10) {
            sb2.append((char) (bArr[i12] & 255));
            i12++;
        }
    }

    public static void b(String str, int i10, int i11, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb4.append(str.substring(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            int length = sb3.length();
            while (true) {
                length--;
                if (length >= 0) {
                    sb2.append(sb3.charAt(length));
                }
            }
            i12 += min;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x00ab, code lost:
        if (r10 == ' ') goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.f.c(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    public static boolean d(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    public static boolean e(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }
}
