package l2;

@zl.e(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p extends zl.i implements fm.p<sm.g<? super b2<Object>>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19181e;

    public p(b bVar, xl.d<? super p> dVar) {
        super(2, dVar);
    }

    @Override // fm.p
    public final Object A(sm.g<? super b2<Object>> gVar, xl.d<? super tl.l> dVar) {
        return ((p) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new p(null, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        int i10 = this.f19181e;
        if (i10 == 0 || i10 == 1) {
            mf.a0.k(obj);
            return tl.l.f28297a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
