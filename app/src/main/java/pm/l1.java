package pm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pm.g1;
import xl.f;

/* loaded from: classes2.dex */
public class l1 implements g1, p, u1 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24361a = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* loaded from: classes2.dex */
    public static final class a<T> extends j<T> {

        /* renamed from: i */
        public final l1 f24362i;

        public a(xl.d<? super T> dVar, l1 l1Var) {
            super(1, dVar);
            this.f24362i = l1Var;
        }

        @Override // pm.j
        public final String A() {
            return "AwaitContinuation";
        }

        @Override // pm.j
        public final Throwable s(l1 l1Var) {
            Throwable c10;
            Object d02 = this.f24362i.d0();
            return (!(d02 instanceof c) || (c10 = ((c) d02).c()) == null) ? d02 instanceof u ? ((u) d02).f24396a : l1Var.v() : c10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends k1 {

        /* renamed from: e */
        public final l1 f24363e;

        /* renamed from: f */
        public final c f24364f;

        /* renamed from: g */
        public final o f24365g;

        /* renamed from: h */
        public final Object f24366h;

        public b(l1 l1Var, c cVar, o oVar, Object obj) {
            this.f24363e = l1Var;
            this.f24364f = cVar;
            this.f24365g = oVar;
            this.f24366h = obj;
        }

        @Override // pm.w
        public final void R(Throwable th2) {
            l1 l1Var = this.f24363e;
            c cVar = this.f24364f;
            o oVar = this.f24365g;
            Object obj = this.f24366h;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.f24361a;
            l1Var.getClass();
            o o02 = l1.o0(oVar);
            if (o02 == null || !l1Var.w0(cVar, o02, obj)) {
                l1Var.A(l1Var.T(cVar, obj));
            }
        }

        @Override // fm.l
        public final /* bridge */ /* synthetic */ tl.l k(Throwable th2) {
            R(th2);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements b1 {
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a */
        public final q1 f24367a;
        private volatile /* synthetic */ int _isCompleting = 0;
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        public c(q1 q1Var, Throwable th2) {
            this.f24367a = q1Var;
            this._rootCause = th2;
        }

        @Override // pm.b1
        public final boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        public final void b(Throwable th2) {
            Throwable th3 = (Throwable) this._rootCause;
            if (th3 == null) {
                this._rootCause = th2;
            } else if (th2 == th3) {
            } else {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th2;
                } else if (obj instanceof Throwable) {
                    if (th2 == obj) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th2);
                    this._exceptionsHolder = arrayList;
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        public final Throwable c() {
            return (Throwable) this._rootCause;
        }

        public final boolean d() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean e() {
            return this._isCompleting;
        }

        public final boolean f() {
            if (this._exceptionsHolder == n1.f24377e) {
                return true;
            }
            return false;
        }

        public final ArrayList g(Throwable th2) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th3 = (Throwable) this._rootCause;
            if (th3 != null) {
                arrayList.add(0, th3);
            }
            if (th2 != null && !gm.l.a(th2, th3)) {
                arrayList.add(th2);
            }
            this._exceptionsHolder = n1.f24377e;
            return arrayList;
        }

        public final void h() {
            this._isCompleting = 1;
        }

        @Override // pm.b1
        public final q1 q() {
            return this.f24367a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("Finishing[cancelling=");
            a10.append(d());
            a10.append(", completing=");
            a10.append((boolean) this._isCompleting);
            a10.append(", rootCause=");
            a10.append((Throwable) this._rootCause);
            a10.append(", exceptions=");
            a10.append(this._exceptionsHolder);
            a10.append(", list=");
            a10.append(this.f24367a);
            a10.append(']');
            return a10.toString();
        }
    }

    public l1(boolean z10) {
        this._state = z10 ? n1.f24379g : n1.f24378f;
        this._parentHandle = null;
    }

    public static o o0(um.k kVar) {
        while (kVar.M()) {
            kVar = kVar.K();
        }
        while (true) {
            kVar = kVar.J();
            if (!kVar.M()) {
                if (kVar instanceof o) {
                    return (o) kVar;
                }
                if (kVar instanceof q1) {
                    return null;
                }
            }
        }
    }

    public static String u0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.d()) {
                return "Cancelling";
            }
            if (cVar.e()) {
                return "Completing";
            }
        } else if (!(obj instanceof b1)) {
            return obj instanceof u ? "Cancelled" : "Completed";
        } else if (!((b1) obj).a()) {
            return "New";
        }
        return "Active";
    }

    public void A(Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x00c1 A[EDGE_INSN: B:198:0x00c1->B:170:0x00c1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.l1.B(java.lang.Object):boolean");
    }

    @Override // pm.g1
    public final n C(l1 l1Var) {
        return (n) g1.a.a(this, true, new o(l1Var), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [pm.a1] */
    @Override // pm.g1
    public final q0 I(boolean z10, boolean z11, fm.l<? super Throwable, tl.l> lVar) {
        k1 k1Var;
        q1 a1Var;
        u uVar;
        Throwable th2;
        boolean z12;
        Throwable th3 = null;
        if (z10) {
            if (lVar instanceof i1) {
                k1Var = (i1) lVar;
            } else {
                k1Var = null;
            }
            if (k1Var == null) {
                k1Var = new e1(lVar);
            }
        } else {
            if (lVar instanceof k1) {
                k1Var = (k1) lVar;
            } else {
                k1Var = null;
            }
            if (k1Var == null) {
                k1Var = new f1(lVar);
            }
        }
        k1Var.f24358d = this;
        while (true) {
            Object d02 = d0();
            boolean z13 = false;
            if (d02 instanceof t0) {
                t0 t0Var = (t0) d02;
                if (t0Var.f24394a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24361a;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, d02, k1Var)) {
                            z13 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != d02) {
                            break;
                        }
                    }
                    if (z13) {
                        return k1Var;
                    }
                } else {
                    q1 q1Var = new q1();
                    if (t0Var.f24394a) {
                        a1Var = q1Var;
                    } else {
                        a1Var = new a1(q1Var);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24361a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, t0Var, a1Var) && atomicReferenceFieldUpdater2.get(this) == t0Var) {
                    }
                }
            } else if (d02 instanceof b1) {
                q1 q10 = ((b1) d02).q();
                if (q10 == null) {
                    if (d02 != null) {
                        s0((k1) d02);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    q0 q0Var = s1.f24388a;
                    if (z10 && (d02 instanceof c)) {
                        synchronized (d02) {
                            th2 = ((c) d02).c();
                            if (th2 == null || ((lVar instanceof o) && !((c) d02).e())) {
                                m1 m1Var = new m1(k1Var, this, d02);
                                while (true) {
                                    int Q = q10.K().Q(k1Var, q10, m1Var);
                                    if (Q != 1) {
                                        if (Q == 2) {
                                            z12 = false;
                                            break;
                                        }
                                    } else {
                                        z12 = true;
                                        break;
                                    }
                                }
                                if (z12) {
                                    if (th2 == null) {
                                        return k1Var;
                                    }
                                    q0Var = k1Var;
                                }
                            }
                            tl.l lVar2 = tl.l.f28297a;
                        }
                    } else {
                        th2 = null;
                    }
                    if (th2 != null) {
                        if (z11) {
                            lVar.k(th2);
                        }
                        return q0Var;
                    }
                    m1 m1Var2 = new m1(k1Var, this, d02);
                    while (true) {
                        int Q2 = q10.K().Q(k1Var, q10, m1Var2);
                        if (Q2 != 1) {
                            if (Q2 == 2) {
                                break;
                            }
                        } else {
                            z13 = true;
                            break;
                        }
                    }
                    if (z13) {
                        return k1Var;
                    }
                }
            } else {
                if (z11) {
                    if (d02 instanceof u) {
                        uVar = (u) d02;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null) {
                        th3 = uVar.f24396a;
                    }
                    lVar.k(th3);
                }
                return s1.f24388a;
            }
        }
    }

    public void K(CancellationException cancellationException) {
        B(cancellationException);
    }

    public final boolean M(Throwable th2) {
        if (k0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        n nVar = (n) this._parentHandle;
        if (nVar != null && nVar != s1.f24388a) {
            if (nVar.t(th2) || z10) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public String N() {
        return "Job was cancelled";
    }

    public boolean O(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return B(th2) && V();
    }

    public final void Q(b1 b1Var, Object obj) {
        u uVar;
        Throwable th2;
        n nVar = (n) this._parentHandle;
        if (nVar != null) {
            nVar.c();
            this._parentHandle = s1.f24388a;
        }
        x xVar = null;
        if (obj instanceof u) {
            uVar = (u) obj;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            th2 = uVar.f24396a;
        } else {
            th2 = null;
        }
        if (b1Var instanceof k1) {
            try {
                ((k1) b1Var).R(th2);
                return;
            } catch (Throwable th3) {
                g0(new x("Exception in completion handler " + b1Var + " for " + this, th3));
                return;
            }
        }
        q1 q10 = b1Var.q();
        if (q10 != null) {
            for (um.k kVar = (um.k) q10.I(); !gm.l.a(kVar, q10); kVar = kVar.J()) {
                if (kVar instanceof k1) {
                    k1 k1Var = (k1) kVar;
                    try {
                        k1Var.R(th2);
                    } catch (Throwable th4) {
                        if (xVar != null) {
                            ih.v.b(xVar, th4);
                        } else {
                            xVar = new x("Exception in completion handler " + k1Var + " for " + this, th4);
                            tl.l lVar = tl.l.f28297a;
                        }
                    }
                }
            }
            if (xVar != null) {
                g0(xVar);
            }
        }
    }

    @Override // pm.g1
    public final Object R(xl.d<? super tl.l> dVar) {
        boolean z10;
        while (true) {
            Object d02 = d0();
            if (!(d02 instanceof b1)) {
                z10 = false;
                break;
            } else if (t0(d02) >= 0) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            bi.m0.j(dVar.e());
            return tl.l.f28297a;
        }
        j jVar = new j(1, mf.a0.i(dVar));
        jVar.u();
        jVar.z(new r0(k(new x1(jVar))));
        Object t10 = jVar.t();
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        if (t10 != aVar) {
            t10 = tl.l.f28297a;
        }
        if (t10 == aVar) {
            return t10;
        }
        return tl.l.f28297a;
    }

    public final Throwable S(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof Throwable;
        }
        if (z10) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new h1(N(), null, this);
            }
            return th2;
        } else if (obj != null) {
            return ((u1) obj).X();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    public final Object T(c cVar, Object obj) {
        u uVar;
        Throwable U;
        Object obj2;
        boolean z10;
        Throwable th2 = null;
        if (obj instanceof u) {
            uVar = (u) obj;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            th2 = uVar.f24396a;
        }
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> g10 = cVar.g(th2);
            U = U(cVar, g10);
            if (U != null && g10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g10.size()));
                for (Throwable th3 : g10) {
                    if (th3 != U && th3 != U && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        ih.v.b(U, th3);
                    }
                }
            }
        }
        if (U != null && U != th2) {
            obj = new u(U, false);
        }
        if (U != null) {
            if (!M(U) && !f0(U)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (obj != null) {
                    u.f24395b.compareAndSet((u) obj, 0, 1);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        q0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24361a;
        if (obj instanceof b1) {
            obj2 = new c1((b1) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, obj2) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        Q(cVar, obj);
        return obj;
    }

    public final Throwable U(c cVar, ArrayList arrayList) {
        Object obj;
        boolean z10;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!cVar.d()) {
                return null;
            }
            return new h1(N(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof d2) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof d2)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean V() {
        return true;
    }

    @Override // pm.u1
    public final CancellationException X() {
        Throwable th2;
        Object d02 = d0();
        CancellationException cancellationException = null;
        if (d02 instanceof c) {
            th2 = ((c) d02).c();
        } else if (d02 instanceof u) {
            th2 = ((u) d02).f24396a;
        } else if (!(d02 instanceof b1)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + d02).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = th2;
        }
        if (cancellationException == null) {
            StringBuilder a10 = android.support.v4.media.d.a("Parent job is ");
            a10.append(u0(d02));
            return new h1(a10.toString(), th2, this);
        }
        return cancellationException;
    }

    public boolean Y() {
        return this instanceof r;
    }

    @Override // xl.f
    public final <R> R Z(R r10, fm.p<? super R, ? super f.b, ? extends R> pVar) {
        return pVar.A(r10, this);
    }

    @Override // pm.g1
    public boolean a() {
        Object d02 = d0();
        return (d02 instanceof b1) && ((b1) d02).a();
    }

    public final q1 a0(b1 b1Var) {
        q1 q10 = b1Var.q();
        if (q10 == null) {
            if (b1Var instanceof t0) {
                return new q1();
            }
            if (b1Var instanceof k1) {
                s0((k1) b1Var);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + b1Var).toString());
        }
        return q10;
    }

    @Override // xl.f.b, xl.f
    public final <E extends f.b> E b(f.c<E> cVar) {
        return (E) f.b.a.a(this, cVar);
    }

    @Override // pm.g1
    public final boolean b0() {
        return !(d0() instanceof b1);
    }

    public final n c0() {
        return (n) this._parentHandle;
    }

    public final Object d0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof um.s)) {
                return obj;
            }
            ((um.s) obj).c(this);
        }
    }

    public boolean f0(Throwable th2) {
        return false;
    }

    public void g0(x xVar) {
        throw xVar;
    }

    @Override // xl.f.b
    public final f.c<?> getKey() {
        return g1.b.f24341a;
    }

    @Override // pm.g1
    public void h(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new h1(N(), null, this);
        }
        K(cancellationException);
    }

    @Override // pm.p
    public final void i0(l1 l1Var) {
        B(l1Var);
    }

    @Override // pm.g1
    public final boolean isCancelled() {
        Object d02 = d0();
        return (d02 instanceof u) || ((d02 instanceof c) && ((c) d02).d());
    }

    public final void j0(g1 g1Var) {
        if (g1Var == null) {
            this._parentHandle = s1.f24388a;
            return;
        }
        g1Var.start();
        n C = g1Var.C(this);
        this._parentHandle = C;
        if (b0()) {
            C.c();
            this._parentHandle = s1.f24388a;
        }
    }

    @Override // pm.g1
    public final q0 k(fm.l<? super Throwable, tl.l> lVar) {
        return I(false, true, lVar);
    }

    public boolean k0() {
        return this instanceof d;
    }

    public final boolean l0(Object obj) {
        Object v02;
        do {
            v02 = v0(d0(), obj);
            if (v02 == n1.f24373a) {
                return false;
            }
            if (v02 == n1.f24374b) {
                return true;
            }
        } while (v02 == n1.f24375c);
        A(v02);
        return true;
    }

    public final Object m0(Object obj) {
        Object v02;
        u uVar;
        do {
            v02 = v0(d0(), obj);
            if (v02 == n1.f24373a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th2 = null;
                if (obj instanceof u) {
                    uVar = (u) obj;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    th2 = uVar.f24396a;
                }
                throw new IllegalStateException(str, th2);
            }
        } while (v02 == n1.f24375c);
        return v02;
    }

    public String n0() {
        return getClass().getSimpleName();
    }

    public final void p0(q1 q1Var, Throwable th2) {
        x xVar = null;
        for (um.k kVar = (um.k) q1Var.I(); !gm.l.a(kVar, q1Var); kVar = kVar.J()) {
            if (kVar instanceof i1) {
                k1 k1Var = (k1) kVar;
                try {
                    k1Var.R(th2);
                } catch (Throwable th3) {
                    if (xVar != null) {
                        ih.v.b(xVar, th3);
                    } else {
                        xVar = new x("Exception in completion handler " + k1Var + " for " + this, th3);
                        tl.l lVar = tl.l.f28297a;
                    }
                }
            }
        }
        if (xVar != null) {
            g0(xVar);
        }
        M(th2);
    }

    public void q0(Object obj) {
    }

    public void r0() {
    }

    @Override // xl.f
    public final xl.f s(xl.f fVar) {
        gm.l.f(fVar, "context");
        return f.a.a(this, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x002a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0(pm.k1 r5) {
        /*
            r4 = this;
            pm.q1 r0 = new pm.q1
            r0.<init>()
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = um.k.f28915b
            r1.lazySet(r0, r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = um.k.f28914a
            r1.lazySet(r0, r5)
        L12:
            java.lang.Object r1 = r5.I()
            r2 = 0
            if (r1 == r5) goto L1a
            goto L2f
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = um.k.f28914a
        L1c:
            boolean r3 = r1.compareAndSet(r5, r5, r0)
            if (r3 == 0) goto L24
            r2 = 1
            goto L2a
        L24:
            java.lang.Object r3 = r1.get(r5)
            if (r3 == r5) goto L1c
        L2a:
            if (r2 == 0) goto L12
            r0.F(r5)
        L2f:
            um.k r1 = r5.J()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = pm.l1.f24361a
        L35:
            boolean r0 = r2.compareAndSet(r4, r5, r1)
            if (r0 == 0) goto L3c
            goto L42
        L3c:
            java.lang.Object r0 = r2.get(r4)
            if (r0 == r5) goto L35
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.l1.s0(pm.k1):void");
    }

    @Override // pm.g1
    public final boolean start() {
        int t02;
        do {
            t02 = t0(d0());
            if (t02 == 0) {
                return false;
            }
        } while (t02 != 1);
        return true;
    }

    public final int t0(Object obj) {
        boolean z10 = false;
        if (obj instanceof t0) {
            if (((t0) obj).f24394a) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24361a;
            t0 t0Var = n1.f24379g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, t0Var)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z10) {
                return -1;
            }
            r0();
            return 1;
        } else if (!(obj instanceof a1)) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24361a;
            q1 q1Var = ((a1) obj).f24322a;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, q1Var)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    break;
                }
            }
            if (!z10) {
                return -1;
            }
            r0();
            return 1;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(n0() + '{' + u0(d0()) + '}');
        sb2.append('@');
        sb2.append(g0.j(this));
        return sb2.toString();
    }

    @Override // pm.g1
    public final CancellationException v() {
        Object d02 = d0();
        CancellationException cancellationException = null;
        if (d02 instanceof c) {
            Throwable c10 = ((c) d02).c();
            if (c10 != null) {
                String str = getClass().getSimpleName() + " is cancelling";
                if (c10 instanceof CancellationException) {
                    cancellationException = (CancellationException) c10;
                }
                if (cancellationException == null) {
                    if (str == null) {
                        str = N();
                    }
                    return new h1(str, c10, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(d02 instanceof b1)) {
            if (d02 instanceof u) {
                Throwable th2 = ((u) d02).f24396a;
                if (th2 instanceof CancellationException) {
                    cancellationException = (CancellationException) th2;
                }
                if (cancellationException == null) {
                    return new h1(N(), th2, this);
                }
                return cancellationException;
            }
            return new h1(getClass().getSimpleName() + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Throwable, T] */
    public final Object v0(Object obj, Object obj2) {
        c1 c1Var;
        boolean z10;
        c cVar;
        u uVar;
        o oVar;
        um.x xVar;
        if (!(obj instanceof b1)) {
            return n1.f24373a;
        }
        boolean z11 = false;
        if (((obj instanceof t0) || (obj instanceof k1)) && !(obj instanceof o) && !(obj2 instanceof u)) {
            b1 b1Var = (b1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24361a;
            if (obj2 instanceof b1) {
                c1Var = new c1((b1) obj2);
            } else {
                c1Var = obj2;
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                q0(obj2);
                Q(b1Var, obj2);
                z11 = true;
            }
            if (z11) {
                return obj2;
            }
            return n1.f24375c;
        }
        b1 b1Var2 = (b1) obj;
        q1 a02 = a0(b1Var2);
        if (a02 == null) {
            return n1.f24375c;
        }
        o oVar2 = null;
        if (b1Var2 instanceof c) {
            cVar = (c) b1Var2;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(a02, null);
        }
        gm.a0 a0Var = new gm.a0();
        synchronized (cVar) {
            if (cVar.e()) {
                xVar = n1.f24373a;
            } else {
                cVar.h();
                if (cVar != b1Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24361a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, cVar)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                            break;
                        }
                    }
                    if (!z11) {
                        xVar = n1.f24375c;
                    }
                }
                boolean d10 = cVar.d();
                if (obj2 instanceof u) {
                    uVar = (u) obj2;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    cVar.b(uVar.f24396a);
                }
                ?? c10 = Boolean.valueOf(d10 ^ true).booleanValue() ? cVar.c() : 0;
                a0Var.f15485a = c10;
                tl.l lVar = tl.l.f28297a;
                if (c10 != 0) {
                    p0(a02, c10);
                }
                if (b1Var2 instanceof o) {
                    oVar = (o) b1Var2;
                } else {
                    oVar = null;
                }
                if (oVar == null) {
                    q1 q10 = b1Var2.q();
                    if (q10 != null) {
                        oVar2 = o0(q10);
                    }
                } else {
                    oVar2 = oVar;
                }
                if (oVar2 != null && w0(cVar, oVar2, obj2)) {
                    return n1.f24374b;
                }
                return T(cVar, obj2);
            }
            return xVar;
        }
    }

    public final boolean w0(c cVar, o oVar, Object obj) {
        while (g1.a.a(oVar.f24380e, false, new b(this, cVar, oVar, obj), 1) == s1.f24388a) {
            oVar = o0(oVar);
            if (oVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // xl.f
    public final xl.f y(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }
}
