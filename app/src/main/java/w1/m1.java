package w1;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class m1 extends AbstractList<String> implements e0, RandomAccess {

    /* renamed from: a */
    public final e0 f29642a;

    /* loaded from: classes.dex */
    public class a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f29643a;

        public a(m1 m1Var, int i10) {
            this.f29643a = m1Var.f29642a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f29643a.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f29643a.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f29643a.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f29643a.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f29643a.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f29643a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f29644a;

        public b(m1 m1Var) {
            this.f29644a = m1Var.f29642a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f29644a.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f29644a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public m1(e0 e0Var) {
        this.f29642a = e0Var;
    }

    @Override // w1.e0
    public final void d(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // w1.e0
    public final List<?> g() {
        return this.f29642a.g();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f29642a.get(i10);
    }

    @Override // w1.e0
    public final e0 h() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // w1.e0
    public final Object l(int i10) {
        return this.f29642a.l(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29642a.size();
    }
}
