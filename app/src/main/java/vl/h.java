package vl;

import gm.l;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import vl.b;

/* loaded from: classes2.dex */
public final class h<E> extends ul.e<E> implements Serializable {

    /* renamed from: a */
    public final b<E, ?> f29470a;

    public h() {
        this(new b());
    }

    public h(b<E, ?> bVar) {
        this.f29470a = bVar;
    }

    private final Object writeReplace() {
        if (this.f29470a.f29458l) {
            return new f(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        return this.f29470a.a(e10) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        l.f(collection, "elements");
        this.f29470a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f29470a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29470a.containsKey(obj);
    }

    @Override // ul.e
    public final int e() {
        return this.f29470a.f29454h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f29470a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        b<E, ?> bVar = this.f29470a;
        bVar.getClass();
        return new b.e(bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        b<E, ?> bVar = this.f29470a;
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
        this.f29470a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> collection) {
        l.f(collection, "elements");
        this.f29470a.c();
        return super.retainAll(collection);
    }
}
