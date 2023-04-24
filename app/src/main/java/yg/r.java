package yg;

/* loaded from: classes2.dex */
public final class r implements sm.f<Integer> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f31639a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f31640a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageImpl$flowHourStyle$$inlined$map$1$2", f = "UserStorage.kt", l = {223}, m = "emit")
        /* renamed from: yg.r$a$a */
        /* loaded from: classes2.dex */
        public static final class C0587a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f31641d;

            /* renamed from: e */
            public int f31642e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0587a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f31641d = obj;
                this.f31642e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f31640a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r5, xl.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof yg.r.a.C0587a
                if (r0 == 0) goto L13
                r0 = r6
                yg.r$a$a r0 = (yg.r.a.C0587a) r0
                int r1 = r0.f31642e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f31642e = r1
                goto L18
            L13:
                yg.r$a$a r0 = new yg.r$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f31641d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f31642e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r6)
                goto L54
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                mf.a0.k(r6)
                sm.g r6 = r4.f31640a
                v1.d r5 = (v1.d) r5
                v1.d$a<java.lang.Integer> r2 = yg.p.f31600h
                java.lang.Object r5 = r5.b(r2)
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 == 0) goto L45
                int r5 = r5.intValue()
                goto L46
            L45:
                r5 = 0
            L46:
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r5)
                r0.f31642e = r3
                java.lang.Object r5 = r6.n(r2, r0)
                if (r5 != r1) goto L54
                return r1
            L54:
                tl.l r5 = tl.l.f28297a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yg.r.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public r(sm.f fVar) {
        this.f31639a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super Integer> gVar, xl.d dVar) {
        Object a10 = this.f31639a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
