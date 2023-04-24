package ao;

/* loaded from: classes2.dex */
public final class q implements d<Object> {

    /* renamed from: a */
    public final /* synthetic */ pm.i f3839a;

    public q(pm.j jVar) {
        this.f3839a = jVar;
    }

    @Override // ao.d
    public final void a(b<Object> bVar, b0<Object> b0Var) {
        gm.l.g(bVar, "call");
        gm.l.g(b0Var, "response");
        this.f3839a.l(b0Var);
    }

    @Override // ao.d
    public final void b(b<Object> bVar, Throwable th2) {
        gm.l.g(bVar, "call");
        gm.l.g(th2, "t");
        this.f3839a.l(mf.a0.f(th2));
    }
}
