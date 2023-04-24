package pm;

import pm.l1;

/* loaded from: classes2.dex */
public final class r<T> extends l1 implements q<T>, xm.b<T> {
    public r(g1 g1Var) {
        super(true);
        j0(g1Var);
    }

    @Override // pm.q
    public final boolean J(Throwable th2) {
        return l0(new u(th2, false));
    }

    @Override // pm.q
    public final boolean P(T t10) {
        return l0(t10);
    }

    @Override // xm.b
    public final <R> void t(xm.c<? super R> cVar, fm.p<? super T, ? super xl.d<? super R>, ? extends Object> pVar) {
        Object d02;
        do {
            d02 = d0();
            if (cVar.u()) {
                return;
            }
            if (!(d02 instanceof b1)) {
                if (cVar.p()) {
                    if (d02 instanceof u) {
                        cVar.B(((u) d02).f24396a);
                        return;
                    } else {
                        gm.f.c(n1.a(d02), cVar.x(), pVar);
                        return;
                    }
                }
                return;
            }
        } while (t0(d02) != 0);
        cVar.v(k(new y1(cVar, pVar)));
    }

    public final Object x0(xl.d<? super T> dVar) {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof b1)) {
                if (!(d02 instanceof u)) {
                    return n1.a(d02);
                }
                throw ((u) d02).f24396a;
            }
        } while (t0(d02) < 0);
        l1.a aVar = new l1.a(mf.a0.i(dVar), this);
        aVar.u();
        aVar.z(new r0(k(new w1(aVar))));
        return aVar.t();
    }
}
