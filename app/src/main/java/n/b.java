package n;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a */
    public c<K, V> f21896a;

    /* renamed from: b */
    public c<K, V> f21897b;

    /* renamed from: c */
    public WeakHashMap<f<K, V>, Boolean> f21898c = new WeakHashMap<>();

    /* renamed from: d */
    public int f21899d = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f21903d;
        }

        @Override // n.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f21902c;
        }
    }

    /* renamed from: n.b$b */
    /* loaded from: classes.dex */
    public static class C0387b<K, V> extends e<K, V> {
        public C0387b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f21902c;
        }

        @Override // n.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f21903d;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        public final K f21900a;

        /* renamed from: b */
        public final V f21901b;

        /* renamed from: c */
        public c<K, V> f21902c;

        /* renamed from: d */
        public c<K, V> f21903d;

        public c(K k10, V v10) {
            this.f21900a = k10;
            this.f21901b = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f21900a.equals(cVar.f21900a) && this.f21901b.equals(cVar.f21901b);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f21900a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f21901b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f21900a.hashCode() ^ this.f21901b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f21900a + ContainerUtils.KEY_VALUE_DELIMITER + this.f21901b;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a */
        public c<K, V> f21904a;

        /* renamed from: b */
        public boolean f21905b = true;

        public d() {
            b.this = r1;
        }

        @Override // n.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f21904a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f21903d;
                this.f21904a = cVar3;
                this.f21905b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f21905b) {
                return b.this.f21896a != null;
            }
            c<K, V> cVar = this.f21904a;
            return (cVar == null || cVar.f21902c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.f21905b) {
                this.f21905b = false;
                cVar = b.this.f21896a;
            } else {
                c<K, V> cVar2 = this.f21904a;
                cVar = cVar2 != null ? cVar2.f21902c : null;
            }
            this.f21904a = cVar;
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a */
        public c<K, V> f21907a;

        /* renamed from: b */
        public c<K, V> f21908b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f21907a = cVar2;
            this.f21908b = cVar;
        }

        @Override // n.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f21907a == cVar && cVar == this.f21908b) {
                this.f21908b = null;
                this.f21907a = null;
            }
            c<K, V> cVar3 = this.f21907a;
            if (cVar3 == cVar) {
                this.f21907a = b(cVar3);
            }
            c<K, V> cVar4 = this.f21908b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f21907a;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f21908b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21908b != null;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f21908b;
            c<K, V> cVar3 = this.f21907a;
            if (cVar2 != cVar3 && cVar3 != null) {
                cVar = c(cVar2);
            } else {
                cVar = null;
            }
            this.f21908b = cVar;
            return cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> b(K k10) {
        c<K, V> cVar = this.f21896a;
        while (cVar != null && !cVar.f21900a.equals(k10)) {
            cVar = cVar.f21902c;
        }
        return cVar;
    }

    public V e(K k10, V v10) {
        c<K, V> b10 = b(k10);
        if (b10 != null) {
            return b10.f21901b;
        }
        c<K, V> cVar = new c<>(k10, v10);
        this.f21899d++;
        c<K, V> cVar2 = this.f21897b;
        if (cVar2 == null) {
            this.f21896a = cVar;
        } else {
            cVar2.f21902c = cVar;
            cVar.f21903d = cVar2;
        }
        this.f21897b = cVar;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0050, code lost:
        if (((n.b.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof n.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n.b r7 = (n.b) r7
            int r1 = r6.f21899d
            int r3 = r7.f21899d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            n.b$e r3 = (n.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            n.b$e r4 = (n.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            n.b$e r7 = (n.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.b.equals(java.lang.Object):boolean");
    }

    public V f(K k10) {
        c<K, V> b10 = b(k10);
        if (b10 == null) {
            return null;
        }
        this.f21899d--;
        if (!this.f21898c.isEmpty()) {
            for (f<K, V> fVar : this.f21898c.keySet()) {
                fVar.a(b10);
            }
        }
        c<K, V> cVar = b10.f21903d;
        c<K, V> cVar2 = b10.f21902c;
        if (cVar != null) {
            cVar.f21902c = cVar2;
        } else {
            this.f21896a = cVar2;
        }
        c<K, V> cVar3 = b10.f21902c;
        if (cVar3 != null) {
            cVar3.f21903d = cVar;
        } else {
            this.f21897b = cVar;
        }
        b10.f21902c = null;
        b10.f21903d = null;
        return b10.f21901b;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i10;
            }
            i10 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f21896a, this.f21897b);
        this.f21898c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                a10.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    a10.append(", ");
                }
            } else {
                a10.append("]");
                return a10.toString();
            }
        }
    }
}
