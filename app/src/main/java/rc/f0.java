package rc;

import tc.l0;

/* loaded from: classes.dex */
public final class f0 implements v3.c<e0> {

    /* renamed from: a */
    public final w3.a<l0> f25474a;

    /* renamed from: b */
    public final w3.a<h> f25475b;

    /* renamed from: c */
    public final w3.a<y> f25476c;

    public f0(w3.a aVar, w3.a aVar2, oc.b0 b0Var) {
        this.f25474a = aVar;
        this.f25475b = aVar2;
        this.f25476c = b0Var;
    }

    @Override // w3.a
    public final Object get() {
        return new e0(this.f25474a.get(), this.f25475b.get(), this.f25476c.get());
    }
}
