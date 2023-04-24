package y3;

@zl.e(c = "com.airbnb.mvrx.DefaultViewModelDelegateFactory$createLazyViewModel$1$1$1", f = "ViewModelDelegateProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends zl.i implements fm.p<Object, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ Object f30955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object obj, xl.d<? super g> dVar) {
        super(2, dVar);
        this.f30955e = obj;
    }

    @Override // fm.p
    public final Object A(Object obj, xl.d<? super tl.l> dVar) {
        return ((g) p((b0) obj, dVar)).t(tl.l.f28297a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.r, java.lang.Object] */
    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new g(this.f30955e, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        ((g0) this.f30955e).X();
        return tl.l.f28297a;
    }
}
