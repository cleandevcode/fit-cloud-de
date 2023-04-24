package fl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a0<T> extends tk.i<T> {

    /* renamed from: a */
    public final Iterable<? extends T> f14316a;

    /* loaded from: classes2.dex */
    public static final class a<T> extends al.c<T> {

        /* renamed from: a */
        public final tk.n<? super T> f14317a;

        /* renamed from: b */
        public final Iterator<? extends T> f14318b;

        /* renamed from: c */
        public volatile boolean f14319c;

        /* renamed from: d */
        public boolean f14320d;

        /* renamed from: e */
        public boolean f14321e;

        /* renamed from: f */
        public boolean f14322f;

        public a(tk.n<? super T> nVar, Iterator<? extends T> it) {
            this.f14317a = nVar;
            this.f14318b = it;
        }

        @Override // uk.c
        public final void c() {
            this.f14319c = true;
        }

        @Override // nl.f
        public final void clear() {
            this.f14321e = true;
        }

        @Override // nl.c
        public final int d(int i10) {
            if ((i10 & 1) != 0) {
                this.f14320d = true;
                return 1;
            }
            return 0;
        }

        @Override // nl.f
        public final boolean isEmpty() {
            return this.f14321e;
        }

        @Override // nl.f
        public final T poll() {
            if (this.f14321e) {
                return null;
            }
            if (!this.f14322f) {
                this.f14322f = true;
            } else if (!this.f14318b.hasNext()) {
                this.f14321e = true;
                return null;
            }
            T next = this.f14318b.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }
    }

    public a0(List list) {
        this.f14316a = list;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        xk.c cVar = xk.c.INSTANCE;
        try {
            Iterator<? extends T> it = this.f14316a.iterator();
            try {
                if (!it.hasNext()) {
                    nVar.a(cVar);
                    nVar.onComplete();
                    return;
                }
                a aVar = new a(nVar, it);
                nVar.a(aVar);
                if (!aVar.f14320d) {
                    while (!aVar.f14319c) {
                        try {
                            T next = aVar.f14318b.next();
                            Objects.requireNonNull(next, "The iterator returned a null value");
                            aVar.f14317a.b(next);
                            if (!aVar.f14319c) {
                                if (!aVar.f14318b.hasNext()) {
                                    if (!aVar.f14319c) {
                                        aVar.f14317a.onComplete();
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            h7.a.y(th2);
                            aVar.f14317a.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                h7.a.y(th3);
                nVar.a(cVar);
                nVar.onError(th3);
            }
        } catch (Throwable th4) {
            h7.a.y(th4);
            nVar.a(cVar);
            nVar.onError(th4);
        }
    }
}
