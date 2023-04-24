package uk;

/* loaded from: classes2.dex */
public final class f extends e<Runnable> {
    public f(Runnable runnable) {
        super(runnable);
    }

    @Override // uk.e
    public final void b(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("RunnableDisposable(disposed=");
        a10.append(a());
        a10.append(", ");
        a10.append(get());
        a10.append(")");
        return a10.toString();
    }
}
