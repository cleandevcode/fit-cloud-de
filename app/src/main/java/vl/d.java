package vl;

import gm.l;
import java.util.Collection;
import java.util.Iterator;
import vl.b;

/* loaded from: classes2.dex */
public final class d<E> extends ul.e<E> {

    /* renamed from: a */
    public final b<E, ?> f29465a;

    public d(b<E, ?> bVar) {
        l.f(bVar, "backing");
        this.f29465a = bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f29465a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29465a.containsKey(obj);
    }

    @Override // ul.e
    public final int e() {
        return this.f29465a.f29454h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f29465a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        b<E, ?> bVar = this.f29465a;
        bVar.getClass();
        return new b.e(bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        b<E, ?> bVar = this.f29465a;
        bVar.c();
        int g10 = bVar.g(obj);
        if (g10 < 0) {
            g10 = -1;
        } else {
            bVar.j(g10);
        }
        if (g10 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f29465a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f29465a.c();
        return super.retainAll(collection);
    }
}
