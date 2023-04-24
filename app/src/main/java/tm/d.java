package tm;

import mf.a0;
import pm.e0;

@zl.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28305e;

    /* renamed from: f */
    public /* synthetic */ Object f28306f;

    /* renamed from: g */
    public final /* synthetic */ sm.g<Object> f28307g;

    /* renamed from: h */
    public final /* synthetic */ f<Object> f28308h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xl.d dVar, sm.g gVar, f fVar) {
        super(2, dVar);
        this.f28307g = gVar;
        this.f28308h = fVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        d dVar2 = new d(dVar, this.f28307g, this.f28308h);
        dVar2.f28306f = obj;
        return dVar2;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object obj2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28305e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            sm.g<Object> gVar = this.f28307g;
            rm.v<Object> i11 = this.f28308h.i((e0) this.f28306f);
            this.f28305e = 1;
            Object a10 = sm.j.a(gVar, i11, true, this);
            if (a10 != obj2) {
                a10 = tl.l.f28297a;
            }
            if (a10 == obj2) {
                return obj2;
            }
        }
        return tl.l.f28297a;
    }
}
