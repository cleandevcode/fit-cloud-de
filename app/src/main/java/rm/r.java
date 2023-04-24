package rm;

/* loaded from: classes2.dex */
public final class r {

    @zl.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public t f25859d;

        /* renamed from: e */
        public fm.a f25860e;

        /* renamed from: f */
        public /* synthetic */ Object f25861f;

        /* renamed from: g */
        public int f25862g;

        public a(xl.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f25861f = obj;
            this.f25862g |= Integer.MIN_VALUE;
            return r.a(null, null, this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ pm.i<tl.l> f25863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pm.j jVar) {
            super(1);
            this.f25863b = jVar;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            pm.i<tl.l> iVar = this.f25863b;
            tl.l lVar = tl.l.f28297a;
            iVar.l(lVar);
            return lVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(rm.t<?> r4, fm.a<tl.l> r5, xl.d<? super tl.l> r6) {
        /*
            boolean r0 = r6 instanceof rm.r.a
            if (r0 == 0) goto L13
            r0 = r6
            rm.r$a r0 = (rm.r.a) r0
            int r1 = r0.f25862g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25862g = r1
            goto L18
        L13:
            rm.r$a r0 = new rm.r$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25861f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f25862g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fm.a r5 = r0.f25860e
            mf.a0.k(r6)     // Catch: java.lang.Throwable -> L6d
            goto L67
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            mf.a0.k(r6)
            xl.f r6 = r0.f32509b
            gm.l.c(r6)
            pm.g1$b r2 = pm.g1.b.f24341a
            xl.f$b r6 = r6.b(r2)
            if (r6 != r4) goto L43
            r6 = 1
            goto L44
        L43:
            r6 = 0
        L44:
            if (r6 == 0) goto L72
            r0.f25859d = r4     // Catch: java.lang.Throwable -> L6d
            r0.f25860e = r5     // Catch: java.lang.Throwable -> L6d
            r0.f25862g = r3     // Catch: java.lang.Throwable -> L6d
            pm.j r6 = new pm.j     // Catch: java.lang.Throwable -> L6d
            xl.d r0 = mf.a0.i(r0)     // Catch: java.lang.Throwable -> L6d
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L6d
            r6.u()     // Catch: java.lang.Throwable -> L6d
            rm.r$b r0 = new rm.r$b     // Catch: java.lang.Throwable -> L6d
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L6d
            r4.n(r0)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r4 = r6.t()     // Catch: java.lang.Throwable -> L6d
            if (r4 != r1) goto L67
            return r1
        L67:
            r5.m()
            tl.l r4 = tl.l.f28297a
            return r4
        L6d:
            r4 = move-exception
            r5.m()
            throw r4
        L72:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.r.a(rm.t, fm.a, xl.d):java.lang.Object");
    }
}
