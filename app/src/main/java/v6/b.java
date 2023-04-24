package v6;

import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import androidx.lifecycle.u;
import bi.m0;
import bi.z0;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import i8.g0;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import nm.g;
import om.d;
import pm.e0;
import pm.o0;
import pm.q;
import pm.r;
import pm.z1;
import sm.k0;
import sm.n;
import sm.u0;
import sm.v;
import tl.l;
import u6.c0;
import u6.j;
import u6.k;
import u6.o;
import u6.y;
import ul.h;
import zl.i;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S extends u6.o
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public abstract class b<S extends o> extends s0 {

    /* renamed from: d */
    public final f f29125d;

    /* renamed from: e */
    public final u6.e<S> f29126e;

    /* renamed from: f */
    public final ConcurrentHashMap<String, Object> f29127f;

    /* renamed from: g */
    public final Set<String> f29128g;

    /* renamed from: h */
    public final y<S> f29129h;

    /* renamed from: i */
    public final String f29130i;

    @zl.e(c = "com.github.kilnn.mvrx.MavericksViewModel$1", f = "MavericksViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public final /* synthetic */ b<S> f29131e;

        /* renamed from: f */
        public final /* synthetic */ S f29132f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<S> bVar, S s10, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f29131e = bVar;
            this.f29132f = s10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f29131e, this.f29132f, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:157:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x01f6 A[SYNTHETIC] */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 563
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: v6.b.a.t(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: v6.b$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0527b extends gm.a implements fm.l<S, l> {
        public C0527b(r rVar) {
            super(rVar);
        }

        @Override // fm.l
        public final l k(Object obj) {
            o oVar = (o) obj;
            gm.l.f(oVar, "p0");
            ((q) this.f15478a).P(oVar);
            return l.f28297a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends m implements fm.l<S, S> {

        /* renamed from: b */
        public final /* synthetic */ fm.l<S, S> f29133b;

        /* renamed from: c */
        public final /* synthetic */ b<S> f29134c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(fm.l<? super S, ? extends S> lVar, b<S> bVar) {
            super(1);
            this.f29133b = lVar;
            this.f29134c = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // fm.l
        public final Object k(Object obj) {
            boolean z10;
            g hVar;
            Object obj2;
            boolean z11;
            o oVar = (o) obj;
            gm.l.f(oVar, "$this$set");
            o oVar2 = (o) this.f29133b.k(oVar);
            o oVar3 = (o) this.f29133b.k(oVar);
            boolean z12 = false;
            if (!gm.l.a(oVar2, oVar3)) {
                Field[] declaredFields = oVar2.getClass().getDeclaredFields();
                gm.l.e(declaredFields, "firstState::class.java.declaredFields");
                if (declaredFields.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    hVar = nm.d.f22475a;
                } else {
                    hVar = new h(declaredFields);
                }
                Iterator it = hVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        ((Field) obj2).setAccessible(true);
                        l lVar = l.f28297a;
                        Field field = (Field) obj2;
                        try {
                            z11 = !gm.l.a(field.get(oVar2), field.get(oVar3));
                            continue;
                        } catch (Throwable unused) {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Field field2 = (Field) obj2;
                StringBuilder a10 = android.support.v4.media.d.a("Impure reducer set on ");
                a10.append(this.f29134c.getClass().getSimpleName());
                if (field2 != null) {
                    a10.append("! ");
                    a10.append(field2.getName());
                    a10.append(" changed from ");
                    a10.append(field2.get(oVar2));
                    a10.append(" to ");
                    a10.append(field2.get(oVar3));
                    a10.append(". Ensure that your state properties properly implement hashCode.");
                    throw new IllegalArgumentException(a10.toString());
                }
                a10.append("! Differing states were provided by the same reducer.Ensure that your state properties properly implement hashCode. First state: ");
                a10.append(oVar2);
                a10.append(" -> Second state: ");
                a10.append(oVar3);
                throw new IllegalArgumentException(a10.toString());
            }
            y<S> yVar = this.f29134c.f29129h;
            if (yVar != null) {
                gm.l.f(oVar2, "newState");
                y.a<S> aVar = yVar.f28633b;
                if (aVar.f28635b == aVar.hashCode()) {
                    z12 = true;
                }
                if (z12) {
                    yVar.f28633b = new y.a<>(oVar2);
                } else {
                    throw new IllegalArgumentException((aVar.f28634a.getClass().getSimpleName() + " was mutated. State classes should be immutable.").toString());
                }
            }
            return oVar2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends m implements fm.a<String> {

        /* renamed from: b */
        public final /* synthetic */ b<S> f29135b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<S> bVar) {
            super(0);
            this.f29135b = bVar;
        }

        @Override // fm.a
        public final String m() {
            return this.f29135b.getClass().getSimpleName();
        }
    }

    public b(S s10, l0 l0Var) {
        y<S> yVar;
        gm.l.f(s10, "initialState");
        gm.l.f(l0Var, "savedStateHandle");
        f fVar = g0.f16666a;
        if (fVar != null) {
            this.f29125d = fVar;
            this.f29126e = new u6.e<>(s10, rm.l.h(this), fVar.f29152b);
            this.f29127f = new ConcurrentHashMap<>();
            this.f29128g = Collections.newSetFromMap(new ConcurrentHashMap());
            new tl.i(new d(this));
            if (fVar.f29151a) {
                yVar = new y<>(s10);
            } else {
                yVar = null;
            }
            this.f29129h = yVar;
            if (fVar.f29151a) {
                z0.g(rm.l.h(this), o0.f24381a, 0, new a(this, s10, null), 2);
            }
            String str = (String) l0Var.f2739a.get("mavericks:persisted_view_id");
            if (str == null) {
                StringBuilder a10 = android.support.v4.media.d.a("MavericksView_");
                a10.append(UUID.randomUUID());
                str = a10.toString();
                l0Var.d("mavericks:persisted_view_id", str);
            }
            this.f29130i = str;
            return;
        }
        throw new IllegalStateException("You must initialize Mavericks. Add Mavericks.initialize(...) to your Application.onCreate().".toString());
    }

    public static z1 f(b bVar, fm.l lVar, t tVar, p pVar, int i10) {
        t tVar2 = (i10 & 2) != 0 ? null : tVar;
        bVar.getClass();
        bVar.h(new v6.c(pVar, tVar2));
        return z0.g(rm.l.h(bVar), xl.g.f30632a, 0, new v6.d(lVar, bVar, pVar, tVar2, null), 2);
    }

    public static c0 i(b bVar) {
        return new c0(ul.q.M(ul.i.A(new String[]{bVar.f29130i, b0.a(c0.class).a(), null}), "_", null, null, null, 62));
    }

    public final Object e(xl.d<? super S> dVar) {
        r a10 = m0.a();
        C0527b c0527b = new C0527b(a10);
        u6.e<S> eVar = this.f29126e;
        eVar.getClass();
        eVar.f28538d.p(c0527b);
        Boolean bool = u6.p.f28602a;
        return a10.x0(dVar);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.github.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1, androidx.lifecycle.t] */
    public final z1 g(sm.f fVar, u uVar, u6.f fVar2, p pVar) {
        gm.l.f(fVar, "<this>");
        gm.l.f(fVar2, "deliveryMode");
        gm.l.f(pVar, "action");
        if (uVar != null) {
            ConcurrentHashMap<String, Object> concurrentHashMap = this.f29127f;
            final Set<String> set = this.f29128g;
            gm.l.e(set, "activeSubscriptions");
            gm.l.f(concurrentHashMap, "lastDeliveredStates");
            Boolean bool = u6.p.f28602a;
            gm.l.e(bool, "FORCE_DISABLE_LIFECYCLE_AWARE_OBSERVER");
            if (!bool.booleanValue()) {
                if (fVar2 instanceof c0) {
                    final String b10 = fVar2.b();
                    gm.l.f(b10, "subscriptionId");
                    ?? r82 = new androidx.lifecycle.g() { // from class: com.github.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1
                        @Override // androidx.lifecycle.g
                        public final void c(u uVar2) {
                            if (!set.contains(b10)) {
                                set.add(b10);
                                return;
                            }
                            String str = b10;
                            throw new IllegalStateException(d.Q("\n        Subscribing with a duplicate subscription id: " + str + ".\n        If you have multiple uniqueOnly subscriptions in a MvRx view that listen to the same properties\n        you must use a custom subscription id. If you are using a custom MvRxView, make sure you are using the proper\n        lifecycle owner. See BaseMvRxFragment for an example.\n").toString());
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
                    fVar = new k0(new k(concurrentHashMap, fVar2, null), bi.r.t(new u0(new u6.m(uVar, new v(new j(concurrentHashMap, fVar2, null), new n(fVar, new u6.h(set, b10, uVar, r82, null))), null))));
                } else {
                    fVar = new u0(new u6.m(uVar, fVar, null));
                }
            }
            LifecycleCoroutineScopeImpl g10 = rm.l.g(uVar);
            f fVar3 = g0.f16666a;
            if (fVar3 != null) {
                return z0.g(bi.r.I(g10, fVar3.f29153c), null, 4, new u6.i(fVar, pVar, null), 1);
            }
            throw new IllegalStateException("You must initialize Mavericks. Add Mavericks.initialize(...) to your Application.onCreate().".toString());
        }
        return z0.g(bi.r.I(rm.l.h(this), this.f29125d.f29153c), null, 4, new e(fVar, pVar, null), 1);
    }

    public final void h(fm.l<? super S, ? extends S> lVar) {
        if (this.f29125d.f29151a) {
            u6.e<S> eVar = this.f29126e;
            eVar.f28537c.p(new c(lVar, this));
        } else {
            this.f29126e.f28537c.p(lVar);
        }
        Boolean bool = u6.p.f28602a;
    }

    public final String toString() {
        return getClass().getSimpleName() + ' ' + this.f29126e.f28540f;
    }
}
