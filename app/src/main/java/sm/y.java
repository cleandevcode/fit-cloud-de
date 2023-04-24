package sm;

/* loaded from: classes2.dex */
public final class y implements g<Object> {

    /* renamed from: a */
    public final /* synthetic */ fm.p f27346a;

    /* renamed from: b */
    public final /* synthetic */ g f27347b;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", f = "Limit.kt", l = {142, 143}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public y f27348d;

        /* renamed from: e */
        public /* synthetic */ Object f27349e;

        /* renamed from: f */
        public int f27350f;

        /* renamed from: h */
        public Object f27352h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            y.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27349e = obj;
            this.f27350f |= Integer.MIN_VALUE;
            return y.this.n(null, this);
        }
    }

    public y(fm.p pVar, g gVar) {
        this.f27346a = pVar;
        this.f27347b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0073  */
    @Override // sm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r8, xl.d<? super tl.l> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof sm.y.a
            if (r0 == 0) goto L13
            r0 = r9
            sm.y$a r0 = (sm.y.a) r0
            int r1 = r0.f27350f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27350f = r1
            goto L18
        L13:
            sm.y$a r0 = new sm.y$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27349e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27350f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            sm.y r8 = r0.f27348d
            mf.a0.k(r9)
            goto L6e
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.f27352h
            sm.y r2 = r0.f27348d
            mf.a0.k(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L55
        L40:
            mf.a0.k(r9)
            fm.p r9 = r7.f27346a
            r0.f27348d = r7
            r0.f27352h = r8
            r0.f27350f = r4
            java.lang.Object r9 = r9.A(r8, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            r2 = r9
            r9 = r8
            r8 = r7
        L55:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6d
            sm.g r2 = r8.f27347b
            r0.f27348d = r8
            r5 = 0
            r0.f27352h = r5
            r0.f27350f = r3
            java.lang.Object r9 = r2.n(r9, r0)
            if (r9 != r1) goto L6e
            return r1
        L6d:
            r4 = 0
        L6e:
            if (r4 == 0) goto L73
            tl.l r8 = tl.l.f28297a
            return r8
        L73:
            tm.a r9 = new tm.a
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.y.n(java.lang.Object, xl.d):java.lang.Object");
    }
}
