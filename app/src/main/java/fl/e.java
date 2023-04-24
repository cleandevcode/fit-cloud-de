package fl;

/* loaded from: classes2.dex */
public final class e<T> extends fl.a<T, Long> {

    /* loaded from: classes2.dex */
    public static final class a implements tk.n<Object>, uk.c {

        /* renamed from: a */
        public final tk.n<? super Long> f14429a;

        /* renamed from: b */
        public uk.c f14430b;

        /* renamed from: c */
        public long f14431c;

        public a(tk.n<? super Long> nVar) {
            this.f14429a = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14430b, cVar)) {
                this.f14430b = cVar;
                this.f14429a.a(this);
            }
        }

        @Override // tk.n
        public final void b(Object obj) {
            this.f14431c++;
        }

        @Override // uk.c
        public final void c() {
            this.f14430b.c();
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14429a.b(Long.valueOf(this.f14431c));
            this.f14429a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14429a.onError(th2);
        }
    }

    public e(tk.l<T> lVar) {
        super(lVar);
    }

    @Override // tk.i
    public final void z(tk.n<? super Long> nVar) {
        this.f14315a.d(new a(nVar));
    }
}
