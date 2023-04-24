package fl;

/* loaded from: classes2.dex */
public final class p<T> extends tk.f<T> implements zk.a<T> {

    /* renamed from: a */
    public final tk.l<T> f14603a;

    /* renamed from: b */
    public final long f14604b = 0;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.g<? super T> f14605a;

        /* renamed from: b */
        public final long f14606b;

        /* renamed from: c */
        public uk.c f14607c;

        /* renamed from: d */
        public long f14608d;

        /* renamed from: e */
        public boolean f14609e;

        public a(tk.g<? super T> gVar, long j10) {
            this.f14605a = gVar;
            this.f14606b = j10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14607c, cVar)) {
                this.f14607c = cVar;
                this.f14605a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14609e) {
                return;
            }
            long j10 = this.f14608d;
            if (j10 != this.f14606b) {
                this.f14608d = j10 + 1;
                return;
            }
            this.f14609e = true;
            this.f14607c.c();
            this.f14605a.onSuccess(t10);
        }

        @Override // uk.c
        public final void c() {
            this.f14607c.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14609e) {
                return;
            }
            this.f14609e = true;
            this.f14605a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14609e) {
                ol.a.a(th2);
                return;
            }
            this.f14609e = true;
            this.f14605a.onError(th2);
        }
    }

    public p(tk.l lVar) {
        this.f14603a = lVar;
    }

    @Override // zk.a
    public final tk.i<T> b() {
        return new o(this.f14603a, this.f14604b, null, false);
    }

    @Override // tk.f
    public final void c(tk.g<? super T> gVar) {
        this.f14603a.d(new a(gVar, this.f14604b));
    }
}
