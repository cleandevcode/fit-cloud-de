package kg;

import bi.r;
import fm.q;
import mf.a0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UnitConfigRepositoryImpl$special$$inlined$flatMapLatest$1", f = "UnitConfigRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends zl.i implements q<sm.g<? super pg.k>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f18518e;

    /* renamed from: f */
    public /* synthetic */ sm.g f18519f;

    /* renamed from: g */
    public /* synthetic */ Object f18520g;

    /* renamed from: h */
    public final /* synthetic */ h f18521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, xl.d dVar) {
        super(3, dVar);
        this.f18521h = hVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super pg.k> gVar, Long l10, xl.d<? super tl.l> dVar) {
        i iVar = new i(this.f18521h, dVar);
        iVar.f18519f = gVar;
        iVar.f18520g = l10;
        return iVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f j10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f18518e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            sm.g gVar = this.f18519f;
            Long l10 = (Long) this.f18520g;
            if (l10 == null) {
                j10 = new sm.i(null);
            } else {
                j10 = this.f18521h.f18505c.t().j(l10.longValue());
            }
            this.f18518e = 1;
            if (r.v(this, j10, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
