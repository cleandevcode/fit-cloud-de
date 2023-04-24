package mf;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class n extends l<Set<Object>, Object> {
    public n(t tVar) {
        super(tVar);
    }

    @Override // mf.t
    public final Object b(y yVar) {
        Collection g10 = g();
        yVar.a();
        while (yVar.q()) {
            g10.add(this.f20623a.b(yVar));
        }
        yVar.h();
        return g10;
    }

    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        e0Var.a();
        for (Object obj2 : (Collection) obj) {
            this.f20623a.f(e0Var, obj2);
        }
        e0Var.j();
    }

    public final Collection g() {
        return new LinkedHashSet();
    }
}
