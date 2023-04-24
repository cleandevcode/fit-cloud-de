package tm;

import mf.a0;

@zl.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends zl.i implements fm.p<rm.t<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28309e;

    /* renamed from: f */
    public /* synthetic */ Object f28310f;

    /* renamed from: g */
    public final /* synthetic */ f<Object> f28311g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f<Object> fVar, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f28311g = fVar;
    }

    @Override // fm.p
    public final Object A(rm.t<Object> tVar, xl.d<? super tl.l> dVar) {
        return ((e) p(tVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        e eVar = new e(this.f28311g, dVar);
        eVar.f28310f = obj;
        return eVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28309e;
        if (i10 == 0) {
            a0.k(obj);
            f<Object> fVar = this.f28311g;
            this.f28309e = 1;
            if (fVar.f((rm.t) this.f28310f, this) == aVar) {
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
