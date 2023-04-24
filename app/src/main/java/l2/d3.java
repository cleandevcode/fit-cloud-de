package l2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a */
    public final b f18823a;

    /* loaded from: classes.dex */
    public static final class a extends CancellationException {

        /* renamed from: a */
        public final d3 f18824a;

        public a(d3 d3Var) {
            gm.l.f(d3Var, "runner");
            this.f18824a = d3Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final d3 f18825a;

        /* renamed from: b */
        public final boolean f18826b;

        /* renamed from: c */
        public final ym.c f18827c;

        /* renamed from: d */
        public pm.g1 f18828d;

        /* renamed from: e */
        public int f18829e;

        @zl.e(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129}, m = "onFinish")
        /* loaded from: classes.dex */
        public static final class a extends zl.c {

            /* renamed from: d */
            public b f18830d;

            /* renamed from: e */
            public pm.g1 f18831e;

            /* renamed from: f */
            public ym.c f18832f;

            /* renamed from: g */
            public /* synthetic */ Object f18833g;

            /* renamed from: i */
            public int f18835i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xl.d<? super a> dVar) {
                super(dVar);
                b.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f18833g = obj;
                this.f18835i |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        @zl.e(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {129, 100}, m = "tryEnqueue")
        /* renamed from: l2.d3$b$b */
        /* loaded from: classes.dex */
        public static final class C0327b extends zl.c {

            /* renamed from: d */
            public b f18836d;

            /* renamed from: e */
            public pm.g1 f18837e;

            /* renamed from: f */
            public ym.b f18838f;

            /* renamed from: g */
            public int f18839g;

            /* renamed from: h */
            public /* synthetic */ Object f18840h;

            /* renamed from: j */
            public int f18842j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0327b(xl.d<? super C0327b> dVar) {
                super(dVar);
                b.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f18840h = obj;
                this.f18842j |= Integer.MIN_VALUE;
                return b.this.b(0, null, this);
            }
        }

        public b(d3 d3Var, boolean z10) {
            gm.l.f(d3Var, "singleRunner");
            this.f18825a = d3Var;
            this.f18826b = z10;
            this.f18827c = rm.b.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0051 A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:47:0x004d, B:49:0x0051, B:50:0x0053), top: B:56:0x004d }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(pm.g1 r6, xl.d<? super tl.l> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof l2.d3.b.a
                if (r0 == 0) goto L13
                r0 = r7
                l2.d3$b$a r0 = (l2.d3.b.a) r0
                int r1 = r0.f18835i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18835i = r1
                goto L18
            L13:
                l2.d3$b$a r0 = new l2.d3$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f18833g
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f18835i
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                ym.c r6 = r0.f18832f
                pm.g1 r1 = r0.f18831e
                l2.d3$b r0 = r0.f18830d
                mf.a0.k(r7)
                r7 = r6
                r6 = r1
                goto L4d
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                mf.a0.k(r7)
                ym.c r7 = r5.f18827c
                r0.f18830d = r5
                r0.f18831e = r6
                r0.f18832f = r7
                r0.f18835i = r3
                java.lang.Object r0 = r7.b(r0)
                if (r0 != r1) goto L4c
                return r1
            L4c:
                r0 = r5
            L4d:
                pm.g1 r1 = r0.f18828d     // Catch: java.lang.Throwable -> L5b
                if (r6 != r1) goto L53
                r0.f18828d = r4     // Catch: java.lang.Throwable -> L5b
            L53:
                tl.l r6 = tl.l.f28297a     // Catch: java.lang.Throwable -> L5b
                r7.a(r4)
                tl.l r6 = tl.l.f28297a
                return r6
            L5b:
                r6 = move-exception
                r7.a(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.d3.b.a(pm.g1, xl.d):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0088 A[Catch: all -> 0x00a9, TryCatch #0 {all -> 0x00a9, blocks: (B:65:0x002f, B:95:0x009d, B:96:0x00a1, B:74:0x0061, B:76:0x0065, B:78:0x006b, B:81:0x0071, B:90:0x0088, B:87:0x007b), top: B:102:0x0021 }] */
        /* JADX WARN: Type inference failed for: r11v0, types: [pm.g1] */
        /* JADX WARN: Type inference failed for: r11v1, types: [ym.b] */
        /* JADX WARN: Type inference failed for: r11v14 */
        /* JADX WARN: Type inference failed for: r11v15 */
        /* JADX WARN: Type inference failed for: r11v4, types: [ym.b] */
        /* JADX WARN: Type inference failed for: r11v7, types: [ym.b] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(int r10, pm.g1 r11, xl.d<? super java.lang.Boolean> r12) {
            /*
                r9 = this;
                boolean r0 = r12 instanceof l2.d3.b.C0327b
                if (r0 == 0) goto L13
                r0 = r12
                l2.d3$b$b r0 = (l2.d3.b.C0327b) r0
                int r1 = r0.f18842j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18842j = r1
                goto L18
            L13:
                l2.d3$b$b r0 = new l2.d3$b$b
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f18840h
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f18842j
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L48
                if (r2 == r5) goto L3c
                if (r2 != r3) goto L34
                int r10 = r0.f18839g
                ym.b r11 = r0.f18838f
                pm.g1 r1 = r0.f18837e
                l2.d3$b r0 = r0.f18836d
                mf.a0.k(r12)     // Catch: java.lang.Throwable -> La9
                goto L9b
            L34:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L3c:
                int r10 = r0.f18839g
                ym.b r11 = r0.f18838f
                pm.g1 r2 = r0.f18837e
                l2.d3$b r6 = r0.f18836d
                mf.a0.k(r12)
                goto L61
            L48:
                mf.a0.k(r12)
                ym.c r12 = r9.f18827c
                r0.f18836d = r9
                r0.f18837e = r11
                r0.f18838f = r12
                r0.f18839g = r10
                r0.f18842j = r5
                java.lang.Object r2 = r12.b(r0)
                if (r2 != r1) goto L5e
                return r1
            L5e:
                r6 = r9
                r2 = r11
                r11 = r12
            L61:
                pm.g1 r12 = r6.f18828d     // Catch: java.lang.Throwable -> La9
                if (r12 == 0) goto L78
                boolean r7 = r12.a()     // Catch: java.lang.Throwable -> La9
                if (r7 == 0) goto L78
                int r7 = r6.f18829e     // Catch: java.lang.Throwable -> La9
                if (r7 < r10) goto L78
                if (r7 != r10) goto L76
                boolean r7 = r6.f18826b     // Catch: java.lang.Throwable -> La9
                if (r7 == 0) goto L76
                goto L78
            L76:
                r5 = 0
                goto La1
            L78:
                if (r12 != 0) goto L7b
                goto L85
            L7b:
                l2.d3$a r7 = new l2.d3$a     // Catch: java.lang.Throwable -> La9
                l2.d3 r8 = r6.f18825a     // Catch: java.lang.Throwable -> La9
                r7.<init>(r8)     // Catch: java.lang.Throwable -> La9
                r12.h(r7)     // Catch: java.lang.Throwable -> La9
            L85:
                if (r12 != 0) goto L88
                goto L9d
            L88:
                r0.f18836d = r6     // Catch: java.lang.Throwable -> La9
                r0.f18837e = r2     // Catch: java.lang.Throwable -> La9
                r0.f18838f = r11     // Catch: java.lang.Throwable -> La9
                r0.f18839g = r10     // Catch: java.lang.Throwable -> La9
                r0.f18842j = r3     // Catch: java.lang.Throwable -> La9
                java.lang.Object r12 = r12.R(r0)     // Catch: java.lang.Throwable -> La9
                if (r12 != r1) goto L99
                return r1
            L99:
                r1 = r2
                r0 = r6
            L9b:
                r6 = r0
                r2 = r1
            L9d:
                r6.f18828d = r2     // Catch: java.lang.Throwable -> La9
                r6.f18829e = r10     // Catch: java.lang.Throwable -> La9
            La1:
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> La9
                r11.a(r4)
                return r10
            La9:
                r10 = move-exception
                r11.a(r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.d3.b.b(int, pm.g1, xl.d):java.lang.Object");
        }
    }

    @zl.e(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
    /* loaded from: classes.dex */
    public static final class c extends zl.c {

        /* renamed from: d */
        public d3 f18843d;

        /* renamed from: e */
        public /* synthetic */ Object f18844e;

        /* renamed from: g */
        public int f18846g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(dVar);
            d3.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f18844e = obj;
            this.f18846g |= Integer.MIN_VALUE;
            return d3.this.a(0, null, this);
        }
    }

    @zl.e(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, 61, 61}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f18847e;

        /* renamed from: f */
        public /* synthetic */ Object f18848f;

        /* renamed from: h */
        public final /* synthetic */ int f18850h;

        /* renamed from: i */
        public final /* synthetic */ fm.l<xl.d<? super tl.l>, Object> f18851i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i10, fm.l<? super xl.d<? super tl.l>, ? extends Object> lVar, xl.d<? super d> dVar) {
            super(2, dVar);
            d3.this = r1;
            this.f18850h = i10;
            this.f18851i = lVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(this.f18850h, this.f18851i, dVar);
            dVar2.f18848f = obj;
            return dVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0089 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [pm.g1] */
        /* JADX WARN: Type inference failed for: r1v10, types: [pm.g1] */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r3v2, types: [l2.d3$b] */
        /* JADX WARN: Type inference failed for: r9v15, types: [l2.d3$b] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r9) {
            /*
                r8 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r8.f18847e
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L3a
                if (r1 == r5) goto L32
                if (r1 == r4) goto L28
                if (r1 == r3) goto L23
                if (r1 == r2) goto L1a
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r0 = r8.f18848f
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                mf.a0.k(r9)
                goto L9a
            L23:
                mf.a0.k(r9)
                goto L9b
            L28:
                java.lang.Object r1 = r8.f18848f
                pm.g1 r1 = (pm.g1) r1
                mf.a0.k(r9)     // Catch: java.lang.Throwable -> L30
                goto L7a
            L30:
                r9 = move-exception
                goto L8a
            L32:
                java.lang.Object r1 = r8.f18848f
                pm.g1 r1 = (pm.g1) r1
                mf.a0.k(r9)
                goto L65
            L3a:
                mf.a0.k(r9)
                java.lang.Object r9 = r8.f18848f
                pm.e0 r9 = (pm.e0) r9
                xl.f r9 = r9.E()
                int r1 = pm.g1.K
                pm.g1$b r1 = pm.g1.b.f24341a
                xl.f$b r9 = r9.b(r1)
                if (r9 == 0) goto L9e
                pm.g1 r9 = (pm.g1) r9
                l2.d3 r1 = l2.d3.this
                l2.d3$b r1 = r1.f18823a
                int r6 = r8.f18850h
                r8.f18848f = r9
                r8.f18847e = r5
                java.lang.Object r1 = r1.b(r6, r9, r8)
                if (r1 != r0) goto L62
                return r0
            L62:
                r7 = r1
                r1 = r9
                r9 = r7
            L65:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9b
                fm.l<xl.d<? super tl.l>, java.lang.Object> r9 = r8.f18851i     // Catch: java.lang.Throwable -> L30
                r8.f18848f = r1     // Catch: java.lang.Throwable -> L30
                r8.f18847e = r4     // Catch: java.lang.Throwable -> L30
                java.lang.Object r9 = r9.k(r8)     // Catch: java.lang.Throwable -> L30
                if (r9 != r0) goto L7a
                return r0
            L7a:
                l2.d3 r9 = l2.d3.this
                l2.d3$b r9 = r9.f18823a
                r2 = 0
                r8.f18848f = r2
                r8.f18847e = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L9b
                return r0
            L8a:
                l2.d3 r3 = l2.d3.this
                l2.d3$b r3 = r3.f18823a
                r8.f18848f = r9
                r8.f18847e = r2
                java.lang.Object r1 = r3.a(r1, r8)
                if (r1 != r0) goto L99
                return r0
            L99:
                r0 = r9
            L9a:
                throw r0
            L9b:
                tl.l r9 = tl.l.f28297a
                return r9
            L9e:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error. coroutineScope should've created a job."
                java.lang.String r0 = r0.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.d3.d.t(java.lang.Object):java.lang.Object");
        }
    }

    public d3(boolean z10) {
        this.f18823a = new b(this, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r5, fm.l<? super xl.d<? super tl.l>, ? extends java.lang.Object> r6, xl.d<? super tl.l> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof l2.d3.c
            if (r0 == 0) goto L13
            r0 = r7
            l2.d3$c r0 = (l2.d3.c) r0
            int r1 = r0.f18846g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18846g = r1
            goto L18
        L13:
            l2.d3$c r0 = new l2.d3$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18844e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18846g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            l2.d3 r5 = r0.f18843d
            mf.a0.k(r7)     // Catch: l2.d3.a -> L29
            goto L4e
        L29:
            r6 = move-exception
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            mf.a0.k(r7)
            l2.d3$d r7 = new l2.d3$d     // Catch: l2.d3.a -> L47
            r2 = 0
            r7.<init>(r5, r6, r2)     // Catch: l2.d3.a -> L47
            r0.f18843d = r4     // Catch: l2.d3.a -> L47
            r0.f18846g = r3     // Catch: l2.d3.a -> L47
            java.lang.Object r5 = bi.r.s(r7, r0)     // Catch: l2.d3.a -> L47
            if (r5 != r1) goto L4e
            return r1
        L47:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L4a:
            l2.d3 r7 = r6.f18824a
            if (r7 != r5) goto L51
        L4e:
            tl.l r5 = tl.l.f28297a
            return r5
        L51:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.d3.a(int, fm.l, xl.d):java.lang.Object");
    }
}
