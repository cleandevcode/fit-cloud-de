package ph;

import java.util.List;
import ph.c;

@zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailFragment$blockClick$1$list$1", f = "AbsHealthDetailFragment.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends zl.i implements fm.p<pm.e0, xl.d<? super List<vf.i>>, Object> {

    /* renamed from: e */
    public int f24084e;

    /* renamed from: f */
    public final /* synthetic */ b<vf.i, r7.a<?>> f24085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b<vf.i, r7.a<?>> bVar, xl.d<? super a> dVar) {
        super(2, dVar);
        this.f24085f = bVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super List<vf.i>> dVar) {
        return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new a(this.f24085f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f24084e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            c<vf.i> m12 = this.f24085f.m1();
            this.f24084e = 1;
            obj = m12.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return ((c.C0438c) obj).f24130a.a();
    }
}
