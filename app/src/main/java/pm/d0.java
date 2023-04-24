package pm;

import java.lang.Thread;
import java.util.List;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a */
    public static final List<c0> f24331a = h7.a.u(nm.n.I(nm.j.G(ij.b.a())));

    public static final void a(xl.f fVar, Throwable th2) {
        Throwable runtimeException;
        for (c0 c0Var : f24331a) {
            try {
                c0Var.q(fVar, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    ih.v.b(runtimeException, th2);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            ih.v.b(th2, new k0(fVar));
            tl.l lVar = tl.l.f28297a;
        } catch (Throwable th4) {
            mf.a0.f(th4);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
