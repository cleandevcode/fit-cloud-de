package lg;

import mg.d9;
import mg.t8;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.data.DataRepositoryImpl$flowAllRealtime$$inlined$flatMapLatest$1", f = "DataRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends zl.i implements fm.q<sm.g<? super vf.a>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19741e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19742f;

    /* renamed from: g */
    public /* synthetic */ Object f19743g;

    /* renamed from: h */
    public final /* synthetic */ d f19744h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, xl.d dVar2) {
        super(3, dVar2);
        this.f19744h = dVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super vf.a> gVar, Long l10, xl.d<? super tl.l> dVar) {
        e eVar = new e(this.f19744h, dVar);
        eVar.f19742f = gVar;
        eVar.f19743g = l10;
        return eVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f t8Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19741e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f19742f;
            Long l10 = (Long) this.f19743g;
            if (l10 == null) {
                t8Var = new sm.i(null);
            } else {
                d9 E = this.f19744h.f19485c.E();
                t8Var = new t8(E.c(l10.longValue()), E);
            }
            this.f19741e = 1;
            if (bi.r.v(this, t8Var, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
