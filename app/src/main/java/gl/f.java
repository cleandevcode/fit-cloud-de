package gl;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class f<T, U> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<T> f15404a;

    /* renamed from: b */
    public final tk.l<U> f15405b;

    /* loaded from: classes2.dex */
    public static final class a<T, U> extends AtomicReference<uk.c> implements tk.n<U>, uk.c {

        /* renamed from: a */
        public final tk.r<? super T> f15406a;

        /* renamed from: b */
        public final tk.t<T> f15407b;

        /* renamed from: c */
        public boolean f15408c;

        public a(tk.r<? super T> rVar, tk.t<T> tVar) {
            this.f15406a = rVar;
            this.f15407b = tVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar)) {
                this.f15406a.a(this);
            }
        }

        @Override // tk.n
        public final void b(U u10) {
            get().c();
            onComplete();
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f15408c) {
                return;
            }
            this.f15408c = true;
            this.f15407b.c(new al.k(this.f15406a, this));
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f15408c) {
                ol.a.a(th2);
                return;
            }
            this.f15408c = true;
            this.f15406a.onError(th2);
        }
    }

    public f(n nVar, tk.i iVar) {
        this.f15404a = nVar;
        this.f15405b = iVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f15405b.d(new a(rVar, this.f15404a));
    }
}
