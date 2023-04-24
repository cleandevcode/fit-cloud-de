package tm;

import um.z;
import xl.e;

/* loaded from: classes2.dex */
public abstract class h<S, T> extends f<T> {

    /* renamed from: d */
    public final sm.f<S> f28318d;

    public h(int i10, xl.f fVar, rm.f fVar2, sm.f fVar3) {
        super(fVar, i10, fVar2);
        this.f28318d = fVar3;
    }

    @Override // tm.f, sm.f
    public final Object a(sm.g<? super T> gVar, xl.d<? super tl.l> dVar) {
        boolean z10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        if (this.f28313b == -3) {
            xl.f e10 = dVar.e();
            xl.f s10 = e10.s(this.f28312a);
            if (gm.l.a(s10, e10)) {
                Object j10 = j(gVar, dVar);
                if (j10 == aVar) {
                    return j10;
                }
            } else {
                int i10 = xl.e.f30629b0;
                e.a aVar2 = e.a.f30630a;
                if (gm.l.a(s10.b(aVar2), e10.b(aVar2))) {
                    xl.f e11 = dVar.e();
                    if (gVar instanceof u) {
                        z10 = true;
                    } else {
                        z10 = gVar instanceof q;
                    }
                    if (!z10) {
                        gVar = new x(gVar, e11);
                    }
                    Object P = bi.r.P(s10, gVar, z.b(s10), new g(this, null), dVar);
                    if (P != aVar) {
                        P = tl.l.f28297a;
                    }
                    if (P == aVar) {
                        return P;
                    }
                }
            }
            return tl.l.f28297a;
        }
        Object a10 = super.a(gVar, dVar);
        if (a10 == aVar) {
            return a10;
        }
        return tl.l.f28297a;
    }

    @Override // tm.f
    public final Object f(rm.t<? super T> tVar, xl.d<? super tl.l> dVar) {
        Object j10 = j(new u(tVar), dVar);
        return j10 == yl.a.COROUTINE_SUSPENDED ? j10 : tl.l.f28297a;
    }

    public abstract Object j(sm.g<? super T> gVar, xl.d<? super tl.l> dVar);

    @Override // tm.f
    public final String toString() {
        return this.f28318d + " -> " + super.toString();
    }
}
