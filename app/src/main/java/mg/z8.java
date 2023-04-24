package mg;

import com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache;

/* loaded from: classes2.dex */
public final class z8 implements sm.f<SportTotalCache> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f21785a;

    /* renamed from: b */
    public final /* synthetic */ d9 f21786b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f21787a;

        /* renamed from: b */
        public final /* synthetic */ d9 f21788b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao$flowSportTotalCache$$inlined$map$1$2", f = "StringTypedDao.kt", l = {223}, m = "emit")
        /* renamed from: mg.z8$a$a */
        /* loaded from: classes2.dex */
        public static final class C0384a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f21789d;

            /* renamed from: e */
            public int f21790e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0384a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f21789d = obj;
                this.f21790e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, d9 d9Var) {
            this.f21787a = gVar;
            this.f21788b = d9Var;
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
        public final java.lang.Object n(java.lang.Object r14, xl.d r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof mg.z8.a.C0384a
                if (r0 == 0) goto L13
                r0 = r15
                mg.z8$a$a r0 = (mg.z8.a.C0384a) r0
                int r1 = r0.f21790e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f21790e = r1
                goto L18
            L13:
                mg.z8$a$a r0 = new mg.z8$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f21789d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f21790e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r15)
                goto L81
            L27:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L2f:
                mf.a0.k(r15)
                sm.g r15 = r13.f21787a
                java.lang.String r14 = (java.lang.String) r14
                mg.d9 r2 = r13.f21788b
                mf.h0 r2 = r2.f20864a
                r4 = 0
                if (r14 == 0) goto L48
                int r5 = r14.length()     // Catch: java.lang.Throwable -> L46
                if (r5 != 0) goto L44
                goto L48
            L44:
                r5 = 0
                goto L49
            L46:
                r14 = move-exception
                goto L58
            L48:
                r5 = 1
            L49:
                if (r5 == 0) goto L4d
                r14 = r4
                goto L61
            L4d:
                java.lang.Class<com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache> r5 = com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache.class
                mf.t r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L46
                java.lang.Object r14 = r2.a(r14)     // Catch: java.lang.Throwable -> L46
                goto L61
            L58:
                do.a$b r2 = p000do.a.f13275a
                r2.q(r14)
                tl.g$a r14 = mf.a0.f(r14)
            L61:
                boolean r2 = r14 instanceof tl.g.a
                if (r2 == 0) goto L66
                goto L67
            L66:
                r4 = r14
            L67:
                com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache r4 = (com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache) r4
                if (r4 != 0) goto L78
                com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache r4 = new com.topstep.fitcloud.pro.shared.data.entity.data.SportTotalCache
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                r11 = 3
                r12 = 0
                r5 = r4
                r5.<init>(r6, r7, r8, r9, r11, r12)
            L78:
                r0.f21790e = r3
                java.lang.Object r14 = r15.n(r4, r0)
                if (r14 != r1) goto L81
                return r1
            L81:
                tl.l r14 = tl.l.f28297a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.z8.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public z8(sm.f fVar, d9 d9Var) {
        this.f21785a = fVar;
        this.f21786b = d9Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super SportTotalCache> gVar, xl.d dVar) {
        Object a10 = this.f21785a.a(new a(gVar, this.f21786b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
