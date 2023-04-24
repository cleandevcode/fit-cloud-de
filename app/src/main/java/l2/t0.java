package l2;

@zl.e(c = "androidx.paging.MulticastedPagingData$accumulated$2", f = "CachedPagingData.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t0 extends zl.i implements fm.q<sm.g<? super b1<Object>>, Throwable, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19251e;

    /* renamed from: f */
    public final /* synthetic */ u0<Object> f19252f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0<Object> u0Var, xl.d<? super t0> dVar) {
        super(3, dVar);
        this.f19252f = u0Var;
    }

    @Override // fm.q
    public final Object j(sm.g<? super b1<Object>> gVar, Throwable th2, xl.d<? super tl.l> dVar) {
        return new t0(this.f19252f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        int i10 = this.f19251e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            this.f19252f.getClass();
        }
        return tl.l.f28297a;
    }
}
