package d2;

import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import gm.l;
import k.f;

/* loaded from: classes.dex */
public final class b implements v0.b {

    /* renamed from: a */
    public final d<?>[] f12613a;

    public b(d<?>... dVarArr) {
        l.f(dVarArr, "initializers");
        this.f12613a = dVarArr;
    }

    @Override // androidx.lifecycle.v0.b
    public final s0 a(Class cls, c cVar) {
        d<?>[] dVarArr;
        s0 s0Var = null;
        for (d<?> dVar : this.f12613a) {
            if (l.a(dVar.f12614a, cls)) {
                Object k10 = dVar.f12615b.k(cVar);
                if (k10 instanceof s0) {
                    s0Var = (s0) k10;
                } else {
                    s0Var = null;
                }
            }
        }
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalArgumentException(f.a(cls, android.support.v4.media.d.a("No initializer set for given class ")));
    }

    @Override // androidx.lifecycle.v0.b
    public final s0 b(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
}
