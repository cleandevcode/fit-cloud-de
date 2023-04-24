package gl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class d<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<? extends T> f15388a;

    /* renamed from: c */
    public final TimeUnit f15390c;

    /* renamed from: d */
    public final tk.o f15391d;

    /* renamed from: b */
    public final long f15389b = 1000;

    /* renamed from: e */
    public final boolean f15392e = false;

    /* loaded from: classes2.dex */
    public final class a implements tk.r<T> {

        /* renamed from: a */
        public final xk.e f15393a;

        /* renamed from: b */
        public final tk.r<? super T> f15394b;

        /* renamed from: gl.d$a$a */
        /* loaded from: classes2.dex */
        public final class RunnableC0275a implements Runnable {

            /* renamed from: a */
            public final Throwable f15396a;

            public RunnableC0275a(Throwable th2) {
                a.this = r1;
                this.f15396a = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f15394b.onError(this.f15396a);
            }
        }

        /* loaded from: classes2.dex */
        public final class b implements Runnable {

            /* renamed from: a */
            public final T f15398a;

            public b(T t10) {
                a.this = r1;
                this.f15398a = t10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f15394b.onSuccess((T) this.f15398a);
            }
        }

        public a(xk.e eVar, tk.r<? super T> rVar) {
            d.this = r1;
            this.f15393a = eVar;
            this.f15394b = rVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            xk.e eVar = this.f15393a;
            eVar.getClass();
            xk.b.e(eVar, cVar);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            xk.e eVar = this.f15393a;
            d dVar = d.this;
            uk.c d10 = dVar.f15391d.d(new RunnableC0275a(th2), dVar.f15392e ? dVar.f15389b : 0L, dVar.f15390c);
            eVar.getClass();
            xk.b.e(eVar, d10);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            xk.e eVar = this.f15393a;
            d dVar = d.this;
            uk.c d10 = dVar.f15391d.d(new b(t10), dVar.f15389b, dVar.f15390c);
            eVar.getClass();
            xk.b.e(eVar, d10);
        }
    }

    public d(p pVar, TimeUnit timeUnit, il.b bVar) {
        this.f15388a = pVar;
        this.f15390c = timeUnit;
        this.f15391d = bVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        xk.e eVar = new xk.e();
        rVar.a(eVar);
        this.f15388a.c(new a(eVar, rVar));
    }
}
