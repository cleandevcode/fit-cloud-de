package nm;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p<T, R> implements g<R> {

    /* renamed from: a */
    public final g<T> f22501a;

    /* renamed from: b */
    public final fm.l<T, R> f22502b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<R>, hm.a {

        /* renamed from: a */
        public final Iterator<T> f22503a;

        /* renamed from: b */
        public final /* synthetic */ p<T, R> f22504b;

        public a(p<T, R> pVar) {
            this.f22504b = pVar;
            this.f22503a = pVar.f22501a.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f22503a.hasNext();
        }

        @Override // java.util.Iterator
        public final R next() {
            return this.f22504b.f22502b.k(this.f22503a.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(g<? extends T> gVar, fm.l<? super T, ? extends R> lVar) {
        this.f22501a = gVar;
        this.f22502b = lVar;
    }

    @Override // nm.g
    public final Iterator<R> iterator() {
        return new a(this);
    }
}
