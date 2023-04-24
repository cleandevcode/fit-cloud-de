package el;

import dl.f;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import tk.g;
import tk.h;
import tk.i;
import tk.l;
import tk.n;

/* loaded from: classes2.dex */
public final class c<T, R> extends i<R> {

    /* renamed from: a */
    public final h<T> f13830a;

    /* renamed from: b */
    public final wk.e<? super T, ? extends l<? extends R>> f13831b;

    /* loaded from: classes2.dex */
    public static final class a<T, R> extends AtomicReference<uk.c> implements n<R>, g<T>, uk.c {

        /* renamed from: a */
        public final n<? super R> f13832a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends l<? extends R>> f13833b;

        public a(n<? super R> nVar, wk.e<? super T, ? extends l<? extends R>> eVar) {
            this.f13832a = nVar;
            this.f13833b = eVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.e(this, cVar);
        }

        @Override // tk.n
        public final void b(R r10) {
            this.f13832a.b(r10);
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
            this.f13832a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f13832a.onError(th2);
        }

        @Override // tk.g
        public final void onSuccess(T t10) {
            try {
                l<? extends R> apply = this.f13833b.apply(t10);
                Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                l<? extends R> lVar = apply;
                if (d()) {
                    return;
                }
                lVar.d(this);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f13832a.onError(th2);
            }
        }
    }

    public c(f fVar, wi.g gVar) {
        this.f13830a = fVar;
        this.f13831b = gVar;
    }

    @Override // tk.i
    public final void z(n<? super R> nVar) {
        a aVar = new a(nVar, this.f13831b);
        nVar.a(aVar);
        this.f13830a.a(aVar);
    }
}
