package y3;

@zl.e(c = "com.airbnb.mvrx.MavericksRepository$resolveSubscription$1", f = "MavericksRepository.kt", l = {409, 410}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f30925e;

    /* renamed from: f */
    public final /* synthetic */ sm.f<Object> f30926f;

    /* renamed from: g */
    public final /* synthetic */ fm.p<Object, xl.d<? super tl.l>, Object> f30927g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(sm.f<Object> fVar, fm.p<Object, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super a0> dVar) {
        super(2, dVar);
        this.f30926f = fVar;
        this.f30927g = pVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((a0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new a0(this.f30926f, this.f30927g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f30925e;
        if (i10 == 0) {
            mf.a0.k(obj);
            this.f30925e = 1;
            if (ih.v.B(this) == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                mf.a0.k(obj);
                return tl.l.f28297a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mf.a0.k(obj);
        }
        sm.f<Object> fVar = this.f30926f;
        fm.p<Object, xl.d<? super tl.l>, Object> pVar = this.f30927g;
        this.f30925e = 2;
        if (bi.r.o(fVar, pVar, this) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
