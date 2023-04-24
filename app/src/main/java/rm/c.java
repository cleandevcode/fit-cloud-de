package rm;

import bi.z0;
import gm.e0;
import i2.l0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pm.g0;
import pm.v1;
import rm.j;
import tl.g;
import um.f0;
import um.k;

/* loaded from: classes2.dex */
public abstract class c<E> implements z<E> {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25833c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: a */
    public final fm.l<E, tl.l> f25834a;

    /* renamed from: b */
    public final um.j f25835b = new um.j();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* loaded from: classes2.dex */
    public static final class a<E> extends y {

        /* renamed from: d */
        public final E f25836d;

        public a(E e10) {
            this.f25836d = e10;
        }

        @Override // rm.y
        public final void R() {
        }

        @Override // rm.y
        public final Object S() {
            return this.f25836d;
        }

        @Override // rm.y
        public final void T(m<?> mVar) {
        }

        @Override // rm.y
        public final um.x U(k.c cVar) {
            um.x xVar = pm.k.f24356a;
            if (cVar != null) {
                cVar.d();
            }
            return xVar;
        }

        @Override // um.k
        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("SendBuffered@");
            a10.append(g0.j(this));
            a10.append('(');
            a10.append(this.f25836d);
            a10.append(')');
            return a10.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(fm.l<? super E, tl.l> lVar) {
        this.f25834a = lVar;
    }

    public static final void a(c cVar, pm.j jVar, Object obj, m mVar) {
        g.a f10;
        f0 a10;
        cVar.getClass();
        g(mVar);
        Throwable th2 = mVar.f25856d;
        if (th2 == null) {
            th2 = new o("Channel was closed");
        }
        fm.l<E, tl.l> lVar = cVar.f25834a;
        if (lVar != null && (a10 = l0.a(lVar, obj, null)) != null) {
            ih.v.b(a10, th2);
            f10 = mf.a0.f(a10);
        } else {
            f10 = mf.a0.f(th2);
        }
        jVar.l(f10);
    }

    public static void g(m mVar) {
        u uVar;
        Object obj = null;
        while (true) {
            um.k K = mVar.K();
            if (K instanceof u) {
                uVar = (u) K;
            } else {
                uVar = null;
            }
            if (uVar == null) {
                break;
            } else if (!uVar.N()) {
                ((um.t) uVar.I()).f28939a.L();
            } else {
                obj = z0.k(obj, uVar);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((u) obj).S(mVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((u) arrayList.get(size)).S(mVar);
            }
        }
    }

    public Object b(a0 a0Var) {
        boolean z10;
        um.k K;
        if (i()) {
            um.j jVar = this.f25835b;
            do {
                K = jVar.K();
                if (K instanceof w) {
                    return K;
                }
            } while (!K.D(a0Var, jVar));
            return null;
        }
        um.k kVar = this.f25835b;
        d dVar = new d(a0Var, this);
        while (true) {
            um.k K2 = kVar.K();
            if (!(K2 instanceof w)) {
                int Q = K2.Q(a0Var, kVar, dVar);
                z10 = true;
                if (Q != 1) {
                    if (Q == 2) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return K2;
            }
        }
        if (z10) {
            return null;
        }
        return b.f25825e;
    }

    @Override // rm.z
    public final Object d(E e10, xl.d<? super tl.l> dVar) {
        boolean z10;
        a0 b0Var;
        if (k(e10) == b.f25822b) {
            return tl.l.f28297a;
        }
        pm.j l10 = h7.a.l(mf.a0.i(dVar));
        while (true) {
            if (!(this.f25835b.J() instanceof w) && j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f25834a == null) {
                    b0Var = new a0(e10, l10);
                } else {
                    b0Var = new b0(e10, l10, this.f25834a);
                }
                Object b10 = b(b0Var);
                if (b10 == null) {
                    l10.z(new v1(b0Var));
                    break;
                } else if (b10 instanceof m) {
                    a(this, l10, e10, (m) b10);
                    break;
                } else if (b10 != b.f25825e && !(b10 instanceof u)) {
                    throw new IllegalStateException(("enqueueSend returned " + b10).toString());
                }
            }
            Object k10 = k(e10);
            if (k10 == b.f25822b) {
                l10.l(tl.l.f28297a);
                break;
            } else if (k10 != b.f25823c) {
                if (k10 instanceof m) {
                    a(this, l10, e10, (m) k10);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + k10).toString());
                }
            }
        }
        Object t10 = l10.t();
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        if (t10 != aVar) {
            t10 = tl.l.f28297a;
        }
        if (t10 == aVar) {
            return t10;
        }
        return tl.l.f28297a;
    }

    public String e() {
        return "";
    }

