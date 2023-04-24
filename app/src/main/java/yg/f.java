package yg;

/* loaded from: classes2.dex */
public final class f implements sm.f<cg.a> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f31574a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f31575a;

        @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.GlobalStorageImpl$flowSelectedTheme$$inlined$map$1$2", f = "GlobalStorageImpl.kt", l = {223}, m = "emit")
        /* renamed from: yg.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C0585a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f31576d;

            /* renamed from: e */
            public int f31577e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0585a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f31576d = obj;
                this.f31577e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f31575a = gVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:70:0x0055, code lost:
            if (android.os.Build.VERSION.SDK_INT >= 29) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0074, code lost:
            if (android.os.Build.VERSION.SDK_INT >= 29) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0077, code lost:
            r0 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0033  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r12, xl.d r13) {
            /*
                r11 = this;
                cg.a r0 = cg.a.FLOW_SYSTEM
                cg.a r1 = cg.a.BATTERY_SAVER
                boolean r2 = r13 instanceof yg.f.a.C0585a
                if (r2 == 0) goto L17
                r2 = r13
                yg.f$a$a r2 = (yg.f.a.C0585a) r2
                int r3 = r2.f31577e
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f31577e = r3
                goto L1c
            L17:
                yg.f$a$a r2 = new yg.f$a$a
                r2.<init>(r13)
            L1c:
                java.lang.Object r13 = r2.f31576d
                yl.a r3 = yl.a.COROUTINE_SUSPENDED
                int r4 = r2.f31577e
                r5 = 1
                if (r4 == 0) goto L33
                if (r4 != r5) goto L2b
                mf.a0.k(r13)
                goto L83
            L2b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L33:
                mf.a0.k(r13)
                sm.g r13 = r11.f31575a
                v1.d r12 = (v1.d) r12
                v1.d$a<java.lang.String> r4 = yg.b.C0579b.f31504i
                java.lang.Object r12 = r12.b(r4)
                java.lang.String r12 = (java.lang.String) r12
                r4 = 0
                if (r12 == 0) goto L4e
                int r6 = r12.length()
                if (r6 != 0) goto L4c
                goto L4e
            L4c:
                r6 = 0
                goto L4f
            L4e:
                r6 = 1
            L4f:
                r7 = 29
                if (r6 == 0) goto L58
                int r12 = android.os.Build.VERSION.SDK_INT
                if (r12 < r7) goto L77
                goto L7a
            L58:
                cg.a[] r6 = cg.a.values()
                int r8 = r6.length
            L5d:
                if (r4 >= r8) goto L6f
                r9 = r6[r4]
                java.lang.String r10 = r9.name()
                boolean r10 = gm.l.a(r10, r12)
                if (r10 == 0) goto L6c
                goto L70
            L6c:
                int r4 = r4 + 1
                goto L5d
            L6f:
                r9 = 0
            L70:
                if (r9 != 0) goto L79
                int r12 = android.os.Build.VERSION.SDK_INT
                if (r12 < r7) goto L77
                goto L7a
            L77:
                r0 = r1
                goto L7a
            L79:
                r0 = r9
            L7a:
                r2.f31577e = r5
                java.lang.Object r12 = r13.n(r0, r2)
                if (r12 != r3) goto L83
                return r3
            L83:
                tl.l r12 = tl.l.f28297a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: yg.f.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public f(sm.f fVar) {
        this.f31574a = fVar;
    }

    @Override // sm.f
    public final Object a(sm.g<? super cg.a> gVar, xl.d dVar) {
        Object a10 = this.f31574a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
