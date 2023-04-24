package sm;

/* loaded from: classes2.dex */
public final class s<T> implements g {

    /* renamed from: a */
    public final /* synthetic */ g<T> f27292a;

    /* renamed from: b */
    public final /* synthetic */ gm.a0<Throwable> f27293b;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public s f27294d;

        /* renamed from: e */
        public /* synthetic */ Object f27295e;

        /* renamed from: f */
        public final /* synthetic */ s<T> f27296f;

        /* renamed from: g */
        public int f27297g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(s<? super T> sVar, xl.d<? super a> dVar) {
            super(dVar);
            this.f27296f = sVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27295e = obj;
            this.f27297g |= Integer.MIN_VALUE;
            return this.f27296f.n(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(g<? super T> gVar, gm.a0<Throwable> a0Var) {
        this.f27292a = gVar;
        this.f27293b = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0033  */
    @Override // sm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(T r5, xl.d<? super tl.l> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sm.s.a
            if (r0 == 0) goto L13
            r0 = r6
            sm.s$a r0 = (sm.s.a) r0
            int r1 = r0.f27297g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27297g = r1
            goto L18
        L13:
            sm.s$a r0 = new sm.s$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f27295e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27297g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            sm.s r5 = r0.f27294d
            mf.a0.k(r6)     // Catch: java.lang.Throwable -> L29
            goto L43
        L29:
            r6 = move-exception
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            mf.a0.k(r6)
            sm.g<T> r6 = r4.f27292a     // Catch: java.lang.Throwable -> L46
            r0.f27294d = r4     // Catch: java.lang.Throwable -> L46
            r0.f27297g = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r6.n(r5, r0)     // Catch: java.lang.Throwable -> L46
            if (r5 != r1) goto L43
            return r1
        L43:
            tl.l r5 = tl.l.f28297a
            return r5
        L46:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L49:
            gm.a0<java.lang.Throwable> r5 = r5.f27293b
            r5.f15485a = r6
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.s.n(java.lang.Object, xl.d):java.lang.Object");
    }
}
