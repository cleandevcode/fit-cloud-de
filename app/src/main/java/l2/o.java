package l2;

@zl.e(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends zl.i implements fm.q<u0<Object>, u0<Object>, xl.d<? super u0<Object>>, Object> {

    /* renamed from: e */
    public int f19131e;

    /* renamed from: f */
    public /* synthetic */ u0 f19132f;

    /* renamed from: g */
    public /* synthetic */ u0 f19133g;

    public o(xl.d<? super o> dVar) {
        super(3, dVar);
    }

    @Override // fm.q
    public final Object j(u0<Object> u0Var, u0<Object> u0Var2, xl.d<? super u0<Object>> dVar) {
        o oVar = new o(dVar);
        oVar.f19132f = u0Var;
        oVar.f19133g = u0Var2;
        return oVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19131e;
        if (i10 != 0) {
            if (i10 == 1) {
                u0 u0Var = this.f19132f;
                mf.a0.k(obj);
                return u0Var;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mf.a0.k(obj);
        u0 u0Var2 = this.f19132f;
        u0 u0Var3 = this.f19133g;
        this.f19132f = u0Var3;
        this.f19131e = 1;
        u0Var2.f19276c.f19064d.h(null);
        if (tl.l.f28297a == aVar) {
            return aVar;
        }
        return u0Var3;
    }
}
