package lg;

import java.util.Date;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowSleepRecords$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends zl.i implements fm.q<sm.g<? super List<? extends vf.n>>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19971e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19972f;

    /* renamed from: g */
    public /* synthetic */ Object f19973g;

    /* renamed from: h */
    public final /* synthetic */ d f19974h;

    /* renamed from: i */
    public final /* synthetic */ Date f19975i;

    /* renamed from: j */
    public final /* synthetic */ Date f19976j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xl.d dVar, d dVar2, Date date, Date date2) {
        super(3, dVar);
        this.f19974h = dVar2;
        this.f19975i = date;
        this.f19976j = date2;
    }

    @Override // fm.q
    public final Object j(sm.g<? super List<? extends vf.n>> gVar, Long l10, xl.d<? super tl.l> dVar) {
        v vVar = new v(dVar, this.f19974h, this.f19975i, this.f19976j);
        vVar.f19972f = gVar;
        vVar.f19973g = l10;
        return vVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f wVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19971e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19972f;
            Long l10 = (Long) this.f19973g;
            if (l10 == null) {
                wVar = new sm.i(null);
            } else {
                wVar = new w(this.f19974h.f19485c.B().g(l10.longValue(), this.f19975i, this.f19976j));
            }
            this.f19971e = 1;
            if (bi.r.v(this, wVar, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
