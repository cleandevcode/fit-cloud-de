package qi;

import mf.a0;
import pm.e0;
import sm.g1;
import y3.d1;

@zl.e(c = "com.topstep.fitcloud.pro.utils.SingleAsyncAction$cancel$1", f = "SingleAsyncState.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f24870e;

    /* renamed from: f */
    public final /* synthetic */ s<Object> f24871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s<Object> sVar, xl.d<? super q> dVar) {
        super(2, dVar);
        this.f24871f = sVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((q) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new q(this.f24871f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f24870e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            g1 g1Var = this.f24871f.f24877b;
            d1 d1Var = d1.f30940b;
            this.f24870e = 1;
            g1Var.setValue(d1Var);
            if (tl.l.f28297a == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
