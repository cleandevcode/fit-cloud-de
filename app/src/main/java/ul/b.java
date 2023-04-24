package ul;

import java.util.Iterator;
import java.util.NoSuchElementException;
import s.c0;

/* loaded from: classes2.dex */
public abstract class b<T> implements Iterator<T>, hm.a {

    /* renamed from: a */
    public int f28851a = 2;

    /* renamed from: b */
    public T f28852b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        int i10 = this.f28851a;
        if (i10 != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int b10 = c0.b(i10);
            if (b10 != 0) {
                if (b10 == 2) {
                    return false;
                }
                this.f28851a = 4;
                a();
                if (this.f28851a != 1) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f28851a = 2;
            return this.f28852b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
