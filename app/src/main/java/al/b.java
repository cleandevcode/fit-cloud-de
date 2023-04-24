package al;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class b<T> extends AtomicInteger implements nl.b<T> {
    @Override // nl.f
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
