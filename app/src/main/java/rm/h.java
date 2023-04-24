package rm;

import java.util.concurrent.CancellationException;
import pm.h1;

/* loaded from: classes2.dex */
public class h<E> extends pm.a<tl.l> implements g<E> {

    /* renamed from: c */
    public final g<E> f25848c;

    public h(xl.f fVar, a aVar) {
        super(fVar, true);
        this.f25848c = aVar;
    }

    @Override // pm.l1
    public final void K(CancellationException cancellationException) {
        this.f25848c.h(cancellationException);
        B(cancellationException);
    }

    @Override // rm.v
    public final xm.b<j<E>> c() {
        return this.f25848c.c();
    }

    @Override // rm.z
    public final Object d(E e10, xl.d<? super tl.l> dVar) {
        return this.f25848c.d(e10, dVar);
    }

    @Override // pm.l1, pm.g1
    public final void h(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new h1(N(), null, this);
        }
        K(cancellationException);
    }

    @Override // rm.v
    public final i<E> iterator() {
        return this.f25848c.iterator();
    }

    @Override // rm.v
    public final Object m() {
        return this.f25848c.m();
    }

    @Override // rm.z
    public final void n(fm.l<? super Throwable, tl.l> lVar) {
        this.f25848c.n(lVar);
    }

    @Override // rm.z
    public final boolean o(Throwable th2) {
        return this.f25848c.o(th2);
    }

    @Override // rm.z
    public final Object p(E e10) {
        return this.f25848c.p(e10);
    }

    @Override // rm.z
    public final boolean u() {
        return this.f25848c.u();
    }

    @Override // rm.v
    public final Object x(xl.d<? super j<? extends E>> dVar) {
        return this.f25848c.x(dVar);
    }
}
