package al;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class i extends AtomicReference<uk.c> implements tk.b, uk.c {
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
        lazySet(xk.b.f30613a);
    }

    @Override // tk.b, tk.g
    public final void onError(Throwable th2) {
        lazySet(xk.b.f30613a);
        ol.a.a(new vk.b(th2));
    }
}
