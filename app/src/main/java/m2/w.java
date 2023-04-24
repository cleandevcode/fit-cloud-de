package m2;

import pm.e0;
import pm.j1;
import xl.f;

/* loaded from: classes.dex */
public final class w {

    @zl.e(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabaseExt.kt", l = {100}, m = "createTransactionContext")
    /* loaded from: classes.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public t f20298d;

        /* renamed from: e */
        public j1 f20299e;

        /* renamed from: f */
        public /* synthetic */ Object f20300f;

        /* renamed from: g */
        public int f20301g;

        public a(xl.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20300f = obj;
            this.f20301g |= Integer.MIN_VALUE;
            return w.a(null, this);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ pm.s f20302b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j1 j1Var) {
            super(1);
            this.f20302b = j1Var;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            this.f20302b.h(null);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabaseExt.kt", l = {51, 52}, m = "withTransaction")
    /* loaded from: classes.dex */
    public static final class c<R> extends zl.c {

        /* renamed from: d */
        public t f20303d;

        /* renamed from: e */
        public fm.l f20304e;

        /* renamed from: f */
        public /* synthetic */ Object f20305f;

        /* renamed from: g */
        public int f20306g;

        public c(xl.d<? super c> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f20305f = obj;
            this.f20306g |= Integer.MIN_VALUE;
            return w.b(null, null, this);
        }
    }

    @zl.e(c = "androidx.room.RoomDatabaseKt$withTransaction$2", f = "RoomDatabaseExt.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d<R> extends zl.i implements fm.p<e0, xl.d<? super R>, Object> {

        /* renamed from: e */
        public int f20307e;

        /* renamed from: f */
        public /* synthetic */ Object f20308f;

        /* renamed from: g */
        public final /* synthetic */ t f20309g;

        /* renamed from: h */
        public final /* synthetic */ fm.l<xl.d<? super R>, Object> f20310h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(t tVar, fm.l<? super xl.d<? super R>, ? extends Object> lVar, xl.d<? super d> dVar) {
            super(2, dVar);
            this.f20309g = tVar;
            this.f20310h = lVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, Object obj) {
            return ((d) p(e0Var, (xl.d) obj)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(this.f20309g, this.f20310h, dVar);
            dVar2.f20308f = obj;
            return dVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zl.a
        public final Object t(Object obj) {
            Throwable th2;
            b0 b0Var;
            Throwable th3;
            b0 b0Var2;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f20307e;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        b0Var2 = (b0) this.f20308f;
                        try {
                            mf.a0.k(obj);
                        } catch (Throwable th4) {
                            th3 = th4;
                            this.f20309g.l();
                            throw th3;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    f.b b10 = ((e0) this.f20308f).E().b(b0.f20180d);
                    gm.l.c(b10);
                    b0Var = (b0) b10;
                    b0Var.f20183c.incrementAndGet();
                    try {
                        this.f20309g.c();
                        try {
                            fm.l<xl.d<? super R>, Object> lVar = this.f20310h;
                            this.f20308f = b0Var;
                            this.f20307e = 1;
                            Object k10 = lVar.k(this);
                            if (k10 == aVar) {
                                return aVar;
                            }
                            b0Var2 = b0Var;
                            obj = k10;
                        } catch (Throwable th5) {
                            th3 = th5;
                            this.f20309g.l();
                            throw th3;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        int decrementAndGet = b0Var.f20183c.decrementAndGet();
                        if (decrementAndGet >= 0) {
                            if (decrementAndGet == 0) {
                                b0Var.f20181a.h(null);
                            }
                            throw th2;
                        }
                        throw new IllegalStateException("Transaction was never started or was already released.");
                    }
                }
                this.f20309g.p();
                this.f20309g.l();
                int decrementAndGet2 = b0Var2.f20183c.decrementAndGet();
                if (decrementAndGet2 >= 0) {
                    if (decrementAndGet2 == 0) {
                        b0Var2.f20181a.h(null);
                    }
                    return obj;
                }
                throw new IllegalStateException("Transaction was never started or was already released.");
            } catch (Throwable th7) {
                th2 = th7;
                b0Var = aVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(m2.t r6, xl.d<? super xl.f> r7) {
        /*
            boolean r0 = r7 instanceof m2.w.a
            if (r0 == 0) goto L13
            r0 = r7
            m2.w$a r0 = (m2.w.a) r0
            int r1 = r0.f20301g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20301g = r1
            goto L18
        L13:
            m2.w$a r0 = new m2.w$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20300f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20301g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            pm.j1 r6 = r0.f20299e
            m2.t r0 = r0.f20298d
            mf.a0.k(r7)
            goto L8e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            mf.a0.k(r7)
            pm.j1 r7 = bi.m0.b()
            xl.f r2 = r0.f32509b
            gm.l.c(r2)
            pm.g1$b r4 = pm.g1.b.f24341a
            xl.f$b r2 = r2.b(r4)
            pm.g1 r2 = (pm.g1) r2
            if (r2 == 0) goto L51
            m2.w$b r4 = new m2.w$b
            r4.<init>(r7)
            r2.k(r4)
        L51:
            m2.c0 r2 = r6.f20263c
            if (r2 == 0) goto Lae
            r0.f20298d = r6
            r0.f20299e = r7
            r0.f20301g = r3
            pm.j r4 = new pm.j
            xl.d r0 = mf.a0.i(r0)
            r4.<init>(r3, r0)
            r4.u()
            m2.u r0 = new m2.u
            r0.<init>(r7)
            r4.z(r0)
            m2.v r0 = new m2.v     // Catch: java.util.concurrent.RejectedExecutionException -> L78
            r0.<init>(r4, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L78
            r2.execute(r0)     // Catch: java.util.concurrent.RejectedExecutionException -> L78
            goto L83
        L78:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unable to acquire a thread to perform the database transaction."
            r2.<init>(r3, r0)
            r4.G(r2)
        L83:
            java.lang.Object r0 = r4.t()
            if (r0 != r1) goto L8a
            return r1
        L8a:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L8e:
            xl.e r7 = (xl.e) r7
            m2.b0 r1 = new m2.b0
            r1.<init>(r6, r7)
            java.lang.ThreadLocal<java.lang.Integer> r0 = r0.f20270j
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r6)
            um.a0 r6 = new um.a0
            r6.<init>(r2, r0)
            xl.f r7 = r7.s(r1)
            xl.f r6 = r7.s(r6)
            return r6
        Lae:
            java.lang.String r6 = "transactionExecutor"
            gm.l.l(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.w.a(m2.t, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0073 A[PHI: r7 
      PHI: (r7v11 java.lang.Object) = (r7v8 java.lang.Object), (r7v1 java.lang.Object) binds: [B:55:0x0070, B:41:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <R> java.lang.Object b(m2.t r5, fm.l<? super xl.d<? super R>, ? extends java.lang.Object> r6, xl.d<? super R> r7) {
        /*
            boolean r0 = r7 instanceof m2.w.c
            if (r0 == 0) goto L13
            r0 = r7
            m2.w$c r0 = (m2.w.c) r0
            int r1 = r0.f20306g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20306g = r1
            goto L18
        L13:
            m2.w$c r0 = new m2.w$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20305f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f20306g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r7)
            goto L73
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            fm.l r6 = r0.f20304e
            m2.t r5 = r0.f20303d
            mf.a0.k(r7)
            goto L5e
        L3a:
            mf.a0.k(r7)
            xl.f r7 = r0.f32509b
            gm.l.c(r7)
            m2.b0$a r2 = m2.b0.f20180d
            xl.f$b r7 = r7.b(r2)
            m2.b0 r7 = (m2.b0) r7
            if (r7 == 0) goto L51
            xl.e r7 = r7.f20182b
            if (r7 == 0) goto L51
            goto L60
        L51:
            r0.f20303d = r5
            r0.f20304e = r6
            r0.f20306g = r4
            java.lang.Object r7 = a(r5, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            xl.f r7 = (xl.f) r7
        L60:
            m2.w$d r2 = new m2.w$d
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f20303d = r4
            r0.f20304e = r4
            r0.f20306g = r3
            java.lang.Object r7 = bi.z0.s(r0, r7, r2)
            if (r7 != r1) goto L73
            return r1
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.w.b(m2.t, fm.l, xl.d):java.lang.Object");
    }
}
