package nf;

import mf.e0;
import mf.t;
import mf.y;

/* loaded from: classes.dex */
public final class a<T> extends t<T> {

    /* renamed from: a */
    public final t<T> f22338a;

    public a(t<T> tVar) {
        this.f22338a = tVar;
    }

    @Override // mf.t
    public final T b(y yVar) {
        if (yVar.F() == 9) {
            yVar.D();
            return null;
        }
        return this.f22338a.b(yVar);
    }

    @Override // mf.t
    public final void f(e0 e0Var, T t10) {
        if (t10 == null) {
            e0Var.v();
        } else {
            this.f22338a.f(e0Var, t10);
        }
    }

    public final String toString() {
        return this.f22338a + ".nullSafe()";
    }
}
