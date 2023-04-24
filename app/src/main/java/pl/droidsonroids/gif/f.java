package pl.droidsonroids.gif;

import java.lang.Thread;

/* loaded from: classes2.dex */
public abstract class f implements Runnable {

    /* renamed from: a */
    public final b f24319a;

    public f(b bVar) {
        this.f24319a = bVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            GifInfoHandle gifInfoHandle = this.f24319a.f24299g;
            synchronized (gifInfoHandle) {
                if (gifInfoHandle.f24291a == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                a();
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
            }
            throw th2;
        }
    }
}
