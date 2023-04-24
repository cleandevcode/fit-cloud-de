package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setBloodPressureAlarmConfig$1", f = "DeviceConfigFeature.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23232e;

    /* renamed from: f */
    public final /* synthetic */ f f23233f;

    /* renamed from: g */
    public final /* synthetic */ nj.a f23234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, nj.a aVar, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f23233f = fVar;
        this.f23234g = aVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new c(this.f23233f, this.f23234g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        tk.a g10;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23232e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.b bVar = this.f23233f.f23334a;
            nj.a aVar2 = this.f23234g;
            jj.l lVar = (jj.l) bVar;
            lVar.getClass();
            gm.l.f(aVar2, "config");
            if (h7.a.m(lVar.f17930d, 261)) {
                g10 = h7.a.e();
            } else {
                g10 = lVar.g((byte) 75, aVar2);
            }
            this.f23232e = 1;
            if (a.f.b(g10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
