package fl;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class t0<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.l<? extends T> f14670a;

    /* renamed from: b */
    public final T f14671b = null;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.r<? super T> f14672a;

        /* renamed from: b */
        public final T f14673b;

        /* renamed from: c */
        public uk.c f14674c;

        /* renamed from: d */
        public T f14675d;

        /* renamed from: e */
        public boolean f14676e;

        public a(tk.r<? super T> rVar, T t10) {
            this.f14672a = rVar;
            this.f14673b = t10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14674c, cVar)) {
                this.f14674c = cVar;
                this.f14672a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14676e) {
                return;
            }
            if (this.f14675d == null) {
                this.f14675d = t10;
                return;
            }
            this.f14676e = true;
            this.f14674c.c();
            this.f14672a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // uk.c
        public final void c() {
            this.f14674c.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14676e) {
                return;
            }
            this.f14676e = true;
            T t10 = this.f14675d;
            this.f14675d = null;
            if (t10 == null) {
                t10 = this.f14673b;
            }
            if (t10 != null) {
                this.f14672a.onSuccess(t10);
            } else {
                this.f14672a.onError(new NoSuchElementException());
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14676e) {
                ol.a.a(th2);
                return;
            }
            this.f14676e = true;
            this.f14672a.onError(th2);
        }
    }

    public t0(tk.l lVar) {
        this.f14670a = lVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f14670a.d(new a(rVar, this.f14671b));
    }
}
