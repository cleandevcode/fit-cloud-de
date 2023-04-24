package y3;

@zl.e(c = "com.airbnb.mvrx.MavericksRepository$execute$3", f = "MavericksRepository.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31091e;

    public x(xl.d<? super x> dVar) {
        super(2, dVar);
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return new x(dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new x(dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31091e;
        if (i10 == 0) {
            mf.a0.k(obj);
            this.f31091e = 1;
            if (mf.a0.g(Long.MAX_VALUE, this) == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mf.a0.k(obj);
        }
        return tl.l.f28297a;
    }
}
