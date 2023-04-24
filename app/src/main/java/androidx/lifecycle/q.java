package androidx.lifecycle;

import androidx.lifecycle.k;

@zl.e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f2769e;

    /* renamed from: f */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f2770f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, xl.d<? super q> dVar) {
        super(2, dVar);
        this.f2770f = lifecycleCoroutineScopeImpl;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((q) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        q qVar = new q(this.f2770f, dVar);
        qVar.f2769e = obj;
        return qVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        pm.e0 e0Var = (pm.e0) this.f2769e;
        if (this.f2770f.f2635a.b().compareTo(k.c.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f2770f;
            lifecycleCoroutineScopeImpl.f2635a.a(lifecycleCoroutineScopeImpl);
        } else {
            bi.m0.f(e0Var.E(), null);
        }
        return tl.l.f28297a;
    }
}
