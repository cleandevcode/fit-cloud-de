package rm;

import pm.e0;
import rm.j;
import tl.g;

@zl.e(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends zl.i implements fm.p<e0, xl.d<? super j<? extends tl.l>>, Object> {

    /* renamed from: e */
    public int f25852e;

    /* renamed from: f */
    public /* synthetic */ Object f25853f;

    /* renamed from: g */
    public final /* synthetic */ z<Object> f25854g;

    /* renamed from: h */
    public final /* synthetic */ Object f25855h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(z<Object> zVar, Object obj, xl.d<? super k> dVar) {
        super(2, dVar);
        this.f25854g = zVar;
        this.f25855h = obj;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super j<? extends tl.l>> dVar) {
        return ((k) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        k kVar = new k(this.f25854g, this.f25855h, dVar);
        kVar.f25853f = obj;
        return kVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object f10;
        Object aVar;
        yl.a aVar2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f25852e;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                e0 e0Var = (e0) this.f25853f;
                z<Object> zVar = this.f25854g;
                Object obj2 = this.f25855h;
                this.f25852e = 1;
                if (zVar.d(obj2, this) == aVar2) {
                    return aVar2;
                }
            }
            f10 = tl.l.f28297a;
        } catch (Throwable th2) {
            f10 = mf.a0.f(th2);
        }
        if (!(f10 instanceof g.a)) {
            aVar = tl.l.f28297a;
        } else {
            aVar = new j.a(tl.g.a(f10));
        }
        return new j(aVar);
    }
}
