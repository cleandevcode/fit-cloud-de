package fl;

/* loaded from: classes2.dex */
public final class j<T, U> extends tk.i<T> {

    /* renamed from: a */
    public final tk.l<? extends T> f14511a;

    /* renamed from: b */
    public final tk.l<U> f14512b;

    /* loaded from: classes2.dex */
    public final class a implements tk.n<U> {

        /* renamed from: a */
        public final xk.e f14513a;

        /* renamed from: b */
        public final tk.n<? super T> f14514b;

        /* renamed from: c */
        public boolean f14515c;

        /* renamed from: fl.j$a$a */
        /* loaded from: classes2.dex */
        public final class C0260a implements tk.n<T> {
            public C0260a() {
                a.this = r1;
            }

            @Override // tk.n
            public final void a(uk.c cVar) {
                xk.e eVar = a.this.f14513a;
                eVar.getClass();
                xk.b.g(eVar, cVar);
            }

            @Override // tk.n
            public final void b(T t10) {
                a.this.f14514b.b(t10);
            }

            @Override // tk.n
            public final void onComplete() {
                a.this.f14514b.onComplete();
            }

            @Override // tk.n
            public final void onError(Throwable th2) {
                a.this.f14514b.onError(th2);
            }
        }

        public a(xk.e eVar, tk.n<? super T> nVar) {
            j.this = r1;
            this.f14513a = eVar;
            this.f14514b = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.e eVar = this.f14513a;
            eVar.getClass();
            xk.b.g(eVar, cVar);
        }

        @Override // tk.n
        public final void b(U u10) {
            onComplete();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14515c) {
                return;
            }
            this.f14515c = true;
            j.this.f14511a.d(new C0260a());
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14515c) {
                ol.a.a(th2);
                return;
            }
            this.f14515c = true;
            this.f14514b.onError(th2);
        }
    }

    public j(tk.i iVar, tk.i iVar2) {
        this.f14511a = iVar;
        this.f14512b = iVar2;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        xk.e eVar = new xk.e();
        nVar.a(eVar);
        this.f14512b.d(new a(eVar, nVar));
    }
}
