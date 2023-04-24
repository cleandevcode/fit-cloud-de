package l2;

@zl.e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1", f = "PageFetcherSnapshot.kt", l = {222}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q1 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19203e;

    /* renamed from: f */
    public final /* synthetic */ i1<Object, Object> f19204f;

    /* renamed from: g */
    public final /* synthetic */ r0 f19205g;

    @zl.e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$2", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<j3, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ i1<Object, Object> f19206e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i1<Object, Object> i1Var, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f19206e = i1Var;
        }

        @Override // fm.p
        public final Object A(j3 j3Var, xl.d<? super tl.l> dVar) {
            return ((a) p(j3Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f19206e, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            this.f19206e.f18981h.m();
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements sm.f<j3> {

        /* renamed from: a */
        public final /* synthetic */ sm.f f19207a;

        /* renamed from: b */
        public final /* synthetic */ i1 f19208b;

        /* loaded from: classes.dex */
        public static final class a implements sm.g<j3> {

            /* renamed from: a */
            public final /* synthetic */ sm.g f19209a;

            /* renamed from: b */
            public final /* synthetic */ i1 f19210b;

            @zl.e(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$1$invokeSuspend$$inlined$filter$1$2", f = "PageFetcherSnapshot.kt", l = {137}, m = "emit")
            /* renamed from: l2.q1$b$a$a */
            /* loaded from: classes.dex */
            public static final class C0343a extends zl.c {

                /* renamed from: d */
                public /* synthetic */ Object f19211d;

                /* renamed from: e */
                public int f19212e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0343a(xl.d dVar) {
                    super(dVar);
                    a.this = r1;
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    this.f19211d = obj;
                    this.f19212e |= Integer.MIN_VALUE;
                    return a.this.n(null, this);
                }
            }

            public a(sm.g gVar, i1 i1Var) {
                this.f19209a = gVar;
                this.f19210b = i1Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x002f  */
            @Override // sm.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object n(l2.j3 r7, xl.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof l2.q1.b.a.C0343a
                    if (r0 == 0) goto L13
                    r0 = r8
                    l2.q1$b$a$a r0 = (l2.q1.b.a.C0343a) r0
                    int r1 = r0.f19212e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f19212e = r1
                    goto L18
                L13:
                    l2.q1$b$a$a r0 = new l2.q1$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f19211d
                    yl.a r1 = yl.a.COROUTINE_SUSPENDED
                    int r2 = r0.f19212e
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    mf.a0.k(r8)
                    goto L58
                L27:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L2f:
                    mf.a0.k(r8)
                    sm.g r8 = r6.f19209a
                    r2 = r7
                    l2.j3 r2 = (l2.j3) r2
                    int r4 = r2.f19031a
                    int r4 = r4 * (-1)
                    l2.i1 r5 = r6.f19210b
                    l2.a2 r5 = r5.f18976c
                    int r5 = r5.f18713e
                    if (r4 > r5) goto L4c
                    int r2 = r2.f19032b
                    int r2 = r2 * (-1)
                    if (r2 <= r5) goto L4a
                    goto L4c
                L4a:
                    r2 = 0
                    goto L4d
                L4c:
                    r2 = 1
                L4d:
                    if (r2 == 0) goto L58
                    r0.f19212e = r3
                    java.lang.Object r7 = r8.n(r7, r0)
                    if (r7 != r1) goto L58
                    return r1
                L58:
                    tl.l r7 = tl.l.f28297a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: l2.q1.b.a.n(java.lang.Object, xl.d):java.lang.Object");
            }
        }

        public b(sm.w0 w0Var, i1 i1Var) {
            this.f19207a = w0Var;
            this.f19208b = i1Var;
        }

        @Override // sm.f
        public final Object a(sm.g<? super j3> gVar, xl.d dVar) {
            Object a10 = this.f19207a.a(new a(gVar, this.f19208b), dVar);
            return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r0 r0Var, i1 i1Var, xl.d dVar) {
        super(2, dVar);
        this.f19204f = i1Var;
        this.f19205g = r0Var;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((q1) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new q1(this.f19205g, this.f19204f, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19203e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.w0 a10 = this.f19204f.f18982i.a(this.f19205g);
            i1<Object, Object> i1Var = this.f19204f;
            b bVar = new b(a10, i1Var);
            a aVar2 = new a(i1Var, null);
            this.f19203e = 1;
            if (bi.r.o(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
