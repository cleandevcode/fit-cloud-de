package y3;

@zl.e(c = "com.airbnb.mvrx.CoroutinesStateStore$setupTriggerFlushQueues$1", f = "CoroutinesStateStore.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f30941e;

    /* renamed from: f */
    public /* synthetic */ Object f30942f;

    /* renamed from: g */
    public final /* synthetic */ f<b0> f30943g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f<b0> fVar, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f30943g = fVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        e eVar = new e(this.f30943g, dVar);
        eVar.f30942f = obj;
        return eVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        pm.e0 e0Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f30941e;
        if (i10 == 0) {
            mf.a0.k(obj);
            e0Var = (pm.e0) this.f30942f;
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            e0Var = (pm.e0) this.f30942f;
            mf.a0.k(obj);
        }
        while (bi.r.D(e0Var)) {
            f<b0> fVar = this.f30943g;
            this.f30942f = e0Var;
            this.f30941e = 1;
            if (f.e(fVar, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
