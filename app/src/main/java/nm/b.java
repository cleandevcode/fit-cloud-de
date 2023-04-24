package nm;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b<T> implements g<T>, c<T> {

    /* renamed from: a */
    public final g<T> f22471a;

    /* renamed from: b */
    public final int f22472b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, hm.a {

        /* renamed from: a */
        public final Iterator<T> f22473a;

        /* renamed from: b */
        public int f22474b;

        public a(b<T> bVar) {
            this.f22473a = bVar.f22471a.iterator();
            this.f22474b = bVar.f22472b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (this.f22474b > 0 && this.f22473a.hasNext()) {
                this.f22473a.next();
                this.f22474b--;
            }
            return this.f22473a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            while (this.f22474b > 0 && this.f22473a.hasNext()) {
                this.f22473a.next();
                this.f22474b--;
            }
            return this.f22473a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g<? extends T> gVar, int i10) {
        gm.l.f(gVar, "sequence");
        this.f22471a = gVar;
        this.f22472b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // nm.c
    public final g<T> a(int i10) {
        int i11 = this.f22472b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f22471a, i11);
    }

    @Override // nm.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
