package lg;

import com.topstep.fitcloud.pro.model.data.SportTotal;
import com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl$flowTotal$1$1", f = "SportRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p0 extends zl.i implements fm.q<SportTotalCache, SportTotal, xl.d<? super SportTotal>, Object> {

    /* renamed from: e */
    public /* synthetic */ SportTotalCache f19872e;

    /* renamed from: f */
    public /* synthetic */ SportTotal f19873f;

    public p0(xl.d<? super p0> dVar) {
        super(3, dVar);
    }

    @Override // fm.q
    public final Object j(SportTotalCache sportTotalCache, SportTotal sportTotal, xl.d<? super SportTotal> dVar) {
        p0 p0Var = new p0(dVar);
        p0Var.f19872e = sportTotalCache;
        p0Var.f19873f = sportTotal;
        return p0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        SportTotalCache sportTotalCache = this.f19872e;
        SportTotal sportTotal = this.f19873f;
        return new SportTotal(sportTotalCache.f10080b + sportTotal.f9647b, sportTotalCache.f10079a + sportTotal.f9646a);
    }
}
