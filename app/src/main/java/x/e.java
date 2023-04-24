package x;

import a0.i1;
import a0.j1;
import a0.l0;
import a0.n1;
import a0.t1;
import java.util.Set;
import y.z;

/* loaded from: classes.dex */
public class e implements t1 {

    /* renamed from: y */
    public final l0 f30082y;

    /* loaded from: classes.dex */
    public static final class a implements z<e> {

        /* renamed from: a */
        public final j1 f30083a = j1.B();

        public static a d(l0 l0Var) {
            a aVar = new a();
            l0Var.m(new d(aVar, l0Var, 0));
            return aVar;
        }

        public final e a() {
            return new e(n1.A(this.f30083a));
        }

        @Override // y.z
        public final i1 b() {
            throw null;
        }
    }

    public e(l0 l0Var) {
        this.f30082y = l0Var;
    }

    @Override // a0.t1, a0.l0
    public final l0.b a(l0.a aVar) {
        return b().a(aVar);
    }

    @Override // a0.t1
    public final l0 b() {
        return this.f30082y;
    }

    @Override // a0.t1, a0.l0
    public final Object c(l0.a aVar) {
        return b().c(aVar);
    }

    @Override // a0.t1, a0.l0
    public final Set d() {
        return b().d();
    }

    @Override // a0.t1, a0.l0
    public final Object e(l0.a aVar, Object obj) {
        return b().e(aVar, obj);
    }

    @Override // a0.l0
    public final void m(d dVar) {
        b().m(dVar);
    }

    @Override // a0.l0
    public final Object p(l0.a aVar, l0.b bVar) {
        return b().p(aVar, bVar);
    }

    @Override // a0.l0
    public final Set u(l0.a aVar) {
        return b().u(aVar);
    }

    @Override // a0.l0
    public final boolean z(l0.a aVar) {
        return b().z((a0.d) aVar);
    }
}
