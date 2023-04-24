package gl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class m<T> extends tk.a {

    /* renamed from: a */
    public final tk.t<T> f15434a;

    /* renamed from: b */
    public final wk.e<? super T, ? extends tk.c> f15435b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.r<T>, tk.b, uk.c {

        /* renamed from: a */
        public final tk.b f15436a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends tk.c> f15437b;

        public a(tk.b bVar, wk.e<? super T, ? extends tk.c> eVar) {
            this.f15436a = bVar;
            this.f15437b = eVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            xk.b.e(this, cVar);
        }

        public final boolean b() {
            return xk.b.d(get());
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.b, tk.g
        public final void onComplete() {
            this.f15436a.onComplete();
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f15436a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            try {
                tk.c apply = this.f15437b.apply(t10);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                tk.c cVar = apply;
                if (b()) {
                    return;
                }
                cVar.a(this);
            } catch (Throwable th2) {
                h7.a.y(th2);
                onError(th2);
            }
        }
    }

    public m(tk.t<T> tVar, wk.e<? super T, ? extends tk.c> eVar) {
        this.f15434a = tVar;
        this.f15435b = eVar;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        a aVar = new a(bVar, this.f15435b);
        bVar.a(aVar);
        this.f15434a.c(aVar);
    }
}
