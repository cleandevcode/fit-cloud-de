package fl;

import java.util.concurrent.TimeUnit;
import tk.o;

/* loaded from: classes2.dex */
public final class i<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final long f14488b;

    /* renamed from: c */
    public final TimeUnit f14489c;

    /* renamed from: d */
    public final tk.o f14490d;

    /* renamed from: e */
    public final boolean f14491e;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14492a;

        /* renamed from: b */
        public final long f14493b;

        /* renamed from: c */
        public final TimeUnit f14494c;

        /* renamed from: d */
        public final o.c f14495d;

        /* renamed from: e */
        public final boolean f14496e;

        /* renamed from: f */
        public uk.c f14497f;

        /* renamed from: fl.i$a$a */
        /* loaded from: classes2.dex */
        public final class RunnableC0258a implements Runnable {
            public RunnableC0258a() {
                a.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.f14492a.onComplete();
                } finally {
                    a.this.f14495d.c();
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class b implements Runnable {

            /* renamed from: a */
            public final Throwable f14499a;

            public b(Throwable th2) {
                a.this = r1;
                this.f14499a = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.f14492a.onError(this.f14499a);
                } finally {
                    a.this.f14495d.c();
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class c implements Runnable {

            /* renamed from: a */
            public final T f14501a;

            public c(T t10) {
                a.this = r1;
                this.f14501a = t10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f14492a.b((T) this.f14501a);
            }
        }

        public a(tk.n<? super T> nVar, long j10, TimeUnit timeUnit, o.c cVar, boolean z10) {
            this.f14492a = nVar;
            this.f14493b = j10;
            this.f14494c = timeUnit;
            this.f14495d = cVar;
            this.f14496e = z10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14497f, cVar)) {
                this.f14497f = cVar;
                this.f14492a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            this.f14495d.b(new c(t10), this.f14493b, this.f14494c);
        }

        @Override // uk.c
        public final void c() {
            this.f14497f.c();
            this.f14495d.c();
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14495d.b(new RunnableC0258a(), this.f14493b, this.f14494c);
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14495d.b(new b(th2), this.f14496e ? this.f14493b : 0L, this.f14494c);
        }
    }

    public i(tk.l lVar, long j10, TimeUnit timeUnit, tk.o oVar) {
        super(lVar);
        this.f14488b = j10;
        this.f14489c = timeUnit;
        this.f14490d = oVar;
        this.f14491e = false;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(this.f14491e ? nVar : new ml.c(nVar), this.f14488b, this.f14489c, this.f14490d.b(), this.f14491e));
    }
}
