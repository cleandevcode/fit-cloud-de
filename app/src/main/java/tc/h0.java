package tc;

import kc.k;

/* loaded from: classes.dex */
public final class h0 implements v3.c<g0> {

    /* renamed from: a */
    public final w3.a<m> f27976a;

    /* renamed from: b */
    public final w3.a<p> f27977b;

    /* renamed from: c */
    public final w3.a<Integer> f27978c;

    /* renamed from: d */
    public final w3.a<Integer> f27979d;

    /* renamed from: e */
    public final w3.a<Boolean> f27980e;

    public h0(w3.a aVar, w3.a aVar2, w3.a aVar3, kc.p pVar) {
        kc.k kVar = k.a.f18345a;
        this.f27976a = aVar;
        this.f27977b = aVar2;
        this.f27978c = aVar3;
        this.f27979d = kVar;
        this.f27980e = pVar;
    }

    @Override // w3.a
    public final Object get() {
        return new g0(this.f27976a.get(), this.f27977b.get(), this.f27978c.get().intValue(), this.f27979d.get().intValue(), this.f27980e.get().booleanValue());
    }
}
