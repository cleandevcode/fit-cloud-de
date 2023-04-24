package gl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class t<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<T> f15460a;

    /* renamed from: b */
    public final long f15461b;

    /* renamed from: c */
    public final TimeUnit f15462c;

    /* renamed from: d */
    public final tk.o f15463d;

    /* renamed from: e */
    public final tk.t<? extends T> f15464e;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.r<T>, Runnable, uk.c {

        /* renamed from: a */
        public final tk.r<? super T> f15465a;

        /* renamed from: b */
        public final AtomicReference<uk.c> f15466b = new AtomicReference<>();

        /* renamed from: c */
        public final C0277a<T> f15467c;

        /* renamed from: d */
        public tk.t<? extends T> f15468d;

        /* renamed from: e */
        public final long f15469e;

        /* renamed from: f */
        public final TimeUnit f15470f;

        /* renamed from: gl.t$a$a */
        /* loaded from: classes2.dex */
        public static final class C0277a<T> extends AtomicReference<uk.c> implements tk.r<T> {

            /* renamed from: a */
            public final tk.r<? super T> f15471a;

            public C0277a(tk.r<? super T> rVar) {
                this.f15471a = rVar;
            }

            @Override // tk.r, tk.b, tk.g
            public final void a(uk.c cVar) {
                xk.b.h(this, cVar);
            }

            @Override // tk.r, tk.b, tk.g
            public final void onError(Throwable th2) {
                this.f15471a.onError(th2);
            }

            @Override // tk.r, tk.g
            public final void onSuccess(T t10) {
                this.f15471a.onSuccess(t10);
            }
        }

        public a(tk.r<? super T> rVar, tk.t<? extends T> tVar, long j10, TimeUnit timeUnit) {
            this.f15465a = rVar;
            this.f15468d = tVar;
            this.f15469e = j10;
            this.f15470f = timeUnit;
            if (tVar != null) {
                this.f15467c = new C0277a<>(rVar);
            } else {
                this.f15467c = null;
            }
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            xk.b.h(this, cVar);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
            xk.b.a(this.f15466b);
            C0277a<T> c0277a = this.f15467c;
            if (c0277a != null) {
                xk.b.a(c0277a);
            }
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            uk.c cVar = get();
            xk.b bVar = xk.b.f30613a;
            if (cVar == bVar || !compareAndSet(cVar, bVar)) {
                ol.a.a(th2);
                return;
            }
            xk.b.a(this.f15466b);
            this.f15465a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            uk.c cVar = get();
            xk.b bVar = xk.b.f30613a;
            if (cVar == bVar || !compareAndSet(cVar, bVar)) {
                return;
            }
            xk.b.a(this.f15466b);
            this.f15465a.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            uk.c cVar = get();
            xk.b bVar = xk.b.f30613a;
            if (cVar == bVar || !compareAndSet(cVar, bVar)) {
                return;
            }
            if (cVar != null) {
                cVar.c();
            }
            tk.t<? extends T> tVar = this.f15468d;
            if (tVar == null) {
                this.f15465a.onError(new TimeoutException(kl.d.c(this.f15469e, this.f15470f)));
                return;
            }
            this.f15468d = null;
            tVar.c(this.f15467c);
        }
    }

    public t(tk.t tVar, long j10, TimeUnit timeUnit, tk.o oVar, tk.p pVar) {
        this.f15460a = tVar;
        this.f15461b = j10;
        this.f15462c = timeUnit;
        this.f15463d = oVar;
        this.f15464e = pVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        a aVar = new a(rVar, this.f15464e, this.f15461b, this.f15462c);
        rVar.a(aVar);
        xk.b.e(aVar.f15466b, this.f15463d.d(aVar, this.f15461b, this.f15462c));
        this.f15460a.c(aVar);
    }
}
