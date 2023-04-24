package sm;

/* loaded from: classes2.dex */
public final class e<T> implements f<T> {

    /* renamed from: a */
    public final f<T> f27148a;

    /* renamed from: b */
    public final fm.l<T, Object> f27149b;

    /* renamed from: c */
    public final fm.p<Object, Object, Boolean> f27150c;

    /* loaded from: classes2.dex */
    public static final class a<T> implements g {

        /* renamed from: a */
        public final /* synthetic */ e<T> f27151a;

        /* renamed from: b */
        public final /* synthetic */ gm.a0<Object> f27152b;

        /* renamed from: c */
        public final /* synthetic */ g<T> f27153c;

        @zl.e(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
        /* renamed from: sm.e$a$a */
        /* loaded from: classes2.dex */
        public static final class C0487a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f27154d;

            /* renamed from: e */
            public final /* synthetic */ a<T> f27155e;

            /* renamed from: f */
            public int f27156f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0487a(a<? super T> aVar, xl.d<? super C0487a> dVar) {
                super(dVar);
                this.f27155e = aVar;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f27154d = obj;
                this.f27156f |= Integer.MIN_VALUE;
                return this.f27155e.n(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(e<T> eVar, gm.a0<Object> a0Var, g<? super T> gVar) {
            this.f27151a = eVar;
            this.f27152b = a0Var;
            this.f27153c = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(T r6, xl.d<? super tl.l> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof sm.e.a.C0487a
                if (r0 == 0) goto L13
                r0 = r7
                sm.e$a$a r0 = (sm.e.a.C0487a) r0
                int r1 = r0.f27156f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27156f = r1
                goto L18
            L13:
                sm.e$a$a r0 = new sm.e$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f27154d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f27156f
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r7)
                goto L65
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                mf.a0.k(r7)
                sm.e<T> r7 = r5.f27151a
                fm.l<T, java.lang.Object> r7 = r7.f27149b
                java.lang.Object r7 = r7.k(r6)
                gm.a0<java.lang.Object> r2 = r5.f27152b
                T r2 = r2.f15485a
                um.x r4 = h7.a.f15889a
                if (r2 == r4) goto L56
                sm.e<T> r4 = r5.f27151a
                fm.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f27150c
                java.lang.Object r2 = r4.A(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L53
                goto L56
            L53:
                tl.l r6 = tl.l.f28297a
                return r6
            L56:
                gm.a0<java.lang.Object> r2 = r5.f27152b
                r2.f15485a = r7
                sm.g<T> r7 = r5.f27153c
                r0.f27156f = r3
                java.lang.Object r6 = r7.n(r6, r0)
                if (r6 != r1) goto L65
                return r1
            L65:
                tl.l r6 = tl.l.f28297a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sm.e.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public e(f fVar, fm.p pVar) {
        l lVar = l.f27244b;
        this.f27148a = fVar;
        this.f27149b = lVar;
        this.f27150c = pVar;
    }

    @Override // sm.f
    public final Object a(g<? super T> gVar, xl.d<? super tl.l> dVar) {
        gm.a0 a0Var = new gm.a0();
        a0Var.f15485a = (T) h7.a.f15889a;
        Object a10 = this.f27148a.a(new a(this, a0Var, gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
