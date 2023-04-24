package ln;

import a0.q0;
import androidx.appcompat.widget.e2;
import androidx.appcompat.widget.u0;
import bi.m0;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import no.nordicsemi.android.dfu.DfuBaseService;
import s.p1;

/* loaded from: classes2.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: a */
    public t f20097a;

    /* renamed from: b */
    public long f20098b;

    /* loaded from: classes2.dex */
    public static final class a extends InputStream {
        public a() {
            e.this = r1;
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(e.this.f20098b, Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            e eVar = e.this;
            if (eVar.f20098b > 0) {
                return eVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            gm.l.f(bArr, "sink");
            return e.this.read(bArr, i10, i11);
        }

        public final String toString() {
            return e.this + ".inputStream()";
        }
    }

    @Override // ln.g
    public final boolean A() {
        return this.f20098b == 0;
    }

    @Override // ln.f
    public final long B(y yVar) {
        gm.l.f(yVar, "source");
        long j10 = 0;
        while (true) {
            long V = yVar.V(this, (long) DfuBaseService.ERROR_REMOTE_MASK);
            if (V == -1) {
                return j10;
            }
            j10 += V;
        }
    }

    @Override // ln.g
    public final void B0(long j10) {
        if (this.f20098b < j10) {
            throw new EOFException();
        }
    }

    public final long C(byte b10, long j10, long j11) {
        boolean z10;
        t tVar;
        long j12 = 0;
        if (0 <= j10 && j11 >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j13 = this.f20098b;
            if (j11 > j13) {
                j11 = j13;
            }
            if (j10 != j11 && (tVar = this.f20097a) != null) {
                if (j13 - j10 < j10) {
                    while (j13 > j10) {
                        tVar = tVar.f20137g;
                        gm.l.c(tVar);
                        j13 -= tVar.f20133c - tVar.f20132b;
                    }
                    while (j13 < j11) {
                        byte[] bArr = tVar.f20131a;
                        int min = (int) Math.min(tVar.f20133c, (tVar.f20132b + j11) - j13);
                        for (int i10 = (int) ((tVar.f20132b + j10) - j13); i10 < min; i10++) {
                            if (bArr[i10] == b10) {
                                return (i10 - tVar.f20132b) + j13;
                            }
                        }
                        j13 += tVar.f20133c - tVar.f20132b;
                        tVar = tVar.f20136f;
                        gm.l.c(tVar);
                        j10 = j13;
                    }
                } else {
                    while (true) {
                        long j14 = (tVar.f20133c - tVar.f20132b) + j12;
                        if (j14 > j10) {
                            break;
                        }
                        tVar = tVar.f20136f;
                        gm.l.c(tVar);
                        j12 = j14;
                    }
                    while (j12 < j11) {
                        byte[] bArr2 = tVar.f20131a;
                        int min2 = (int) Math.min(tVar.f20133c, (tVar.f20132b + j11) - j12);
                        for (int i11 = (int) ((tVar.f20132b + j10) - j12); i11 < min2; i11++) {
                            if (bArr2[i11] == b10) {
                                return (i11 - tVar.f20132b) + j12;
                            }
                        }
                        j12 += tVar.f20133c - tVar.f20132b;
                        tVar = tVar.f20136f;
                        gm.l.c(tVar);
                        j10 = j12;
                    }
                }
            }
            return -1L;
        }
        StringBuilder a10 = android.support.v4.media.d.a("size=");
        a10.append(this.f20098b);
        a10.append(" fromIndex=");
        a10.append(j10);
        a10.append(" toIndex=");
        a10.append(j11);
        throw new IllegalArgumentException(a10.toString().toString());
    }

    public final long D(long j10, h hVar) {
        boolean z10;
        long j11 = j10;
        gm.l.f(hVar, "bytes");
        boolean z11 = true;
        if (hVar.f20103c.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j12 = 0;
            if (j11 < 0) {
                z11 = false;
            }
            if (z11) {
                t tVar = this.f20097a;
                if (tVar != null) {
                    long j13 = this.f20098b;
                    if (j13 - j11 < j11) {
                        while (j13 > j11) {
                            tVar = tVar.f20137g;
                            gm.l.c(tVar);
                            j13 -= tVar.f20133c - tVar.f20132b;
                        }
                        byte[] bArr = hVar.f20103c;
                        byte b10 = bArr[0];
                        int length = bArr.length;
                        long j14 = (this.f20098b - length) + 1;
                        while (j13 < j14) {
                            byte[] bArr2 = tVar.f20131a;
                            long j15 = j14;
                            int min = (int) Math.min(tVar.f20133c, (tVar.f20132b + j14) - j13);
                            for (int i10 = (int) ((tVar.f20132b + j11) - j13); i10 < min; i10++) {
                                if (bArr2[i10] == b10 && mn.a.a(tVar, i10 + 1, bArr, length)) {
                                    return (i10 - tVar.f20132b) + j13;
                                }
                            }
                            j13 += tVar.f20133c - tVar.f20132b;
                            tVar = tVar.f20136f;
                            gm.l.c(tVar);
                            j11 = j13;
                            j14 = j15;
                        }
                    } else {
                        while (true) {
                            long j16 = (tVar.f20133c - tVar.f20132b) + j12;
                            if (j16 > j11) {
                                break;
                            }
                            tVar = tVar.f20136f;
                            gm.l.c(tVar);
                            j12 = j16;
                        }
                        byte[] bArr3 = hVar.f20103c;
                        byte b11 = bArr3[0];
                        int length2 = bArr3.length;
                        long j17 = (this.f20098b - length2) + 1;
                        while (j12 < j17) {
                            byte[] bArr4 = tVar.f20131a;
                            long j18 = j17;
                            int min2 = (int) Math.min(tVar.f20133c, (tVar.f20132b + j17) - j12);
                            for (int i11 = (int) ((tVar.f20132b + j11) - j12); i11 < min2; i11++) {
                                if (bArr4[i11] == b11 && mn.a.a(tVar, i11 + 1, bArr3, length2)) {
                                    return (i11 - tVar.f20132b) + j12;
                                }
                            }
                            j12 += tVar.f20133c - tVar.f20132b;
                            tVar = tVar.f20136f;
                            gm.l.c(tVar);
                            j11 = j12;
                            j17 = j18;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(q0.a("fromIndex < 0: ", j11).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // ln.f
    public final /* bridge */ /* synthetic */ f D0(long j10) {
        e0(j10);
        return this;
    }

    public final long E(long j10, h hVar) {
        boolean z10;
        int i10;
        int i11;
        long j11 = j10;
        gm.l.f(hVar, "targetBytes");
        long j12 = 0;
        if (j11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            t tVar = this.f20097a;
            if (tVar == null) {
                return -1L;
            }
            long j13 = this.f20098b;
            if (j13 - j11 < j11) {
                while (j13 > j11) {
                    tVar = tVar.f20137g;
                    gm.l.c(tVar);
                    j13 -= tVar.f20133c - tVar.f20132b;
                }
                byte[] bArr = hVar.f20103c;
                if (bArr.length == 2) {
                    byte b10 = bArr[0];
                    byte b11 = bArr[1];
                    while (j13 < this.f20098b) {
                        byte[] bArr2 = tVar.f20131a;
                        i11 = (int) ((tVar.f20132b + j11) - j13);
                        int i12 = tVar.f20133c;
                        while (i11 < i12) {
                            byte b12 = bArr2[i11];
                            if (b12 != b10 && b12 != b11) {
                                i11++;
                            }
                        }
                        j13 += tVar.f20133c - tVar.f20132b;
                        tVar = tVar.f20136f;
                        gm.l.c(tVar);
                        j11 = j13;
                    }
                    return -1L;
                }
                while (j13 < this.f20098b) {
                    byte[] bArr3 = tVar.f20131a;
                    i11 = (int) ((tVar.f20132b + j11) - j13);
                    int i13 = tVar.f20133c;
                    while (i11 < i13) {
                        byte b13 = bArr3[i11];
                        for (byte b14 : bArr) {
                            if (b13 != b14) {
                            }
                        }
                        i11++;
                    }
                    j13 += tVar.f20133c - tVar.f20132b;
                    tVar = tVar.f20136f;
                    gm.l.c(tVar);
                    j11 = j13;
                }
                return -1L;
                return (i11 - tVar.f20132b) + j13;
            }
            while (true) {
                long j14 = (tVar.f20133c - tVar.f20132b) + j12;
                if (j14 > j11) {
                    break;
                }
                tVar = tVar.f20136f;
                gm.l.c(tVar);
                j12 = j14;
            }
            byte[] bArr4 = hVar.f20103c;
            if (bArr4.length == 2) {
                byte b15 = bArr4[0];
                byte b16 = bArr4[1];
                while (j12 < this.f20098b) {
                    byte[] bArr5 = tVar.f20131a;
                    i10 = (int) ((tVar.f20132b + j11) - j12);
                    int i14 = tVar.f20133c;
                    while (i10 < i14) {
                        byte b17 = bArr5[i10];
                        if (b17 != b15 && b17 != b16) {
                            i10++;
                        }
                    }
                    j12 += tVar.f20133c - tVar.f20132b;
                    tVar = tVar.f20136f;
                    gm.l.c(tVar);
                    j11 = j12;
                }
                return -1L;
            }
            while (j12 < this.f20098b) {
                byte[] bArr6 = tVar.f20131a;
                i10 = (int) ((tVar.f20132b + j11) - j12);
                int i15 = tVar.f20133c;
                while (i10 < i15) {
                    byte b18 = bArr6[i10];
                    for (byte b19 : bArr4) {
                        if (b18 != b19) {
                        }
                    }
                    i10++;
                }
                j12 += tVar.f20133c - tVar.f20132b;
                tVar = tVar.f20136f;
                gm.l.c(tVar);
                j11 = j12;
            }
            return -1L;
            return (i10 - tVar.f20132b) + j12;
        }
        throw new IllegalArgumentException(q0.a("fromIndex < 0: ", j11).toString());
    }

    public final byte[] F(long j10) {
        boolean z10;
        int i10 = 0;
        if (j10 >= 0 && j10 <= Integer.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f20098b >= j10) {
                int i11 = (int) j10;
                byte[] bArr = new byte[i11];
                while (i10 < i11) {
                    int read = read(bArr, i10, i11 - i10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(q0.a("byteCount: ", j10).toString());
    }

    @Override // ln.g
    public final String G(long j10) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long C = C(b10, 0L, j11);
            if (C != -1) {
                return mn.a.b(this, C);
            }
            if (j11 < this.f20098b && y(j11 - 1) == ((byte) 13) && y(j11) == b10) {
                return mn.a.b(this, j11);
            }
            e eVar = new e();
            v(eVar, 0L, Math.min(32, this.f20098b));
            StringBuilder a10 = android.support.v4.media.d.a("\\n not found: limit=");
            a10.append(Math.min(this.f20098b, j10));
            a10.append(" content=");
            a10.append(eVar.I().e());
            a10.append((char) 8230);
            throw new EOFException(a10.toString());
        }
        throw new IllegalArgumentException(q0.a("limit < 0: ", j10).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b9 A[EDGE_INSN: B:92:0x00b9->B:87:0x00b9 ?: BREAK  , SYNTHETIC] */
    @Override // ln.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long H0() {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.e.H0():long");
    }

    public final h I() {
        return n(this.f20098b);
    }

    public final String J(long j10, Charset charset) {
        boolean z10;
        gm.l.f(charset, "charset");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0 && j10 <= Integer.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f20098b >= j10) {
                if (i10 == 0) {
                    return "";
                }
                t tVar = this.f20097a;
                gm.l.c(tVar);
                int i11 = tVar.f20132b;
                if (i11 + j10 > tVar.f20133c) {
                    return new String(F(j10), charset);
                }
                int i12 = (int) j10;
                String str = new String(tVar.f20131a, i11, i12, charset);
                int i13 = tVar.f20132b + i12;
                tVar.f20132b = i13;
                this.f20098b -= j10;
                if (i13 == tVar.f20133c) {
                    this.f20097a = tVar.a();
                    u.a(tVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(q0.a("byteCount: ", j10).toString());
    }

    @Override // ln.g
    public final InputStream J0() {
        return new a();
    }

    public final String L() {
        return J(this.f20098b, om.a.f23623a);
    }

    @Override // ln.g
    public final long N(h hVar) {
        gm.l.f(hVar, "bytes");
        return D(0L, hVar);
    }

    @Override // ln.g
    public final int O(p pVar) {
        gm.l.f(pVar, "options");
        int c10 = mn.a.c(this, pVar, false);
        if (c10 == -1) {
            return -1;
        }
        skip(pVar.f20120a[c10].d());
        return c10;
    }

    public final String P(long j10) {
        return J(j10, om.a.f23623a);
    }

    public final int R() {
        int i10;
        int i11;
        int i12;
        if (this.f20098b != 0) {
            byte y10 = y(0L);
            if ((y10 & 128) == 0) {
                i10 = y10 & Byte.MAX_VALUE;
                i12 = 1;
                i11 = 0;
            } else if ((y10 & 224) == 192) {
                i10 = y10 & 31;
                i12 = 2;
                i11 = 128;
            } else if ((y10 & 240) == 224) {
                i10 = y10 & 15;
                i12 = 3;
                i11 = 2048;
            } else if ((y10 & 248) == 240) {
                i10 = y10 & 7;
                i11 = 65536;
                i12 = 4;
            } else {
                skip(1L);
                return 65533;
            }
            long j10 = i12;
            if (this.f20098b >= j10) {
                for (int i13 = 1; i13 < i12; i13++) {
                    long j11 = i13;
                    byte y11 = y(j11);
                    if ((y11 & 192) == 128) {
                        i10 = (i10 << 6) | (y11 & 63);
                    } else {
                        skip(j11);
                        return 65533;
                    }
                }
                skip(j10);
                if (i10 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i10 && 57343 >= i10) || i10 < i11) {
                    return 65533;
                }
                return i10;
            }
            StringBuilder a10 = e2.a("size < ", i12, ": ");
            a10.append(this.f20098b);
            a10.append(" (to read code point prefixed 0x");
            char[] cArr = p001if.d.f16806a;
            a10.append(new String(new char[]{cArr[(y10 >> 4) & 15], cArr[y10 & 15]}));
            a10.append(')');
            throw new EOFException(a10.toString());
        }
        throw new EOFException();
    }

    @Override // ln.f
    public final /* bridge */ /* synthetic */ f S(String str) {
        p0(str);
        return this;
    }

    @Override // ln.y
    public final long V(e eVar, long j10) {
        boolean z10;
        gm.l.f(eVar, "sink");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = this.f20098b;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            eVar.c0(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(q0.a("byteCount < 0: ", j10).toString());
    }

    public final h W(int i10) {
        if (i10 == 0) {
            return h.f20100d;
        }
        m0.g(this.f20098b, 0L, i10);
        t tVar = this.f20097a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            gm.l.c(tVar);
            int i14 = tVar.f20133c;
            int i15 = tVar.f20132b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                tVar = tVar.f20136f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        t tVar2 = this.f20097a;
        int i16 = 0;
        while (i11 < i10) {
            gm.l.c(tVar2);
            bArr[i16] = tVar2.f20131a;
            i11 += tVar2.f20133c - tVar2.f20132b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = tVar2.f20132b;
            tVar2.f20134d = true;
            i16++;
            tVar2 = tVar2.f20136f;
        }
        return new v(bArr, iArr);
    }

    public final t X(int i10) {
        boolean z10 = true;
        if ((i10 < 1 || i10 > 8192) ? false : false) {
            t tVar = this.f20097a;
            if (tVar == null) {
                t b10 = u.b();
                this.f20097a = b10;
                b10.f20137g = b10;
                b10.f20136f = b10;
                return b10;
            }
            t tVar2 = tVar.f20137g;
            gm.l.c(tVar2);
            if (tVar2.f20133c + i10 > 8192 || !tVar2.f20135e) {
                t b11 = u.b();
                tVar2.b(b11);
                return b11;
            }
            return tVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void Z(h hVar) {
        gm.l.f(hVar, "byteString");
        hVar.l(this, hVar.d());
    }

    public final void a() {
        skip(this.f20098b);
    }

    @Override // ln.f
    public final /* bridge */ /* synthetic */ f a0(long j10) {
        h0(j10);
        return this;
    }

    /* renamed from: b */
    public final e clone() {
        e eVar = new e();
        if (this.f20098b != 0) {
            t tVar = this.f20097a;
            gm.l.c(tVar);
            t c10 = tVar.c();
            eVar.f20097a = c10;
            c10.f20137g = c10;
            c10.f20136f = c10;
            for (t tVar2 = tVar.f20136f; tVar2 != tVar; tVar2 = tVar2.f20136f) {
                t tVar3 = c10.f20137g;
                gm.l.c(tVar3);
                gm.l.c(tVar2);
                tVar3.b(tVar2.c());
            }
            eVar.f20098b = this.f20098b;
        }
        return eVar;
    }

    public final void b0(int i10) {
        t X = X(1);
        byte[] bArr = X.f20131a;
        int i11 = X.f20133c;
        X.f20133c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f20098b++;
    }

    @Override // ln.w
    public final void c0(e eVar, long j10) {
        boolean z10;
        t tVar;
        boolean z11;
        int i10;
        t tVar2;
        boolean z12;
        t b10;
        int i11;
        gm.l.f(eVar, "source");
        if (eVar != this) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m0.g(eVar.f20098b, 0L, j10);
            while (j10 > 0) {
                t tVar3 = eVar.f20097a;
                gm.l.c(tVar3);
                int i12 = tVar3.f20133c;
                gm.l.c(eVar.f20097a);
                if (j10 < i12 - tVar.f20132b) {
                    t tVar4 = this.f20097a;
                    if (tVar4 != null) {
                        tVar2 = tVar4.f20137g;
                    } else {
                        tVar2 = null;
                    }
                    if (tVar2 != null && tVar2.f20135e) {
                        long j11 = tVar2.f20133c + j10;
                        if (tVar2.f20134d) {
                            i11 = 0;
                        } else {
                            i11 = tVar2.f20132b;
                        }
                        if (j11 - i11 <= ((long) DfuBaseService.ERROR_REMOTE_MASK)) {
                            t tVar5 = eVar.f20097a;
                            gm.l.c(tVar5);
                            tVar5.d(tVar2, (int) j10);
                            eVar.f20098b -= j10;
                            this.f20098b += j10;
                            return;
                        }
                    }
                    t tVar6 = eVar.f20097a;
                    gm.l.c(tVar6);
                    int i13 = (int) j10;
                    if (i13 > 0 && i13 <= tVar6.f20133c - tVar6.f20132b) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (i13 >= 1024) {
                            b10 = tVar6.c();
                        } else {
                            b10 = u.b();
                            byte[] bArr = tVar6.f20131a;
                            byte[] bArr2 = b10.f20131a;
                            int i14 = tVar6.f20132b;
                            ul.i.v(0, i14, i14 + i13, bArr, bArr2);
                        }
                        b10.f20133c = b10.f20132b + i13;
                        tVar6.f20132b += i13;
                        t tVar7 = tVar6.f20137g;
                        gm.l.c(tVar7);
                        tVar7.b(b10);
                        eVar.f20097a = b10;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                t tVar8 = eVar.f20097a;
                gm.l.c(tVar8);
                long j12 = tVar8.f20133c - tVar8.f20132b;
                eVar.f20097a = tVar8.a();
                t tVar9 = this.f20097a;
                if (tVar9 == null) {
                    this.f20097a = tVar8;
                    tVar8.f20137g = tVar8;
                    tVar8.f20136f = tVar8;
                } else {
                    t tVar10 = tVar9.f20137g;
                    gm.l.c(tVar10);
                    tVar10.b(tVar8);
                    t tVar11 = tVar8.f20137g;
                    if (tVar11 != tVar8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        gm.l.c(tVar11);
                        if (tVar11.f20135e) {
                            int i15 = tVar8.f20133c - tVar8.f20132b;
                            t tVar12 = tVar8.f20137g;
                            gm.l.c(tVar12);
                            int i16 = DfuBaseService.ERROR_REMOTE_MASK - tVar12.f20133c;
                            t tVar13 = tVar8.f20137g;
                            gm.l.c(tVar13);
                            if (tVar13.f20134d) {
                                i10 = 0;
                            } else {
                                t tVar14 = tVar8.f20137g;
                                gm.l.c(tVar14);
                                i10 = tVar14.f20132b;
                            }
                            if (i15 <= i16 + i10) {
                                t tVar15 = tVar8.f20137g;
                                gm.l.c(tVar15);
                                tVar8.d(tVar15, i15);
                                tVar8.a();
                                u.a(tVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                eVar.f20098b -= j12;
                this.f20098b += j12;
                j10 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ln.g, ln.f
    public final e d() {
        return this;
    }

    @Override // ln.y
    public final z e() {
        return z.f20144d;
    }

    public final e e0(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            b0(48);
        } else {
            boolean z10 = false;
            int i11 = 1;
            if (i10 < 0) {
                j10 = -j10;
                if (j10 < 0) {
                    p0("-9223372036854775808");
                } else {
                    z10 = true;
                }
            }
            if (j10 < 100000000) {
                if (j10 < 10000) {
                    if (j10 < 100) {
                        if (j10 >= 10) {
                            i11 = 2;
                        }
                    } else if (j10 < 1000) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (j10 < 1000000) {
                    if (j10 < 100000) {
                        i11 = 5;
                    } else {
                        i11 = 6;
                    }
                } else if (j10 < 10000000) {
                    i11 = 7;
                } else {
                    i11 = 8;
                }
            } else if (j10 < 1000000000000L) {
                if (j10 < 10000000000L) {
                    if (j10 < 1000000000) {
                        i11 = 9;
                    } else {
                        i11 = 10;
                    }
                } else if (j10 < 100000000000L) {
                    i11 = 11;
                } else {
                    i11 = 12;
                }
            } else if (j10 < 1000000000000000L) {
                if (j10 < 10000000000000L) {
                    i11 = 13;
                } else if (j10 < 100000000000000L) {
                    i11 = 14;
                } else {
                    i11 = 15;
                }
            } else if (j10 < 100000000000000000L) {
                if (j10 < 10000000000000000L) {
                    i11 = 16;
                } else {
                    i11 = 17;
                }
            } else if (j10 < 1000000000000000000L) {
                i11 = 18;
            } else {
                i11 = 19;
            }
            if (z10) {
                i11++;
            }
            t X = X(i11);
            byte[] bArr = X.f20131a;
            int i12 = X.f20133c + i11;
            while (j10 != 0) {
                long j11 = 10;
                i12--;
                bArr[i12] = mn.a.f21894a[(int) (j10 % j11)];
                j10 /= j11;
            }
            if (z10) {
                bArr[i12 - 1] = (byte) 45;
            }
            X.f20133c += i11;
            this.f20098b += i11;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            long j10 = this.f20098b;
            e eVar = (e) obj;
            if (j10 != eVar.f20098b) {
                return false;
            }
            if (j10 != 0) {
                t tVar = this.f20097a;
                gm.l.c(tVar);
                t tVar2 = eVar.f20097a;
                gm.l.c(tVar2);
                int i10 = tVar.f20132b;
                int i11 = tVar2.f20132b;
                long j11 = 0;
                while (j11 < this.f20098b) {
                    long min = Math.min(tVar.f20133c - i10, tVar2.f20133c - i11);
                    long j12 = 0;
                    while (j12 < min) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (tVar.f20131a[i10] != tVar2.f20131a[i11]) {
                            return false;
                        }
                        j12++;
                        i10 = i12;
                        i11 = i13;
                    }
                    if (i10 == tVar.f20133c) {
                        tVar = tVar.f20136f;
                        gm.l.c(tVar);
                        i10 = tVar.f20132b;
                    }
                    if (i11 == tVar2.f20133c) {
                        tVar2 = tVar2.f20136f;
                        gm.l.c(tVar2);
                        i11 = tVar2.f20132b;
                    }
                    j11 += min;
                }
            }
        }
        return true;
    }

    @Override // ln.f, ln.w, java.io.Flushable
    public final void flush() {
    }

    @Override // ln.g
    public final boolean g(long j10) {
        return this.f20098b >= j10;
    }

    @Override // ln.f
    public final /* bridge */ /* synthetic */ f g0(int i10, int i11, String str) {
        n0(i10, i11, str);
        return this;
    }

    public final long h() {
        long j10 = this.f20098b;
        if (j10 == 0) {
            return 0L;
        }
        t tVar = this.f20097a;
        gm.l.c(tVar);
        t tVar2 = tVar.f20137g;
        gm.l.c(tVar2);
        int i10 = tVar2.f20133c;
        if (i10 < 8192 && tVar2.f20135e) {
            j10 -= i10 - tVar2.f20132b;
        }
        return j10;
    }

    public final e h0(long j10) {
        if (j10 == 0) {
            b0(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
            t X = X(i10);
            byte[] bArr = X.f20131a;
            int i11 = X.f20133c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                bArr[i12] = mn.a.f21894a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            X.f20133c += i10;
            this.f20098b += i10;
        }
        return this;
    }

    public final int hashCode() {
        t tVar = this.f20097a;
        if (tVar != null) {
            int i10 = 1;
            do {
                int i11 = tVar.f20133c;
                for (int i12 = tVar.f20132b; i12 < i11; i12++) {
                    i10 = (i10 * 31) + tVar.f20131a[i12];
                }
                tVar = tVar.f20136f;
                gm.l.c(tVar);
            } while (tVar != this.f20097a);
            return i10;
        }
        return 0;
    }

    public final void i0(int i10) {
        t X = X(4);
        byte[] bArr = X.f20131a;
        int i11 = X.f20133c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        X.f20133c = i14 + 1;
        this.f20098b += 4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // ln.g
    public final long k0(e eVar) {
        long j10 = this.f20098b;
        if (j10 > 0) {
            eVar.c0(this, j10);
        }
        return j10;
    }

    public final void l0(int i10) {
        t X = X(2);
        byte[] bArr = X.f20131a;
        int i11 = X.f20133c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        X.f20133c = i12 + 1;
        this.f20098b += 2;
    }

    @Override // ln.g
    public final h n(long j10) {
        boolean z10;
        if (j10 >= 0 && j10 <= Integer.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f20098b >= j10) {
                if (j10 >= 4096) {
                    h W = W((int) j10);
                    skip(j10);
                    return W;
                }
                return new h(F(j10));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(q0.a("byteCount: ", j10).toString());
    }

    public final void n0(int i10, int i11, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        char charAt;
        long j10;
        long j11;
        char c10;
        gm.l.f(str, "string");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= str.length()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    while (i10 < i11) {
                        char charAt2 = str.charAt(i10);
                        if (charAt2 < 128) {
                            t X = X(1);
                            byte[] bArr = X.f20131a;
                            int i12 = X.f20133c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                    break;
                                }
                                i13 = i10 + 1;
                                bArr[i10 + i12] = (byte) charAt;
                            }
                            int i14 = X.f20133c;
                            int i15 = (i12 + i10) - i14;
                            X.f20133c = i14 + i15;
                            this.f20098b += i15;
                        } else {
                            if (charAt2 < 2048) {
                                t X2 = X(2);
                                byte[] bArr2 = X2.f20131a;
                                int i16 = X2.f20133c;
                                bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                X2.f20133c = i16 + 2;
                                j10 = this.f20098b;
                                j11 = 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i17 = i10 + 1;
                                if (i17 < i11) {
                                    c10 = str.charAt(i17);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c10 && 57343 >= c10) {
                                    int i18 = (((charAt2 & 1023) << 10) | (c10 & 1023)) + 65536;
                                    t X3 = X(4);
                                    byte[] bArr3 = X3.f20131a;
                                    int i19 = X3.f20133c;
                                    bArr3[i19] = (byte) ((i18 >> 18) | 240);
                                    bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                    bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                    bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                    X3.f20133c = i19 + 4;
                                    this.f20098b += 4;
                                    i10 += 2;
                                } else {
                                    b0(63);
                                    i10 = i17;
                                }
                            } else {
                                t X4 = X(3);
                                byte[] bArr4 = X4.f20131a;
                                int i20 = X4.f20133c;
                                bArr4[i20] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                                X4.f20133c = i20 + 3;
                                j10 = this.f20098b;
                                j11 = 3;
                            }
                            this.f20098b = j10 + j11;
                            i10++;
                        }
                    }
                    return;
                }
                StringBuilder a10 = e2.a("endIndex > string.length: ", i11, " > ");
                a10.append(str.length());
                throw new IllegalArgumentException(a10.toString().toString());
            }
            throw new IllegalArgumentException(p1.a("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(u0.a("beginIndex < 0: ", i10).toString());
    }

    @Override // ln.g
    public final String o0() {
        return G(Long.MAX_VALUE);
    }

    public final void p0(String str) {
        gm.l.f(str, "string");
        n0(0, str.length(), str);
    }

    public final void q0(int i10) {
        String str;
        long j10;
        long j11;
        if (i10 < 128) {
            b0(i10);
            return;
        }
        if (i10 < 2048) {
            t X = X(2);
            byte[] bArr = X.f20131a;
            int i11 = X.f20133c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            X.f20133c = i11 + 2;
            j10 = this.f20098b;
            j11 = 2;
        } else if (55296 <= i10 && 57343 >= i10) {
            b0(63);
            return;
        } else if (i10 < 65536) {
            t X2 = X(3);
            byte[] bArr2 = X2.f20131a;
            int i12 = X2.f20133c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            X2.f20133c = i12 + 3;
            j10 = this.f20098b;
            j11 = 3;
        } else if (i10 <= 1114111) {
            t X3 = X(4);
            byte[] bArr3 = X3.f20131a;
            int i13 = X3.f20133c;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            X3.f20133c = i13 + 4;
            j10 = this.f20098b;
            j11 = 4;
        } else {
            StringBuilder a10 = android.support.v4.media.d.a("Unexpected code point: 0x");
            if (i10 != 0) {
                char[] cArr = p001if.d.f16806a;
                int i14 = 0;
                char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
                while (i14 < 8 && cArr2[i14] == '0') {
                    i14++;
                }
                str = new String(cArr2, i14, 8 - i14);
            } else {
                str = "0";
            }
            a10.append(str);
            throw new IllegalArgumentException(a10.toString());
        }
        this.f20098b = j10 + j11;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        gm.l.f(byteBuffer, "sink");
        t tVar = this.f20097a;
        if (tVar != null) {
            int min = Math.min(byteBuffer.remaining(), tVar.f20133c - tVar.f20132b);
            byteBuffer.put(tVar.f20131a, tVar.f20132b, min);
            int i10 = tVar.f20132b + min;
            tVar.f20132b = i10;
            this.f20098b -= min;
            if (i10 == tVar.f20133c) {
                this.f20097a = tVar.a();
                u.a(tVar);
            }
            return min;
        }
        return -1;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        gm.l.f(bArr, "sink");
        m0.g(bArr.length, i10, i11);
        t tVar = this.f20097a;
        if (tVar != null) {
            int min = Math.min(i11, tVar.f20133c - tVar.f20132b);
            byte[] bArr2 = tVar.f20131a;
            int i12 = tVar.f20132b;
            ul.i.v(i10, i12, i12 + min, bArr2, bArr);
            int i13 = tVar.f20132b + min;
            tVar.f20132b = i13;
            this.f20098b -= min;
            if (i13 == tVar.f20133c) {
                this.f20097a = tVar.a();
                u.a(tVar);
                return min;
            }
            return min;
        }
        return -1;
    }

    @Override // ln.g
    public final byte readByte() {
        if (this.f20098b != 0) {
            t tVar = this.f20097a;
            gm.l.c(tVar);
            int i10 = tVar.f20132b;
            int i11 = tVar.f20133c;
            int i12 = i10 + 1;
            byte b10 = tVar.f20131a[i10];
            this.f20098b--;
            if (i12 == i11) {
                this.f20097a = tVar.a();
                u.a(tVar);
            } else {
                tVar.f20132b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // ln.g
    public final int readInt() {
        if (this.f20098b >= 4) {
            t tVar = this.f20097a;
            gm.l.c(tVar);
            int i10 = tVar.f20132b;
            int i11 = tVar.f20133c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = tVar.f20131a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            this.f20098b -= 4;
            if (i17 == i11) {
                this.f20097a = tVar.a();
                u.a(tVar);
            } else {
                tVar.f20132b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // ln.g
    public final short readShort() {
        if (this.f20098b >= 2) {
            t tVar = this.f20097a;
            gm.l.c(tVar);
            int i10 = tVar.f20132b;
            int i11 = tVar.f20133c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = tVar.f20131a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            this.f20098b -= 2;
            if (i13 == i11) {
                this.f20097a = tVar.a();
                u.a(tVar);
            } else {
                tVar.f20132b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override // ln.g
    public final void skip(long j10) {
        while (j10 > 0) {
            t tVar = this.f20097a;
            if (tVar != null) {
                int min = (int) Math.min(j10, tVar.f20133c - tVar.f20132b);
                long j11 = min;
                this.f20098b -= j11;
                j10 -= j11;
                int i10 = tVar.f20132b + min;
                tVar.f20132b = i10;
                if (i10 == tVar.f20133c) {
                    this.f20097a = tVar.a();
                    u.a(tVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final String toString() {
        boolean z10;
        long j10 = this.f20098b;
        if (j10 <= Integer.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return W((int) j10).toString();
        }
        StringBuilder a10 = android.support.v4.media.d.a("size > Int.MAX_VALUE: ");
        a10.append(this.f20098b);
        throw new IllegalStateException(a10.toString().toString());
    }

    @Override // ln.f
    public final /* bridge */ /* synthetic */ f u(h hVar) {
        Z(hVar);
        return this;
    }

    public final void v(e eVar, long j10, long j11) {
        gm.l.f(eVar, "out");
        m0.g(this.f20098b, j10, j11);
        if (j11 != 0) {
            eVar.f20098b += j11;
            t tVar = this.f20097a;
            while (true) {
                gm.l.c(tVar);
                long j12 = tVar.f20133c - tVar.f20132b;
                if (j10 < j12) {
                    break;
                }
                j10 -= j12;
                tVar = tVar.f20136f;
            }
            while (j11 > 0) {
                gm.l.c(tVar);
                t c10 = tVar.c();
                int i10 = c10.f20132b + ((int) j10);
                c10.f20132b = i10;
                c10.f20133c = Math.min(i10 + ((int) j11), c10.f20133c);
                t tVar2 = eVar.f20097a;
                if (tVar2 == null) {
                    c10.f20137g = c10;
                    c10.f20136f = c10;
                    eVar.f20097a = c10;
                } else {
                    t tVar3 = tVar2.f20137g;
                    gm.l.c(tVar3);
                    tVar3.b(c10);
                }
                j11 -= c10.f20133c - c10.f20132b;
                tVar = tVar.f20136f;
                j10 = 0;
            }
        }
    }

    @Override // ln.g
    public final boolean w(h hVar) {
        gm.l.f(hVar, "bytes");
        byte[] bArr = hVar.f20103c;
        int length = bArr.length;
        if (length < 0 || this.f20098b - 0 < length || bArr.length - 0 < length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (y(i10 + 0) != hVar.f20103c[0 + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        gm.l.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            t X = X(1);
            int min = Math.min(i10, 8192 - X.f20133c);
            byteBuffer.get(X.f20131a, X.f20133c, min);
            i10 -= min;
            X.f20133c += min;
        }
        this.f20098b += remaining;
        return remaining;
    }

    @Override // ln.f
    public final f write(byte[] bArr) {
        gm.l.f(bArr, "source");
        m14write(bArr, 0, bArr.length);
        return this;
    }

    @Override // ln.f
    public final /* bridge */ /* synthetic */ f write(byte[] bArr, int i10, int i11) {
        m14write(bArr, i10, i11);
        return this;
    }

    @Override // ln.f
    public final /* bridge */ /* synthetic */ f writeByte(int i10) {
        b0(i10);
        return this;
    }

    @Override // ln.f
    public final /* bridge */ /* synthetic */ f writeInt(int i10) {
        i0(i10);
        return this;
    }

    @Override // ln.f
    public final /* bridge */ /* synthetic */ f writeShort(int i10) {
        l0(i10);
        return this;
    }

    @Override // ln.g
    public final long x(h hVar) {
        gm.l.f(hVar, "targetBytes");
        return E(0L, hVar);
    }

    public final byte y(long j10) {
        m0.g(this.f20098b, j10, 1L);
        t tVar = this.f20097a;
        if (tVar != null) {
            long j11 = this.f20098b;
            if (j11 - j10 < j10) {
                while (j11 > j10) {
                    tVar = tVar.f20137g;
                    gm.l.c(tVar);
                    j11 -= tVar.f20133c - tVar.f20132b;
                }
                return tVar.f20131a[(int) ((tVar.f20132b + j10) - j11)];
            }
            long j12 = 0;
            while (true) {
                int i10 = tVar.f20133c;
                int i11 = tVar.f20132b;
                long j13 = (i10 - i11) + j12;
                if (j13 > j10) {
                    return tVar.f20131a[(int) ((i11 + j10) - j12)];
                }
                tVar = tVar.f20136f;
                gm.l.c(tVar);
                j12 = j13;
            }
        } else {
            gm.l.c(null);
            throw null;
        }
    }

    /* renamed from: write */
    public final void m14write(byte[] bArr, int i10, int i11) {
        gm.l.f(bArr, "source");
        long j10 = i11;
        m0.g(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            t X = X(1);
            int min = Math.min(i12 - i10, 8192 - X.f20133c);
            int i13 = i10 + min;
            ul.i.v(X.f20133c, i10, i13, bArr, X.f20131a);
            X.f20133c += min;
            i10 = i13;
        }
        this.f20098b += j10;
    }
}
