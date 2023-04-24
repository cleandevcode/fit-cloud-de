package um;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pm.g0;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28914a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28915b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28916c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes2.dex */
    public static abstract class a extends um.b {
        @Override // um.b
        public final void a(um.d<?> dVar, Object obj) {
            k g10;
            boolean z10 = false;
            boolean z11 = obj == null;
            k f10 = f();
            if (f10 == null || (g10 = g()) == null) {
                return;
            }
            t l10 = z11 ? l(g10) : g10;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f28914a;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(f10, dVar, l10)) {
                    if (atomicReferenceFieldUpdater.get(f10) != dVar) {
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10 && z11) {
                d(g10);
            }
        }

        @Override // um.b
        public final Object b(um.d<?> dVar) {
            boolean z10;
            while (true) {
                k k10 = k(dVar);
                if (k10 == null) {
                    return um.c.f28893b;
                }
                Object obj = k10._next;
                if (obj == dVar || dVar.h()) {
                    return null;
                }
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (dVar.b(sVar)) {
                        return um.c.f28893b;
                    }
                    sVar.c(k10);
                } else {
                    Object c10 = c(k10);
                    if (c10 != null) {
                        return c10;
                    }
                    if (j(obj)) {
                        continue;
                    } else {
                        c cVar = new c(k10, (k) obj, this);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f28914a;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(k10, obj, cVar)) {
                                if (atomicReferenceFieldUpdater.get(k10) != obj) {
                                    z10 = false;
                                    break;
                                }
                            } else {
                                z10 = true;
                                break;
                            }
                        }
                        if (z10) {
                            try {
                                if (cVar.c(k10) != l.f28925a) {
                                    return null;
                                }
                            } catch (Throwable th2) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f28914a;
                                while (!atomicReferenceFieldUpdater2.compareAndSet(k10, cVar, obj) && atomicReferenceFieldUpdater2.get(k10) == cVar) {
                                }
                                throw th2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        public abstract Object c(k kVar);

        public abstract void d(k kVar);

        public abstract void e(c cVar);

        public abstract k f();

        public abstract k g();

        public Object h(c cVar) {
            e(cVar);
            return null;
        }

        public void i(k kVar) {
        }

        public abstract boolean j(Object obj);

        public abstract k k(s sVar);

        public abstract t l(k kVar);
    }

    /* loaded from: classes2.dex */
    public static abstract class b extends um.d<k> {

        /* renamed from: b */
        public final k f28917b;

        /* renamed from: c */
        public k f28918c;

        public b(k kVar) {
            this.f28917b = kVar;
        }

        @Override // um.d
        public final void d(k kVar, Object obj) {
            boolean z10;
            k kVar2;
            k kVar3 = kVar;
            boolean z11 = false;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                kVar2 = this.f28917b;
            } else {
                kVar2 = this.f28918c;
            }
            if (kVar2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f28914a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(kVar3, this, kVar2)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(kVar3) != this) {
                        break;
                    }
                }
                if (z11 && z10) {
                    k kVar4 = this.f28917b;
                    k kVar5 = this.f28918c;
                    gm.l.c(kVar5);
                    kVar4.F(kVar5);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends s {

        /* renamed from: a */
        public final k f28919a;

        /* renamed from: b */
        public final k f28920b;

        /* renamed from: c */
        public final a f28921c;

        public c(k kVar, k kVar2, a aVar) {
            this.f28919a = kVar;
            this.f28920b = kVar2;
            this.f28921c = aVar;
        }

        @Override // um.s
        public final um.d<?> a() {
            um.d<?> dVar = this.f28921c.f28890a;
            if (dVar != null) {
                return dVar;
            }
            gm.l.l("atomicOp");
            throw null;
        }

        @Override // um.s
        public final Object c(Object obj) {
            Object f10;
            Object obj2;
            boolean z10;
            if (obj != null) {
                k kVar = (k) obj;
                Object h10 = this.f28921c.h(this);
                if (h10 == l.f28925a) {
                    k kVar2 = this.f28920b;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f28914a;
                    t P = kVar2.P();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f28914a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(kVar, this, P)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(kVar) != this) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        this.f28921c.i(kVar);
                        kVar2.E();
                    }
                    return l.f28925a;
                }
                if (h10 != null) {
                    f10 = a().e(h10);
                } else {
                    f10 = a().f();
                }
                if (f10 == um.c.f28892a) {
                    obj2 = a();
                } else if (f10 == null) {
                    obj2 = this.f28921c.l(this.f28920b);
                } else {
                    obj2 = this.f28920b;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = k.f28914a;
                while (!atomicReferenceFieldUpdater3.compareAndSet(kVar, this, obj2) && atomicReferenceFieldUpdater3.get(kVar) == this) {
                }
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        public final void d() {
            this.f28921c.e(this);
        }

        @Override // um.s
        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("PrepareOp(op=");
            a10.append(a());
            a10.append(')');
            return a10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static class d<T> extends a {

        /* renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f28922c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_affectedNode");

        /* renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f28923d = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;

        /* renamed from: b */
        public final k f28924b;

        public d(j jVar) {
            this.f28924b = jVar;
        }

        @Override // um.k.a
        public Object c(k kVar) {
            if (kVar == this.f28924b) {
                return m6.a.f20387b;
            }
            return null;
        }

        @Override // um.k.a
        public final void d(k kVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f28914a;
            kVar.E();
        }

        @Override // um.k.a
        public final void e(c cVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28922c;
            k kVar = cVar.f28919a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, kVar) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28923d;
            k kVar2 = cVar.f28920b;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, kVar2) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
        }

        @Override // um.k.a
        public final k f() {
            return (k) this._affectedNode;
        }

        @Override // um.k.a
        public final k g() {
            return (k) this._originalNext;
        }

        @Override // um.k.a
        public final boolean j(Object obj) {
            if (obj instanceof t) {
                ((t) obj).f28939a.L();
                return true;
            }
            return false;
        }

        @Override // um.k.a
        public final k k(s sVar) {
            k kVar = this.f28924b;
            while (true) {
                Object obj = kVar._next;
                if (!(obj instanceof s)) {
                    return (k) obj;
                }
                s sVar2 = (s) obj;
                if (sVar.b(sVar2)) {
                    return null;
                }
                sVar2.c(this.f28924b);
            }
        }

        @Override // um.k.a
        public final t l(k kVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f28914a;
            return kVar.P();
        }

        public final k m() {
            k kVar = (k) this._affectedNode;
            gm.l.c(kVar);
            return kVar;
        }
    }

    public final boolean D(k kVar, j jVar) {
        boolean z10;
        f28915b.lazySet(kVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28914a;
        atomicReferenceFieldUpdater.lazySet(kVar, jVar);
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, kVar)) {
                if (atomicReferenceFieldUpdater.get(this) != jVar) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            kVar.F(jVar);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x003e, code lost:
        r7 = um.k.f28914a;
        r4 = ((um.t) r4).f28939a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0048, code lost:
        if (r7.compareAndSet(r3, r2, r4) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0050, code lost:
        if (r7.get(r3) == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0052, code lost:
        if (r5 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final um.k E() {
        /*
            r10 = this;
        L0:
            java.lang.Object r0 = r10._prev
            um.k r0 = (um.k) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L24
            if (r0 != r2) goto L10
            return r2
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = um.k.f28915b
        L12:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L1a
            r5 = 1
            goto L20
        L1a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r2
        L24:
            boolean r7 = r10.M()
            if (r7 == 0) goto L2b
            return r1
        L2b:
            if (r4 != 0) goto L2e
            return r2
        L2e:
            boolean r7 = r4 instanceof um.s
            if (r7 == 0) goto L38
            um.s r4 = (um.s) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r7 = r4 instanceof um.t
            if (r7 == 0) goto L5c
            if (r3 == 0) goto L57
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = um.k.f28914a
            um.t r4 = (um.t) r4
            um.k r4 = r4.f28939a
        L44:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L4c
            r5 = 1
            goto L52
        L4c:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L44
        L52:
            if (r5 != 0) goto L55
            goto L0
        L55:
            r2 = r3
            goto L6
        L57:
            java.lang.Object r2 = r2._prev
            um.k r2 = (um.k) r2
            goto L7
        L5c:
            r3 = r4
            um.k r3 = (um.k) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: um.k.E():um.k");
    }

    public final void F(k kVar) {
        boolean z10;
        do {
            k kVar2 = (k) kVar._prev;
            if (I() == kVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28915b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z10);
        if (M()) {
            kVar.E();
        }
    }

    public final Object I() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof s)) {
                return obj;
            }
            ((s) obj).c(this);
        }
    }

    public final k J() {
        k kVar;
        Object I = I();
        t tVar = I instanceof t ? (t) I : null;
        return (tVar == null || (kVar = tVar.f28939a) == null) ? (k) I : kVar;
    }

    public final k K() {
        k E = E();
        if (E == null) {
            Object obj = this._prev;
            while (true) {
                E = (k) obj;
                if (!E.M()) {
                    break;
                }
                obj = E._prev;
            }
        }
        return E;
    }

    public final void L() {
        k kVar = this;
        while (true) {
            Object I = kVar.I();
            if (!(I instanceof t)) {
                kVar.E();
                return;
            }
            kVar = ((t) I).f28939a;
        }
    }

    public boolean M() {
        return I() instanceof t;
    }

    public boolean N() {
        return O() == null;
    }

    public final k O() {
        k kVar;
        boolean z10;
        do {
            Object I = I();
            if (!(I instanceof t)) {
                if (I != this) {
                    kVar = (k) I;
                    t P = kVar.P();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28914a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, I, P)) {
                            if (atomicReferenceFieldUpdater.get(this) != I) {
                                z10 = false;
                                continue;
                                break;
                            }
                        } else {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return (k) I;
                }
            } else {
                return ((t) I).f28939a;
            }
        } while (!z10);
        kVar.E();
        return null;
    }

    public final t P() {
        t tVar = (t) this._removedRef;
        if (tVar == null) {
            t tVar2 = new t(this);
            f28916c.lazySet(this, tVar2);
            return tVar2;
        }
        return tVar;
    }

    public final int Q(k kVar, k kVar2, b bVar) {
        boolean z10;
        f28915b.lazySet(kVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28914a;
        atomicReferenceFieldUpdater.lazySet(kVar, kVar2);
        bVar.f28918c = kVar2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, kVar2, bVar)) {
                if (atomicReferenceFieldUpdater.get(this) != kVar2) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return bVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new gm.r(this) { // from class: um.k.e
        } + '@' + g0.j(this);
    }
}
