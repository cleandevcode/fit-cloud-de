package l2;

import l2.n0;
import l2.n2;

@zl.e(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", l = {338}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p2 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19188e;

    /* renamed from: f */
    public final /* synthetic */ o2<Object, Object> f19189f;

    @zl.e(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", l = {345}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public r0 f19190e;

        /* renamed from: f */
        public int f19191f;

        /* renamed from: g */
        public final /* synthetic */ o2<Object, Object> f19192g;

        /* renamed from: l2.p2$a$a */
        /* loaded from: classes.dex */
        public static final class C0342a extends gm.m implements fm.l<l2.a<Object, Object>, tl.f<? extends r0, ? extends m2<Object, Object>>> {

            /* renamed from: b */
            public static final C0342a f19193b = new C0342a();

            public C0342a() {
                super(1);
            }

            @Override // fm.l
            public final tl.f<? extends r0, ? extends m2<Object, Object>> k(l2.a<Object, Object> aVar) {
                l2.a<Object, Object> aVar2 = aVar;
                gm.l.f(aVar2, "it");
                return aVar2.c();
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends gm.m implements fm.l<l2.a<Object, Object>, tl.l> {

            /* renamed from: b */
            public final /* synthetic */ r0 f19194b;

            /* renamed from: c */
            public final /* synthetic */ n2.b f19195c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r0 r0Var, n2.b bVar) {
                super(1);
                this.f19194b = r0Var;
                this.f19195c = bVar;
            }

            @Override // fm.l
            public final tl.l k(l2.a<Object, Object> aVar) {
                l2.a<Object, Object> aVar2 = aVar;
                gm.l.f(aVar2, "it");
                aVar2.a(this.f19194b);
                if (((n2.b.C0339b) this.f19195c).f19130a) {
                    aVar2.d(this.f19194b, 2);
                }
                return tl.l.f28297a;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends gm.m implements fm.l<l2.a<Object, Object>, tl.l> {

            /* renamed from: b */
            public final /* synthetic */ r0 f19196b;

            /* renamed from: c */
            public final /* synthetic */ n2.b f19197c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(r0 r0Var, n2.b bVar) {
                super(1);
                this.f19196b = r0Var;
                this.f19197c = bVar;
            }

            @Override // fm.l
            public final tl.l k(l2.a<Object, Object> aVar) {
                l2.a<Object, Object> aVar2 = aVar;
                gm.l.f(aVar2, "it");
                aVar2.a(this.f19196b);
                aVar2.e(this.f19196b, new n0.a(((n2.b.a) this.f19197c).f19129a));
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2<Object, Object> o2Var, xl.d<? super a> dVar) {
            super(1, dVar);
            this.f19192g = o2Var;
        }

        @Override // fm.l
        public final Object k(xl.d<? super tl.l> dVar) {
            return new a(this.f19192g, dVar).t(tl.l.f28297a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0046 -> B:42:0x004a). Please submit an issue!!! */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r8) {
            /*
                r7 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r7.f19191f
                r2 = 1
                if (r1 == 0) goto L1a
                if (r1 != r2) goto L12
                l2.r0 r1 = r7.f19190e
                mf.a0.k(r8)
                r3 = r1
                r1 = r0
                r0 = r7
                goto L4a
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                mf.a0.k(r8)
                r8 = r7
            L1e:
                l2.o2<java.lang.Object, java.lang.Object> r1 = r8.f19192g
                j4.j r1 = r1.f19170c
                l2.p2$a$a r3 = l2.p2.a.C0342a.f19193b
                java.lang.Object r1 = r1.a(r3)
                tl.f r1 = (tl.f) r1
                if (r1 != 0) goto L2f
                tl.l r8 = tl.l.f28297a
                return r8
            L2f:
                A r3 = r1.f28286a
                l2.r0 r3 = (l2.r0) r3
                B r1 = r1.f28287b
                l2.m2 r1 = (l2.m2) r1
                l2.o2<java.lang.Object, java.lang.Object> r4 = r8.f19192g
                l2.n2<Key, Value> r4 = r4.f19169b
                r8.f19190e = r3
                r8.f19191f = r2
                java.lang.Object r1 = r4.b(r3, r1, r8)
                if (r1 != r0) goto L46
                return r0
            L46:
                r6 = r0
                r0 = r8
                r8 = r1
                r1 = r6
            L4a:
                l2.n2$b r8 = (l2.n2.b) r8
                boolean r4 = r8 instanceof l2.n2.b.C0339b
                if (r4 == 0) goto L5a
                l2.o2<java.lang.Object, java.lang.Object> r4 = r0.f19192g
                j4.j r4 = r4.f19170c
                l2.p2$a$b r5 = new l2.p2$a$b
                r5.<init>(r3, r8)
                goto L67
            L5a:
                boolean r4 = r8 instanceof l2.n2.b.a
                if (r4 == 0) goto L6a
                l2.o2<java.lang.Object, java.lang.Object> r4 = r0.f19192g
                j4.j r4 = r4.f19170c
                l2.p2$a$c r5 = new l2.p2$a$c
                r5.<init>(r3, r8)
            L67:
                r4.a(r5)
            L6a:
                r8 = r0
                r0 = r1
                goto L1e
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.p2.a.t(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(o2<Object, Object> o2Var, xl.d<? super p2> dVar) {
        super(2, dVar);
        this.f19189f = o2Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((p2) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new p2(this.f19189f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19188e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            o2<Object, Object> o2Var = this.f19189f;
            d3 d3Var = o2Var.f19171d;
            a aVar2 = new a(o2Var, null);
            this.f19188e = 1;
            if (d3Var.a(1, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
