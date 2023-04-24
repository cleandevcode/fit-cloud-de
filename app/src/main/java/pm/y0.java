package pm;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class y0 extends x0 implements j0 {

    /* renamed from: c */
    public final Executor f24414c;

    public y0(Executor executor) {
        Method method;
        this.f24414c = executor;
        Method method2 = um.e.f28896a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = um.e.f28896a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // pm.j0
    public final void D(long j10, j jVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f24414c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            h8.j0 j0Var = new h8.j0(this, jVar, 1);
            xl.f fVar = jVar.f24353e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(j0Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                bi.m0.f(fVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            jVar.z(new f(scheduledFuture));
        } else {
            h0.f24343i.D(j10, jVar);
        }
    }

    @Override // pm.j0
    public final q0 E(long j10, e2 e2Var, xl.f fVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f24414c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(e2Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                bi.m0.f(fVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new p0(scheduledFuture);
        }
        return h0.f24343i.E(j10, e2Var, fVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f24414c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof y0) && ((y0) obj).f24414c == this.f24414c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f24414c);
    }

    @Override // pm.b0
    public final void l0(xl.f fVar, Runnable runnable) {
        try {
            this.f24414c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            bi.m0.f(fVar, cancellationException);
            o0.f24382b.l0(fVar, runnable);
        }
    }

    @Override // pm.b0
    public final String toString() {
        return this.f24414c.toString();
    }
}
