package l2;

/* loaded from: classes.dex */
public final class y2 {

    @zl.e(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<T> extends zl.i implements fm.p<sm.g<? super T>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f19360e;

        /* renamed from: f */
        public /* synthetic */ Object f19361f;

        /* renamed from: g */
        public final /* synthetic */ fm.p<z2<T>, xl.d<? super tl.l>, Object> f19362g;

        @zl.e(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", l = {64, 65}, m = "invokeSuspend")
        /* renamed from: l2.y2$a$a */
        /* loaded from: classes.dex */
        public static final class C0347a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public rm.i f19363e;

            /* renamed from: f */
            public int f19364f;

            /* renamed from: g */
            public /* synthetic */ Object f19365g;

            /* renamed from: h */
            public final /* synthetic */ sm.g<T> f19366h;

            /* renamed from: i */
            public final /* synthetic */ fm.p<z2<T>, xl.d<? super tl.l>, Object> f19367i;

            @zl.e(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", l = {52}, m = "invokeSuspend")
            /* renamed from: l2.y2$a$a$a */
            /* loaded from: classes.dex */
            public static final class C0348a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f19368e;

                /* renamed from: f */
                public final /* synthetic */ rm.g<T> f19369f;

                /* renamed from: g */
                public final /* synthetic */ fm.p<z2<T>, xl.d<? super tl.l>, Object> f19370g;

                @zl.e(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", l = {57}, m = "invokeSuspend")
                /* renamed from: l2.y2$a$a$a$a */
                /* loaded from: classes.dex */
                public static final class C0349a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

                    /* renamed from: e */
                    public int f19371e;

                    /* renamed from: f */
                    public /* synthetic */ Object f19372f;

                    /* renamed from: g */
                    public final /* synthetic */ rm.g<T> f19373g;

                    /* renamed from: h */
                    public final /* synthetic */ fm.p<z2<T>, xl.d<? super tl.l>, Object> f19374h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0349a(rm.g<T> gVar, fm.p<? super z2<T>, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super C0349a> dVar) {
                        super(2, dVar);
                        this.f19373g = gVar;
                        this.f19374h = pVar;
                    }

                    @Override // fm.p
                    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                        return ((C0349a) p(e0Var, dVar)).t(tl.l.f28297a);
                    }

                    @Override // zl.a
                    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                        C0349a c0349a = new C0349a(this.f19373g, this.f19374h, dVar);
                        c0349a.f19372f = obj;
                        return c0349a;
                    }

                    @Override // zl.a
                    public final Object t(Object obj) {
                        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                        int i10 = this.f19371e;
                        if (i10 == 0) {
                            mf.a0.k(obj);
                            c3 c3Var = new c3((pm.e0) this.f19372f, this.f19373g);
                            fm.p<z2<T>, xl.d<? super tl.l>, Object> pVar = this.f19374h;
                            this.f19371e = 1;
                            if (pVar.A(c3Var, this) == aVar) {
                                return aVar;
                            }
                        } else if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            mf.a0.k(obj);
                        }
                        return tl.l.f28297a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0348a(rm.g<T> gVar, fm.p<? super z2<T>, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super C0348a> dVar) {
                    super(2, dVar);
                    this.f19369f = gVar;
                    this.f19370g = pVar;
                }

                @Override // fm.p
                public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                    return ((C0348a) p(e0Var, dVar)).t(tl.l.f28297a);
                }

                @Override // zl.a
                public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                    return new C0348a(this.f19369f, this.f19370g, dVar);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f19368e;
                    try {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                mf.a0.k(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            mf.a0.k(obj);
                            C0349a c0349a = new C0349a(this.f19369f, this.f19370g, null);
                            this.f19368e = 1;
                            if (bi.r.s(c0349a, this) == aVar) {
                                return aVar;
                            }
                        }
                        this.f19369f.o(null);
                    } catch (Throwable th2) {
                        this.f19369f.o(th2);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0347a(sm.g<? super T> gVar, fm.p<? super z2<T>, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super C0347a> dVar) {
                super(2, dVar);
                this.f19366h = gVar;
                this.f19367i = pVar;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0347a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                C0347a c0347a = new C0347a(this.f19366h, this.f19367i, dVar);
                c0347a.f19365g = obj;
                return c0347a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0059 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x007b -> B:36:0x004d). Please submit an issue!!! */
            @Override // zl.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object t(java.lang.Object r10) {
                /*
                    r9 = this;
                    yl.a r0 = yl.a.COROUTINE_SUSPENDED
                    int r1 = r9.f19364f
                    r2 = 1
                    r3 = 2
                    r4 = 0
                    if (r1 == 0) goto L2d
                    if (r1 == r2) goto L1f
                    if (r1 != r3) goto L17
                    rm.i r1 = r9.f19363e
                    java.lang.Object r5 = r9.f19365g
                    pm.g1 r5 = (pm.g1) r5
                    mf.a0.k(r10)
                    goto L4c
                L17:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1f:
                    rm.i r1 = r9.f19363e
                    java.lang.Object r5 = r9.f19365g
                    pm.g1 r5 = (pm.g1) r5
                    mf.a0.k(r10)
                    r6 = r5
                    r5 = r1
                    r1 = r0
                    r0 = r9
                    goto L60
                L2d:
                    mf.a0.k(r10)
                    java.lang.Object r10 = r9.f19365g
                    pm.e0 r10 = (pm.e0) r10
                    r1 = 6
                    r5 = 0
                    rm.a r1 = jh.v.a(r5, r4, r1)
                    l2.y2$a$a$a r6 = new l2.y2$a$a$a
                    fm.p<l2.z2<T>, xl.d<? super tl.l>, java.lang.Object> r7 = r9.f19367i
                    r6.<init>(r1, r7, r4)
                    r7 = 3
                    pm.z1 r5 = bi.z0.g(r10, r4, r5, r6, r7)
                    rm.a$a r10 = new rm.a$a
                    r10.<init>(r1)
                    r1 = r10
                L4c:
                    r10 = r9
                L4d:
                    r10.f19365g = r5
                    r10.f19363e = r1
                    r10.f19364f = r2
                    java.lang.Object r6 = r1.a(r10)
                    if (r6 != r0) goto L5a
                    return r0
                L5a:
                    r8 = r0
                    r0 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r1
                    r1 = r8
                L60:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L80
                    java.lang.Object r10 = r5.next()
                    sm.g<T> r7 = r0.f19366h
                    r0.f19365g = r6
                    r0.f19363e = r5
                    r0.f19364f = r3
                    java.lang.Object r10 = r7.n(r10, r0)
                    if (r10 != r1) goto L7b
                    return r1
                L7b:
                    r10 = r0
                    r0 = r1
                    r1 = r5
                    r5 = r6
                    goto L4d
                L80:
                    r6.h(r4)
                    tl.l r10 = tl.l.f28297a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: l2.y2.a.C0347a.t(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(fm.p<? super z2<T>, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f19362g = pVar;
        }

        @Override // fm.p
        public final Object A(Object obj, xl.d<? super tl.l> dVar) {
            return ((a) p((sm.g) obj, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f19362g, dVar);
            aVar.f19361f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f19360e;
            if (i10 == 0) {
                mf.a0.k(obj);
                C0347a c0347a = new C0347a((sm.g) this.f19361f, this.f19362g, null);
                this.f19360e = 1;
                if (bi.r.s(c0347a, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                mf.a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    public static final <T> sm.f<T> a(fm.p<? super z2<T>, ? super xl.d<? super tl.l>, ? extends Object> pVar) {
        return bi.r.g(new sm.u0(new a(pVar, null)), -2);
    }
}
