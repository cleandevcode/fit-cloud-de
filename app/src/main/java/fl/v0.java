package fl;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class v0<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final tk.o f14716b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14717a;

        /* renamed from: b */
        public final AtomicReference<uk.c> f14718b = new AtomicReference<>();

        public a(tk.n<? super T> nVar) {
            this.f14717a = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.h(this.f14718b, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            this.f14717a.b(t10);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this.f14718b);
            xk.b.a(this);
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14717a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14717a.onError(th2);
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements Runnable {

        /* renamed from: a */
        public final a<T> f14719a;

        public b(a<T> aVar) {
            v0.this = r1;
            this.f14719a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            v0.this.f14315a.d(this.f14719a);
        }
    }

    public v0(tk.l<T> lVar, tk.o oVar) {
        super(lVar);
        this.f14716b = oVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        a aVar = new a(nVar);
        nVar.a(aVar);
        xk.b.h(aVar, this.f14716b.c(new b(aVar)));
    }
}
