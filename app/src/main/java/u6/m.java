package u6;

import androidx.lifecycle.u;
import pm.e0;
import pm.o0;
import xl.e;

@zl.e(c = "com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1", f = "MavericksLifecycleAwareFlow.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m extends zl.i implements fm.p<sm.g<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f28559e;

    /* renamed from: f */
    public /* synthetic */ Object f28560f;

    /* renamed from: g */
    public final /* synthetic */ androidx.lifecycle.u f28561g;

    /* renamed from: h */
    public final /* synthetic */ sm.f<Object> f28562h;

    @zl.e(c = "com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1", f = "MavericksLifecycleAwareFlow.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public rm.v f28563e;

        /* renamed from: f */
        public fm.q f28564f;

        /* renamed from: g */
        public gm.a0 f28565g;

        /* renamed from: h */
        public gm.a0 f28566h;

        /* renamed from: i */
        public gm.x f28567i;

        /* renamed from: j */
        public int f28568j;

        /* renamed from: k */
        public /* synthetic */ Object f28569k;

        /* renamed from: l */
        public final /* synthetic */ androidx.lifecycle.u f28570l;

        /* renamed from: m */
        public final /* synthetic */ sm.f<Object> f28571m;

        /* renamed from: n */
        public final /* synthetic */ sm.g<Object> f28572n;

        @zl.e(c = "com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$1$2", f = "MavericksLifecycleAwareFlow.kt", l = {49}, m = "invokeSuspend")
        /* renamed from: u6.m$a$a */
        /* loaded from: classes.dex */
        public static final class C0512a extends zl.i implements fm.p<Boolean, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f28573e;

            /* renamed from: f */
            public /* synthetic */ boolean f28574f;

            /* renamed from: g */
            public final /* synthetic */ gm.a0<Boolean> f28575g;

            /* renamed from: h */
            public final /* synthetic */ gm.a0<Object> f28576h;

            /* renamed from: i */
            public final /* synthetic */ fm.q<Boolean, Object, xl.d<? super tl.l>, Object> f28577i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0512a(gm.a0<Boolean> a0Var, gm.a0<Object> a0Var2, fm.q<? super Boolean, Object, ? super xl.d<? super tl.l>, ? extends Object> qVar, xl.d<? super C0512a> dVar) {
                super(2, dVar);
                this.f28575g = a0Var;
                this.f28576h = a0Var2;
                this.f28577i = qVar;
            }

            @Override // fm.p
            public final Object A(Boolean bool, xl.d<? super tl.l> dVar) {
                return ((C0512a) p(Boolean.valueOf(bool.booleanValue()), dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                C0512a c0512a = new C0512a(this.f28575g, this.f28576h, this.f28577i, dVar);
                c0512a.f28574f = ((Boolean) obj).booleanValue();
                return c0512a;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Boolean] */
            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f28573e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    boolean z10 = this.f28574f;
                    this.f28575g.f15485a = Boolean.valueOf(z10);
                    if (this.f28576h.f15485a != null) {
                        fm.q<Boolean, Object, xl.d<? super tl.l>, Object> qVar = this.f28577i;
                        Boolean valueOf = Boolean.valueOf(z10);
                        Object obj2 = this.f28576h.f15485a;
                        this.f28573e = 1;
                        if (qVar.j(valueOf, obj2, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$1$4", f = "MavericksLifecycleAwareFlow.kt", l = {55}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends zl.i implements fm.p<Object, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f28578e;

            /* renamed from: f */
            public /* synthetic */ Object f28579f;

            /* renamed from: g */
            public final /* synthetic */ gm.a0<Object> f28580g;

            /* renamed from: h */
            public final /* synthetic */ gm.a0<Boolean> f28581h;

            /* renamed from: i */
            public final /* synthetic */ fm.q<Boolean, Object, xl.d<? super tl.l>, Object> f28582i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(gm.a0<Object> a0Var, gm.a0<Boolean> a0Var2, fm.q<? super Boolean, Object, ? super xl.d<? super tl.l>, ? extends Object> qVar, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f28580g = a0Var;
                this.f28581h = a0Var2;
                this.f28582i = qVar;
            }

            @Override // fm.p
            public final Object A(Object obj, xl.d<? super tl.l> dVar) {
                return ((b) p(obj, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                b bVar = new b(this.f28580g, this.f28581h, this.f28582i, dVar);
                bVar.f28579f = obj;
                return bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object] */
            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f28578e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    ?? r62 = this.f28579f;
                    this.f28580g.f15485a = r62;
                    Boolean bool = this.f28581h.f15485a;
                    if (bool != null) {
                        fm.q<Boolean, Object, xl.d<? super tl.l>, Object> qVar = this.f28582i;
                        gm.l.d(bool, "null cannot be cast to non-null type kotlin.Boolean");
                        this.f28578e = 1;
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

        @zl.e(c = "com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$flowChannel$1", f = "MavericksLifecycleAwareFlow.kt", l = {31}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class c extends zl.i implements fm.p<rm.t<Object>, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f28583e;

            /* renamed from: f */
            public /* synthetic */ Object f28584f;

            /* renamed from: g */
            public final /* synthetic */ sm.f<Object> f28585g;

            /* renamed from: u6.m$a$c$a */
            /* loaded from: classes.dex */
            public static final class C0513a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ rm.t<T> f28586a;

                /* JADX WARN: Multi-variable type inference failed */
                public C0513a(rm.t<? super T> tVar) {
                    this.f28586a = tVar;
                }

                @Override // sm.g
                public final Object n(T t10, xl.d<? super tl.l> dVar) {
                    Object d10 = this.f28586a.d(t10, dVar);
                    return d10 == yl.a.COROUTINE_SUSPENDED ? d10 : tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(sm.f<Object> fVar, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f28585g = fVar;
            }

            @Override // fm.p
            public final Object A(rm.t<Object> tVar, xl.d<? super tl.l> dVar) {
                return ((c) p(tVar, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                c cVar = new c(this.f28585g, dVar);
                cVar.f28584f = obj;
                return cVar;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f28583e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    sm.f<Object> fVar = this.f28585g;
                    C0513a c0513a = new C0513a((rm.t) this.f28584f);
                    this.f28583e = 1;
                    if (fVar.a(c0513a, this) == aVar) {
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

        @zl.e(c = "com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda-2$$inlined$onReceive$1", f = "MavericksLifecycleAwareFlow.kt", l = {93}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class d extends zl.i implements fm.p<rm.j<? extends Boolean>, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f28587e;

            /* renamed from: f */
            public /* synthetic */ Object f28588f;

            /* renamed from: g */
            public final /* synthetic */ fm.p f28589g;

            /* renamed from: h */
            public final /* synthetic */ rm.v f28590h;

            /* renamed from: i */
            public final /* synthetic */ gm.x f28591i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(fm.p pVar, xl.d dVar, rm.v vVar, gm.x xVar) {
                super(2, dVar);
                this.f28589g = pVar;
                this.f28590h = vVar;
                this.f28591i = xVar;
            }

            @Override // fm.p
            public final Object A(rm.j<? extends Boolean> jVar, xl.d<? super tl.l> dVar) {
                return ((d) p(new rm.j(jVar.f25850a), dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                d dVar2 = new d(this.f28589g, dVar, this.f28590h, this.f28591i);
                dVar2.f28588f = obj;
                return dVar2;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f28587e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    Object a10 = rm.j.a(((rm.j) this.f28588f).f25850a);
                    if (a10 == null) {
                        this.f28590h.h(null);
                        this.f28591i.f15506a = true;
                    } else {
                        fm.p pVar = this.f28589g;
                        this.f28587e = 1;
                        if (pVar.A(a10, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$invokeSuspend$lambda-2$$inlined$onReceive$2", f = "MavericksLifecycleAwareFlow.kt", l = {93}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class e extends zl.i implements fm.p<rm.j<Object>, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f28592e;

            /* renamed from: f */
            public /* synthetic */ Object f28593f;

            /* renamed from: g */
            public final /* synthetic */ fm.p f28594g;

            /* renamed from: h */
            public final /* synthetic */ gm.x f28595h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(fm.p pVar, xl.d dVar, gm.x xVar) {
                super(2, dVar);
                this.f28594g = pVar;
                this.f28595h = xVar;
            }

            @Override // fm.p
            public final Object A(rm.j<Object> jVar, xl.d<? super tl.l> dVar) {
                return ((e) p(new rm.j(jVar.f25850a), dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                e eVar = new e(this.f28594g, dVar, this.f28595h);
                eVar.f28593f = obj;
                return eVar;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f28592e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    Object a10 = rm.j.a(((rm.j) this.f28593f).f25850a);
                    if (a10 == null) {
                        this.f28595h.f15506a = true;
                    } else {
                        fm.p pVar = this.f28594g;
                        this.f28592e = 1;
                        if (pVar.A(a10, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$flowWhenStarted$1$1$transform$1", f = "MavericksLifecycleAwareFlow.kt", l = {35}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class f extends zl.i implements fm.q<Boolean, Object, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f28596e;

            /* renamed from: f */
            public /* synthetic */ boolean f28597f;

            /* renamed from: g */
            public /* synthetic */ Object f28598g;

            /* renamed from: h */
            public final /* synthetic */ sm.g<Object> f28599h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(sm.g<Object> gVar, xl.d<? super f> dVar) {
                super(3, dVar);
                this.f28599h = gVar;
            }

            @Override // fm.q
            public final Object j(Boolean bool, Object obj, xl.d<? super tl.l> dVar) {
                boolean booleanValue = bool.booleanValue();
                f fVar = new f(this.f28599h, dVar);
                fVar.f28597f = booleanValue;
                fVar.f28598g = obj;
                return fVar.t(tl.l.f28297a);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f28596e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    boolean z10 = this.f28597f;
                    Object obj2 = this.f28598g;
                    if (z10) {
                        sm.g<Object> gVar = this.f28599h;
                        this.f28596e = 1;
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
            this.f28570l = uVar;
            this.f28571m = fVar;
            this.f28572n = gVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f28570l, this.f28571m, this.f28572n, dVar);
            aVar.f28569k = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [xm.b] */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1, androidx.lifecycle.t] */
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
            int i10 = this.f28568j;
            if (i10 != 0) {
                if (i10 == 1) {
                    xVar = this.f28567i;
                    a0Var2 = this.f28566h;
                    a0Var = this.f28565g;
                    fVar = this.f28564f;
                    rm.v vVar3 = this.f28563e;
                    mf.a0.k(obj);
                    vVar2 = vVar3;
                    vVar = (rm.g) this.f28569k;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                androidx.lifecycle.v a02 = this.f28570l.a0();
                gm.l.e(a02, "owner.lifecycle");
                final rm.a a10 = jh.v.a(-1, null, 6);
                ?? r42 = new androidx.lifecycle.g() { // from class: com.github.airbnb.mvrx.MavericksLifecycleAwareFlowKt$startedChannel$observer$1
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
                a10.n(new n(a02, r42));
                c cVar = new c(this.f28571m, null);
                xl.g gVar = xl.g.f30632a;
                rm.a a11 = jh.v.a(0, rm.f.SUSPEND, 4);
                xl.f a12 = pm.z.a(((e0) this.f28569k).E(), gVar, true);
                wm.c cVar2 = o0.f24381a;
                if (a12 != cVar2 && a12.b(e.a.f30630a) == null) {
                    a12 = a12.s(cVar2);
                }
                pm.a sVar = new rm.s(a12, a11);
                sVar.A0(1, sVar, cVar);
                fVar = new f(this.f28572n, null);
                a0Var = new gm.a0();
                a0Var2 = new gm.a0();
                xVar = new gm.x();
                vVar2 = sVar;
                vVar = a10;
            }
            while (!xVar.f15506a) {
                this.f28569k = vVar;
                this.f28563e = vVar2;
                this.f28564f = fVar;
                this.f28565g = a0Var;
                this.f28566h = a0Var2;
                this.f28567i = xVar;
                this.f28568j = 1;
                xm.a aVar2 = new xm.a(this);
                try {
                    vVar.c().t(aVar2, new d(new C0512a(a0Var, a0Var2, fVar, null), null, vVar2, xVar));
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
    public m(androidx.lifecycle.u uVar, sm.f<Object> fVar, xl.d<? super m> dVar) {
        super(2, dVar);
        this.f28561g = uVar;
        this.f28562h = fVar;
    }

    @Override // fm.p
    public final Object A(sm.g<Object> gVar, xl.d<? super tl.l> dVar) {
        return ((m) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        m mVar = new m(this.f28561g, this.f28562h, dVar);
        mVar.f28560f = obj;
        return mVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f28559e;
        if (i10 == 0) {
            mf.a0.k(obj);
            a aVar2 = new a(this.f28561g, this.f28562h, (sm.g) this.f28560f, null);
            this.f28559e = 1;
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
