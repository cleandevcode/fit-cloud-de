package um;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pm.c2;
import pm.g0;
import pm.m0;
import pm.u0;

/* loaded from: classes2.dex */
public final class g<T> extends m0<T> implements zl.d, xl.d<T> {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28902h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: d */
    public final pm.b0 f28903d;

    /* renamed from: e */
    public final xl.d<T> f28904e;

    /* renamed from: f */
    public Object f28905f;

    /* renamed from: g */
    public final Object f28906g;

    public g(pm.b0 b0Var, zl.c cVar) {
        super(-1);
        this.f28903d = b0Var;
        this.f28904e = cVar;
        this.f28905f = h.f28907a;
        this.f28906g = z.b(e());
        this._reusableCancellableContinuation = null;
    }

    @Override // pm.m0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof pm.v) {
            ((pm.v) obj).f24402b.k(cancellationException);
        }
    }

    @Override // pm.m0
    public final xl.d<T> c() {
        return this;
    }

    @Override // xl.d
    public final xl.f e() {
        return this.f28904e.e();
    }

    @Override // zl.d
    public final zl.d g() {
        xl.d<T> dVar = this.f28904e;
        if (dVar instanceof zl.d) {
            return (zl.d) dVar;
        }
        return null;
    }

    @Override // pm.m0
    public final Object k() {
        Object obj = this.f28905f;
        this.f28905f = h.f28907a;
        return obj;
    }

    @Override // xl.d
    public final void l(Object obj) {
        Object uVar;
        xl.f e10 = this.f28904e.e();
        Throwable a10 = tl.g.a(obj);
        if (a10 == null) {
            uVar = obj;
        } else {
            uVar = new pm.u(a10, false);
        }
        if (this.f28903d.p0(e10)) {
            this.f28905f = uVar;
            this.f24369c = 0;
            this.f28903d.l0(e10, this);
            return;
        }
        u0 a11 = c2.a();
        if (a11.w0()) {
            this.f28905f = uVar;
            this.f24369c = 0;
            a11.t0(this);
            return;
        }
        a11.u0(true);
        try {
            xl.f e11 = e();
            Object c10 = z.c(e11, this.f28906g);
            this.f28904e.l(obj);
            tl.l lVar = tl.l.f28297a;
            z.a(e11, c10);
            do {
            } while (a11.y0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final pm.j<T> m() {
        boolean z10;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = h.f28908b;
                return null;
            } else if (obj instanceof pm.j) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28902h;
                x xVar = h.f28908b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, xVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return (pm.j) obj;
                }
            } else if (obj != h.f28908b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean n() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean o(Throwable th2) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            x xVar = h.f28908b;
            boolean z10 = false;
            boolean z11 = true;
            if (gm.l.a(obj, xVar)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28902h;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, th2)) {
                        if (atomicReferenceFieldUpdater.get(this) != xVar) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28902h;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            z11 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z11) {
                    return false;
                }
            }
        }
    }

    public final void p() {
        pm.j jVar;
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof pm.j) {
            jVar = (pm.j) obj;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            jVar.p();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0019, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Throwable q(pm.i<?> r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6._reusableCancellableContinuation
            um.x r1 = um.h.f28908b
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = um.g.f28902h
        Lb:
            boolean r0 = r5.compareAndSet(r6, r1, r7)
            if (r0 == 0) goto L13
            r3 = 1
            goto L19
        L13:
            java.lang.Object r0 = r5.get(r6)
            if (r0 == r1) goto Lb
        L19:
            if (r3 == 0) goto L0
            return r2
        L1c:
            boolean r7 = r0 instanceof java.lang.Throwable
            if (r7 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = um.g.f28902h
        L22:
            boolean r1 = r7.compareAndSet(r6, r0, r2)
            if (r1 == 0) goto L2a
            r3 = 1
            goto L30
        L2a:
            java.lang.Object r1 = r7.get(r6)
            if (r1 == r0) goto L22
        L30:
            if (r3 == 0) goto L35
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L35:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L41:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inconsistent state "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: um.g.q(pm.i):java.lang.Throwable");
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DispatchedContinuation[");
        a10.append(this.f28903d);
        a10.append(", ");
        a10.append(g0.m(this.f28904e));
        a10.append(']');
        return a10.toString();
    }
}
