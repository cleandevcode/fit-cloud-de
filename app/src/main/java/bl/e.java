package bl;

import tk.p;
import tk.r;
import tk.t;

/* loaded from: classes2.dex */
public final class e<T> extends tk.a {

    /* renamed from: a */
    public final t<T> f4451a;

    /* loaded from: classes2.dex */
    public static final class a<T> implements r<T> {

        /* renamed from: a */
        public final tk.b f4452a;

        public a(tk.b bVar) {
            this.f4452a = bVar;
        }

        @Override // tk.r, tk.b, tk.g
        public final void a(uk.c cVar) {
            this.f4452a.a(cVar);
        }

        @Override // tk.r, tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f4452a.onError(th2);
        }

        @Override // tk.r, tk.g
        public final void onSuccess(T t10) {
            this.f4452a.onComplete();
        }
    }

    public e(p pVar) {
        this.f4451a = pVar;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        this.f4451a.c(new a(bVar));
    }
}
