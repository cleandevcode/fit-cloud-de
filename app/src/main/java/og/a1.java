package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceMessageFeature$setCameraStatus$1", f = "DeviceMessageFeature.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a1 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23221e;

    /* renamed from: f */
    public final /* synthetic */ c1 f23222f;

    /* renamed from: g */
    public final /* synthetic */ boolean f23223g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, boolean z10, xl.d<? super a1> dVar) {
        super(2, dVar);
        this.f23222f = c1Var;
        this.f23223g = z10;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((a1) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new a1(this.f23222f, this.f23223g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23221e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            bl.g gVar = new bl.g(h7.a.s(((jj.o0) this.f23222f.f23241a).f17951a, new bj.b((byte) 7, (byte) 2, this.f23223g ? new byte[]{0} : new byte[]{1})));
            this.f23221e = 1;
            if (a.f.b(gVar, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
