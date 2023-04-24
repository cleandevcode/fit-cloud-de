package androidx.work;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Worker f3650a;

    public c(Worker worker) {
        this.f3650a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3650a.f3626f.i(this.f3650a.h());
        } catch (Throwable th2) {
            this.f3650a.f3626f.j(th2);
        }
    }
}
