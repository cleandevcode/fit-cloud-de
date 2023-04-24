package fl;

/* loaded from: classes2.dex */
public final class u0<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final long f14702b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14703a;

        /* renamed from: b */
        public long f14704b;

        /* renamed from: c */
        public uk.c f14705c;

        public a(tk.n<? super T> nVar, long j10) {
            this.f14703a = nVar;
            this.f14704b = j10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14705c, cVar)) {
                this.f14705c = cVar;
                this.f14703a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            long j10 = this.f14704b;
            if (j10 != 0) {
                this.f14704b = j10 - 1;
            } else {
                this.f14703a.b(t10);
            }
        }

        @Override // uk.c
        public final void c() {
            this.f14705c.c();
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14703a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14703a.onError(th2);
        }
    }

    public u0(tk.i iVar) {
        super(iVar);
        this.f14702b = 1L;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14702b));
    }
}
