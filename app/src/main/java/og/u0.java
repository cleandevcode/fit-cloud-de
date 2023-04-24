package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$special$$inlined$flatMapLatest$1", f = "DeviceManager.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u0 extends zl.i implements fm.q<sm.g<? super pg.d>, Long, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23496e;

    /* renamed from: f */
    public /* synthetic */ sm.g f23497f;

    /* renamed from: g */
    public /* synthetic */ Object f23498g;

    /* renamed from: h */
    public final /* synthetic */ d0 f23499h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(d0 d0Var, xl.d dVar) {
        super(3, dVar);
        this.f23499h = d0Var;
    }

    @Override // fm.q
    public final Object j(sm.g<? super pg.d> gVar, Long l10, xl.d<? super tl.l> dVar) {
        u0 u0Var = new u0(this.f23499h, dVar);
        u0Var.f23497f = gVar;
        u0Var.f23498g = l10;
        return u0Var.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        sm.f h10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23496e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.g gVar = this.f23497f;
            Long l10 = (Long) this.f23498g;
            this.f23499h.f23260p.setValue(null);
            if (l10 == null) {
                h10 = new sm.i(null);
            } else {
                h10 = this.f23499h.f23259o.h(l10.longValue());
            }
            this.f23496e = 1;
            if (bi.r.v(this, h10, gVar) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
