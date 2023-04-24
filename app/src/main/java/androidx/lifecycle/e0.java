package androidx.lifecycle;

import androidx.lifecycle.k;
import bi.z0;
import pm.g1;

@zl.e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e0 extends zl.i implements fm.p<pm.e0, xl.d<Object>, Object> {

    /* renamed from: e */
    public int f2708e;

    /* renamed from: f */
    public /* synthetic */ Object f2709f;

    /* renamed from: g */
    public final /* synthetic */ k f2710g;

    /* renamed from: h */
    public final /* synthetic */ k.c f2711h;

    /* renamed from: i */
    public final /* synthetic */ fm.p<pm.e0, xl.d<Object>, Object> f2712i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(k kVar, k.c cVar, fm.p<? super pm.e0, ? super xl.d<Object>, ? extends Object> pVar, xl.d<? super e0> dVar) {
        super(2, dVar);
        this.f2710g = kVar;
        this.f2711h = cVar;
        this.f2712i = pVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<Object> dVar) {
        return ((e0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        e0 e0Var = new e0(this.f2710g, this.f2711h, this.f2712i, dVar);
        e0Var.f2709f = obj;
        return e0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        m mVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f2708e;
        if (i10 == 0) {
            mf.a0.k(obj);
            xl.f E = ((pm.e0) this.f2709f).E();
            int i11 = g1.K;
            g1 g1Var = (g1) E.b(g1.b.f24341a);
            if (g1Var == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            d0 d0Var = new d0();
            m mVar2 = new m(this.f2710g, this.f2711h, d0Var.f2703c, g1Var);
            try {
                fm.p<pm.e0, xl.d<Object>, Object> pVar = this.f2712i;
                this.f2709f = mVar2;
                this.f2708e = 1;
                obj = z0.s(this, d0Var, pVar);
                if (obj == aVar) {
                    return aVar;
                }
                mVar = mVar2;
            } catch (Throwable th2) {
                th = th2;
                mVar = mVar2;
                mVar.a();
                throw th;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mVar = (m) this.f2709f;
            try {
                mf.a0.k(obj);
            } catch (Throwable th3) {
                th = th3;
                mVar.a();
                throw th;
            }
        }
        mVar.a();
        return obj;
    }
}
