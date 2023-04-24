package sm;

/* loaded from: classes2.dex */
public final class t0<T> implements f1<T>, f, tm.o<T> {

    /* renamed from: a */
    public final pm.g1 f27302a;

    /* renamed from: b */
    public final /* synthetic */ f1<T> f27303b;

    public t0(g1 g1Var, pm.g1 g1Var2) {
        this.f27302a = g1Var2;
        this.f27303b = g1Var;
    }

    @Override // sm.v0, sm.f
    public final Object a(g<? super T> gVar, xl.d<?> dVar) {
        return this.f27303b.a(gVar, dVar);
    }

    @Override // tm.o
    public final f<T> b(xl.f fVar, int i10, rm.f fVar2) {
        boolean z10;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((z10 || i10 == -2) && fVar2 == rm.f.DROP_OLDEST) || ((i10 == 0 || i10 == -3) && fVar2 == rm.f.SUSPEND)) {
            return this;
        }
        return new tm.i(i10, fVar, fVar2, this);
    }

    @Override // sm.f1
    public final T getValue() {
        return this.f27303b.getValue();
    }
}
