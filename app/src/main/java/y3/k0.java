package y3;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.u;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import om.d;
import pm.a2;
import pm.z1;
import y3.b0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S extends y3.b0
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public abstract class k0<S extends b0> {

    /* renamed from: a */
    public final m0 f30969a;

    /* renamed from: b */
    public final pm.e0 f30970b;

    /* renamed from: c */
    public final k0<S>.b f30971c;

    /* renamed from: d */
    public final ConcurrentHashMap<String, Object> f30972d;

    /* renamed from: e */
    public final Set<String> f30973e;

    @zl.e(c = "com.airbnb.mvrx.MavericksViewModel$1", f = "MavericksViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ k0<S> f30974e;

        /* renamed from: f */
        public final /* synthetic */ S f30975f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0<S> k0Var, S s10, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f30974e = k0Var;
            this.f30975f = s10;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f30974e, this.f30975f, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            k0<S> k0Var = this.f30974e;
            tb.a.n(tb.a.k(k0Var.f30971c.f31078c.d(), true), this.f30975f, true);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes.dex */
    public final class b extends u<S> {

        /* loaded from: classes.dex */
        public static final class a extends gm.m implements fm.l<u<S>, q> {

            /* renamed from: b */
            public final /* synthetic */ k0<S> f30976b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k0<S> k0Var) {
                super(1);
                this.f30976b = k0Var;
            }

            @Override // fm.l
            public final q k(Object obj) {
                gm.l.f((u) obj, "it");
                this.f30976b.f30969a.getClass();
                return q.No;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(y3.k0 r8) {
            /*
                r7 = this;
                l2.k0 r6 = new l2.k0
                y3.m0 r0 = r8.f30969a
                boolean r1 = r0.f30980a
                y3.d0<S> r2 = r0.f30981b
                pm.e0 r3 = r0.f30982c
                xl.f r4 = r0.f30983d
                y3.k0$b$a r5 = new y3.k0$b$a
                r5.<init>(r8)
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                r7.<init>(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y3.k0.b.<init>(y3.k0):void");
        }
    }

    public k0(S s10, n0 n0Var) {
        gm.l.f(s10, "initialState");
        gm.l.f(n0Var, "configFactory");
        if (oc.g1.f22981b != null) {
            a2 a10 = bi.z0.a();
            wm.c cVar = pm.o0.f24381a;
            um.f b10 = bi.r.b(a10.s(um.q.f28935a.q0()).s(n0Var.f30991b));
            m0 m0Var = new m0(b10, n0Var.f30990a, new f(s10, b10, n0Var.f30992c), n0Var.f30993d);
            Iterator it = n0Var.f30994e.iterator();
            while (it.hasNext()) {
                ((fm.p) it.next()).A(this, m0Var);
            }
            this.f30969a = m0Var;
            pm.e0 e0Var = m0Var.f30982c;
            this.f30970b = e0Var;
            this.f30971c = new b(this);
            this.f30972d = new ConcurrentHashMap<>();
            this.f30973e = Collections.newSetFromMap(new ConcurrentHashMap());
            if (m0Var.f30980a) {
                bi.z0.g(e0Var, pm.o0.f24381a, 0, new a(this, s10, null), 2);
                return;
            }
            return;
        }
        throw new IllegalStateException("You must initialize Mavericks. Add Mavericks.initialize(...) to your Application.onCreate().".toString());
    }

    public static z1 a(k0 k0Var, fm.l lVar, fm.p pVar) {
        pm.e0 e0Var;
        fm.p zVar;
        xl.g gVar = null;
        int i10 = 2;
        k0Var.getClass();
        k0<S>.b bVar = k0Var.f30971c;
        bVar.getClass();
        q qVar = (q) bVar.f31076a.f19042b.k(bVar);
        if (qVar != q.No) {
            if (qVar == q.WithLoading) {
                bVar.a(new w(pVar));
            }
            e0Var = bVar.f31077b;
            zVar = new x(null);
            i10 = 3;
        } else {
            bVar.a(new y(pVar, null));
            e0Var = bVar.f31077b;
            gVar = xl.g.f30632a;
            zVar = new z(lVar, bVar, pVar, null, null);
        }
        return bi.z0.g(e0Var, gVar, 0, zVar, i10);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.lifecycle.t, com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1] */
    public final z1 b(sm.f fVar, androidx.lifecycle.u uVar, i iVar, fm.p pVar) {
        gm.l.f(fVar, "<this>");
        gm.l.f(iVar, "deliveryMode");
        if (uVar != null) {
            ConcurrentHashMap<String, Object> concurrentHashMap = this.f30972d;
            final Set<String> set = this.f30973e;
            gm.l.e(set, "activeSubscriptions");
            gm.l.f(concurrentHashMap, "lastDeliveredStates");
            Boolean bool = e0.f30944a;
            gm.l.e(bool, "FORCE_DISABLE_LIFECYCLE_AWARE_OBSERVER");
            if (!bool.booleanValue()) {
                if (iVar instanceof e1) {
                    final String b10 = iVar.b();
                    gm.l.f(b10, "subscriptionId");
                    ?? r82 = new androidx.lifecycle.g() { // from class: com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1
                        @Override // androidx.lifecycle.g
                        public final void c(u uVar2) {
                            if (!set.contains(b10)) {
                                set.add(b10);
                                return;
                            }
                            String str = b10;
                            throw new IllegalStateException(d.Q("\n        Subscribing with a duplicate subscription id: " + str + ".\n        If you have multiple uniqueOnly subscriptions in a Mavericks view that listen to the same properties\n        you must use a custom subscription id. If you are using a custom MavericksView, make sure you are using the proper\n        lifecycle owner. See BaseMvRxFragment for an example.\n").toString());
                        }

                        @Override // androidx.lifecycle.g
                        public final void onDestroy(u uVar2) {
                            set.remove(b10);
                        }

                        @Override // androidx.lifecycle.g
                        public final /* synthetic */ void onPause(u uVar2) {
                        }

                        @Override // androidx.lifecycle.g
                        public final /* synthetic */ void onResume(u uVar2) {
                        }

                        @Override // androidx.lifecycle.g
                        public final /* synthetic */ void onStart(u uVar2) {
                        }

                        @Override // androidx.lifecycle.g
                        public final /* synthetic */ void onStop(u uVar2) {
                        }
                    };
                    uVar.a0().a(r82);
                    fVar = new sm.k0(new n(concurrentHashMap, iVar, null), bi.r.t(new sm.u0(new s(uVar, new sm.v(new m(concurrentHashMap, iVar, null), new sm.n(fVar, new k(set, b10, uVar, r82, null))), null))));
                } else {
                    fVar = new sm.u0(new s(uVar, fVar, null));
                }
            }
            LifecycleCoroutineScopeImpl g10 = rm.l.g(uVar);
            n0 n0Var = oc.g1.f22981b;
            if (n0Var != null) {
                return bi.z0.g(bi.r.I(g10, n0Var.f30993d), null, 4, new l(fVar, pVar, null), 1);
            }
            throw new IllegalStateException("You must initialize Mavericks. Add Mavericks.initialize(...) to your Application.onCreate().".toString());
        }
        k0<S>.b bVar = this.f30971c;
        bVar.getClass();
        return bi.z0.g(bi.r.I(bVar.f31077b, (xl.f) bVar.f31076a.f19045e), null, 4, new a0(fVar, pVar, null), 1);
    }

    public final String toString() {
        return getClass().getSimpleName() + ' ' + this.f30971c.f31078c.d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k0(y3.b0 r1, y3.n0 r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L15
            y3.n0 r2 = oc.g1.f22981b
            if (r2 == 0) goto L9
            goto L15
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "You must initialize Mavericks. Add Mavericks.initialize(...) to your Application.onCreate()."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L15:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.k0.<init>(y3.b0, y3.n0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
