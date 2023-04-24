package gl;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class s<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.t<? extends T> f15455a;

    /* renamed from: b */
    public final tk.o f15456b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.r<T>, uk.c, Runnable {

        /* renamed from: a */
        public final tk.r<? super T> f15457a;

        /* renamed from: b */
        public final xk.e f15458b = new xk.e();

        /* renamed from: c */
        public final tk.t<? extends T> f15459c;

        public a(tk.r<? super T> rVar, tk.t<? extends T> tVar) {
            this.f15457a = rVar;
            this.f15459c = tVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            xk.b.h(this, cVar);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
            xk.e eVar = this.f15458b;
            eVar.getClass();
            xk.b.a(eVar);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f15457a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            this.f15457a.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15459c.c(this);
        }
    }

    public s(tk.t<? extends T> tVar, tk.o oVar) {
        this.f15455a = tVar;
        this.f15456b = oVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        a aVar = new a(rVar, this.f15455a);
        rVar.a(aVar);
        uk.c c10 = this.f15456b.c(aVar);
        xk.e eVar = aVar.f15458b;
        eVar.getClass();
        xk.b.e(eVar, c10);
    }
}
