package fl;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class q<T> extends tk.p<T> implements zk.a<T> {

    /* renamed from: a */
    public final tk.l<T> f14636a;

    /* renamed from: b */
    public final long f14637b = 0;

    /* renamed from: c */
    public final T f14638c = null;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.r<? super T> f14639a;

        /* renamed from: b */
        public final long f14640b;

        /* renamed from: c */
        public final T f14641c;

        /* renamed from: d */
        public uk.c f14642d;

        /* renamed from: e */
        public long f14643e;

        /* renamed from: f */
        public boolean f14644f;

        public a(tk.r<? super T> rVar, long j10, T t10) {
            this.f14639a = rVar;
            this.f14640b = j10;
            this.f14641c = t10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14642d, cVar)) {
                this.f14642d = cVar;
                this.f14639a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14644f) {
                return;
            }
            long j10 = this.f14643e;
            if (j10 != this.f14640b) {
                this.f14643e = j10 + 1;
                return;
            }
            this.f14644f = true;
            this.f14642d.c();
            this.f14639a.onSuccess(t10);
        }

        @Override // uk.c
        public final void c() {
            this.f14642d.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14644f) {
                return;
            }
            this.f14644f = true;
            T t10 = this.f14641c;
            if (t10 != null) {
                this.f14639a.onSuccess(t10);
            } else {
                this.f14639a.onError(new NoSuchElementException());
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14644f) {
                ol.a.a(th2);
                return;
            }
            this.f14644f = true;
            this.f14639a.onError(th2);
        }
    }

    public q(tk.l lVar) {
        this.f14636a = lVar;
    }

    @Override // zk.a
    public final tk.i<T> b() {
        return new o(this.f14636a, this.f14637b, this.f14638c, true);
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f14636a.d(new a(rVar, this.f14637b, this.f14638c));
    }
}
