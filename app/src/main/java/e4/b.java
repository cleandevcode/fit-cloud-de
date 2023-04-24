package e4;

import e4.e;
import java.io.NotActiveException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends a implements List<Object>, Cloneable, RandomAccess, Serializable {

    /* renamed from: i */
    public final List<Object> f13347i;

    /* renamed from: j */
    public transient Object f13348j;

    /* renamed from: k */
    public transient Type f13349k;

    public b() {
        this.f13347i = new ArrayList();
    }

    public b(int i10) {
        this.f13347i = new ArrayList(i10);
    }

    public b(ArrayList arrayList) {
        this.f13347i = arrayList;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        e.a.a();
        if (e.a.f13351a != null && !e.a.f13352b) {
            try {
                new e.a(objectInputStream).defaultReadObject();
                return;
            } catch (NotActiveException unused) {
            }
        }
        objectInputStream.defaultReadObject();
        for (Object obj : this.f13347i) {
            if (obj != null) {
                String name = obj.getClass().getName();
                if (n4.n.B(name) == null) {
                    h4.k kVar = h4.k.f15845u;
                    kVar.getClass();
                    kVar.a(name, a.f13344f, null);
                }
            }
        }
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f13347i.add(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        return this.f13347i.add(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends Object> collection) {
        return this.f13347i.addAll(i10, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<?> collection) {
        return this.f13347i.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f13347i.clear();
    }

    public final Object clone() {
        return new b(new ArrayList(this.f13347i));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f13347i.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f13347i.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        List<Object> list;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            list = this.f13347i;
            obj = ((b) obj).f13347i;
        } else {
            list = this.f13347i;
        }
        return list.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f13347i.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f13347i.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f13347i.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f13347i.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f13347i.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f13347i.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator() {
        return this.f13347i.listIterator();
    }

    @Override // java.util.List
    public final ListIterator<Object> listIterator(int i10) {
        return this.f13347i.listIterator(i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        return this.f13347i.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f13347i.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.f13347i.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.f13347i.retainAll(collection);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        if (i10 != -1) {
            if (this.f13347i.size() > i10) {
                return this.f13347i.set(i10, obj);
            }
            for (int size = this.f13347i.size(); size < i10; size++) {
                this.f13347i.add(null);
            }
        }
        this.f13347i.add(obj);
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f13347i.size();
    }

    @Override // java.util.List
    public final List<Object> subList(int i10, int i11) {
        return this.f13347i.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f13347i.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f13347i.toArray(tArr);
    }
}
