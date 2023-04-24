package l2;

/* loaded from: classes.dex */
public final class v implements sm.f<Object> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19311a;

    /* loaded from: classes.dex */
    public static final class a implements sm.g<tl.f<? extends Integer, Object>> {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19312a;

        @zl.e(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", l = {138}, m = "emit")
        /* renamed from: l2.v$a$a */
        /* loaded from: classes.dex */
        public static final class C0345a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19313d;

            /* renamed from: e */
            public int f19314e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0345a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19313d = obj;
                this.f19314e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f19312a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(tl.f<? extends java.lang.Integer, java.lang.Object> r5, xl.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof l2.v.a.C0345a
                if (r0 == 0) goto L13
                r0 = r6
                l2.v$a$a r0 = (l2.v.a.C0345a) r0
                int r1 = r0.f19314e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19314e = r1
                goto L18
            L13:
                l2.v$a$a r0 = new l2.v$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f19313d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19314e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r6)
                goto L44
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                mf.a0.k(r6)
                sm.g r6 = r4.f19312a
                tl.f r5 = (tl.f) r5
                B r5 = r5.f28287b
                if (r5 != 0) goto L3b
                goto L44
            L3b:
                r0.f19314e = r3
                java.lang.Object r5 = r6.n(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                tl.l r5 = tl.l.f28297a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.v.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public v(sm.r0 r0Var) {
        this.f19311a = r0Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super Object> gVar, xl.d dVar) {
        Object a10 = this.f19311a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
