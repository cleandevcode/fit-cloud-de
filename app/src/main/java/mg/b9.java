package mg;

import com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig;

/* loaded from: classes2.dex */
public final class b9 implements sm.f<WhMenstruationConfig> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f20716a;

    /* renamed from: b */
    public final /* synthetic */ d9 f20717b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f20718a;

        /* renamed from: b */
        public final /* synthetic */ d9 f20719b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao$flowWhPregnancyConfig$$inlined$map$1$2", f = "StringTypedDao.kt", l = {223}, m = "emit")
        /* renamed from: mg.b9$a$a */
        /* loaded from: classes2.dex */
        public static final class C0375a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f20720d;

            /* renamed from: e */
            public int f20721e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0375a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f20720d = obj;
                this.f20721e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, d9 d9Var) {
            this.f20718a = gVar;
            this.f20719b = d9Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x004d A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:58:0x003d, B:67:0x004d), top: B:82:0x003d }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x007e A[RETURN] */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r12, xl.d r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof mg.b9.a.C0375a
                if (r0 == 0) goto L13
                r0 = r13
                mg.b9$a$a r0 = (mg.b9.a.C0375a) r0
                int r1 = r0.f20721e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20721e = r1
                goto L18
            L13:
                mg.b9$a$a r0 = new mg.b9$a$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f20720d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f20721e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r13)
                goto L7f
            L27:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L2f:
                mf.a0.k(r13)
                sm.g r13 = r11.f20718a
                java.lang.String r12 = (java.lang.String) r12
                mg.d9 r2 = r11.f20719b
                mf.h0 r2 = r2.f20864a
                r4 = 0
                if (r12 == 0) goto L48
                int r5 = r12.length()     // Catch: java.lang.Throwable -> L46
                if (r5 != 0) goto L44
                goto L48
            L44:
                r5 = 0
                goto L49
            L46:
                r12 = move-exception
                goto L58
            L48:
                r5 = 1
            L49:
                if (r5 == 0) goto L4d
                r12 = r4
                goto L61
            L4d:
                java.lang.Class<com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig> r5 = com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig.class
                mf.t r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L46
                java.lang.Object r12 = r2.a(r12)     // Catch: java.lang.Throwable -> L46
                goto L61
            L58:
                do.a$b r2 = p000do.a.f13275a
                r2.q(r12)
                tl.g$a r12 = mf.a0.f(r12)
            L61:
                boolean r2 = r12 instanceof tl.g.a
                if (r2 == 0) goto L66
                goto L67
            L66:
                r4 = r12
            L67:
                com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r4 = (com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig) r4
                if (r4 != 0) goto L76
                com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig r4 = new com.topstep.fitcloud.pro.shared.data.wh.WhMenstruationConfig
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 7
                r10 = 0
                r5 = r4
                r5.<init>(r6, r7, r8, r9, r10)
            L76:
                r0.f20721e = r3
                java.lang.Object r12 = r13.n(r4, r0)
                if (r12 != r1) goto L7f
                return r1
            L7f:
                tl.l r12 = tl.l.f28297a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.b9.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public b9(sm.f fVar, d9 d9Var) {
        this.f20716a = fVar;
        this.f20717b = d9Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super WhMenstruationConfig> gVar, xl.d dVar) {
        Object a10 = this.f20716a.a(new a(gVar, this.f20717b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
