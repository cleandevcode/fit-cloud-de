package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setPageConfig$1", f = "DeviceConfigFeature.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23358e;

    /* renamed from: f */
    public final /* synthetic */ f f23359f;

    /* renamed from: g */
    public final /* synthetic */ nj.i f23360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, nj.i iVar, xl.d<? super i> dVar) {
        super(2, dVar);
        this.f23359f = fVar;
        this.f23360g = iVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((i) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new i(this.f23359f, this.f23360g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23358e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.b bVar = this.f23359f.f23334a;
            nj.i iVar = this.f23360g;
            jj.l lVar = (jj.l) bVar;
            lVar.getClass();
            gm.l.f(iVar, "config");
            bl.h g10 = lVar.g((byte) 23, iVar);
            this.f23358e = 1;
            if (a.f.b(g10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
