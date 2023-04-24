package nm;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import nm.j;

/* loaded from: classes2.dex */
public final class a<T> implements g<T> {

    /* renamed from: a */
    public final AtomicReference<g<T>> f22470a;

    public a(j.a aVar) {
        this.f22470a = new AtomicReference<>(aVar);
    }

    @Override // nm.g
    public final Iterator<T> iterator() {
        g<T> andSet = this.f22470a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
