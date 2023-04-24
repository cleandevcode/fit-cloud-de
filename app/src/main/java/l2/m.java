package l2;

/* loaded from: classes.dex */
public final class m implements sm.f<b2<Object>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f19084a;

    /* loaded from: classes.dex */
    public static final class a implements sm.g<u0<Object>> {

        /* renamed from: a */
        public final /* synthetic */ sm.g f19085a;

        @zl.e(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {137}, m = "emit")
        /* renamed from: l2.m$a$a */
        /* loaded from: classes.dex */
        public static final class C0337a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f19086d;

            /* renamed from: e */
            public int f19087e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0337a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f19086d = obj;
                this.f19087e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar) {
            this.f19085a = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(l2.u0<java.lang.Object> r6, xl.d r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof l2.m.a.C0337a
                if (r0 == 0) goto L13
                r0 = r7
                l2.m$a$a r0 = (l2.m.a.C0337a) r0
                int r1 = r0.f19087e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19087e = r1
                goto L18
            L13:
                l2.m$a$a r0 = new l2.m$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f19086d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f19087e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r7)
                goto L4f
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                mf.a0.k(r7)
                sm.g r7 = r5.f19085a
                l2.u0 r6 = (l2.u0) r6
                r6.getClass()
                l2.b2 r2 = new l2.b2
                l2.l<T> r4 = r6.f19276c
                sm.u0 r4 = r4.f19065e
                l2.b2<T> r6 = r6.f19275b
                l2.h3 r6 = r6.f18756b
                r2.<init>(r4, r6)
                r0.f19087e = r3
                java.lang.Object r6 = r7.n(r2, r0)
                if (r6 != r1) goto L4f
                return r1
            L4f:
                tl.l r6 = tl.l.f28297a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.m.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public m(sm.u0 u0Var) {
        this.f19084a = u0Var;
    }

    @Override // sm.f
    public final Object a(sm.g<? super b2<Object>> gVar, xl.d dVar) {
        Object a10 = this.f19084a.a(new a(gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
