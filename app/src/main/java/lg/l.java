package lg;

import java.util.Date;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowHeartRateRecords$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends zl.i implements fm.q<sm.g<? super List<? extends vf.f>>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19819e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19820f;

    /* renamed from: g */
    public /* synthetic */ Object f19821g;

    /* renamed from: h */
    public final /* synthetic */ d f19822h;

    /* renamed from: i */
    public final /* synthetic */ Date f19823i;

    /* renamed from: j */
    public final /* synthetic */ Date f19824j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xl.d dVar, d dVar2, Date date, Date date2) {
        super(3, dVar);
        this.f19822h = dVar2;
        this.f19823i = date;
        this.f19824j = date2;
    }

    @Override // fm.q
    public final Object j(sm.g<? super List<? extends vf.f>> gVar, Long l10, xl.d<? super tl.l> dVar) {
        l lVar = new l(dVar, this.f19822h, this.f19823i, this.f19824j);
        lVar.f19820f = gVar;
        lVar.f19821g = l10;
        return lVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f mVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19819e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19820f;
            Long l10 = (Long) this.f19821g;
            if (l10 == null) {
                mVar = new sm.i(null);
            } else {
                mVar = new m(this.f19822h.f19485c.w().e(l10.longValue(), this.f19823i, this.f19824j));
            }
            this.f19819e = 1;
            if (bi.r.v(this, mVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
