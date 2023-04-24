package um;

import pm.b2;
import xl.f;

/* loaded from: classes2.dex */
public final class a0<T> implements b2<T> {

    /* renamed from: a */
    public final T f28887a;

    /* renamed from: b */
    public final ThreadLocal<T> f28888b;

    /* renamed from: c */
    public final b0 f28889c;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Integer num, ThreadLocal threadLocal) {
        this.f28887a = num;
        this.f28888b = threadLocal;
        this.f28889c = new b0(threadLocal);
    }

    @Override // pm.b2
    public final void W(Object obj) {
        this.f28888b.set(obj);
    }

    @Override // xl.f
    public final <R> R Z(R r10, fm.p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.A(r10, this);
    }

    @Override // xl.f.b, xl.f
    public final <E extends f.b> E b(f.c<E> cVar) {
        if (gm.l.a(this.f28889c, cVar)) {
            return this;
        }
        return null;
    }

    @Override // xl.f.b
    public final f.c<?> getKey() {
        return this.f28889c;
    }

    @Override // pm.b2
    public final T j(xl.f fVar) {
        T t10 = this.f28888b.get();
        this.f28888b.set(this.f28887a);
        return t10;
    }

    @Override // xl.f
    public final xl.f s(xl.f fVar) {
        gm.l.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ThreadLocal(value=");
        a10.append(this.f28887a);
        a10.append(", threadLocal = ");
        a10.append(this.f28888b);
        a10.append(')');
        return a10.toString();
    }

    @Override // xl.f
    public final xl.f y(f.c<?> cVar) {
        if (gm.l.a(this.f28889c, cVar)) {
            return xl.g.f30632a;
        }
        return this;
    }
}
