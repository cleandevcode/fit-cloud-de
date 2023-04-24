package il;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class f extends tk.o {

    /* renamed from: d */
    public static final i f17151d;

    /* renamed from: e */
    public static final i f17152e;

    /* renamed from: h */
    public static final c f17155h;

    /* renamed from: i */
    public static boolean f17156i;

    /* renamed from: j */
    public static final a f17157j;

    /* renamed from: c */
    public final AtomicReference<a> f17158c;

    /* renamed from: g */
    public static final TimeUnit f17154g = TimeUnit.SECONDS;

    /* renamed from: f */
    public static final long f17153f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: a */
        public final long f17159a;

        /* renamed from: b */
        public final ConcurrentLinkedQueue<c> f17160b;

        /* renamed from: c */
        public final uk.b f17161c;

        /* renamed from: d */
        public final ScheduledExecutorService f17162d;

        /* renamed from: e */
        public final ScheduledFuture f17163e;

        /* renamed from: f */
        public final ThreadFactory f17164f;

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f17159a = nanos;
            this.f17160b = new ConcurrentLinkedQueue<>();
            this.f17161c = new uk.b();
            this.f17164f = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, f.f17152e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f17162d = scheduledExecutorService;
            this.f17163e = scheduledFuture;
        }

        public final void a() {
            this.f17161c.c();
            ScheduledFuture scheduledFuture = this.f17163e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f17162d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.f17160b;
            uk.b bVar = this.f17161c;
            if (!concurrentLinkedQueue.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<c> it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.f17169c <= nanoTime) {
                        if (concurrentLinkedQueue.remove(next)) {
                            bVar.a(next);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends o.c implements Runnable {

        /* renamed from: b */
        public final a f17166b;

        /* renamed from: c */
        public final c f17167c;

        /* renamed from: d */
        public final AtomicBoolean f17168d = new AtomicBoolean();

        /* renamed from: a */
        public final uk.b f17165a = new uk.b();

        public b(a aVar) {
            c cVar;
            c cVar2;
            this.f17166b = aVar;
            if (aVar.f17161c.f28841b) {
                cVar2 = f.f17155h;
            } else {
                while (true) {
                    if (!aVar.f17160b.isEmpty()) {
                        cVar = aVar.f17160b.poll();
                        if (cVar != null) {
                            break;
                        }
                    } else {
                        cVar = new c(aVar.f17164f);
                        aVar.f17161c.b(cVar);
                        break;
                    }
                }
                cVar2 = cVar;
            }
            this.f17167c = cVar2;
        }

        @Override // tk.o.c
        public final uk.c b(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f17165a.f28841b) {
                return xk.c.INSTANCE;
            }
            return this.f17167c.e(runnable, j10, timeUnit, this.f17165a);
        }

        @Override // uk.c
        public final void c() {
            if (this.f17168d.compareAndSet(false, true)) {
                this.f17165a.c();
                if (f.f17156i) {
                    this.f17167c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                a aVar = this.f17166b;
                c cVar = this.f17167c;
                aVar.getClass();
                cVar.f17169c = System.nanoTime() + aVar.f17159a;
                aVar.f17160b.offer(cVar);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = this.f17166b;
            c cVar = this.f17167c;
            aVar.getClass();
            cVar.f17169c = System.nanoTime() + aVar.f17159a;
            aVar.f17160b.offer(cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h {

        /* renamed from: c */
        public long f17169c;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f17169c = 0L;
        }
    }

    static {
        c cVar = new c(new i("RxCachedThreadSchedulerShutdown"));
        f17155h = cVar;
        cVar.c();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        i iVar = new i(false, "RxCachedThreadScheduler", max);
        f17151d = iVar;
        f17152e = new i(false, "RxCachedWorkerPoolEvictor", max);
        f17156i = Boolean.getBoolean("rx3.io-scheduled-release");
        a aVar = new a(0L, null, iVar);
        f17157j = aVar;
        aVar.a();
    }

    public f() {
        boolean z10;
        i iVar = f17151d;
        a aVar = f17157j;
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        this.f17158c = atomicReference;
        a aVar2 = new a(f17153f, f17154g, iVar);
        while (true) {
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != aVar) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            aVar2.a();
        }
    }

    @Override // tk.o
    public final o.c b() {
        return new b(this.f17158c.get());
    }

    @Override // tk.o
    public final void f() {
        AtomicReference<a> atomicReference = this.f17158c;
        a aVar = f17157j;
        a andSet = atomicReference.getAndSet(aVar);
        if (andSet != aVar) {
            andSet.a();
        }
    }
}
