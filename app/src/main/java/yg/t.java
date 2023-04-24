package yg;

/* loaded from: classes2.dex */
public final class t implements sm.f<Integer> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f31649a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f31650a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageImpl$flowWomenHealthMode$$inlined$map$1$2", f = "UserStorage.kt", l = {223}, m = "emit")
        /* renamed from: yg.t$a$a */
        /* loaded from: classes2.dex */
        public static final class C0589a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f31651d;

            /* renamed from: e */
            public int f31652e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0589a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f31651d = obj;
                this.f31652e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f31650a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r5, xl.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof yg.t.a.C0589a
                if (r0 == 0) goto L13
                r0 = r6
                yg.t$a$a r0 = (yg.t.a.C0589a) r0
                int r1 = r0.f31652e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f31652e = r1
                goto L18
            L13:
                yg.t$a$a r0 = new yg.t$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f31651d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f31652e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r6)
                goto L50
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                mf.a0.k(r6)
                sm.g r6 = r4.f31650a
                v1.d r5 = (v1.d) r5
                v1.d$a<java.lang.Integer> r2 = yg.p.f31607o
                java.lang.Object r5 = r5.b(r2)
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 == 0) goto L46
                int r2 = r5.intValue()
                if (r2 >= 0) goto L47
            L46:
                r5 = 0
            L47:
                r0.f31652e = r3
                java.lang.Object r5 = r6.n(r5, r0)
                if (r5 != r1) goto L50
                return r1
            L50:
                tl.l r5 = tl.l.f28297a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: yg.t.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public t(sm.f fVar) {
        this.f31649a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super Integer> gVar, xl.d dVar) {
        Object a10 = this.f31649a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
