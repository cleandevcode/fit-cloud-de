package vl;

import bi.m0;
import bi.z0;
import gm.l;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import s.p1;
import ul.c;
import ul.i;

/* loaded from: classes2.dex */
public final class a<E> extends ul.d<E> implements RandomAccess, Serializable {

    /* renamed from: a */
    public E[] f29438a;

    /* renamed from: b */
    public int f29439b;

    /* renamed from: c */
    public int f29440c;

    /* renamed from: d */
    public boolean f29441d;

    /* renamed from: e */
    public final a<E> f29442e;

    /* renamed from: f */
    public final a<E> f29443f;

    /* renamed from: vl.a$a */
    /* loaded from: classes2.dex */
    public static final class C0536a<E> implements ListIterator<E>, hm.a {

        /* renamed from: a */
        public final a<E> f29444a;

        /* renamed from: b */
        public int f29445b;

        /* renamed from: c */
        public int f29446c;

        public C0536a(a<E> aVar, int i10) {
            l.f(aVar, "list");
            this.f29444a = aVar;
            this.f29445b = i10;
            this.f29446c = -1;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            a<E> aVar = this.f29444a;
            int i10 = this.f29445b;
            this.f29445b = i10 + 1;
            aVar.add(i10, e10);
            this.f29446c = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f29445b < this.f29444a.f29440c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f29445b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            int i10 = this.f29445b;
            a<E> aVar = this.f29444a;
            if (i10 < aVar.f29440c) {
                this.f29445b = i10 + 1;
                this.f29446c = i10;
                return aVar.f29438a[aVar.f29439b + i10];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f29445b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            int i10 = this.f29445b;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f29445b = i11;
                this.f29446c = i11;
                a<E> aVar = this.f29444a;
                return aVar.f29438a[aVar.f29439b + i11];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f29445b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            boolean z10;
            int i10 = this.f29446c;
            if (i10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f29444a.f(i10);
                this.f29445b = this.f29446c;
                this.f29446c = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            int i10 = this.f29446c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f29444a.set(i10, e10);
        }
    }

    public a() {
        this(10);
    }

    public a(int i10) {
        this(m0.c(i10), 0, 0, false, null, null);
    }

    public a(E[] eArr, int i10, int i11, boolean z10, a<E> aVar, a<E> aVar2) {
        this.f29438a = eArr;
        this.f29439b = i10;
        this.f29440c = i11;
        this.f29441d = z10;
        this.f29442e = aVar;
        this.f29443f = aVar2;
    }

    private final Object writeReplace() {
        boolean z10;
        a<E> aVar;
        if (!this.f29441d && ((aVar = this.f29443f) == null || !aVar.f29441d)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return new f(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        k();
        int i11 = this.f29440c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
        }
        j(this.f29439b + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        k();
        j(this.f29439b + this.f29440c, e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        l.f(collection, "elements");
        k();
        int i11 = this.f29440c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
        }
        int size = collection.size();
        i(this.f29439b + i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        k();
        int size = collection.size();
        i(this.f29439b + this.f29440c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        p(this.f29439b, this.f29440c);
    }

    @Override // ul.d
    public final int e() {
        return this.f29440c;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == r8) goto L30
            boolean r2 = r9 instanceof java.util.List
            if (r2 == 0) goto L31
            java.util.List r9 = (java.util.List) r9
            E[] r2 = r8.f29438a
            int r3 = r8.f29439b
            int r4 = r8.f29440c
            int r5 = r9.size()
            if (r4 == r5) goto L17
            goto L28
        L17:
            r5 = 0
        L18:
            if (r5 >= r4) goto L2d
            int r6 = r3 + r5
            r6 = r2[r6]
            java.lang.Object r7 = r9.get(r5)
            boolean r6 = gm.l.a(r6, r7)
            if (r6 != 0) goto L2a
        L28:
            r9 = 0
            goto L2e
        L2a:
            int r5 = r5 + 1
            goto L18
        L2d:
            r9 = 1
        L2e:
            if (r9 == 0) goto L31
        L30:
            r0 = 1
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.a.equals(java.lang.Object):boolean");
    }

    @Override // ul.d
    public final E f(int i10) {
        k();
        int i11 = this.f29440c;
        if (i10 >= 0 && i10 < i11) {
            return o(this.f29439b + i10);
        }
        throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int i11 = this.f29440c;
        if (i10 >= 0 && i10 < i11) {
            return this.f29438a[this.f29439b + i10];
        }
        throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f29438a;
        int i10 = this.f29439b;
        int i11 = this.f29440c;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            E e10 = eArr[i10 + i13];
            i12 = (i12 * 31) + (e10 != null ? e10.hashCode() : 0);
        }
        return i12;
    }

    public final void i(int i10, Collection<? extends E> collection, int i11) {
        a<E> aVar = this.f29442e;
        if (aVar != null) {
            aVar.i(i10, collection, i11);
            this.f29438a = this.f29442e.f29438a;
            this.f29440c += i11;
            return;
        }
        n(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f29438a[i10 + i12] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f29440c; i10++) {
            if (l.a(this.f29438a[this.f29439b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f29440c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new C0536a(this, 0);
    }

    public final void j(int i10, E e10) {
        a<E> aVar = this.f29442e;
        if (aVar == null) {
            n(i10, 1);
            this.f29438a[i10] = e10;
            return;
        }
        aVar.j(i10, e10);
        this.f29438a = this.f29442e.f29438a;
        this.f29440c++;
    }

    public final void k() {
        boolean z10;
        a<E> aVar;
        if (!this.f29441d && ((aVar = this.f29443f) == null || !aVar.f29441d)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i10 = this.f29440c - 1; i10 >= 0; i10--) {
            if (l.a(this.f29438a[this.f29439b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return new C0536a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        int i11 = this.f29440c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
        }
        return new C0536a(this, i10);
    }

    public final void n(int i10, int i11) {
        int i12 = this.f29440c + i11;
        if (this.f29442e == null) {
            if (i12 >= 0) {
                E[] eArr = this.f29438a;
                if (i12 > eArr.length) {
                    int length = eArr.length;
                    int i13 = length + (length >> 1);
                    if (i13 - i12 < 0) {
                        i13 = i12;
                    }
                    if (i13 - 2147483639 > 0) {
                        if (i12 > 2147483639) {
                            i13 = Integer.MAX_VALUE;
                        } else {
                            i13 = 2147483639;
                        }
                    }
                    E[] eArr2 = (E[]) Arrays.copyOf(eArr, i13);
                    l.e(eArr2, "copyOf(this, newSize)");
                    this.f29438a = eArr2;
                }
                E[] eArr3 = this.f29438a;
                i.w(eArr3, eArr3, i10 + i11, i10, this.f29439b + this.f29440c);
                this.f29440c += i11;
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    public final E o(int i10) {
        a<E> aVar = this.f29442e;
        if (aVar != null) {
            this.f29440c--;
            return aVar.o(i10);
        }
        E[] eArr = this.f29438a;
        E e10 = eArr[i10];
        i.w(eArr, eArr, i10, i10 + 1, this.f29439b + this.f29440c);
        E[] eArr2 = this.f29438a;
        l.f(eArr2, "<this>");
        eArr2[(this.f29439b + this.f29440c) - 1] = null;
        this.f29440c--;
        return e10;
    }

    public final void p(int i10, int i11) {
        a<E> aVar = this.f29442e;
        if (aVar != null) {
            aVar.p(i10, i11);
        } else {
            E[] eArr = this.f29438a;
            i.w(eArr, eArr, i10, i10 + i11, this.f29440c);
            E[] eArr2 = this.f29438a;
            int i12 = this.f29440c;
            m0.A(i12 - i11, i12, eArr2);
        }
        this.f29440c -= i11;
    }

    public final int q(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        a<E> aVar = this.f29442e;
        if (aVar != null) {
            int q10 = aVar.q(i10, i11, collection, z10);
            this.f29440c -= q10;
            return q10;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f29438a[i14]) == z10) {
                E[] eArr = this.f29438a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f29438a;
        i.w(eArr2, eArr2, i10 + i13, i11 + i10, this.f29440c);
        E[] eArr3 = this.f29438a;
        int i16 = this.f29440c;
        m0.A(i16 - i15, i16, eArr3);
        this.f29440c -= i15;
        return i15;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            f(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        k();
        return q(this.f29439b, this.f29440c, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        k();
        return q(this.f29439b, this.f29440c, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        k();
        int i11 = this.f29440c;
        if (i10 >= 0 && i10 < i11) {
            E[] eArr = this.f29438a;
            int i12 = this.f29439b;
            E e11 = eArr[i12 + i10];
            eArr[i12 + i10] = e10;
            return e11;
        }
        throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i10, int i11) {
        c.a.a(i10, i11, this.f29440c);
        E[] eArr = this.f29438a;
        int i12 = this.f29439b + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f29441d;
        a<E> aVar = this.f29443f;
        return new a(eArr, i12, i13, z10, this, aVar == null ? this : aVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        E[] eArr = this.f29438a;
        int i10 = this.f29439b;
        int i11 = this.f29440c + i10;
        l.f(eArr, "<this>");
        z0.d(i11, eArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(eArr, i10, i11);
        l.e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        l.f(tArr, "destination");
        int length = tArr.length;
        int i10 = this.f29440c;
        if (length < i10) {
            E[] eArr = this.f29438a;
            int i11 = this.f29439b;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, tArr.getClass());
            l.e(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        E[] eArr2 = this.f29438a;
        l.d(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i12 = this.f29439b;
        i.w(eArr2, tArr, 0, i12, this.f29440c + i12);
        int length2 = tArr.length;
        int i13 = this.f29440c;
        if (length2 > i13) {
            tArr[i13] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        E[] eArr = this.f29438a;
        int i10 = this.f29439b;
        int i11 = this.f29440c;
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(eArr[i10 + i12]);
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        l.e(sb3, "sb.toString()");
        return sb3;
    }
}
