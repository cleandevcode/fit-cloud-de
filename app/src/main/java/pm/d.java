package pm;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class d<T> extends a<T> {

    /* renamed from: c */
    public final Thread f24329c;

    /* renamed from: d */
    public final u0 f24330d;

    public d(xl.f fVar, Thread thread, u0 u0Var) {
        super(fVar, true);
        this.f24329c = thread;
        this.f24330d = u0Var;
    }

    @Override // pm.l1
    public final void A(Object obj) {
        if (gm.l.a(Thread.currentThread(), this.f24329c)) {
            return;
        }
        LockSupport.unpark(this.f24329c);
    }
}
