package xk;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a extends AtomicReference<wk.c> implements uk.c {
    public a(wk.c cVar) {
        super(cVar);
    }

    @Override // uk.c
    public final void c() {
        wk.c andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Throwable th2) {
            h7.a.y(th2);
            ol.a.a(th2);
        }
    }
}
