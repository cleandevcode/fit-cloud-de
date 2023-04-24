package gm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class b<T> implements Iterator<T>, hm.a {

    /* renamed from: a */
    public final T[] f15486a;

    /* renamed from: b */
    public int f15487b;

    public b(T[] tArr) {
        l.f(tArr, "array");
        this.f15486a = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15487b < this.f15486a.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f15486a;
            int i10 = this.f15487b;
            this.f15487b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f15487b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
