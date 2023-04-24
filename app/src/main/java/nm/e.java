package nm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class e<T> implements g<T> {

    /* renamed from: a */
    public final g<T> f22476a;

    /* renamed from: b */
    public final boolean f22477b;

    /* renamed from: c */
    public final fm.l<T, Boolean> f22478c;

    /* loaded from: classes2.dex */
    public static final class a implements Iterator<T>, hm.a {

        /* renamed from: a */
        public final Iterator<T> f22479a;

        /* renamed from: b */
        public int f22480b = -1;

        /* renamed from: c */
        public T f22481c;

        /* renamed from: d */
        public final /* synthetic */ e<T> f22482d;

        public a(e<T> eVar) {
            this.f22482d = eVar;
            this.f22479a = eVar.f22476a.iterator();
        }

        public final void a() {
            int i10;
            while (true) {
                if (this.f22479a.hasNext()) {
                    T next = this.f22479a.next();
                    if (this.f22482d.f22478c.k(next).booleanValue() == this.f22482d.f22477b) {
                        this.f22481c = next;
                        i10 = 1;
                        break;
                    }
                } else {
                    i10 = 0;
                    break;
                }
            }
            this.f22480b = i10;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f22480b == -1) {
                a();
            }
            return this.f22480b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f22480b == -1) {
                a();
            }
            if (this.f22480b != 0) {
                T t10 = this.f22481c;
                this.f22481c = null;
                this.f22480b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(p pVar) {
        m mVar = m.f22494b;
        this.f22476a = pVar;
        this.f22477b = false;
        this.f22478c = mVar;
    }

    @Override // nm.g
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
