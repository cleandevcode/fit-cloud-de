package cn.sharesdk.framework.utils;

import androidx.appcompat.widget.u0;

/* loaded from: classes.dex */
public class d extends k {

    /* renamed from: a */
    private static final char[] f5302a = {'+'};

    /* renamed from: b */
    private static final char[] f5303b = "0123456789ABCDEF".toCharArray();

    /* renamed from: c */
    private final boolean f5304c;

    /* renamed from: d */
    private final boolean[] f5305d;

    public d(String str, boolean z10) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        if (z10 && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        this.f5304c = z10;
        this.f5305d = a(str);
    }

    private static boolean[] a(String str) {
        char[] charArray = str.toCharArray();
        int i10 = 122;
        for (char c10 : charArray) {
            i10 = Math.max((int) c10, i10);
        }
        boolean[] zArr = new boolean[i10 + 1];
        for (int i11 = 48; i11 <= 57; i11++) {
            zArr[i11] = true;
        }
        for (int i12 = 65; i12 <= 90; i12++) {
            zArr[i12] = true;
        }
        for (int i13 = 97; i13 <= 122; i13++) {
            zArr[i13] = true;
        }
        for (char c11 : charArray) {
            zArr[c11] = true;
        }
        return zArr;
    }

    @Override // cn.sharesdk.framework.utils.k
    public int a(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            boolean[] zArr = this.f5305d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i10++;
        }
        return i10;
    }

    @Override // cn.sharesdk.framework.utils.k
    public char[] a(int i10) {
        boolean[] zArr = this.f5305d;
        if (i10 < zArr.length && zArr[i10]) {
            return null;
        }
        if (i10 == 32 && this.f5304c) {
            return f5302a;
        }
        if (i10 <= 127) {
            char[] cArr = f5303b;
            return new char[]{'%', cArr[i10 >>> 4], cArr[i10 & 15]};
        } else if (i10 <= 2047) {
            char[] cArr2 = f5303b;
            char[] cArr3 = {'%', cArr2[(r14 >>> 4) | 12], cArr2[r14 & 15], '%', cArr2[(r14 & 3) | 8], cArr2[i10 & 15]};
            int i11 = i10 >>> 4;
            int i12 = i11 >>> 2;
            return cArr3;
        } else if (i10 <= 65535) {
            char[] cArr4 = f5303b;
            char[] cArr5 = {'%', 'E', cArr4[r14 >>> 2], '%', cArr4[(r14 & 3) | 8], cArr4[r14 & 15], '%', cArr4[(r14 & 3) | 8], cArr4[i10 & 15]};
            int i13 = i10 >>> 4;
            int i14 = i13 >>> 2;
            int i15 = i14 >>> 4;
            return cArr5;
        } else if (i10 <= 1114111) {
            char[] cArr6 = f5303b;
            char[] cArr7 = {'%', 'F', cArr6[(r14 >>> 2) & 7], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[r14 & 15], '%', cArr6[(r14 & 3) | 8], cArr6[i10 & 15]};
            int i16 = i10 >>> 4;
            int i17 = i16 >>> 2;
            int i18 = i17 >>> 4;
            int i19 = i18 >>> 2;
            int i20 = i19 >>> 4;
            return cArr7;
        } else {
            throw new IllegalArgumentException(u0.a("Invalid unicode character value ", i10));
        }
    }

    @Override // cn.sharesdk.framework.utils.k, cn.sharesdk.framework.utils.Escaper
    public String escape(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            boolean[] zArr = this.f5305d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return a(str, i10);
            }
        }
        return str;
    }
}
