package mg;

import com.topstep.fitcloud.pro.shared.data.wh.WhRemindConfig;

/* loaded from: classes2.dex */
public final class c9 implements sm.f<WhRemindConfig> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f20809a;

    /* renamed from: b */
    public final /* synthetic */ d9 f20810b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f20811a;

        /* renamed from: b */
        public final /* synthetic */ d9 f20812b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao$flowWhRemindConfig$$inlined$map$1$2", f = "StringTypedDao.kt", l = {223}, m = "emit")
        /* renamed from: mg.c9$a$a */
        /* loaded from: classes2.dex */
        public static final class C0376a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f20813d;

            /* renamed from: e */
            public int f20814e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0376a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f20813d = obj;
                this.f20814e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, d9 d9Var) {
            this.f20811a = gVar;
            this.f20812b = d9Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x004d A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:58:0x003d, B:67:0x004d), top: B:82:0x003d }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0080 A[RETURN] */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r13, xl.d r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof mg.c9.a.C0376a
                if (r0 == 0) goto L13
                r0 = r14
                mg.c9$a$a r0 = (mg.c9.a.C0376a) r0
                int r1 = r0.f20814e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20814e = r1
                goto L18
            L13:
                mg.c9$a$a r0 = new mg.c9$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f20813d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f20814e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r14)
                goto L81
            L27:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L2f:
                mf.a0.k(r14)
                sm.g r14 = r12.f20811a
                java.lang.String r13 = (java.lang.String) r13
                mg.d9 r2 = r12.f20812b
                mf.h0 r2 = r2.f20864a
                r4 = 0
                if (r13 == 0) goto L48
                int r5 = r13.length()     // Catch: java.lang.Throwable -> L46
                if (r5 != 0) goto L44
                goto L48
            L44:
                r5 = 0
                goto L49
            L46:
                r13 = move-exception
                goto L58
            L48:
                r5 = 1
            L49:
                if (r5 == 0) goto L4d
                r13 = r4
                goto L61
            L4d:
                java.lang.Class<com.topstep.fitcloud.pro.shared.data.wh.WhRemindConfig> r5 = com.topstep.fitcloud.pro.shared.data.wh.WhRemindConfig.class
                mf.t r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L46
                java.lang.Object r13 = r2.a(r13)     // Catch: java.lang.Throwable -> L46
                goto L61
            L58:
                do.a$b r2 = p000do.a.f13275a
                r2.q(r13)
                tl.g$a r13 = mf.a0.f(r13)
            L61:
                boolean r2 = r13 instanceof tl.g.a
                if (r2 == 0) goto L66
                goto L67
            L66:
                r4 = r13
            L67:
                com.topstep.fitcloud.pro.shared.data.wh.WhRemindConfig r4 = (com.topstep.fitcloud.pro.shared.data.wh.WhRemindConfig) r4
                if (r4 != 0) goto L78
                com.topstep.fitcloud.pro.shared.data.wh.WhRemindConfig r4 = new com.topstep.fitcloud.pro.shared.data.wh.WhRemindConfig
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 15
                r11 = 0
                r5 = r4
                r5.<init>(r6, r7, r8, r9, r10, r11)
            L78:
                r0.f20814e = r3
                java.lang.Object r13 = r14.n(r4, r0)
                if (r13 != r1) goto L81
                return r1
            L81:
                tl.l r13 = tl.l.f28297a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.c9.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public c9(sm.f fVar, d9 d9Var) {
        this.f20809a = fVar;
        this.f20810b = d9Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super WhRemindConfig> gVar, xl.d dVar) {
        Object a10 = this.f20809a.a(new a(gVar, this.f20810b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
