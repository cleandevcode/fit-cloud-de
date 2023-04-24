package um;

import pm.e2;
import pm.i0;
import pm.j0;
import pm.q0;

/* loaded from: classes2.dex */
public final class i extends pm.b0 implements Runnable, j0 {

    /* renamed from: c */
    public final pm.b0 f28909c;

    /* renamed from: d */
    public final int f28910d;

    /* renamed from: e */
    public final /* synthetic */ j0 f28911e;

    /* renamed from: f */
    public final m<Runnable> f28912f;

    /* renamed from: g */
    public final Object f28913g;
    private volatile int runningWorkers;

    public i(wm.l lVar, int i10) {
        j0 j0Var;
        this.f28909c = lVar;
        this.f28910d = i10;
        if (lVar instanceof j0) {
            j0Var = (j0) lVar;
        } else {
            j0Var = null;
        }
        this.f28911e = j0Var == null ? i0.f24347a : j0Var;
        this.f28912f = new m<>();
        this.f28913g = new Object();
    }

    @Override // pm.j0
    public final void D(long j10, pm.j jVar) {
        this.f28911e.D(j10, jVar);
    }

    @Override // pm.j0
    public final q0 E(long j10, e2 e2Var, xl.f fVar) {
        return this.f28911e.E(j10, e2Var, fVar);
    }

    @Override // pm.b0
    public final void l0(xl.f fVar, Runnable runnable) {
        boolean z10;
        this.f28912f.a(runnable);
        boolean z11 = true;
        if (this.runningWorkers >= this.f28910d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            synchronized (this.f28913g) {
                if (this.runningWorkers >= this.f28910d) {
                    z11 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z11) {
                this.f28909c.l0(this, this);
            }
        }
    }

    @Override // pm.b0
    public final void n0(xl.f fVar, Runnable runnable) {
        boolean z10;
        this.f28912f.a(runnable);
        boolean z11 = true;
        if (this.runningWorkers >= this.f28910d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            synchronized (this.f28913g) {
                if (this.runningWorkers >= this.f28910d) {
                    z11 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z11) {
                this.f28909c.n0(this, this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x002a, code lost:
        r1 = r4.f28913g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0039, code lost:
        if (r4.f28912f.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x003d, code lost:
        r4.runningWorkers++;
        r2 = tl.l.f28297a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            um.m<java.lang.Runnable> r2 = r4.f28912f
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            xl.g r3 = xl.g.f30632a
            ih.v.g(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            pm.b0 r2 = r4.f28909c
            boolean r2 = r2.p0(r4)
            if (r2 == 0) goto L2
            pm.b0 r0 = r4.f28909c
            r0.l0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f28913g
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            um.m<java.lang.Runnable> r2 = r4.f28912f     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            tl.l r2 = tl.l.f28297a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: um.i.run():void");
    }
}
