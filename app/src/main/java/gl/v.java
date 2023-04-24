package gl;

/* loaded from: classes2.dex */
public final class v<T> extends tk.i<T> {

    /* renamed from: a */
    public final tk.t<? extends T> f15476a;

    /* loaded from: classes2.dex */
    public static final class a<T> extends al.g<T> implements tk.r<T> {

        /* renamed from: c */
        public uk.c f15477c;

        public a(tk.n<? super T> nVar) {
            super(nVar);
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f15477c, cVar)) {
                this.f15477c = cVar;
                this.f618a.a(this);
            }
        }

        @Override // al.g, uk.c
        public final void c() {
            super.c();
            this.f15477c.c();
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            if ((get() & 54) != 0) {
                ol.a.a(th2);
                return;
            }
            lazySet(2);
            this.f618a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            e(t10);
        }
    }

    public v(tk.p pVar) {
        this.f15476a = pVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f15476a.c(new a(nVar));
    }
}
