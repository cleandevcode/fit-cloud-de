package fl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class s0 {

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicInteger implements nl.b<T>, Runnable {

        /* renamed from: a */
        public final tk.n<? super T> f14664a;

        /* renamed from: b */
        public final T f14665b;

        public a(tk.n<? super T> nVar, T t10) {
            this.f14664a = nVar;
            this.f14665b = t10;
        }

        @Override // uk.c
        public final void c() {
            set(3);
        }

        @Override // nl.f
        public final void clear() {
            lazySet(3);
        }

        @Override // nl.c
        public final int d(int i10) {
            if ((i10 & 1) != 0) {
                lazySet(1);
                return 1;
            }
            return 0;
        }

        @Override // nl.f
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // nl.f
        public final boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // nl.f
        public final T poll() {
            if (get() == 1) {
                lazySet(3);
                return this.f14665b;
            }
            return null;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f14664a.b((T) this.f14665b);
                if (get() == 2) {
                    lazySet(3);
                    this.f14664a.onComplete();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T, R> extends tk.i<R> {

        /* renamed from: a */
        public final T f14666a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends tk.l<? extends R>> f14667b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(wk.e eVar, Object obj) {
            this.f14666a = obj;
            this.f14667b = eVar;
        }

        @Override // tk.i
        public final void z(tk.n<? super R> nVar) {
            xk.c cVar = xk.c.INSTANCE;
            try {
                tk.l<? extends R> apply = this.f14667b.apply((T) this.f14666a);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                tk.l<? extends R> lVar = apply;
                if (lVar instanceof wk.g) {
                    try {
                        Object obj = ((wk.g) lVar).get();
                        if (obj == null) {
                            nVar.a(cVar);
                            nVar.onComplete();
                            return;
                        }
                        a aVar = new a(nVar, obj);
                        nVar.a(aVar);
                        aVar.run();
                        return;
                    } catch (Throwable th2) {
                        h7.a.y(th2);
                        nVar.a(cVar);
                        nVar.onError(th2);
                        return;
                    }
                }
                lVar.d(nVar);
            } catch (Throwable th3) {
                h7.a.y(th3);
                nVar.a(cVar);
                nVar.onError(th3);
            }
        }
    }

    public static <T, R> boolean a(tk.l<T> lVar, tk.n<? super R> nVar, wk.e<? super T, ? extends tk.l<? extends R>> eVar) {
        xk.c cVar = xk.c.INSTANCE;
        if (lVar instanceof wk.g) {
            try {
                Object obj = (Object) ((wk.g) lVar).get();
                if (obj == 0) {
                    nVar.a(cVar);
                    nVar.onComplete();
                    return true;
                }
                try {
                    tk.l<? extends R> apply = eVar.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                    tk.l<? extends R> lVar2 = apply;
                    if (lVar2 instanceof wk.g) {
                        try {
                            Object obj2 = ((wk.g) lVar2).get();
                            if (obj2 == null) {
                                nVar.a(cVar);
                                nVar.onComplete();
                                return true;
                            }
                            a aVar = new a(nVar, obj2);
                            nVar.a(aVar);
                            aVar.run();
                        } catch (Throwable th2) {
                            h7.a.y(th2);
                            nVar.a(cVar);
                            nVar.onError(th2);
                            return true;
                        }
                    } else {
                        lVar2.d(nVar);
                    }
                    return true;
                } catch (Throwable th3) {
                    h7.a.y(th3);
                    nVar.a(cVar);
                    nVar.onError(th3);
                    return true;
                }
            } catch (Throwable th4) {
                h7.a.y(th4);
                nVar.a(cVar);
                nVar.onError(th4);
                return true;
            }
        }
        return false;
    }
}
