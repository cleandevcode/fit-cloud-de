package l2;

@zl.e(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v1 extends zl.i implements fm.p<sm.g<? super Integer>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ t1<Object, Object> f19325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(t1<Object, Object> t1Var, xl.d<? super v1> dVar) {
        super(2, dVar);
        this.f19325e = t1Var;
    }

    @Override // fm.p
    public final Object A(sm.g<? super Integer> gVar, xl.d<? super tl.l> dVar) {
        return ((v1) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new v1(this.f19325e, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        t1<Object, Object> t1Var = this.f19325e;
        t1Var.f19261i.p(new Integer(t1Var.f19259g));
        return tl.l.f28297a;
    }
}
