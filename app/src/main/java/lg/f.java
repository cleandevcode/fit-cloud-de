package lg;

import com.topstep.fitcloud.pro.model.data.BloodPressureRealtime;
import mg.d9;
import mg.u8;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowBloodPressureRealtime$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends zl.i implements fm.q<sm.g<? super BloodPressureRealtime>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19748e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19749f;

    /* renamed from: g */
    public /* synthetic */ Object f19750g;

    /* renamed from: h */
    public final /* synthetic */ d f19751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, xl.d dVar2) {
        super(3, dVar2);
        this.f19751h = dVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super BloodPressureRealtime> gVar, Long l10, xl.d<? super tl.l> dVar) {
        f fVar = new f(this.f19751h, dVar);
        fVar.f19749f = gVar;
        fVar.f19750g = l10;
        return fVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f u8Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19748e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19749f;
            Long l10 = (Long) this.f19750g;
            if (l10 == null) {
                u8Var = new sm.i(null);
            } else {
                d9 E = this.f19751h.f19485c.E();
                u8Var = new u8(E.b(1003, l10.longValue()), E);
            }
            this.f19748e = 1;
            if (bi.r.v(this, u8Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
