package lg;

import java.util.Date;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowBloodPressureRecords$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends zl.i implements fm.q<sm.g<? super List<? extends vf.c>>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19755e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19756f;

    /* renamed from: g */
    public /* synthetic */ Object f19757g;

    /* renamed from: h */
    public final /* synthetic */ d f19758h;

    /* renamed from: i */
    public final /* synthetic */ Date f19759i;

    /* renamed from: j */
    public final /* synthetic */ Date f19760j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xl.d dVar, d dVar2, Date date, Date date2) {
        super(3, dVar);
        this.f19758h = dVar2;
        this.f19759i = date;
        this.f19760j = date2;
    }

    @Override // fm.q
    public final Object j(sm.g<? super List<? extends vf.c>> gVar, Long l10, xl.d<? super tl.l> dVar) {
        g gVar2 = new g(dVar, this.f19758h, this.f19759i, this.f19760j);
        gVar2.f19756f = gVar;
        gVar2.f19757g = l10;
        return gVar2.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f hVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19755e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19756f;
            Long l10 = (Long) this.f19757g;
            if (l10 == null) {
                hVar = new sm.i(null);
            } else {
                hVar = new h(this.f19758h.f19485c.r().e(l10.longValue(), this.f19759i, this.f19760j));
            }
            this.f19755e = 1;
            if (bi.r.v(this, hVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
