package gl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l<T, R> extends tk.p<R> {

    /* renamed from: a */
    public final tk.t<? extends T> f15428a;

    /* renamed from: b */
    public final wk.e<? super T, ? extends tk.t<? extends R>> f15429b;

    /* loaded from: classes2.dex */
    public static final class a<T, R> extends AtomicReference<uk.c> implements tk.r<T>, uk.c {

        /* renamed from: a */
        public final tk.r<? super R> f15430a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends tk.t<? extends R>> f15431b;

        /* renamed from: gl.l$a$a */
        /* loaded from: classes2.dex */
        public static final class C0276a<R> implements tk.r<R> {

            /* renamed from: a */
            public final AtomicReference<uk.c> f15432a;

            /* renamed from: b */
            public final tk.r<? super R> f15433b;

            public C0276a(tk.r rVar, AtomicReference atomicReference) {
                this.f15432a = atomicReference;
                this.f15433b = rVar;
            }

            @Override // tk.r, tk.b, tk.g
            public final void a(uk.c cVar) {
                xk.b.e(this.f15432a, cVar);
            }

            @Override // tk.r, tk.b, tk.g
            public final void onError(Throwable th2) {
                this.f15433b.onError(th2);
            }

            @Override // tk.r, tk.g
            public final void onSuccess(R r10) {
                this.f15433b.onSuccess(r10);
            }
        }

        public a(tk.r<? super R> rVar, wk.e<? super T, ? extends tk.t<? extends R>> eVar) {
            this.f15430a = rVar;
            this.f15431b = eVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar)) {
                this.f15430a.a(this);
            }
        }

        public final boolean b() {
            return xk.b.d(get());
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f15430a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            try {
                tk.t<? extends R> apply = this.f15431b.apply(t10);
                Objects.requireNonNull(apply, "The single returned by the mapper is null");
                tk.t<? extends R> tVar = apply;
                if (b()) {
                    return;
                }
                tVar.c(new C0276a(this.f15430a, this));
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f15430a.onError(th2);
            }
        }
    }

    public l(tk.t<? extends T> tVar, wk.e<? super T, ? extends tk.t<? extends R>> eVar) {
        this.f15429b = eVar;
        this.f15428a = tVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super R> rVar) {
        this.f15428a.c(new a(rVar, this.f15429b));
    }
}
