package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setSedentaryConfig$1", f = "DeviceConfigFeature.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23384e;

    /* renamed from: f */
    public final /* synthetic */ f f23385f;

    /* renamed from: g */
    public final /* synthetic */ nj.l f23386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, nj.l lVar, xl.d<? super k> dVar) {
        super(2, dVar);
        this.f23385f = fVar;
        this.f23386g = lVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((k) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new k(this.f23385f, this.f23386g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23384e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jj.b bVar = this.f23385f.f23334a;
            nj.l lVar = this.f23386g;
            jj.l lVar2 = (jj.l) bVar;
            lVar2.getClass();
            gm.l.f(lVar, "config");
            bl.h g10 = lVar2.g((byte) 39, lVar);
            this.f23384e = 1;
            if (a.f.b(g10, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
