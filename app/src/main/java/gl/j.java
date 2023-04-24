package gl;

/* loaded from: classes2.dex */
public final class j<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<T> f15423a;

    /* renamed from: b */
    public final wk.d<? super T> f15424b;

    /* loaded from: classes2.dex */
    public final class a implements tk.r<T> {

        /* renamed from: a */
        public final tk.r<? super T> f15425a;

        public a(tk.r<? super T> rVar) {
            j.this = r1;
            this.f15425a = rVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            this.f15425a.a(cVar);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f15425a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            try {
                j.this.f15424b.accept(t10);
                this.f15425a.onSuccess(t10);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f15425a.onError(th2);
            }
        }
    }

    public j(tk.t<T> tVar, wk.d<? super T> dVar) {
        this.f15423a = tVar;
        this.f15424b = dVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f15423a.c(new a(rVar));
    }
}
