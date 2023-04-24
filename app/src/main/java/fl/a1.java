package fl;

/* loaded from: classes2.dex */
public final class a1<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.f<? super T> f14323b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14324a;

        /* renamed from: b */
        public final wk.f<? super T> f14325b;

        /* renamed from: c */
        public uk.c f14326c;

        /* renamed from: d */
        public boolean f14327d;

        public a(tk.n<? super T> nVar, wk.f<? super T> fVar) {
            this.f14324a = nVar;
            this.f14325b = fVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14326c, cVar)) {
                this.f14326c = cVar;
                this.f14324a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14327d) {
                return;
            }
            try {
                if (this.f14325b.test(t10)) {
                    this.f14324a.b(t10);
                    return;
                }
                this.f14327d = true;
                this.f14326c.c();
                this.f14324a.onComplete();
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f14326c.c();
                onError(th2);
            }
        }

        @Override // uk.c
        public final void c() {
            this.f14326c.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14327d) {
                return;
            }
            this.f14327d = true;
            this.f14324a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14327d) {
                ol.a.a(th2);
                return;
            }
            this.f14327d = true;
            this.f14324a.onError(th2);
        }
    }

    public a1(tk.l<T> lVar, wk.f<? super T> fVar) {
        super(lVar);
        this.f14323b = fVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14323b));
    }
}
