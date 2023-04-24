package vl;

import gm.l;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import vl.b;

/* loaded from: classes2.dex */
public final class e<V> extends AbstractCollection<Object> implements hm.b {

    /* renamed from: a */
    public final b<?, V> f29466a;

    public e(b<?, V> bVar) {
        l.f(bVar, "backing");
        this.f29466a = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f29466a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f29466a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f29466a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        b<?, V> bVar = this.f29466a;
        bVar.getClass();
        return new b.f(bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        b<?, V> bVar = this.f29466a;
        bVar.c();
        int i11 = bVar.f29452f;
        while (true) {
            i10 = -1;
            i11--;
            if (i11 < 0) {
                break;
            } else if (bVar.f29449c[i11] >= 0) {
                V[] vArr = bVar.f29448b;
                l.c(vArr);
                if (l.a(vArr[i11], obj)) {
                    i10 = i11;
                    break;
                }
            }
        }
        if (i10 < 0) {
            return false;
        }
        bVar.j(i10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f29466a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f29466a.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f29466a.f29454h;
    }
}
