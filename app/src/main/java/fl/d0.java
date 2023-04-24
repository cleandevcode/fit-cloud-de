package fl;

/* loaded from: classes2.dex */
public final class d0<T> extends tk.a implements zk.a<T> {

    /* renamed from: a */
    public final tk.l<T> f14421a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.b f14422a;

        /* renamed from: b */
        public uk.c f14423b;

        public a(tk.b bVar) {
            this.f14422a = bVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            this.f14423b = cVar;
            this.f14422a.a(this);
        }

        @Override // tk.n
        public final void b(T t10) {
        }

        @Override // uk.c
        public final void c() {
            this.f14423b.c();
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14422a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14422a.onError(th2);
        }
    }

    public d0(tk.i iVar) {
        this.f14421a = iVar;
    }

    @Override // zk.a
    public final tk.i<T> b() {
        return new c0(this.f14421a);
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        this.f14421a.d(new a(bVar));
    }
}
