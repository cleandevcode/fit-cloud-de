package fl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o0<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.e<? super tk.i<Object>, ? extends tk.l<?>> f14593b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicInteger implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14594a;

        /* renamed from: d */
        public final ql.d<Object> f14597d;

        /* renamed from: g */
        public final tk.l<T> f14600g;

        /* renamed from: h */
        public volatile boolean f14601h;

        /* renamed from: b */
        public final AtomicInteger f14595b = new AtomicInteger();

        /* renamed from: c */
        public final kl.b f14596c = new kl.b();

        /* renamed from: e */
        public final a<T>.C0261a f14598e = new C0261a();

        /* renamed from: f */
        public final AtomicReference<uk.c> f14599f = new AtomicReference<>();

        /* renamed from: fl.o0$a$a */
        /* loaded from: classes2.dex */
        public final class C0261a extends AtomicReference<uk.c> implements tk.n<Object> {
            public C0261a() {
                a.this = r1;
            }

            @Override // tk.n
            public final void a(uk.c cVar) {
                xk.b.h(this, cVar);
            }

            @Override // tk.n
            public final void b(Object obj) {
                a.this.e();
            }

            @Override // tk.n
            public final void onComplete() {
                a aVar = a.this;
                xk.b.a(aVar.f14599f);
                bi.r.F(aVar.f14594a, aVar, aVar.f14596c);
            }

            @Override // tk.n
            public final void onError(Throwable th2) {
                a aVar = a.this;
                xk.b.a(aVar.f14599f);
                bi.r.G(aVar.f14594a, th2, aVar, aVar.f14596c);
            }
        }

        public a(tk.n<? super T> nVar, ql.d<Object> dVar, tk.l<T> lVar) {
            this.f14594a = nVar;
            this.f14597d = dVar;
            this.f14600g = lVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.h(this.f14599f, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            bi.r.H(this.f14594a, t10, this, this.f14596c);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this.f14599f);
            xk.b.a(this.f14598e);
        }

        public final boolean d() {
            return xk.b.d(this.f14599f.get());
        }

        public final void e() {
            if (this.f14595b.getAndIncrement() == 0) {
                while (!d()) {
                    if (!this.f14601h) {
                        this.f14601h = true;
                        this.f14600g.d(this);
                    }
                    if (this.f14595b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // tk.n
        public final void onComplete() {
            xk.b.e(this.f14599f, null);
            this.f14601h = false;
            this.f14597d.b(0);
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            xk.b.a(this.f14598e);
            bi.r.G(this.f14594a, th2, this, this.f14596c);
        }
    }

    public o0(tk.l<T> lVar, wk.e<? super tk.i<Object>, ? extends tk.l<?>> eVar) {
        super(lVar);
        this.f14593b = eVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        ql.d<T> G = new ql.b().G();
        try {
            tk.l<?> apply = this.f14593b.apply(G);
            Objects.requireNonNull(apply, "The handler returned a null ObservableSource");
            tk.l<?> lVar = apply;
            a aVar = new a(nVar, G, this.f14315a);
            nVar.a(aVar);
            lVar.d(aVar.f14598e);
            aVar.e();
        } catch (Throwable th2) {
            h7.a.y(th2);
            nVar.a(xk.c.INSTANCE);
            nVar.onError(th2);
        }
    }
}
