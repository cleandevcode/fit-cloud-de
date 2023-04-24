package l2;

@zl.e(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l1 extends zl.i implements fm.q<g0, g0, xl.d<? super g0>, Object> {

    /* renamed from: e */
    public /* synthetic */ g0 f19070e;

    /* renamed from: f */
    public /* synthetic */ g0 f19071f;

    /* renamed from: g */
    public final /* synthetic */ r0 f19072g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(r0 r0Var, xl.d<? super l1> dVar) {
        super(3, dVar);
        this.f19072g = r0Var;
    }

    @Override // fm.q
    public final Object j(g0 g0Var, g0 g0Var2, xl.d<? super g0> dVar) {
        l1 l1Var = new l1(this.f19072g, dVar);
        l1Var.f19070e = g0Var;
        l1Var.f19071f = g0Var2;
        return l1Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        boolean t10;
        mf.a0.k(obj);
        g0 g0Var = this.f19070e;
        g0 g0Var2 = this.f19071f;
        r0 r0Var = this.f19072g;
        gm.l.f(g0Var2, "<this>");
        gm.l.f(g0Var, "previous");
        gm.l.f(r0Var, "loadType");
        int i10 = g0Var2.f18896a;
        int i11 = g0Var.f18896a;
        if (i10 > i11) {
            t10 = true;
        } else if (i10 < i11) {
            t10 = false;
        } else {
            t10 = b0.c.t(g0Var2.f18897b, g0Var.f18897b, r0Var);
        }
        if (t10) {
            return g0Var2;
        }
        return g0Var;
    }
}
