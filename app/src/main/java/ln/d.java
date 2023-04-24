package ln;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class d implements y {

    /* renamed from: a */
    public final /* synthetic */ b f20095a;

    /* renamed from: b */
    public final /* synthetic */ y f20096b;

    public d(x xVar, n nVar) {
        this.f20095a = xVar;
        this.f20096b = nVar;
    }

    @Override // ln.y
    public final long V(e eVar, long j10) {
        gm.l.f(eVar, "sink");
        b bVar = this.f20095a;
        bVar.h();
        try {
            long V = this.f20096b.V(eVar, j10);
            if (!bVar.i()) {
                return V;
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

    @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b bVar = this.f20095a;
        bVar.h();
        try {
            this.f20096b.close();
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

    @Override // ln.y
    public final z e() {
        return this.f20095a;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AsyncTimeout.source(");
        a10.append(this.f20096b);
        a10.append(')');
        return a10.toString();
    }
}
