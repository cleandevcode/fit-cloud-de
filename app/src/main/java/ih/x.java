package ih;

/* loaded from: classes2.dex */
public final class x<T> implements sm.g {

    /* renamed from: a */
    public final /* synthetic */ sm.g f16882a;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.MainActivity$onCreate$4$2$invokeSuspend$$inlined$filter$1$2", f = "MainActivity.kt", l = {223}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f16883d;

        /* renamed from: e */
        public int f16884e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            x.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f16883d = obj;
            this.f16884e |= Integer.MIN_VALUE;
            return x.this.n(null, this);
        }
    }

    public x(sm.g gVar) {
        this.f16882a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
    @Override // sm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r6, xl.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ih.x.a
            if (r0 == 0) goto L13
            r0 = r7
            ih.x$a r0 = (ih.x.a) r0
            int r1 = r0.f16884e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16884e = r1
            goto L18
        L13:
            ih.x$a r0 = new ih.x$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f16883d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f16884e
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r7)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            mf.a0.k(r7)
            sm.g r7 = r5.f16882a
            r2 = r6
            wf.b r2 = (wf.b) r2
            wf.b r4 = wf.b.CONNECTED
            if (r2 != r4) goto L3d
            r2 = 1
            goto L3e
        L3d:
            r2 = 0
        L3e:
            if (r2 == 0) goto L49
            r0.f16884e = r3
            java.lang.Object r6 = r7.n(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            tl.l r6 = tl.l.f28297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ih.x.n(java.lang.Object, xl.d):java.lang.Object");
    }
}
