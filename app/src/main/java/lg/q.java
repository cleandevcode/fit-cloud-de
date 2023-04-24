package lg;

import com.topstep.fitcloud.pro.model.data.PressureRealtime;
import mg.d9;
import mg.x8;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowPressureRealtime$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q extends zl.i implements fm.q<sm.g<? super PressureRealtime>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19874e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19875f;

    /* renamed from: g */
    public /* synthetic */ Object f19876g;

    /* renamed from: h */
    public final /* synthetic */ d f19877h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d dVar, xl.d dVar2) {
        super(3, dVar2);
        this.f19877h = dVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super PressureRealtime> gVar, Long l10, xl.d<? super tl.l> dVar) {
        q qVar = new q(this.f19877h, dVar);
        qVar.f19875f = gVar;
        qVar.f19876g = l10;
        return qVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f x8Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19874e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19875f;
            Long l10 = (Long) this.f19876g;
            if (l10 == null) {
                x8Var = new sm.i(null);
            } else {
                d9 E = this.f19877h.f19485c.E();
                x8Var = new x8(E.b(1006, l10.longValue()), E);
            }
            this.f19874e = 1;
            if (bi.r.v(this, x8Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
