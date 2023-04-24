package sm;

/* loaded from: classes2.dex */
public final class b<T> extends d<T> {

    /* renamed from: e */
    public final fm.p<rm.t<? super T>, xl.d<? super tl.l>, Object> f27117e;

    @zl.e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {336}, m = "collectTo")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public rm.t f27118d;

        /* renamed from: e */
        public /* synthetic */ Object f27119e;

        /* renamed from: f */
        public final /* synthetic */ b<T> f27120f;

        /* renamed from: g */
        public int f27121g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar, xl.d<? super a> dVar) {
            super(dVar);
            this.f27120f = bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27119e = obj;
            this.f27121g |= Integer.MIN_VALUE;
            return this.f27120f.f(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(fm.p<? super rm.t<? super T>, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.f fVar, int i10, rm.f fVar2) {
        super(pVar, fVar, i10, fVar2);
        this.f27117e = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004f  */
    @Override // tm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(rm.t<? super T> r5, xl.d<? super tl.l> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sm.b.a
            if (r0 == 0) goto L13
            r0 = r6
            sm.b$a r0 = (sm.b.a) r0
            int r1 = r0.f27121g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27121g = r1
            goto L18
        L13:
            sm.b$a r0 = new sm.b$a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f27119e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27121g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            rm.t r5 = r0.f27118d
            mf.a0.k(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            mf.a0.k(r6)
            r0.f27118d = r5
            r0.f27121g = r3
            fm.p<rm.t<? super T>, xl.d<? super tl.l>, java.lang.Object> r6 = r4.f27135d
            java.lang.Object r6 = r6.A(r5, r0)
            if (r6 != r1) goto L41
            goto L43
        L41:
            tl.l r6 = tl.l.f28297a
        L43:
            if (r6 != r1) goto L46
            return r1
        L46:
            boolean r5 = r5.u()
            if (r5 == 0) goto L4f
            tl.l r5 = tl.l.f28297a
            return r5
        L4f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.b.f(rm.t, xl.d):java.lang.Object");
    }

    @Override // tm.f
    public final tm.f<T> g(xl.f fVar, int i10, rm.f fVar2) {
        return new b(this.f27117e, fVar, i10, fVar2);
    }
}
