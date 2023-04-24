package m2;

import java.util.concurrent.Callable;
import pm.e0;

@zl.e(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ Callable<Object> f20191e;

    /* renamed from: f */
    public final /* synthetic */ pm.i<Object> f20192f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Callable<Object> callable, pm.i<Object> iVar, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f20191e = callable;
        this.f20192f = iVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new e(this.f20191e, this.f20192f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        try {
            this.f20192f.l(this.f20191e.call());
        } catch (Throwable th2) {
            this.f20192f.l(mf.a0.f(th2));
        }
        return tl.l.f28297a;
    }
}
