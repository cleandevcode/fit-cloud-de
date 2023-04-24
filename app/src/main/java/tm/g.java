package tm;

import mf.a0;

@zl.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends zl.i implements fm.p<sm.g<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28315e;

    /* renamed from: f */
    public /* synthetic */ Object f28316f;

    /* renamed from: g */
    public final /* synthetic */ h<Object, Object> f28317g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h<Object, Object> hVar, xl.d<? super g> dVar) {
        super(2, dVar);
        this.f28317g = hVar;
    }

    @Override // fm.p
    public final Object A(sm.g<Object> gVar, xl.d<? super tl.l> dVar) {
        return ((g) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        g gVar = new g(this.f28317g, dVar);
        gVar.f28316f = obj;
        return gVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28315e;
        if (i10 == 0) {
            a0.k(obj);
            h<Object, Object> hVar = this.f28317g;
            this.f28315e = 1;
            if (hVar.j((sm.g) this.f28316f, this) == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            a0.k(obj);
        }
        return tl.l.f28297a;
    }
}
