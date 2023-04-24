package x4;

import java.util.ArrayDeque;
import x4.m;

/* loaded from: classes.dex */
public final class l extends m5.i<m.a<Object>, Object> {
    public l() {
        super(500L);
    }

    @Override // m5.i
    public final void c(m.a<Object> aVar, Object obj) {
        m.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = m.a.f30231d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
