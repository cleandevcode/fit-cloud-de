package rm;

import i2.l0;
import java.util.concurrent.locks.ReentrantLock;
import um.f0;

/* loaded from: classes2.dex */
public final class p<E> extends a<E> {

    /* renamed from: d */
    public final ReentrantLock f25857d;

    /* renamed from: e */
    public Object f25858e;

    public p(fm.l<? super E, tl.l> lVar) {
        super(lVar);
        this.f25857d = new ReentrantLock();
        this.f25858e = b.f25821a;
    }

    @Override // rm.a
    public final Object A() {
        ReentrantLock reentrantLock = this.f25857d;
        reentrantLock.lock();
        try {
            Object obj = this.f25858e;
            um.x xVar = b.f25821a;
            if (obj != xVar) {
                this.f25858e = xVar;
                tl.l lVar = tl.l.f28297a;
                return obj;
            }
            Object f10 = f();
            if (f10 == null) {
                f10 = b.f25824d;
            }
            return f10;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.a
    public final Object B(xm.c<?> cVar) {
        ReentrantLock reentrantLock = this.f25857d;
        reentrantLock.lock();
        try {
            Object obj = this.f25858e;
            um.x xVar = b.f25821a;
            if (obj == xVar) {
                Object f10 = f();
                if (f10 == null) {
                    f10 = b.f25824d;
                }
                return f10;
            } else if (cVar.p()) {
                Object obj2 = this.f25858e;
                this.f25858e = xVar;
                tl.l lVar = tl.l.f28297a;
                return obj2;
            } else {
                return xm.d.f30642b;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.c
    public final String e() {
        ReentrantLock reentrantLock = this.f25857d;
        reentrantLock.lock();
        try {
            return "(value=" + this.f25858e + ')';
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.c
    public final boolean i() {
        return false;
    }

    @Override // rm.c
    public final boolean j() {
        return false;
    }

    @Override // rm.c
    public final Object k(E e10) {
        fm.l<E, tl.l> lVar;
        w<E> l10;
        ReentrantLock reentrantLock = this.f25857d;
        reentrantLock.lock();
        try {
            m<?> f10 = f();
            if (f10 != null) {
                return f10;
            }
            if (this.f25858e == b.f25821a) {
                do {
                    l10 = l();
                    if (l10 != null) {
                        if (l10 instanceof m) {
                            return l10;
                        }
                    }
                } while (l10.d(e10) == null);
                tl.l lVar2 = tl.l.f28297a;
                reentrantLock.unlock();
                l10.y(e10);
                return l10.o();
            }
            Object obj = this.f25858e;
            f0 f0Var = null;
            if (obj != b.f25821a && (lVar = this.f25834a) != null) {
                f0Var = l0.a(lVar, obj, null);
            }
            this.f25858e = e10;
            if (f0Var == null) {
                return b.f25822b;
            }
            throw f0Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.a
    public final boolean s(u<? super E> uVar) {
        ReentrantLock reentrantLock = this.f25857d;
        reentrantLock.lock();
        try {
            return super.s(uVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.a
    public final boolean t() {
        return false;
    }

    @Override // rm.a
    public final boolean v() {
        ReentrantLock reentrantLock = this.f25857d;
        reentrantLock.lock();
        try {
            return this.f25858e == b.f25821a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rm.a
    public final void y(boolean z10) {
        fm.l<E, tl.l> lVar;
        ReentrantLock reentrantLock = this.f25857d;
        reentrantLock.lock();
        try {
            um.x xVar = b.f25821a;
            Object obj = this.f25858e;
            f0 f0Var = null;
            if (obj != xVar && (lVar = this.f25834a) != null) {
                f0Var = l0.a(lVar, obj, null);
            }
            this.f25858e = xVar;
            tl.l lVar2 = tl.l.f28297a;
            reentrantLock.unlock();
            super.y(z10);
            if (f0Var == null) {
                return;
            }
            throw f0Var;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
