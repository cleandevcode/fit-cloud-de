package lg;

import com.topstep.fitcloud.pro.model.data.HeartRateRealtime;
import mg.d9;
import mg.v8;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowHeartRateRealtime$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends zl.i implements fm.q<sm.g<? super HeartRateRealtime>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19813e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19814f;

    /* renamed from: g */
    public /* synthetic */ Object f19815g;

    /* renamed from: h */
    public final /* synthetic */ d f19816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, xl.d dVar2) {
        super(3, dVar2);
        this.f19816h = dVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super HeartRateRealtime> gVar, Long l10, xl.d<? super tl.l> dVar) {
        k kVar = new k(this.f19816h, dVar);
        kVar.f19814f = gVar;
        kVar.f19815g = l10;
        return kVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f v8Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19813e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19814f;
            Long l10 = (Long) this.f19815g;
            if (l10 == null) {
                v8Var = new sm.i(null);
            } else {
                d9 E = this.f19816h.f19485c.E();
                v8Var = new v8(E.b(1001, l10.longValue()), E);
            }
            this.f19813e = 1;
            if (bi.r.v(this, v8Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
