package l2;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l2.b1;
import l2.n0;

@zl.e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h1 extends zl.i implements fm.p<z2<b1<Object>>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f18922e;

    /* renamed from: f */
    public /* synthetic */ Object f18923f;

    /* renamed from: g */
    public final /* synthetic */ r2<Object, Object> f18924g;

    /* renamed from: h */
    public final /* synthetic */ i1<Object, Object> f18925h;

    /* renamed from: i */
    public final /* synthetic */ w0 f18926i;

    /* loaded from: classes.dex */
    public static final class a implements sm.g<b1<Object>> {

        /* renamed from: a */
        public final /* synthetic */ z2 f18927a;

        public a(z2 z2Var) {
            this.f18927a = z2Var;
        }

        @Override // sm.g
        public final Object n(b1<Object> b1Var, xl.d<? super tl.l> dVar) {
            Object d10 = this.f18927a.d(b1Var, dVar);
            return d10 == yl.a.COROUTINE_SUSPENDED ? d10 : tl.l.f28297a;
        }
    }

    @zl.e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1", f = "PageFetcher.kt", l = {159}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zl.i implements fm.p<z2<b1<Object>>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f18928e;

        /* renamed from: f */
        public /* synthetic */ Object f18929f;

        /* renamed from: g */
        public final /* synthetic */ sm.f f18930g;

        /* renamed from: h */
        public final /* synthetic */ sm.f f18931h;

        /* renamed from: i */
        public final /* synthetic */ w0 f18932i;

        @zl.e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$1", f = "PageFetcher.kt", l = {222}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends zl.i implements fm.r<q0, b1<Object>, t, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f18933e;

            /* renamed from: f */
            public /* synthetic */ Object f18934f;

            /* renamed from: g */
            public /* synthetic */ Object f18935g;

            /* renamed from: h */
            public /* synthetic */ t f18936h;

            /* renamed from: i */
            public final /* synthetic */ z2<b1<Object>> f18937i;

            /* renamed from: j */
            public final /* synthetic */ w0 f18938j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z2 z2Var, xl.d dVar, w0 w0Var) {
                super(4, dVar);
                this.f18938j = w0Var;
                this.f18937i = z2Var;
            }

            @Override // fm.r
            public final Object s(q0 q0Var, b1<Object> b1Var, t tVar, xl.d<? super tl.l> dVar) {
                a aVar = new a(this.f18937i, dVar, this.f18938j);
                aVar.f18934f = q0Var;
                aVar.f18935g = b1Var;
                aVar.f18936h = tVar;
                return aVar.t(tl.l.f28297a);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f18933e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    Object obj2 = this.f18934f;
                    Object obj3 = this.f18935g;
                    t tVar = this.f18936h;
                    z2<b1<Object>> z2Var = this.f18937i;
                    Object obj4 = (b1) obj3;
                    q0 q0Var = (q0) obj2;
                    if (tVar != t.RECEIVER) {
                        if (obj4 instanceof b1.b) {
                            b1.b bVar = (b1.b) obj4;
                            this.f18938j.b(bVar.f18737e);
                            q0 q0Var2 = bVar.f18737e;
                            r0 r0Var = bVar.f18733a;
                            List<g3<T>> list = bVar.f18734b;
                            int i11 = bVar.f18735c;
                            int i12 = bVar.f18736d;
                            gm.l.f(r0Var, "loadType");
                            gm.l.f(list, "pages");
                            gm.l.f(q0Var2, "sourceLoadStates");
                            obj4 = new b1.b(r0Var, list, i11, i12, q0Var2, q0Var);
                        } else if (obj4 instanceof b1.a) {
                            this.f18938j.c(((b1.a) obj4).f18728a, n0.c.f19109c);
                        } else if (obj4 instanceof b1.c) {
                            b1.c cVar = (b1.c) obj4;
                            this.f18938j.b(cVar.f18753a);
                            obj4 = new b1.c(cVar.f18753a, q0Var);
                        } else {
                            throw new qa.p();
                        }
                    } else {
                        obj4 = new b1.c(this.f18938j.d(), q0Var);
                    }
                    this.f18933e = 1;
                    if (z2Var.d(obj4, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", l = {222}, m = "invokeSuspend")
        /* renamed from: l2.h1$b$b */
        /* loaded from: classes.dex */
        public static final class C0330b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f18939e;

            /* renamed from: f */
            public final /* synthetic */ z2<b1<Object>> f18940f;

            /* renamed from: g */
            public final /* synthetic */ sm.f f18941g;

            /* renamed from: h */
            public final /* synthetic */ AtomicInteger f18942h;

            /* renamed from: i */
            public final /* synthetic */ i3 f18943i;

            /* renamed from: j */
            public final /* synthetic */ int f18944j;

            /* renamed from: l2.h1$b$b$a */
            /* loaded from: classes.dex */
            public static final class a implements sm.g<Object> {

                /* renamed from: a */
                public final /* synthetic */ i3 f18945a;

                /* renamed from: b */
                public final /* synthetic */ int f18946b;

                @zl.e(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$combineWithoutBatching$1$2$1", f = "PageFetcher.kt", l = {135, 138}, m = "emit")
                /* renamed from: l2.h1$b$b$a$a */
                /* loaded from: classes.dex */
                public static final class C0331a extends zl.c {

                    /* renamed from: d */
                    public /* synthetic */ Object f18947d;

                    /* renamed from: e */
                    public int f18948e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0331a(xl.d dVar) {
                        super(dVar);
                        a.this = r1;
                    }

                    @Override // zl.a
                    public final Object t(Object obj) {
                        this.f18947d = obj;
                        this.f18948e |= Integer.MIN_VALUE;
                        return a.this.n(null, this);
                    }
                }

                public a(i3 i3Var, int i10) {
                    this.f18945a = i3Var;
                    this.f18946b = i10;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x0022  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x004e A[RETURN] */
                @Override // sm.g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object n(java.lang.Object r6, xl.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof l2.h1.b.C0330b.a.C0331a
                        if (r0 == 0) goto L13
                        r0 = r7
                        l2.h1$b$b$a$a r0 = (l2.h1.b.C0330b.a.C0331a) r0
                        int r1 = r0.f18948e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f18948e = r1
                        goto L18
                    L13:
                        l2.h1$b$b$a$a r0 = new l2.h1$b$b$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f18947d
                        yl.a r1 = yl.a.COROUTINE_SUSPENDED
                        int r2 = r0.f18948e
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L36
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        mf.a0.k(r7)
                        goto L4f
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        mf.a0.k(r7)
                        goto L46
                    L36:
                        mf.a0.k(r7)
                        l2.i3 r7 = r5.f18945a
                        int r2 = r5.f18946b
                        r0.f18948e = r4
                        java.lang.Object r6 = r7.a(r2, r6, r0)
                        if (r6 != r1) goto L46
                        return r1
                    L46:
                        r0.f18948e = r3
                        java.lang.Object r6 = ih.v.B(r0)
                        if (r6 != r1) goto L4f
                        return r1
                    L4f:
                        tl.l r6 = tl.l.f28297a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: l2.h1.b.C0330b.a.n(java.lang.Object, xl.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0330b(sm.f fVar, AtomicInteger atomicInteger, z2 z2Var, i3 i3Var, int i10, xl.d dVar) {
                super(2, dVar);
                this.f18941g = fVar;
                this.f18942h = atomicInteger;
                this.f18943i = i3Var;
                this.f18944j = i10;
                this.f18940f = z2Var;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0330b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0330b(this.f18941g, this.f18942h, this.f18940f, this.f18943i, this.f18944j, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                AtomicInteger atomicInteger;
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f18939e;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            mf.a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        mf.a0.k(obj);
                        sm.f fVar = this.f18941g;
                        a aVar2 = new a(this.f18943i, this.f18944j);
                        this.f18939e = 1;
                        if (fVar.a(aVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f18940f.o(null);
                    }
                    return tl.l.f28297a;
                } finally {
                    if (this.f18942h.decrementAndGet() == 0) {
                        this.f18940f.o(null);
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends gm.m implements fm.a<tl.l> {

            /* renamed from: b */
            public final /* synthetic */ pm.s f18950b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(pm.j1 j1Var) {
                super(0);
                this.f18950b = j1Var;
            }

            @Override // fm.a
            public final tl.l m() {
                this.f18950b.h(null);
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(sm.f fVar, sm.f fVar2, xl.d dVar, w0 w0Var) {
            super(2, dVar);
            this.f18930g = fVar;
            this.f18931h = fVar2;
            this.f18932i = w0Var;
        }

        @Override // fm.p
        public final Object A(z2<b1<Object>> z2Var, xl.d<? super tl.l> dVar) {
            return ((b) p(z2Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(this.f18930g, this.f18931h, dVar, this.f18932i);
            bVar.f18929f = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f18928e;
            if (i10 == 0) {
                mf.a0.k(obj);
                z2 z2Var = (z2) this.f18929f;
                AtomicInteger atomicInteger = new AtomicInteger(2);
                i3 i3Var = new i3(new a(z2Var, null, this.f18932i));
                pm.j1 b10 = bi.m0.b();
                sm.f[] fVarArr = {this.f18930g, this.f18931h};
                int i11 = 0;
                int i12 = 0;
                while (i11 < 2) {
                    bi.z0.g(z2Var, b10, 0, new C0330b(fVarArr[i11], atomicInteger, z2Var, i3Var, i12, null), 2);
                    i11++;
                    atomicInteger = atomicInteger;
                    i12++;
                }
                c cVar = new c(b10);
                this.f18928e = 1;
                if (z2Var.D(cVar, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(r2<Object, Object> r2Var, i1<Object, Object> i1Var, w0 w0Var, xl.d<? super h1> dVar) {
        super(2, dVar);
        this.f18924g = r2Var;
        this.f18925h = i1Var;
        this.f18926i = w0Var;
    }

    @Override // fm.p
    public final Object A(z2<b1<Object>> z2Var, xl.d<? super tl.l> dVar) {
        return ((h1) p(z2Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        h1 h1Var = new h1(this.f18924g, this.f18925h, this.f18926i, dVar);
        h1Var.f18923f = obj;
        return h1Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f18922e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.f a10 = y2.a(new b(this.f18924g.getState(), this.f18925h.f18987n, null, this.f18926i));
            a aVar2 = new a((z2) this.f18923f);
            this.f18922e = 1;
            if (a10.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
