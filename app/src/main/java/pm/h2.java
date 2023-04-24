package pm;

import xl.f;

/* loaded from: classes2.dex */
public final class h2 implements f.b, f.c<h2> {

    /* renamed from: a */
    public static final h2 f24346a = new h2();

    @Override // xl.f
    public final <R> R Z(R r10, fm.p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.A(r10, this);
    }

    @Override // xl.f.b, xl.f
    public final <E extends f.b> E b(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // xl.f.b
    public final f.c<?> getKey() {
        return this;
    }

    @Override // xl.f
    public final xl.f s(xl.f fVar) {
        gm.l.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    @Override // xl.f
    public final xl.f y(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }
}
