package sm;

/* loaded from: classes2.dex */
public final class n implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ f f27259a;

    /* renamed from: b */
    public final /* synthetic */ fm.q f27260b;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {114, 121, 128}, m = "collect")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f27261d;

        /* renamed from: e */
        public int f27262e;

        /* renamed from: g */
        public Object f27264g;

        /* renamed from: h */
        public g f27265h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            n.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27261d = obj;
            this.f27262e |= Integer.MIN_VALUE;
            return n.this.a(null, this);
        }
    }

    public n(f fVar, fm.q qVar) {
        this.f27259a = fVar;
        this.f27260b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x007c  */
    @Override // sm.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(sm.g<? super java.lang.Object> r9, xl.d<? super tl.l> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof sm.n.a
            if (r0 == 0) goto L13
            r0 = r10
            sm.n$a r0 = (sm.n.a) r0
            int r1 = r0.f27262e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27262e = r1
            goto L18
        L13:
            sm.n$a r0 = new sm.n$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27261d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27262e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f27264g
            tm.r r9 = (tm.r) r9
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r10 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f27264g
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            mf.a0.k(r10)
            goto La1
        L44:
            sm.g r9 = r0.f27265h
            java.lang.Object r2 = r0.f27264g
            sm.n r2 = (sm.n) r2
            mf.a0.k(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8d
        L50:
            mf.a0.k(r10)
            sm.f r10 = r8.f27259a     // Catch: java.lang.Throwable -> L8b
            r0.f27264g = r8     // Catch: java.lang.Throwable -> L8b
            r0.f27265h = r9     // Catch: java.lang.Throwable -> L8b
            r0.f27262e = r5     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L8b
            if (r10 != r1) goto L62
            return r1
        L62:
            r2 = r8
        L63:
            tm.r r10 = new tm.r
            xl.f r4 = r0.f32509b
            gm.l.c(r4)
            r10.<init>(r9, r4)
            fm.q r9 = r2.f27260b     // Catch: java.lang.Throwable -> L83
            r0.f27264g = r10     // Catch: java.lang.Throwable -> L83
            r0.f27265h = r6     // Catch: java.lang.Throwable -> L83
            r0.f27262e = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r9.j(r10, r6, r0)     // Catch: java.lang.Throwable -> L83
            if (r9 != r1) goto L7c
            return r1
        L7c:
            r9 = r10
        L7d:
            r9.u()
            tl.l r9 = tl.l.f28297a
            return r9
        L83:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L87:
            r9.u()
            throw r10
        L8b:
            r9 = move-exception
            r2 = r8
        L8d:
            sm.k1 r10 = new sm.k1
            r10.<init>(r9)
            fm.q r2 = r2.f27260b
            r0.f27264g = r9
            r0.f27265h = r6
            r0.f27262e = r4
            java.lang.Object r10 = sm.p.a(r10, r2, r9, r0)
            if (r10 != r1) goto La1
            return r1
        La1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.n.a(sm.g, xl.d):java.lang.Object");
    }
}
