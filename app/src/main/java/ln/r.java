package ln;

import java.nio.ByteBuffer;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class r implements f {

    /* renamed from: a */
    public final e f20124a;

    /* renamed from: b */
    public boolean f20125b;

    /* renamed from: c */
    public final w f20126c;

    public r(w wVar) {
        gm.l.f(wVar, "sink");
        this.f20126c = wVar;
        this.f20124a = new e();
    }

    @Override // ln.f
    public final long B(y yVar) {
        long j10 = 0;
        while (true) {
            long V = ((n) yVar).V(this.f20124a, (long) DfuBaseService.ERROR_REMOTE_MASK);
            if (V == -1) {
                return j10;
            }
            j10 += V;
            a();
        }
    }

    @Override // ln.f
    public final f D0(long j10) {
        if (!this.f20125b) {
            this.f20124a.e0(j10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.f
    public final f S(String str) {
        gm.l.f(str, "string");
        if (!this.f20125b) {
            this.f20124a.p0(str);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final f a() {
        if (!this.f20125b) {
            long h10 = this.f20124a.h();
            if (h10 > 0) {
                this.f20126c.c0(this.f20124a, h10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.f
    public final f a0(long j10) {
        if (!this.f20125b) {
            this.f20124a.h0(j10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.w
    public final void c0(e eVar, long j10) {
        gm.l.f(eVar, "source");
        if (!(!this.f20125b)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f20124a.c0(eVar, j10);
        a();
    }

    @Override // ln.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f20125b) {
            Throwable th2 = null;
            try {
                e eVar = this.f20124a;
                long j10 = eVar.f20098b;
                if (j10 > 0) {
                    this.f20126c.c0(eVar, j10);
                }
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                this.f20126c.close();
            } catch (Throwable th4) {
                if (th2 == null) {
                    th2 = th4;
                }
            }
            this.f20125b = true;
            if (th2 == null) {
                return;
            }
            throw th2;
        }
    }

    @Override // ln.f
    public final e d() {
        return this.f20124a;
    }

    @Override // ln.w
    public final z e() {
        return this.f20126c.e();
    }

    @Override // ln.f, ln.w, java.io.Flushable
    public final void flush() {
        if (!this.f20125b) {
            e eVar = this.f20124a;
            long j10 = eVar.f20098b;
            if (j10 > 0) {
                this.f20126c.c0(eVar, j10);
            }
            this.f20126c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.f
    public final f g0(int i10, int i11, String str) {
        gm.l.f(str, "string");
        if (!this.f20125b) {
            this.f20124a.n0(i10, i11, str);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f20125b;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("buffer(");
        a10.append(this.f20126c);
        a10.append(')');
        return a10.toString();
    }

    @Override // ln.f
    public final f u(h hVar) {
        gm.l.f(hVar, "byteString");
        if (!this.f20125b) {
            this.f20124a.Z(hVar);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        gm.l.f(byteBuffer, "source");
        if (!this.f20125b) {
            int write = this.f20124a.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.f
    public final f write(byte[] bArr) {
        gm.l.f(bArr, "source");
        if (!this.f20125b) {
            e eVar = this.f20124a;
            eVar.getClass();
            eVar.m14write(bArr, 0, bArr.length);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.f
    public final f write(byte[] bArr, int i10, int i11) {
        gm.l.f(bArr, "source");
        if (!this.f20125b) {
            this.f20124a.m14write(bArr, i10, i11);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.f
    public final f writeByte(int i10) {
        if (!this.f20125b) {
            this.f20124a.b0(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.f
    public final f writeInt(int i10) {
        if (!this.f20125b) {
            this.f20124a.i0(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ln.f
    public final f writeShort(int i10) {
        if (!this.f20125b) {
            this.f20124a.l0(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