    public final m<?> f() {
        um.k K = this.f25835b.K();
        m<?> mVar = K instanceof m ? (m) K : null;
        if (mVar != null) {
            g(mVar);
            return mVar;
        }
        return null;
    }

    public abstract boolean i();

    public abstract boolean j();

    public Object k(E e10) {
        w<E> l10;
        do {
            l10 = l();
            if (l10 == null) {
                return b.f25823c;
            }
        } while (l10.d(e10) == null);
        l10.y(e10);
        return l10.o();
    }

    public w<E> l() {
        um.k kVar;
        um.k O;
        um.j jVar = this.f25835b;
        while (true) {
            kVar = (um.k) jVar.I();
            if (kVar != jVar && (kVar instanceof w)) {
                if (((((w) kVar) instanceof m) && !kVar.M()) || (O = kVar.O()) == null) {
                    break;
                }
                O.L();
            }
        }
        kVar = null;
        return (w) kVar;
    }

    @Override // rm.z
    public final void n(fm.l<? super Throwable, tl.l> lVar) {
        boolean z10;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25833c;
        while (true) {
            z10 = true;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                z11 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z11 = false;
                break;
            }
        }
        if (!z11) {
            Object obj = this.onCloseHandler;
            if (obj == b.f25826f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(g4.g.a("Another handler was already registered: ", obj));
        }
        m<?> f10 = f();
        if (f10 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25833c;
            um.x xVar = b.f25826f;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, xVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != lVar) {
                        z10 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z10) {
                lVar.k(f10.f25856d);
            }
        }
    }

    @Override // rm.z
    public final boolean o(Throwable th2) {
        boolean z10;
        boolean z11;
        Object obj;
        um.x xVar;
        m mVar = new m(th2);
        um.j jVar = this.f25835b;
        while (true) {
            um.k K = jVar.K();
            z10 = false;
            if (!(!(K instanceof m))) {
                z11 = false;
                break;
            } else if (K.D(mVar, jVar)) {
                z11 = true;
                break;
            }
        }
        if (!z11) {
            mVar = (m) this.f25835b.K();
        }
        g(mVar);
        if (z11 && (obj = this.onCloseHandler) != null && obj != (xVar = b.f25826f)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25833c;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, xVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                e0.c(1, obj);
                ((fm.l) obj).k(th2);
            }
        }
        return z11;
    }

    @Override // rm.z
    public final Object p(E e10) {
        j.a aVar;
        Object k10 = k(e10);
        if (k10 == b.f25822b) {
            return tl.l.f28297a;
        }
        if (k10 == b.f25823c) {
            m<?> f10 = f();
            if (f10 == null) {
                return j.f25849b;
            }
            g(f10);
            Throwable th2 = f10.f25856d;
            if (th2 == null) {
                th2 = new o("Channel was closed");
            }
            aVar = new j.a(th2);
        } else if (k10 instanceof m) {
            m mVar = (m) k10;
            g(mVar);
            Throwable th3 = mVar.f25856d;
            if (th3 == null) {
                th3 = new o("Channel was closed");
            }
            aVar = new j.a(th3);
        } else {
            throw new IllegalStateException(("trySend returned " + k10).toString());
        }
        return aVar;
    }

    public final y q() {
        um.k kVar;
        um.k O;
        um.j jVar = this.f25835b;
        while (true) {
            kVar = (um.k) jVar.I();
            if (kVar != jVar && (kVar instanceof y)) {
                if (((((y) kVar) instanceof m) && !kVar.M()) || (O = kVar.O()) == null) {
                    break;
                }
                O.L();
            }
        }
        kVar = null;
        return (y) kVar;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('@');
        sb2.append(g0.j(this));
        sb2.append('{');
        um.k J = this.f25835b.J();
        if (J == this.f25835b) {
            str2 = "EmptyQueue";
        } else {
            if (J instanceof m) {
                str = J.toString();
            } else if (J instanceof u) {
                str = "ReceiveQueued";
            } else if (J instanceof y) {
                str = "SendQueued";
            } else {
                str = "UNEXPECTED:" + J;
            }
            um.k K = this.f25835b.K();
            if (K != J) {
                StringBuilder a10 = p.a.a(str, ",queueSize=");
                um.j jVar = this.f25835b;
                int i10 = 0;
                for (um.k kVar = (um.k) jVar.I(); !gm.l.a(kVar, jVar); kVar = kVar.J()) {
                    if (kVar instanceof um.k) {
                        i10++;
                    }
                }
                a10.append(i10);
                str2 = a10.toString();
                if (K instanceof m) {
                    str2 = str2 + ",closedForSend=" + K;
                }
            } else {
                str2 = str;
            }
        }
        sb2.append(str2);
        sb2.append('}');
        sb2.append(e());
        return sb2.toString();
    }

    @Override // rm.z
    public final boolean u() {
        return f() != null;
    }
}
