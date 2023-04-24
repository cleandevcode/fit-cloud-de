package nm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o<T> implements g<T> {

    /* renamed from: a */
    public final g<T> f22495a;

    /* renamed from: b */
    public final fm.l<T, Boolean> f22496b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, hm.a {

        /* renamed from: a */
        public final Iterator<T> f22497a;

        /* renamed from: b */
        public int f22498b = -1;

        /* renamed from: c */
        public T f22499c;

        /* renamed from: d */
        public final /* synthetic */ o<T> f22500d;

        public a(o<T> oVar) {
            this.f22500d = oVar;
            this.f22497a = oVar.f22495a.iterator();
        }

        public final void a() {
            if (this.f22497a.hasNext()) {
                T next = this.f22497a.next();
                if (this.f22500d.f22496b.k(next).booleanValue()) {
                    this.f22498b = 1;
                    this.f22499c = next;
                    return;
                }
            }
            this.f22498b = 0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f22498b == -1) {
                a();
            }
            return this.f22498b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f22498b == -1) {
                a();
            }
            if (this.f22498b != 0) {
                T t10 = this.f22499c;
                this.f22499c = null;
                this.f22498b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(g<? extends T> gVar, fm.l<? super T, Boolean> lVar) {
        this.f22495a = gVar;
        this.f22496b = lVar;
    }

    @Override // nm.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
