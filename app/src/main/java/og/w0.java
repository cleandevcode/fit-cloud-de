package og;

/* loaded from: classes2.dex */
public final class w0 implements sm.f<wf.a> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f23512a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f23513a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.DeviceManagerImpl$special$$inlined$map$1$2", f = "DeviceManager.kt", l = {223}, m = "emit")
        /* renamed from: og.w0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0418a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f23514d;

            /* renamed from: e */
            public int f23515e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0418a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f23514d = obj;
                this.f23515e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f23513a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r7, xl.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof og.w0.a.C0418a
                if (r0 == 0) goto L13
                r0 = r8
                og.w0$a$a r0 = (og.w0.a.C0418a) r0
                int r1 = r0.f23515e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f23515e = r1
                goto L18
            L13:
                og.w0$a$a r0 = new og.w0$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f23514d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f23515e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r8)
                goto L72
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                mf.a0.k(r8)
                sm.g r8 = r6.f23513a
                pg.d r7 = (pg.d) r7
                r2 = 0
                if (r7 != 0) goto L3a
                goto L69
            L3a:
                java.lang.String r4 = r7.f24028e
                r5 = 0
                if (r4 == 0) goto L48
                int r4 = r4.length()
                if (r4 != 0) goto L46
                goto L48
            L46:
                r4 = 0
                goto L49
            L48:
                r4 = 1
            L49:
                if (r4 != 0) goto L69
                java.lang.String r4 = r7.f24029f
                if (r4 == 0) goto L58
                int r4 = r4.length()
                if (r4 != 0) goto L56
                goto L58
            L56:
                r4 = 0
                goto L59
            L58:
                r4 = 1
            L59:
                if (r4 != 0) goto L69
                int r4 = r7.f24031h
                if (r4 != r3) goto L60
                goto L69
            L60:
                wf.a r2 = new wf.a
                java.lang.String r4 = r7.f24028e
                java.lang.String r7 = r7.f24029f
                r2.<init>(r4, r7, r5)
            L69:
                r0.f23515e = r3
                java.lang.Object r7 = r8.n(r2, r0)
                if (r7 != r1) goto L72
                return r1
            L72:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: og.w0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public w0(tm.j jVar) {
        this.f23512a = jVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super wf.a> gVar, xl.d dVar) {
        Object a10 = this.f23512a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
