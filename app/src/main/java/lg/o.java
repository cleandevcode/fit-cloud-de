package lg;

import java.util.Date;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowOxygenRecords$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends zl.i implements fm.q<sm.g<? super List<? extends vf.k>>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19857e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19858f;

    /* renamed from: g */
    public /* synthetic */ Object f19859g;

    /* renamed from: h */
    public final /* synthetic */ d f19860h;

    /* renamed from: i */
    public final /* synthetic */ Date f19861i;

    /* renamed from: j */
    public final /* synthetic */ Date f19862j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xl.d dVar, d dVar2, Date date, Date date2) {
        super(3, dVar);
        this.f19860h = dVar2;
        this.f19861i = date;
        this.f19862j = date2;
    }

    @Override // fm.q
    public final Object j(sm.g<? super List<? extends vf.k>> gVar, Long l10, xl.d<? super tl.l> dVar) {
        o oVar = new o(dVar, this.f19860h, this.f19861i, this.f19862j);
        oVar.f19858f = gVar;
        oVar.f19859g = l10;
        return oVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f pVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19857e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19858f;
            Long l10 = (Long) this.f19859g;
            if (l10 == null) {
                pVar = new sm.i(null);
            } else {
                pVar = new p(this.f19860h.f19485c.z().e(l10.longValue(), this.f19861i, this.f19862j));
            }
            this.f19857e = 1;
            if (bi.r.v(this, pVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
