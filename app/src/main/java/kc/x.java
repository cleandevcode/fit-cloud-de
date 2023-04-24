package kc;

import kc.k;

/* loaded from: classes.dex */
public final class x implements v3.c<rc.s> {

    /* renamed from: a */
    public final w3.a<Integer> f18426a = k.a.f18345a;

    /* renamed from: b */
    public final w3.a<rc.t> f18427b;

    /* renamed from: c */
    public final w3.a<rc.u> f18428c;

    public x(w3.a aVar, w3.a aVar2) {
        this.f18427b = aVar;
        this.f18428c = aVar2;
    }

    @Override // w3.a
    public final Object get() {
        rc.s sVar;
        int intValue = this.f18426a.get().intValue();
        w3.a<rc.t> aVar = this.f18427b;
        w3.a<rc.u> aVar2 = this.f18428c;
        if (intValue < 24) {
            sVar = aVar.get();
        } else {
            sVar = aVar2.get();
        }
        rc.s sVar2 = sVar;
        b0.c.j(sVar2);
        return sVar2;
    }
}
