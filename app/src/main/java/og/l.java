package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setTurnWristLightingConfig$1", f = "DeviceConfigFeature.kt", l = {263}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23398e;

    /* renamed from: f */
    public final /* synthetic */ f f23399f;

    /* renamed from: g */
    public final /* synthetic */ nj.m f23400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f fVar, nj.m mVar, xl.d<? super l> dVar) {
        super(2, dVar);
        this.f23399f = fVar;
        this.f23400g = mVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((l) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new l(this.f23399f, this.f23400g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23398e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.b bVar = this.f23399f.f23334a;
            nj.m mVar = this.f23400g;
            jj.l lVar = (jj.l) bVar;
            lVar.getClass();
            gm.l.f(mVar, "config");
            bl.h g10 = lVar.g((byte) 45, mVar);
            this.f23398e = 1;
            if (a.f.b(g10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
