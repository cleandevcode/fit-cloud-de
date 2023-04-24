package lg;

import com.topstep.fitcloud.pro.model.data.OxygenRealtime;
import mg.d9;
import mg.w8;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowOxygenRealtime$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends zl.i implements fm.q<sm.g<? super OxygenRealtime>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19840e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19841f;

    /* renamed from: g */
    public /* synthetic */ Object f19842g;

    /* renamed from: h */
    public final /* synthetic */ d f19843h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d dVar, xl.d dVar2) {
        super(3, dVar2);
        this.f19843h = dVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super OxygenRealtime> gVar, Long l10, xl.d<? super tl.l> dVar) {
        n nVar = new n(this.f19843h, dVar);
        nVar.f19841f = gVar;
        nVar.f19842g = l10;
        return nVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f w8Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19840e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19841f;
            Long l10 = (Long) this.f19842g;
            if (l10 == null) {
                w8Var = new sm.i(null);
            } else {
                d9 E = this.f19843h.f19485c.E();
                w8Var = new w8(E.b(1002, l10.longValue()), E);
            }
            this.f19840e = 1;
            if (bi.r.v(this, w8Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
