package wm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f30060b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30061c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30062d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30063e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a */
    public final AtomicReferenceArray<g> f30064a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final g a(g gVar, boolean z10) {
        if (z10) {
            return b(gVar);
        }
        g gVar2 = (g) f30060b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        boolean z10 = true;
        if (gVar.f30049b.b() != 1) {
            z10 = false;
        }
        if (z10) {
            f30063e.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return gVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f30064a.get(i10) != null) {
            Thread.yield();
        }
        this.f30064a.lazySet(i10, gVar);
        f30061c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    public final g d() {
        g andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f30062d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f30064a.getAndSet(i11, null)) != null) {
                if (andSet.f30049b.b() == 1) {
                    f30063e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
        return f(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(wm.m r9) {
        /*
            r8 = this;
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray<wm.g> r2 = r9.f30064a
        L6:
            r3 = 1
            if (r0 == r1) goto L44
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 == 0) goto L44
            java.lang.Object r5 = r2.get(r4)
            wm.g r5 = (wm.g) r5
            if (r5 == 0) goto L41
            wm.h r6 = r5.f30049b
            int r6 = r6.b()
            r7 = 0
            if (r6 != r3) goto L22
            r6 = 1
            goto L23
        L22:
            r6 = 0
        L23:
            if (r6 == 0) goto L41
        L25:
            r6 = 0
            boolean r6 = r2.compareAndSet(r4, r5, r6)
            if (r6 == 0) goto L2d
            goto L34
        L2d:
            java.lang.Object r6 = r2.get(r4)
            if (r6 == r5) goto L25
            r3 = 0
        L34:
            if (r3 == 0) goto L41
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = wm.m.f30063e
            r0.decrementAndGet(r9)
            r8.a(r5, r7)
            r0 = -1
            return r0
        L41:
            int r0 = r0 + 1
            goto L6
        L44:
            long r0 = r8.f(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.m.e(wm.m):long");
    }

    public final long f(m mVar, boolean z10) {
        g gVar;
        boolean z11;
        boolean z12;
        do {
            gVar = (g) mVar.lastScheduledTask;
            if (gVar == null) {
                return -2L;
            }
            z11 = true;
            if (z10) {
                if (gVar.f30049b.b() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    return -2L;
                }
            }
            k.f30056e.getClass();
            long nanoTime = System.nanoTime() - gVar.f30048a;
            long j10 = k.f30052a;
            if (nanoTime < j10) {
                return j10 - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30060b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(mVar, gVar, null)) {
                    if (atomicReferenceFieldUpdater.get(mVar) != gVar) {
                        z11 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z11);
        a(gVar, false);
        return -1L;
    }
}
