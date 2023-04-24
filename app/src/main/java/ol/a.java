package ol;

import vk.b;
import wk.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public static volatile d<? super Throwable> f23622a;

    public static void a(Throwable th2) {
        d<? super Throwable> dVar = f23622a;
        if (th2 == null) {
            th2 = kl.d.a("onError called with a null Throwable.");
        } else {
            boolean z10 = true;
            if (!(th2 instanceof b) && !(th2 instanceof IllegalStateException) && !(th2 instanceof NullPointerException) && !(th2 instanceof IllegalArgumentException) && !(th2 instanceof vk.a)) {
                z10 = false;
            }
            if (!z10) {
                th2 = new vk.d(th2);
            }
        }
        if (dVar != null) {
            try {
                dVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th3);
            }
        }
        th2.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
