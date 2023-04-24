package lg;

import com.topstep.fitcloud.pro.model.data.SportGoal;
import mg.d9;
import mg.y8;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.SportRepositoryImpl$flowGoal$$inlined$flatMapLatest$1", f = "SportRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l0 extends zl.i implements fm.q<sm.g<? super SportGoal>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19825e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19826f;

    /* renamed from: g */
    public /* synthetic */ Object f19827g;

    /* renamed from: h */
    public final /* synthetic */ int f19828h;

    /* renamed from: i */
    public final /* synthetic */ r0 f19829i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(xl.d dVar, int i10, r0 r0Var) {
        super(3, dVar);
        this.f19828h = i10;
        this.f19829i = r0Var;
    }

    @Override // fm.q
    public final Object j(sm.g<? super SportGoal> gVar, Long l10, xl.d<? super tl.l> dVar) {
        l0 l0Var = new l0(dVar, this.f19828h, this.f19829i);
        l0Var.f19826f = gVar;
        l0Var.f19827g = l10;
        return l0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        long d10;
        sm.f n0Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19825e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19826f;
            Long l10 = (Long) this.f19827g;
            if (l10 == null) {
                n0Var = new sm.i(new SportGoal(this.f19828h, 0, 0.0f, 0, 14, null));
            } else {
                if (hh.b.f(l10.longValue())) {
                    d10 = 0;
                } else {
                    d10 = yg.l.d(this.f19829i.f19892a, l10.longValue());
                }
                d9 E = this.f19829i.f19893b.E();
                n0Var = new n0(new y8(E.b(2003, l10.longValue()), E), l10, d10, this.f19829i, this.f19828h);
            }
            this.f19825e = 1;
            if (bi.r.v(this, n0Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
