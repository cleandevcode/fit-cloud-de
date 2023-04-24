package fl;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final long f14583b;

    /* renamed from: c */
    public final T f14584c;

    /* renamed from: d */
    public final boolean f14585d;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14586a;

        /* renamed from: b */
        public final long f14587b;

        /* renamed from: c */
        public final T f14588c;

        /* renamed from: d */
        public final boolean f14589d;

        /* renamed from: e */
        public uk.c f14590e;

        /* renamed from: f */
        public long f14591f;

        /* renamed from: g */
        public boolean f14592g;

        public a(tk.n<? super T> nVar, long j10, T t10, boolean z10) {
            this.f14586a = nVar;
            this.f14587b = j10;
            this.f14588c = t10;
            this.f14589d = z10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14590e, cVar)) {
                this.f14590e = cVar;
                this.f14586a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14592g) {
                return;
            }
            long j10 = this.f14591f;
            if (j10 != this.f14587b) {
                this.f14591f = j10 + 1;
                return;
            }
            this.f14592g = true;
            this.f14590e.c();
            this.f14586a.b(t10);
            this.f14586a.onComplete();
        }

        @Override // uk.c
        public final void c() {
            this.f14590e.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14592g) {
                return;
            }
            this.f14592g = true;
            T t10 = this.f14588c;
            if (t10 == null && this.f14589d) {
                this.f14586a.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                this.f14586a.b(t10);
            }
            this.f14586a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14592g) {
                ol.a.a(th2);
                return;
            }
            this.f14592g = true;
            this.f14586a.onError(th2);
        }
    }

    public o(tk.l<T> lVar, long j10, T t10, boolean z10) {
        super(lVar);
        this.f14583b = j10;
        this.f14584c = t10;
        this.f14585d = z10;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14583b, this.f14584c, this.f14585d));
    }
}
