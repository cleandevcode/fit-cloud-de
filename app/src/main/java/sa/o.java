package sa;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class o<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i */
    public static final a f26776i = new a();

    /* renamed from: a */
    public final Comparator<? super K> f26777a;

    /* renamed from: b */
    public final boolean f26778b;

    /* renamed from: c */
    public e<K, V> f26779c;

    /* renamed from: d */
    public int f26780d;

    /* renamed from: e */
    public int f26781e;

    /* renamed from: f */
    public final e<K, V> f26782f;

    /* renamed from: g */
    public o<K, V>.b f26783g;

    /* renamed from: h */
    public o<K, V>.c f26784h;

    /* loaded from: classes.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        public class a extends o<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return a();
            }
        }

        public b() {
            o.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && o.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e<K, V> c10;
            if ((obj instanceof Map.Entry) && (c10 = o.this.c((Map.Entry) obj)) != null) {
                o.this.e(c10, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o.this.f26780d;
        }
    }

    /* loaded from: classes.dex */
    public final class c extends AbstractSet<K> {

        /* loaded from: classes.dex */
        public class a extends o<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public final K next() {
                return a().f26796f;
            }
        }

        public c() {
            o.this = r1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return o.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            o oVar = o.this;
            oVar.getClass();
            e<K, V> eVar = null;
            if (obj != null) {
                try {
                    eVar = oVar.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVar != null) {
                oVar.e(eVar, true);
            }
            if (eVar == null) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o.this.f26780d;
        }
    }

    /* loaded from: classes.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a */
        public e<K, V> f26787a;

        /* renamed from: b */
        public e<K, V> f26788b = null;

        /* renamed from: c */
        public int f26789c;

        public d() {
            o.this = r2;
            this.f26787a = r2.f26782f.f26794d;
            this.f26789c = r2.f26781e;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f26787a;
            o oVar = o.this;
            if (eVar != oVar.f26782f) {
                if (oVar.f26781e == this.f26789c) {
                    this.f26787a = eVar.f26794d;
                    this.f26788b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f26787a != o.this.f26782f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f26788b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            o.this.e(eVar, true);
            this.f26788b = null;
            this.f26789c = o.this.f26781e;
        }
    }

    /* loaded from: classes.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public e<K, V> f26791a;

        /* renamed from: b */
        public e<K, V> f26792b;

        /* renamed from: c */
        public e<K, V> f26793c;

        /* renamed from: d */
        public e<K, V> f26794d;

        /* renamed from: e */
        public e<K, V> f26795e;

        /* renamed from: f */
        public final K f26796f;

        /* renamed from: g */
        public final boolean f26797g;

        /* renamed from: h */
        public V f26798h;

        /* renamed from: i */
        public int f26799i;

        public e(boolean z10) {
            this.f26796f = null;
            this.f26797g = z10;
            this.f26795e = this;
            this.f26794d = this;
        }

        public e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f26791a = eVar;
            this.f26796f = k10;
            this.f26797g = z10;
            this.f26799i = 1;
            this.f26794d = eVar2;
            this.f26795e = eVar3;
            eVar3.f26794d = this;
            eVar2.f26795e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f26796f;
                if (k10 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k10.equals(entry.getKey())) {
                    return false;
                }
                V v10 = this.f26798h;
                Object value = entry.getValue();
                if (v10 == null) {
                    if (value != null) {
                        return false;
                    }
                } else if (!v10.equals(value)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f26796f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f26798h;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f26796f;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f26798h;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (v10 != null || this.f26797g) {
                V v11 = this.f26798h;
                this.f26798h = v10;
                return v11;
            }
            throw new NullPointerException("value == null");
        }

        public final String toString() {
            return this.f26796f + ContainerUtils.KEY_VALUE_DELIMITER + this.f26798h;
        }
    }

    public o() {
        this(true);
    }

    public o(boolean z10) {
        a aVar = f26776i;
        this.f26780d = 0;
        this.f26781e = 0;
        this.f26777a = aVar;
        this.f26778b = z10;
        this.f26782f = new e<>(z10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final e<K, V> a(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f26777a;
        e<K, V> eVar2 = this.f26779c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f26776i ? (Comparable) k10 : null;
            while (true) {
                Object obj = (K) eVar2.f26796f;
                i10 = comparable != null ? comparable.compareTo(obj) : comparator.compare(k10, obj);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f26792b : eVar2.f26793c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (z10) {
            e<K, V> eVar4 = this.f26782f;
            if (eVar2 != null) {
                eVar = new e<>(this.f26778b, eVar2, k10, eVar4, eVar4.f26795e);
                if (i10 < 0) {
                    eVar2.f26792b = eVar;
                } else {
                    eVar2.f26793c = eVar;
                }
                d(eVar2, true);
            } else if (comparator == f26776i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            } else {
                eVar = new e<>(this.f26778b, eVar2, k10, eVar4, eVar4.f26795e);
                this.f26779c = eVar;
            }
            this.f26780d++;
            this.f26781e++;
            return eVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sa.o.e<K, V> c(java.util.Map.Entry<?, ?> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Ld
            sa.o$e r0 = r5.a(r0, r2)     // Catch: java.lang.ClassCastException -> Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            r3 = 1
            if (r0 == 0) goto L28
            V r4 = r0.f26798h
            java.lang.Object r6 = r6.getValue()
            if (r4 == r6) goto L24
            if (r4 == 0) goto L22
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L22
            goto L24
        L22:
            r6 = 0
            goto L25
        L24:
            r6 = 1
        L25:
            if (r6 == 0) goto L28
            r2 = 1
        L28:
            if (r2 == 0) goto L2b
            r1 = r0
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.o.c(java.util.Map$Entry):sa.o$e");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f26779c = null;
        this.f26780d = 0;
        this.f26781e++;
        e<K, V> eVar = this.f26782f;
        eVar.f26795e = eVar;
        eVar.f26794d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVar = null;
        if (obj != 0) {
            try {
                eVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVar != null;
    }

    public final void d(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f26792b;
            e<K, V> eVar3 = eVar.f26793c;
            int i10 = eVar2 != null ? eVar2.f26799i : 0;
            int i11 = eVar3 != null ? eVar3.f26799i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f26792b;
                e<K, V> eVar5 = eVar3.f26793c;
                int i13 = (eVar4 != null ? eVar4.f26799i : 0) - (eVar5 != null ? eVar5.f26799i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    h(eVar3);
                }
                g(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f26792b;
                e<K, V> eVar7 = eVar2.f26793c;
                int i14 = (eVar6 != null ? eVar6.f26799i : 0) - (eVar7 != null ? eVar7.f26799i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    g(eVar2);
                }
                h(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f26799i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f26799i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f26791a;
        }
    }

    public final void e(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i10;
        if (z10) {
            e<K, V> eVar4 = eVar.f26795e;
            eVar4.f26794d = eVar.f26794d;
            eVar.f26794d.f26795e = eVar4;
        }
        e<K, V> eVar5 = eVar.f26792b;
        e<K, V> eVar6 = eVar.f26793c;
        e<K, V> eVar7 = eVar.f26791a;
        int i11 = 0;
        if (eVar5 != null && eVar6 != null) {
            if (eVar5.f26799i > eVar6.f26799i) {
                do {
                    eVar3 = eVar5;
                    eVar5 = eVar5.f26793c;
                } while (eVar5 != null);
            } else {
                do {
                    eVar2 = eVar6;
                    eVar6 = eVar6.f26792b;
                } while (eVar6 != null);
                eVar3 = eVar2;
            }
            e(eVar3, false);
            e<K, V> eVar8 = eVar.f26792b;
            if (eVar8 != null) {
                i10 = eVar8.f26799i;
                eVar3.f26792b = eVar8;
                eVar8.f26791a = eVar3;
                eVar.f26792b = null;
            } else {
                i10 = 0;
            }
            e<K, V> eVar9 = eVar.f26793c;
            if (eVar9 != null) {
                i11 = eVar9.f26799i;
                eVar3.f26793c = eVar9;
                eVar9.f26791a = eVar3;
                eVar.f26793c = null;
            }
            eVar3.f26799i = Math.max(i10, i11) + 1;
            f(eVar, eVar3);
            return;
        }
        if (eVar5 != null) {
            f(eVar, eVar5);
            eVar.f26792b = null;
        } else if (eVar6 != null) {
            f(eVar, eVar6);
            eVar.f26793c = null;
        } else {
            f(eVar, null);
        }
        d(eVar7, false);
        this.f26780d--;
        this.f26781e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        o<K, V>.b bVar = this.f26783g;
        if (bVar != null) {
            return bVar;
        }
        o<K, V>.b bVar2 = new b();
        this.f26783g = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f26791a;
        eVar.f26791a = null;
        if (eVar2 != null) {
            eVar2.f26791a = eVar3;
        }
        if (eVar3 == null) {
            this.f26779c = eVar2;
        } else if (eVar3.f26792b == eVar) {
            eVar3.f26792b = eVar2;
        } else {
            eVar3.f26793c = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f26792b;
        e<K, V> eVar3 = eVar.f26793c;
        e<K, V> eVar4 = eVar3.f26792b;
        e<K, V> eVar5 = eVar3.f26793c;
        eVar.f26793c = eVar4;
        if (eVar4 != null) {
            eVar4.f26791a = eVar;
        }
        f(eVar, eVar3);
        eVar3.f26792b = eVar;
        eVar.f26791a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f26799i : 0, eVar4 != null ? eVar4.f26799i : 0) + 1;
        eVar.f26799i = max;
        eVar3.f26799i = Math.max(max, eVar5 != null ? eVar5.f26799i : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            sa.o$e r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Le
            V r0 = r3.f26798h
        Le:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.o.get(java.lang.Object):java.lang.Object");
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f26792b;
        e<K, V> eVar3 = eVar.f26793c;
        e<K, V> eVar4 = eVar2.f26792b;
        e<K, V> eVar5 = eVar2.f26793c;
        eVar.f26792b = eVar5;
        if (eVar5 != null) {
            eVar5.f26791a = eVar;
        }
        f(eVar, eVar2);
        eVar2.f26793c = eVar;
        eVar.f26791a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f26799i : 0, eVar5 != null ? eVar5.f26799i : 0) + 1;
        eVar.f26799i = max;
        eVar2.f26799i = Math.max(max, eVar4 != null ? eVar4.f26799i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        o<K, V>.c cVar = this.f26784h;
        if (cVar != null) {
            return cVar;
        }
        o<K, V>.c cVar2 = new c();
        this.f26784h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 != null) {
            if (v10 != null || this.f26778b) {
                e<K, V> a10 = a(k10, true);
                V v11 = a10.f26798h;
                a10.f26798h = v10;
                return v11;
            }
            throw new NullPointerException("value == null");
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto La
            r1 = 0
            sa.o$e r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto Lb
        L9:
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto L11
            r1 = 1
            r2.e(r3, r1)
        L11:
            if (r3 == 0) goto L15
            V r0 = r3.f26798h
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.o.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f26780d;
    }
}
