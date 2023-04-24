package ph;

import java.util.Date;
import java.util.List;
import ph.c;

@zl.e(c = "com.topstep.fitcloud.pro.ui.data.AbsHealthDetailViewModel$dateClick$1", f = "AbsHealthDetailFragment.kt", l = {286}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f24132e;

    /* renamed from: f */
    public final /* synthetic */ c<vf.i> f24133f;

    /* renamed from: g */
    public final /* synthetic */ Date f24134g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c<vf.i> cVar, Date date, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f24133f = cVar;
        this.f24134g = date;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new d(this.f24133f, this.f24134g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f24132e;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            c<vf.i> cVar = this.f24133f;
            this.f24132e = 1;
            obj = cVar.e(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        List list = (List) ((c.C0438c) obj).f24130a.a();
        if (list != null && !list.isEmpty()) {
            z10 = false;
        }
        if (z10) {
            return tl.l.f28297a;
        }
        c.j(this.f24133f, list, this.f24134g);
        return tl.l.f28297a;
    }
}
