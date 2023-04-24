package w1;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class g1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    public static final /* synthetic */ int f29569g = 0;

    /* renamed from: a */
    public final int f29570a;

    /* renamed from: d */
    public boolean f29573d;

    /* renamed from: e */
    public volatile g1<K, V>.d f29574e;

    /* renamed from: b */
    public List<g1<K, V>.b> f29571b = Collections.emptyList();

    /* renamed from: c */
    public Map<K, V> f29572c = Collections.emptyMap();

    /* renamed from: f */
    public Map<K, V> f29575f = Collections.emptyMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static final C0539a f29576a = new C0539a();

        /* renamed from: b */
        public static final b f29577b = new b();

        /* renamed from: w1.g1$a$a */
        /* loaded from: classes.dex */
        public static class C0539a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: classes.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f29576a;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Map.Entry<K, V>, Comparable<g1<K, V>.b> {

        /* renamed from: a */
        public final K f29578a;

        /* renamed from: b */
        public V f29579b;

        public b() {
            throw null;
        }

        public b(K k10, V v10) {
            g1.this = r1;
            this.f29578a = k10;
            this.f29579b = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f29578a.compareTo(((b) obj).f29578a);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean equals;
            boolean equals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f29578a;
            Object key = entry.getKey();
            if (k10 == null) {
                if (key == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = k10.equals(key);
            }
            if (equals) {
                V v10 = this.f29579b;
                Object value = entry.getValue();
                if (v10 == null) {
                    if (value == null) {
                        equals2 = true;
                    } else {
                        equals2 = false;
                    }
                } else {
                    equals2 = v10.equals(value);
                }
                if (equals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f29578a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f29579b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f29578a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f29579b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            g1 g1Var = g1.this;
            int i10 = g1.f29569g;
            g1Var.c();
            V v11 = this.f29579b;
            this.f29579b = v10;
            return v11;
        }

        public final String toString() {
            return this.f29578a + ContainerUtils.KEY_VALUE_DELIMITER + this.f29579b;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f29581a = -1;

        /* renamed from: b */
        public boolean f29582b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f29583c;

        public c() {
            g1.this = r1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f29583c == null) {
                this.f29583c = g1.this.f29572c.entrySet().iterator();
            }
            return this.f29583c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f29581a + 1 < g1.this.f29571b.size()) {
                return true;
            }
            if (!g1.this.f29572c.isEmpty() && a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, V> next;
            this.f29582b = true;
            int i10 = this.f29581a + 1;
            this.f29581a = i10;
            if (i10 < g1.this.f29571b.size()) {
                next = g1.this.f29571b.get(this.f29581a);
            } else {
                next = a().next();
            }
            return next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f29582b) {
                this.f29582b = false;
                g1 g1Var = g1.this;
                int i10 = g1.f29569g;
                g1Var.c();
                if (this.f29581a < g1.this.f29571b.size()) {
                    g1 g1Var2 = g1.this;
                    int i11 = this.f29581a;
                    this.f29581a = i11 - 1;
                    g1Var2.j(i11);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* loaded from: classes.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
            g1.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            g1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            g1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = g1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                g1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return g1.this.size();
        }
    }

    public g1(int i10) {
        this.f29570a = i10;
    }

    public final int a(K k10) {
        int size = this.f29571b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f29571b.get(size).f29578a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f29571b.get(i11).f29578a);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 > 0) {
                i10 = i11 + 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public final void c() {
        if (this.f29573d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        if (!this.f29571b.isEmpty()) {
            this.f29571b.clear();
        }
        if (this.f29572c.isEmpty()) {
            return;
        }
        this.f29572c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f29572c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f29571b.get(i10);
    }

    public final int e() {
        return this.f29571b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f29574e == null) {
            this.f29574e = new d();
        }
        return this.f29574e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            int size = size();
            if (size != g1Var.size()) {
                return false;
            }
            int e10 = e();
            if (e10 != g1Var.e()) {
                return entrySet().equals(g1Var.entrySet());
            }
            for (int i10 = 0; i10 < e10; i10++) {
                if (!d(i10).equals(g1Var.d(i10))) {
                    return false;
                }
            }
            if (e10 != size) {
                return this.f29572c.equals(g1Var.f29572c);
            }
            return true;
        }
        return super.equals(obj);
    }

    public final Iterable<Map.Entry<K, V>> f() {
        return this.f29572c.isEmpty() ? a.f29577b : this.f29572c.entrySet();
    }

    public final SortedMap<K, V> g() {
        c();
        if (this.f29572c.isEmpty() && !(this.f29572c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f29572c = treeMap;
            this.f29575f = treeMap.descendingMap();
        }
        return (SortedMap) this.f29572c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f29571b.get(a10).f29579b;
        }
        return this.f29572c.get(comparable);
    }

    public void h() {
        if (this.f29573d) {
            return;
        }
        this.f29572c = this.f29572c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f29572c);
        this.f29575f = this.f29575f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f29575f);
        this.f29573d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int e10 = e();
        int i10 = 0;
        for (int i11 = 0; i11 < e10; i11++) {
            i10 += this.f29571b.get(i11).hashCode();
        }
        if (this.f29572c.size() > 0) {
            return i10 + this.f29572c.hashCode();
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i */
    public final V put(K k10, V v10) {
        c();
        int a10 = a(k10);
        if (a10 >= 0) {
            return this.f29571b.get(a10).setValue(v10);
        }
        c();
        if (this.f29571b.isEmpty() && !(this.f29571b instanceof ArrayList)) {
            this.f29571b = new ArrayList(this.f29570a);
        }
        int i10 = -(a10 + 1);
        if (i10 >= this.f29570a) {
            return g().put(k10, v10);
        }
        int size = this.f29571b.size();
        int i11 = this.f29570a;
        if (size == i11) {
            g1<K, V>.b remove = this.f29571b.remove(i11 - 1);
            g().put(remove.f29578a, remove.f29579b);
        }
        this.f29571b.add(i10, new b(k10, v10));
        return null;
    }

    public final V j(int i10) {
        c();
        V v10 = this.f29571b.remove(i10).f29579b;
        if (!this.f29572c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            List<g1<K, V>.b> list = this.f29571b;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        c();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return (V) j(a10);
        }
        if (this.f29572c.isEmpty()) {
            return null;
        }
        return this.f29572c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f29572c.size() + this.f29571b.size();
    }
}
