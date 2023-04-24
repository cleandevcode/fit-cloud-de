package w1;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import s1.q;
import w1.o1;

/* loaded from: classes.dex */
public abstract class k extends androidx.fragment.app.a0 {

    /* renamed from: b */
    public static final Logger f29621b = Logger.getLogger(k.class.getName());

    /* renamed from: c */
    public static final boolean f29622c = n1.f29651f;

    /* renamed from: a */
    public l f29623a;

    /* loaded from: classes.dex */
    public static abstract class a extends k {

        /* renamed from: d */
        public final byte[] f29624d;

        /* renamed from: e */
        public final int f29625e;

        /* renamed from: f */
        public int f29626f;

        public a(int i10) {
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.f29624d = bArr;
                this.f29625e = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final void F0(int i10) {
            byte[] bArr = this.f29624d;
            int i11 = this.f29626f;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f29626f = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        }

        public final void G0(long j10) {
            byte[] bArr = this.f29624d;
            int i10 = this.f29626f;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j10 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j10 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j10 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j10 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f29626f = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        }

        public final void H0(int i10, int i11) {
            I0((i10 << 3) | i11);
        }

        public final void I0(int i10) {
            if (k.f29622c) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.f29624d;
                    int i11 = this.f29626f;
                    this.f29626f = i11 + 1;
                    n1.p(bArr, i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f29624d;
                int i12 = this.f29626f;
                this.f29626f = i12 + 1;
                n1.p(bArr2, i12, (byte) i10);
                return;
            }
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.f29624d;
                int i13 = this.f29626f;
                this.f29626f = i13 + 1;
                bArr3[i13] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f29624d;
            int i14 = this.f29626f;
            this.f29626f = i14 + 1;
            bArr4[i14] = (byte) i10;
        }

        public final void J0(long j10) {
            if (k.f29622c) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f29624d;
                    int i10 = this.f29626f;
                    this.f29626f = i10 + 1;
                    n1.p(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f29624d;
                int i11 = this.f29626f;
                this.f29626f = i11 + 1;
                n1.p(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.f29624d;
                int i12 = this.f29626f;
                this.f29626f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f29624d;
            int i13 = this.f29626f;
            this.f29626f = i13 + 1;
            bArr4[i13] = (byte) j10;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends k {

        /* renamed from: d */
        public final byte[] f29627d;

        /* renamed from: e */
        public final int f29628e;

        /* renamed from: f */
        public int f29629f;

        public b(byte[] bArr, int i10) {
            int i11 = 0 + i10;
            if ((0 | i10 | (bArr.length - i11)) >= 0) {
                this.f29627d = bArr;
                this.f29629f = 0;
                this.f29628e = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }

        @Override // w1.k
        public final void A0(int i10, int i11) {
            C0((i10 << 3) | i11);
        }

        @Override // w1.k
        public final void B0(int i10, int i11) {
            A0(i10, 0);
            C0(i11);
        }

        @Override // w1.k
        public final void C0(int i10) {
            if (k.f29622c && !w1.d.a()) {
                int i11 = this.f29628e;
                int i12 = this.f29629f;
                if (i11 - i12 >= 5) {
                    if ((i10 & (-128)) == 0) {
                        byte[] bArr = this.f29627d;
                        this.f29629f = i12 + 1;
                        n1.p(bArr, i12, (byte) i10);
                        return;
                    }
                    byte[] bArr2 = this.f29627d;
                    this.f29629f = i12 + 1;
                    n1.p(bArr2, i12, (byte) (i10 | 128));
                    int i13 = i10 >>> 7;
                    if ((i13 & (-128)) == 0) {
                        byte[] bArr3 = this.f29627d;
                        int i14 = this.f29629f;
                        this.f29629f = i14 + 1;
                        n1.p(bArr3, i14, (byte) i13);
                        return;
                    }
                    byte[] bArr4 = this.f29627d;
                    int i15 = this.f29629f;
                    this.f29629f = i15 + 1;
                    n1.p(bArr4, i15, (byte) (i13 | 128));
                    int i16 = i13 >>> 7;
                    if ((i16 & (-128)) == 0) {
                        byte[] bArr5 = this.f29627d;
                        int i17 = this.f29629f;
                        this.f29629f = i17 + 1;
                        n1.p(bArr5, i17, (byte) i16);
                        return;
                    }
                    byte[] bArr6 = this.f29627d;
                    int i18 = this.f29629f;
                    this.f29629f = i18 + 1;
                    n1.p(bArr6, i18, (byte) (i16 | 128));
                    int i19 = i16 >>> 7;
                    if ((i19 & (-128)) == 0) {
                        byte[] bArr7 = this.f29627d;
                        int i20 = this.f29629f;
                        this.f29629f = i20 + 1;
                        n1.p(bArr7, i20, (byte) i19);
                        return;
                    }
                    byte[] bArr8 = this.f29627d;
                    int i21 = this.f29629f;
                    this.f29629f = i21 + 1;
                    n1.p(bArr8, i21, (byte) (i19 | 128));
                    byte[] bArr9 = this.f29627d;
                    int i22 = this.f29629f;
                    this.f29629f = i22 + 1;
                    n1.p(bArr9, i22, (byte) (i19 >>> 7));
                    return;
                }
            }
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.f29627d;
                    int i23 = this.f29629f;
                    this.f29629f = i23 + 1;
                    bArr10[i23] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29629f), Integer.valueOf(this.f29628e), 1), e10);
                }
            }
            byte[] bArr11 = this.f29627d;
            int i24 = this.f29629f;
            this.f29629f = i24 + 1;
            bArr11[i24] = (byte) i10;
        }

        @Override // w1.k
        public final void D0(int i10, long j10) {
            A0(i10, 0);
            E0(j10);
        }

        @Override // androidx.fragment.app.a0
        public final void E(byte[] bArr, int i10, int i11) {
            F0(bArr, i10, i11);
        }

        @Override // w1.k
        public final void E0(long j10) {
            if (k.f29622c && this.f29628e - this.f29629f >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.f29627d;
                    int i10 = this.f29629f;
                    this.f29629f = i10 + 1;
                    n1.p(bArr, i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f29627d;
                int i11 = this.f29629f;
                this.f29629f = i11 + 1;
                n1.p(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f29627d;
                    int i12 = this.f29629f;
                    this.f29629f = i12 + 1;
                    bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29629f), Integer.valueOf(this.f29628e), 1), e10);
                }
            }
            byte[] bArr4 = this.f29627d;
            int i13 = this.f29629f;
            this.f29629f = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        public final void F0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f29627d, this.f29629f, i11);
                this.f29629f += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29629f), Integer.valueOf(this.f29628e), Integer.valueOf(i11)), e10);
            }
        }

        @Override // w1.k
        public final void j0(byte b10) {
            try {
                byte[] bArr = this.f29627d;
                int i10 = this.f29629f;
                this.f29629f = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29629f), Integer.valueOf(this.f29628e), 1), e10);
            }
        }

        @Override // w1.k
        public final void k0(int i10, boolean z10) {
            A0(i10, 0);
            j0(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // w1.k
        public final void l0(byte[] bArr, int i10) {
            C0(i10);
            F0(bArr, 0, i10);
        }

        @Override // w1.k
        public final void m0(int i10, g gVar) {
            A0(i10, 2);
            n0(gVar);
        }

        @Override // w1.k
        public final void n0(g gVar) {
            C0(gVar.size());
            gVar.o(this);
        }

        @Override // w1.k
        public final void o0(int i10, int i11) {
            A0(i10, 5);
            p0(i11);
        }

        @Override // w1.k
        public final void p0(int i10) {
            try {
                byte[] bArr = this.f29627d;
                int i11 = this.f29629f;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f29629f = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29629f), Integer.valueOf(this.f29628e), 1), e10);
            }
        }

        @Override // w1.k
        public final void q0(int i10, long j10) {
            A0(i10, 1);
            r0(j10);
        }

        @Override // w1.k
        public final void r0(long j10) {
            try {
                byte[] bArr = this.f29627d;
                int i10 = this.f29629f;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f29629f = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29629f), Integer.valueOf(this.f29628e), 1), e10);
            }
        }

        @Override // w1.k
        public final void s0(int i10, int i11) {
            A0(i10, 0);
            t0(i11);
        }

        @Override // w1.k
        public final void t0(int i10) {
            if (i10 >= 0) {
                C0(i10);
            } else {
                E0(i10);
            }
        }

        @Override // w1.k
        public final void u0(int i10, p0 p0Var, d1 d1Var) {
            A0(i10, 2);
            C0(((w1.a) p0Var).i(d1Var));
            d1Var.f(p0Var, this.f29623a);
        }

        @Override // w1.k
        public final void v0(p0 p0Var) {
            C0(p0Var.e());
            p0Var.d(this);
        }

        @Override // w1.k
        public final void w0(int i10, p0 p0Var) {
            A0(1, 3);
            B0(2, i10);
            A0(3, 2);
            v0(p0Var);
            A0(1, 4);
        }

        @Override // w1.k
        public final void x0(int i10, g gVar) {
            A0(1, 3);
            B0(2, i10);
            m0(3, gVar);
            A0(1, 4);
        }

        @Override // w1.k
        public final void y0(int i10, String str) {
            A0(i10, 2);
            z0(str);
        }

        @Override // w1.k
        public final void z0(String str) {
            int b10;
            int i10 = this.f29629f;
            try {
                int f02 = k.f0(str.length() * 3);
                int f03 = k.f0(str.length());
                if (f03 == f02) {
                    int i11 = i10 + f03;
                    this.f29629f = i11;
                    b10 = o1.f29660a.b(str, this.f29627d, i11, this.f29628e - i11);
                    this.f29629f = i10;
                    C0((b10 - i10) - f03);
                } else {
                    C0(o1.a(str));
                    byte[] bArr = this.f29627d;
                    int i12 = this.f29629f;
                    b10 = o1.f29660a.b(str, bArr, i12, this.f29628e - i12);
                }
                this.f29629f = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new c(e10);
            } catch (o1.d e11) {
                this.f29629f = i10;
                i0(str, e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends IOException {
        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(a.b.b("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a {

        /* renamed from: g */
        public final OutputStream f29630g;

        public d(q.b bVar, int i10) {
            super(i10);
            this.f29630g = bVar;
        }

        @Override // w1.k
        public final void A0(int i10, int i11) {
            C0((i10 << 3) | i11);
        }

        @Override // w1.k
        public final void B0(int i10, int i11) {
            L0(20);
            H0(i10, 0);
            I0(i11);
        }

        @Override // w1.k
        public final void C0(int i10) {
            L0(5);
            I0(i10);
        }

        @Override // w1.k
        public final void D0(int i10, long j10) {
            L0(20);
            H0(i10, 0);
            J0(j10);
        }

        @Override // androidx.fragment.app.a0
        public final void E(byte[] bArr, int i10, int i11) {
            M0(bArr, i10, i11);
        }

        @Override // w1.k
        public final void E0(long j10) {
            L0(10);
            J0(j10);
        }

        public final void K0() {
            this.f29630g.write(this.f29624d, 0, this.f29626f);
            this.f29626f = 0;
        }

        public final void L0(int i10) {
            if (this.f29625e - this.f29626f < i10) {
                K0();
            }
        }

        public final void M0(byte[] bArr, int i10, int i11) {
            int i12 = this.f29625e;
            int i13 = this.f29626f;
            int i14 = i12 - i13;
            if (i14 >= i11) {
                System.arraycopy(bArr, i10, this.f29624d, i13, i11);
                this.f29626f += i11;
                return;
            }
            System.arraycopy(bArr, i10, this.f29624d, i13, i14);
            int i15 = i10 + i14;
            int i16 = i11 - i14;
            this.f29626f = this.f29625e;
            K0();
            if (i16 > this.f29625e) {
                this.f29630g.write(bArr, i15, i16);
                return;
            }
            System.arraycopy(bArr, i15, this.f29624d, 0, i16);
            this.f29626f = i16;
        }

        @Override // w1.k
        public final void j0(byte b10) {
            if (this.f29626f == this.f29625e) {
                K0();
            }
            byte[] bArr = this.f29624d;
            int i10 = this.f29626f;
            this.f29626f = i10 + 1;
            bArr[i10] = b10;
        }

        @Override // w1.k
        public final void k0(int i10, boolean z10) {
            L0(11);
            H0(i10, 0);
            byte b10 = z10 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f29624d;
            int i11 = this.f29626f;
            this.f29626f = i11 + 1;
            bArr[i11] = b10;
        }

        @Override // w1.k
        public final void l0(byte[] bArr, int i10) {
            C0(i10);
            M0(bArr, 0, i10);
        }

        @Override // w1.k
        public final void m0(int i10, g gVar) {
            A0(i10, 2);
            n0(gVar);
        }

        @Override // w1.k
        public final void n0(g gVar) {
            C0(gVar.size());
            gVar.o(this);
        }

        @Override // w1.k
        public final void o0(int i10, int i11) {
            L0(14);
            H0(i10, 5);
            F0(i11);
        }

        @Override // w1.k
        public final void p0(int i10) {
            L0(4);
            F0(i10);
        }

        @Override // w1.k
        public final void q0(int i10, long j10) {
            L0(18);
            H0(i10, 1);
            G0(j10);
        }

        @Override // w1.k
        public final void r0(long j10) {
            L0(8);
            G0(j10);
        }

        @Override // w1.k
        public final void s0(int i10, int i11) {
            L0(20);
            H0(i10, 0);
            if (i11 >= 0) {
                I0(i11);
            } else {
                J0(i11);
            }
        }

        @Override // w1.k
        public final void t0(int i10) {
            if (i10 >= 0) {
                C0(i10);
            } else {
                E0(i10);
            }
        }

        @Override // w1.k
        public final void u0(int i10, p0 p0Var, d1 d1Var) {
            A0(i10, 2);
            C0(((w1.a) p0Var).i(d1Var));
            d1Var.f(p0Var, this.f29623a);
        }

        @Override // w1.k
        public final void v0(p0 p0Var) {
            C0(p0Var.e());
            p0Var.d(this);
        }

        @Override // w1.k
        public final void w0(int i10, p0 p0Var) {
            A0(1, 3);
            B0(2, i10);
            A0(3, 2);
            v0(p0Var);
            A0(1, 4);
        }

        @Override // w1.k
        public final void x0(int i10, g gVar) {
            A0(1, 3);
            B0(2, i10);
            m0(3, gVar);
            A0(1, 4);
        }

        @Override // w1.k
        public final void y0(int i10, String str) {
            A0(i10, 2);
            z0(str);
        }

        @Override // w1.k
        public final void z0(String str) {
            try {
                int length = str.length() * 3;
                int f02 = k.f0(length);
                int i10 = f02 + length;
                int i11 = this.f29625e;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int b10 = o1.f29660a.b(str, bArr, 0, length);
                    C0(b10);
                    M0(bArr, 0, b10);
                    return;
                }
                if (i10 > i11 - this.f29626f) {
                    K0();
                }
                int f03 = k.f0(str.length());
                int i12 = this.f29626f;
                try {
                    if (f03 == f02) {
                        int i13 = i12 + f03;
                        this.f29626f = i13;
                        int b11 = o1.f29660a.b(str, this.f29624d, i13, this.f29625e - i13);
                        this.f29626f = i12;
                        I0((b11 - i12) - f03);
                        this.f29626f = b11;
                    } else {
                        int a10 = o1.a(str);
                        I0(a10);
                        this.f29626f = o1.f29660a.b(str, this.f29624d, this.f29626f, a10);
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new c(e10);
                } catch (o1.d e11) {
                    this.f29626f = i12;
                    throw e11;
                }
            } catch (o1.d e12) {
                i0(str, e12);
            }
        }
    }

    public static int H(int i10) {
        return d0(i10) + 1;
    }

    public static int I(int i10, g gVar) {
        int d02 = d0(i10);
        int size = gVar.size();
        return f0(size) + size + d02;
    }

    public static int J(int i10) {
        return d0(i10) + 8;
    }

    public static int K(int i10, int i11) {
        return Q(i11) + d0(i10);
    }

    public static int L(int i10) {
        return d0(i10) + 4;
    }

    public static int M(int i10) {
        return d0(i10) + 8;
    }

    public static int N(int i10) {
        return d0(i10) + 4;
    }

    @Deprecated
    public static int O(int i10, p0 p0Var, d1 d1Var) {
        return ((w1.a) p0Var).i(d1Var) + (d0(i10) * 2);
    }

    public static int P(int i10, int i11) {
        return Q(i11) + d0(i10);
    }

    public static int Q(int i10) {
        if (i10 >= 0) {
            return f0(i10);
        }
        return 10;
    }

    public static int R(int i10, long j10) {
        return h0(j10) + d0(i10);
    }

    public static int S(c0 c0Var) {
        int i10;
        if (c0Var.f29547b != null) {
            i10 = c0Var.f29547b.size();
        } else if (c0Var.f29546a != null) {
            i10 = c0Var.f29546a.e();
        } else {
            i10 = 0;
        }
        return f0(i10) + i10;
    }

    public static int T(int i10) {
        return d0(i10) + 4;
    }

    public static int U(int i10) {
        return d0(i10) + 8;
    }

    public static int V(int i10, int i11) {
        return f0((i11 >> 31) ^ (i11 << 1)) + d0(i10);
    }

    public static int W(int i10, long j10) {
        return h0((j10 >> 63) ^ (j10 << 1)) + d0(i10);
    }

    public static int b0(int i10, String str) {
        return c0(str) + d0(i10);
    }

    public static int c0(String str) {
        int length;
        try {
            length = o1.a(str);
        } catch (o1.d unused) {
            length = str.getBytes(y.f29729a).length;
        }
        return f0(length) + length;
    }

    public static int d0(int i10) {
        return f0((i10 << 3) | 0);
    }

    public static int e0(int i10, int i11) {
        return f0(i11) + d0(i10);
    }

    public static int f0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int g0(int i10, long j10) {
        return h0(j10) + d0(i10);
    }

    public static int h0(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public abstract void A0(int i10, int i11);

    public abstract void B0(int i10, int i11);

    public abstract void C0(int i10);

    public abstract void D0(int i10, long j10);

    public abstract void E0(long j10);

    public final void i0(String str, o1.d dVar) {
        f29621b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(y.f29729a);
        try {
            C0(bytes.length);
            E(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new c(e10);
        } catch (c e11) {
            throw e11;
        }
    }

    public abstract void j0(byte b10);

    public abstract void k0(int i10, boolean z10);

    public abstract void l0(byte[] bArr, int i10);

    public abstract void m0(int i10, g gVar);

    public abstract void n0(g gVar);

    public abstract void o0(int i10, int i11);

    public abstract void p0(int i10);

    public abstract void q0(int i10, long j10);

    public abstract void r0(long j10);

    public abstract void s0(int i10, int i11);

    public abstract void t0(int i10);

    public abstract void u0(int i10, p0 p0Var, d1 d1Var);

    public abstract void v0(p0 p0Var);

    public abstract void w0(int i10, p0 p0Var);

    public abstract void x0(int i10, g gVar);

    public abstract void y0(int i10, String str);

    public abstract void z0(String str);
}
