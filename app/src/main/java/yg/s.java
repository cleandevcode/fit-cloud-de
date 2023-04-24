package yg;

/* loaded from: classes2.dex */
public final class s implements sm.f<Long> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f31644a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f31645a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageImpl$flowLastSyncTime$$inlined$map$1$2", f = "UserStorage.kt", l = {223}, m = "emit")
        /* renamed from: yg.s$a$a */
        /* loaded from: classes2.dex */
        public static final class C0588a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f31646d;

            /* renamed from: e */
            public int f31647e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0588a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f31646d = obj;
                this.f31647e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f31645a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r7, xl.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof yg.s.a.C0588a
                if (r0 == 0) goto L13
                r0 = r8
                yg.s$a$a r0 = (yg.s.a.C0588a) r0
                int r1 = r0.f31647e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f31647e = r1
                goto L18
            L13:
                yg.s$a$a r0 = new yg.s$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f31646d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f31647e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r8)
                goto L55
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                mf.a0.k(r8)
                sm.g r8 = r6.f31645a
                v1.d r7 = (v1.d) r7
                v1.d$a<java.lang.Long> r2 = yg.p.f31601i
                java.lang.Object r7 = r7.b(r2)
                java.lang.Long r7 = (java.lang.Long) r7
                if (r7 == 0) goto L45
                long r4 = r7.longValue()
                goto L47
            L45:
                r4 = 0
            L47:
                java.lang.Long r7 = new java.lang.Long
                r7.<init>(r4)
                r0.f31647e = r3
                java.lang.Object r7 = r8.n(r7, r0)
                if (r7 != r1) goto L55
                return r1
            L55:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yg.s.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public s(sm.f fVar) {
        this.f31644a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super Long> gVar, xl.d dVar) {
        Object a10 = this.f31644a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
