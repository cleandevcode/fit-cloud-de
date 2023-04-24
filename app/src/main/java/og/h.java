package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setHeartRateAlarmConfig$1", f = "DeviceConfigFeature.kt", l = {275}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23355e;

    /* renamed from: f */
    public final /* synthetic */ f f23356f;

    /* renamed from: g */
    public final /* synthetic */ nj.g f23357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, nj.g gVar, xl.d<? super h> dVar) {
        super(2, dVar);
        this.f23356f = fVar;
        this.f23357g = gVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((h) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new h(this.f23356f, this.f23357g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        tk.a g10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23355e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.b bVar = this.f23356f.f23334a;
            nj.g gVar = this.f23357g;
            jj.l lVar = (jj.l) bVar;
            lVar.getClass();
            gm.l.f(gVar, "config");
            if (h7.a.m(lVar.f17930d, 260)) {
                g10 = h7.a.e();
            } else {
                g10 = lVar.g((byte) 72, gVar);
            }
            this.f23355e = 1;
            if (a.f.b(g10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
