package mi;

import com.topstep.fitcloud.pro.model.data.SportRecord;
import mi.z;

@zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportHistoryViewModel$flow$1$1", f = "SportHistoryFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends zl.i implements fm.p<SportRecord, xl.d<? super z.a>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f21798e;

    public a0(xl.d<? super a0> dVar) {
        super(2, dVar);
    }

    @Override // fm.p
    public final Object A(SportRecord sportRecord, xl.d<? super z.a> dVar) {
        return ((a0) p(sportRecord, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        a0 a0Var = new a0(dVar);
        a0Var.f21798e = obj;
        return a0Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        return new z.a((SportRecord) this.f21798e);
    }
}
