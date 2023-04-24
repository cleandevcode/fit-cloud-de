package xl;

import fm.p;
import gm.l;
import xl.f;

/* loaded from: classes2.dex */
public abstract class a implements f.b {

    /* renamed from: a */
    public final f.c<?> f30620a;

    public a(f.c<?> cVar) {
        this.f30620a = cVar;
    }

    @Override // xl.f
    public final <R> R Z(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.A(r10, this);
    }

    @Override // xl.f.b, xl.f
    public <E extends f.b> E b(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // xl.f.b
    public final f.c<?> getKey() {
        return this.f30620a;
    }

    @Override // xl.f
    public final f s(f fVar) {
        l.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    @Override // xl.f
    public f y(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }
}
