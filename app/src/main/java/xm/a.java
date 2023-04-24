package xm;

import ih.v;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mf.a0;
import pm.g1;
import pm.i1;
import pm.q0;
import pm.u;
import rm.a;
import tl.g;
import tl.l;
import um.j;
import um.k;
import um.s;
import um.x;
import xl.f;

/* loaded from: classes2.dex */
public final class a<R> extends j implements xm.c<R>, xl.d<R>, zl.d {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30633e = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state");

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30634f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_result");

    /* renamed from: d */
    public final xl.d<R> f30635d;
    public volatile /* synthetic */ Object _state = d.f30641a;
    private volatile /* synthetic */ Object _result = d.f30643c;
    private volatile /* synthetic */ Object _parentHandle = null;

    /* renamed from: xm.a$a */
    /* loaded from: classes2.dex */
    public static final class C0564a extends um.d<Object> {

        /* renamed from: b */
        public final a<?> f30636b;

        /* renamed from: c */
        public final um.b f30637c;

        /* renamed from: d */
        public final long f30638d;

        public C0564a(a aVar, a.g gVar) {
            this.f30636b = aVar;
            this.f30637c = gVar;
            e eVar = d.f30645e;
            eVar.getClass();
            this.f30638d = e.f30646a.incrementAndGet(eVar);
            gVar.f28890a = this;
        }

        @Override // um.d
        public final void d(Object obj, Object obj2) {
            boolean z10;
            x xVar;
            boolean z11 = true;
            if (obj2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                xVar = null;
            } else {
                xVar = d.f30641a;
            }
            a<?> aVar = this.f30636b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f30633e;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(aVar, this, xVar)) {
                    if (atomicReferenceFieldUpdater.get(aVar) != this) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z11 && z10) {
                this.f30636b.R();
            }
            this.f30637c.a(this, obj2);
        }

        @Override // um.d
        public final long g() {
            return this.f30638d;
        }

