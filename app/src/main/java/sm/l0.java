package sm;

/* loaded from: classes2.dex */
public final class l0<T> implements g {

    /* renamed from: a */
    public final /* synthetic */ g<ul.v<? extends T>> f27245a;

    /* renamed from: b */
    public final /* synthetic */ gm.z f27246b;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", l = {65}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f27247d;

        /* renamed from: e */
        public final /* synthetic */ l0<T> f27248e;

        /* renamed from: f */
        public int f27249f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l0<? super T> l0Var, xl.d<? super a> dVar) {
            super(dVar);
            this.f27248e = l0Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27247d = obj;
            this.f27249f |= Integer.MIN_VALUE;
            return this.f27248e.n(null, this);
        }
    }

    public l0(gm.z zVar, g gVar) {
        this.f27245a = gVar;
        this.f27246b = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    @Override // sm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(T r8, xl.d<? super tl.l> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof sm.l0.a
            if (r0 == 0) goto L13
            r0 = r9
            sm.l0$a r0 = (sm.l0.a) r0
            int r1 = r0.f27249f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27249f = r1
            goto L18
        L13:
            sm.l0$a r0 = new sm.l0$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f27247d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27249f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r9)
            goto L4c
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            mf.a0.k(r9)
            sm.g<ul.v<? extends T>> r9 = r7.f27245a
            ul.v r2 = new ul.v
            gm.z r4 = r7.f27246b
            int r5 = r4.f15508a
            int r6 = r5 + 1
            r4.f15508a = r6
            if (r5 < 0) goto L4f
            r2.<init>(r5, r8)
            r0.f27249f = r3
            java.lang.Object r8 = r9.n(r2, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            tl.l r8 = tl.l.f28297a
            return r8
        L4f:
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            java.lang.String r9 = "Index overflow has happened"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.l0.n(java.lang.Object, xl.d):java.lang.Object");
    }
}
