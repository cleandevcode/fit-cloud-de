package nm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import nm.j;

/* loaded from: classes2.dex */
public final class f<T> implements g<T> {

    /* renamed from: a */
    public final fm.a<T> f22483a;

    /* renamed from: b */
    public final fm.l<T, T> f22484b;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, hm.a {

        /* renamed from: a */
        public T f22485a;

        /* renamed from: b */
        public int f22486b = -2;

        /* renamed from: c */
        public final /* synthetic */ f<T> f22487c;

        public a(f<T> fVar) {
            this.f22487c = fVar;
        }

        public final void a() {
            T k10;
            int i10;
            if (this.f22486b == -2) {
                k10 = this.f22487c.f22483a.m();
            } else {
                fm.l<T, T> lVar = this.f22487c.f22484b;
                T t10 = this.f22485a;
                gm.l.c(t10);
                k10 = lVar.k(t10);
            }
            this.f22485a = k10;
            if (k10 == null) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f22486b = i10;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f22486b < 0) {
                a();
            }
            return this.f22486b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f22486b < 0) {
                a();
            }
            if (this.f22486b != 0) {
                T t10 = this.f22485a;
                gm.l.d(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f22486b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(j.b bVar, fm.l lVar) {
        this.f22483a = bVar;
        this.f22484b = lVar;
    }

    @Override // nm.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
