package vl;

import gm.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import vl.b;

/* loaded from: classes2.dex */
public final class c<K, V> extends ul.e<Map.Entry<Object, Object>> {

    /* renamed from: a */
    public final b<K, V> f29464a;

    public c(b<K, V> bVar) {
        l.f(bVar, "backing");
        this.f29464a = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        l.f((Map.Entry) obj, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f29464a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        return this.f29464a.d(collection);
    }

    @Override // ul.e
    public final int e() {
        return this.f29464a.f29454h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: f */
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> entry = (Map.Entry) obj;
        l.f(entry, "element");
        return this.f29464a.e(entry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i */
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        l.f(entry, "element");
        b<K, V> bVar = this.f29464a;
        bVar.getClass();
        bVar.c();
        int g10 = bVar.g(entry.getKey());
        if (g10 < 0) {
            return false;
        }
        V[] vArr = bVar.f29448b;
        l.c(vArr);
        if (!l.a(vArr[g10], entry.getValue())) {
            return false;
        }
        bVar.j(g10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f29464a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        b<K, V> bVar = this.f29464a;
        bVar.getClass();
        return new b.C0537b(bVar);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f29464a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f29464a.c();
        return super.retainAll(collection);
    }
}
