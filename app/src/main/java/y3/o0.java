package y3;

/* loaded from: classes.dex */
public final class o0 implements sm.f<f0<Object>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f31000a;

    /* renamed from: b */
    public final /* synthetic */ mm.f f31001b;

    /* loaded from: classes.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f31002a;

        /* renamed from: b */
        public final /* synthetic */ mm.f f31003b;

        @zl.e(c = "com.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal1$$inlined$map$1$2", f = "MavericksViewModelExtensions.kt", l = {224}, m = "emit")
        /* renamed from: y3.o0$a$a */
        /* loaded from: classes.dex */
        public static final class C0569a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f31004d;

            /* renamed from: e */
            public int f31005e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0569a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f31004d = obj;
                this.f31005e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, mm.f fVar) {
            this.f31002a = gVar;
            this.f31003b = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r6, xl.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof y3.o0.a.C0569a
                if (r0 == 0) goto L13
                r0 = r7
                y3.o0$a$a r0 = (y3.o0.a.C0569a) r0
                int r1 = r0.f31005e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f31005e = r1
                goto L18
            L13:
                y3.o0$a$a r0 = new y3.o0$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f31004d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f31005e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r7)
                goto L4a
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                mf.a0.k(r7)
                sm.g r7 = r5.f31002a
                y3.b0 r6 = (y3.b0) r6
                y3.f0 r2 = new y3.f0
                mm.f r4 = r5.f31003b
                java.lang.Object r6 = r4.get(r6)
                r2.<init>(r6)
                r0.f31005e = r3
                java.lang.Object r6 = r7.n(r2, r0)
                if (r6 != r1) goto L4a
                return r1
            L4a:
                tl.l r6 = tl.l.f28297a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: y3.o0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public o0(sm.f fVar, mm.f fVar2) {
        this.f31000a = fVar;
        this.f31001b = fVar2;
    }

    @Override // sm.f
    public final Object a(sm.g<? super f0<Object>> gVar, xl.d dVar) {
        Object a10 = this.f31000a.a(new a(gVar, this.f31001b), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
