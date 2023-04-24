package fl;

/* loaded from: classes2.dex */
public final class l<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.a f14539b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends al.b<T> implements tk.n<T> {

        /* renamed from: a */
        public final tk.n<? super T> f14540a;

        /* renamed from: b */
        public final wk.a f14541b;

        /* renamed from: c */
        public uk.c f14542c;

        /* renamed from: d */
        public nl.b<T> f14543d;

        /* renamed from: e */
        public boolean f14544e;

        public a(tk.n<? super T> nVar, wk.a aVar) {
            this.f14540a = nVar;
            this.f14541b = aVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14542c, cVar)) {
                this.f14542c = cVar;
                if (cVar instanceof nl.b) {
                    this.f14543d = (nl.b) cVar;
                }
                this.f14540a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            this.f14540a.b(t10);
        }

        @Override // uk.c
        public final void c() {
            this.f14542c.c();
            e();
        }

        @Override // nl.f
        public final void clear() {
            this.f14543d.clear();
        }

        @Override // nl.c
        public final int d(int i10) {
            nl.b<T> bVar = this.f14543d;
            if (bVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int d10 = bVar.d(i10);
            if (d10 != 0) {
                this.f14544e = d10 == 1;
            }
            return d10;
        }

        public final void e() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f14541b.run();
                } catch (Throwable th2) {
                    h7.a.y(th2);
                    ol.a.a(th2);
                }
            }
        }

        @Override // nl.f
        public final boolean isEmpty() {
            return this.f14543d.isEmpty();
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14540a.onComplete();
            e();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14540a.onError(th2);
            e();
        }

        @Override // nl.f
        public final T poll() {
            T poll = this.f14543d.poll();
            if (poll == null && this.f14544e) {
                e();
            }
            return poll;
        }
    }

    public l(tk.l<T> lVar, wk.a aVar) {
        super(lVar);
        this.f14539b = aVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14539b));
    }
}
