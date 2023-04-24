package il;

/* loaded from: classes2.dex */
public final class j extends a implements Runnable {
    public j(Runnable runnable, boolean z10) {
        super(runnable, z10);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17108c = Thread.currentThread();
        try {
            this.f17106a.run();
            this.f17108c = null;
        } catch (Throwable th2) {
            c();
            this.f17108c = null;
            ol.a.a(th2);
            throw th2;
        }
    }
}
