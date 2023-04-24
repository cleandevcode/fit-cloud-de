package gl;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b<T> extends tk.p<T> {

    /* renamed from: a */
    public final tk.s<T> f15385a;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.q<T>, uk.c {

        /* renamed from: a */
        public final tk.r<? super T> f15386a;

        public a(tk.r<? super T> rVar) {
            this.f15386a = rVar;
        }

        public final void a(T t10) {
            uk.c andSet;
            uk.c cVar = get();
            xk.b bVar = xk.b.f30613a;
            if (cVar == bVar || (andSet = getAndSet(bVar)) == bVar) {
                return;
            }
            try {
                if (t10 == null) {
                    this.f15386a.onError(kl.d.a("onSuccess called with a null value."));
                } else {
                    this.f15386a.onSuccess(t10);
                }
                if (andSet != null) {
                    andSet.c();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.c();
                }
                throw th2;
            }
        }

        public final boolean b(Throwable th2) {
            uk.c andSet;
            if (th2 == null) {
                th2 = kl.d.a("onError called with a null Throwable.");
            }
            uk.c cVar = get();
            xk.b bVar = xk.b.f30613a;
            if (cVar == bVar || (andSet = getAndSet(bVar)) == bVar) {
                return false;
            }
            try {
                this.f15386a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.c();
                }
            }
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public b(tk.s<T> sVar) {
        this.f15385a = sVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        a aVar = new a(rVar);
        rVar.a(aVar);
        try {
            this.f15385a.a(aVar);
        } catch (Throwable th2) {
            h7.a.y(th2);
            if (aVar.b(th2)) {
                return;
            }
            ol.a.a(th2);
        }
    }
}
