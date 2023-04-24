package tm;

import gm.a0;
import pm.e0;
import pm.g1;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes2.dex */
public final class j<T, R> extends h<T, R> {

    /* renamed from: e */
    public final fm.q<sm.g<? super R>, T, xl.d<? super tl.l>, Object> f28319e;

    @zl.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f28320e;

        /* renamed from: f */
        public /* synthetic */ Object f28321f;

        /* renamed from: g */
        public final /* synthetic */ j<T, R> f28322g;

        /* renamed from: h */
        public final /* synthetic */ sm.g<R> f28323h;

        /* renamed from: tm.j$a$a */
        /* loaded from: classes2.dex */
        public static final class C0505a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ a0<g1> f28324a;

            /* renamed from: b */
            public final /* synthetic */ e0 f28325b;

            /* renamed from: c */
            public final /* synthetic */ j<T, R> f28326c;

            /* renamed from: d */
            public final /* synthetic */ sm.g<R> f28327d;

            @zl.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            /* renamed from: tm.j$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0506a extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f28328e;

                /* renamed from: f */
                public final /* synthetic */ j<T, R> f28329f;

                /* renamed from: g */
                public final /* synthetic */ sm.g<R> f28330g;

                /* renamed from: h */
                public final /* synthetic */ T f28331h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0506a(j<T, R> jVar, sm.g<? super R> gVar, T t10, xl.d<? super C0506a> dVar) {
                    super(2, dVar);
                    this.f28329f = jVar;
                    this.f28330g = gVar;
                    this.f28331h = t10;
                }

                @Override // fm.p
                public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                    return ((C0506a) p(e0Var, dVar)).t(tl.l.f28297a);
                }

                @Override // zl.a
                public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                    return new C0506a(this.f28329f, this.f28330g, this.f28331h, dVar);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f28328e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            mf.a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        mf.a0.k(obj);
                        sm.g<R> gVar = this.f28330g;
                        T t10 = this.f28331h;
                        this.f28328e = 1;
                        if (this.f28329f.f28319e.j(gVar, t10, this) == aVar) {
                            return aVar;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            @zl.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            /* renamed from: tm.j$a$a$b */
            /* loaded from: classes2.dex */
            public static final class b extends zl.c {

                /* renamed from: d */
                public C0505a f28332d;

                /* renamed from: e */
                public Object f28333e;

                /* renamed from: f */
                public g1 f28334f;

                /* renamed from: g */
                public /* synthetic */ Object f28335g;

                /* renamed from: h */
                public final /* synthetic */ C0505a<T> f28336h;

                /* renamed from: i */
                public int f28337i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0505a<? super T> c0505a, xl.d<? super b> dVar) {
                    super(dVar);
                    this.f28336h = c0505a;
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    this.f28335g = obj;
                    this.f28337i |= Integer.MIN_VALUE;
                    return this.f28336h.n(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0505a(a0<g1> a0Var, e0 e0Var, j<T, R> jVar, sm.g<? super R> gVar) {
                this.f28324a = a0Var;
                this.f28325b = e0Var;
                this.f28326c = jVar;
                this.f28327d = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
            @Override // sm.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object n(T r8, xl.d<? super tl.l> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof tm.j.a.C0505a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    tm.j$a$a$b r0 = (tm.j.a.C0505a.b) r0
                    int r1 = r0.f28337i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28337i = r1
                    goto L18
                L13:
                    tm.j$a$a$b r0 = new tm.j$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f28335g
                    yl.a r1 = yl.a.COROUTINE_SUSPENDED
                    int r2 = r0.f28337i
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L2b
                    java.lang.Object r8 = r0.f28333e
                    tm.j$a$a r0 = r0.f28332d
                    mf.a0.k(r9)
                    goto L56
                L2b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L33:
                    mf.a0.k(r9)
                    gm.a0<pm.g1> r9 = r7.f28324a
                    T r9 = r9.f15485a
                    pm.g1 r9 = (pm.g1) r9
                    if (r9 == 0) goto L55
                    tm.k r2 = new tm.k
                    r2.<init>()
                    r9.h(r2)
                    r0.f28332d = r7
                    r0.f28333e = r8
                    r0.f28334f = r9
                    r0.f28337i = r3
                    java.lang.Object r9 = r9.R(r0)
                    if (r9 != r1) goto L55
                    return r1
                L55:
                    r0 = r7
                L56:
                    gm.a0<pm.g1> r9 = r0.f28324a
                    pm.e0 r1 = r0.f28325b
                    r2 = 4
                    tm.j$a$a$a r4 = new tm.j$a$a$a
                    tm.j<T, R> r5 = r0.f28326c
                    sm.g<R> r0 = r0.f28327d
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    pm.z1 r8 = bi.z0.g(r1, r6, r2, r4, r3)
                    r9.f15485a = r8
                    tl.l r8 = tl.l.f28297a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: tm.j.a.C0505a.n(java.lang.Object, xl.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(j<T, R> jVar, sm.g<? super R> gVar, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f28322g = jVar;
            this.f28323h = gVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(this.f28322g, this.f28323h, dVar);
            aVar.f28321f = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f28320e;
            if (i10 == 0) {
                mf.a0.k(obj);
                a0 a0Var = new a0();
                j<T, R> jVar = this.f28322g;
                sm.f<S> fVar = jVar.f28318d;
                C0505a c0505a = new C0505a(a0Var, (e0) this.f28321f, jVar, this.f28323h);
                this.f28320e = 1;
                if (fVar.a(c0505a, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public j(fm.q<? super sm.g<? super R>, ? super T, ? super xl.d<? super tl.l>, ? extends Object> qVar, sm.f<? extends T> fVar, xl.f fVar2, int i10, rm.f fVar3) {
        super(i10, fVar2, fVar3, fVar);
        this.f28319e = qVar;
    }

    @Override // tm.f
    public final f<R> g(xl.f fVar, int i10, rm.f fVar2) {
        return new j(this.f28319e, this.f28318d, fVar, i10, fVar2);
    }

    @Override // tm.h
    public final Object j(sm.g<? super R> gVar, xl.d<? super tl.l> dVar) {
        Object s10 = bi.r.s(new a(this, gVar, null), dVar);
        return s10 == yl.a.COROUTINE_SUSPENDED ? s10 : tl.l.f28297a;
    }
}
