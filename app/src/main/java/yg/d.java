package yg;

/* loaded from: classes2.dex */
public final class d implements sm.f<String> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f31564a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f31565a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$flowAppUpgradeVersion$$inlined$map$1$2", f = "GlobalStorageImpl.kt", l = {223}, m = "emit")
        /* renamed from: yg.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C0583a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f31566d;

            /* renamed from: e */
            public int f31567e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0583a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f31566d = obj;
                this.f31567e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f31565a = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r5, xl.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof yg.d.a.C0583a
                if (r0 == 0) goto L13
                r0 = r6
                yg.d$a$a r0 = (yg.d.a.C0583a) r0
                int r1 = r0.f31567e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f31567e = r1
                goto L18
            L13:
                yg.d$a$a r0 = new yg.d$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f31566d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f31567e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r6)
                goto L47
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                mf.a0.k(r6)
                sm.g r6 = r4.f31565a
                v1.d r5 = (v1.d) r5
                v1.d$a<java.lang.Integer> r2 = yg.b.C0579b.f31496a
                v1.d$a<java.lang.String> r2 = yg.b.C0579b.f31498c
                java.lang.Object r5 = r5.b(r2)
                r0.f31567e = r3
                java.lang.Object r5 = r6.n(r5, r0)
                if (r5 != r1) goto L47
                return r1
            L47:
                tl.l r5 = tl.l.f28297a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yg.d.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public d(sm.f fVar) {
        this.f31564a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super String> gVar, xl.d dVar) {
        Object a10 = this.f31564a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
