package kg;

/* loaded from: classes2.dex */
public final class j implements sm.f<uf.b> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f18522a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f18523a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.config.UnitConfigRepositoryImpl$special$$inlined$map$1$2", f = "UnitConfigRepository.kt", l = {223}, m = "emit")
        /* renamed from: kg.j$a$a */
        /* loaded from: classes2.dex */
        public static final class C0319a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f18524d;

            /* renamed from: e */
            public int f18525e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0319a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f18524d = obj;
                this.f18525e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f18523a = gVar;
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
                boolean r0 = r8 instanceof kg.j.a.C0319a
                if (r0 == 0) goto L13
                r0 = r8
                kg.j$a$a r0 = (kg.j.a.C0319a) r0
                int r1 = r0.f18525e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18525e = r1
                goto L18
            L13:
                kg.j$a$a r0 = new kg.j$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f18524d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f18525e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r8)
                goto L54
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                mf.a0.k(r8)
                sm.g r8 = r6.f18523a
                pg.k r7 = (pg.k) r7
                if (r7 != 0) goto L3f
                uf.b r7 = new uf.b
                r2 = 0
                r7.<init>(r2, r2, r2)
                goto L4b
            L3f:
                uf.b r2 = new uf.b
                int r4 = r7.f24056e
                int r5 = r7.f24057f
                int r7 = r7.f24058g
                r2.<init>(r4, r5, r7)
                r7 = r2
            L4b:
                r0.f18525e = r3
                java.lang.Object r7 = r8.n(r7, r0)
                if (r7 != r1) goto L54
                return r1
            L54:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kg.j.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public j(tm.j jVar) {
        this.f18522a = jVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super uf.b> gVar, xl.d dVar) {
        Object a10 = this.f18522a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
