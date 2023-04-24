package fl;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class d1<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final tk.o f14424b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicBoolean implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14425a;

        /* renamed from: b */
        public final tk.o f14426b;

        /* renamed from: c */
        public uk.c f14427c;

        /* renamed from: fl.d1$a$a */
        /* loaded from: classes2.dex */
        public final class RunnableC0257a implements Runnable {
            public RunnableC0257a() {
                a.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f14427c.c();
            }
        }

        public a(tk.n<? super T> nVar, tk.o oVar) {
            this.f14425a = nVar;
            this.f14426b = oVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14427c, cVar)) {
                this.f14427c = cVar;
                this.f14425a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (get()) {
                return;
            }
            this.f14425a.b(t10);
        }

        @Override // uk.c
        public final void c() {
            if (compareAndSet(false, true)) {
                this.f14426b.c(new RunnableC0257a());
            }
        }

        @Override // tk.n
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.f14425a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (get()) {
                ol.a.a(th2);
            } else {
                this.f14425a.onError(th2);
            }
        }
    }

    public d1(tk.l<T> lVar, tk.o oVar) {
        super(lVar);
        this.f14424b = oVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14424b));
    }
}
