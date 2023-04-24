package dl;

import fl.p;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class h<T, U> extends dl.a<T, T> {

    /* renamed from: b */
    public final tk.h<U> f13152b;

    /* renamed from: c */
    public final tk.h<? extends T> f13153c;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements tk.g<T> {

        /* renamed from: a */
        public final tk.g<? super T> f13154a;

        public a(tk.g<? super T> gVar) {
            this.f13154a = gVar;
        }

        @Override // tk.g
        public final void a(uk.c cVar) {
            xk.b.h(this, cVar);
        }

        @Override // tk.g
        public final void onComplete() {
            this.f13154a.onComplete();
        }

        @Override // tk.g
        public final void onError(Throwable th2) {
            this.f13154a.onError(th2);
        }

        @Override // tk.g
        public final void onSuccess(T t10) {
            this.f13154a.onSuccess(t10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T, U> extends AtomicReference<uk.c> implements tk.g<T>, uk.c {

        /* renamed from: a */
        public final tk.g<? super T> f13155a;

        /* renamed from: b */
        public final c<T, U> f13156b = new c<>(this);

        /* renamed from: c */
        public final tk.h<? extends T> f13157c;

        /* renamed from: d */
        public final a<T> f13158d;

        public b(tk.g<? super T> gVar, tk.h<? extends T> hVar) {
            this.f13155a = gVar;
            this.f13157c = hVar;
            this.f13158d = hVar != null ? new a<>(gVar) : null;
        }

        @Override // tk.g
        public final void a(uk.c cVar) {
            xk.b.h(this, cVar);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
            xk.b.a(this.f13156b);
            a<T> aVar = this.f13158d;
            if (aVar != null) {
                xk.b.a(aVar);
            }
        }

        @Override // tk.g
        public final void onComplete() {
            xk.b.a(this.f13156b);
            xk.b bVar = xk.b.f30613a;
            if (getAndSet(bVar) != bVar) {
                this.f13155a.onComplete();
            }
        }

        @Override // tk.g
        public final void onError(Throwable th2) {
            xk.b.a(this.f13156b);
            xk.b bVar = xk.b.f30613a;
            if (getAndSet(bVar) != bVar) {
                this.f13155a.onError(th2);
            } else {
                ol.a.a(th2);
            }
        }

        @Override // tk.g
        public final void onSuccess(T t10) {
            xk.b.a(this.f13156b);
            xk.b bVar = xk.b.f30613a;
            if (getAndSet(bVar) != bVar) {
                this.f13155a.onSuccess(t10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T, U> extends AtomicReference<uk.c> implements tk.g<Object> {

        /* renamed from: a */
        public final b<T, U> f13159a;

        public c(b<T, U> bVar) {
            this.f13159a = bVar;
        }

        @Override // tk.g
        public final void a(uk.c cVar) {
            xk.b.h(this, cVar);
        }

        @Override // tk.g
        public final void onComplete() {
            b<T, U> bVar = this.f13159a;
            bVar.getClass();
            if (xk.b.a(bVar)) {
                tk.h<? extends T> hVar = bVar.f13157c;
                if (hVar == null) {
                    bVar.f13155a.onError(new TimeoutException());
                } else {
                    hVar.a(bVar.f13158d);
                }
            }
        }

        @Override // tk.g
        public final void onError(Throwable th2) {
            b<T, U> bVar = this.f13159a;
            bVar.getClass();
            if (xk.b.a(bVar)) {
                bVar.f13155a.onError(th2);
            } else {
                ol.a.a(th2);
            }
        }

        @Override // tk.g
        public final void onSuccess(Object obj) {
            b<T, U> bVar = this.f13159a;
            bVar.getClass();
            if (xk.b.a(bVar)) {
                tk.h<? extends T> hVar = bVar.f13157c;
                if (hVar == null) {
                    bVar.f13155a.onError(new TimeoutException());
                } else {
                    hVar.a(bVar.f13158d);
                }
            }
        }
    }

    public h(p pVar, i iVar) {
        super(pVar);
        this.f13152b = iVar;
        this.f13153c = null;
    }

    @Override // tk.f
    public final void c(tk.g<? super T> gVar) {
        b bVar = new b(gVar, this.f13153c);
        gVar.a(bVar);
        this.f13152b.a(bVar.f13156b);
        this.f13126a.a(bVar);
    }
}
