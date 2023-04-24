package og;

/* loaded from: classes2.dex */
public final class n0 implements sm.f<Boolean> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f23407a;

    /* renamed from: b */
    public final /* synthetic */ d0 f23408b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f23409a;

        /* renamed from: b */
        public final /* synthetic */ d0 f23410b;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$flowWeatherRequire$lambda$6$$inlined$map$1$2", f = "DeviceManager.kt", l = {223}, m = "emit")
        /* renamed from: og.n0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0416a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f23411d;

            /* renamed from: e */
            public int f23412e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0416a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f23411d = obj;
                this.f23412e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, d0 d0Var) {
            this.f23409a = gVar;
            this.f23410b = d0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r7, xl.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof og.n0.a.C0416a
                if (r0 == 0) goto L13
                r0 = r8
                og.n0$a$a r0 = (og.n0.a.C0416a) r0
                int r1 = r0.f23412e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23412e = r1
                goto L18
            L13:
                og.n0$a$a r0 = new og.n0$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f23411d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f23412e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r8)
                goto L80
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                mf.a0.k(r8)
                sm.g r8 = r6.f23409a
                java.lang.Byte r7 = (java.lang.Byte) r7
                og.d0 r7 = r6.f23410b
                hj.a r7 = r7.f23258n
                jj.l r7 = r7.o()
                nj.c r7 = r7.f17930d
                og.d0 r2 = r6.f23410b
                hj.a r2 = r2.f23258n
                jj.l r2 = r2.o()
                java.util.HashMap<java.lang.Byte, byte[]> r2 = r2.f17931e
                r4 = 26
                java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
                java.lang.Object r2 = r2.get(r4)
                byte[] r2 = (byte[]) r2
                r4 = 2
                if (r2 == 0) goto L5c
                int r5 = r2.length
                if (r5 == r4) goto L5d
            L5c:
                r2 = 0
            L5d:
                r5 = 4
                boolean r7 = r7.g(r5)
                r5 = 0
                if (r7 == 0) goto L73
                r7 = 5
                if (r2 != 0) goto L6a
                r7 = 0
                goto L70
            L6a:
                int r4 = r4 + (-1)
                boolean r7 = bi.m0.x(r2, r4, r7)
            L70:
                if (r7 == 0) goto L73
                r5 = 1
            L73:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
                r0.f23412e = r3
                java.lang.Object r7 = r8.n(r7, r0)
                if (r7 != r1) goto L80
                return r1
            L80:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: og.n0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public n0(sm.b bVar, d0 d0Var) {
        this.f23407a = bVar;
        this.f23408b = d0Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super Boolean> gVar, xl.d dVar) {
        Object a10 = this.f23407a.a(new a(gVar, this.f23408b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
