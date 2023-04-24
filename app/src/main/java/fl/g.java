package fl;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g<T> extends tk.i<T> {

    /* renamed from: a */
    public final tk.k<T> f14468a;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.j<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14469a;

        public a(tk.n<? super T> nVar) {
            this.f14469a = nVar;
        }

        public final boolean a() {
            return xk.b.d(get());
        }

        public final void b() {
            if (!a()) {
                try {
                    this.f14469a.onComplete();
                } finally {
                    xk.b.a(this);
                }
            }
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        public final void d(T t10) {
            if (t10 == null) {
                NullPointerException a10 = kl.d.a("onNext called with a null value.");
                if (!f(a10)) {
                    ol.a.a(a10);
                }
            } else if (!a()) {
                this.f14469a.b(t10);
            }
        }

        public final void e(wk.c cVar) {
            xk.b.g(this, new xk.a(cVar));
        }

        public final boolean f(Throwable th2) {
            if (th2 == null) {
                th2 = kl.d.a("onError called with a null Throwable.");
            }
            if (!a()) {
                try {
                    this.f14469a.onError(th2);
                    xk.b.a(this);
                    return true;
                } catch (Throwable th3) {
                    xk.b.a(this);
                    throw th3;
                }
            }
            return false;
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public g(tk.k<T> kVar) {
        this.f14468a = kVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        a aVar = new a(nVar);
        nVar.a(aVar);
        try {
            this.f14468a.a(aVar);
        } catch (Throwable th2) {
            h7.a.y(th2);
            if (aVar.f(th2)) {
                return;
            }
            ol.a.a(th2);
        }
    }
}
