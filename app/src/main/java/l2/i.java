package l2;

@zl.e(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f18963e;

    /* renamed from: f */
    public final /* synthetic */ sm.f<b1<Object>> f18964f;

    /* renamed from: g */
    public final /* synthetic */ l<Object> f18965g;

    /* loaded from: classes.dex */
    public static final class a implements sm.g<ul.v<? extends b1<Object>>> {

        /* renamed from: a */
        public final /* synthetic */ l f18966a;

        @zl.e(c = "androidx.paging.CachedPageEventFlow$job$1$invokeSuspend$$inlined$collect$1", f = "CachedPageEventFlow.kt", l = {135, 136}, m = "emit")
        /* renamed from: l2.i$a$a */
        /* loaded from: classes.dex */
        public static final class C0333a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f18967d;

            /* renamed from: e */
            public int f18968e;

            /* renamed from: g */
            public a f18970g;

            /* renamed from: h */
            public ul.v f18971h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0333a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f18967d = obj;
                this.f18968e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(l lVar) {
            this.f18966a = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0062 A[RETURN] */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(ul.v<? extends l2.b1<java.lang.Object>> r6, xl.d<? super tl.l> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof l2.i.a.C0333a
                if (r0 == 0) goto L13
                r0 = r7
                l2.i$a$a r0 = (l2.i.a.C0333a) r0
                int r1 = r0.f18968e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18968e = r1
                goto L18
            L13:
                l2.i$a$a r0 = new l2.i$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f18967d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f18968e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                mf.a0.k(r7)
                goto L63
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                ul.v r6 = r0.f18971h
                l2.i$a r2 = r0.f18970g
                mf.a0.k(r7)
                goto L51
            L3a:
                mf.a0.k(r7)
                ul.v r6 = (ul.v) r6
                l2.l r7 = r5.f18966a
                sm.w0 r7 = r7.f19062b
                r0.f18970g = r5
                r0.f18971h = r6
                r0.f18968e = r4
                java.lang.Object r7 = r7.n(r6, r0)
                if (r7 != r1) goto L50
                return r1
            L50:
                r2 = r5
            L51:
                l2.l r7 = r2.f18966a
                l2.b0<T> r7 = r7.f19061a
                r2 = 0
                r0.f18970g = r2
                r0.f18971h = r2
                r0.f18968e = r3
                java.lang.Object r6 = r7.b(r6, r0)
                if (r6 != r1) goto L63
                return r1
            L63:
                tl.l r6 = tl.l.f28297a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.i.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(sm.f<? extends b1<Object>> fVar, l<Object> lVar, xl.d<? super i> dVar) {
        super(2, dVar);
        this.f18964f = fVar;
        this.f18965g = lVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((i) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new i(this.f18964f, this.f18965g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object obj2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f18963e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            sm.f<b1<Object>> fVar = this.f18964f;
            a aVar = new a(this.f18965g);
            this.f18963e = 1;
            Object a10 = fVar.a(new sm.l0(new gm.z(), aVar), this);
            if (a10 != obj2) {
                a10 = tl.l.f28297a;
            }
            if (a10 == obj2) {
                return obj2;
            }
        }
        return tl.l.f28297a;
    }
}
