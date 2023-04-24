package sm;

/* loaded from: classes2.dex */
public final class w<T> implements g {

    /* renamed from: a */
    public final /* synthetic */ gm.x f27313a;

    /* renamed from: b */
    public final /* synthetic */ g<T> f27314b;

    /* renamed from: c */
    public final /* synthetic */ fm.p<T, xl.d<? super Boolean>, Object> f27315c;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public w f27316d;

        /* renamed from: e */
        public Object f27317e;

        /* renamed from: f */
        public /* synthetic */ Object f27318f;

        /* renamed from: g */
        public final /* synthetic */ w<T> f27319g;

        /* renamed from: h */
        public int f27320h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(w<? super T> wVar, xl.d<? super a> dVar) {
            super(dVar);
            this.f27319g = wVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27318f = obj;
            this.f27320h |= Integer.MIN_VALUE;
            return this.f27319g.n(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(gm.x xVar, g<? super T> gVar, fm.p<? super T, ? super xl.d<? super Boolean>, ? extends Object> pVar) {
        this.f27313a = xVar;
        this.f27314b = gVar;
        this.f27315c = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0087  */
    @Override // sm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(T r7, xl.d<? super tl.l> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof sm.w.a
            if (r0 == 0) goto L13
            r0 = r8
            sm.w$a r0 = (sm.w.a) r0
            int r1 = r0.f27320h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27320h = r1
            goto L18
        L13:
            sm.w$a r0 = new sm.w$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f27318f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27320h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            mf.a0.k(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f27317e
            sm.w r2 = r0.f27316d
            mf.a0.k(r8)
            goto L68
        L3d:
            mf.a0.k(r8)
            goto L55
        L41:
            mf.a0.k(r8)
            gm.x r8 = r6.f27313a
            boolean r8 = r8.f15506a
            if (r8 == 0) goto L58
            sm.g<T> r8 = r6.f27314b
            r0.f27320h = r5
            java.lang.Object r7 = r8.n(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            tl.l r7 = tl.l.f28297a
            return r7
        L58:
            fm.p<T, xl.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f27315c
            r0.f27316d = r6
            r0.f27317e = r7
            r0.f27320h = r4
            java.lang.Object r8 = r8.A(r7, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r2 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            gm.x r8 = r2.f27313a
            r8.f15506a = r5
            sm.g<T> r8 = r2.f27314b
            r2 = 0
            r0.f27316d = r2
            r0.f27317e = r2
            r0.f27320h = r3
            java.lang.Object r7 = r8.n(r7, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            tl.l r7 = tl.l.f28297a
            return r7
        L87:
            tl.l r7 = tl.l.f28297a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.w.n(java.lang.Object, xl.d):java.lang.Object");
    }
}
