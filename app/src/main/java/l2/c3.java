package l2;

/* loaded from: classes.dex */
public final class c3<T> implements z2<T>, pm.e0, rm.z<T> {

    /* renamed from: a */
    public final rm.z<T> f18785a;

    /* renamed from: b */
    public final /* synthetic */ pm.e0 f18786b;

    public c3(pm.e0 e0Var, rm.g gVar) {
        gm.l.f(e0Var, "scope");
        gm.l.f(gVar, "channel");
        this.f18785a = gVar;
        this.f18786b = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0031  */
    /* JADX WARN: Type inference failed for: r5v4, types: [fm.a] */
    @Override // l2.z2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(l2.h1.b.c r5, xl.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof l2.a3
            if (r0 == 0) goto L13
            r0 = r6
            l2.a3 r0 = (l2.a3) r0
            int r1 = r0.f18718h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18718h = r1
            goto L18
        L13:
            l2.a3 r0 = new l2.a3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18716f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f18718h
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fm.a r5 = r0.f18714d
            mf.a0.k(r6)     // Catch: java.lang.Throwable -> L75
            goto L63
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            mf.a0.k(r6)
            xl.f r6 = r4.E()     // Catch: java.lang.Throwable -> L75
            pm.g1$b r2 = pm.g1.b.f24341a     // Catch: java.lang.Throwable -> L75
            xl.f$b r6 = r6.b(r2)     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L69
            pm.g1 r6 = (pm.g1) r6     // Catch: java.lang.Throwable -> L75
            r0.f18714d = r5     // Catch: java.lang.Throwable -> L75
            r0.f18715e = r6     // Catch: java.lang.Throwable -> L75
            r0.f18718h = r3     // Catch: java.lang.Throwable -> L75
            pm.j r2 = new pm.j     // Catch: java.lang.Throwable -> L75
            xl.d r0 = mf.a0.i(r0)     // Catch: java.lang.Throwable -> L75
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L75
            r2.u()     // Catch: java.lang.Throwable -> L75
            l2.b3 r0 = new l2.b3     // Catch: java.lang.Throwable -> L75
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L75
            r6.k(r0)     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = r2.t()     // Catch: java.lang.Throwable -> L75
            if (r6 != r1) goto L63
            return r1
        L63:
            r5.m()
            tl.l r5 = tl.l.f28297a
            return r5
        L69:
            java.lang.String r6 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L75
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L75:
            r6 = move-exception
            r5.m()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.c3.D(l2.h1$b$c, xl.d):java.lang.Object");
    }

    @Override // pm.e0
    public final xl.f E() {
        return this.f18786b.E();
    }

    @Override // rm.z
    public final Object d(T t10, xl.d<? super tl.l> dVar) {
        return this.f18785a.d(t10, dVar);
    }

    @Override // rm.z
    public final boolean o(Throwable th2) {
        return this.f18785a.o(th2);
    }

    @Override // rm.z
    public final Object p(T t10) {
        return this.f18785a.p(t10);
    }
}
