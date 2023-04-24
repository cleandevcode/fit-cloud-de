package o0;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class h<K, V> {

    /* renamed from: d */
    public static Object[] f22546d;

    /* renamed from: e */
    public static int f22547e;

    /* renamed from: f */
    public static Object[] f22548f;

    /* renamed from: g */
    public static int f22549g;

    /* renamed from: a */
    public int[] f22550a;

    /* renamed from: b */
    public Object[] f22551b;

    /* renamed from: c */
    public int f22552c;

    public h() {
        this.f22550a = hh.d.f16096a;
        this.f22551b = hh.d.f16097b;
        this.f22552c = 0;
    }

    public h(int i10) {
        if (i10 == 0) {
            this.f22550a = hh.d.f16096a;
            this.f22551b = hh.d.f16097b;
        } else {
            a(i10);
        }
        this.f22552c = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (h.class) {
                Object[] objArr = f22548f;
                if (objArr != null) {
                    this.f22551b = objArr;
                    f22548f = (Object[]) objArr[0];
                    this.f22550a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f22549g--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f22546d;
                if (objArr2 != null) {
                    this.f22551b = objArr2;
                    f22546d = (Object[]) objArr2[0];
                    this.f22550a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f22547e--;
                    return;
                }
            }
        }
        this.f22550a = new int[i10];
        this.f22551b = new Object[i10 << 1];
    }

    public static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f22549g < 10) {
                    objArr[0] = f22548f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f22548f = objArr;
                    f22549g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f22547e < 10) {
                    objArr[0] = f22546d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f22546d = objArr;
                    f22547e++;
                }
            }
        }
    }

    public final void c(int i10) {
        int i11 = this.f22552c;
        int[] iArr = this.f22550a;
        if (iArr.length < i10) {
            Object[] objArr = this.f22551b;
            a(i10);
            if (this.f22552c > 0) {
                System.arraycopy(iArr, 0, this.f22550a, 0, i11);
                System.arraycopy(objArr, 0, this.f22551b, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f22552c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f22552c;
        if (i10 > 0) {
            int[] iArr = this.f22550a;
            Object[] objArr = this.f22551b;
            this.f22550a = hh.d.f16096a;
            this.f22551b = hh.d.f16097b;
            this.f22552c = 0;
            d(iArr, objArr, i10);
        }
        if (this.f22552c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final int e(int i10, Object obj) {
        int i11 = this.f22552c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int b10 = hh.d.b(i11, i10, this.f22550a);
            if (b10 < 0) {
                return b10;
            }
            if (obj.equals(this.f22551b[b10 << 1])) {
                return b10;
            }
            int i12 = b10 + 1;
            while (i12 < i11 && this.f22550a[i12] == i10) {
                if (obj.equals(this.f22551b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = b10 - 1; i13 >= 0 && this.f22550a[i13] == i10; i13--) {
                if (obj.equals(this.f22551b[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (size() != hVar.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f22552c; i10++) {
                try {
                    K i11 = i(i10);
                    V m10 = m(i10);
                    Object obj2 = hVar.get(i11);
                    if (m10 == null) {
                        if (obj2 != null || !hVar.containsKey(i11)) {
                            return false;
                        }
                    } else if (!m10.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i12 = 0; i12 < this.f22552c; i12++) {
                try {
                    K i13 = i(i12);
                    V m11 = m(i12);
                    Object obj3 = map.get(i13);
                    if (m11 == null) {
                        if (obj3 != null || !map.containsKey(i13)) {
                            return false;
                        }
                    } else if (!m11.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        return obj == null ? g() : e(obj.hashCode(), obj);
    }

    public final int g() {
        int i10 = this.f22552c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int b10 = hh.d.b(i10, 0, this.f22550a);
            if (b10 < 0) {
                return b10;
            }
            if (this.f22551b[b10 << 1] == null) {
                return b10;
            }
            int i11 = b10 + 1;
            while (i11 < i10 && this.f22550a[i11] == 0) {
                if (this.f22551b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = b10 - 1; i12 >= 0 && this.f22550a[i12] == 0; i12--) {
                if (this.f22551b[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v10) {
        int f10 = f(obj);
        return f10 >= 0 ? (V) this.f22551b[(f10 << 1) + 1] : v10;
    }

    public final int h(Object obj) {
        int i10 = this.f22552c * 2;
        Object[] objArr = this.f22551b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f22550a;
        Object[] objArr = this.f22551b;
        int i10 = this.f22552c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final K i(int i10) {
        return (K) this.f22551b[i10 << 1];
    }

    public final boolean isEmpty() {
        return this.f22552c <= 0;
    }

    public void j(b bVar) {
        int i10 = bVar.f22552c;
        c(this.f22552c + i10);
        if (this.f22552c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(bVar.i(i11), bVar.m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(bVar.f22550a, 0, this.f22550a, 0, i10);
            System.arraycopy(bVar.f22551b, 0, this.f22551b, 0, i10 << 1);
            this.f22552c = i10;
        }
    }

    public V k(int i10) {
        Object[] objArr = this.f22551b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f22552c;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f22550a, objArr, i12);
            this.f22550a = hh.d.f16096a;
            this.f22551b = hh.d.f16097b;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f22550a;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f22551b;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f22551b;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f22552c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f22550a, 0, i10);
                    System.arraycopy(objArr, 0, this.f22551b, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f22550a, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f22551b, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 == this.f22552c) {
            this.f22552c = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f22551b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public final V m(int i10) {
        return (V) this.f22551b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int e10;
        int i11 = this.f22552c;
        if (k10 == null) {
            e10 = g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            e10 = e(hashCode, k10);
        }
        if (e10 >= 0) {
            int i12 = (e10 << 1) + 1;
            Object[] objArr = this.f22551b;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~e10;
        int[] iArr = this.f22550a;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f22551b;
            a(i14);
            if (i11 != this.f22552c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f22550a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f22551b, 0, objArr2.length);
            }
            d(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f22550a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f22551b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f22552c - i13) << 1);
        }
        int i16 = this.f22552c;
        if (i11 == i16) {
            int[] iArr4 = this.f22550a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f22551b;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f22552c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public final V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return k(f10);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 >= 0) {
            V m10 = m(f10);
            if (obj2 == m10 || (obj2 != null && obj2.equals(m10))) {
                k(f10);
                return true;
            }
            return false;
        }
        return false;
    }

    public final V replace(K k10, V v10) {
        int f10 = f(k10);
        if (f10 >= 0) {
            return l(f10, v10);
        }
        return null;
    }

    public final boolean replace(K k10, V v10, V v11) {
        int f10 = f(k10);
        if (f10 >= 0) {
            V m10 = m(f10);
            if (m10 == v10 || (v10 != null && v10.equals(m10))) {
                l(f10, v11);
                return true;
            }
            return false;
        }
        return false;
    }

    public final int size() {
        return this.f22552c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f22552c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f22552c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K i11 = i(i10);
            if (i11 != this) {
                sb2.append(i11);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V m10 = m(i10);
            if (m10 != this) {
                sb2.append(m10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
