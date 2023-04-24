package v6;

import bi.r;
import fm.p;
import ih.v;
import mf.a0;
import pm.e0;
import tl.l;
import zl.i;

@zl.e(c = "com.github.kilnn.mvrx.MavericksViewModel$resolveSubscription$1", f = "MavericksViewModel.kt", l = {372, 373}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f29148e;

    /* renamed from: f */
    public final /* synthetic */ sm.f<Object> f29149f;

    /* renamed from: g */
    public final /* synthetic */ p<Object, xl.d<? super l>, Object> f29150g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(sm.f<Object> fVar, p<Object, ? super xl.d<? super l>, ? extends Object> pVar, xl.d<? super e> dVar) {
        super(2, dVar);
        this.f29149f = fVar;
        this.f29150g = pVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((e) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new e(this.f29149f, this.f29150g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f29148e;
        if (i10 == 0) {
            a0.k(obj);
            this.f29148e = 1;
            if (v.B(this) == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                a0.k(obj);
                return l.f28297a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            a0.k(obj);
        }
        sm.f<Object> fVar = this.f29149f;
        p<Object, xl.d<? super l>, Object> pVar = this.f29150g;
        this.f29148e = 2;
        if (r.o(fVar, pVar, this) == aVar) {
            return aVar;
        }
        return l.f28297a;
    }
}
