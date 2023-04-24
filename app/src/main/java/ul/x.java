package ul;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class x implements Iterator<Long>, hm.a {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(nextLong());
    }

    public abstract long nextLong();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
