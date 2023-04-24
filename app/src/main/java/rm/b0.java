package rm;

import i2.l0;
import um.f0;

/* loaded from: classes2.dex */
public final class b0<E> extends a0<E> {

    /* renamed from: f */
    public final fm.l<E, tl.l> f25832f;

    public b0(Object obj, pm.j jVar, fm.l lVar) {
        super(obj, jVar);
        this.f25832f = lVar;
    }

    @Override // um.k
    public final boolean N() {
        if (super.N()) {
            V();
            return true;
        }
        return false;
    }

    @Override // rm.y
    public final void V() {
        fm.l<E, tl.l> lVar = this.f25832f;
        E e10 = this.f25819d;
        xl.f e11 = this.f25820e.e();
        f0 a10 = l0.a(lVar, e10, null);
        if (a10 != null) {
            ih.v.g(e11, a10);
        }
    }
}
