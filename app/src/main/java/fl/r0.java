package fl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class r0<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.e<? super tk.i<Throwable>, ? extends tk.l<?>> f14653b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicInteger implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14654a;

        /* renamed from: d */
        public final ql.d<Throwable> f14657d;

        /* renamed from: g */
        public final tk.l<T> f14660g;

        /* renamed from: h */
        public volatile boolean f14661h;

        /* renamed from: b */
        public final AtomicInteger f14655b = new AtomicInteger();

        /* renamed from: c */
        public final kl.b f14656c = new kl.b();

        /* renamed from: e */
        public final a<T>.C0262a f14658e = new C0262a();

        /* renamed from: f */
        public final AtomicReference<uk.c> f14659f = new AtomicReference<>();

        /* renamed from: fl.r0$a$a */
        /* loaded from: classes2.dex */
        public final class C0262a extends AtomicReference<uk.c> implements tk.n<Object> {
            public C0262a() {
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
                xk.b.a(aVar.f14659f);
                bi.r.F(aVar.f14654a, aVar, aVar.f14656c);
            }

            @Override // tk.n
            public final void onError(Throwable th2) {
                a aVar = a.this;
                xk.b.a(aVar.f14659f);
                bi.r.G(aVar.f14654a, th2, aVar, aVar.f14656c);
            }
        }

        public a(tk.n<? super T> nVar, ql.d<Throwable> dVar, tk.l<T> lVar) {
            this.f14654a = nVar;
            this.f14657d = dVar;
            this.f14660g = lVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.e(this.f14659f, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            bi.r.H(this.f14654a, t10, this, this.f14656c);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this.f14659f);
            xk.b.a(this.f14658e);
        }

        public final boolean d() {
            return xk.b.d(this.f14659f.get());
        }

        public final void e() {
            if (this.f14655b.getAndIncrement() == 0) {
                while (!d()) {
                    if (!this.f14661h) {
                        this.f14661h = true;
                        this.f14660g.d(this);
                    }
                    if (this.f14655b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // tk.n
        public final void onComplete() {
            xk.b.a(this.f14658e);
            bi.r.F(this.f14654a, this, this.f14656c);
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            xk.b.e(this.f14659f, null);
            this.f14661h = false;
            this.f14657d.b(th2);
        }
    }

    public r0(tk.l<T> lVar, wk.e<? super tk.i<Throwable>, ? extends tk.l<?>> eVar) {
        super(lVar);
        this.f14653b = eVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        ql.d<T> G = new ql.b().G();
        try {
            tk.l<?> apply = this.f14653b.apply(G);
            Objects.requireNonNull(apply, "The handler returned a null ObservableSource");
            tk.l<?> lVar = apply;
            a aVar = new a(nVar, G, this.f14315a);
            nVar.a(aVar);
            lVar.d(aVar.f14658e);
            aVar.e();
        } catch (Throwable th2) {
            h7.a.y(th2);
            nVar.a(xk.c.INSTANCE);
            nVar.onError(th2);
        }
    }
}
