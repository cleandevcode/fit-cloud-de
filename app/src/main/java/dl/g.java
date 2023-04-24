package dl;

import java.util.concurrent.atomic.AtomicReference;
import tk.p;
import tk.r;
import tk.t;

/* loaded from: classes2.dex */
public final class g<T> extends p<T> {

    /* renamed from: a */
    public final tk.h<T> f13146a;

    /* renamed from: b */
    public final t<? extends T> f13147b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.g<T>, uk.c {

        /* renamed from: a */
        public final r<? super T> f13148a;

        /* renamed from: b */
        public final t<? extends T> f13149b;

        /* renamed from: dl.g$a$a */
        /* loaded from: classes2.dex */
        public static final class C0228a<T> implements r<T> {

            /* renamed from: a */
            public final r<? super T> f13150a;

            /* renamed from: b */
            public final AtomicReference<uk.c> f13151b;

            public C0228a(r<? super T> rVar, AtomicReference<uk.c> atomicReference) {
                this.f13150a = rVar;
                this.f13151b = atomicReference;
            }

            @Override // tk.r, tk.b, tk.g
            public final void a(uk.c cVar) {
                xk.b.h(this.f13151b, cVar);
            }

            @Override // tk.r, tk.b, tk.g
            public final void onError(Throwable th2) {
                this.f13150a.onError(th2);
            }

            @Override // tk.r, tk.g
            public final void onSuccess(T t10) {
                this.f13150a.onSuccess(t10);
            }
        }

        public a(r<? super T> rVar, t<? extends T> tVar) {
            this.f13148a = rVar;
            this.f13149b = tVar;
        }

        @Override // tk.g
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar)) {
                this.f13148a.a(this);
            }
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.g
        public final void onComplete() {
            uk.c cVar = get();
            if (cVar == xk.b.f30613a || !compareAndSet(cVar, null)) {
                return;
            }
            this.f13149b.c(new C0228a(this.f13148a, this));
        }

        @Override // tk.g
        public final void onError(Throwable th2) {
            this.f13148a.onError(th2);
        }

        @Override // tk.g
        public final void onSuccess(T t10) {
            this.f13148a.onSuccess(t10);
        }
    }

    public g(tk.h hVar, p pVar) {
        this.f13146a = hVar;
        this.f13147b = pVar;
    }

    @Override // tk.p
    public final void f(r<? super T> rVar) {
        this.f13146a.a(new a(rVar, this.f13147b));
    }
}
