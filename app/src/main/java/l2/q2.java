package l2;

import java.util.Iterator;
import l2.a;
import l2.n0;
import l2.n2;

@zl.e(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", l = {266}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q2 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public gm.x f19214e;

    /* renamed from: f */
    public int f19215f;

    /* renamed from: g */
    public final /* synthetic */ o2<Object, Object> f19216g;

    @zl.e(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", l = {273}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public o2 f19217e;

        /* renamed from: f */
        public gm.x f19218f;

        /* renamed from: g */
        public int f19219g;

        /* renamed from: h */
        public final /* synthetic */ o2<Object, Object> f19220h;

        /* renamed from: i */
        public final /* synthetic */ gm.x f19221i;

        /* renamed from: l2.q2$a$a */
        /* loaded from: classes.dex */
        public static final class C0344a extends gm.m implements fm.l<l2.a<Object, Object>, Boolean> {

            /* renamed from: b */
            public final /* synthetic */ n2.b f19222b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0344a(n2.b bVar) {
                super(1);
                this.f19222b = bVar;
            }

            @Override // fm.l
            public final Boolean k(l2.a<Object, Object> aVar) {
                l2.a<Object, Object> aVar2 = aVar;
                r0 r0Var = r0.APPEND;
                r0 r0Var2 = r0.PREPEND;
                gm.l.f(aVar2, "it");
                r0 r0Var3 = r0.REFRESH;
                aVar2.a(r0Var3);
                boolean z10 = true;
                if (((n2.b.C0339b) this.f19222b).f19130a) {
                    aVar2.d(r0Var3, 2);
                    aVar2.d(r0Var2, 2);
                    aVar2.d(r0Var, 2);
                    aVar2.f18691c.clear();
                } else {
                    aVar2.d(r0Var2, 1);
                    aVar2.d(r0Var, 1);
                }
                aVar2.e(r0Var2, null);
                aVar2.e(r0Var, null);
                if (aVar2.c() == null) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends gm.m implements fm.l<l2.a<Object, Object>, Boolean> {

            /* renamed from: b */
            public final /* synthetic */ n2.b f19223b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n2.b bVar) {
                super(1);
                this.f19223b = bVar;
            }

            @Override // fm.l
            public final Boolean k(l2.a<Object, Object> aVar) {
                boolean z10;
                l2.a<Object, Object> aVar2 = aVar;
                gm.l.f(aVar2, "it");
                r0 r0Var = r0.REFRESH;
                aVar2.a(r0Var);
                aVar2.e(r0Var, new n0.a(((n2.b.a) this.f19223b).f19129a));
                if (aVar2.c() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends gm.m implements fm.l<l2.a<Object, Object>, m2<Object, Object>> {

            /* renamed from: b */
            public static final c f19224b = new c();

            public c() {
                super(1);
            }

            @Override // fm.l
            public final m2<Object, Object> k(l2.a<Object, Object> aVar) {
                a.C0324a<Object, Object> c0324a;
                boolean z10;
                l2.a<Object, Object> aVar2 = aVar;
                gm.l.f(aVar2, "it");
                Iterator<a.C0324a<Object, Object>> it = aVar2.f18691c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c0324a = it.next();
                        if (c0324a.f18692a == r0.REFRESH) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    } else {
                        c0324a = null;
                        break;
                    }
                }
                a.C0324a<Object, Object> c0324a2 = c0324a;
                if (c0324a2 == null) {
                    return null;
                }
                return c0324a2.f18693b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2<Object, Object> o2Var, gm.x xVar, xl.d<? super a> dVar) {
            super(1, dVar);
            this.f19220h = o2Var;
            this.f19221i = xVar;
        }

        @Override // fm.l
        public final Object k(xl.d<? super tl.l> dVar) {
            return new a(this.f19220h, this.f19221i, dVar).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            o2<Object, Object> o2Var;
            gm.x xVar;
            j4.j jVar;
            fm.l bVar;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19219g;
            if (i10 != 0) {
                if (i10 == 1) {
                    xVar = this.f19218f;
                    o2Var = this.f19217e;
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                m2<Object, Object> m2Var = (m2) this.f19220h.f19170c.a(c.f19224b);
                if (m2Var != null) {
                    o2Var = this.f19220h;
                    gm.x xVar2 = this.f19221i;
                    n2<Object, Object> n2Var = o2Var.f19169b;
                    r0 r0Var = r0.REFRESH;
                    this.f19217e = o2Var;
                    this.f19218f = xVar2;
                    this.f19219g = 1;
                    obj = n2Var.b(r0Var, m2Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    xVar = xVar2;
                }
                return tl.l.f28297a;
            }
            n2.b bVar2 = (n2.b) obj;
            if (bVar2 instanceof n2.b.C0339b) {
                jVar = o2Var.f19170c;
                bVar = new C0344a(bVar2);
            } else if (bVar2 instanceof n2.b.a) {
                jVar = o2Var.f19170c;
                bVar = new b(bVar2);
            } else {
                throw new qa.p();
            }
            xVar.f15506a = ((Boolean) jVar.a(bVar)).booleanValue();
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(o2<Object, Object> o2Var, xl.d<? super q2> dVar) {
        super(2, dVar);
        this.f19216g = o2Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((q2) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new q2(this.f19216g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        gm.x xVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19215f;
        if (i10 != 0) {
            if (i10 == 1) {
                xVar = this.f19214e;
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            gm.x xVar2 = new gm.x();
            o2<Object, Object> o2Var = this.f19216g;
            d3 d3Var = o2Var.f19171d;
            a aVar2 = new a(o2Var, xVar2, null);
            this.f19214e = xVar2;
            this.f19215f = 1;
            if (d3Var.a(2, aVar2, this) == aVar) {
                return aVar;
            }
            xVar = xVar2;
        }
        if (xVar.f15506a) {
            o2<Object, Object> o2Var2 = this.f19216g;
            bi.z0.g(o2Var2.f19168a, null, 0, new p2(o2Var2, null), 3);
        }
        return tl.l.f28297a;
    }
}
