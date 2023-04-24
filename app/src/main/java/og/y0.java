package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceMessageFeature$findDevice$1", f = "DeviceMessageFeature.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23530e;

    /* renamed from: f */
    public final /* synthetic */ c1 f23531f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c1 c1Var, xl.d<? super y0> dVar) {
        super(2, dVar);
        this.f23531f = c1Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((y0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new y0(this.f23531f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23530e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            bl.g gVar = new bl.g(h7.a.s(((jj.o0) this.f23531f.f23241a).f17951a, new bj.b((byte) 2, (byte) 59, null)));
            this.f23530e = 1;
            if (a.f.b(gVar, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
