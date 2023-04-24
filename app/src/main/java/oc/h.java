package oc;

/* loaded from: classes.dex */
public final class h implements v3.c<c0> {

    /* renamed from: a */
    public final w3.a<Boolean> f22982a;

    /* renamed from: b */
    public final w3.a<g0> f22983b;

    /* renamed from: c */
    public final w3.a<k1> f22984c;

    public h(v3.d dVar, h0 h0Var, b0 b0Var) {
        this.f22982a = dVar;
        this.f22983b = h0Var;
        this.f22984c = b0Var;
    }

    @Override // w3.a
    public final Object get() {
        c0 c0Var;
        boolean booleanValue = this.f22982a.get().booleanValue();
        w3.a<g0> aVar = this.f22983b;
        w3.a<k1> aVar2 = this.f22984c;
        if (booleanValue) {
            c0Var = aVar.get();
        } else {
            c0Var = aVar2.get();
        }
        c0 c0Var2 = c0Var;
        b0.c.j(c0Var2);
        return c0Var2;
    }
}
