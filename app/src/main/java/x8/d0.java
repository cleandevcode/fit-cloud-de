package x8;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d0 extends h0 {

    /* renamed from: a */
    public final int f30404a;

    /* renamed from: b */
    public int f30405b;

    /* renamed from: c */
    public final f0 f30406c;

    public d0(f0 f0Var, int i10) {
        int size = f0Var.size();
        p.b.B(i10, size);
        this.f30404a = size;
        this.f30405b = i10;
        this.f30406c = f0Var;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: b */
    public final boolean hasNext() {
        return this.f30405b < this.f30404a;
    }

    @Override // java.util.ListIterator
    /* renamed from: c */
    public final boolean hasPrevious() {
        return this.f30405b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: d */
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f30405b;
            this.f30405b = i10 + 1;
            return this.f30406c.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    /* renamed from: e */
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f30405b - 1;
            this.f30405b = i10;
            return this.f30406c.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30405b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30405b - 1;
    }
}
