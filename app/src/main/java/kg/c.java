package kg;

import bi.r;
import fm.q;
import mf.a0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.ExerciseGoalRepositoryImpl$special$$inlined$flatMapLatest$1", f = "ExerciseGoalRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends zl.i implements q<sm.g<? super pg.f>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f18487e;

    /* renamed from: f */
    public /* synthetic */ sm.g f18488f;

    /* renamed from: g */
    public /* synthetic */ Object f18489g;

    /* renamed from: h */
    public final /* synthetic */ b f18490h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, xl.d dVar) {
        super(3, dVar);
        this.f18490h = bVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super pg.f> gVar, Long l10, xl.d<? super tl.l> dVar) {
        c cVar = new c(this.f18490h, dVar);
        cVar.f18488f = gVar;
        cVar.f18489g = l10;
        return cVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f i10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i11 = this.f18487e;
        if (i11 != 0) {
            if (i11 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            sm.g gVar = this.f18488f;
            Long l10 = (Long) this.f18489g;
            if (l10 == null) {
                i10 = new sm.i(null);
            } else {
                i10 = this.f18490h.f18477c.t().i(l10.longValue());
            }
            this.f18487e = 1;
            if (r.v(this, i10, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
