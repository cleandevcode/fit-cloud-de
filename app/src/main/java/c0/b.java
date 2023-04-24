package c0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d0.i;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p0.c;

/* loaded from: classes.dex */
public final class b extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a */
    public final Handler f4500a;

    /* loaded from: classes.dex */
    public class a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        public final ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return o8.b.p();
            }
            if (Looper.myLooper() != null) {
                return new b(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: c0.b$b */
    /* loaded from: classes.dex */
    public class CallableC0066b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Runnable f4501a;

        public CallableC0066b(Runnable runnable) {
            this.f4501a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            this.f4501a.run();
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a */
        public final AtomicReference<c.a<V>> f4502a = new AtomicReference<>(null);

        /* renamed from: b */
        public final long f4503b;

        /* renamed from: c */
        public final Callable<V> f4504c;

        /* renamed from: d */
        public final c.d f4505d;

        /* loaded from: classes.dex */
        public class a implements c.InterfaceC0425c<V> {

            /* renamed from: a */
            public final /* synthetic */ Handler f4506a;

            /* renamed from: b */
            public final /* synthetic */ Callable f4507b;

            public a(Handler handler, Callable callable) {
                c.this = r1;
                this.f4506a = handler;
                this.f4507b = callable;
            }

            @Override // p0.c.InterfaceC0425c
            public final String g(c.a aVar) {
                c0.c cVar = new c0.c(this);
                c0.a i10 = o8.b.i();
                p0.d<Void> dVar = aVar.f23755c;
                if (dVar != null) {
                    dVar.a(cVar, i10);
                }
                c.this.f4502a.set(aVar);
                return "HandlerScheduledFuture-" + this.f4507b.toString();
            }
        }

        public c(Handler handler, long j10, Callable<V> callable) {
            this.f4503b = j10;
            this.f4504c = callable;
            this.f4505d = p0.c.a(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return this.f4505d.cancel(z10);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public final V get() {
            return (V) this.f4505d.get();
        }

        @Override // java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) this.f4505d.f23758b.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f4503b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.f4505d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.f4505d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public final boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public final void run() {
            c.a<V> andSet = this.f4502a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.a(this.f4504c.call());
                } catch (Exception e10) {
                    andSet.b(e10);
                }
            }
        }
    }

    static {
        new a();
    }

    public b(Handler handler) {
        this.f4500a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.f4500a.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.f4500a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new CallableC0066b(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j10, timeUnit) + SystemClock.uptimeMillis();
        c cVar = new c(this.f4500a, convert, callable);
        if (this.f4500a.postAtTime(cVar, convert)) {
            return cVar;
        }
        return new i.b(new RejectedExecutionException(this.f4500a + " is shutting down"));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }
}
