package mg;

import com.topstep.fitcloud.pro.model.data.OxygenRealtime;

/* loaded from: classes2.dex */
public final class w8 implements sm.f<OxygenRealtime> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f21616a;

    /* renamed from: b */
    public final /* synthetic */ d9 f21617b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f21618a;

        /* renamed from: b */
        public final /* synthetic */ d9 f21619b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.db.StringTypedDao$flowOxygenRealtime$$inlined$map$1$2", f = "StringTypedDao.kt", l = {223}, m = "emit")
        /* renamed from: mg.w8$a$a */
        /* loaded from: classes2.dex */
        public static final class C0381a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f21620d;

            /* renamed from: e */
            public int f21621e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0381a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f21620d = obj;
                this.f21621e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, d9 d9Var) {
            this.f21618a = gVar;
            this.f21619b = d9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x004d A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:55:0x003d, B:64:0x004d), top: B:76:0x003d }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x006f A[RETURN] */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r7, xl.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof mg.w8.a.C0381a
                if (r0 == 0) goto L13
                r0 = r8
                mg.w8$a$a r0 = (mg.w8.a.C0381a) r0
                int r1 = r0.f21621e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f21621e = r1
                goto L18
            L13:
                mg.w8$a$a r0 = new mg.w8$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f21620d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f21621e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r8)
                goto L70
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                mf.a0.k(r8)
                sm.g r8 = r6.f21618a
                java.lang.String r7 = (java.lang.String) r7
                mg.d9 r2 = r6.f21619b
                mf.h0 r2 = r2.f20864a
                r4 = 0
                if (r7 == 0) goto L48
                int r5 = r7.length()     // Catch: java.lang.Throwable -> L46
                if (r5 != 0) goto L44
                goto L48
            L44:
                r5 = 0
                goto L49
            L46:
                r7 = move-exception
                goto L58
            L48:
                r5 = 1
            L49:
                if (r5 == 0) goto L4d
                r7 = r4
                goto L61
            L4d:
                java.lang.Class<com.topstep.fitcloud.pro.model.data.OxygenRealtime> r5 = com.topstep.fitcloud.pro.model.data.OxygenRealtime.class
                mf.t r2 = r2.a(r5)     // Catch: java.lang.Throwable -> L46
                java.lang.Object r7 = r2.a(r7)     // Catch: java.lang.Throwable -> L46
                goto L61
            L58:
                do.a$b r2 = p000do.a.f13275a
                r2.q(r7)
                tl.g$a r7 = mf.a0.f(r7)
            L61:
                boolean r2 = r7 instanceof tl.g.a
                if (r2 == 0) goto L66
                goto L67
            L66:
                r4 = r7
            L67:
                r0.f21621e = r3
                java.lang.Object r7 = r8.n(r4, r0)
                if (r7 != r1) goto L70
                return r1
            L70:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.w8.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public w8(sm.f fVar, d9 d9Var) {
        this.f21616a = fVar;
        this.f21617b = d9Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super OxygenRealtime> gVar, xl.d dVar) {
        Object a10 = this.f21616a.a(new a(gVar, this.f21617b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
