package n4;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Properties;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public static final Properties f21967a = new Properties();

    /* renamed from: b */
    public static final char[] f21968b;

    /* renamed from: c */
    public static final boolean[] f21969c;

    /* renamed from: d */
    public static final boolean[] f21970d;

    /* renamed from: e */
    public static final byte[] f21971e;

    /* renamed from: f */
    public static final byte[] f21972f;

    /* renamed from: g */
    public static final boolean[] f21973g;

    /* renamed from: h */
    public static final boolean[] f21974h;

    /* renamed from: i */
    public static final char[] f21975i;

    /* renamed from: j */
    public static final char[] f21976j;

    /* renamed from: k */
    public static final char[] f21977k;

    /* renamed from: l */
    public static final char[] f21978l;

    /* renamed from: m */
    public static final char[] f21979m;

    /* renamed from: n */
    public static final int[] f21980n;

    /* renamed from: o */
    public static final char[] f21981o;

    /* renamed from: p */
    public static final int[] f21982p;

    static {
        boolean z10;
        boolean z11;
        Charset.forName("UTF-8");
        f21968b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        f21969c = new boolean[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];
        f21970d = new boolean[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];
        char c10 = 0;
        while (true) {
            boolean[] zArr = f21969c;
            if (c10 >= zArr.length) {
                break;
            }
            if (c10 >= 'A' && c10 <= 'Z') {
                zArr[c10] = true;
            } else if (c10 >= 'a' && c10 <= 'z') {
                zArr[c10] = true;
            } else if (c10 == '_' || c10 == '$') {
                zArr[c10] = true;
            }
            c10 = (char) (c10 + 1);
        }
        char c11 = 0;
        while (true) {
            boolean[] zArr2 = f21970d;
            if (c11 < zArr2.length) {
                if (c11 >= 'A' && c11 <= 'Z') {
                    zArr2[c11] = true;
                } else if (c11 >= 'a' && c11 <= 'z') {
                    zArr2[c11] = true;
                } else if (c11 == '_') {
                    zArr2[c11] = true;
                } else if (c11 >= '0' && c11 <= '9') {
                    zArr2[c11] = true;
                }
                c11 = (char) (c11 + 1);
            } else {
                try {
                    break;
                } catch (Throwable unused) {
                }
            }
        }
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new f());
        if (inputStream != null) {
            f21967a.load(inputStream);
            inputStream.close();
        }
        byte[] bArr = new byte[161];
        f21971e = bArr;
        byte[] bArr2 = new byte[161];
        f21972f = bArr2;
        f21973g = new boolean[161];
        f21974h = new boolean[161];
        f21975i = new char[93];
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i10 = 14; i10 <= 31; i10++) {
            f21971e[i10] = 4;
            f21972f[i10] = 4;
        }
        for (int i11 = 127; i11 < 160; i11++) {
            f21971e[i11] = 4;
            f21972f[i11] = 4;
        }
        for (int i12 = 0; i12 < 161; i12++) {
            boolean[] zArr3 = f21973g;
            if (f21971e[i12] != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr3[i12] = z10;
            boolean[] zArr4 = f21974h;
            if (f21972f[i12] != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            zArr4[i12] = z11;
        }
        char[] cArr = f21975i;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = '\"';
        cArr[39] = '\'';
        cArr[47] = '/';
        cArr[92] = '\\';
        f21976j = new char[]{'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
        f21977k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f21978l = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
        f21979m = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        f21980n = new int[]{9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f21981o = charArray;
        int[] iArr = new int[DfuBaseService.ERROR_REMOTE_TYPE_LEGACY];
        f21982p = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i13 = 0; i13 < length; i13++) {
            f21982p[f21981o[i13]] = i13;
        }
        f21982p[61] = 0;
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static byte[] b(String str) {
        int i10;
        int length = str.length();
        int i11 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i12 = length - 1;
        int i13 = 0;
        while (i13 < i12 && f21982p[str.charAt(i13) & 255] < 0) {
            i13++;
        }
        while (i12 > 0 && f21982p[str.charAt(i12) & 255] < 0) {
            i12--;
        }
        int i14 = str.charAt(i12) == '=' ? str.charAt(i12 + (-1)) == '=' ? 2 : 1 : 0;
        int i15 = (i12 - i13) + 1;
        if (length > 76) {
            i10 = (str.charAt(76) == '\r' ? i15 / 78 : 0) << 1;
        } else {
            i10 = 0;
        }
        int i16 = (((i15 - i10) * 6) >> 3) - i14;
        byte[] bArr = new byte[i16];
        int i17 = (i16 / 3) * 3;
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            int[] iArr = f21982p;
            int i20 = i13 + 1;
            int i21 = i20 + 1;
            int i22 = (iArr[str.charAt(i13)] << 18) | (iArr[str.charAt(i20)] << 12);
            int i23 = i21 + 1;
            int i24 = i22 | (iArr[str.charAt(i21)] << 6);
            int i25 = i23 + 1;
            int i26 = i24 | iArr[str.charAt(i23)];
            int i27 = i18 + 1;
            bArr[i18] = (byte) (i26 >> 16);
            int i28 = i27 + 1;
            bArr[i27] = (byte) (i26 >> 8);
            int i29 = i28 + 1;
            bArr[i28] = (byte) i26;
            if (i10 <= 0 || (i19 = i19 + 1) != 19) {
                i13 = i25;
            } else {
                i13 = i25 + 2;
                i19 = 0;
            }
            i18 = i29;
        }
        if (i18 < i16) {
            int i30 = 0;
            while (i13 <= i12 - i14) {
                i11 |= f21982p[str.charAt(i13)] << (18 - (i30 * 6));
                i30++;
                i13++;
            }
            int i31 = 16;
            while (i18 < i16) {
                bArr[i18] = (byte) (i11 >> i31);
                i31 -= 8;
                i18++;
            }
        }
        return bArr;
    }

    public static void c(long j10, int i10, char[] cArr) {
        char c10;
        if (j10 < 0) {
            c10 = '-';
            j10 = -j10;
        } else {
            c10 = 0;
        }
        while (j10 > 2147483647L) {
            long j11 = j10 / 100;
            int i11 = (int) (j10 - (((j11 << 6) + (j11 << 5)) + (j11 << 2)));
            int i12 = i10 - 1;
            cArr[i12] = f21979m[i11];
            i10 = i12 - 1;
            cArr[i10] = f21978l[i11];
            j10 = j11;
        }
        int i13 = (int) j10;
        while (i13 >= 65536) {
            int i14 = i13 / 100;
            int i15 = i13 - (((i14 << 6) + (i14 << 5)) + (i14 << 2));
            int i16 = i10 - 1;
            cArr[i16] = f21979m[i15];
            i10 = i16 - 1;
            cArr[i10] = f21978l[i15];
            i13 = i14;
        }
        while (true) {
            int i17 = (52429 * i13) >>> 19;
            i10--;
            cArr[i10] = f21977k[i13 - ((i17 << 3) + (i17 << 1))];
            if (i17 == 0) {
                break;
            }
            i13 = i17;
        }
        if (c10 != 0) {
            cArr[i10 - 1] = c10;
        }
    }

    public static void d(char[] cArr, int i10, int i11) {
        char c10;
        if (i10 < 0) {
            c10 = '-';
            i10 = -i10;
        } else {
            c10 = 0;
        }
        while (i10 >= 65536) {
            int i12 = i10 / 100;
            int i13 = i10 - (((i12 << 6) + (i12 << 5)) + (i12 << 2));
            int i14 = i11 - 1;
            cArr[i14] = f21979m[i13];
            i11 = i14 - 1;
            cArr[i11] = f21978l[i13];
            i10 = i12;
        }
        while (true) {
            int i15 = (52429 * i10) >>> 19;
            i11--;
            cArr[i11] = f21977k[i10 - ((i15 << 3) + (i15 << 1))];
            if (i15 == 0) {
                break;
            }
            i10 = i15;
        }
        if (c10 != 0) {
            cArr[i11 - 1] = c10;
        }
    }

    public static String e(String str) {
        String str2;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        return str2 == null ? f21967a.getProperty(str) : str2;
    }

    public static int f(long j10) {
        long j11 = 10;
        for (int i10 = 1; i10 < 19; i10++) {
            if (j10 < j11) {
                return i10;
            }
            j11 *= 10;
        }
        return 19;
    }
}
