package l2;

@zl.e(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u1 extends zl.i implements fm.p<sm.g<? super Integer>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ t1<Object, Object> f19277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(t1<Object, Object> t1Var, xl.d<? super u1> dVar) {
        super(2, dVar);
        this.f19277e = t1Var;
    }

    @Override // fm.p
    public final Object A(sm.g<? super Integer> gVar, xl.d<? super tl.l> dVar) {
        return ((u1) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new u1(this.f19277e, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        t1<Object, Object> t1Var = this.f19277e;
        t1Var.f19262j.p(new Integer(t1Var.f19260h));
        return tl.l.f28297a;
    }
}
