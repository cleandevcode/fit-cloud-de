package gl;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class g<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<T> f15409a;

    /* renamed from: b */
    public final wk.a f15410b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicInteger implements tk.r<T>, uk.c {

        /* renamed from: a */
        public final tk.r<? super T> f15411a;

        /* renamed from: b */
        public final wk.a f15412b;

        /* renamed from: c */
        public uk.c f15413c;

        public a(tk.r<? super T> rVar, wk.a aVar) {
            this.f15411a = rVar;
            this.f15412b = aVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f15413c, cVar)) {
                this.f15413c = cVar;
                this.f15411a.a(this);
            }
        }

        public final void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f15412b.run();
                } catch (Throwable th2) {
                    h7.a.y(th2);
                    ol.a.a(th2);
                }
            }
        }

        @Override // uk.c
        public final void c() {
            this.f15413c.c();
            b();
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f15411a.onError(th2);
            b();
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            this.f15411a.onSuccess(t10);
            b();
        }
    }

    public g(tk.p pVar, qc.n nVar) {
        this.f15409a = pVar;
        this.f15410b = nVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f15409a.c(new a(rVar, this.f15410b));
    }
}
