package il;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k extends a implements Callable<Void> {
    public k(Runnable runnable, boolean z10) {
        super(runnable, z10);
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.f17108c = Thread.currentThread();
        try {
            this.f17106a.run();
            lazySet(a.f17104d);
            this.f17108c = null;
            return null;
        } catch (Throwable th2) {
            ol.a.a(th2);
            throw th2;
        }
    }
}
