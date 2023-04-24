package sm;

/* loaded from: classes2.dex */
public final class o implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ fm.p f27269a;

    /* renamed from: b */
    public final /* synthetic */ f f27270b;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {116, 120}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f27271d;

        /* renamed from: e */
        public int f27272e;

        /* renamed from: g */
        public o f27274g;

        /* renamed from: h */
        public g f27275h;

        /* renamed from: i */
        public tm.r f27276i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            o.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27271d = obj;
            this.f27272e |= Integer.MIN_VALUE;
            return o.this.a(null, this);
        }
    }

    public o(fm.p pVar, f fVar) {
        this.f27269a = pVar;
        this.f27270b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0073 A[RETURN] */
    @Override // sm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(sm.g<? super java.lang.Object> r7, xl.d<? super tl.l> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof sm.o.a
            if (r0 == 0) goto L13
            r0 = r8
            sm.o$a r0 = (sm.o.a) r0
            int r1 = r0.f27272e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27272e = r1
            goto L18
        L13:
            sm.o$a r0 = new sm.o$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27271d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27272e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            mf.a0.k(r8)
            goto L74
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            tm.r r7 = r0.f27276i
            sm.g r2 = r0.f27275h
            sm.o r4 = r0.f27274g
            mf.a0.k(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5f
        L3c:
            r8 = move-exception
            goto L7b
        L3e:
            mf.a0.k(r8)
            tm.r r8 = new tm.r
            xl.f r2 = r0.f32509b
            gm.l.c(r2)
            r8.<init>(r7, r2)
            fm.p r2 = r6.f27269a     // Catch: java.lang.Throwable -> L77
            r0.f27274g = r6     // Catch: java.lang.Throwable -> L77
            r0.f27275h = r7     // Catch: java.lang.Throwable -> L77
            r0.f27276i = r8     // Catch: java.lang.Throwable -> L77
            r0.f27272e = r4     // Catch: java.lang.Throwable -> L77
            java.lang.Object r2 = r2.A(r8, r0)     // Catch: java.lang.Throwable -> L77
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r4 = r6
            r2 = r7
            r7 = r8
        L5f:
            r7.u()
            sm.f r7 = r4.f27270b
            r8 = 0
            r0.f27274g = r8
            r0.f27275h = r8
            r0.f27276i = r8
            r0.f27272e = r3
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            tl.l r7 = tl.l.f28297a
            return r7
        L77:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L7b:
            r7.u()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.o.a(sm.g, xl.d):java.lang.Object");
    }
}
