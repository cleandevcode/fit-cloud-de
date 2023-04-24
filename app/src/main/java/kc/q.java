package kc;

import kc.k;
import rc.m;
import rc.p;

/* loaded from: classes.dex */
public final class q implements v3.c<rc.k> {

    /* renamed from: a */
    public final w3.a<Integer> f18373a;

    /* renamed from: b */
    public final w3.a<rc.l> f18374b;

    /* renamed from: c */
    public final w3.a<rc.o> f18375c;

    public q() {
        k kVar = k.a.f18345a;
        rc.m mVar = m.a.f25495a;
        rc.p pVar = p.a.f25496a;
        this.f18373a = kVar;
        this.f18374b = mVar;
        this.f18375c = pVar;
    }

    @Override // w3.a
    public final Object get() {
        rc.k kVar;
        int intValue = this.f18373a.get().intValue();
        w3.a<rc.l> aVar = this.f18374b;
        w3.a<rc.o> aVar2 = this.f18375c;
        if (intValue < 26) {
            kVar = aVar.get();
        } else {
            kVar = aVar2.get();
        }
        rc.k kVar2 = kVar;
        b0.c.j(kVar2);
        return kVar2;
    }
}
