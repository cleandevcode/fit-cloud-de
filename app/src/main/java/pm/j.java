package pm;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pm.g1;
import um.k;

/* loaded from: classes2.dex */
public class j<T> extends m0<T> implements i<T>, zl.d {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24350g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_decision");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24351h = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: d */
    public final xl.d<T> f24352d;

    /* renamed from: e */
    public final xl.f f24353e;

    /* renamed from: f */
    public q0 f24354f;

    public j(int i10, xl.d dVar) {
        super(i10);
        this.f24352d = dVar;
        this.f24353e = dVar.e();
        this._decision = 0;
        this._state = b.f24323a;
    }

    public static Object D(t1 t1Var, Object obj, int i10, fm.l lVar, Object obj2) {
        if (obj instanceof u) {
            return obj;
        }
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (z10 || obj2 != null) {
            if (lVar != null || (((t1Var instanceof g) && !(t1Var instanceof c)) || obj2 != null)) {
                return new t(obj, t1Var instanceof g ? (g) t1Var : null, lVar, obj2, null, 16);
            }
            return obj;
        }
        return obj;
    }

    public static void y(Object obj, fm.l lVar) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final boolean B() {
        Object obj = this._state;
        if ((obj instanceof t) && ((t) obj).f24392d != null) {
            p();
            return false;
        }
        this._decision = 0;
        this._state = b.f24323a;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0020, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(java.lang.Object r7, int r8, fm.l<? super java.lang.Throwable, tl.l> r9) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof pm.t1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            r1 = r0
            pm.t1 r1 = (pm.t1) r1
            r4 = 0
            java.lang.Object r1 = D(r1, r7, r8, r9, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = pm.j.f24351h
        L12:
            boolean r5 = r4.compareAndSet(r6, r0, r1)
            if (r5 == 0) goto L1a
            r2 = 1
            goto L20
        L1a:
            java.lang.Object r5 = r4.get(r6)
            if (r5 == r0) goto L12
        L20:
            if (r2 == 0) goto L0
            boolean r7 = r6.x()
            if (r7 != 0) goto L2b
            r6.p()
        L2b:
            r6.q(r8)
            return
        L2f:
            boolean r8 = r0 instanceof pm.l
            if (r8 == 0) goto L48
            pm.l r0 = (pm.l) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r8 = pm.l.f24359c
            boolean r8 = r8.compareAndSet(r0, r2, r3)
            if (r8 == 0) goto L48
            if (r9 == 0) goto L47
            java.lang.Throwable r7 = r0.f24396a
            r6.o(r9, r7)
        L47:
            return
        L48:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Already resumed, but proposed with update "
            r9.append(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.j.C(java.lang.Object, int, fm.l):void");
    }

    public final um.x E(Object obj, Object obj2, fm.l<? super Throwable, tl.l> lVar) {
        boolean z10;
        do {
            Object obj3 = this._state;
            if (obj3 instanceof t1) {
                Object D = D((t1) obj3, obj, this.f24369c, lVar, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24351h;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, D)) {
                        z10 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        z10 = false;
                        continue;
                        break;
                    }
                }
            } else if (!(obj3 instanceof t) || obj2 == null || ((t) obj3).f24392d != obj2) {
                return null;
            } else {
                return k.f24356a;
            }
        } while (!z10);
        if (!x()) {
            p();
        }
        return k.f24356a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0020, code lost:
        continue;
     */
    @Override // pm.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(java.lang.Throwable r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._state
            boolean r1 = r0 instanceof pm.t1
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            pm.l r1 = new pm.l
            boolean r3 = r0 instanceof pm.g
            r1.<init>(r7, r8, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = pm.j.f24351h
        L11:
            boolean r5 = r4.compareAndSet(r7, r0, r1)
            r6 = 1
            if (r5 == 0) goto L1a
            r2 = 1
            goto L20
        L1a:
            java.lang.Object r5 = r4.get(r7)
            if (r5 == r0) goto L11
        L20:
            if (r2 == 0) goto L0
            if (r3 == 0) goto L27
            pm.g r0 = (pm.g) r0
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 == 0) goto L2d
            r7.n(r0, r8)
        L2d:
            boolean r8 = r7.x()
            if (r8 != 0) goto L36
            r7.p()
        L36:
            int r8 = r7.f24369c
            r7.q(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.j.G(java.lang.Throwable):boolean");
    }

    @Override // pm.i
    public final void H(b0 b0Var, tl.l lVar) {
        xl.d<T> dVar = this.f24352d;
        um.g gVar = dVar instanceof um.g ? (um.g) dVar : null;
        C(lVar, (gVar != null ? gVar.f28903d : null) == b0Var ? 4 : this.f24369c, null);
    }

    @Override // pm.i
    public final boolean a() {
        return this._state instanceof t1;
    }

    @Override // pm.m0
    public final void b(Object obj, CancellationException cancellationException) {
        boolean z10;
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof t1)) {
                if (obj2 instanceof u) {
                    return;
                }
                boolean z11 = false;
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.f24393e != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        t a10 = t.a(tVar, null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24351h;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a10)) {
                                z11 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        if (z11) {
                            g gVar = tVar.f24390b;
                            if (gVar != null) {
                                n(gVar, cancellationException);
                            }
                            fm.l<Throwable, tl.l> lVar = tVar.f24391c;
                            if (lVar != null) {
                                o(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24351h;
                    t tVar2 = new t(obj2, null, null, null, cancellationException, 14);
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, tVar2)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z11) {
                        return;
                    }
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // pm.m0
    public final xl.d<T> c() {
        return this.f24352d;
    }

    @Override // pm.m0
    public final Throwable d(Object obj) {
        Throwable d10 = super.d(obj);
        if (d10 != null) {
            return d10;
        }
        return null;
    }

    @Override // xl.d
    public final xl.f e() {
        return this.f24353e;
    }

    @Override // pm.i
    public final um.x f(Object obj, Object obj2) {
        return E(obj, obj2, null);
    }

    @Override // zl.d
    public final zl.d g() {
        xl.d<T> dVar = this.f24352d;
        if (dVar instanceof zl.d) {
            return (zl.d) dVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pm.m0
    public final <T> T h(Object obj) {
        return obj instanceof t ? (T) ((t) obj).f24389a : obj;
    }

    @Override // pm.i
    public final void i() {
        q(this.f24369c);
    }

    @Override // pm.m0
    public final Object k() {
        return this._state;
    }

    @Override // xl.d
    public final void l(Object obj) {
        Throwable a10 = tl.g.a(obj);
        if (a10 != null) {
            obj = new u(a10, false);
        }
        C(obj, this.f24369c, null);
    }

    public final void m(fm.l<? super Throwable, tl.l> lVar, Throwable th2) {
        try {
            lVar.k(th2);
        } catch (Throwable th3) {
            xl.f fVar = this.f24353e;
            ih.v.g(fVar, new x("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void n(g gVar, Throwable th2) {
        try {
            gVar.a(th2);
        } catch (Throwable th3) {
            xl.f fVar = this.f24353e;
            ih.v.g(fVar, new x("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void o(fm.l<? super Throwable, tl.l> lVar, Throwable th2) {
        try {
            lVar.k(th2);
        } catch (Throwable th3) {
            xl.f fVar = this.f24353e;
            ih.v.g(fVar, new x("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void p() {
        q0 q0Var = this.f24354f;
        if (q0Var == null) {
            return;
        }
        q0Var.c();
        this.f24354f = s1.f24388a;
    }

    /* JADX WARN: Finally extract failed */
    public final void q(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        while (true) {
            int i11 = this._decision;
            boolean z13 = false;
            if (i11 != 0) {
                if (i11 == 1) {
                    z10 = false;
                } else {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f24350g.compareAndSet(this, 0, 2)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        xl.d<T> dVar = this.f24352d;
        if (i10 == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && (dVar instanceof um.g)) {
            if (i10 != 1 && i10 != 2) {
                z12 = false;
            } else {
                z12 = true;
            }
            int i12 = this.f24369c;
            if (z12 == ((i12 == 1 || i12 == 2) ? true : true)) {
                b0 b0Var = ((um.g) dVar).f28903d;
                xl.f e10 = dVar.e();
                if (b0Var.p0(e10)) {
                    b0Var.l0(e10, this);
                    return;
                }
                u0 a10 = c2.a();
                if (a10.w0()) {
                    a10.t0(this);
                    return;
                }
                a10.u0(true);
                try {
                    ih.v.n(this, this.f24352d, true);
                    do {
                    } while (a10.y0());
                } catch (Throwable th2) {
                    try {
                        j(th2, null);
                    } finally {
                        a10.q0(true);
                    }
                }
                return;
            }
        }
        ih.v.n(this, dVar, z11);
    }

    @Override // pm.i
    public final um.x r(Object obj, k.a aVar, fm.l lVar) {
        return E(obj, aVar, lVar);
    }

    public Throwable s(l1 l1Var) {
        return l1Var.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0072, code lost:
        if (r3 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0074, code lost:
        r1 = (pm.g1) r6.f24353e.b(pm.g1.b.f24341a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x007e, code lost:
        if (r1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0084, code lost:
        if (r1.a() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0087, code lost:
        r1 = r1.v();
        b(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x008e, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0093, code lost:
        return h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0098, code lost:
        throw ((pm.u) r0).f24396a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0024, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0025, code lost:
        if (r1 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0029, code lost:
        if (r6.f24354f != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x002b, code lost:
        v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x002e, code lost:
        if (r0 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0030, code lost:
        r0 = r6.f24352d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0034, code lost:
        if ((r0 instanceof um.g) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0036, code lost:
        r5 = (um.g) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0039, code lost:
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x003b, code lost:
        r0 = r5.q(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x003f, code lost:
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0042, code lost:
        p();
        G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x004a, code lost:
        return yl.a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x004b, code lost:
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x004d, code lost:
        r0 = r6.f24352d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0051, code lost:
        if ((r0 instanceof um.g) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0053, code lost:
        r5 = (um.g) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0056, code lost:
        if (r5 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0058, code lost:
        r0 = r5.q(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x005c, code lost:
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x005f, code lost:
        p();
        G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0065, code lost:
        r0 = r6._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0069, code lost:
        if ((r0 instanceof pm.u) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x006b, code lost:
        r1 = r6.f24369c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x006d, code lost:
        if (r1 == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x006f, code lost:
        if (r1 != 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0071, code lost:
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t() {
        /*
            r6 = this;
            boolean r0 = r6.x()
        L4:
            int r1 = r6._decision
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto Lf
            r1 = 0
            goto L24
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = pm.j.f24350g
            boolean r1 = r1.compareAndSet(r6, r3, r4)
            if (r1 == 0) goto L4
            r1 = 1
        L24:
            r5 = 0
            if (r1 == 0) goto L4b
            pm.q0 r1 = r6.f24354f
            if (r1 != 0) goto L2e
            r6.v()
        L2e:
            if (r0 == 0) goto L48
            xl.d<T> r0 = r6.f24352d
            boolean r1 = r0 instanceof um.g
            if (r1 == 0) goto L39
            r5 = r0
            um.g r5 = (um.g) r5
        L39:
            if (r5 == 0) goto L48
            java.lang.Throwable r0 = r5.q(r6)
            if (r0 != 0) goto L42
            goto L48
        L42:
            r6.p()
            r6.G(r0)
        L48:
            yl.a r0 = yl.a.COROUTINE_SUSPENDED
            return r0
        L4b:
            if (r0 == 0) goto L65
            xl.d<T> r0 = r6.f24352d
            boolean r1 = r0 instanceof um.g
            if (r1 == 0) goto L56
            r5 = r0
            um.g r5 = (um.g) r5
        L56:
            if (r5 == 0) goto L65
            java.lang.Throwable r0 = r5.q(r6)
            if (r0 != 0) goto L5f
            goto L65
        L5f:
            r6.p()
            r6.G(r0)
        L65:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof pm.u
            if (r1 != 0) goto L94
            int r1 = r6.f24369c
            if (r1 == r4) goto L71
            if (r1 != r2) goto L72
        L71:
            r3 = 1
        L72:
            if (r3 == 0) goto L8f
            xl.f r1 = r6.f24353e
            pm.g1$b r2 = pm.g1.b.f24341a
            xl.f$b r1 = r1.b(r2)
            pm.g1 r1 = (pm.g1) r1
            if (r1 == 0) goto L8f
            boolean r2 = r1.a()
            if (r2 == 0) goto L87
            goto L8f
        L87:
            java.util.concurrent.CancellationException r1 = r1.v()
            r6.b(r0, r1)
            throw r1
        L8f:
            java.lang.Object r0 = r6.h(r0)
            return r0
        L94:
            pm.u r0 = (pm.u) r0
            java.lang.Throwable r0 = r0.f24396a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.j.t():java.lang.Object");
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A());
        sb2.append('(');
        sb2.append(g0.m(this.f24352d));
        sb2.append("){");
        Object obj = this._state;
        if (obj instanceof t1) {
            str = "Active";
        } else if (obj instanceof l) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(g0.j(this));
        return sb2.toString();
    }

    public final void u() {
        q0 v10 = v();
        if (v10 != null && (!(this._state instanceof t1))) {
            v10.c();
            this.f24354f = s1.f24388a;
        }
    }

    public final q0 v() {
        g1 g1Var = (g1) this.f24353e.b(g1.b.f24341a);
        if (g1Var == null) {
            return null;
        }
        q0 a10 = g1.a.a(g1Var, true, new m(this), 2);
        this.f24354f = a10;
        return a10;
    }

    @Override // pm.i
    public final um.x w(Throwable th2) {
        return E(new u(th2, false), null, null);
    }

    public final boolean x() {
        return (this.f24369c == 2) && ((um.g) this.f24352d).n();
    }

    @Override // pm.i
    public final void z(fm.l<? super Throwable, tl.l> lVar) {
        g d1Var;
        boolean z10;
        if (lVar instanceof g) {
            d1Var = (g) lVar;
        } else {
            d1Var = new d1(lVar);
        }
        while (true) {
            Object obj = this._state;
            boolean z11 = false;
            if (obj instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24351h;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, d1Var)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z11) {
                    return;
                }
            } else {
                Throwable th2 = null;
                if (!(obj instanceof g)) {
                    boolean z12 = obj instanceof u;
                    if (z12) {
                        u uVar = (u) obj;
                        uVar.getClass();
                        if (u.f24395b.compareAndSet(uVar, 0, 1)) {
                            if (obj instanceof l) {
                                if (!z12) {
                                    uVar = null;
                                }
                                if (uVar != null) {
                                    th2 = uVar.f24396a;
                                }
                                m(lVar, th2);
                                return;
                            }
                            return;
                        }
                        y(obj, lVar);
                        throw null;
                    } else if (obj instanceof t) {
                        t tVar = (t) obj;
                        if (tVar.f24390b == null) {
                            if (d1Var instanceof c) {
                                return;
                            }
                            Throwable th3 = tVar.f24393e;
                            if (th3 != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                m(lVar, th3);
                                return;
                            }
                            t a10 = t.a(tVar, d1Var, null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24351h;
                            while (true) {
                                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a10)) {
                                    z11 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                    break;
                                }
                            }
                            if (z11) {
                                return;
                            }
                        } else {
                            y(obj, lVar);
                            throw null;
                        }
                    } else if (d1Var instanceof c) {
                        return;
                    } else {
                        t tVar2 = new t(obj, d1Var, null, null, null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f24351h;
                        while (true) {
                            if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, tVar2)) {
                                z11 = true;
                                break;
                            } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                break;
                            }
                        }
                        if (z11) {
                            return;
                        }
                    }
                } else {
                    y(obj, lVar);
                    throw null;
                }
            }
        }
    }
}
