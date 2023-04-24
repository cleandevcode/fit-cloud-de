package sm;

@zl.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f27191e;

    /* renamed from: f */
    public final /* synthetic */ b1 f27192f;

    /* renamed from: g */
    public final /* synthetic */ f<Object> f27193g;

    /* renamed from: h */
    public final /* synthetic */ q0<Object> f27194h;

    /* renamed from: i */
    public final /* synthetic */ Object f27195i;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<Integer, xl.d<? super Boolean>, Object> {

        /* renamed from: e */
        public /* synthetic */ int f27196e;

        public a(xl.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // fm.p
        public final Object A(Integer num, xl.d<? super Boolean> dVar) {
            return ((a) p(Integer.valueOf(num.intValue()), dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f27196e = ((Number) obj).intValue();
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            return Boolean.valueOf(this.f27196e > 0);
        }
    }

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<z0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f27197e;

        /* renamed from: f */
        public /* synthetic */ Object f27198f;

        /* renamed from: g */
        public final /* synthetic */ f<Object> f27199g;

        /* renamed from: h */
        public final /* synthetic */ q0<Object> f27200h;

        /* renamed from: i */
        public final /* synthetic */ Object f27201i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f<Object> fVar, q0<Object> q0Var, Object obj, xl.d<? super b> dVar) {
            super(2, dVar);
            this.f27199g = fVar;
            this.f27200h = q0Var;
            this.f27201i = obj;
        }

        @Override // fm.p
        public final Object A(z0 z0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(z0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(this.f27199g, this.f27200h, this.f27201i, dVar);
            bVar.f27198f = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f27197e;
            if (i10 == 0) {
                mf.a0.k(obj);
                int ordinal = ((z0) this.f27198f).ordinal();
                if (ordinal == 0) {
                    f<Object> fVar = this.f27199g;
                    q0<Object> q0Var = this.f27200h;
                    this.f27197e = 1;
                    if (fVar.a(q0Var, this) == aVar) {
                        return aVar;
                    }
                } else if (ordinal == 2) {
                    Object obj2 = this.f27201i;
                    if (obj2 == qi.h.f24862a) {
                        this.f27200h.c();
                    } else {
                        this.f27200h.d(obj2);
                    }
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(b1 b1Var, f<Object> fVar, q0<Object> q0Var, Object obj, xl.d<? super h0> dVar) {
        super(2, dVar);
        this.f27192f = b1Var;
        this.f27193g = fVar;
        this.f27194h = q0Var;
        this.f27195i = obj;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((h0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new h0(this.f27192f, this.f27193g, this.f27194h, this.f27195i, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005e A[RETURN] */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r8) {
        /*
            r7 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r7.f27191e
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L13
            goto L1f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            mf.a0.k(r8)
            goto L52
        L1f:
            mf.a0.k(r8)
            goto L81
        L23:
            mf.a0.k(r8)
            sm.b1 r8 = r7.f27192f
            sm.c1 r1 = sm.b1.a.f27123a
            if (r8 != r1) goto L39
            sm.f<java.lang.Object> r8 = r7.f27193g
            sm.q0<java.lang.Object> r1 = r7.f27194h
            r7.f27191e = r5
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L81
            return r0
        L39:
            sm.d1 r1 = sm.b1.a.f27124b
            r5 = 0
            if (r8 != r1) goto L5f
            sm.q0<java.lang.Object> r8 = r7.f27194h
            tm.w r8 = r8.o()
            sm.h0$a r1 = new sm.h0$a
            r1.<init>(r5)
            r7.f27191e = r4
            java.lang.Object r8 = bi.r.x(r8, r1, r7)
            if (r8 != r0) goto L52
            return r0
        L52:
            sm.f<java.lang.Object> r8 = r7.f27193g
            sm.q0<java.lang.Object> r1 = r7.f27194h
            r7.f27191e = r3
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L81
            return r0
        L5f:
            sm.q0<java.lang.Object> r1 = r7.f27194h
            tm.w r1 = r1.o()
            sm.f r8 = r8.a(r1)
            sm.f r8 = bi.r.t(r8)
            sm.h0$b r1 = new sm.h0$b
            sm.f<java.lang.Object> r3 = r7.f27193g
            sm.q0<java.lang.Object> r4 = r7.f27194h
            java.lang.Object r6 = r7.f27195i
            r1.<init>(r3, r4, r6, r5)
            r7.f27191e = r2
            java.lang.Object r8 = bi.r.o(r8, r1, r7)
            if (r8 != r0) goto L81
            return r0
        L81:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.h0.t(java.lang.Object):java.lang.Object");
    }
}
