package fl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class w<T> extends tk.a implements zk.a<T> {

    /* renamed from: a */
    public final tk.l<T> f14721a;

    /* renamed from: b */
    public final wk.e<? super T, ? extends tk.c> f14722b;

    /* renamed from: c */
    public final boolean f14723c = false;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicInteger implements uk.c, tk.n<T> {

        /* renamed from: a */
        public final tk.b f14724a;

        /* renamed from: c */
        public final wk.e<? super T, ? extends tk.c> f14726c;

        /* renamed from: d */
        public final boolean f14727d;

        /* renamed from: f */
        public uk.c f14729f;

        /* renamed from: g */
        public volatile boolean f14730g;

        /* renamed from: b */
        public final kl.b f14725b = new kl.b();

        /* renamed from: e */
        public final uk.b f14728e = new uk.b();

        /* renamed from: fl.w$a$a */
        /* loaded from: classes2.dex */
        public final class C0264a extends AtomicReference<uk.c> implements tk.b, uk.c {
            public C0264a() {
                a.this = r1;
            }

            @Override // tk.b, tk.g
            public final void a(uk.c cVar) {
                xk.b.h(this, cVar);
            }

            @Override // uk.c
            public final void c() {
                xk.b.a(this);
            }

            @Override // tk.b, tk.g
            public final void onComplete() {
                a aVar = a.this;
                aVar.f14728e.d(this);
                aVar.onComplete();
            }

            @Override // tk.b, tk.g
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f14728e.d(this);
                aVar.onError(th2);
            }
        }

        public a(tk.b bVar, wk.e<? super T, ? extends tk.c> eVar, boolean z10) {
            this.f14724a = bVar;
            this.f14726c = eVar;
            this.f14727d = z10;
            lazySet(1);
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14729f, cVar)) {
                this.f14729f = cVar;
                this.f14724a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            try {
                tk.c apply = this.f14726c.apply(t10);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                tk.c cVar = apply;
                getAndIncrement();
                C0264a c0264a = new C0264a();
                if (this.f14730g || !this.f14728e.b(c0264a)) {
                    return;
                }
                cVar.a(c0264a);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f14729f.c();
                onError(th2);
            }
        }

        @Override // uk.c
        public final void c() {
            this.f14730g = true;
            this.f14729f.c();
            this.f14728e.c();
            this.f14725b.d();
        }

        @Override // tk.n
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f14725b.e(this.f14724a);
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14725b.c(th2)) {
                if (!this.f14727d) {
                    this.f14730g = true;
                    this.f14729f.c();
                    this.f14728e.c();
                } else if (decrementAndGet() != 0) {
                    return;
                }
                this.f14725b.e(this.f14724a);
            }
        }
    }

    public w(c1 c1Var, ph.p pVar) {
        this.f14721a = c1Var;
        this.f14722b = pVar;
    }

    @Override // zk.a
    public final tk.i<T> b() {
        return new v(this.f14721a, this.f14722b, this.f14723c);
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        this.f14721a.d(new a(bVar, this.f14722b, this.f14723c));
    }
}
