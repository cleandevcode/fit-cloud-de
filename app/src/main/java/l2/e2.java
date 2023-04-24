package l2;

/* loaded from: classes.dex */
public final class e2 extends gm.m implements fm.l<u, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ p0<?> f18872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(ri.b bVar) {
        super(1);
        this.f18872b = bVar;
    }

    @Override // fm.l
    public final tl.l k(u uVar) {
        u uVar2 = uVar;
        gm.l.f(uVar2, "loadStates");
        p0<?> p0Var = this.f18872b;
        n0 n0Var = uVar2.f19271c;
        p0Var.getClass();
        gm.l.f(n0Var, "loadState");
        if (!gm.l.a(p0Var.f19182d, n0Var)) {
            boolean y10 = p0Var.y(p0Var.f19182d);
            boolean y11 = p0Var.y(n0Var);
            if (y10 && !y11) {
                p0Var.f2947a.f(0, 1);
            } else if (y11 && !y10) {
                p0Var.f2947a.e(0, 1);
            } else if (y10 && y11) {
                p0Var.f2947a.d(0, 1, null);
            }
            p0Var.f19182d = n0Var;
        }
        return tl.l.f28297a;
    }
}
