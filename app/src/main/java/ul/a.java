package ul;

import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class a<E> implements Collection<E>, hm.a {

    /* renamed from: ul.a$a */
    /* loaded from: classes2.dex */
    public static final class C0521a extends gm.m implements fm.l<E, CharSequence> {

        /* renamed from: b */
        public final /* synthetic */ a<E> f28843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0521a(a<? extends E> aVar) {
            super(1);
            this.f28843b = aVar;
        }

        @Override // fm.l
        public final CharSequence k(Object obj) {
            return obj == this.f28843b ? "(this Collection)" : String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (E e11 : this) {
            if (gm.l.a(e11, e10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        gm.l.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public abstract int e();

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return e() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return gm.f.e(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        gm.l.f(tArr, "array");
        return (T[]) gm.f.f(this, tArr);
    }

    public final String toString() {
        return q.M(this, ", ", "[", "]", new C0521a(this), 24);
    }
}
