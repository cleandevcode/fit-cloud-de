package fl;

/* loaded from: classes2.dex */
public final class m<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.d<? super T> f14554b;

    /* renamed from: c */
    public final wk.d<? super Throwable> f14555c;

    /* renamed from: d */
    public final wk.a f14556d;

    /* renamed from: e */
    public final wk.a f14557e;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14558a;

        /* renamed from: b */
        public final wk.d<? super T> f14559b;

        /* renamed from: c */
        public final wk.d<? super Throwable> f14560c;

        /* renamed from: d */
        public final wk.a f14561d;

        /* renamed from: e */
        public final wk.a f14562e;

        /* renamed from: f */
        public uk.c f14563f;

        /* renamed from: g */
        public boolean f14564g;

        public a(tk.n<? super T> nVar, wk.d<? super T> dVar, wk.d<? super Throwable> dVar2, wk.a aVar, wk.a aVar2) {
            this.f14558a = nVar;
            this.f14559b = dVar;
            this.f14560c = dVar2;
            this.f14561d = aVar;
            this.f14562e = aVar2;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14563f, cVar)) {
                this.f14563f = cVar;
                this.f14558a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14564g) {
                return;
            }
            try {
                this.f14559b.accept(t10);
                this.f14558a.b(t10);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f14563f.c();
                onError(th2);
            }
        }

        @Override // uk.c
        public final void c() {
            this.f14563f.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14564g) {
                return;
            }
            try {
                this.f14561d.run();
                this.f14564g = true;
                this.f14558a.onComplete();
                try {
                    this.f14562e.run();
                } catch (Throwable th2) {
                    h7.a.y(th2);
                    ol.a.a(th2);
                }
            } catch (Throwable th3) {
                h7.a.y(th3);
                onError(th3);
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14564g) {
                ol.a.a(th2);
                return;
            }
            this.f14564g = true;
            try {
                this.f14560c.accept(th2);
            } catch (Throwable th3) {
                h7.a.y(th3);
                th2 = new vk.a(th2, th3);
            }
            this.f14558a.onError(th2);
            try {
                this.f14562e.run();
            } catch (Throwable th4) {
                h7.a.y(th4);
                ol.a.a(th4);
            }
        }
    }

    public m(tk.l<T> lVar, wk.d<? super T> dVar, wk.d<? super Throwable> dVar2, wk.a aVar, wk.a aVar2) {
        super(lVar);
        this.f14554b = dVar;
        this.f14555c = dVar2;
        this.f14556d = aVar;
        this.f14557e = aVar2;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14554b, this.f14555c, this.f14556d, this.f14557e));
    }
}
