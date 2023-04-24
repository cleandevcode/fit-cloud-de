package sm;

/* loaded from: classes2.dex */
public final class u<T> implements g {

    /* renamed from: a */
    public final /* synthetic */ gm.z f27304a;

    /* renamed from: b */
    public final /* synthetic */ int f27305b;

    /* renamed from: c */
    public final /* synthetic */ g<T> f27306c;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {25}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f27307d;

        /* renamed from: e */
        public final /* synthetic */ u<T> f27308e;

        /* renamed from: f */
        public int f27309f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(u<? super T> uVar, xl.d<? super a> dVar) {
            super(dVar);
            this.f27308e = uVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27307d = obj;
            this.f27309f |= Integer.MIN_VALUE;
            return this.f27308e.n(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(gm.z zVar, int i10, g<? super T> gVar) {
        this.f27304a = zVar;
        this.f27305b = i10;
        this.f27306c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    @Override // sm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(T r6, xl.d<? super tl.l> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sm.u.a
            if (r0 == 0) goto L13
            r0 = r7
            sm.u$a r0 = (sm.u.a) r0
            int r1 = r0.f27309f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27309f = r1
            goto L18
        L13:
            sm.u$a r0 = new sm.u$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f27307d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27309f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            mf.a0.k(r7)
            gm.z r7 = r5.f27304a
            int r2 = r7.f15508a
            int r4 = r5.f27305b
            if (r2 < r4) goto L48
            sm.g<T> r7 = r5.f27306c
            r0.f27309f = r3
            java.lang.Object r6 = r7.n(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            tl.l r6 = tl.l.f28297a
            return r6
        L48:
            int r2 = r2 + r3
            r7.f15508a = r2
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.u.n(java.lang.Object, xl.d):java.lang.Object");
    }
}
