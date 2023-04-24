package al;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class f extends AtomicReference<uk.c> implements tk.b, uk.c {

    /* renamed from: a */
    public final wk.d<? super Throwable> f616a;

    /* renamed from: b */
    public final wk.a f617b;

    public f(wk.a aVar, wk.d dVar) {
        this.f616a = dVar;
        this.f617b = aVar;
    }

    @Override // tk.b, tk.g
    public final void a(uk.c cVar) {
        xk.b.h(this, cVar);
    }

    @Override // uk.c
    public final void c() {
        xk.b.a(this);
    }

    @Override // tk.b, tk.g
    public final void onComplete() {
        try {
            this.f617b.run();
        } catch (Throwable th2) {
            h7.a.y(th2);
            ol.a.a(th2);
        }
        lazySet(xk.b.f30613a);
    }

    @Override // tk.b, tk.g
    public final void onError(Throwable th2) {
        try {
            this.f616a.accept(th2);
        } catch (Throwable th3) {
            h7.a.y(th3);
            ol.a.a(th3);
        }
        lazySet(xk.b.f30613a);
    }
}
