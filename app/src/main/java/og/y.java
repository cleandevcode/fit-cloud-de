package og;

import nj.e;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$4", f = "DeviceManager.kt", l = {298}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23527e;

    /* renamed from: f */
    public final /* synthetic */ d0 f23528f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ d0 f23529a;

        public a(d0 d0Var) {
            this.f23529a = d0Var;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            uf.b bVar = (uf.b) obj;
            if (this.f23529a.f23262r.getValue() == wf.b.CONNECTED) {
                nj.e d10 = this.f23529a.f23267w.d();
                d0 d0Var = this.f23529a;
                e.a u10 = ih.v.u(d10);
                d0Var.getClass();
                u10.a(3, !bVar.a());
                u10.a(4, !bVar.b());
                nj.e b10 = u10.b();
                d0 d0Var2 = this.f23529a;
                if (!gm.l.a(b10, d10)) {
                    d0Var2.f23267w.f(b10);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d0 d0Var, xl.d<? super y> dVar) {
        super(2, dVar);
        this.f23528f = d0Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((y) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new y(this.f23528f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23527e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.t u10 = bi.r.u(this.f23528f.f23252h.a(), 1);
            a aVar2 = new a(this.f23528f);
            this.f23527e = 1;
            if (u10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
