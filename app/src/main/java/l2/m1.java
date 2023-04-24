package l2;

/* loaded from: classes.dex */
public final class m1 implements sm.f<g0> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19090a;

    /* renamed from: b */
    public final /* synthetic */ int f19091b;

    /* loaded from: classes.dex */
    public static final class a implements sm.g<j3> {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19092a;

        /* renamed from: b */
        public final /* synthetic */ int f19093b;

        @zl.e(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda-6$$inlined$map$1$2", f = "PageFetcherSnapshot.kt", l = {137}, m = "emit")
        /* renamed from: l2.m1$a$a */
        /* loaded from: classes.dex */
        public static final class C0338a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19094d;

            /* renamed from: e */
            public int f19095e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0338a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19094d = obj;
                this.f19095e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, int i10) {
            this.f19092a = gVar;
            this.f19093b = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(l2.j3 r6, xl.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof l2.m1.a.C0338a
                if (r0 == 0) goto L13
                r0 = r7
                l2.m1$a$a r0 = (l2.m1.a.C0338a) r0
                int r1 = r0.f19095e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19095e = r1
                goto L18
            L13:
                l2.m1$a$a r0 = new l2.m1$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f19094d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19095e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r7)
                goto L46
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                mf.a0.k(r7)
                sm.g r7 = r5.f19092a
                l2.j3 r6 = (l2.j3) r6
                l2.g0 r2 = new l2.g0
                int r4 = r5.f19093b
                r2.<init>(r4, r6)
                r0.f19095e = r3
                java.lang.Object r6 = r7.n(r2, r0)
                if (r6 != r1) goto L46
                return r1
            L46:
                tl.l r6 = tl.l.f28297a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.m1.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public m1(sm.t tVar, int i10) {
        this.f19090a = tVar;
        this.f19091b = i10;
    }

    @Override // sm.f
    public final Object a(sm.g<? super g0> gVar, xl.d dVar) {
        Object a10 = this.f19090a.a(new a(gVar, this.f19091b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
