package u6;

import sm.s0;

/* loaded from: classes.dex */
public final class u implements sm.f<r<Object, Object>> {

    /* renamed from: a */
    public final /* synthetic */ sm.f f28616a;

    /* renamed from: b */
    public final /* synthetic */ mm.f f28617b;

    /* renamed from: c */
    public final /* synthetic */ mm.f f28618c;

    /* loaded from: classes.dex */
    public static final class a<T> implements sm.g {

        /* renamed from: a */
        public final /* synthetic */ sm.g f28619a;

        /* renamed from: b */
        public final /* synthetic */ mm.f f28620b;

        /* renamed from: c */
        public final /* synthetic */ mm.f f28621c;

        @zl.e(c = "com.github.airbnb.mvrx.MavericksViewModelExtensionsKt$_internal2$$inlined$map$1$2", f = "MavericksViewModelExtensions.kt", l = {224}, m = "emit")
        /* renamed from: u6.u$a$a */
        /* loaded from: classes.dex */
        public static final class C0515a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f28622d;

            /* renamed from: e */
            public int f28623e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0515a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f28622d = obj;
                this.f28623e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(sm.g gVar, mm.f fVar, mm.f fVar2) {
            this.f28619a = gVar;
            this.f28620b = fVar;
            this.f28621c = fVar2;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r7, xl.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof u6.u.a.C0515a
                if (r0 == 0) goto L13
                r0 = r8
                u6.u$a$a r0 = (u6.u.a.C0515a) r0
                int r1 = r0.f28623e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28623e = r1
                goto L18
            L13:
                u6.u$a$a r0 = new u6.u$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f28622d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f28623e
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                mf.a0.k(r8)
                goto L50
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                mf.a0.k(r8)
                sm.g r8 = r6.f28619a
                u6.o r7 = (u6.o) r7
                u6.r r2 = new u6.r
                mm.f r4 = r6.f28620b
                java.lang.Object r4 = r4.get(r7)
                mm.f r5 = r6.f28621c
                java.lang.Object r7 = r5.get(r7)
                r2.<init>(r4, r7)
                r0.f28623e = r3
                java.lang.Object r7 = r8.n(r2, r0)
                if (r7 != r1) goto L50
                return r1
            L50:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.u.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public u(s0 s0Var, mm.f fVar, mm.f fVar2) {
        this.f28616a = s0Var;
        this.f28617b = fVar;
        this.f28618c = fVar2;
    }

    @Override // sm.f
    public final Object a(sm.g<? super r<Object, Object>> gVar, xl.d dVar) {
        Object a10 = this.f28616a.a(new a(gVar, this.f28617b, this.f28618c), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
