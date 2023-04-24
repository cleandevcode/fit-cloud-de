package fl;

/* loaded from: classes2.dex */
public final class z0<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.f<? super T> f14771b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14772a;

        /* renamed from: b */
        public final wk.f<? super T> f14773b;

        /* renamed from: c */
        public uk.c f14774c;

        /* renamed from: d */
        public boolean f14775d;

        public a(tk.n<? super T> nVar, wk.f<? super T> fVar) {
            this.f14772a = nVar;
            this.f14773b = fVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14774c, cVar)) {
                this.f14774c = cVar;
                this.f14772a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14775d) {
                return;
            }
            this.f14772a.b(t10);
            try {
                if (this.f14773b.test(t10)) {
                    this.f14775d = true;
                    this.f14774c.c();
                    this.f14772a.onComplete();
                }
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f14774c.c();
                onError(th2);
            }
        }

        @Override // uk.c
        public final void c() {
            this.f14774c.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14775d) {
                return;
            }
            this.f14775d = true;
            this.f14772a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14775d) {
                ol.a.a(th2);
                return;
            }
            this.f14775d = true;
            this.f14772a.onError(th2);
        }
    }

    public z0(b1 b1Var, wj.n nVar) {
        super(b1Var);
        this.f14771b = nVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14771b));
    }
}
