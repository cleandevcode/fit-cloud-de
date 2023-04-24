package lg;

import com.topstep.fitcloud.pro.model.data.SportTotal;
import mg.d9;
import mg.z8;
import sm.u0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl$flowTotal$$inlined$flatMapLatest$1", f = "SportRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o0 extends zl.i implements fm.q<sm.g<? super SportTotal>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19863e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19864f;

    /* renamed from: g */
    public /* synthetic */ Object f19865g;

    /* renamed from: h */
    public final /* synthetic */ r0 f19866h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, xl.d dVar) {
        super(3, dVar);
        this.f19866h = r0Var;
    }

    @Override // fm.q
    public final Object j(sm.g<? super SportTotal> gVar, Long l10, xl.d<? super tl.l> dVar) {
        o0 o0Var = new o0(this.f19866h, dVar);
        o0Var.f19864f = gVar;
        o0Var.f19865g = l10;
        return o0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f n0Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19863e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19864f;
            Long l10 = (Long) this.f19865g;
            if (l10 == null) {
                n0Var = new sm.i(new SportTotal(0, 0.0f, 3, null));
            } else {
                u0 i11 = this.f19866h.f19893b.C().i(l10.longValue());
                if (hh.b.f(l10.longValue())) {
                    n0Var = i11;
                } else {
                    r0 r0Var = this.f19866h;
                    long longValue = l10.longValue();
                    long d10 = yg.l.d(r0Var.f19892a, longValue);
                    d9 E = r0Var.f19893b.E();
                    n0Var = new sm.n0(new sm.k0(new q0(d10, longValue, r0Var, null), new z8(E.b(2001, longValue), E)), i11, new p0(null));
                }
            }
            this.f19863e = 1;
            if (bi.r.v(this, n0Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
