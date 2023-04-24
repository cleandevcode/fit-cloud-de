package og;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$6", f = "DeviceManager.kt", l = {323}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23225e;

    /* renamed from: f */
    public final /* synthetic */ d0 f23226f;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$6$1", f = "DeviceManager.kt", l = {324, 326}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<gg.b, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f23227e;

        /* renamed from: f */
        public /* synthetic */ Object f23228f;

        /* renamed from: g */
        public final /* synthetic */ d0 f23229g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 d0Var, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f23229g = d0Var;
        }

        @Override // fm.p
        public final Object A(gg.b bVar, xl.d<? super tl.l> dVar) {
            return ((a) p(bVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f23229g, dVar);
            aVar.f23228f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            gg.b bVar;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f23227e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        mf.a0.k(obj);
                        return tl.l.f28297a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (gg.b) this.f23228f;
                mf.a0.k(obj);
            } else {
                mf.a0.k(obj);
                bVar = (gg.b) this.f23228f;
                this.f23228f = bVar;
                this.f23227e = 1;
                if (mf.a0.g(1000L, this) == aVar) {
                    return aVar;
                }
            }
            if (this.f23229g.f23262r.getValue() == wf.b.CONNECTED) {
                d0 d0Var = this.f23229g;
                this.f23228f = null;
                this.f23227e = 2;
                if (d0.R(d0Var, bVar, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, xl.d<? super b0> dVar) {
        super(2, dVar);
        this.f23226f = d0Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((b0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new b0(this.f23226f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23225e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.t u10 = bi.r.u(this.f23226f.f23257m.a(), 1);
            a aVar2 = new a(this.f23226f, null);
            this.f23225e = 1;
            if (bi.r.o(u10, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
