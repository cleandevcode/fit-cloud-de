package ul;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import s.p1;

/* loaded from: classes2.dex */
public abstract class c<E> extends ul.a<E> implements List<E> {

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(int i10, int i11, int i12) {
            if (i10 >= 0 && i11 <= i12) {
                if (i10 <= i11) {
                    return;
                }
                throw new IllegalArgumentException(p1.a("fromIndex: ", i10, " > toIndex: ", i11));
            }
            StringBuilder a10 = w1.h.a("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            a10.append(i12);
            throw new IndexOutOfBoundsException(a10.toString());
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Iterator<E>, hm.a {

        /* renamed from: a */
        public int f28863a;

        public b() {
            c.this = r1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f28863a < c.this.e();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i10 = this.f28863a;
                this.f28863a = i10 + 1;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ul.c$c */
    /* loaded from: classes2.dex */
    public class C0522c extends c<E>.b implements ListIterator<E> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0522c(int i10) {
            super();
            c.this = r4;
            int e10 = r4.e();
            if (i10 >= 0 && i10 <= e10) {
                this.f28863a = i10;
                return;
            }
            throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", e10));
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f28863a > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f28863a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                int i10 = this.f28863a - 1;
                this.f28863a = i10;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f28863a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: a */
        public final c<E> f28866a;

        /* renamed from: b */
        public final int f28867b;

        /* renamed from: c */
        public int f28868c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> cVar, int i10, int i11) {
            gm.l.f(cVar, "list");
            this.f28866a = cVar;
            this.f28867b = i10;
            a.a(i10, i11, cVar.e());
            this.f28868c = i11 - i10;
        }

        @Override // ul.a
        public final int e() {
            return this.f28868c;
        }

        @Override // ul.c, java.util.List
        public final E get(int i10) {
            int i11 = this.f28868c;
            if (i10 >= 0 && i10 < i11) {
                return this.f28866a.get(this.f28867b + i10);
            }
            throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
        }
    }

    @Override // java.util.List
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            Collection collection = (Collection) obj;
            gm.l.f(collection, "other");
            if (size() != collection.size()) {
                return false;
            }
            Iterator<E> it = collection.iterator();
            for (E e10 : this) {
                if (!gm.l.a(e10, it.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int i10 = 1;
        while (it.hasNext()) {
            E next = it.next();
            i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i10;
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (E e11 : this) {
            if (gm.l.a(e11, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (gm.l.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return new C0522c(0);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i10) {
        return new C0522c(i10);
    }

    @Override // java.util.List
    public final E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
