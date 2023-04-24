package h4;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Properties;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: r */
    public static final ThreadLocal<char[]> f15829r = new ThreadLocal<>();

    /* renamed from: q */
    public char[] f15830q;

    @Override // h4.e, h4.c
    public final String I0() {
        int i10 = this.f15822h;
        if (i10 == -1) {
            i10 = 0;
        }
        char N0 = N0((this.f15821g + i10) - 1);
        int i11 = this.f15821g;
        if (N0 == 'L' || N0 == 'S' || N0 == 'B' || N0 == 'F' || N0 == 'D') {
            i11--;
        }
        return new String(this.f15830q, i10, i11);
    }

    @Override // h4.e
    public final String K0(int i10, int i11, int i12, l lVar) {
        return lVar.a(i10, i11, i12, this.f15830q);
    }

    @Override // h4.e, h4.c
    public final BigDecimal L() {
        int i10 = this.f15822h;
        if (i10 == -1) {
            i10 = 0;
        }
        char N0 = N0((this.f15821g + i10) - 1);
        int i11 = this.f15821g;
        if (N0 == 'L' || N0 == 'S' || N0 == 'B' || N0 == 'F' || N0 == 'D') {
            i11--;
        }
        if (i11 <= 65535) {
            return new BigDecimal(this.f15830q, i10, i11, MathContext.UNLIMITED);
        }
        throw new e4.d("decimal overflow");
    }

    @Override // h4.e
    public final void L0(int i10, int i11, char[] cArr) {
        System.arraycopy(this.f15830q, i10, cArr, 0, i11);
    }

    @Override // h4.e
    public final boolean M0(char[] cArr) {
        for (int i10 = 0; i10 < cArr.length; i10++) {
            if (N0(this.f15819e + i10) != cArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // h4.e
    public final char N0(int i10) {
        if (i10 >= 0) {
            int i11 = this.f15819e;
            if (i11 == 0) {
                char[] cArr = this.f15830q;
                System.arraycopy(cArr, i11, new char[(cArr.length * 3) / 2], 0, 0);
                throw null;
            }
            int i12 = 0 - i11;
            if (i12 > 0) {
                char[] cArr2 = this.f15830q;
                System.arraycopy(cArr2, i11, cArr2, 0, i12);
            }
            try {
                int length = this.f15830q.length;
                throw null;
            } catch (IOException e10) {
                throw new e4.d(e10.getMessage(), e10);
            }
        }
        return this.f15830q[i10];
    }

    @Override // h4.e
    public final void O0(char[] cArr, int i10, int i11) {
        System.arraycopy(this.f15830q, i10, cArr, 0, i11);
    }

    @Override // h4.e
    public final int Q0(int i10) {
        int i11 = i10 - this.f15819e;
        while (true) {
            char N0 = N0(this.f15819e + i11);
            if ('\"' == N0) {
                return i11 + this.f15819e;
            }
            if (N0 == 26) {
                return -1;
            }
            i11++;
        }
    }

    @Override // h4.c
    public final byte[] R() {
        int i10;
        int i11;
        int i12;
        if (this.f15815a != 26) {
            char[] cArr = this.f15830q;
            int i13 = this.f15822h + 1;
            int i14 = this.f15821g;
            Properties properties = n4.g.f21967a;
            int i15 = 0;
            if (i14 == 0) {
                return new byte[0];
            }
            int i16 = (i13 + i14) - 1;
            while (i13 < i16 && n4.g.f21982p[cArr[i13]] < 0) {
                i13++;
            }
            while (i16 > 0 && n4.g.f21982p[cArr[i16]] < 0) {
                i16--;
            }
            if (cArr[i16] == '=') {
                if (cArr[i16 - 1] == '=') {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
            } else {
                i10 = 0;
            }
            int i17 = (i16 - i13) + 1;
            if (i14 > 76) {
                if (cArr[76] == '\r') {
                    i12 = i17 / 78;
                } else {
                    i12 = 0;
                }
                i11 = i12 << 1;
            } else {
                i11 = 0;
            }
            int i18 = (((i17 - i11) * 6) >> 3) - i10;
            byte[] bArr = new byte[i18];
            int i19 = (i18 / 3) * 3;
            int i20 = 0;
            int i21 = 0;
            while (i20 < i19) {
                int[] iArr = n4.g.f21982p;
                int i22 = i13 + 1;
                int i23 = i22 + 1;
                int i24 = (iArr[cArr[i13]] << 18) | (iArr[cArr[i22]] << 12);
                int i25 = i23 + 1;
                int i26 = i24 | (iArr[cArr[i23]] << 6);
                int i27 = i25 + 1;
                int i28 = i26 | iArr[cArr[i25]];
                int i29 = i20 + 1;
                bArr[i20] = (byte) (i28 >> 16);
                int i30 = i29 + 1;
                bArr[i29] = (byte) (i28 >> 8);
                int i31 = i30 + 1;
                bArr[i30] = (byte) i28;
                if (i11 > 0 && (i21 = i21 + 1) == 19) {
                    i13 = i27 + 2;
                    i21 = 0;
                } else {
                    i13 = i27;
                }
                i20 = i31;
            }
            if (i20 < i18) {
                int i32 = 0;
                while (i13 <= i16 - i10) {
                    i32 |= n4.g.f21982p[cArr[i13]] << (18 - (i15 * 6));
                    i15++;
                    i13++;
                }
                int i33 = 16;
                while (i20 < i18) {
                    bArr[i20] = (byte) (i32 >> i33);
                    i33 -= 8;
                    i20++;
                }
            }
            return bArr;
        }
        throw new e4.d("TODO");
    }

    @Override // h4.e
    public final boolean R0() {
        int i10 = this.f15819e;
        char[] cArr = this.f15830q;
        if (i10 != cArr.length) {
            return this.f15818d == 26 && i10 + 1 >= cArr.length;
        }
        return true;
    }

    @Override // h4.e, h4.c
    public final String W() {
        if (this.f15823i) {
            return new String(this.f15820f, 0, this.f15821g);
        }
        int i10 = this.f15822h + 1;
        if (i10 >= 0) {
            char[] cArr = this.f15830q;
            int length = cArr.length;
            int i11 = this.f15821g;
            if (i10 <= length - i11) {
                return new String(cArr, i10, i11);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // h4.e, h4.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        char[] cArr = this.f15830q;
        if (cArr.length <= 65536) {
            f15829r.set(cArr);
        }
        this.f15830q = null;
        Properties properties = n4.g.f21967a;
    }

    @Override // h4.e, h4.c
    public final boolean k() {
        int i10 = 0;
        while (true) {
            char c10 = this.f15830q[i10];
            if (c10 == 26) {
                this.f15815a = 20;
                return true;
            } else if (!e.S0(c10)) {
                return false;
            } else {
                i10++;
            }
        }
    }

    @Override // h4.e
    public final String m1(int i10, int i11) {
        if (i11 >= 0) {
            return new String(this.f15830q, i10, i11);
        }
        throw new StringIndexOutOfBoundsException(i11);
    }

    @Override // h4.e
    public final char[] n1(int i10, int i11) {
        if (i11 >= 0) {
            if (i10 == 0) {
                return this.f15830q;
            }
            char[] cArr = new char[i11];
            System.arraycopy(this.f15830q, i10, cArr, 0, i11);
            return cArr;
        }
        throw new StringIndexOutOfBoundsException(i11);
    }

    @Override // h4.e, h4.c
    public final char next() {
        int i10 = this.f15819e + 1;
        this.f15819e = i10;
        if (i10 < 0) {
            char c10 = this.f15830q[i10];
            this.f15818d = c10;
            return c10;
        }
        int i11 = this.f15821g;
        if (i11 > 0) {
            int i12 = 0 - i11;
            if (this.f15818d == '\"' && i12 > 0) {
                i12--;
            }
            char[] cArr = this.f15830q;
            System.arraycopy(cArr, i12, cArr, 0, i11);
        }
        this.f15822h = -1;
        int i13 = this.f15821g;
        this.f15819e = i13;
        try {
            char[] cArr2 = this.f15830q;
            if (cArr2.length - i13 == 0) {
                char[] cArr3 = new char[cArr2.length * 2];
                System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
                this.f15830q = cArr3;
            }
            throw null;
        } catch (IOException e10) {
            throw new e4.d(e10.getMessage(), e10);
        }
    }
}
