package v4;

import t4.o;
import t4.x;
import v4.i;

/* loaded from: classes.dex */
public final class h extends m5.i<r4.f, x<?>> implements i {

    /* renamed from: d */
    public i.a f29052d;

    public h(long j10) {
        super(j10);
    }

    @Override // m5.i
    public final int b(x<?> xVar) {
        x<?> xVar2 = xVar;
        if (xVar2 == null) {
            return 1;
        }
        return xVar2.b();
    }

    @Override // m5.i
    public final void c(r4.f fVar, x<?> xVar) {
        x<?> xVar2 = xVar;
        i.a aVar = this.f29052d;
        if (aVar != null && xVar2 != null) {
            ((o) aVar).f27664e.a(xVar2, true);
        }
    }
}
