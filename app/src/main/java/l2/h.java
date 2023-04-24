package l2;

@zl.e(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends zl.i implements fm.p<sm.g<? super b1<Object>>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f18904e;

    /* renamed from: f */
    public /* synthetic */ Object f18905f;

    /* renamed from: g */
    public final /* synthetic */ l<Object> f18906g;

    @zl.e(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<ul.v<? extends b1<Object>>, xl.d<? super Boolean>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f18907e;

        public a(xl.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // fm.p
        public final Object A(ul.v<? extends b1<Object>> vVar, xl.d<? super Boolean> dVar) {
            return ((a) p(vVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f18907e = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            return Boolean.valueOf(((ul.v) this.f18907e) != null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements sm.g<ul.v<? extends b1<Object>>> {

        /* renamed from: a */
        public final /* synthetic */ gm.z f18908a;

        /* renamed from: b */
        public final /* synthetic */ sm.g f18909b;

        @zl.e(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$invokeSuspend$$inlined$collect$1", f = "CachedPageEventFlow.kt", l = {136}, m = "emit")
        /* loaded from: classes.dex */
        public static final class a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f18910d;

            /* renamed from: e */
            public int f18911e;

            /* renamed from: g */
            public b f18913g;

            /* renamed from: h */
            public ul.v f18914h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xl.d dVar) {
                super(dVar);
                b.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f18910d = obj;
                this.f18911e |= Integer.MIN_VALUE;
                return b.this.n(null, this);
            }
        }

        public b(gm.z zVar, sm.g gVar) {
            this.f18908a = zVar;
            this.f18909b = gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0033  */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(ul.v<? extends l2.b1<java.lang.Object>> r5, xl.d<? super tl.l> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof l2.h.b.a
                if (r0 == 0) goto L13
                r0 = r6
                l2.h$b$a r0 = (l2.h.b.a) r0
                int r1 = r0.f18911e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18911e = r1
                goto L18
            L13:
                l2.h$b$a r0 = new l2.h$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f18910d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f18911e
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                ul.v r5 = r0.f18914h
                l2.h$b r0 = r0.f18913g
                mf.a0.k(r6)
                goto L55
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                mf.a0.k(r6)
                ul.v r5 = (ul.v) r5
                gm.l.c(r5)
                int r6 = r5.f28882a
                gm.z r2 = r4.f18908a
                int r2 = r2.f15508a
                if (r6 <= r2) goto L5b
                sm.g r6 = r4.f18909b
                T r2 = r5.f28883b
                r0.f18913g = r4
                r0.f18914h = r5
                r0.f18911e = r3
                java.lang.Object r6 = r6.n(r2, r0)
                if (r6 != r1) goto L54
                return r1
            L54:
                r0 = r4
            L55:
                gm.z r6 = r0.f18908a
                int r5 = r5.f28882a
                r6.f15508a = r5
            L5b:
                tl.l r5 = tl.l.f28297a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.h.b.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l<Object> lVar, xl.d<? super h> dVar) {
        super(2, dVar);
        this.f18906g = lVar;
    }

    @Override // fm.p
    public final Object A(sm.g<? super b1<Object>> gVar, xl.d<? super tl.l> dVar) {
        return ((h) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        h hVar = new h(this.f18906g, dVar);
        hVar.f18905f = obj;
        return hVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f18904e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            gm.z zVar = new gm.z();
            zVar.f15508a = Integer.MIN_VALUE;
            sm.x xVar = new sm.x(new a(null), this.f18906g.f19063c);
            b bVar = new b(zVar, (sm.g) this.f18905f);
            this.f18904e = 1;
            if (xVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
