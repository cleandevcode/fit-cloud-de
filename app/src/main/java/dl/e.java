package dl;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class e<T, R> extends dl.a<T, R> {

    /* renamed from: b */
    public final wk.e<? super T, ? extends R> f13138b;

    /* loaded from: classes2.dex */
    public static final class a<T, R> implements tk.g<T>, uk.c {

        /* renamed from: a */
        public final tk.g<? super R> f13139a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends R> f13140b;

        /* renamed from: c */
        public uk.c f13141c;

        public a(tk.g<? super R> gVar, wk.e<? super T, ? extends R> eVar) {
            this.f13139a = gVar;
            this.f13140b = eVar;
        }

        @Override // tk.g
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f13141c, cVar)) {
                this.f13141c = cVar;
                this.f13139a.a(this);
            }
        }

        @Override // uk.c
        public final void c() {
            uk.c cVar = this.f13141c;
            this.f13141c = xk.b.f30613a;
            cVar.c();
        }

        @Override // tk.g
        public final void onComplete() {
            this.f13139a.onComplete();
        }

        @Override // tk.g
        public final void onError(Throwable th2) {
            this.f13139a.onError(th2);
        }

        @Override // tk.g
        public final void onSuccess(T t10) {
            try {
                R apply = this.f13140b.apply(t10);
                Objects.requireNonNull(apply, "The mapper returned a null item");
                this.f13139a.onSuccess(apply);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f13139a.onError(th2);
            }
        }
    }

    public e(tk.h<T> hVar, wk.e<? super T, ? extends R> eVar) {
        super(hVar);
        this.f13138b = eVar;
    }

    @Override // tk.f
    public final void c(tk.g<? super R> gVar) {
        this.f13126a.a(new a(gVar, this.f13138b));
    }
}
