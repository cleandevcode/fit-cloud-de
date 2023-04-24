package rm;

import i2.l0;
import java.util.ArrayList;
import rm.c;
import um.f0;

/* loaded from: classes2.dex */
public final class q<E> extends a<E> {
    public q(fm.l<? super E, tl.l> lVar) {
        super(lVar);
    }

    @Override // rm.c
    public final boolean i() {
        return false;
    }

    @Override // rm.c
    public final boolean j() {
        return false;
    }

    @Override // rm.c
    public final Object k(E e10) {
        w wVar;
        do {
            Object k10 = super.k(e10);
            um.x xVar = b.f25822b;
            if (k10 == xVar) {
                return xVar;
            }
            if (k10 == b.f25823c) {
                um.j jVar = this.f25835b;
                c.a aVar = new c.a(e10);
                while (true) {
                    um.k K = jVar.K();
                    if (K instanceof w) {
                        wVar = (w) K;
                        break;
                    } else if (K.D(aVar, jVar)) {
                        wVar = null;
                        break;
                    }
                }
                if (wVar == null) {
                    return b.f25822b;
                }
            } else if (k10 instanceof m) {
                return k10;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + k10).toString());
            }
        } while (!(wVar instanceof m));
        return wVar;
    }

    @Override // rm.a
    public final boolean t() {
        return true;
    }

    @Override // rm.a
    public final boolean v() {
        return true;
    }

    @Override // rm.a
    public final void z(Object obj, m<?> mVar) {
        f0 f0Var = null;
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                f0 f0Var2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    y yVar = (y) arrayList.get(size);
                    if (yVar instanceof c.a) {
                        fm.l<E, tl.l> lVar = this.f25834a;
                        f0Var2 = lVar != null ? l0.a(lVar, ((c.a) yVar).f25836d, f0Var2) : null;
                    } else {
                        yVar.T(mVar);
                    }
                }
                f0Var = f0Var2;
            } else {
                y yVar2 = (y) obj;
                if (yVar2 instanceof c.a) {
                    fm.l<E, tl.l> lVar2 = this.f25834a;
                    if (lVar2 != null) {
                        f0Var = l0.a(lVar2, ((c.a) yVar2).f25836d, null);
                    }
                } else {
                    yVar2.T(mVar);
                }
            }
        }
        if (f0Var != null) {
            throw f0Var;
        }
    }
}
