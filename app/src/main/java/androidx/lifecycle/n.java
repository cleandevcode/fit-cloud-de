package androidx.lifecycle;

import androidx.lifecycle.k;
import bi.z0;

@zl.e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f2752e;

    /* renamed from: f */
    public final /* synthetic */ p f2753f;

    /* renamed from: g */
    public final /* synthetic */ fm.p<pm.e0, xl.d<? super tl.l>, Object> f2754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(p pVar, fm.p<? super pm.e0, ? super xl.d<? super tl.l>, ? extends Object> pVar2, xl.d<? super n> dVar) {
        super(2, dVar);
        this.f2753f = pVar;
        this.f2754g = pVar2;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((n) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new n(this.f2753f, this.f2754g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f2752e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            k a10 = this.f2753f.a();
            fm.p<pm.e0, xl.d<? super tl.l>, Object> pVar = this.f2754g;
            this.f2752e = 1;
            k.c cVar = k.c.RESUMED;
            wm.c cVar2 = pm.o0.f24381a;
            if (z0.s(this, um.q.f28935a.q0(), new e0(a10, cVar, pVar, null)) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
