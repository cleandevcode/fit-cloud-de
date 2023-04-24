package gl;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class q<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<T> f15444a;

    /* renamed from: b */
    public final tk.o f15445b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.r<T>, uk.c, Runnable {

        /* renamed from: a */
        public final tk.r<? super T> f15446a;

        /* renamed from: b */
        public final tk.o f15447b;

        /* renamed from: c */
        public T f15448c;

        /* renamed from: d */
        public Throwable f15449d;

        public a(tk.r<? super T> rVar, tk.o oVar) {
            this.f15446a = rVar;
            this.f15447b = oVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar)) {
                this.f15446a.a(this);
            }
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f15449d = th2;
            xk.b.e(this, this.f15447b.c(this));
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            this.f15448c = t10;
            xk.b.e(this, this.f15447b.c(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f15449d;
            if (th2 != null) {
                this.f15446a.onError(th2);
            } else {
                this.f15446a.onSuccess((T) this.f15448c);
            }
        }
    }

    public q(tk.t<T> tVar, tk.o oVar) {
        this.f15444a = tVar;
        this.f15445b = oVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f15444a.c(new a(rVar, this.f15445b));
    }
}
