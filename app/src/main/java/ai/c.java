package ai;

import fm.p;
import mf.a0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GameDfuDialogFragment$onCreateDialog$2$2$1$1", f = "GameDfuDialogFragment.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f534e;

    /* renamed from: f */
    public final /* synthetic */ b f535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f535f = bVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new c(this.f535f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f534e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            this.f534e = 1;
            if (a0.g(2000L, this) == aVar) {
                return aVar;
            }
        }
        this.f535f.c1(false, false);
        return tl.l.f28297a;
    }
}
