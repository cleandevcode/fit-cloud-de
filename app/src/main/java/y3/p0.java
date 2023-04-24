package y3;

@zl.e(c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$2", f = "MavericksViewModelExtensions.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p0 extends zl.i implements fm.p<f0<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31008e;

    /* renamed from: f */
    public /* synthetic */ Object f31009f;

    /* renamed from: g */
    public final /* synthetic */ fm.p<Object, xl.d<? super tl.l>, Object> f31010g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p0(fm.p<Object, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super p0> dVar) {
        super(2, dVar);
        this.f31010g = pVar;
    }

    @Override // fm.p
    public final Object A(f0<Object> f0Var, xl.d<? super tl.l> dVar) {
        return ((p0) p(f0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        p0 p0Var = new p0(this.f31010g, dVar);
        p0Var.f31009f = obj;
        return p0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31008e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            Object obj2 = ((f0) this.f31009f).f30954a;
            fm.p<Object, xl.d<? super tl.l>, Object> pVar = this.f31010g;
            this.f31008e = 1;
            if (pVar.A(obj2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
