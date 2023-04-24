package jh;

@zl.e(c = "com.topstep.fitcloud.pro.ui.auth.AuthCodeViewModel$startCountDown$1", f = "AuthCodeViewModel.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f17763e;

    /* renamed from: f */
    public int f17764f;

    /* renamed from: g */
    public c f17765g;

    /* renamed from: h */
    public int f17766h;

    /* renamed from: i */
    public final /* synthetic */ c f17767i;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<b, b> {

        /* renamed from: b */
        public static final a f17768b = new a();

        public a() {
            super(1);
        }

        @Override // fm.l
        public final b k(b bVar) {
            b bVar2 = bVar;
            gm.l.f(bVar2, "$this$setState");
            return b.copy$default(bVar2, null, null, bVar2.f17740c - 1, 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f17767i = cVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new d(this.f17767i, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0036 -> B:29:0x0039). Please submit an issue!!! */
    @Override // zl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(java.lang.Object r8) {
        /*
            r7 = this;
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            int r1 = r7.f17766h
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            int r1 = r7.f17764f
            int r3 = r7.f17763e
            jh.c r4 = r7.f17765g
            mf.a0.k(r8)
            r8 = r7
            goto L39
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            mf.a0.k(r8)
            jh.c r8 = r7.f17767i
            r1 = 0
            r3 = 60
            r4 = r8
            r8 = r7
        L26:
            if (r1 >= r3) goto L47
            r5 = 1000(0x3e8, double:4.94E-321)
            r8.f17765g = r4
            r8.f17763e = r3
            r8.f17764f = r1
            r8.f17766h = r2
            java.lang.Object r5 = mf.a0.g(r5, r8)
            if (r5 != r0) goto L39
            return r0
        L39:
            jh.d$a r5 = jh.d.a.f17768b
            int r6 = jh.c.f17742h
            y3.k0<S>$b r6 = r4.f30971c
            r6.getClass()
            r6.a(r5)
            int r1 = r1 + r2
            goto L26
        L47:
            tl.l r8 = tl.l.f28297a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.d.t(java.lang.Object):java.lang.Object");
    }
}
