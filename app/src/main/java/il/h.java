package il;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tk.o;

/* loaded from: classes2.dex */
public class h extends o.c {

    /* renamed from: a */
    public final ScheduledThreadPoolExecutor f17172a;

    /* renamed from: b */
    public volatile boolean f17173b;

    public h(ThreadFactory threadFactory) {
        boolean z10 = m.f17182a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(m.f17182a);
        this.f17172a = scheduledThreadPoolExecutor;
    }

    @Override // tk.o.c
    public final uk.c a(Runnable runnable) {
        return b(runnable, 0L, null);
    }

    @Override // tk.o.c
    public final uk.c b(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f17173b ? xk.c.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // uk.c
    public final void c() {
        if (this.f17173b) {
            return;
        }
        this.f17173b = true;
        this.f17172a.shutdownNow();
    }

    public final l e(Runnable runnable, long j10, TimeUnit timeUnit, uk.d dVar) {
        Future<?> schedule;
        Objects.requireNonNull(runnable, "run is null");
        l lVar = new l(runnable, dVar);
        if (dVar != null && !dVar.b(lVar)) {
            return lVar;
        }
        try {
            if (j10 <= 0) {
                schedule = this.f17172a.submit((Callable) lVar);
            } else {
                schedule = this.f17172a.schedule((Callable) lVar, j10, timeUnit);
            }
            lVar.a(schedule);
        } catch (RejectedExecutionException e10) {
            if (dVar != null) {
                dVar.a(lVar);
            }
            ol.a.a(e10);
        }
        return lVar;
    }
}
