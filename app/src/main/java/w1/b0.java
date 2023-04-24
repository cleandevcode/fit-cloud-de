package w1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 extends c0 {

    /* loaded from: classes.dex */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, b0> f29539a;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f29539a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f29539a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            b0 value = this.f29539a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (obj instanceof p0) {
                b0 value = this.f29539a.getValue();
                p0 p0Var = value.f29546a;
                value.f29547b = null;
                value.f29546a = (p0) obj;
                return p0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* loaded from: classes.dex */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f29540a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f29540a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f29540a.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f29540a.next();
            return next.getValue() instanceof b0 ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f29540a.remove();
        }
    }

    @Override // w1.c0
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // w1.c0
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
