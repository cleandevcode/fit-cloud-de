package gl;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class p<T, R> extends tk.p<R> {

    /* renamed from: a */
    public final tk.t<? extends T> f15440a;

    /* renamed from: b */
    public final wk.e<? super T, ? extends R> f15441b;

    /* loaded from: classes2.dex */
    public static final class a<T, R> implements tk.r<T> {

        /* renamed from: a */
        public final tk.r<? super R> f15442a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends R> f15443b;

        public a(tk.r<? super R> rVar, wk.e<? super T, ? extends R> eVar) {
            this.f15442a = rVar;
            this.f15443b = eVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            this.f15442a.a(cVar);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f15442a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            try {
                R apply = this.f15443b.apply(t10);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f15442a.onSuccess(apply);
            } catch (Throwable th2) {
                h7.a.y(th2);
                onError(th2);
            }
        }
    }

    public p(tk.t<? extends T> tVar, wk.e<? super T, ? extends R> eVar) {
        this.f15440a = tVar;
        this.f15441b = eVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super R> rVar) {
        this.f15440a.c(new a(rVar, this.f15441b));
    }
}
