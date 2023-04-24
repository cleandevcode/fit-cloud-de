package kc;

import kc.k;
import tc.f0;

/* loaded from: classes.dex */
public final class u implements v3.c<tc.d0> {

    /* renamed from: a */
    public final w3.a<Integer> f18393a;

    /* renamed from: b */
    public final w3.a<tc.e0> f18394b;

    /* renamed from: c */
    public final w3.a<tc.g0> f18395c;

    /* renamed from: d */
    public final w3.a<tc.i0> f18396d;

    public u(w3.a aVar, w3.a aVar2) {
        k kVar = k.a.f18345a;
        tc.f0 f0Var = f0.a.f27969a;
        this.f18393a = kVar;
        this.f18394b = f0Var;
        this.f18395c = aVar;
        this.f18396d = aVar2;
    }

    @Override // w3.a
    public final Object get() {
        tc.d0 d0Var;
        int intValue = this.f18393a.get().intValue();
        w3.a<tc.e0> aVar = this.f18394b;
        w3.a<tc.g0> aVar2 = this.f18395c;
        w3.a<tc.i0> aVar3 = this.f18396d;
        if (intValue < 23) {
            d0Var = aVar.get();
        } else if (intValue < 31) {
            d0Var = aVar2.get();
        } else {
            d0Var = aVar3.get();
        }
        tc.d0 d0Var2 = d0Var;
        b0.c.j(d0Var2);
        return d0Var2;
    }
}
