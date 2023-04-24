package pm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class k1 extends w implements q0, b1 {

    /* renamed from: d */
    public l1 f24358d;

    public final l1 S() {
        l1 l1Var = this.f24358d;
        if (l1Var != null) {
            return l1Var;
        }
        gm.l.l("job");
        throw null;
    }

    @Override // pm.b1
    public final boolean a() {
        return true;
    }

    @Override // pm.q0
    public final void c() {
        boolean z10;
        l1 S = S();
        do {
            Object d02 = S.d0();
            if (!(d02 instanceof k1)) {
                if (!(d02 instanceof b1) || ((b1) d02).q() == null) {
                    return;
                }
                N();
                return;
            } else if (d02 == this) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l1.f24361a;
                t0 t0Var = n1.f24379g;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(S, d02, t0Var)) {
                        if (atomicReferenceFieldUpdater.get(S) != d02) {
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
    }

    @Override // pm.b1
    public final q1 q() {
        return null;
    }

    @Override // um.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + g0.j(this) + "[job@" + g0.j(S()) + ']';
    }
}
