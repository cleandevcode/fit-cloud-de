package l2;

@zl.e(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends zl.i implements fm.q<sm.g<? super b2<Object>>, Throwable, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19198e;

    public q(b bVar, xl.d<? super q> dVar) {
        super(3, dVar);
    }

    @Override // fm.q
    public final Object j(sm.g<? super b2<Object>> gVar, Throwable th2, xl.d<? super tl.l> dVar) {
        return new q(null, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        int i10 = this.f19198e;
        if (i10 == 0 || i10 == 1) {
            mf.a0.k(obj);
            return tl.l.f28297a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
