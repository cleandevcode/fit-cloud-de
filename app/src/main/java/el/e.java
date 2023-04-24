package el;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import tk.i;
import tk.l;
import tk.n;
import tk.r;
import tk.t;

/* loaded from: classes2.dex */
public final class e<T, R> extends i<R> {

    /* renamed from: a */
    public final t<T> f13844a;

    /* renamed from: b */
    public final wk.e<? super T, ? extends l<? extends R>> f13845b;

    /* loaded from: classes2.dex */
    public static final class a<T, R> extends AtomicReference<uk.c> implements n<R>, r<T>, uk.c {

        /* renamed from: a */
        public final n<? super R> f13846a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends l<? extends R>> f13847b;

        public a(n<? super R> nVar, wk.e<? super T, ? extends l<? extends R>> eVar) {
            this.f13846a = nVar;
            this.f13847b = eVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.e(this, cVar);
        }

        @Override // tk.n
        public final void b(R r10) {
            this.f13846a.b(r10);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        public final boolean d() {
            return xk.b.d(get());
        }

        @Override // tk.n
        public final void onComplete() {
            this.f13846a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f13846a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            try {
                l<? extends R> apply = this.f13847b.apply(t10);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                l<? extends R> lVar = apply;
                if (d()) {
                    return;
                }
                lVar.d(this);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f13846a.onError(th2);
            }
        }
    }

    public e(t<T> tVar, wk.e<? super T, ? extends l<? extends R>> eVar) {
        this.f13844a = tVar;
        this.f13845b = eVar;
    }

    @Override // tk.i
    public final void z(n<? super R> nVar) {
        a aVar = new a(nVar, this.f13845b);
        nVar.a(aVar);
        this.f13844a.c(aVar);
    }
}
