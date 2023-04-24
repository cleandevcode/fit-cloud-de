package y3;

import androidx.lifecycle.u;
import xl.e;

@zl.e(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1", f = "MavericksLifecycleAwareFlow.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s extends zl.i implements fm.p<sm.g<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f31025e;

    /* renamed from: f */
    public /* synthetic */ Object f31026f;

    /* renamed from: g */
    public final /* synthetic */ androidx.lifecycle.u f31027g;

    /* renamed from: h */
    public final /* synthetic */ sm.f<Object> f31028h;

    @zl.e(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1", f = "MavericksLifecycleAwareFlow.kt", l = {101}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public rm.v f31029e;

        /* renamed from: f */
        public fm.q f31030f;

        /* renamed from: g */
        public gm.a0 f31031g;

        /* renamed from: h */
        public gm.a0 f31032h;

        /* renamed from: i */
        public gm.x f31033i;

        /* renamed from: j */
        public int f31034j;

        /* renamed from: k */
        public /* synthetic */ Object f31035k;

        /* renamed from: l */
        public final /* synthetic */ androidx.lifecycle.u f31036l;

        /* renamed from: m */
        public final /* synthetic */ sm.f<Object> f31037m;

        /* renamed from: n */
        public final /* synthetic */ sm.g<Object> f31038n;

        @zl.e(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$1$2", f = "MavericksLifecycleAwareFlow.kt", l = {50}, m = "invokeSuspend")
        /* renamed from: y3.s$a$a */
        /* loaded from: classes.dex */
        public static final class C0570a extends zl.i implements fm.p<Boolean, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31039e;

            /* renamed from: f */
            public /* synthetic */ boolean f31040f;

            /* renamed from: g */
            public final /* synthetic */ gm.a0<Boolean> f31041g;

            /* renamed from: h */
            public final /* synthetic */ gm.a0<Object> f31042h;

            /* renamed from: i */
            public final /* synthetic */ fm.q<Boolean, Object, xl.d<? super tl.l>, Object> f31043i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0570a(gm.a0<Boolean> a0Var, gm.a0<Object> a0Var2, fm.q<? super Boolean, Object, ? super xl.d<? super tl.l>, ? extends Object> qVar, xl.d<? super C0570a> dVar) {
                super(2, dVar);
                this.f31041g = a0Var;
                this.f31042h = a0Var2;
                this.f31043i = qVar;
            }

            @Override // fm.p
            public final Object A(Boolean bool, xl.d<? super tl.l> dVar) {
                return ((C0570a) p(Boolean.valueOf(bool.booleanValue()), dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                C0570a c0570a = new C0570a(this.f31041g, this.f31042h, this.f31043i, dVar);
                c0570a.f31040f = ((Boolean) obj).booleanValue();
                return c0570a;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31039e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    boolean z10 = this.f31040f;
                    this.f31041g.f15485a = Boolean.valueOf(z10);
                    if (this.f31042h.f15485a != null) {
                        fm.q<Boolean, Object, xl.d<? super tl.l>, Object> qVar = this.f31043i;
                        Boolean valueOf = Boolean.valueOf(z10);
                        Object obj2 = this.f31042h.f15485a;
                        this.f31039e = 1;
                        if (qVar.j(valueOf, obj2, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$1$4", f = "MavericksLifecycleAwareFlow.kt", l = {56}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends zl.i implements fm.p<Object, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31044e;

            /* renamed from: f */
            public /* synthetic */ Object f31045f;

            /* renamed from: g */
            public final /* synthetic */ gm.a0<Object> f31046g;

            /* renamed from: h */
            public final /* synthetic */ gm.a0<Boolean> f31047h;

            /* renamed from: i */
            public final /* synthetic */ fm.q<Boolean, Object, xl.d<? super tl.l>, Object> f31048i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(gm.a0<Object> a0Var, gm.a0<Boolean> a0Var2, fm.q<? super Boolean, Object, ? super xl.d<? super tl.l>, ? extends Object> qVar, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f31046g = a0Var;
                this.f31047h = a0Var2;
                this.f31048i = qVar;
            }

            @Override // fm.p
            public final Object A(Object obj, xl.d<? super tl.l> dVar) {
                return ((b) p(obj, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                b bVar = new b(this.f31046g, this.f31047h, this.f31048i, dVar);
                bVar.f31045f = obj;
                return bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object] */
            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31044e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    ?? r62 = this.f31045f;
                    this.f31046g.f15485a = r62;
                    Boolean bool = this.f31047h.f15485a;
                    if (bool != null) {
                        fm.q<Boolean, Object, xl.d<? super tl.l>, Object> qVar = this.f31048i;
                        gm.l.d(bool, "null cannot be cast to non-null type kotlin.Boolean");
                        this.f31044e = 1;
                        if (qVar.j(bool, r62, this) == aVar) {
                            return aVar;
                        }
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mf.a0.k(obj);
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1", f = "MavericksLifecycleAwareFlow.kt", l = {32}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends zl.i implements fm.p<rm.t<Object>, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31049e;

            /* renamed from: f */
            public /* synthetic */ Object f31050f;

            /* renamed from: g */
            public final /* synthetic */ sm.f<Object> f31051g;

            /* renamed from: y3.s$a$c$a */
            /* loaded from: classes.dex */
            public static final class C0571a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ rm.t<T> f31052a;

                /* JADX WARN: Multi-variable type inference failed */
                public C0571a(rm.t<? super T> tVar) {
                    this.f31052a = tVar;
                }

                @Override // sm.g
                public final Object n(T t10, xl.d<? super tl.l> dVar) {
                    Object d10 = this.f31052a.d(t10, dVar);
                    return d10 == yl.a.COROUTINE_SUSPENDED ? d10 : tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(sm.f<Object> fVar, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f31051g = fVar;
            }

            @Override // fm.p
            public final Object A(rm.t<Object> tVar, xl.d<? super tl.l> dVar) {
                return ((c) p(tVar, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                c cVar = new c(this.f31051g, dVar);
                cVar.f31050f = obj;
                return cVar;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31049e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    sm.f<Object> fVar = this.f31051g;
                    C0571a c0571a = new C0571a((rm.t) this.f31050f);
                    this.f31049e = 1;
                    if (fVar.a(c0571a, this) == aVar) {
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

        @zl.e(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda-2$$inlined$onReceive$1", f = "MavericksLifecycleAwareFlow.kt", l = {94}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class d extends zl.i implements fm.p<rm.j<? extends Boolean>, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31053e;

            /* renamed from: f */
            public /* synthetic */ Object f31054f;

            /* renamed from: g */
            public final /* synthetic */ fm.p f31055g;

            /* renamed from: h */
            public final /* synthetic */ rm.v f31056h;

            /* renamed from: i */
            public final /* synthetic */ gm.x f31057i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(fm.p pVar, xl.d dVar, rm.v vVar, gm.x xVar) {
                super(2, dVar);
                this.f31055g = pVar;
                this.f31056h = vVar;
                this.f31057i = xVar;
            }

            @Override // fm.p
            public final Object A(rm.j<? extends Boolean> jVar, xl.d<? super tl.l> dVar) {
                return ((d) p(new rm.j(jVar.f25850a), dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                d dVar2 = new d(this.f31055g, dVar, this.f31056h, this.f31057i);
                dVar2.f31054f = obj;
                return dVar2;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31053e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    Object a10 = rm.j.a(((rm.j) this.f31054f).f25850a);
                    if (a10 == null) {
                        this.f31056h.h(null);
                        this.f31057i.f15506a = true;
                    } else {
                        fm.p pVar = this.f31055g;
                        this.f31053e = 1;
                        if (pVar.A(a10, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda-2$$inlined$onReceive$2", f = "MavericksLifecycleAwareFlow.kt", l = {94}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class e extends zl.i implements fm.p<rm.j<Object>, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31058e;

            /* renamed from: f */
            public /* synthetic */ Object f31059f;

            /* renamed from: g */
            public final /* synthetic */ fm.p f31060g;

            /* renamed from: h */
            public final /* synthetic */ gm.x f31061h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(fm.p pVar, xl.d dVar, gm.x xVar) {
                super(2, dVar);
                this.f31060g = pVar;
                this.f31061h = xVar;
            }

            @Override // fm.p
            public final Object A(rm.j<Object> jVar, xl.d<? super tl.l> dVar) {
                return ((e) p(new rm.j(jVar.f25850a), dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                e eVar = new e(this.f31060g, dVar, this.f31061h);
                eVar.f31059f = obj;
                return eVar;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31058e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    Object a10 = rm.j.a(((rm.j) this.f31059f).f25850a);
                    if (a10 == null) {
                        this.f31061h.f15506a = true;
                    } else {
                        fm.p pVar = this.f31060g;
                        this.f31058e = 1;
                        if (pVar.A(a10, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1", f = "MavericksLifecycleAwareFlow.kt", l = {36}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class f extends zl.i implements fm.q<Boolean, Object, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31062e;

            /* renamed from: f */
            public /* synthetic */ boolean f31063f;

            /* renamed from: g */
            public /* synthetic */ Object f31064g;

            /* renamed from: h */
            public final /* synthetic */ sm.g<Object> f31065h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(sm.g<Object> gVar, xl.d<? super f> dVar) {
                super(3, dVar);
                this.f31065h = gVar;
            }

            @Override // fm.q
            public final Object j(Boolean bool, Object obj, xl.d<? super tl.l> dVar) {
                boolean booleanValue = bool.booleanValue();
                f fVar = new f(this.f31065h, dVar);
                fVar.f31063f = booleanValue;
                fVar.f31064g = obj;
                return fVar.t(tl.l.f28297a);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31062e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    boolean z10 = this.f31063f;
                    Object obj2 = this.f31064g;
                    if (z10) {
                        sm.g<Object> gVar = this.f31065h;
                        this.f31062e = 1;
                        if (gVar.n(obj2, this) == aVar) {
                            return aVar;
                        }
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
        public a(androidx.lifecycle.u uVar, sm.f<Object> fVar, sm.g<Object> gVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f31036l = uVar;
            this.f31037m = fVar;
            this.f31038n = gVar;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f31036l, this.f31037m, this.f31038n, dVar);
            aVar.f31035k = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [xm.b] */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1, androidx.lifecycle.t] */
        /* JADX WARN: Type inference failed for: r7v2, types: [rm.v] */
        /* JADX WARN: Type inference failed for: r7v4 */
        @Override // zl.a
        public final Object t(Object obj) {
            fm.q fVar;
            gm.a0 a0Var;
            gm.a0 a0Var2;
            gm.x xVar;
            rm.v vVar;
            rm.v vVar2;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f31034j;
            if (i10 != 0) {
                if (i10 == 1) {
                    xVar = this.f31033i;
                    a0Var2 = this.f31032h;
                    a0Var = this.f31031g;
                    fVar = this.f31030f;
                    rm.v vVar3 = this.f31029e;
                    mf.a0.k(obj);
                    vVar2 = vVar3;
                    vVar = (rm.g) this.f31035k;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                androidx.lifecycle.v a02 = this.f31036l.a0();
                gm.l.e(a02, "owner.lifecycle");
                final rm.a a10 = jh.v.a(-1, null, 6);
                ?? r42 = new androidx.lifecycle.g() { // from class: com.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1
                    @Override // androidx.lifecycle.g
                    public final /* synthetic */ void c(u uVar) {
                    }

                    @Override // androidx.lifecycle.g
                    public final void onDestroy(u uVar) {
                        a10.o(null);
                    }

                    @Override // androidx.lifecycle.g
                    public final /* synthetic */ void onPause(u uVar) {
                    }

                    @Override // androidx.lifecycle.g
                    public final /* synthetic */ void onResume(u uVar) {
                    }

                    @Override // androidx.lifecycle.g
                    public final void onStart(u uVar) {
                        a10.p(Boolean.TRUE);
                    }

                    @Override // androidx.lifecycle.g
                    public final void onStop(u uVar) {
                        a10.p(Boolean.FALSE);
                    }
                };
                a02.a(r42);
                a10.n(new t(a02, r42));
                c cVar = new c(this.f31037m, null);
                xl.g gVar = xl.g.f30632a;
                rm.a a11 = jh.v.a(0, rm.f.SUSPEND, 4);
                xl.f a12 = pm.z.a(((pm.e0) this.f31035k).E(), gVar, true);
                wm.c cVar2 = pm.o0.f24381a;
                if (a12 != cVar2 && a12.b(e.a.f30630a) == null) {
                    a12 = a12.s(cVar2);
                }
                pm.a sVar = new rm.s(a12, a11);
                sVar.A0(1, sVar, cVar);
                fVar = new f(this.f31038n, null);
                a0Var = new gm.a0();
                a0Var2 = new gm.a0();
                xVar = new gm.x();
                vVar2 = sVar;
                vVar = a10;
            }
            while (!xVar.f15506a) {
                this.f31035k = vVar;
                this.f31029e = vVar2;
                this.f31030f = fVar;
                this.f31031g = a0Var;
                this.f31032h = a0Var2;
                this.f31033i = xVar;
                this.f31034j = 1;
                xm.a aVar2 = new xm.a(this);
                try {
                    vVar.c().t(aVar2, new d(new C0570a(a0Var, a0Var2, fVar, null), null, vVar2, xVar));
                    vVar2.c().t(aVar2, new e(new b(a0Var2, a0Var, fVar, null), null, xVar));
                } catch (Throwable th2) {
                    aVar2.T(th2);
                }
                if (aVar2.S() == aVar) {
                    return aVar;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.lifecycle.u uVar, sm.f<Object> fVar, xl.d<? super s> dVar) {
        super(2, dVar);
        this.f31027g = uVar;
        this.f31028h = fVar;
    }

    @Override // fm.p
    public final Object A(sm.g<Object> gVar, xl.d<? super tl.l> dVar) {
        return ((s) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        s sVar = new s(this.f31027g, this.f31028h, dVar);
        sVar.f31026f = obj;
        return sVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f31025e;
        if (i10 == 0) {
            mf.a0.k(obj);
            a aVar2 = new a(this.f31027g, this.f31028h, (sm.g) this.f31026f, null);
            this.f31025e = 1;
            if (bi.r.s(aVar2, this) == aVar) {
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
