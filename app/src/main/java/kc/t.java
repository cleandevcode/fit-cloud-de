package kc;

import kc.k;

/* loaded from: classes.dex */
public final class t implements v3.c<tk.i<Boolean>> {

    /* renamed from: a */
    public final w3.a<Integer> f18378a = k.a.f18345a;

    /* renamed from: b */
    public final w3.a<tc.c0> f18379b;

    public t(oc.i iVar) {
        this.f18379b = iVar;
    }

    @Override // w3.a
    public final Object get() {
        int intValue = this.f18378a.get().intValue();
        tc.c0 c0Var = this.f18379b.get();
        if (intValue < 23) {
            return fl.j0.f14518a.x(Boolean.TRUE);
        }
        c0Var.getClass();
        fl.k kVar = new fl.k(new fl.g(new tc.b0(c0Var)));
        il.o oVar = pl.a.f24282d;
        return kVar.A(oVar).F(oVar);
    }
}
