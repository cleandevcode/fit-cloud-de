package ln;

import a0.q0;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class n implements y {

    /* renamed from: a */
    public final InputStream f20116a;

    /* renamed from: b */
    public final z f20117b;

    public n(InputStream inputStream, z zVar) {
        this.f20116a = inputStream;
        this.f20117b = zVar;
    }

    @Override // ln.y
    public final long V(e eVar, long j10) {
        boolean z10;
        gm.l.f(eVar, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0L;
        }
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                this.f20117b.f();
                t X = eVar.X(1);
                int read = this.f20116a.read(X.f20131a, X.f20133c, (int) Math.min(j10, 8192 - X.f20133c));
                if (read == -1) {
                    if (X.f20132b == X.f20133c) {
                        eVar.f20097a = X.a();
                        u.a(X);
                        return -1L;
                    }
                    return -1L;
                }
                X.f20133c += read;
                long j11 = read;
                eVar.f20098b += j11;
                return j11;
            } catch (AssertionError e10) {
                if (rm.l.l(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException(q0.a("byteCount < 0: ", j10).toString());
    }

    @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20116a.close();
    }

    @Override // ln.y
    public final z e() {
        return this.f20117b;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("source(");
        a10.append(this.f20116a);
        a10.append(')');
        return a10.toString();
    }
}
