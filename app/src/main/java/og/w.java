package og;

import p000do.a;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$2", f = "DeviceManager.kt", l = {276}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23509e;

    /* renamed from: f */
    public final /* synthetic */ d0 f23510f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ d0 f23511a;

        public a(d0 d0Var) {
            this.f23511a = d0Var;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            wf.b bVar = (wf.b) obj;
            a.b bVar2 = p000do.a.f13275a;
            bVar2.t("DeviceManager");
            bVar2.d("state:%s", bVar);
            if (bVar == wf.b.CONNECTED) {
                d0 d0Var = this.f23511a;
                Long value = d0Var.f23248d.h().getValue();
                if (value != null) {
                    mf.a0.j(d0Var.f23247c, new o0(d0Var, value, null));
                } else {
                    bVar2.t("DeviceManager");
                    bVar2.p("onConnected error because no authed user", new Object[0]);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(d0 d0Var, xl.d<? super w> dVar) {
        super(2, dVar);
        this.f23510f = d0Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        ((w) p(e0Var, dVar)).t(tl.l.f28297a);
        return yl.a.COROUTINE_SUSPENDED;
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new w(this.f23510f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23509e;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mf.a0.k(obj);
        } else {
            mf.a0.k(obj);
            d0 d0Var = this.f23510f;
            sm.t0 t0Var = d0Var.f23262r;
            a aVar2 = new a(d0Var);
            this.f23509e = 1;
            if (t0Var.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        throw new u2.b();
    }
}
