package sm;

/* loaded from: classes2.dex */
public final class d1 implements b1 {

    @zl.e(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {155}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<g<? super z0>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f27140e;

        /* renamed from: f */
        public /* synthetic */ Object f27141f;

        /* renamed from: g */
        public final /* synthetic */ f1<Integer> f27142g;

        /* renamed from: sm.d1$a$a */
        /* loaded from: classes2.dex */
        public static final class C0485a<T> implements g {

            /* renamed from: a */
            public final /* synthetic */ gm.x f27143a;

            /* renamed from: b */
            public final /* synthetic */ g<z0> f27144b;

            @zl.e(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {158}, m = "emit")
            /* renamed from: sm.d1$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0486a extends zl.c {

                /* renamed from: d */
                public /* synthetic */ Object f27145d;

                /* renamed from: e */
                public final /* synthetic */ C0485a<T> f27146e;

                /* renamed from: f */
                public int f27147f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0486a(C0485a<? super T> c0485a, xl.d<? super C0486a> dVar) {
                    super(dVar);
                    this.f27146e = c0485a;
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    this.f27145d = obj;
                    this.f27147f |= Integer.MIN_VALUE;
                    return this.f27146e.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0485a(gm.x xVar, g<? super z0> gVar) {
                this.f27143a = xVar;
                this.f27144b = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(int r5, xl.d<? super tl.l> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof sm.d1.a.C0485a.C0486a
                    if (r0 == 0) goto L13
                    r0 = r6
                    sm.d1$a$a$a r0 = (sm.d1.a.C0485a.C0486a) r0
                    int r1 = r0.f27147f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27147f = r1
                    goto L18
                L13:
                    sm.d1$a$a$a r0 = new sm.d1$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f27145d
                    yl.a r1 = yl.a.COROUTINE_SUSPENDED
                    int r2 = r0.f27147f
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    mf.a0.k(r6)
                    goto L49
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    mf.a0.k(r6)
                    if (r5 <= 0) goto L4c
                    gm.x r5 = r4.f27143a
                    boolean r6 = r5.f15506a
                    if (r6 != 0) goto L4c
                    r5.f15506a = r3
                    sm.g<sm.z0> r5 = r4.f27144b
                    sm.z0 r6 = sm.z0.START
                    r0.f27147f = r3
                    java.lang.Object r5 = r5.n(r6, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    tl.l r5 = tl.l.f28297a
                    return r5
                L4c:
                    tl.l r5 = tl.l.f28297a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: sm.d1.a.C0485a.a(int, xl.d):java.lang.Object");
            }

            @Override // sm.g
            public final /* bridge */ /* synthetic */ Object n(Object obj, xl.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1<Integer> f1Var, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f27142g = f1Var;
        }

        @Override // fm.p
        public final Object A(g<? super z0> gVar, xl.d<? super tl.l> dVar) {
            ((a) p(gVar, dVar)).t(tl.l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f27142g, dVar);
            aVar.f27141f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f27140e;
            if (i10 == 0) {
                mf.a0.k(obj);
                gm.x xVar = new gm.x();
                f1<Integer> f1Var = this.f27142g;
                C0485a c0485a = new C0485a(xVar, (g) this.f27141f);
                this.f27140e = 1;
                if (f1Var.a(c0485a, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            throw new u2.b();
        }
    }

    @Override // sm.b1
    public final f<z0> a(f1<Integer> f1Var) {
        return new u0(new a(f1Var, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
