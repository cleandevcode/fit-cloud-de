package lg;

import java.util.Date;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowTemperatureRecords$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends zl.i implements fm.q<sm.g<? super List<? extends vf.r>>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19477e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19478f;

    /* renamed from: g */
    public /* synthetic */ Object f19479g;

    /* renamed from: h */
    public final /* synthetic */ d f19480h;

    /* renamed from: i */
    public final /* synthetic */ Date f19481i;

    /* renamed from: j */
    public final /* synthetic */ Date f19482j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xl.d dVar, d dVar2, Date date, Date date2) {
        super(3, dVar);
        this.f19480h = dVar2;
        this.f19481i = date;
        this.f19482j = date2;
    }

    @Override // fm.q
    public final Object j(sm.g<? super List<? extends vf.r>> gVar, Long l10, xl.d<? super tl.l> dVar) {
        c0 c0Var = new c0(dVar, this.f19480h, this.f19481i, this.f19482j);
        c0Var.f19478f = gVar;
        c0Var.f19479g = l10;
        return c0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f d0Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19477e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19478f;
            Long l10 = (Long) this.f19479g;
            if (l10 == null) {
                d0Var = new sm.i(null);
            } else {
                d0Var = new d0(this.f19480h.f19485c.F().e(l10.longValue(), this.f19481i, this.f19482j));
            }
            this.f19477e = 1;
            if (bi.r.v(this, d0Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
