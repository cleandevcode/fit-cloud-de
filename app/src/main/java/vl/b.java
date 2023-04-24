package vl;

import bi.m0;
import gm.l;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import lm.i;
import lm.j;

/* loaded from: classes2.dex */
public final class b<K, V> implements Map<K, V>, Serializable, hm.d {

    /* renamed from: a */
    public K[] f29447a;

    /* renamed from: b */
    public V[] f29448b;

    /* renamed from: c */
    public int[] f29449c;

    /* renamed from: d */
    public int[] f29450d;

    /* renamed from: e */
    public int f29451e;

    /* renamed from: f */
    public int f29452f;

    /* renamed from: g */
    public int f29453g;

    /* renamed from: h */
    public int f29454h;

    /* renamed from: i */
    public vl.d<K> f29455i;

    /* renamed from: j */
    public vl.e<V> f29456j;

    /* renamed from: k */
    public vl.c<K, V> f29457k;

    /* renamed from: l */
    public boolean f29458l;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* renamed from: vl.b$b */
    /* loaded from: classes2.dex */
    public static final class C0537b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, hm.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0537b(b<K, V> bVar) {
            super(bVar);
            l.f(bVar, "map");
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i10 = this.f29462b;
            b<K, V> bVar = this.f29461a;
            if (i10 < bVar.f29452f) {
                this.f29462b = i10 + 1;
                this.f29463c = i10;
                c cVar = new c(bVar, i10);
                a();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, hm.a {

        /* renamed from: a */
        public final b<K, V> f29459a;

        /* renamed from: b */
        public final int f29460b;

        public c(b<K, V> bVar, int i10) {
            l.f(bVar, "map");
            this.f29459a = bVar;
            this.f29460b = i10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f29459a.f29447a[this.f29460b];
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            V[] vArr = this.f29459a.f29448b;
            l.c(vArr);
            return vArr[this.f29460b];
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            this.f29459a.c();
            b<K, V> bVar = this.f29459a;
            V[] vArr = bVar.f29448b;
            if (vArr == null) {
                vArr = (V[]) m0.c(bVar.f29447a.length);
                bVar.f29448b = vArr;
            }
            int i10 = this.f29460b;
            V v11 = vArr[i10];
            vArr[i10] = v10;
            return v11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static class d<K, V> {

        /* renamed from: a */
        public final b<K, V> f29461a;

        /* renamed from: b */
        public int f29462b;

        /* renamed from: c */
        public int f29463c;

        public d(b<K, V> bVar) {
            l.f(bVar, "map");
            this.f29461a = bVar;
            this.f29463c = -1;
            a();
        }

        public final void a() {
            while (true) {
                int i10 = this.f29462b;
                b<K, V> bVar = this.f29461a;
                if (i10 < bVar.f29452f && bVar.f29449c[i10] < 0) {
                    this.f29462b = i10 + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            return this.f29462b < this.f29461a.f29452f;
        }

        public final void remove() {
            boolean z10;
            if (this.f29463c != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f29461a.c();
                this.f29461a.j(this.f29463c);
                this.f29463c = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, hm.a {
        public e(b<K, V> bVar) {
            super(bVar);
        }

        @Override // java.util.Iterator
        public final K next() {
            int i10 = this.f29462b;
            b<K, V> bVar = this.f29461a;
            if (i10 < bVar.f29452f) {
                this.f29462b = i10 + 1;
                this.f29463c = i10;
                K k10 = bVar.f29447a[i10];
                a();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, hm.a {
        public f(b<K, V> bVar) {
            super(bVar);
        }

        @Override // java.util.Iterator
        public final V next() {
            int i10 = this.f29462b;
            b<K, V> bVar = this.f29461a;
            if (i10 < bVar.f29452f) {
                this.f29462b = i10 + 1;
                this.f29463c = i10;
                V[] vArr = bVar.f29448b;
                l.c(vArr);
                V v10 = vArr[this.f29463c];
                a();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        new a();
    }

    public b() {
        this(8);
    }

    public b(int i10) {
        K[] kArr = (K[]) m0.c(i10);
        int[] iArr = new int[i10];
        int highestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f29447a = kArr;
        this.f29448b = null;
        this.f29449c = iArr;
        this.f29450d = new int[highestOneBit];
        this.f29451e = 2;
        this.f29452f = 0;
        this.f29453g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    private final Object writeReplace() {
        if (this.f29458l) {
            return new g(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(K k10) {
        c();
        while (true) {
            int h10 = h(k10);
            int i10 = this.f29451e * 2;
            int length = this.f29450d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f29450d;
                int i12 = iArr[h10];
                if (i12 <= 0) {
                    int i13 = this.f29452f;
                    K[] kArr = this.f29447a;
                    if (i13 >= kArr.length) {
                        f(1);
                    } else {
                        int i14 = i13 + 1;
                        this.f29452f = i14;
                        kArr[i13] = k10;
                        this.f29449c[i13] = h10;
                        iArr[h10] = i14;
                        this.f29454h++;
                        if (i11 > this.f29451e) {
                            this.f29451e = i11;
                        }
                        return i13;
                    }
                } else if (l.a(this.f29447a[i12 - 1], k10)) {
                    return -i12;
                } else {
                    i11++;
                    if (i11 > i10) {
                        i(this.f29450d.length * 2);
                        break;
                    }
                    int i15 = h10 - 1;
                    if (h10 == 0) {
                        h10 = this.f29450d.length - 1;
                    } else {
                        h10 = i15;
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.f29458l) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        i it = new j(0, this.f29452f - 1).iterator();
        while (it.f20076c) {
            int nextInt = it.nextInt();
            int[] iArr = this.f29449c;
            int i10 = iArr[nextInt];
            if (i10 >= 0) {
                this.f29450d[i10] = 0;
                iArr[nextInt] = -1;
            }
        }
        m0.A(0, this.f29452f, this.f29447a);
        V[] vArr = this.f29448b;
        if (vArr != null) {
            m0.A(0, this.f29452f, vArr);
        }
        this.f29454h = 0;
        this.f29452f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i10;
        int i11 = this.f29452f;
        while (true) {
            i10 = -1;
            i11--;
            if (i11 < 0) {
                break;
            } else if (this.f29449c[i11] >= 0) {
                V[] vArr = this.f29448b;
                l.c(vArr);
                if (l.a(vArr[i11], obj)) {
                    i10 = i11;
                    break;
                }
            }
        }
        return i10 >= 0;
    }

    public final boolean d(Collection<?> collection) {
        l.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry<? extends K, ? extends V> entry) {
        l.f(entry, "entry");
        int g10 = g(entry.getKey());
        if (g10 < 0) {
            return false;
        }
        V[] vArr = this.f29448b;
        l.c(vArr);
        return l.a(vArr[g10], entry.getValue());
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        vl.c<K, V> cVar = this.f29457k;
        if (cVar == null) {
            vl.c<K, V> cVar2 = new vl.c<>(this);
            this.f29457k = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            if (this.f29454h == map.size() && d(map.entrySet())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        int length;
        V[] vArr;
        int i11 = this.f29452f;
        int i12 = i10 + i11;
        if (i12 >= 0) {
            K[] kArr = this.f29447a;
            if (i12 > kArr.length) {
                int length2 = (kArr.length * 3) / 2;
                if (i12 <= length2) {
                    i12 = length2;
                }
                K[] kArr2 = (K[]) Arrays.copyOf(kArr, i12);
                l.e(kArr2, "copyOf(this, newSize)");
                this.f29447a = kArr2;
                V[] vArr2 = this.f29448b;
                if (vArr2 != null) {
                    vArr = (V[]) Arrays.copyOf(vArr2, i12);
                    l.e(vArr, "copyOf(this, newSize)");
                } else {
                    vArr = null;
                }
                this.f29448b = vArr;
                int[] copyOf = Arrays.copyOf(this.f29449c, i12);
                l.e(copyOf, "copyOf(this, newSize)");
                this.f29449c = copyOf;
                if (i12 < 1) {
                    i12 = 1;
                }
                length = Integer.highestOneBit(i12 * 3);
                if (length <= this.f29450d.length) {
                    return;
                }
            } else if ((i11 + i12) - this.f29454h > kArr.length) {
                length = this.f29450d.length;
            } else {
                return;
            }
            i(length);
            return;
        }
        throw new OutOfMemoryError();
    }

    public final int g(K k10) {
        int h10 = h(k10);
        int i10 = this.f29451e;
        while (true) {
            int i11 = this.f29450d[h10];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (l.a(this.f29447a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            h10 = h10 == 0 ? this.f29450d.length - 1 : h10 - 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V get(Object obj) {
        int g10 = g(obj);
        if (g10 < 0) {
            return null;
        }
        V[] vArr = this.f29448b;
        l.c(vArr);
        return vArr[g10];
    }

    public final int h(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f29453g;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i10;
        int i11;
        C0537b c0537b = new C0537b(this);
        int i12 = 0;
        while (c0537b.hasNext()) {
            int i13 = c0537b.f29462b;
            b<K, V> bVar = c0537b.f29461a;
            if (i13 < bVar.f29452f) {
                c0537b.f29462b = i13 + 1;
                c0537b.f29463c = i13;
                K k10 = bVar.f29447a[i13];
                if (k10 != null) {
                    i10 = k10.hashCode();
                } else {
                    i10 = 0;
                }
                V[] vArr = c0537b.f29461a.f29448b;
                l.c(vArr);
                V v10 = vArr[c0537b.f29463c];
                if (v10 != null) {
                    i11 = v10.hashCode();
                } else {
                    i11 = 0;
                }
                c0537b.a();
                i12 += i10 ^ i11;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i12;
    }

    public final void i(int i10) {
        boolean z10;
        int i11;
        if (this.f29452f > this.f29454h) {
            V[] vArr = this.f29448b;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i11 = this.f29452f;
                if (i12 >= i11) {
                    break;
                }
                if (this.f29449c[i12] >= 0) {
                    K[] kArr = this.f29447a;
                    kArr[i13] = kArr[i12];
                    if (vArr != null) {
                        vArr[i13] = vArr[i12];
                    }
                    i13++;
                }
                i12++;
            }
            m0.A(i13, i11, this.f29447a);
            if (vArr != null) {
                m0.A(i13, this.f29452f, vArr);
            }
            this.f29452f = i13;
        }
        int[] iArr = this.f29450d;
        if (i10 != iArr.length) {
            this.f29450d = new int[i10];
            this.f29453g = Integer.numberOfLeadingZeros(i10) + 1;
        } else {
            int length = iArr.length;
            l.f(iArr, "<this>");
            Arrays.fill(iArr, 0, length, 0);
        }
        int i14 = 0;
        while (i14 < this.f29452f) {
            int i15 = i14 + 1;
            int h10 = h(this.f29447a[i14]);
            int i16 = this.f29451e;
            while (true) {
                int[] iArr2 = this.f29450d;
                if (iArr2[h10] == 0) {
                    iArr2[h10] = i15;
                    this.f29449c[i14] = h10;
                    z10 = true;
                    break;
                }
                i16--;
                if (i16 < 0) {
                    z10 = false;
                    break;
                }
                int i17 = h10 - 1;
                if (h10 == 0) {
                    h10 = iArr2.length - 1;
                } else {
                    h10 = i17;
                }
            }
            if (z10) {
                i14 = i15;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f29454h == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f29447a
            java.lang.String r1 = "<this>"
            gm.l.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.f29449c
            r0 = r0[r12]
            int r1 = r11.f29451e
            int r1 = r1 * 2
            int[] r2 = r11.f29450d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1a
            r1 = r2
        L1a:
            r2 = 0
            r3 = r1
            r4 = 0
            r1 = r0
        L1e:
            int r5 = r0 + (-1)
            r6 = -1
            if (r0 != 0) goto L28
            int[] r0 = r11.f29450d
            int r0 = r0.length
            int r0 = r0 + r6
            goto L29
        L28:
            r0 = r5
        L29:
            int r4 = r4 + 1
            int r5 = r11.f29451e
            if (r4 <= r5) goto L34
            int[] r0 = r11.f29450d
            r0[r1] = r2
            goto L63
        L34:
            int[] r5 = r11.f29450d
            r7 = r5[r0]
            if (r7 != 0) goto L3d
            r5[r1] = r2
            goto L63
        L3d:
            if (r7 >= 0) goto L42
            r5[r1] = r6
            goto L5a
        L42:
            K[] r5 = r11.f29447a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.h(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f29450d
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L5c
            r9[r1] = r7
            int[] r4 = r11.f29449c
            r4[r8] = r1
        L5a:
            r1 = r0
            r4 = 0
        L5c:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1e
            int[] r0 = r11.f29450d
            r0[r1] = r6
        L63:
            int[] r0 = r11.f29449c
            r0[r12] = r6
            int r12 = r11.f29454h
            int r12 = r12 + r6
            r11.f29454h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.b.j(int):void");
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        vl.d<K> dVar = this.f29455i;
        if (dVar == null) {
            vl.d<K> dVar2 = new vl.d<>(this);
            this.f29455i = dVar2;
            return dVar2;
        }
        return dVar;
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        c();
        int a10 = a(k10);
        V[] vArr = this.f29448b;
        if (vArr == null) {
            vArr = (V[]) m0.c(this.f29447a.length);
            this.f29448b = vArr;
        }
        if (a10 < 0) {
            int i10 = (-a10) - 1;
            V v11 = vArr[i10];
            vArr[i10] = v10;
            return v11;
        }
        vArr[a10] = v10;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        l.f(map, "from");
        c();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            f(entrySet.size());
            for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
                int a10 = a(entry.getKey());
                V[] vArr = this.f29448b;
                if (vArr == null) {
                    vArr = (V[]) m0.c(this.f29447a.length);
                    this.f29448b = vArr;
                }
                if (a10 >= 0) {
                    vArr[a10] = entry.getValue();
                } else {
                    int i10 = (-a10) - 1;
                    if (!l.a(entry.getValue(), vArr[i10])) {
                        vArr[i10] = entry.getValue();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V remove(Object obj) {
        c();
        int g10 = g(obj);
        if (g10 < 0) {
            g10 = -1;
        } else {
            j(g10);
        }
        if (g10 < 0) {
            return null;
        }
        V[] vArr = this.f29448b;
        l.c(vArr);
        V v10 = vArr[g10];
        vArr[g10] = null;
        return v10;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f29454h;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f29454h * 3) + 2);
        sb2.append("{");
        int i10 = 0;
        C0537b c0537b = new C0537b(this);
        while (c0537b.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = c0537b.f29462b;
            b<K, V> bVar = c0537b.f29461a;
            if (i11 < bVar.f29452f) {
                c0537b.f29462b = i11 + 1;
                c0537b.f29463c = i11;
                K k10 = bVar.f29447a[i11];
                if (l.a(k10, bVar)) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(k10);
                }
                sb2.append('=');
                V[] vArr = c0537b.f29461a.f29448b;
                l.c(vArr);
                V v10 = vArr[c0537b.f29463c];
                if (l.a(v10, c0537b.f29461a)) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(v10);
                }
                c0537b.a();
                i10++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        l.e(sb3, "sb.toString()");
        return sb3;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        vl.e<V> eVar = this.f29456j;
        if (eVar == null) {
            vl.e<V> eVar2 = new vl.e<>(this);
            this.f29456j = eVar2;
            return eVar2;
        }
        return eVar;
    }
}
