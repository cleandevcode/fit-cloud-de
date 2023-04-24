package fl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class v<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.e<? super T, ? extends tk.c> f14706b;

    /* renamed from: c */
    public final boolean f14707c;

    /* loaded from: classes2.dex */
    public static final class a<T> extends al.b<T> implements tk.n<T> {

        /* renamed from: a */
        public final tk.n<? super T> f14708a;

        /* renamed from: c */
        public final wk.e<? super T, ? extends tk.c> f14710c;

        /* renamed from: d */
        public final boolean f14711d;

        /* renamed from: f */
        public uk.c f14713f;

        /* renamed from: g */
        public volatile boolean f14714g;

        /* renamed from: b */
        public final kl.b f14709b = new kl.b();

        /* renamed from: e */
        public final uk.b f14712e = new uk.b();

        /* renamed from: fl.v$a$a */
        /* loaded from: classes2.dex */
        public final class C0263a extends AtomicReference<uk.c> implements tk.b, uk.c {
            public C0263a() {
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
                aVar.f14712e.d(this);
                aVar.onComplete();
            }

            @Override // tk.b, tk.g
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f14712e.d(this);
                aVar.onError(th2);
            }
        }

        public a(tk.n<? super T> nVar, wk.e<? super T, ? extends tk.c> eVar, boolean z10) {
            this.f14708a = nVar;
            this.f14710c = eVar;
            this.f14711d = z10;
            lazySet(1);
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14713f, cVar)) {
                this.f14713f = cVar;
                this.f14708a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            try {
                tk.c apply = this.f14710c.apply(t10);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                tk.c cVar = apply;
                getAndIncrement();
                C0263a c0263a = new C0263a();
                if (this.f14714g || !this.f14712e.b(c0263a)) {
                    return;
                }
                cVar.a(c0263a);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f14713f.c();
                onError(th2);
            }
        }

        @Override // uk.c
        public final void c() {
            this.f14714g = true;
            this.f14713f.c();
            this.f14712e.c();
            this.f14709b.d();
        }

        @Override // nl.f
        public final void clear() {
        }

        @Override // nl.c
        public final int d(int i10) {
            return i10 & 2;
        }

        @Override // nl.f
        public final boolean isEmpty() {
            return true;
        }

        @Override // tk.n
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f14709b.f(this.f14708a);
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14709b.c(th2)) {
                if (!this.f14711d) {
                    this.f14714g = true;
                    this.f14713f.c();
                    this.f14712e.c();
                } else if (decrementAndGet() != 0) {
                    return;
                }
                this.f14709b.f(this.f14708a);
            }
        }

        @Override // nl.f
        public final T poll() {
            return null;
        }
    }

    public v(tk.l<T> lVar, wk.e<? super T, ? extends tk.c> eVar, boolean z10) {
        super(lVar);
        this.f14706b = eVar;
        this.f14707c = z10;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14706b, this.f14707c));
    }
}
