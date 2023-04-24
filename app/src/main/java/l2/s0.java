package l2;

@zl.e(c = "androidx.paging.MulticastedPagingData$accumulated$1", f = "CachedPagingData.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s0 extends zl.i implements fm.p<sm.g<? super b1<Object>>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19240e;

    /* renamed from: f */
    public final /* synthetic */ u0<Object> f19241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0<Object> u0Var, xl.d<? super s0> dVar) {
        super(2, dVar);
        this.f19241f = u0Var;
    }

    @Override // fm.p
    public final Object A(sm.g<? super b1<Object>> gVar, xl.d<? super tl.l> dVar) {
        return ((s0) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new s0(this.f19241f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        int i10 = this.f19240e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            this.f19241f.getClass();
        }
        return tl.l.f28297a;
    }
}
