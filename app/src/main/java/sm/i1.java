package sm;

/* loaded from: classes2.dex */
public final class i1<T> implements g<T> {

    /* renamed from: a */
    public final g<T> f27211a;

    /* renamed from: b */
    public final fm.p<g<? super T>, xl.d<? super tl.l>, Object> f27212b;

    @zl.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public i1 f27213d;

        /* renamed from: e */
        public tm.r f27214e;

        /* renamed from: f */
        public /* synthetic */ Object f27215f;

        /* renamed from: g */
        public final /* synthetic */ i1<T> f27216g;

        /* renamed from: h */
        public int f27217h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i1<T> i1Var, xl.d<? super a> dVar) {
            super(dVar);
            this.f27216g = i1Var;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27215f = obj;
            this.f27217h |= Integer.MIN_VALUE;
            return this.f27216g.a(this);
        }
    }

    public i1(fm.p pVar, g gVar) {
        this.f27211a = gVar;
        this.f27212b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0075  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [tm.r] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(xl.d<? super tl.l> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof sm.i1.a
            if (r0 == 0) goto L13
            r0 = r7
            sm.i1$a r0 = (sm.i1.a) r0
            int r1 = r0.f27217h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27217h = r1
            goto L18
        L13:
            sm.i1$a r0 = new sm.i1$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f27215f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27217h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r7)
            goto L72
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            tm.r r2 = r0.f27214e
            sm.i1 r4 = r0.f27213d
            mf.a0.k(r7)     // Catch: java.lang.Throwable -> L78
            goto L59
        L3a:
            mf.a0.k(r7)
            tm.r r2 = new tm.r
            sm.g<T> r7 = r6.f27211a
            xl.f r5 = r0.f32509b
            gm.l.c(r5)
            r2.<init>(r7, r5)
            fm.p<sm.g<? super T>, xl.d<? super tl.l>, java.lang.Object> r7 = r6.f27212b     // Catch: java.lang.Throwable -> L78
            r0.f27213d = r6     // Catch: java.lang.Throwable -> L78
            r0.f27214e = r2     // Catch: java.lang.Throwable -> L78
            r0.f27217h = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r7 = r7.A(r2, r0)     // Catch: java.lang.Throwable -> L78
            if (r7 != r1) goto L58
            return r1
        L58:
            r4 = r6
        L59:
            r2.u()
            sm.g<T> r7 = r4.f27211a
            boolean r2 = r7 instanceof sm.i1
            if (r2 == 0) goto L75
            sm.i1 r7 = (sm.i1) r7
            r2 = 0
            r0.f27213d = r2
            r0.f27214e = r2
            r0.f27217h = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            tl.l r7 = tl.l.f28297a
            return r7
        L75:
            tl.l r7 = tl.l.f28297a
            return r7
        L78:
            r7 = move-exception
            r2.u()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.i1.a(xl.d):java.lang.Object");
    }

    @Override // sm.g
    public final Object n(T t10, xl.d<? super tl.l> dVar) {
        return this.f27211a.n(t10, dVar);
    }
}
