package og;

import nj.e;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$3", f = "DeviceManager.kt", l = {285}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class x extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23517e;

    /* renamed from: f */
    public final /* synthetic */ d0 f23518f;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ d0 f23519a;

        public a(d0 d0Var) {
            this.f23519a = d0Var;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            int intValue = ((Number) obj).intValue();
            if (this.f23519a.f23262r.getValue() == wf.b.CONNECTED) {
                nj.e d10 = this.f23519a.f23267w.d();
                d0 d0Var = this.f23519a;
                e.a u10 = ih.v.u(d10);
                d0.O(d0Var, u10, intValue);
                nj.e b10 = u10.b();
                d0 d0Var2 = this.f23519a;
                if (!gm.l.a(b10, d10)) {
                    d0Var2.f23267w.f(b10);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d0 d0Var, xl.d<? super x> dVar) {
        super(2, dVar);
        this.f23518f = d0Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((x) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new x(this.f23518f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23517e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.t u10 = bi.r.u(this.f23518f.f23250f.f(), 1);
            a aVar2 = new a(this.f23518f);
            this.f23517e = 1;
            if (u10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
