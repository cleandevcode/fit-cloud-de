package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceMessageFeature$replayFindPhone$1", f = "DeviceMessageFeature.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23535e;

    /* renamed from: f */
    public final /* synthetic */ c1 f23536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c1 c1Var, xl.d<? super z0> dVar) {
        super(2, dVar);
        this.f23536f = c1Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((z0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new z0(this.f23536f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23535e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            bl.g gVar = new bl.g(h7.a.s(((jj.o0) this.f23536f.f23241a).f17951a, new bj.b((byte) 2, (byte) 61, null)));
            this.f23535e = 1;
            if (a.f.b(gVar, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
