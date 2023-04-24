package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$5", f = "DeviceManager.kt", l = {310}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23218e;

    /* renamed from: f */
    public final /* synthetic */ d0 f23219f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ d0 f23220a;

        public a(d0 d0Var) {
            this.f23220a = d0Var;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            uf.a aVar = (uf.a) obj;
            if (this.f23220a.f23262r.getValue() == wf.b.CONNECTED) {
                d0 d0Var = this.f23220a;
                mf.a0.j(d0Var.f23247c, new z(d0Var, aVar, null));
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, xl.d<? super a0> dVar) {
        super(2, dVar);
        this.f23219f = d0Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((a0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new a0(this.f23219f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23218e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.t u10 = bi.r.u(this.f23219f.f23253i.a(), 1);
            a aVar2 = new a(this.f23219f);
            this.f23218e = 1;
            if (u10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
