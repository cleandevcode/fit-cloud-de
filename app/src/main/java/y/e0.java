package y;

/* loaded from: classes.dex */
public final class e0 extends androidx.camera.core.f {

    /* loaded from: classes.dex */
    public class a implements d0.c<Void> {

        /* renamed from: a */
        public final /* synthetic */ androidx.camera.core.j f30689a;

        public a(androidx.camera.core.j jVar) {
            this.f30689a = jVar;
        }

        @Override // d0.c
        public final void onFailure(Throwable th2) {
            this.f30689a.close();
        }

        @Override // d0.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    @Override // androidx.camera.core.f
    public final androidx.camera.core.j b(a0.c1 c1Var) {
        return c1Var.l();
    }

    @Override // androidx.camera.core.f
    public final void d() {
    }

    @Override // androidx.camera.core.f
    public final void f(androidx.camera.core.j jVar) {
        d0.f.a(c(jVar), new a(jVar), o8.b.i());
    }
}
