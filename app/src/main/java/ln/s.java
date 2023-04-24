package ln;

import a0.q0;
import bi.m0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class s implements g {

    /* renamed from: a */
    public final e f20127a;

    /* renamed from: b */
    public boolean f20128b;

    /* renamed from: c */
    public final y f20129c;

    public s(y yVar) {
        gm.l.f(yVar, "source");
        this.f20129c = yVar;
        this.f20127a = new e();
    }

    @Override // ln.g
    public final boolean A() {
        if (!this.f20128b) {
            return this.f20127a.A() && this.f20129c.V(this.f20127a, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.g
    public final void B0(long j10) {
        if (!g(j10)) {
            throw new EOFException();
        }
    }

    @Override // ln.g
    public final String G(long j10) {
        boolean z10;
        long j11;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long a10 = a(b10, 0L, j11);
            if (a10 != -1) {
                return mn.a.b(this.f20127a, a10);
            }
            if (j11 < Long.MAX_VALUE && g(j11) && this.f20127a.y(j11 - 1) == ((byte) 13) && g(1 + j11) && this.f20127a.y(j11) == b10) {
                return mn.a.b(this.f20127a, j11);
            }
            e eVar = new e();
            e eVar2 = this.f20127a;
            eVar2.v(eVar, 0L, Math.min(32, eVar2.f20098b));
            StringBuilder a11 = android.support.v4.media.d.a("\\n not found: limit=");
            a11.append(Math.min(this.f20127a.f20098b, j10));
            a11.append(" content=");
            a11.append(eVar.I().e());
            a11.append("…");
            throw new EOFException(a11.toString());
        }
        throw new IllegalArgumentException(q0.a("limit < 0: ", j10).toString());
    }

    @Override // ln.g
    public final long H0() {
        byte y10;
        B0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!g(i11)) {
                break;
            }
            y10 = this.f20127a.y(i10);
            if ((y10 < ((byte) 48) || y10 > ((byte) 57)) && ((y10 < ((byte) 97) || y10 > ((byte) 102)) && (y10 < ((byte) 65) || y10 > ((byte) 70)))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            ih.v.c(16);
            ih.v.c(16);
            String num = Integer.toString(y10, 16);
            gm.l.e(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb2.append(num);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f20127a.H0();
    }

    @Override // ln.g
    public final InputStream J0() {
        return new a();
    }

    @Override // ln.g
    public final long N(h hVar) {
        gm.l.f(hVar, "bytes");
        if (!this.f20128b) {
            long j10 = 0;
            while (true) {
                long D = this.f20127a.D(j10, hVar);
                if (D == -1) {
                    e eVar = this.f20127a;
                    long j11 = eVar.f20098b;
                    if (this.f20129c.V(eVar, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1) {
                        return -1L;
                    }
                    j10 = Math.max(j10, (j11 - hVar.f20103c.length) + 1);
                } else {
                    return D;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // ln.g
    public final int O(p pVar) {
        gm.l.f(pVar, "options");
        if (!this.f20128b) {
            while (true) {
                int c10 = mn.a.c(this.f20127a, pVar, true);
                if (c10 != -2) {
                    if (c10 != -1) {
                        this.f20127a.skip(pVar.f20120a[c10].d());
                        return c10;
                    }
                } else if (this.f20129c.V(this.f20127a, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1) {
                    break;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
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
            if (!this.f20128b) {
                e eVar2 = this.f20127a;
                if (eVar2.f20098b == 0 && this.f20129c.V(eVar2, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1) {
                    return -1L;
                }
                return this.f20127a.V(eVar, Math.min(j10, this.f20127a.f20098b));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(q0.a("byteCount < 0: ", j10).toString());
    }

    public final long a(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f20128b) {
            long j12 = 0;
            if (j11 < 0) {
                z10 = false;
            }
            if (z10) {
                while (j12 < j11) {
                    long C = this.f20127a.C(b10, j12, j11);
                    if (C != -1) {
                        return C;
                    }
                    e eVar = this.f20127a;
                    long j13 = eVar.f20098b;
                    if (j13 >= j11 || this.f20129c.V(eVar, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1) {
                        return -1L;
                    }
                    j12 = Math.max(j12, j13);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final int b() {
        B0(4L);
        int readInt = this.f20127a.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f20128b) {
            return;
        }
        this.f20128b = true;
        this.f20129c.close();
        this.f20127a.a();
    }

    @Override // ln.g, ln.f
    public final e d() {
        return this.f20127a;
    }

    @Override // ln.y
    public final z e() {
        return this.f20129c.e();
    }

    @Override // ln.g
    public final boolean g(long j10) {
        boolean z10;
        e eVar;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!this.f20128b) {
                do {
                    eVar = this.f20127a;
                    if (eVar.f20098b >= j10) {
                        return true;
                    }
                } while (this.f20129c.V(eVar, (long) DfuBaseService.ERROR_REMOTE_MASK) != -1);
                return false;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(q0.a("byteCount < 0: ", j10).toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f20128b;
    }

    @Override // ln.g
    public final long k0(e eVar) {
        e eVar2;
        long j10 = 0;
        while (true) {
            int i10 = (this.f20129c.V(this.f20127a, (long) DfuBaseService.ERROR_REMOTE_MASK) > (-1L) ? 1 : (this.f20129c.V(this.f20127a, (long) DfuBaseService.ERROR_REMOTE_MASK) == (-1L) ? 0 : -1));
            eVar2 = this.f20127a;
            if (i10 == 0) {
                break;
            }
            long h10 = eVar2.h();
            if (h10 > 0) {
                j10 += h10;
                eVar.c0(this.f20127a, h10);
            }
        }
        long j11 = eVar2.f20098b;
        if (j11 > 0) {
            long j12 = j10 + j11;
            eVar.c0(eVar2, j11);
            return j12;
        }
        return j10;
    }

    @Override // ln.g
    public final h n(long j10) {
        B0(j10);
        return this.f20127a.n(j10);
    }

    @Override // ln.g
    public final String o0() {
        return G(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        gm.l.f(byteBuffer, "sink");
        e eVar = this.f20127a;
        if (eVar.f20098b == 0 && this.f20129c.V(eVar, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1) {
            return -1;
        }
        return this.f20127a.read(byteBuffer);
    }

    @Override // ln.g
    public final byte readByte() {
        B0(1L);
        return this.f20127a.readByte();
    }

    @Override // ln.g
    public final int readInt() {
        B0(4L);
        return this.f20127a.readInt();
    }

    @Override // ln.g
    public final short readShort() {
        B0(2L);
        return this.f20127a.readShort();
    }

    @Override // ln.g
    public final void skip(long j10) {
        if (!this.f20128b) {
            while (j10 > 0) {
                e eVar = this.f20127a;
                if (eVar.f20098b == 0 && this.f20129c.V(eVar, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, this.f20127a.f20098b);
                this.f20127a.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("buffer(");
        a10.append(this.f20129c);
        a10.append(')');
        return a10.toString();
    }

    @Override // ln.g
    public final boolean w(h hVar) {
        gm.l.f(hVar, "bytes");
        byte[] bArr = hVar.f20103c;
        int length = bArr.length;
        if (!this.f20128b) {
            if (length >= 0 && bArr.length - 0 >= length) {
                for (int i10 = 0; i10 < length; i10++) {
                    long j10 = i10 + 0;
                    if (g(1 + j10)) {
                        if (this.f20127a.y(j10) == hVar.f20103c[0 + i10]) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.g
    public final long x(h hVar) {
        gm.l.f(hVar, "targetBytes");
        if (!this.f20128b) {
            long j10 = 0;
            while (true) {
                long E = this.f20127a.E(j10, hVar);
                if (E == -1) {
                    e eVar = this.f20127a;
                    long j11 = eVar.f20098b;
                    if (this.f20129c.V(eVar, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1) {
                        return -1L;
                    }
                    j10 = Math.max(j10, j11);
                } else {
                    return E;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends InputStream {
        public a() {
            s.this = r1;
        }

        @Override // java.io.InputStream
        public final int available() {
            s sVar = s.this;
            if (!sVar.f20128b) {
                return (int) Math.min(sVar.f20127a.f20098b, Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            s.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            s sVar = s.this;
            if (sVar.f20128b) {
                throw new IOException("closed");
            }
            e eVar = sVar.f20127a;
            if (eVar.f20098b == 0 && sVar.f20129c.V(eVar, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1) {
                return -1;
            }
            return s.this.f20127a.readByte() & 255;
        }

        public final String toString() {
            return s.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            gm.l.f(bArr, "data");
            if (s.this.f20128b) {
                throw new IOException("closed");
            }
            m0.g(bArr.length, i10, i11);
            s sVar = s.this;
            e eVar = sVar.f20127a;
            if (eVar.f20098b == 0 && sVar.f20129c.V(eVar, (long) DfuBaseService.ERROR_REMOTE_MASK) == -1) {
                return -1;
            }
            return s.this.f20127a.read(bArr, i10, i11);
        }
    }
}