        @Override // um.d
        public final Object i(Object obj) {
            x xVar;
            boolean z10;
            if (obj == null) {
                a<?> aVar = this.f30636b;
                while (true) {
                    Object obj2 = aVar._state;
                    xVar = null;
                    if (obj2 == this) {
                        break;
                    } else if (obj2 instanceof s) {
                        ((s) obj2).c(this.f30636b);
                    } else {
                        x xVar2 = d.f30641a;
                        if (obj2 == xVar2) {
                            a<?> aVar2 = this.f30636b;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f30633e;
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(aVar2, xVar2, this)) {
                                    z10 = true;
                                    break;
                                } else if (atomicReferenceFieldUpdater.get(aVar2) != xVar2) {
                                    z10 = false;
                                    break;
                                }
                            }
                            if (z10) {
                                break;
                            }
                        } else {
                            xVar = d.f30642b;
                            break;
                        }
                    }
                }
                if (xVar != null) {
                    return xVar;
                }
            }
            try {
                return this.f30637c.b(this);
            } catch (Throwable th2) {
                if (obj == null) {
                    a<?> aVar3 = this.f30636b;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a.f30633e;
                    x xVar3 = d.f30641a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(aVar3, this, xVar3) && atomicReferenceFieldUpdater2.get(aVar3) == this) {
                    }
                }
                throw th2;
            }
        }

        @Override // um.s
        public final String toString() {
            return d4.b.a(android.support.v4.media.d.a("AtomicSelectOp(sequence="), this.f30638d, ')');
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends k {

        /* renamed from: d */
        public final q0 f30639d;

        public b(q0 q0Var) {
            this.f30639d = q0Var;
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends i1 {
        public c() {
            a.this = r1;
        }

        @Override // pm.w
        public final void R(Throwable th2) {
            if (a.this.p()) {
                a.this.B(S().v());
            }
        }

        @Override // fm.l
        public final /* bridge */ /* synthetic */ l k(Throwable th2) {
            R(th2);
            return l.f28297a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(xl.d<? super R> dVar) {
        this.f30635d = dVar;
    }

    @Override // xm.c
    public final void B(Throwable th2) {
        while (true) {
            Object obj = this._result;
            x xVar = d.f30643c;
            boolean z10 = true;
            if (obj == xVar) {
                u uVar = new u(th2, false);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30634f;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, uVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != xVar) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                if (obj == aVar) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f30634f;
                    x xVar2 = d.f30644d;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar, xVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != aVar) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        a0.i(this.f30635d).l(a0.f(th2));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // xm.c
    public final Object C(a.g gVar) {
        return new C0564a(this, gVar).c(null);
    }

    public final void R() {
        q0 q0Var = (q0) this._parentHandle;
        if (q0Var != null) {
            q0Var.c();
        }
        for (k kVar = (k) I(); !gm.l.a(kVar, this); kVar = kVar.J()) {
            if (kVar instanceof b) {
                ((b) kVar).f30639d.c();
            }
        }
    }

    public final Object S() {
        g1 g1Var;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        boolean z10 = true;
        if (!u() && (g1Var = (g1) e().b(g1.b.f24341a)) != null) {
            q0 a10 = g1.a.a(g1Var, true, new c(), 2);
            this._parentHandle = a10;
            if (u()) {
                a10.c();
            }
        }
        Object obj = this._result;
        x xVar = d.f30643c;
        if (obj == xVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30634f;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != xVar) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z10) {
                return aVar;
            }
            obj = this._result;
        }
        if (obj != d.f30644d) {
            if (!(obj instanceof u)) {
                return obj;
            }
            throw ((u) obj).f24396a;
        }
        throw new IllegalStateException("Already resumed");
    }

    public final void T(Throwable th2) {
        if (p()) {
            l(a0.f(th2));
        } else if (th2 instanceof CancellationException) {
        } else {
            Object S = S();
            if ((S instanceof u) && ((u) S).f24396a == th2) {
                return;
            }
            v.g(e(), th2);
        }
    }

    @Override // xl.d
    public final f e() {
        return this.f30635d.e();
    }

    @Override // zl.d
    public final zl.d g() {
        xl.d<R> dVar = this.f30635d;
        if (dVar instanceof zl.d) {
            return (zl.d) dVar;
        }
        return null;
    }

    @Override // xl.d
    public final void l(Object obj) {
        Object uVar;
        xl.d<R> dVar;
        while (true) {
            Object obj2 = this._result;
            x xVar = d.f30643c;
            boolean z10 = true;
            if (obj2 == xVar) {
                Throwable a10 = g.a(obj);
                if (a10 == null) {
                    uVar = obj;
                } else {
                    uVar = new u(a10, false);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30634f;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, uVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != xVar) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                if (obj2 == aVar) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f30634f;
                    x xVar2 = d.f30644d;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar, xVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != aVar) {
                                z10 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z10) {
                        if (obj instanceof g.a) {
                            dVar = this.f30635d;
                            Throwable a11 = g.a(obj);
                            gm.l.c(a11);
                            obj = a0.f(a11);
                        } else {
                            dVar = this.f30635d;
                        }
                        dVar.l(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    @Override // xm.c
    public final Object n() {
        while (true) {
            Object obj = this._state;
            x xVar = d.f30641a;
            if (obj == xVar) {
                boolean z10 = false;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30633e;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != xVar) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    R();
                    return pm.k.f24356a;
                }
            } else if (!(obj instanceof s)) {
                return null;
            } else {
                ((s) obj).c(this);
            }
        }
    }

    @Override // xm.c
    public final boolean p() {
        Object n10 = n();
        if (n10 == pm.k.f24356a) {
            return true;
        }
        if (n10 == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + n10).toString());
    }

    @Override // um.k
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SelectInstance(state=");
        a10.append(this._state);
        a10.append(", result=");
        a10.append(this._result);
        a10.append(')');
        return a10.toString();
    }

    @Override // xm.c
    public final boolean u() {
        while (true) {
            Object obj = this._state;
            if (obj == d.f30641a) {
                return false;
            }
            if (!(obj instanceof s)) {
                return true;
            }
            ((s) obj).c(this);
        }
    }

    @Override // xm.c
    public final void v(q0 q0Var) {
        b bVar = new b(q0Var);
        if (!u()) {
            do {
            } while (!K().D(bVar, this));
            if (!u()) {
                return;
            }
        }
        q0Var.c();
    }

    @Override // xm.c
    public final a x() {
        return this;
    }
}
