package rm;

import pm.g0;
import um.k;

/* loaded from: classes2.dex */
public class a0<E> extends y {

    /* renamed from: d */
    public final E f25819d;

    /* renamed from: e */
    public final pm.i<tl.l> f25820e;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Object obj, pm.j jVar) {
        this.f25819d = obj;
        this.f25820e = jVar;
    }

    @Override // rm.y
    public final void R() {
        this.f25820e.i();
    }

    @Override // rm.y
    public final E S() {
        return this.f25819d;
    }

    @Override // rm.y
    public final void T(m<?> mVar) {
        pm.i<tl.l> iVar = this.f25820e;
        Throwable th2 = mVar.f25856d;
        if (th2 == null) {
            th2 = new o("Channel was closed");
        }
        iVar.l(mf.a0.f(th2));
    }

    @Override // rm.y
    public final um.x U(k.c cVar) {
        if (this.f25820e.f(tl.l.f28297a, cVar != null ? cVar.f28921c : null) == null) {
            return null;
        }
        if (cVar != null) {
            cVar.d();
        }
        return pm.k.f24356a;
    }

    @Override // um.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + g0.j(this) + '(' + this.f25819d + ')';
    }
}
