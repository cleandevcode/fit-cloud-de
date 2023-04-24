package il;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class n extends tk.o {

    /* renamed from: d */
    public static final i f17183d;

    /* renamed from: e */
    public static final ScheduledExecutorService f17184e;

    /* renamed from: c */
    public final AtomicReference<ScheduledExecutorService> f17185c;

    /* loaded from: classes2.dex */
    public static final class a extends o.c {

        /* renamed from: a */
        public final ScheduledExecutorService f17186a;

        /* renamed from: b */
        public final uk.b f17187b = new uk.b();

        /* renamed from: c */
        public volatile boolean f17188c;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f17186a = scheduledExecutorService;
        }

        @Override // tk.o.c
        public final uk.c b(Runnable runnable, long j10, TimeUnit timeUnit) {
            Future<?> schedule;
            xk.c cVar = xk.c.INSTANCE;
            if (this.f17188c) {
                return cVar;
            }
            Objects.requireNonNull(runnable, "run is null");
            l lVar = new l(runnable, this.f17187b);
            this.f17187b.b(lVar);
            try {
                if (j10 <= 0) {
                    schedule = this.f17186a.submit((Callable) lVar);
                } else {
                    schedule = this.f17186a.schedule((Callable) lVar, j10, timeUnit);
                }
                lVar.a(schedule);
                return lVar;
            } catch (RejectedExecutionException e10) {
                c();
                ol.a.a(e10);
                return cVar;
            }
        }

        @Override // uk.c
        public final void c() {
            if (this.f17188c) {
                return;
            }
            this.f17188c = true;
            this.f17187b.c();
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f17184e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f17183d = new i(true, "RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())));
    }

    public n() {
        this(f17183d);
    }

    public n(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f17185c = atomicReference;
        boolean z10 = m.f17182a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(m.f17182a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // tk.o
    public final o.c b() {
        return new a(this.f17185c.get());
    }

    @Override // tk.o
    public final uk.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        Future<?> schedule;
        Objects.requireNonNull(runnable, "run is null");
        k kVar = new k(runnable, true);
        try {
            if (j10 <= 0) {
                schedule = this.f17185c.get().submit(kVar);
            } else {
                schedule = this.f17185c.get().schedule(kVar, j10, timeUnit);
            }
            kVar.a(schedule);
            return kVar;
        } catch (RejectedExecutionException e10) {
            ol.a.a(e10);
            return xk.c.INSTANCE;
        }
    }

    @Override // tk.o
    public final uk.c e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Future<?> schedule;
        xk.c cVar = xk.c.INSTANCE;
        if (j11 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f17185c.get();
            e eVar = new e(runnable, scheduledExecutorService);
            try {
                if (j10 <= 0) {
                    schedule = scheduledExecutorService.submit(eVar);
                } else {
                    schedule = scheduledExecutorService.schedule(eVar, j10, timeUnit);
                }
                eVar.a(schedule);
                return eVar;
            } catch (RejectedExecutionException e10) {
                ol.a.a(e10);
                return cVar;
            }
        }
        j jVar = new j(runnable, true);
        try {
            jVar.a(this.f17185c.get().scheduleAtFixedRate(jVar, j10, j11, timeUnit));
            return jVar;
        } catch (RejectedExecutionException e11) {
            ol.a.a(e11);
            return cVar;
        }
    }

    @Override // tk.o
    public final void f() {
        AtomicReference<ScheduledExecutorService> atomicReference = this.f17185c;
        ScheduledExecutorService scheduledExecutorService = f17184e;
        ScheduledExecutorService andSet = atomicReference.getAndSet(scheduledExecutorService);
        if (andSet != scheduledExecutorService) {
            andSet.shutdownNow();
        }
    }
}
