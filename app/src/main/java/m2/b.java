package m2;

import bi.z0;
import java.util.Set;
import java.util.concurrent.Callable;
import m2.m;
import pm.e0;

@zl.e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends zl.i implements fm.p<sm.g<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f20159e;

    /* renamed from: f */
    public /* synthetic */ Object f20160f;

    /* renamed from: g */
    public final /* synthetic */ boolean f20161g;

    /* renamed from: h */
    public final /* synthetic */ t f20162h;

    /* renamed from: i */
    public final /* synthetic */ String[] f20163i;

    /* renamed from: j */
    public final /* synthetic */ Callable<Object> f20164j;

    @zl.e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {136}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f20165e;

        /* renamed from: f */
        public /* synthetic */ Object f20166f;

        /* renamed from: g */
        public final /* synthetic */ boolean f20167g;

        /* renamed from: h */
        public final /* synthetic */ t f20168h;

        /* renamed from: i */
        public final /* synthetic */ sm.g<Object> f20169i;

        /* renamed from: j */
        public final /* synthetic */ String[] f20170j;

        /* renamed from: k */
        public final /* synthetic */ Callable<Object> f20171k;

        @zl.e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {127, 129}, m = "invokeSuspend")
        /* renamed from: m2.b$a$a */
        /* loaded from: classes.dex */
        public static final class C0366a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public rm.i f20172e;

            /* renamed from: f */
            public int f20173f;

            /* renamed from: g */
            public final /* synthetic */ t f20174g;

            /* renamed from: h */
            public final /* synthetic */ C0367b f20175h;

            /* renamed from: i */
            public final /* synthetic */ rm.g<tl.l> f20176i;

            /* renamed from: j */
            public final /* synthetic */ Callable<Object> f20177j;

            /* renamed from: k */
            public final /* synthetic */ rm.g<Object> f20178k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0366a(t tVar, C0367b c0367b, rm.g<tl.l> gVar, Callable<Object> callable, rm.g<Object> gVar2, xl.d<? super C0366a> dVar) {
                super(2, dVar);
                this.f20174g = tVar;
                this.f20175h = c0367b;
                this.f20176i = gVar;
                this.f20177j = callable;
                this.f20178k = gVar2;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0366a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0366a(this.f20174g, this.f20175h, this.f20176i, this.f20177j, this.f20178k, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:61:0x0040 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x004e A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:63:0x0046, B:65:0x004e), top: B:81:0x0046 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x006a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0064 -> B:79:0x0036). Please submit an issue!!! */
            @Override // zl.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object t(java.lang.Object r8) {
                /*
                    r7 = this;
                    yl.a r0 = yl.a.COROUTINE_SUSPENDED
                    int r1 = r7.f20173f
                    r2 = 1
                    r3 = 2
                    if (r1 == 0) goto L23
                    if (r1 == r2) goto L1a
                    if (r1 != r3) goto L12
                    rm.i r1 = r7.f20172e
                    mf.a0.k(r8)     // Catch: java.lang.Throwable -> L7b
                    goto L35
                L12:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1a:
                    rm.i r1 = r7.f20172e
                    mf.a0.k(r8)     // Catch: java.lang.Throwable -> L7b
                    r4 = r1
                    r1 = r0
                    r0 = r7
                    goto L46
                L23:
                    mf.a0.k(r8)
                    m2.t r8 = r7.f20174g
                    m2.m r8 = r8.f20265e
                    m2.b$a$b r1 = r7.f20175h
                    r8.a(r1)
                    rm.g<tl.l> r8 = r7.f20176i     // Catch: java.lang.Throwable -> L7b
                    rm.i r1 = r8.iterator()     // Catch: java.lang.Throwable -> L7b
                L35:
                    r8 = r7
                L36:
                    r8.f20172e = r1     // Catch: java.lang.Throwable -> L76
                    r8.f20173f = r2     // Catch: java.lang.Throwable -> L76
                    java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L76
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    r6 = r0
                    r0 = r8
                    r8 = r4
                    r4 = r1
                    r1 = r6
                L46:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L68
                    boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L68
                    if (r8 == 0) goto L6a
                    r4.next()     // Catch: java.lang.Throwable -> L68
                    java.util.concurrent.Callable<java.lang.Object> r8 = r0.f20177j     // Catch: java.lang.Throwable -> L68
                    java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L68
                    rm.g<java.lang.Object> r5 = r0.f20178k     // Catch: java.lang.Throwable -> L68
                    r0.f20172e = r4     // Catch: java.lang.Throwable -> L68
                    r0.f20173f = r3     // Catch: java.lang.Throwable -> L68
                    java.lang.Object r8 = r5.d(r8, r0)     // Catch: java.lang.Throwable -> L68
                    if (r8 != r1) goto L64
                    return r1
                L64:
                    r8 = r0
                    r0 = r1
                    r1 = r4
                    goto L36
                L68:
                    r8 = move-exception
                    goto L7d
                L6a:
                    m2.t r8 = r0.f20174g
                    m2.m r8 = r8.f20265e
                    m2.b$a$b r0 = r0.f20175h
                    r8.c(r0)
                    tl.l r8 = tl.l.f28297a
                    return r8
                L76:
                    r0 = move-exception
                    r6 = r0
                    r0 = r8
                    r8 = r6
                    goto L7d
                L7b:
                    r8 = move-exception
                    r0 = r7
                L7d:
                    m2.t r1 = r0.f20174g
                    m2.m r1 = r1.f20265e
                    m2.b$a$b r0 = r0.f20175h
                    r1.c(r0)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: m2.b.a.C0366a.t(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: m2.b$a$b */
        /* loaded from: classes.dex */
        public static final class C0367b extends m.c {

            /* renamed from: b */
            public final /* synthetic */ rm.g<tl.l> f20179b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0367b(String[] strArr, rm.a aVar) {
                super(strArr);
                this.f20179b = aVar;
            }

            @Override // m2.m.c
            public final void a(Set<String> set) {
                gm.l.f(set, "tables");
                this.f20179b.p(tl.l.f28297a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, t tVar, sm.g<Object> gVar, String[] strArr, Callable<Object> callable, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f20167g = z10;
            this.f20168h = tVar;
            this.f20169i = gVar;
            this.f20170j = strArr;
            this.f20171k = callable;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f20167g, this.f20168h, this.f20169i, this.f20170j, this.f20171k, dVar);
            aVar.f20166f = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zl.a
        public final Object t(Object obj) {
            xl.f p10;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f20165e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                e0 e0Var = (e0) this.f20166f;
                rm.a a10 = jh.v.a(-1, null, 6);
                C0367b c0367b = new C0367b(this.f20170j, a10);
                tl.l lVar = tl.l.f28297a;
                a10.p(lVar);
                b0 b0Var = (b0) e0Var.E().b(b0.f20180d);
                if (b0Var == null || (p10 = b0Var.f20182b) == null) {
                    if (this.f20167g) {
                        p10 = p.b.q(this.f20168h);
                    } else {
                        p10 = p.b.p(this.f20168h);
                    }
                }
                rm.a a11 = jh.v.a(0, null, 7);
                z0.g(e0Var, p10, 0, new C0366a(this.f20168h, c0367b, a10, this.f20171k, a11, null), 2);
                sm.g<Object> gVar = this.f20169i;
                this.f20165e = 1;
                Object a12 = sm.j.a(gVar, a11, true, this);
                if (a12 == aVar) {
                    lVar = a12;
                }
                if (lVar == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, t tVar, String[] strArr, Callable<Object> callable, xl.d<? super b> dVar) {
        super(2, dVar);
        this.f20161g = z10;
        this.f20162h = tVar;
        this.f20163i = strArr;
        this.f20164j = callable;
    }

    @Override // fm.p
    public final Object A(sm.g<Object> gVar, xl.d<? super tl.l> dVar) {
        return ((b) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        b bVar = new b(this.f20161g, this.f20162h, this.f20163i, this.f20164j, dVar);
        bVar.f20160f = obj;
        return bVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f20159e;
        if (i10 == 0) {
            mf.a0.k(obj);
            a aVar2 = new a(this.f20161g, this.f20162h, (sm.g) this.f20160f, this.f20163i, this.f20164j, null);
            this.f20159e = 1;
            if (bi.r.s(aVar2, this) == aVar) {
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
