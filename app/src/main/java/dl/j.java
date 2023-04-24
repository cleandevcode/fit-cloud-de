package dl;

import tk.n;

/* loaded from: classes2.dex */
public final class j<T> extends tk.i<T> {

    /* renamed from: a */
    public final tk.h<T> f13164a;

    /* loaded from: classes2.dex */
    public static final class a<T> extends al.g<T> implements tk.g<T> {

        /* renamed from: c */
        public uk.c f13165c;

        public a(n<? super T> nVar) {
            super(nVar);
        }

        @Override // tk.g
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f13165c, cVar)) {
                this.f13165c = cVar;
                this.f618a.a(this);
            }
        }

        @Override // al.g, uk.c
        public final void c() {
            super.c();
            this.f13165c.c();
        }

        @Override // tk.g
        public final void onComplete() {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f618a.onComplete();
        }

        @Override // tk.g
        public final void onError(Throwable th2) {
            if ((get() & 54) != 0) {
                ol.a.a(th2);
                return;
            }
            lazySet(2);
            this.f618a.onError(th2);
        }

        @Override // tk.g
        public final void onSuccess(T t10) {
            e(t10);
        }
    }

    public j(tk.f fVar) {
        this.f13164a = fVar;
    }

    @Override // tk.i
    public final void z(n<? super T> nVar) {
        this.f13164a.a(new a(nVar));
    }
}
