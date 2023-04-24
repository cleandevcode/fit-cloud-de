package l2;

/* loaded from: classes.dex */
public final class v2 implements sm.f<b1<Object>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19326a;

    /* renamed from: b */
    public final /* synthetic */ u2 f19327b;

    /* loaded from: classes.dex */
    public static final class a implements sm.g<b1<Object>> {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19328a;

        /* renamed from: b */
        public final /* synthetic */ u2 f19329b;

        @zl.e(c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", f = "Separators.kt", l = {137, 137}, m = "emit")
        /* renamed from: l2.v2$a$a */
        /* loaded from: classes.dex */
        public static final class C0346a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19330d;

            /* renamed from: e */
            public int f19331e;

            /* renamed from: f */
            public sm.g f19332f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0346a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19330d = obj;
                this.f19331e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, u2 u2Var) {
            this.f19328a = gVar;
            this.f19329b = u2Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x005a A[RETURN] */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(l2.b1<java.lang.Object> r7, xl.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof l2.v2.a.C0346a
                if (r0 == 0) goto L13
                r0 = r8
                l2.v2$a$a r0 = (l2.v2.a.C0346a) r0
                int r1 = r0.f19331e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19331e = r1
                goto L18
            L13:
                l2.v2$a$a r0 = new l2.v2$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f19330d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19331e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                mf.a0.k(r8)
                goto L5b
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                sm.g r7 = r0.f19332f
                mf.a0.k(r8)
                goto L4f
            L38:
                mf.a0.k(r8)
                sm.g r8 = r6.f19328a
                l2.b1 r7 = (l2.b1) r7
                l2.u2 r2 = r6.f19329b
                r0.f19332f = r8
                r0.f19331e = r4
                java.lang.Object r7 = r2.a(r7, r0)
                if (r7 != r1) goto L4c
                return r1
            L4c:
                r5 = r8
                r8 = r7
                r7 = r5
            L4f:
                r2 = 0
                r0.f19332f = r2
                r0.f19331e = r3
                java.lang.Object r7 = r7.n(r8, r0)
                if (r7 != r1) goto L5b
                return r1
            L5b:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.v2.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public v2(sm.f fVar, u2 u2Var) {
        this.f19326a = fVar;
        this.f19327b = u2Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super b1<Object>> gVar, xl.d dVar) {
        Object a10 = this.f19326a.a(new a(gVar, this.f19327b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
