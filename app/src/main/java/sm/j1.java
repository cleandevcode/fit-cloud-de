package sm;

/* loaded from: classes2.dex */
public final class j1<T> implements v0<T> {

    /* renamed from: a */
    public final v0<T> f27228a;

    /* renamed from: b */
    public final fm.p<g<? super T>, xl.d<? super tl.l>, Object> f27229b;

    @zl.e(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {409}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f27230d;

        /* renamed from: e */
        public final /* synthetic */ j1<T> f27231e;

        /* renamed from: f */
        public int f27232f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1<T> j1Var, xl.d<? super a> dVar) {
            super(dVar);
            this.f27231e = j1Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27230d = obj;
            this.f27232f |= Integer.MIN_VALUE;
            this.f27231e.a(null, this);
            return yl.a.COROUTINE_SUSPENDED;
        }
    }

    public j1(w0 w0Var, l2.k kVar) {
        this.f27228a = w0Var;
        this.f27229b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    @Override // sm.v0, sm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(sm.g<? super T> r6, xl.d<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sm.j1.a
            if (r0 == 0) goto L13
            r0 = r7
            sm.j1$a r0 = (sm.j1.a) r0
            int r1 = r0.f27232f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27232f = r1
            goto L18
        L13:
            sm.j1$a r0 = new sm.j1$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f27230d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27232f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            mf.a0.k(r7)
            goto L44
        L2f:
            mf.a0.k(r7)
            sm.v0<T> r7 = r5.f27228a
            sm.i1 r2 = new sm.i1
            fm.p<sm.g<? super T>, xl.d<? super tl.l>, java.lang.Object> r4 = r5.f27229b
            r2.<init>(r4, r6)
            r0.f27232f = r3
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            u2.b r6 = new u2.b
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.j1.a(sm.g, xl.d):java.lang.Object");
    }
}
