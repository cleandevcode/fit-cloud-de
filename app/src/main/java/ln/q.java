package ln;

import bi.m0;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class q implements w {

    /* renamed from: a */
    public final OutputStream f20122a;

    /* renamed from: b */
    public final z f20123b;

    public q(OutputStream outputStream, x xVar) {
        this.f20122a = outputStream;
        this.f20123b = xVar;
    }

    @Override // ln.w
    public final void c0(e eVar, long j10) {
        gm.l.f(eVar, "source");
        m0.g(eVar.f20098b, 0L, j10);
        while (j10 > 0) {
            this.f20123b.f();
            t tVar = eVar.f20097a;
            gm.l.c(tVar);
            int min = (int) Math.min(j10, tVar.f20133c - tVar.f20132b);
            this.f20122a.write(tVar.f20131a, tVar.f20132b, min);
            int i10 = tVar.f20132b + min;
            tVar.f20132b = i10;
            long j11 = min;
            j10 -= j11;
            eVar.f20098b -= j11;
            if (i10 == tVar.f20133c) {
                eVar.f20097a = tVar.a();
                u.a(tVar);
            }
        }
    }

    @Override // ln.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20122a.close();
    }

    @Override // ln.w
    public final z e() {
        return this.f20123b;
    }

    @Override // ln.w, java.io.Flushable
    public final void flush() {
        this.f20122a.flush();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("sink(");
        a10.append(this.f20122a);
        a10.append(')');
        return a10.toString();
    }
}
