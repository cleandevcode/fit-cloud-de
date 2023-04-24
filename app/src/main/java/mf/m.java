package mf;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class m extends l<Collection<Object>, Object> {
    public m(t tVar) {
        super(tVar);
    }

    @Override // mf.t
    public final Object b(y yVar) {
        Collection<Object> g10 = g();
        yVar.a();
        while (yVar.q()) {
            ((ArrayList) g10).add(this.f20623a.b(yVar));
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

    public final Collection<Object> g() {
        return new ArrayList();
    }
}
