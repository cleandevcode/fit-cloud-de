package qi;

import bi.z0;
import pm.e0;
import pm.z1;
import sm.g1;
import sm.t0;
import y3.d1;

/* loaded from: classes2.dex */
public abstract class s<T> {

    /* renamed from: a */
    public final e0 f24876a;

    /* renamed from: b */
    public final g1 f24877b;

    /* renamed from: c */
    public final t0 f24878c;

    /* renamed from: d */
    public z1 f24879d;

    public s(e0 e0Var) {
        d1 d1Var = d1.f30940b;
        this.f24876a = e0Var;
        g1 c10 = bi.r.c(d1Var);
        this.f24877b = c10;
        this.f24878c = bi.r.f(c10);
    }

    public static void b(s sVar) {
        z1 z1Var = sVar.f24879d;
        if (z1Var != null) {
            z1Var.h(null);
        }
        sVar.f24879d = z0.g(sVar.f24876a, null, 0, new r(sVar, 1000L, null), 3);
    }

    public abstract Object a(xl.d<? super T> dVar);

    public final boolean c() {
        z1 z1Var = this.f24879d;
        return ((z1Var != null && !z1Var.b0()) || (this.f24877b.getValue() instanceof y3.j)) ? false : true;
    }
}
