package u6;

import pm.e0;

@zl.e(c = "com.github.airbnb.mvrx.CoroutinesStateStore$setupTriggerFlushQueues$1", f = "CoroutinesStateStore.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28531e;

    /* renamed from: f */
    public /* synthetic */ Object f28532f;

    /* renamed from: g */
    public final /* synthetic */ e<o> f28533g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e<o> eVar, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f28533g = eVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        d dVar2 = new d(this.f28533g, dVar);
        dVar2.f28532f = obj;
        return dVar2;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        e0 e0Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28531e;
        if (i10 == 0) {
            mf.a0.k(obj);
            e0Var = (e0) this.f28532f;
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            e0Var = (e0) this.f28532f;
            mf.a0.k(obj);
        }
        while (bi.r.D(e0Var)) {
            e<o> eVar = this.f28533g;
            this.f28532f = e0Var;
            this.f28531e = 1;
            if (e.a(eVar, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
