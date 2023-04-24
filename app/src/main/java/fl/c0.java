package fl;

/* loaded from: classes2.dex */
public final class c0<T> extends fl.a<T, T> {

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14386a;

        /* renamed from: b */
        public uk.c f14387b;

        public a(tk.n<? super T> nVar) {
            this.f14386a = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            this.f14387b = cVar;
            this.f14386a.a(this);
        }

        @Override // tk.n
        public final void b(T t10) {
        }

        @Override // uk.c
        public final void c() {
            this.f14387b.c();
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14386a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14386a.onError(th2);
        }
    }

    public c0(tk.l<T> lVar) {
        super(lVar);
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar));
    }
}
