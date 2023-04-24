package lg;

import java.util.Date;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowPressureRecords$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends zl.i implements fm.q<sm.g<? super List<? extends vf.m>>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19886e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19887f;

    /* renamed from: g */
    public /* synthetic */ Object f19888g;

    /* renamed from: h */
    public final /* synthetic */ d f19889h;

    /* renamed from: i */
    public final /* synthetic */ Date f19890i;

    /* renamed from: j */
    public final /* synthetic */ Date f19891j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xl.d dVar, d dVar2, Date date, Date date2) {
        super(3, dVar);
        this.f19889h = dVar2;
        this.f19890i = date;
        this.f19891j = date2;
    }

    @Override // fm.q
    public final Object j(sm.g<? super List<? extends vf.m>> gVar, Long l10, xl.d<? super tl.l> dVar) {
        r rVar = new r(dVar, this.f19889h, this.f19890i, this.f19891j);
        rVar.f19887f = gVar;
        rVar.f19888g = l10;
        return rVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f sVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19886e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19887f;
            Long l10 = (Long) this.f19888g;
            if (l10 == null) {
                sVar = new sm.i(null);
            } else {
                sVar = new s(this.f19889h.f19485c.A().e(l10.longValue(), this.f19890i, this.f19891j));
            }
            this.f19886e = 1;
            if (bi.r.v(this, sVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
