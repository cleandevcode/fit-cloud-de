package lg;

import com.topstep.fitcloud.pro.shared.data.entity.data.StepRecordEntity;
import java.util.Date;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowStepRecord$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends zl.i implements fm.q<sm.g<? super StepRecordEntity>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19982e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19983f;

    /* renamed from: g */
    public /* synthetic */ Object f19984g;

    /* renamed from: h */
    public final /* synthetic */ d f19985h;

    /* renamed from: i */
    public final /* synthetic */ Date f19986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xl.d dVar, d dVar2, Date date) {
        super(3, dVar);
        this.f19985h = dVar2;
        this.f19986i = date;
    }

    @Override // fm.q
    public final Object j(sm.g<? super StepRecordEntity> gVar, Long l10, xl.d<? super tl.l> dVar) {
        x xVar = new x(dVar, this.f19985h, this.f19986i);
        xVar.f19983f = gVar;
        xVar.f19984g = l10;
        return xVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f f10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19982e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19983f;
            Long l10 = (Long) this.f19984g;
            if (l10 == null) {
                f10 = new sm.i(null);
            } else {
                f10 = this.f19985h.f19485c.D().f(l10.longValue(), this.f19986i);
            }
            this.f19982e = 1;
            if (bi.r.v(this, f10, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
