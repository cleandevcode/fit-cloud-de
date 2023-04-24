package o0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o0.g;

/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: e */
    public static final int[] f22511e = new int[0];

    /* renamed from: f */
    public static final Object[] f22512f = new Object[0];

    /* renamed from: g */
    public static Object[] f22513g;

    /* renamed from: h */
    public static int f22514h;

    /* renamed from: i */
    public static Object[] f22515i;

    /* renamed from: j */
    public static int f22516j;

    /* renamed from: a */
    public int[] f22517a;

    /* renamed from: b */
    public Object[] f22518b;

    /* renamed from: c */
    public int f22519c;

    /* renamed from: d */
    public c f22520d;

    public d() {
        this(0);
    }

    public d(int i10) {
        if (i10 == 0) {
            this.f22517a = f22511e;
            this.f22518b = f22512f;
        } else {
            b(i10);
        }
        this.f22519c = 0;
    }

    public static void e(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f22516j < 10) {
                    objArr[0] = f22515i;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f22515i = objArr;
                    f22516j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (f22514h < 10) {
                    objArr[0] = f22513g;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f22513g = objArr;
                    f22514h++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int f10;
        if (e10 == null) {
            f10 = i();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            f10 = f(hashCode, e10);
        }
        if (f10 >= 0) {
            return false;
        }
        int i11 = ~f10;
        int i12 = this.f22519c;
        int[] iArr = this.f22517a;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f22518b;
            b(i13);
            int[] iArr2 = this.f22517a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f22518b, 0, objArr.length);
            }
            e(iArr, objArr, this.f22519c);
        }
        int i14 = this.f22519c;
        if (i11 < i14) {
            int[] iArr3 = this.f22517a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f22518b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f22519c - i11);
        }
        this.f22517a[i11] = i10;
        this.f22518b[i11] = e10;
        this.f22519c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f22519c;
        int[] iArr = this.f22517a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f22518b;
            b(size);
            int i10 = this.f22519c;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f22517a, 0, i10);
                System.arraycopy(objArr, 0, this.f22518b, 0, this.f22519c);
            }
            e(iArr, objArr, this.f22519c);
        }
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    public final void b(int i10) {
        if (i10 == 8) {
            synchronized (d.class) {
                Object[] objArr = f22515i;
                if (objArr != null) {
                    this.f22518b = objArr;
                    f22515i = (Object[]) objArr[0];
                    this.f22517a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f22516j--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = f22513g;
                if (objArr2 != null) {
                    this.f22518b = objArr2;
                    f22513g = (Object[]) objArr2[0];
                    this.f22517a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f22514h--;
                    return;
                }
            }
        }
        this.f22517a = new int[i10];
        this.f22518b = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f22519c;
        if (i10 != 0) {
            e(this.f22517a, this.f22518b, i10);
            this.f22517a = f22511e;
            this.f22518b = f22512f;
            this.f22519c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f22519c != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f22519c; i10++) {
                try {
                    if (!set.contains(this.f22518b[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10, Object obj) {
        int i11 = this.f22519c;
        if (i11 == 0) {
            return -1;
        }
        int b10 = hh.d.b(i11, i10, this.f22517a);
        if (b10 >= 0 && !obj.equals(this.f22518b[b10])) {
            int i12 = b10 + 1;
            while (i12 < i11 && this.f22517a[i12] == i10) {
                if (obj.equals(this.f22518b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = b10 - 1; i13 >= 0 && this.f22517a[i13] == i10; i13--) {
                if (obj.equals(this.f22518b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return b10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f22517a;
        int i10 = this.f22519c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int i() {
        int i10 = this.f22519c;
        if (i10 == 0) {
            return -1;
        }
        int b10 = hh.d.b(i10, 0, this.f22517a);
        if (b10 >= 0 && this.f22518b[b10] != null) {
            int i11 = b10 + 1;
            while (i11 < i10 && this.f22517a[i11] == 0) {
                if (this.f22518b[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = b10 - 1; i12 >= 0 && this.f22517a[i12] == 0; i12--) {
                if (this.f22518b[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return b10;
    }

    public final int indexOf(Object obj) {
        return obj == null ? i() : f(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f22519c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f22520d == null) {
            this.f22520d = new c(this);
        }
        c cVar = this.f22520d;
        if (cVar.f22532b == null) {
            cVar.f22532b = new g.c();
        }
        return (Iterator<E>) cVar.f22532b.iterator();
    }

    public final void j(int i10) {
        Object[] objArr = this.f22518b;
        Object obj = objArr[i10];
        int i11 = this.f22519c;
        if (i11 <= 1) {
            e(this.f22517a, objArr, i11);
            this.f22517a = f22511e;
            this.f22518b = f22512f;
            this.f22519c = 0;
            return;
        }
        int[] iArr = this.f22517a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f22519c = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.f22518b;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f22519c - i10);
            }
            this.f22518b[this.f22519c] = null;
            return;
        }
        b(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f22519c--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f22517a, 0, i10);
            System.arraycopy(objArr, 0, this.f22518b, 0, i10);
        }
        int i14 = this.f22519c;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.f22517a, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.f22518b, i10, this.f22519c - i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            j(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f22519c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f22518b[i10])) {
                j(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f22519c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f22519c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f22518b, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f22519c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f22519c));
        }
        System.arraycopy(this.f22518b, 0, tArr, 0, this.f22519c);
        int length = tArr.length;
        int i10 = this.f22519c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f22519c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f22519c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f22518b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
