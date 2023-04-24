package il;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e implements Callable<Void>, uk.c {

    /* renamed from: f */
    public static final FutureTask<Void> f17145f = new FutureTask<>(yk.a.f31787b, null);

    /* renamed from: a */
    public final Runnable f17146a;

    /* renamed from: d */
    public final ExecutorService f17149d;

    /* renamed from: e */
    public Thread f17150e;

    /* renamed from: c */
    public final AtomicReference<Future<?>> f17148c = new AtomicReference<>();

    /* renamed from: b */
    public final AtomicReference<Future<?>> f17147b = new AtomicReference<>();

    public e(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f17146a = runnable;
        this.f17149d = scheduledExecutorService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x002b, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.concurrent.Future<?> r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r0 = r5.f17148c
            java.lang.Object r0 = r0.get()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            java.util.concurrent.FutureTask<java.lang.Void> r1 = il.e.f17145f
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L1b
            java.lang.Thread r0 = r5.f17150e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L17
            r2 = 1
        L17:
            r6.cancel(r2)
            return
        L1b:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r1 = r5.f17148c
        L1d:
            boolean r4 = r1.compareAndSet(r0, r6)
            if (r4 == 0) goto L25
            r2 = 1
            goto L2b
        L25:
            java.lang.Object r4 = r1.get()
            if (r4 == r0) goto L1d
        L2b:
            if (r2 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il.e.a(java.util.concurrent.Future):void");
    }

    @Override // uk.c
    public final void c() {
        AtomicReference<Future<?>> atomicReference = this.f17148c;
        FutureTask<Void> futureTask = f17145f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f17150e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f17147b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f17150e != Thread.currentThread());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0028, code lost:
        if (r7.f17150e == java.lang.Thread.currentThread()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002a, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002b, code lost:
        r1.cancel(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x003f, code lost:
        continue;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Void call() {
        /*
            r7 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r7.f17150e = r0
            r0 = 0
            java.lang.Runnable r1 = r7.f17146a     // Catch: java.lang.Throwable -> L42
            r1.run()     // Catch: java.lang.Throwable -> L42
            r7.f17150e = r0     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.ExecutorService r1 = r7.f17149d     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.Future r1 = r1.submit(r7)     // Catch: java.lang.Throwable -> L42
        L14:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r2 = r7.f17147b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.FutureTask<java.lang.Void> r3 = il.e.f17145f     // Catch: java.lang.Throwable -> L42
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L2f
            java.lang.Thread r2 = r7.f17150e     // Catch: java.lang.Throwable -> L42
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L42
            if (r2 == r3) goto L2b
            r4 = 1
        L2b:
            r1.cancel(r4)     // Catch: java.lang.Throwable -> L42
            goto L41
        L2f:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> r3 = r7.f17147b     // Catch: java.lang.Throwable -> L42
        L31:
            boolean r6 = r3.compareAndSet(r2, r1)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L39
            r4 = 1
            goto L3f
        L39:
            java.lang.Object r6 = r3.get()     // Catch: java.lang.Throwable -> L42
            if (r6 == r2) goto L31
        L3f:
            if (r4 == 0) goto L14
        L41:
            return r0
        L42:
            r1 = move-exception
            r7.f17150e = r0
            ol.a.a(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: il.e.call():java.lang.Object");
    }
}
