package l2;

@zl.e(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y1 extends zl.i implements fm.l<xl.d<? super l2<Object, Object>>, Object> {

    /* renamed from: e */
    public final /* synthetic */ fm.a<l2<Object, Object>> f19359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y1(fm.a<? extends l2<Object, Object>> aVar, xl.d<? super y1> dVar) {
        super(1, dVar);
        this.f19359e = aVar;
    }

    @Override // fm.l
    public final Object k(xl.d<? super l2<Object, Object>> dVar) {
        return new y1(this.f19359e, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        return this.f19359e.m();
    }
}
