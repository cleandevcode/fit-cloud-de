package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setDrinkWaterConfig$1", f = "DeviceConfigFeature.kt", l = {215}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23299e;

    /* renamed from: f */
    public final /* synthetic */ f f23300f;

    /* renamed from: g */
    public final /* synthetic */ nj.d f23301g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, nj.d dVar, xl.d<? super e> dVar2) {
        super(2, dVar2);
        this.f23300f = fVar;
        this.f23301g = dVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new e(this.f23300f, this.f23301g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23299e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.b bVar = this.f23300f.f23334a;
            nj.d dVar = this.f23301g;
            jj.l lVar = (jj.l) bVar;
            lVar.getClass();
            gm.l.f(dVar, "config");
            bl.h g10 = lVar.g((byte) 42, dVar);
            this.f23299e = 1;
            if (a.f.b(g10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
