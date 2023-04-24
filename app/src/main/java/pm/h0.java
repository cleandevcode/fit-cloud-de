package pm;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import pm.v0;

/* loaded from: classes2.dex */
public final class h0 extends v0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i */
    public static final h0 f24343i;

    /* renamed from: j */
    public static final long f24344j;

    static {
        Long l10;
        h0 h0Var = new h0();
        f24343i = h0Var;
        h0Var.u0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f24344j = timeUnit.toNanos(l10.longValue());
    }

    @Override // pm.w0
    public final void A0(long j10, v0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // pm.v0, pm.j0
    public final q0 E(long j10, e2 e2Var, xl.f fVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            v0.b bVar = new v0.b(j11 + nanoTime, e2Var);
            M0(nanoTime, bVar);
            return bVar;
        }
        return s1.f24388a;
    }

    @Override // pm.v0
    public final void G0(Runnable runnable) {
        boolean z10;
        if (debugStatus == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            super.G0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void N0() {
        boolean z10;
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        debugStatus = 3;
        L0();
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        c2.f24328a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 != 2 && i10 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z11 = true;
                }
            }
            if (!z11) {
                _thread = null;
                N0();
                if (!K0()) {
                    z0();
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long x02 = x0();
                if (x02 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f24344j + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        N0();
                        if (!K0()) {
                            z0();
                            return;
                        }
                        return;
                    } else if (x02 > j11) {
                        x02 = j11;
                    }
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (x02 > 0) {
                    int i11 = debugStatus;
                    if (i11 != 2 && i11 != 3) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        _thread = null;
                        N0();
                        if (!K0()) {
                            z0();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, x02);
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            N0();
            if (!K0()) {
                z0();
            }
            throw th2;
        }
    }

    @Override // pm.v0, pm.u0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // pm.w0
    public final Thread z0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }
}
