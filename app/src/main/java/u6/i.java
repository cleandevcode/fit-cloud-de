package u6;

import pm.e0;

@zl.e(c = "com.github.airbnb.mvrx.FlowExtensionsKt$collectLatest$1", f = "FlowExtensions.kt", l = {35, 36}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28549e;

    /* renamed from: f */
    public final /* synthetic */ sm.f<Object> f28550f;

    /* renamed from: g */
    public final /* synthetic */ fm.p<Object, xl.d<? super tl.l>, Object> f28551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(sm.f<Object> fVar, fm.p<Object, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super i> dVar) {
        super(2, dVar);
        this.f28550f = fVar;
        this.f28551g = pVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((i) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new i(this.f28550f, this.f28551g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28549e;
        if (i10 == 0) {
            mf.a0.k(obj);
            this.f28549e = 1;
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
        sm.f<Object> fVar = this.f28550f;
        fm.p<Object, xl.d<? super tl.l>, Object> pVar = this.f28551g;
        this.f28549e = 2;
        if (bi.r.o(fVar, pVar, this) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
