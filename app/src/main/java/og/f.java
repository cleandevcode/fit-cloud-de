package og;

import jj.l;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public final jj.b f23334a;

    /* renamed from: b */
    public final pm.e0 f23335b;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setFunctionConfig$1", f = "DeviceConfigFeature.kt", l = {221}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f23336e;

        /* renamed from: g */
        public final /* synthetic */ nj.e f23338g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nj.e eVar, xl.d<? super a> dVar) {
            super(2, dVar);
            f.this = r1;
            this.f23338g = eVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f23338g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f23336e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                bl.h k10 = ((jj.l) f.this.f23334a).k(this.f23338g);
                this.f23336e = 1;
                if (a.f.b(k10, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceConfigFeature$setScreenVibrateConfig$1", f = "DeviceConfigFeature.kt", l = {203}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f23339e;

        /* renamed from: g */
        public final /* synthetic */ nj.k f23341g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(nj.k kVar, xl.d<? super b> dVar) {
            super(2, dVar);
            f.this = r1;
            this.f23341g = kVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f23341g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            tk.a g10;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f23339e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                jj.b bVar = f.this.f23334a;
                nj.k kVar = this.f23341g;
                jj.l lVar = (jj.l) bVar;
                lVar.getClass();
                gm.l.f(kVar, "config");
                if (h7.a.m(lVar.f17930d, 17)) {
                    g10 = h7.a.e();
                } else {
                    g10 = lVar.g((byte) 122, kVar);
                }
                this.f23339e = 1;
                if (a.f.b(g10, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    public f(jj.b bVar, pm.e0 e0Var) {
        gm.l.f(bVar, "feature");
        gm.l.f(e0Var, "applicationScope");
        this.f23334a = bVar;
        this.f23335b = e0Var;
    }

    public final sm.b a() {
        return qi.h.d(new bl.k(1, new wk.g() { // from class: og.a
            @Override // wk.g
            public final Object get() {
                f fVar = f.this;
                gm.l.f(fVar, "this$0");
                jj.l lVar = (jj.l) fVar.f23334a;
                ql.b<Byte> bVar = lVar.f17932f;
                l.d dVar = new l.d(new jj.t((byte) 17));
                bVar.getClass();
                return new fl.k(new fl.t(bVar, dVar).u(new l.c(new jj.u(lVar)))).x(fVar.c());
            }
        }));
    }

    public final sm.b b() {
        return qi.h.d(((jj.l) this.f23334a).j());
    }

    public final nj.c c() {
        return ((jj.l) this.f23334a).f17930d;
    }

    public final nj.e d() {
        return new nj.e(((jj.l) this.f23334a).f17931e.get((byte) 26));
    }

    public final nj.k e() {
        return new nj.k(((jj.l) this.f23334a).f17931e.get((byte) 122));
    }

    public final void f(nj.e eVar) {
        mf.a0.j(this.f23335b, new a(eVar, null));
    }

    public final void g(nj.k kVar) {
        mf.a0.j(this.f23335b, new b(kVar, null));
    }
}
