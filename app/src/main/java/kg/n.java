package kg;

import bi.r;
import fm.q;
import mf.a0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UserInfoRepositoryImpl$special$$inlined$flatMapLatest$1", f = "UserInfoRepository.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends zl.i implements q<sm.g<? super uf.c>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f18576e;

    /* renamed from: f */
    public /* synthetic */ sm.g f18577f;

    /* renamed from: g */
    public /* synthetic */ Object f18578g;

    /* renamed from: h */
    public final /* synthetic */ m f18579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, xl.d dVar) {
        super(3, dVar);
        this.f18579h = mVar;
    }

    @Override // fm.q
    public final Object j(sm.g<? super uf.c> gVar, Long l10, xl.d<? super tl.l> dVar) {
        n nVar = new n(this.f18579h, dVar);
        nVar.f18577f = gVar;
        nVar.f18578g = l10;
        return nVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f b10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f18576e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            sm.g gVar = this.f18577f;
            Long l10 = (Long) this.f18578g;
            if (l10 == null) {
                b10 = new sm.i(null);
            } else {
                b10 = this.f18579h.f18535e.H().b(l10.longValue());
            }
            this.f18576e = 1;
            if (r.v(this, b10, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
