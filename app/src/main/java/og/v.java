package og;

import og.d0;

@zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$1", f = "DeviceManager.kt", l = {259}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f23500e;

    /* renamed from: f */
    public final /* synthetic */ d0 f23501f;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$1$1", f = "DeviceManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.q<uf.c, wf.a, xl.d<? super d0.a>, Object> {

        /* renamed from: e */
        public /* synthetic */ uf.c f23502e;

        /* renamed from: f */
        public /* synthetic */ wf.a f23503f;

        public a(xl.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // fm.q
        public final Object j(uf.c cVar, wf.a aVar, xl.d<? super d0.a> dVar) {
            a aVar2 = new a(dVar);
            aVar2.f23502e = cVar;
            aVar2.f23503f = aVar;
            return aVar2.t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            return new d0.a(this.f23502e, this.f23503f);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ d0 f23504a;

        public b(d0 d0Var) {
            this.f23504a = d0Var;
        }

        @Override // sm.g
        public final Object n(Object obj, xl.d dVar) {
            uf.c cVar;
            boolean z10;
            d0.a aVar = (d0.a) obj;
            wf.a aVar2 = aVar.f23271b;
            if (aVar2 != null && (cVar = aVar.f23270a) != null) {
                hj.a aVar3 = this.f23504a.f23258n;
                String str = aVar2.f29802a;
                String valueOf = String.valueOf(cVar.f28710a);
                boolean z11 = aVar.f23271b.f29804c;
                uf.c cVar2 = aVar.f23270a;
                if (cVar2.f28711b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int b10 = hh.b.b(cVar2.f28712c);
                uf.c cVar3 = aVar.f23270a;
                aVar3.q(str, valueOf, z11, z10, b10, cVar3.f28713d, cVar3.f28714e);
            } else {
                this.f23504a.f23258n.close();
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d0 d0Var, xl.d<? super v> dVar) {
        super(2, dVar);
        this.f23501f = d0Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((v) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new v(this.f23501f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object obj2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f23500e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.t0 a10 = this.f23501f.f23251g.a();
            sm.t0 t0Var = this.f23501f.f23261q;
            a aVar = new a(null);
            b bVar = new b(this.f23501f);
            this.f23500e = 1;
            Object c10 = p001if.d.c(this, new sm.o0(aVar, null), bVar, new sm.f[]{a10, t0Var});
            if (c10 != obj2) {
                c10 = tl.l.f28297a;
            }
            if (c10 == obj2) {
                return obj2;
            }
        }
        return tl.l.f28297a;
    }
}
