package ao;

/* loaded from: classes2.dex */
public final class o implements d<Object> {

    /* renamed from: a */
    public final /* synthetic */ pm.i f3837a;

    public o(pm.j jVar) {
        this.f3837a = jVar;
    }

    @Override // ao.d
    public final void a(b<Object> bVar, b0<Object> b0Var) {
        boolean z10;
        pm.i iVar;
        Object f10;
        gm.l.g(bVar, "call");
        gm.l.g(b0Var, "response");
        int i10 = b0Var.f3791a.f32532d;
        if (200 <= i10 && 299 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            iVar = this.f3837a;
            f10 = b0Var.f3792b;
        } else {
            iVar = this.f3837a;
            f10 = mf.a0.f(new i(b0Var));
        }
        iVar.l(f10);
    }

    @Override // ao.d
    public final void b(b<Object> bVar, Throwable th2) {
        gm.l.g(bVar, "call");
        gm.l.g(th2, "t");
        this.f3837a.l(mf.a0.f(th2));
    }
}
