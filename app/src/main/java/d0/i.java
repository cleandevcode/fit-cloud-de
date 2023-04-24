package d0;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import y.u0;

/* loaded from: classes.dex */
public abstract class i<V> implements na.a<V> {

    /* loaded from: classes.dex */
    public static class a<V> extends i<V> {

        /* renamed from: a */
        public final Throwable f12586a;

        public a(Exception exc) {
            this.f12586a = exc;
        }

        @Override // d0.i, java.util.concurrent.Future
        public final V get() {
            throw new ExecutionException(this.f12586a);
        }

        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f12586a + "]]";
        }
    }

    /* loaded from: classes.dex */
    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(RejectedExecutionException rejectedExecutionException) {
            super(rejectedExecutionException);
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* loaded from: classes.dex */
    public static final class c<V> extends i<V> {

        /* renamed from: b */
        public static final c f12587b = new c(null);

        /* renamed from: a */
        public final V f12588a;

        public c(V v10) {
            this.f12588a = v10;
        }

        @Override // d0.i, java.util.concurrent.Future
        public final V get() {
            return this.f12588a;
        }

        public final String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f12588a + "]]";
        }
    }

    @Override // na.a
    public final void a(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            u0.c("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
