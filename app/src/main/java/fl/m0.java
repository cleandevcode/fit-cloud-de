package fl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class m0<T, R> extends fl.a<T, R> {

    /* renamed from: b */
    public final wk.e<? super tk.i<T>, ? extends tk.l<R>> f14565b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T> {

        /* renamed from: a */
        public final ql.b<T> f14566a;

        /* renamed from: b */
        public final AtomicReference<uk.c> f14567b;

        public a(ql.b bVar, b bVar2) {
            this.f14566a = bVar;
            this.f14567b = bVar2;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.h(this.f14567b, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            this.f14566a.b(t10);
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14566a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14566a.onError(th2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<R> extends AtomicReference<uk.c> implements tk.n<R>, uk.c {

        /* renamed from: a */
        public final tk.n<? super R> f14568a;

        /* renamed from: b */
        public uk.c f14569b;

        public b(tk.n<? super R> nVar) {
            this.f14568a = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14569b, cVar)) {
                this.f14569b = cVar;
                this.f14568a.a(this);
            }
        }

        @Override // tk.n
        public final void b(R r10) {
            this.f14568a.b(r10);
        }

        @Override // uk.c
        public final void c() {
            this.f14569b.c();
            xk.b.a(this);
        }

        @Override // tk.n
        public final void onComplete() {
            xk.b.a(this);
            this.f14568a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            xk.b.a(this);
            this.f14568a.onError(th2);
        }
    }

    public m0(tk.l<T> lVar, wk.e<? super tk.i<T>, ? extends tk.l<R>> eVar) {
        super(lVar);
        this.f14565b = eVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super R> nVar) {
        ql.b bVar = new ql.b();
        try {
            tk.l<R> apply = this.f14565b.apply(bVar);
            Objects.requireNonNull(apply, "The selector returned a null ObservableSource");
            tk.l<R> lVar = apply;
            b bVar2 = new b(nVar);
            lVar.d(bVar2);
            this.f14315a.d(new a(bVar, bVar2));
        } catch (Throwable th2) {
            h7.a.y(th2);
            nVar.a(xk.c.INSTANCE);
            nVar.onError(th2);
        }
    }
}
