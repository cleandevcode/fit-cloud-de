package ti;

import fl.g;
import gm.l;

/* loaded from: classes2.dex */
public final class j<T> extends zi.a<T> {

    /* renamed from: a */
    public final cj.a f28263a;

    /* renamed from: b */
    public final f<T> f28264b;

    public j(cj.a aVar, f<T> fVar) {
        l.f(aVar, "fcProtocolQueue");
        l.f(fVar, "fcProtocolOperation");
        this.f28263a = aVar;
        this.f28264b = fVar;
    }

    @Override // zi.a
    public final void a(g.a aVar, ej.a aVar2) {
        this.f28264b.c(aVar, aVar2, this.f28263a);
    }

    @Override // zi.a, zi.b
    public final void p() {
        this.f28264b.getClass();
    }
}
