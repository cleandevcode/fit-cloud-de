package sm;

/* loaded from: classes2.dex */
public final class q implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ f f27282a;

    /* renamed from: b */
    public final /* synthetic */ fm.q f27283b;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f27284d;

        /* renamed from: e */
        public int f27285e;

        /* renamed from: g */
        public q f27287g;

        /* renamed from: h */
        public g f27288h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            q.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27284d = obj;
            this.f27285e |= Integer.MIN_VALUE;
            return q.this.a(null, this);
        }
    }

    public q(f fVar, fm.q qVar) {
        this.f27282a = fVar;
        this.f27283b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    @Override // sm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(sm.g<? super java.lang.Object> r6, xl.d<? super tl.l> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sm.q.a
            if (r0 == 0) goto L13
            r0 = r7
            sm.q$a r0 = (sm.q.a) r0
            int r1 = r0.f27285e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27285e = r1
            goto L18
        L13:
            sm.q$a r0 = new sm.q$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27284d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27285e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            sm.g r6 = r0.f27288h
            sm.q r2 = r0.f27287g
            mf.a0.k(r7)
            goto L4d
        L3a:
            mf.a0.k(r7)
            sm.f r7 = r5.f27282a
            r0.f27287g = r5
            r0.f27288h = r6
            r0.f27285e = r4
            java.io.Serializable r7 = bi.r.n(r0, r7, r6)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L61
            fm.q r2 = r2.f27283b
            r4 = 0
            r0.f27287g = r4
            r0.f27288h = r4
            r0.f27285e = r3
            java.lang.Object r6 = r2.j(r6, r7, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.q.a(sm.g, xl.d):java.lang.Object");
    }
}
