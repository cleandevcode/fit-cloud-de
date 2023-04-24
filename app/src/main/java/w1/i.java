package w1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import w1.g;
import w1.z;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a */
    public int f29589a;

    /* renamed from: b */
    public int f29590b = 100;

    /* renamed from: c */
    public int f29591c = Integer.MAX_VALUE;

    /* renamed from: d */
    public j f29592d;

    /* loaded from: classes.dex */
    public static final class a extends i {

        /* renamed from: e */
        public final byte[] f29593e;

        /* renamed from: f */
        public int f29594f;

        /* renamed from: g */
        public int f29595g;

        /* renamed from: h */
        public int f29596h;

        /* renamed from: i */
        public int f29597i;

        /* renamed from: j */
        public int f29598j;

        /* renamed from: k */
        public int f29599k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i10, int i11, boolean z10) {
            this.f29593e = bArr;
            this.f29594f = i11 + i10;
            this.f29596h = i10;
            this.f29597i = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int A() {
            /*
                r5 = this;
                int r0 = r5.f29596h
                int r1 = r5.f29594f
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f29593e
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f29596h = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.C()
                int r1 = (int) r0
                return r1
            L70:
                r5.f29596h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.i.a.A():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:85:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long B() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.i.a.B():long");
        }

        public final long C() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                int i11 = this.f29596h;
                if (i11 != this.f29594f) {
                    byte[] bArr = this.f29593e;
                    this.f29596h = i11 + 1;
                    byte b10 = bArr[i11];
                    j10 |= (b10 & Byte.MAX_VALUE) << i10;
                    if ((b10 & 128) == 0) {
                        return j10;
                    }
                } else {
                    throw z.f();
                }
            }
            throw z.c();
        }

        public final void D(int i10) {
            if (i10 >= 0) {
                int i11 = this.f29594f;
                int i12 = this.f29596h;
                if (i10 <= i11 - i12) {
                    this.f29596h = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw z.f();
            }
            throw z.d();
        }

        @Override // w1.i
        public final void a(int i10) {
            if (this.f29598j == i10) {
                return;
            }
            throw new z("Protocol message end-group tag did not match expected tag.");
        }

        @Override // w1.i
        public final int b() {
            return this.f29596h - this.f29597i;
        }

        @Override // w1.i
        public final boolean c() {
            return this.f29596h == this.f29594f;
        }

        @Override // w1.i
        public final void d(int i10) {
            this.f29599k = i10;
            int i11 = this.f29594f + this.f29595g;
            this.f29594f = i11;
            int i12 = i11 - this.f29597i;
            if (i12 <= i10) {
                this.f29595g = 0;
                return;
            }
            int i13 = i12 - i10;
            this.f29595g = i13;
            this.f29594f = i11 - i13;
        }

        @Override // w1.i
        public final int e(int i10) {
            if (i10 >= 0) {
                int i11 = this.f29596h;
                int i12 = this.f29597i;
                int i13 = (i11 - i12) + i10;
                int i14 = this.f29599k;
                if (i13 <= i14) {
                    this.f29599k = i13;
                    int i15 = this.f29594f + this.f29595g;
                    this.f29594f = i15;
                    int i16 = i15 - i12;
                    if (i16 > i13) {
                        int i17 = i16 - i13;
                        this.f29595g = i17;
                        this.f29594f = i15 - i17;
                    } else {
                        this.f29595g = 0;
                    }
                    return i14;
                }
                throw z.f();
            }
            throw z.d();
        }

        @Override // w1.i
        public final boolean f() {
            return B() != 0;
        }

        @Override // w1.i
        public final g.e g() {
            byte[] bArr;
            int A = A();
            if (A > 0) {
                int i10 = this.f29594f;
                int i11 = this.f29596h;
                if (A <= i10 - i11) {
                    g.e f10 = g.f(this.f29593e, i11, A);
                    this.f29596h += A;
                    return f10;
                }
            }
            if (A == 0) {
                return g.f29563b;
            }
            if (A > 0) {
                int i12 = this.f29594f;
                int i13 = this.f29596h;
                if (A <= i12 - i13) {
                    int i14 = A + i13;
                    this.f29596h = i14;
                    bArr = Arrays.copyOfRange(this.f29593e, i13, i14);
                    g.e eVar = g.f29563b;
                    return new g.e(bArr);
                }
            }
            if (A <= 0) {
                if (A == 0) {
                    bArr = y.f29730b;
                    g.e eVar2 = g.f29563b;
                    return new g.e(bArr);
                }
                throw z.d();
            }
            throw z.f();
        }

        @Override // w1.i
        public final double h() {
            return Double.longBitsToDouble(z());
        }

        @Override // w1.i
        public final int i() {
            return A();
        }

        @Override // w1.i
        public final int j() {
            return y();
        }

        @Override // w1.i
        public final long k() {
            return z();
        }

        @Override // w1.i
        public final float l() {
            return Float.intBitsToFloat(y());
        }

        @Override // w1.i
        public final int m() {
            return A();
        }

        @Override // w1.i
        public final long n() {
            return B();
        }

        @Override // w1.i
        public final int o() {
            return y();
        }

        @Override // w1.i
        public final long p() {
            return z();
        }

        @Override // w1.i
        public final int q() {
            int A = A();
            return (-(A & 1)) ^ (A >>> 1);
        }

        @Override // w1.i
        public final long r() {
            long B = B();
            return (-(B & 1)) ^ (B >>> 1);
        }

        @Override // w1.i
        public final String s() {
            int A = A();
            if (A > 0) {
                int i10 = this.f29594f;
                int i11 = this.f29596h;
                if (A <= i10 - i11) {
                    String str = new String(this.f29593e, i11, A, y.f29729a);
                    this.f29596h += A;
                    return str;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A < 0) {
                throw z.d();
            }
            throw z.f();
        }

        @Override // w1.i
        public final String t() {
            int A = A();
            if (A > 0) {
                int i10 = this.f29594f;
                int i11 = this.f29596h;
                if (A <= i10 - i11) {
                    String a10 = o1.f29660a.a(this.f29593e, i11, A);
                    this.f29596h += A;
                    return a10;
                }
            }
            if (A == 0) {
                return "";
            }
            if (A <= 0) {
                throw z.d();
            }
            throw z.f();
        }

        @Override // w1.i
        public final int u() {
            if (c()) {
                this.f29598j = 0;
                return 0;
            }
            int A = A();
            this.f29598j = A;
            if ((A >>> 3) != 0) {
                return A;
            }
            throw new z("Protocol message contained an invalid tag (zero).");
        }

        @Override // w1.i
        public final int v() {
            return A();
        }

        @Override // w1.i
        public final long w() {
            return B();
        }

        @Override // w1.i
        public final boolean x(int i10) {
            int i11;
            int u10;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                return false;
                            }
                            if (i12 == 5) {
                                D(4);
                                return true;
                            }
                            int i14 = z.f29731a;
                            throw new z.a();
                        }
                        do {
                            u10 = u();
                            if (u10 == 0) {
                                break;
                            }
                        } while (x(u10));
                        a(((i10 >>> 3) << 3) | 4);
                        return true;
                    }
                    i11 = A();
                } else {
                    i11 = 8;
                }
                D(i11);
                return true;
            }
            if (this.f29594f - this.f29596h >= 10) {
                while (i13 < 10) {
                    byte[] bArr = this.f29593e;
                    int i15 = this.f29596h;
                    this.f29596h = i15 + 1;
                    if (bArr[i15] < 0) {
                        i13++;
                    }
                }
                throw z.c();
            }
            while (i13 < 10) {
                int i16 = this.f29596h;
                if (i16 != this.f29594f) {
                    byte[] bArr2 = this.f29593e;
                    this.f29596h = i16 + 1;
                    if (bArr2[i16] < 0) {
                        i13++;
                    }
                } else {
                    throw z.f();
                }
            }
            throw z.c();
            return true;
        }

        public final int y() {
            int i10 = this.f29596h;
            if (this.f29594f - i10 >= 4) {
                byte[] bArr = this.f29593e;
                this.f29596h = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw z.f();
        }

        public final long z() {
            int i10 = this.f29596h;
            if (this.f29594f - i10 >= 8) {
                byte[] bArr = this.f29593e;
                this.f29596h = i10 + 8;
                return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
            }
            throw z.f();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends i {

        /* renamed from: e */
        public final InputStream f29600e;

        /* renamed from: f */
        public final byte[] f29601f;

        /* renamed from: g */
        public int f29602g;

        /* renamed from: h */
        public int f29603h;

        /* renamed from: i */
        public int f29604i;

        /* renamed from: j */
        public int f29605j;

        /* renamed from: k */
        public int f29606k;

        /* renamed from: l */
        public int f29607l = Integer.MAX_VALUE;

        public b(FileInputStream fileInputStream) {
            Charset charset = y.f29729a;
            this.f29600e = fileInputStream;
            this.f29601f = new byte[4096];
            this.f29602g = 0;
            this.f29604i = 0;
            this.f29606k = 0;
        }

        public final ArrayList A(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f29600e.read(bArr, i11, min - i11);
                    if (read == -1) {
                        throw z.f();
                    }
                    this.f29606k += read;
                    i11 += read;
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int B() {
            int i10 = this.f29604i;
            if (this.f29602g - i10 < 4) {
                H(4);
                i10 = this.f29604i;
            }
            byte[] bArr = this.f29601f;
            this.f29604i = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public final long C() {
            int i10 = this.f29604i;
            if (this.f29602g - i10 < 8) {
                H(8);
                i10 = this.f29604i;
            }
            byte[] bArr = this.f29601f;
            this.f29604i = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:71:0x0068, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int D() {
            /*
                r5 = this;
                int r0 = r5.f29604i
                int r1 = r5.f29602g
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f29601f
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f29604i = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.F()
                int r1 = (int) r0
                return r1
            L70:
                r5.f29604i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.i.b.D():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:85:0x00b4, code lost:
            if (r2[r0] < 0) goto L42;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long E() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: w1.i.b.E():long");
        }

        public final long F() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                if (this.f29604i == this.f29602g) {
                    H(1);
                }
                byte[] bArr = this.f29601f;
                int i11 = this.f29604i;
                this.f29604i = i11 + 1;
                byte b10 = bArr[i11];
                j10 |= (b10 & Byte.MAX_VALUE) << i10;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            }
            throw z.c();
        }

        public final void G() {
            int i10 = this.f29602g + this.f29603h;
            this.f29602g = i10;
            int i11 = this.f29606k + i10;
            int i12 = this.f29607l;
            if (i11 <= i12) {
                this.f29603h = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f29603h = i13;
            this.f29602g = i10 - i13;
        }

        public final void H(int i10) {
            if (!J(i10)) {
                if (i10 > (this.f29591c - this.f29606k) - this.f29604i) {
                    throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                throw z.f();
            }
        }

        public final void I(int i10) {
            int i11 = this.f29602g;
            int i12 = this.f29604i;
            if (i10 <= i11 - i12 && i10 >= 0) {
                this.f29604i = i12 + i10;
            } else if (i10 < 0) {
                throw z.d();
            } else {
                int i13 = this.f29606k;
                int i14 = i13 + i12;
                int i15 = i14 + i10;
                int i16 = this.f29607l;
                if (i15 > i16) {
                    I((i16 - i13) - i12);
                    throw z.f();
                }
                this.f29606k = i14;
                int i17 = i11 - i12;
                this.f29602g = 0;
                this.f29604i = 0;
                while (i17 < i10) {
                    try {
                        long j10 = i10 - i17;
                        long skip = this.f29600e.skip(j10);
                        int i18 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                        if (i18 < 0 || skip > j10) {
                            throw new IllegalStateException(this.f29600e.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i18 == 0) {
                            break;
                        } else {
                            i17 += (int) skip;
                        }
                    } finally {
                        this.f29606k += i17;
                        G();
                    }
                }
                if (i17 >= i10) {
                    return;
                }
                int i19 = this.f29602g;
                int i20 = i19 - this.f29604i;
                this.f29604i = i19;
                while (true) {
                    H(1);
                    int i21 = i10 - i20;
                    int i22 = this.f29602g;
                    if (i21 <= i22) {
                        this.f29604i = i21;
                        return;
                    } else {
                        i20 += i22;
                        this.f29604i = i22;
                    }
                }
            }
        }

        public final boolean J(int i10) {
            int i11 = this.f29604i;
            int i12 = i11 + i10;
            int i13 = this.f29602g;
            if (i12 > i13) {
                int i14 = this.f29591c;
                int i15 = this.f29606k;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f29607l) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f29601f;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f29606k += i11;
                    this.f29602g -= i11;
                    this.f29604i = 0;
                }
                InputStream inputStream = this.f29600e;
                byte[] bArr2 = this.f29601f;
                int i16 = this.f29602g;
                int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f29591c - this.f29606k) - i16));
                if (read != 0 && read >= -1 && read <= this.f29601f.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f29602g += read;
                    G();
                    if (this.f29602g >= i10) {
                        return true;
                    }
                    return J(i10);
                }
                throw new IllegalStateException(this.f29600e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            throw new IllegalStateException(androidx.activity.i.a("refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }

        @Override // w1.i
        public final void a(int i10) {
            if (this.f29605j == i10) {
                return;
            }
            throw new z("Protocol message end-group tag did not match expected tag.");
        }

        @Override // w1.i
        public final int b() {
            return this.f29606k + this.f29604i;
        }

        @Override // w1.i
        public final boolean c() {
            return this.f29604i == this.f29602g && !J(1);
        }

        @Override // w1.i
        public final void d(int i10) {
            this.f29607l = i10;
            G();
        }

        @Override // w1.i
        public final int e(int i10) {
            if (i10 >= 0) {
                int i11 = this.f29606k + this.f29604i + i10;
                int i12 = this.f29607l;
                if (i11 <= i12) {
                    this.f29607l = i11;
                    G();
                    return i12;
                }
                throw z.f();
            }
            throw z.d();
        }

        @Override // w1.i
        public final boolean f() {
            return E() != 0;
        }

        @Override // w1.i
        public final g.e g() {
            int D = D();
            int i10 = this.f29602g;
            int i11 = this.f29604i;
            if (D <= i10 - i11 && D > 0) {
                g.e f10 = g.f(this.f29601f, i11, D);
                this.f29604i += D;
                return f10;
            } else if (D == 0) {
                return g.f29563b;
            } else {
                byte[] z10 = z(D);
                if (z10 != null) {
                    return g.f(z10, 0, z10.length);
                }
                int i12 = this.f29604i;
                int i13 = this.f29602g;
                int i14 = i13 - i12;
                this.f29606k += i13;
                this.f29604i = 0;
                this.f29602g = 0;
                ArrayList A = A(D - i14);
                byte[] bArr = new byte[D];
                System.arraycopy(this.f29601f, i12, bArr, 0, i14);
                Iterator it = A.iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                    i14 += bArr2.length;
                }
                g.e eVar = g.f29563b;
                return new g.e(bArr);
            }
        }

        @Override // w1.i
        public final double h() {
            return Double.longBitsToDouble(C());
        }

        @Override // w1.i
        public final int i() {
            return D();
        }

        @Override // w1.i
        public final int j() {
            return B();
        }

        @Override // w1.i
        public final long k() {
            return C();
        }

        @Override // w1.i
        public final float l() {
            return Float.intBitsToFloat(B());
        }

        @Override // w1.i
        public final int m() {
            return D();
        }

        @Override // w1.i
        public final long n() {
            return E();
        }

        @Override // w1.i
        public final int o() {
            return B();
        }

        @Override // w1.i
        public final long p() {
            return C();
        }

        @Override // w1.i
        public final int q() {
            int D = D();
            return (-(D & 1)) ^ (D >>> 1);
        }

        @Override // w1.i
        public final long r() {
            long E = E();
            return (-(E & 1)) ^ (E >>> 1);
        }

        @Override // w1.i
        public final String s() {
            int D = D();
            if (D > 0) {
                int i10 = this.f29602g;
                int i11 = this.f29604i;
                if (D <= i10 - i11) {
                    String str = new String(this.f29601f, i11, D, y.f29729a);
                    this.f29604i += D;
                    return str;
                }
            }
            if (D == 0) {
                return "";
            }
            if (D <= this.f29602g) {
                H(D);
                String str2 = new String(this.f29601f, this.f29604i, D, y.f29729a);
                this.f29604i += D;
                return str2;
            }
            return new String(y(D), y.f29729a);
        }

        @Override // w1.i
        public final String t() {
            byte[] y10;
            byte[] bArr;
            int D = D();
            int i10 = this.f29604i;
            int i11 = this.f29602g;
            if (D <= i11 - i10 && D > 0) {
                bArr = this.f29601f;
                this.f29604i = i10 + D;
            } else if (D == 0) {
                return "";
            } else {
                if (D <= i11) {
                    H(D);
                    y10 = this.f29601f;
                    this.f29604i = D + 0;
                } else {
                    y10 = y(D);
                }
                bArr = y10;
                i10 = 0;
            }
            return o1.f29660a.a(bArr, i10, D);
        }

        @Override // w1.i
        public final int u() {
            if (c()) {
                this.f29605j = 0;
                return 0;
            }
            int D = D();
            this.f29605j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw new z("Protocol message contained an invalid tag (zero).");
        }

        @Override // w1.i
        public final int v() {
            return D();
        }

        @Override // w1.i
        public final long w() {
            return E();
        }

        @Override // w1.i
        public final boolean x(int i10) {
            int i11;
            int u10;
            int i12 = i10 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                return false;
                            }
                            if (i12 == 5) {
                                I(4);
                                return true;
                            }
                            int i14 = z.f29731a;
                            throw new z.a();
                        }
                        do {
                            u10 = u();
                            if (u10 == 0) {
                                break;
                            }
                        } while (x(u10));
                        a(((i10 >>> 3) << 3) | 4);
                        return true;
                    }
                    i11 = D();
                } else {
                    i11 = 8;
                }
                I(i11);
                return true;
            }
            if (this.f29602g - this.f29604i >= 10) {
                while (i13 < 10) {
                    byte[] bArr = this.f29601f;
                    int i15 = this.f29604i;
                    this.f29604i = i15 + 1;
                    if (bArr[i15] < 0) {
                        i13++;
                    }
                }
                throw z.c();
            }
            while (i13 < 10) {
                if (this.f29604i == this.f29602g) {
                    H(1);
                }
                byte[] bArr2 = this.f29601f;
                int i16 = this.f29604i;
                this.f29604i = i16 + 1;
                if (bArr2[i16] < 0) {
                    i13++;
                }
            }
            throw z.c();
            return true;
        }

        public final byte[] y(int i10) {
            byte[] z10 = z(i10);
            if (z10 != null) {
                return z10;
            }
            int i11 = this.f29604i;
            int i12 = this.f29602g;
            int i13 = i12 - i11;
            this.f29606k += i12;
            this.f29604i = 0;
            this.f29602g = 0;
            ArrayList A = A(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f29601f, i11, bArr, 0, i13);
            Iterator it = A.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] z(int i10) {
            if (i10 == 0) {
                return y.f29730b;
            }
            if (i10 >= 0) {
                int i11 = this.f29606k;
                int i12 = this.f29604i;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f29591c <= 0) {
                    int i14 = this.f29607l;
                    if (i13 <= i14) {
                        int i15 = this.f29602g - i12;
                        int i16 = i10 - i15;
                        if (i16 >= 4096 && i16 > this.f29600e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f29601f, this.f29604i, bArr, 0, i15);
                        this.f29606k += this.f29602g;
                        this.f29604i = 0;
                        this.f29602g = 0;
                        while (i15 < i10) {
                            int read = this.f29600e.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f29606k += read;
                                i15 += read;
                            } else {
                                throw z.f();
                            }
                        }
                        return bArr;
                    }
                    I((i14 - i11) - i12);
                    throw z.f();
                }
                throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw z.d();
        }
    }

    public abstract void a(int i10);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i10);

    public abstract int e(int i10);

    public abstract boolean f();

    public abstract g.e g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i10);
}
