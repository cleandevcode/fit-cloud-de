package c0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: b */
    public final Executor f4517b;

    /* renamed from: a */
    public final ArrayDeque f4516a = new ArrayDeque();

    /* renamed from: c */
    public final b f4518c = new b();

    /* renamed from: d */
    public int f4519d = 1;

    /* renamed from: e */
    public long f4520e = 0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f4521a;

        public a(Runnable runnable) {
            this.f4521a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4521a.run();
        }
    }

    /* loaded from: classes.dex */
    public final class b implements Runnable {
        public b() {
            g.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:64:0x0037, code lost:
            if (r1 == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0039, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0040, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0046, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0047, code lost:
            r4.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x004b, code lost:
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x004c, code lost:
            y.u0.c("SequentialExecutor", "Exception while executing runnable " + r4, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r10 = this;
                r0 = 0
                r1 = 0
            L2:
                c0.g r2 = c0.g.this     // Catch: java.lang.Throwable -> L66
                java.util.ArrayDeque r2 = r2.f4516a     // Catch: java.lang.Throwable -> L66
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L66
                r3 = 1
                if (r0 != 0) goto L26
                c0.g r0 = c0.g.this     // Catch: java.lang.Throwable -> L63
                int r4 = r0.f4519d     // Catch: java.lang.Throwable -> L63
                r5 = 4
                if (r4 != r5) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r6 = r0.f4520e     // Catch: java.lang.Throwable -> L63
                r8 = 1
                long r6 = r6 + r8
                r0.f4520e = r6     // Catch: java.lang.Throwable -> L63
                r0.f4519d = r5     // Catch: java.lang.Throwable -> L63
                r0 = 1
            L26:
                c0.g r4 = c0.g.this     // Catch: java.lang.Throwable -> L63
                java.util.ArrayDeque r4 = r4.f4516a     // Catch: java.lang.Throwable -> L63
                java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L63
                java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L63
                if (r4 != 0) goto L41
                c0.g r0 = c0.g.this     // Catch: java.lang.Throwable -> L63
                r0.f4519d = r3     // Catch: java.lang.Throwable -> L63
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L40
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L40:
                return
            L41:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L66
                r1 = r1 | r2
                r4.run()     // Catch: java.lang.RuntimeException -> L4b java.lang.Throwable -> L66
                goto L2
            L4b:
                r2 = move-exception
                java.lang.String r3 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
                r5.<init>()     // Catch: java.lang.Throwable -> L66
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L66
                r5.append(r4)     // Catch: java.lang.Throwable -> L66
                java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L66
                y.u0.c(r3, r4, r2)     // Catch: java.lang.Throwable -> L66
                goto L2
            L63:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                throw r0     // Catch: java.lang.Throwable -> L66
            L66:
                r0 = move-exception
                if (r1 == 0) goto L70
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L70:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.g.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (g.this.f4516a) {
                    g.this.f4519d = 1;
                    throw e10;
                }
            }
        }
    }

    public g(Executor executor) {
        executor.getClass();
        this.f4517b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f4516a) {
            int i10 = this.f4519d;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f4520e;
                a aVar = new a(runnable);
                this.f4516a.add(aVar);
                this.f4519d = 2;
                boolean z10 = false;
                try {
                    this.f4517b.execute(this.f4518c);
                    if (this.f4519d != 2) {
                        z10 = true;
                    }
                    if (z10) {
                        return;
                    }
                    synchronized (this.f4516a) {
                        if (this.f4520e == j10 && this.f4519d == 2) {
                            this.f4519d = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f4516a) {
                        int i11 = this.f4519d;
                        if ((i11 == 1 || i11 == 2) && this.f4516a.removeLastOccurrence(aVar)) {
                            z10 = true;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || z10) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f4516a.add(runnable);
        }
    }
}
