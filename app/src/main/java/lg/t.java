package lg;

import java.util.Date;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowSleepRecord$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t extends zl.i implements fm.q<sm.g<? super rg.p>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19959e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19960f;

    /* renamed from: g */
    public /* synthetic */ Object f19961g;

    /* renamed from: h */
    public final /* synthetic */ d f19962h;

    /* renamed from: i */
    public final /* synthetic */ Date f19963i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xl.d dVar, d dVar2, Date date) {
        super(3, dVar);
        this.f19962h = dVar2;
        this.f19963i = date;
    }

    @Override // fm.q
    public final Object j(sm.g<? super rg.p> gVar, Long l10, xl.d<? super tl.l> dVar) {
        t tVar = new t(dVar, this.f19962h, this.f19963i);
        tVar.f19960f = gVar;
        tVar.f19961g = l10;
        return tVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f f10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19959e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19960f;
            Long l10 = (Long) this.f19961g;
            if (l10 == null) {
                f10 = new sm.i(null);
            } else {
                f10 = this.f19962h.f19485c.B().f(l10.longValue(), this.f19963i);
            }
            this.f19959e = 1;
            if (bi.r.v(this, f10, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
