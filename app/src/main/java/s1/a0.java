package s1;

import pm.e0;

@zl.e(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a0 extends zl.i implements fm.p<e0, xl.d<Object>, Object> {

    /* renamed from: e */
    public int f26401e;

    /* renamed from: f */
    public final /* synthetic */ fm.p<Object, xl.d<Object>, Object> f26402f;

    /* renamed from: g */
    public final /* synthetic */ Object f26403g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Object obj, xl.d dVar, fm.p pVar) {
        super(2, dVar);
        this.f26402f = pVar;
        this.f26403g = obj;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<Object> dVar) {
        return ((a0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new a0(this.f26403g, dVar, this.f26402f);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f26401e;
        if (i10 == 0) {
            mf.a0.k(obj);
            fm.p<Object, xl.d<Object>, Object> pVar = this.f26402f;
            Object obj2 = this.f26403g;
            this.f26401e = 1;
            obj = pVar.A(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mf.a0.k(obj);
        }
        return obj;
    }
}
