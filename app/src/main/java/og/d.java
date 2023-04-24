package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setBloodPressureConfig$1", f = "DeviceConfigFeature.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23243e;

    /* renamed from: f */
    public final /* synthetic */ f f23244f;

    /* renamed from: g */
    public final /* synthetic */ nj.b f23245g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, nj.b bVar, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f23244f = fVar;
        this.f23245g = bVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new d(this.f23244f, this.f23245g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23243e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.b bVar = this.f23244f.f23334a;
            nj.b bVar2 = this.f23245g;
            jj.l lVar = (jj.l) bVar;
            lVar.getClass();
            gm.l.f(bVar2, "config");
            bl.h g10 = lVar.g((byte) 48, bVar2);
            this.f23243e = 1;
            if (a.f.b(g10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
