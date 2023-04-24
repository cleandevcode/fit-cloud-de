package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$5$1$1", f = "DeviceManager.kt", l = {317}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23532e;

    /* renamed from: f */
    public final /* synthetic */ d0 f23533f;

    /* renamed from: g */
    public final /* synthetic */ uf.a f23534g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, uf.a aVar, xl.d<? super z> dVar) {
        super(2, dVar);
        this.f23533f = d0Var;
        this.f23534g = aVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((z) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new z(this.f23533f, this.f23534g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23532e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.g s10 = this.f23533f.s();
            uf.a aVar2 = this.f23534g;
            fl.d0 e10 = ((jj.k1) s10).e(aVar2.f28704a, (int) (aVar2.f28705b * 100000), aVar2.f28706c * 1000);
            this.f23532e = 1;
            if (a.f.b(e10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
