package rc;

import tc.l0;

/* loaded from: classes.dex */
public final class i0 implements v3.c<h0> {

    /* renamed from: a */
    public final w3.a<l0> f25490a;

    /* renamed from: b */
    public final w3.a<h> f25491b;

    /* renamed from: c */
    public final w3.a<y> f25492c;

    /* renamed from: d */
    public final w3.a<d> f25493d;

    public i0(w3.a<l0> aVar, w3.a<h> aVar2, w3.a<y> aVar3, w3.a<d> aVar4) {
        this.f25490a = aVar;
        this.f25491b = aVar2;
        this.f25492c = aVar3;
        this.f25493d = aVar4;
    }

    @Override // w3.a
    public final Object get() {
        return new h0(this.f25490a.get(), this.f25491b.get(), this.f25492c.get(), this.f25493d.get());
    }
}
