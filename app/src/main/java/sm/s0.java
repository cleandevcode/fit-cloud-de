package sm;

import pm.z1;

/* loaded from: classes2.dex */
public final class s0<T> implements v0<T>, f, tm.o<T> {

    /* renamed from: a */
    public final pm.g1 f27298a;

    /* renamed from: b */
    public final /* synthetic */ v0<T> f27299b;

    public s0(w0 w0Var, z1 z1Var) {
        this.f27298a = z1Var;
        this.f27299b = w0Var;
    }

    @Override // sm.v0, sm.f
    public final Object a(g<? super T> gVar, xl.d<?> dVar) {
        return this.f27299b.a(gVar, dVar);
    }

    @Override // tm.o
    public final f<T> b(xl.f fVar, int i10, rm.f fVar2) {
        return ((i10 == 0 || i10 == -3) && fVar2 == rm.f.SUSPEND) ? this : new tm.i(i10, fVar, fVar2, this);
    }
}
