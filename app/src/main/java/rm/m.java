package rm;

import pm.g0;
import um.k;

/* loaded from: classes2.dex */
public final class m<E> extends y implements w<E> {

    /* renamed from: d */
    public final Throwable f25856d;

    public m(Throwable th2) {
        this.f25856d = th2;
    }

    @Override // rm.y
    public final void R() {
    }

    @Override // rm.y
    public final Object S() {
        return this;
    }

    @Override // rm.y
    public final void T(m<?> mVar) {
    }

    @Override // rm.y
    public final um.x U(k.c cVar) {
        um.x xVar = pm.k.f24356a;
        if (cVar != null) {
            cVar.d();
        }
        return xVar;
    }

    public final Throwable W() {
        Throwable th2 = this.f25856d;
        return th2 == null ? new n() : th2;
    }

    @Override // rm.w
    public final um.x d(Object obj) {
        return pm.k.f24356a;
    }

    @Override // rm.w
    public final Object o() {
        return this;
    }

    @Override // um.k
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Closed@");
        a10.append(g0.j(this));
        a10.append('[');
        a10.append(this.f25856d);
        a10.append(']');
        return a10.toString();
    }

    @Override // rm.w
    public final void y(E e10) {
    }
}
