package y3;

@zl.e(c = "com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$1", f = "CoroutinesStateStore.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends zl.i implements fm.p<fm.l<b0, b0>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f30934e;

    /* renamed from: f */
    public /* synthetic */ Object f30935f;

    /* renamed from: g */
    public final /* synthetic */ f<b0> f30936g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f<b0> fVar, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f30936g = fVar;
    }

    @Override // fm.p
    public final Object A(fm.l<b0, b0> lVar, xl.d<? super tl.l> dVar) {
        return ((c) p(lVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        c cVar = new c(this.f30936g, dVar);
        cVar.f30935f = obj;
        return cVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f30934e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            S s10 = (S) ((fm.l) this.f30935f).k(this.f30936g.f30952f);
            if (!gm.l.a(s10, this.f30936g.f30952f)) {
                f<b0> fVar = this.f30936g;
                fVar.getClass();
                gm.l.f(s10, "<set-?>");
                fVar.f30952f = s10;
                sm.w0 w0Var = this.f30936g.f30951e;
                this.f30934e = 1;
                if (w0Var.n(s10, this) == aVar) {
                    return aVar;
                }
            }
        }
        return tl.l.f28297a;
    }
}
