package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setHealthMonitorConfig$1", f = "DeviceConfigFeature.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23348e;

    /* renamed from: f */
    public final /* synthetic */ f f23349f;

    /* renamed from: g */
    public final /* synthetic */ nj.f f23350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, nj.f fVar2, xl.d<? super g> dVar) {
        super(2, dVar);
        this.f23349f = fVar;
        this.f23350g = fVar2;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((g) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new g(this.f23349f, this.f23350g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23348e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.b bVar = this.f23349f.f23334a;
            nj.f fVar = this.f23350g;
            jj.l lVar = (jj.l) bVar;
            lVar.getClass();
            gm.l.f(fVar, "config");
            bl.h g10 = lVar.g((byte) 36, fVar);
            this.f23348e = 1;
            if (a.f.b(g10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
