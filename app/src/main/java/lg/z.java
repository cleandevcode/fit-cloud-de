package lg;

import java.util.Date;
import java.util.List;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowStepRecords$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends zl.i implements fm.q<sm.g<? super List<? extends vf.p>>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19994e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19995f;

    /* renamed from: g */
    public /* synthetic */ Object f19996g;

    /* renamed from: h */
    public final /* synthetic */ d f19997h;

    /* renamed from: i */
    public final /* synthetic */ Date f19998i;

    /* renamed from: j */
    public final /* synthetic */ Date f19999j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(xl.d dVar, d dVar2, Date date, Date date2) {
        super(3, dVar);
        this.f19997h = dVar2;
        this.f19998i = date;
        this.f19999j = date2;
    }

    @Override // fm.q
    public final Object j(sm.g<? super List<? extends vf.p>> gVar, Long l10, xl.d<? super tl.l> dVar) {
        z zVar = new z(dVar, this.f19997h, this.f19998i, this.f19999j);
        zVar.f19995f = gVar;
        zVar.f19996g = l10;
        return zVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f a0Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19994e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19995f;
            Long l10 = (Long) this.f19996g;
            if (l10 == null) {
                a0Var = new sm.i(null);
            } else {
                a0Var = new a0(this.f19997h.f19485c.D().g(l10.longValue(), this.f19998i, this.f19999j));
            }
            this.f19994e = 1;
            if (bi.r.v(this, a0Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
