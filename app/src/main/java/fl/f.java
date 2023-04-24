package fl;

/* loaded from: classes2.dex */
public final class f<T> extends tk.p<Long> implements zk.a<Long> {

    /* renamed from: a */
    public final tk.l<T> f14453a;

    /* loaded from: classes2.dex */
    public static final class a implements tk.n<Object>, uk.c {

        /* renamed from: a */
        public final tk.r<? super Long> f14454a;

        /* renamed from: b */
        public uk.c f14455b;

        /* renamed from: c */
        public long f14456c;

        public a(tk.r<? super Long> rVar) {
            this.f14454a = rVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14455b, cVar)) {
                this.f14455b = cVar;
                this.f14454a.a(this);
            }
        }

        @Override // tk.n
        public final void b(Object obj) {
            this.f14456c++;
        }

        @Override // uk.c
        public final void c() {
            this.f14455b.c();
            this.f14455b = xk.b.f30613a;
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14455b = xk.b.f30613a;
            this.f14454a.onSuccess(Long.valueOf(this.f14456c));
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14455b = xk.b.f30613a;
            this.f14454a.onError(th2);
        }
    }

    public f(tk.i iVar) {
        this.f14453a = iVar;
    }

    @Override // zk.a
    public final tk.i<Long> b() {
        return new e(this.f14453a);
    }

    @Override // tk.p
    public final void f(tk.r<? super Long> rVar) {
        this.f14453a.d(new a(rVar));
    }
}
