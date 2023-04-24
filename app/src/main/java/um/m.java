package um;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class m<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28926a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new n(8, false);

    public final boolean a(E e10) {
        while (true) {
            n nVar = (n) this._cur;
            int a10 = nVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28926a;
                n<E> e11 = nVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, e11) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            n nVar = (n) this._cur;
            if (nVar.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28926a;
            n<E> e10 = nVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, e10) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        return ((n) this._cur).c();
    }

    public final E d() {
        while (true) {
            n nVar = (n) this._cur;
            E e10 = (E) nVar.f();
            if (e10 != n.f28929g) {
                return e10;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28926a;
            n<E> e11 = nVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, e11) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
