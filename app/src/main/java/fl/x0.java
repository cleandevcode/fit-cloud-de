package fl;

/* loaded from: classes2.dex */
public final class x0<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final long f14757b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14758a;

        /* renamed from: b */
        public boolean f14759b;

        /* renamed from: c */
        public uk.c f14760c;

        /* renamed from: d */
        public long f14761d;

        public a(tk.n<? super T> nVar, long j10) {
            this.f14758a = nVar;
            this.f14761d = j10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14760c, cVar)) {
                this.f14760c = cVar;
                if (this.f14761d == 0) {
                    this.f14759b = true;
                    cVar.c();
                    tk.n<? super T> nVar = this.f14758a;
                    nVar.a(xk.c.INSTANCE);
                    nVar.onComplete();
                    return;
                }
                this.f14758a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14759b) {
                return;
            }
            long j10 = this.f14761d;
            long j11 = j10 - 1;
            this.f14761d = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f14758a.b(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // uk.c
        public final void c() {
            this.f14760c.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14759b) {
                return;
            }
            this.f14759b = true;
            this.f14760c.c();
            this.f14758a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14759b) {
                ol.a.a(th2);
                return;
            }
            this.f14759b = true;
            this.f14760c.c();
            this.f14758a.onError(th2);
        }
    }

    public x0(tk.l lVar) {
        super(lVar);
        this.f14757b = 1L;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14757b));
    }
}
