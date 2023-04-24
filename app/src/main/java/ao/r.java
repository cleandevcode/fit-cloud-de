package ao;

/* loaded from: classes2.dex */
public final class r {

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ xl.d f3840a;

        /* renamed from: b */
        public final /* synthetic */ Exception f3841b;

        public a(Exception exc, b bVar) {
            this.f3840a = bVar;
            this.f3841b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mf.a0.i(this.f3840a).l(mf.a0.f(this.f3841b));
        }
    }

    @zl.e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f3842d;

        /* renamed from: e */
        public int f3843e;

        public b(xl.d dVar) {
            super(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f3842d = obj;
            this.f3843e |= Integer.MIN_VALUE;
            return r.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.lang.Exception r4, xl.d<?> r5) {
        /*
            boolean r0 = r5 instanceof ao.r.b
            if (r0 == 0) goto L13
            r0 = r5
            ao.r$b r0 = (ao.r.b) r0
            int r1 = r0.f3843e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3843e = r1
            goto L18
        L13:
            ao.r$b r0 = new ao.r$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f3842d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f3843e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            mf.a0.k(r5)
            tl.l r4 = tl.l.f28297a
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            mf.a0.k(r5)
            r0.getClass()
            r0.f3843e = r3
            wm.c r5 = pm.o0.f24381a
            xl.f r2 = r0.f32509b
            gm.l.c(r2)
            ao.r$a r3 = new ao.r$a
            r3.<init>(r4, r0)
            r5.l0(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.r.a(java.lang.Exception, xl.d):java.lang.Object");
    }
}
