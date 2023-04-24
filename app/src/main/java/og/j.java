package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setProtectionReminderConfig$1", f = "DeviceConfigFeature.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23380e;

    /* renamed from: f */
    public final /* synthetic */ f f23381f;

    /* renamed from: g */
    public final /* synthetic */ nj.j f23382g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar, nj.j jVar, xl.d<? super j> dVar) {
        super(2, dVar);
        this.f23381f = fVar;
        this.f23382g = jVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((j) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new j(this.f23381f, this.f23382g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        tk.a g10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23380e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.b bVar = this.f23381f.f23334a;
            nj.j jVar = this.f23382g;
            jj.l lVar = (jj.l) bVar;
            lVar.getClass();
            gm.l.f(jVar, "config");
            if (h7.a.m(lVar.f17930d, 273)) {
                g10 = h7.a.e();
            } else {
                g10 = lVar.g((byte) 92, jVar);
            }
            this.f23380e = 1;
            if (a.f.b(g10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
