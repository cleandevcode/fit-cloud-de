package uk;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class e<T> extends AtomicReference<T> implements c {
    public e(T t10) {
        super(t10);
    }

    public final boolean a() {
        return get() == null;
    }

    public abstract void b(T t10);

    @Override // uk.c
    public final void c() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        b(andSet);
    }
}
