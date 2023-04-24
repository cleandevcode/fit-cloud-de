package ln;

import bi.m0;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c implements w {

    /* renamed from: a */
    public final /* synthetic */ b f20093a;

    /* renamed from: b */
    public final /* synthetic */ w f20094b;

    public c(x xVar, q qVar) {
        this.f20093a = xVar;
        this.f20094b = qVar;
    }

    @Override // ln.w
    public final void c0(e eVar, long j10) {
        gm.l.f(eVar, "source");
        m0.g(eVar.f20098b, 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 > 0) {
                t tVar = eVar.f20097a;
                while (true) {
                    gm.l.c(tVar);
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += tVar.f20133c - tVar.f20132b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    tVar = tVar.f20136f;
                }
                b bVar = this.f20093a;
                bVar.h();
                try {
                    this.f20094b.c0(eVar, j11);
                    tl.l lVar = tl.l.f28297a;
                    if (!bVar.i()) {
                        j10 -= j11;
                    } else {
                        throw bVar.j(null);
                    }
                } catch (IOException e10) {
                    if (!bVar.i()) {
                        throw e10;
                    }
                    throw bVar.j(e10);
                } finally {
                    bVar.i();
                }
            } else {
                return;
            }
        }
    }

    @Override // ln.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b bVar = this.f20093a;
        bVar.h();
        try {
            this.f20094b.close();
            tl.l lVar = tl.l.f28297a;
            if (!bVar.i()) {
                return;
            }
            throw bVar.j(null);
        } catch (IOException e10) {
            if (!bVar.i()) {
                throw e10;
            }
            throw bVar.j(e10);
        } finally {
            bVar.i();
        }
    }

    @Override // ln.w
    public final z e() {
        return this.f20093a;
    }

    @Override // ln.w, java.io.Flushable
    public final void flush() {
        b bVar = this.f20093a;
        bVar.h();
        try {
            this.f20094b.flush();
            tl.l lVar = tl.l.f28297a;
            if (!bVar.i()) {
                return;
            }
            throw bVar.j(null);
        } catch (IOException e10) {
            if (!bVar.i()) {
                throw e10;
            }
            throw bVar.j(e10);
        } finally {
            bVar.i();
        }
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AsyncTimeout.sink(");
        a10.append(this.f20094b);
        a10.append(')');
        return a10.toString();
    }
}
