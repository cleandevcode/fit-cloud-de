package di;

import fm.p;
import mf.a0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportDfuDialogFragment$onCreateDialog$2$2$1$1", f = "SportDfuDialogFragment.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f13060e;

    /* renamed from: f */
    public final /* synthetic */ c f13061f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f13061f = cVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new d(this.f13061f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f13060e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            this.f13060e = 1;
            if (a0.g(2000L, this) == aVar) {
                return aVar;
            }
        }
        this.f13061f.c1(false, false);
        return tl.l.f28297a;
    }
}
