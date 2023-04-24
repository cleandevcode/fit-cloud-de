package kc;

import kc.k;

/* loaded from: classes.dex */
public final class y implements v3.c<rc.d0> {

    /* renamed from: a */
    public final w3.a<Integer> f18430a = k.a.f18345a;

    /* renamed from: b */
    public final w3.a<rc.e0> f18431b;

    /* renamed from: c */
    public final w3.a<rc.g0> f18432c;

    /* renamed from: d */
    public final w3.a<rc.h0> f18433d;

    public y(w3.a aVar, w3.a aVar2, w3.a aVar3) {
        this.f18431b = aVar;
        this.f18432c = aVar2;
        this.f18433d = aVar3;
    }

    @Override // w3.a
    public final Object get() {
        rc.d0 d0Var;
        int intValue = this.f18430a.get().intValue();
        w3.a<rc.e0> aVar = this.f18431b;
        w3.a<rc.g0> aVar2 = this.f18432c;
        w3.a<rc.h0> aVar3 = this.f18433d;
        if (intValue < 21) {
            d0Var = aVar.get();
        } else if (intValue < 23) {
            d0Var = aVar2.get();
        } else {
            d0Var = aVar3.get();
        }
        rc.d0 d0Var2 = d0Var;
        b0.c.j(d0Var2);
        return d0Var2;
    }
}
