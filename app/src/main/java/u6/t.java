package u6;

@zl.e(c = "com.github.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$2", f = "MavericksViewModelExtensions.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends zl.i implements fm.p<q<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28613e;

    /* renamed from: f */
    public /* synthetic */ Object f28614f;

    /* renamed from: g */
    public final /* synthetic */ fm.p<Object, xl.d<? super tl.l>, Object> f28615g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(fm.p<Object, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super t> dVar) {
        super(2, dVar);
        this.f28615g = pVar;
    }

    @Override // fm.p
    public final Object A(q<Object> qVar, xl.d<? super tl.l> dVar) {
        return ((t) p(qVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        t tVar = new t(this.f28615g, dVar);
        tVar.f28614f = obj;
        return tVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28613e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            Object obj2 = ((q) this.f28614f).f28603a;
            fm.p<Object, xl.d<? super tl.l>, Object> pVar = this.f28615g;
            this.f28613e = 1;
            if (pVar.A(obj2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
