package ul;

import androidx.appcompat.widget.u0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import s.p1;

/* loaded from: classes2.dex */
public final class g<E> extends d<E> {

    /* renamed from: d */
    public static final Object[] f28871d = new Object[0];

    /* renamed from: a */
    public int f28872a;

    /* renamed from: b */
    public Object[] f28873b;

    /* renamed from: c */
    public int f28874c;

    public g() {
        this.f28873b = f28871d;
    }

    public g(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f28871d;
        } else if (i10 <= 0) {
            throw new IllegalArgumentException(u0.a("Illegal Capacity: ", i10));
        } else {
            objArr = new Object[i10];
        }
        this.f28873b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11 = this.f28874c;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
        }
        if (i10 == i11) {
            addLast(e10);
        } else if (i10 == 0) {
            addFirst(e10);
        } else {
            j(i11 + 1);
            int o10 = o(this.f28872a + i10);
            int i12 = this.f28874c;
            if (i10 < ((i12 + 1) >> 1)) {
                if (o10 == 0) {
                    Object[] objArr = this.f28873b;
                    gm.l.f(objArr, "<this>");
                    o10 = objArr.length;
                }
                int i13 = o10 - 1;
                int i14 = this.f28872a;
                if (i14 == 0) {
                    Object[] objArr2 = this.f28873b;
                    gm.l.f(objArr2, "<this>");
                    i14 = objArr2.length;
                }
                int i15 = i14 - 1;
                int i16 = this.f28872a;
                Object[] objArr3 = this.f28873b;
                if (i13 >= i16) {
                    objArr3[i15] = objArr3[i16];
                    i.w(objArr3, objArr3, i16, i16 + 1, i13 + 1);
                } else {
                    i.w(objArr3, objArr3, i16 - 1, i16, objArr3.length);
                    Object[] objArr4 = this.f28873b;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    i.w(objArr4, objArr4, 0, 1, i13 + 1);
                }
                this.f28873b[i13] = e10;
                this.f28872a = i15;
            } else {
                int o11 = o(i12 + this.f28872a);
                Object[] objArr5 = this.f28873b;
                if (o10 < o11) {
                    i.w(objArr5, objArr5, o10 + 1, o10, o11);
                } else {
                    i.w(objArr5, objArr5, 1, 0, o11);
                    Object[] objArr6 = this.f28873b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    i.w(objArr6, objArr6, o10 + 1, o10, objArr6.length - 1);
                }
                this.f28873b[o10] = e10;
            }
            this.f28874c++;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        gm.l.f(collection, "elements");
        int i11 = this.f28874c;
        if (i10 >= 0 && i10 <= i11) {
            if (collection.isEmpty()) {
                return false;
            }
            int i12 = this.f28874c;
            if (i10 == i12) {
                return addAll(collection);
            }
            j(collection.size() + i12);
            int o10 = o(this.f28874c + this.f28872a);
            int o11 = o(this.f28872a + i10);
            int size = collection.size();
            if (i10 < ((this.f28874c + 1) >> 1)) {
                int i13 = this.f28872a;
                int i14 = i13 - size;
                if (o11 < i13) {
                    Object[] objArr = this.f28873b;
                    i.w(objArr, objArr, i14, i13, objArr.length);
                    Object[] objArr2 = this.f28873b;
                    int length = objArr2.length - size;
                    if (size >= o11) {
                        i.w(objArr2, objArr2, length, 0, o11);
                    } else {
                        i.w(objArr2, objArr2, length, 0, size);
                        Object[] objArr3 = this.f28873b;
                        i.w(objArr3, objArr3, 0, size, o11);
                    }
                } else if (i14 >= 0) {
                    Object[] objArr4 = this.f28873b;
                    i.w(objArr4, objArr4, i14, i13, o11);
                } else {
                    Object[] objArr5 = this.f28873b;
                    i14 += objArr5.length;
                    int i15 = o11 - i13;
                    int length2 = objArr5.length - i14;
                    if (length2 >= i15) {
                        i.w(objArr5, objArr5, i14, i13, o11);
                    } else {
                        i.w(objArr5, objArr5, i14, i13, i13 + length2);
                        Object[] objArr6 = this.f28873b;
                        i.w(objArr6, objArr6, 0, this.f28872a + length2, o11);
                    }
                }
                this.f28872a = i14;
                o11 -= size;
                if (o11 < 0) {
                    o11 += this.f28873b.length;
                }
            } else {
                int i16 = o11 + size;
                if (o11 < o10) {
                    int i17 = size + o10;
                    Object[] objArr7 = this.f28873b;
                    if (i17 > objArr7.length) {
                        if (i16 >= objArr7.length) {
                            i16 -= objArr7.length;
                        } else {
                            int length3 = o10 - (i17 - objArr7.length);
                            i.w(objArr7, objArr7, 0, length3, o10);
                            Object[] objArr8 = this.f28873b;
                            i.w(objArr8, objArr8, i16, o11, length3);
                        }
                    }
                    i.w(objArr7, objArr7, i16, o11, o10);
                } else {
                    Object[] objArr9 = this.f28873b;
                    i.w(objArr9, objArr9, size, 0, o10);
                    Object[] objArr10 = this.f28873b;
                    if (i16 >= objArr10.length) {
                        i.w(objArr10, objArr10, i16 - objArr10.length, o11, objArr10.length);
                    } else {
                        i.w(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                        Object[] objArr11 = this.f28873b;
                        i.w(objArr11, objArr11, i16, o11, objArr11.length - size);
                    }
                }
            }
            i(o11, collection);
            return true;
        }
        throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
    }

    public final void addFirst(E e10) {
        j(this.f28874c + 1);
        int i10 = this.f28872a;
        if (i10 == 0) {
            Object[] objArr = this.f28873b;
            gm.l.f(objArr, "<this>");
            i10 = objArr.length;
        }
        int i11 = i10 - 1;
        this.f28872a = i11;
        this.f28873b[i11] = e10;
        this.f28874c++;
    }

    public final void addLast(E e10) {
        j(e() + 1);
        this.f28873b[o(e() + this.f28872a)] = e10;
        this.f28874c = e() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int o10 = o(this.f28874c + this.f28872a);
        int i10 = this.f28872a;
        if (i10 < o10) {
            i.y(this.f28873b, i10, o10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f28873b;
            i.y(objArr, this.f28872a, objArr.length);
            i.y(this.f28873b, 0, o10);
        }
        this.f28872a = 0;
        this.f28874c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // ul.d
    public final int e() {
        return this.f28874c;
    }

    @Override // ul.d
    public final E f(int i10) {
        int i11 = this.f28874c;
        if (i10 >= 0 && i10 < i11) {
            if (i10 == h7.a.k(this)) {
                return removeLast();
            }
            if (i10 == 0) {
                return removeFirst();
            }
            int o10 = o(this.f28872a + i10);
            Object[] objArr = this.f28873b;
            E e10 = (E) objArr[o10];
            if (i10 < (this.f28874c >> 1)) {
                int i12 = this.f28872a;
                if (o10 >= i12) {
                    i.w(objArr, objArr, i12 + 1, i12, o10);
                } else {
                    i.w(objArr, objArr, 1, 0, o10);
                    Object[] objArr2 = this.f28873b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i13 = this.f28872a;
                    i.w(objArr2, objArr2, i13 + 1, i13, objArr2.length - 1);
                }
                Object[] objArr3 = this.f28873b;
                int i14 = this.f28872a;
                objArr3[i14] = null;
                this.f28872a = k(i14);
            } else {
                int o11 = o(h7.a.k(this) + this.f28872a);
                Object[] objArr4 = this.f28873b;
                int i15 = o10 + 1;
                if (o10 <= o11) {
                    i.w(objArr4, objArr4, o10, i15, o11 + 1);
                } else {
                    i.w(objArr4, objArr4, o10, i15, objArr4.length);
                    Object[] objArr5 = this.f28873b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    i.w(objArr5, objArr5, 0, 1, o11 + 1);
                }
                this.f28873b[o11] = null;
            }
            this.f28874c--;
            return e10;
        }
        throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", i11));
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f28873b[this.f28872a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        int e10 = e();
        if (i10 >= 0 && i10 < e10) {
            return (E) this.f28873b[o(this.f28872a + i10)];
        }
        throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", e10));
    }

    public final void i(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f28873b.length;
        while (i10 < length && it.hasNext()) {
            this.f28873b[i10] = it.next();
            i10++;
        }
        int i11 = this.f28872a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f28873b[i12] = it.next();
        }
        this.f28874c = collection.size() + e();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int o10 = o(e() + this.f28872a);
        int i10 = this.f28872a;
        if (i10 < o10) {
            while (i10 < o10) {
                if (!gm.l.a(obj, this.f28873b[i10])) {
                    i10++;
                }
            }
            return -1;
        } else if (i10 >= o10) {
            int length = this.f28873b.length;
            while (true) {
                if (i10 < length) {
                    if (gm.l.a(obj, this.f28873b[i10])) {
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < o10; i11++) {
                        if (gm.l.a(obj, this.f28873b[i11])) {
                            i10 = i11 + this.f28873b.length;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - this.f28872a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return e() == 0;
    }

    public final void j(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f28873b;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == f28871d) {
                if (i10 < 10) {
                    i10 = 10;
                }
                this.f28873b = new Object[i10];
                return;
            }
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                if (i10 > 2147483639) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i11];
            i.w(objArr, objArr2, 0, this.f28872a, objArr.length);
            Object[] objArr3 = this.f28873b;
            int length2 = objArr3.length;
            int i12 = this.f28872a;
            i.w(objArr3, objArr2, length2 - i12, 0, i12);
            this.f28872a = 0;
            this.f28873b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int k(int i10) {
        Object[] objArr = this.f28873b;
        gm.l.f(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f28873b[o(h7.a.k(this) + this.f28872a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int o10 = o(this.f28874c + this.f28872a);
        int i10 = this.f28872a;
        if (i10 < o10) {
            length = o10 - 1;
            if (i10 <= length) {
                while (!gm.l.a(obj, this.f28873b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                return length - this.f28872a;
            }
            return -1;
        }
        if (i10 > o10) {
            int i11 = o10 - 1;
            while (true) {
                if (-1 < i11) {
                    if (gm.l.a(obj, this.f28873b[i11])) {
                        length = i11 + this.f28873b.length;
                        break;
                    }
                    i11--;
                } else {
                    Object[] objArr = this.f28873b;
                    gm.l.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f28872a;
                    if (i12 <= length) {
                        while (!gm.l.a(obj, this.f28873b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                    }
                }
            }
            return length - this.f28872a;
        }
        return -1;
    }

    public final E n() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f28873b[o(h7.a.k(this) + this.f28872a)];
    }

    public final int o(int i10) {
        Object[] objArr = this.f28873b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        f(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> collection) {
        boolean z10;
        int i10;
        gm.l.f(collection, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if (this.f28873b.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int o10 = o(this.f28874c + this.f28872a);
                int i11 = this.f28872a;
                if (i11 < o10) {
                    i10 = i11;
                    while (i11 < o10) {
                        Object obj = this.f28873b[i11];
                        if (!collection.contains(obj)) {
                            this.f28873b[i10] = obj;
                            i10++;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    i.y(this.f28873b, i10, o10);
                } else {
                    int length = this.f28873b.length;
                    int i12 = i11;
                    boolean z12 = false;
                    while (i11 < length) {
                        Object[] objArr = this.f28873b;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (!collection.contains(obj2)) {
                            this.f28873b[i12] = obj2;
                            i12++;
                        } else {
                            z12 = true;
                        }
                        i11++;
                    }
                    int o11 = o(i12);
                    for (int i13 = 0; i13 < o10; i13++) {
                        Object[] objArr2 = this.f28873b;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (!collection.contains(obj3)) {
                            this.f28873b[o11] = obj3;
                            o11 = k(o11);
                        } else {
                            z12 = true;
                        }
                    }
                    i10 = o11;
                    z11 = z12;
                }
                if (z11) {
                    int i14 = i10 - this.f28872a;
                    if (i14 < 0) {
                        i14 += this.f28873b.length;
                    }
                    this.f28874c = i14;
                }
            }
        }
        return z11;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f28873b;
            int i10 = this.f28872a;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.f28872a = k(i10);
            this.f28874c = e() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int o10 = o(h7.a.k(this) + this.f28872a);
            Object[] objArr = this.f28873b;
            E e10 = (E) objArr[o10];
            objArr[o10] = null;
            this.f28874c = e() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> collection) {
        boolean z10;
        int i10;
        gm.l.f(collection, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if (this.f28873b.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int o10 = o(this.f28874c + this.f28872a);
                int i11 = this.f28872a;
                if (i11 < o10) {
                    i10 = i11;
                    while (i11 < o10) {
                        Object obj = this.f28873b[i11];
                        if (collection.contains(obj)) {
                            this.f28873b[i10] = obj;
                            i10++;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    i.y(this.f28873b, i10, o10);
                } else {
                    int length = this.f28873b.length;
                    int i12 = i11;
                    boolean z12 = false;
                    while (i11 < length) {
                        Object[] objArr = this.f28873b;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (collection.contains(obj2)) {
                            this.f28873b[i12] = obj2;
                            i12++;
                        } else {
                            z12 = true;
                        }
                        i11++;
                    }
                    int o11 = o(i12);
                    for (int i13 = 0; i13 < o10; i13++) {
                        Object[] objArr2 = this.f28873b;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (collection.contains(obj3)) {
                            this.f28873b[o11] = obj3;
                            o11 = k(o11);
                        } else {
                            z12 = true;
                        }
                    }
                    i10 = o11;
                    z11 = z12;
                }
                if (z11) {
                    int i14 = i10 - this.f28872a;
                    if (i14 < 0) {
                        i14 += this.f28873b.length;
                    }
                    this.f28874c = i14;
                }
            }
        }
        return z11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        int e11 = e();
        if (i10 >= 0 && i10 < e11) {
            int o10 = o(this.f28872a + i10);
            Object[] objArr = this.f28873b;
            E e12 = (E) objArr[o10];
            objArr[o10] = e10;
            return e12;
        }
        throw new IndexOutOfBoundsException(p1.a("index: ", i10, ", size: ", e11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        gm.l.f(tArr, "array");
        int length = tArr.length;
        int i10 = this.f28874c;
        if (length < i10) {
            Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
            gm.l.d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) newInstance);
        }
        int o10 = o(this.f28874c + this.f28872a);
        int i11 = this.f28872a;
        if (i11 < o10) {
            i.x(this.f28873b, tArr, 0, i11, o10, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f28873b;
            i.w(objArr, tArr, 0, this.f28872a, objArr.length);
            Object[] objArr2 = this.f28873b;
            i.w(objArr2, tArr, objArr2.length - this.f28872a, 0, o10);
        }
        int length2 = tArr.length;
        int i12 = this.f28874c;
        if (length2 > i12) {
            tArr[i12] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        gm.l.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j(collection.size() + e());
        i(o(e() + this.f28872a), collection);
        return true;
    }
}
