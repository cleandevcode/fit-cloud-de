package gl;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<T> f15400a;

    /* renamed from: b */
    public final tk.c f15401b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.b, uk.c {

        /* renamed from: a */
        public final tk.r<? super T> f15402a;

        /* renamed from: b */
        public final tk.t<T> f15403b;

        public a(tk.r<? super T> rVar, tk.t<T> tVar) {
            this.f15402a = rVar;
            this.f15403b = tVar;
        }

        @Override // tk.b, tk.g
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar)) {
                this.f15402a.a(this);
            }
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.b, tk.g
        public final void onComplete() {
            this.f15403b.c(new al.k(this.f15402a, this));
        }

        @Override // tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f15402a.onError(th2);
        }
    }

    public e(tk.p pVar, tk.c cVar) {
        this.f15400a = pVar;
        this.f15401b = cVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        this.f15401b.a(new a(rVar, this.f15400a));
    }
}
