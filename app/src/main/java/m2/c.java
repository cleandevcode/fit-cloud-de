package m2;

import java.util.concurrent.Callable;
import pm.e0;

@zl.e(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends zl.i implements fm.p<e0, xl.d<Object>, Object> {

    /* renamed from: e */
    public final /* synthetic */ Callable<Object> f20184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Callable<Object> callable, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f20184e = callable;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<Object> dVar) {
        return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new c(this.f20184e, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        return this.f20184e.call();
    }
}
