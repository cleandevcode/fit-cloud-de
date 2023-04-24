package lg;

import com.topstep.fitcloud.pro.model.data.TemperatureRealtime;
import mg.a9;
import mg.d9;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowTemperatureRealtime$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends zl.i implements fm.q<sm.g<? super TemperatureRealtime>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19473e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19474f;

    /* renamed from: g */
    public /* synthetic */ Object f19475g;

    /* renamed from: h */
    public final /* synthetic */ d f19476h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d dVar, xl.d dVar2) {
        super(3, dVar2);
        this.f19476h = dVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super TemperatureRealtime> gVar, Long l10, xl.d<? super tl.l> dVar) {
        b0 b0Var = new b0(this.f19476h, dVar);
        b0Var.f19474f = gVar;
        b0Var.f19475g = l10;
        return b0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f a9Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19473e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19474f;
            Long l10 = (Long) this.f19475g;
            if (l10 == null) {
                a9Var = new sm.i(null);
            } else {
                d9 E = this.f19476h.f19485c.E();
                a9Var = new a9(E.b(1005, l10.longValue()), E);
            }
            this.f19473e = 1;
            if (bi.r.v(this, a9Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
