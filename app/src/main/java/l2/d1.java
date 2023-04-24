package l2;

import l2.c1;

@zl.e(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d1 extends zl.i implements fm.p<z2<b2<Object>>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f18802e;

    /* renamed from: f */
    public /* synthetic */ Object f18803f;

    /* renamed from: g */
    public final /* synthetic */ n2<Object, Object> f18804g;

    /* renamed from: h */
    public final /* synthetic */ c1<Object, Object> f18805h;

    @zl.e(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {62, 62}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<sm.g<? super Boolean>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f18806e;

        /* renamed from: f */
        public /* synthetic */ Object f18807f;

        /* renamed from: g */
        public final /* synthetic */ r2<Object, Object> f18808g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r2<Object, Object> r2Var, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f18808g = r2Var;
        }

        @Override // fm.p
        public final Object A(sm.g<? super Boolean> gVar, xl.d<? super tl.l> dVar) {
            return ((a) p(gVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f18808g, dVar);
            aVar.f18807f = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0050 A[RETURN] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r7) {
            /*
                r6 = this;
                yl.a r0 = yl.a.COROUTINE_SUSPENDED
                int r1 = r6.f18806e
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                mf.a0.k(r7)
                goto L51
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                java.lang.Object r1 = r6.f18807f
                sm.g r1 = (sm.g) r1
                mf.a0.k(r7)
                goto L3a
            L21:
                mf.a0.k(r7)
                java.lang.Object r7 = r6.f18807f
                r1 = r7
                sm.g r1 = (sm.g) r1
                l2.r2<java.lang.Object, java.lang.Object> r7 = r6.f18808g
                if (r7 != 0) goto L2f
                r7 = r2
                goto L3c
            L2f:
                r6.f18807f = r1
                r6.f18806e = r4
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L3a
                return r0
            L3a:
                l2.n2$a r7 = (l2.n2.a) r7
            L3c:
                l2.n2$a r5 = l2.n2.a.LAUNCH_INITIAL_REFRESH
                if (r7 != r5) goto L41
                goto L42
            L41:
                r4 = 0
            L42:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                r6.f18807f = r2
                r6.f18806e = r3
                java.lang.Object r7 = r1.n(r7, r6)
                if (r7 != r0) goto L51
                return r0
            L51:
                tl.l r7 = tl.l.f28297a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.d1.a.t(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {66, 70}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zl.i implements fm.q<c1.a<Object, Object>, Boolean, xl.d<? super c1.a<Object, Object>>, Object> {

        /* renamed from: e */
        public l2 f18809e;

        /* renamed from: f */
        public int f18810f;

        /* renamed from: g */
        public /* synthetic */ c1.a f18811g;

        /* renamed from: h */
        public /* synthetic */ boolean f18812h;

        /* renamed from: i */
        public final /* synthetic */ c1<Object, Object> f18813i;

        /* renamed from: j */
        public final /* synthetic */ r2<Object, Object> f18814j;

        /* loaded from: classes.dex */
        public /* synthetic */ class a extends gm.i implements fm.a<tl.l> {
            public a(c1 c1Var) {
                super(0, c1Var, c1.class, "refresh", "refresh()V");
            }

            @Override // fm.a
            public final tl.l m() {
                ((c1) this.f15491b).f18775d.b(Boolean.TRUE);
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c1<Object, Object> c1Var, r2<Object, Object> r2Var, xl.d<? super b> dVar) {
            super(3, dVar);
            this.f18813i = c1Var;
            this.f18814j = r2Var;
        }

        @Override // fm.q
        public final Object j(c1.a<Object, Object> aVar, Boolean bool, xl.d<? super c1.a<Object, Object>> dVar) {
            boolean booleanValue = bool.booleanValue();
            b bVar = new b(this.f18813i, this.f18814j, dVar);
            bVar.f18811g = aVar;
            bVar.f18812h = booleanValue;
            return bVar.t(tl.l.f28297a);
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x00cb  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.d1.b.t(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements sm.g<b2<Object>> {

        /* renamed from: a */
        public final /* synthetic */ z2 f18815a;

        public c(z2 z2Var) {
            this.f18815a = z2Var;
        }

        @Override // sm.g
        public final Object n(b2<Object> b2Var, xl.d<? super tl.l> dVar) {
            Object d10 = this.f18815a.d(b2Var, dVar);
            return d10 == yl.a.COROUTINE_SUSPENDED ? d10 : tl.l.f28297a;
        }
    }

    @zl.e(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {226}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends zl.i implements fm.q<sm.g<? super b2<Object>>, c1.a<Object, Object>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f18816e;

        /* renamed from: f */
        public /* synthetic */ sm.g f18817f;

        /* renamed from: g */
        public /* synthetic */ Object f18818g;

        /* renamed from: h */
        public final /* synthetic */ c1 f18819h;

        /* renamed from: i */
        public final /* synthetic */ r2 f18820i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c1 c1Var, r2 r2Var, xl.d dVar) {
            super(3, dVar);
            this.f18819h = c1Var;
            this.f18820i = r2Var;
        }

        @Override // fm.q
        public final Object j(sm.g<? super b2<Object>> gVar, c1.a<Object, Object> aVar, xl.d<? super tl.l> dVar) {
            d dVar2 = new d(this.f18819h, this.f18820i, dVar);
            dVar2.f18817f = gVar;
            dVar2.f18818g = aVar;
            return dVar2.t(tl.l.f28297a);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            sm.f a10;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f18816e;
            if (i10 != 0) {
                if (i10 == 1) {
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                sm.g gVar = this.f18817f;
                c1.a aVar2 = (c1.a) this.f18818g;
                c1 c1Var = this.f18819h;
                i1<Key, Value> i1Var = aVar2.f18778a;
                pm.g1 g1Var = aVar2.f18780c;
                r2 r2Var = this.f18820i;
                c1Var.getClass();
                if (r2Var == null) {
                    a10 = i1Var.f18987n;
                } else {
                    h1 h1Var = new h1(r2Var, i1Var, new w0(), null);
                    gm.l.f(g1Var, "controller");
                    a10 = y2.a(new r(g1Var, h1Var, null));
                }
                c1 c1Var2 = this.f18819h;
                b2 b2Var = new b2(a10, new c1.b(c1Var2, aVar2.f18778a, c1Var2.f18776e));
                this.f18816e = 1;
                if (gVar.n(b2Var, this) == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(n2<Object, Object> n2Var, c1<Object, Object> c1Var, xl.d<? super d1> dVar) {
        super(2, dVar);
        this.f18804g = n2Var;
        this.f18805h = c1Var;
    }

    @Override // fm.p
    public final Object A(z2<b2<Object>> z2Var, xl.d<? super tl.l> dVar) {
        return ((d1) p(z2Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        d1 d1Var = new d1(this.f18804g, this.f18805h, dVar);
        d1Var.f18803f = obj;
        return d1Var;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        o2 o2Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f18802e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            z2 z2Var = (z2) this.f18803f;
            n2<Object, Object> n2Var = this.f18804g;
            if (n2Var == null) {
                o2Var = null;
            } else {
                gm.l.f(z2Var, "scope");
                o2Var = new o2(z2Var, n2Var);
            }
            sm.o oVar = new sm.o(new a(o2Var, null), (sm.f) this.f18805h.f18775d.f29488b);
            b bVar = new b(this.f18805h, o2Var, null);
            Object obj2 = f0.f18875a;
            sm.f a10 = f0.a(new sm.j0(new sm.u0(new e0(null, oVar, bVar, null))), new d(this.f18805h, o2Var, null));
            c cVar = new c(z2Var);
            this.f18802e = 1;
            if (a10.a(cVar, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
