package w4;

import android.os.Process;
import android.os.StrictMode;
import android.support.v4.media.d;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: b */
    public static final long f29737b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f29738c;

    /* renamed from: a */
    public final ExecutorService f29739a;

    /* renamed from: w4.a$a */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC0540a implements ThreadFactory {

        /* renamed from: w4.a$a$a */
        /* loaded from: classes.dex */
        public class C0541a extends Thread {
            public C0541a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new C0541a(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f29740a;

        /* renamed from: b */
        public final String f29741b;

        /* renamed from: c */
        public final c f29742c;

        /* renamed from: d */
        public final boolean f29743d;

        /* renamed from: e */
        public final AtomicInteger f29744e;

        /* renamed from: w4.a$b$a */
        /* loaded from: classes.dex */
        public class RunnableC0542a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f29745a;

            public RunnableC0542a(Runnable runnable) {
                b.this = r1;
                this.f29745a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.f29743d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f29745a.run();
                } catch (Throwable th2) {
                    b.this.f29742c.a(th2);
                }
            }
        }

        public b(ThreadFactoryC0540a threadFactoryC0540a, String str, boolean z10) {
            c.C0543a c0543a = c.f29747a;
            this.f29744e = new AtomicInteger();
            this.f29740a = threadFactoryC0540a;
            this.f29741b = str;
            this.f29742c = c0543a;
            this.f29743d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = this.f29740a.newThread(new RunnableC0542a(runnable));
            StringBuilder a10 = d.a("glide-");
            a10.append(this.f29741b);
            a10.append("-thread-");
            a10.append(this.f29744e.getAndIncrement());
            newThread.setName(a10.toString());
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: a */
        public static final C0543a f29747a = new C0543a();

        /* renamed from: w4.a$c$a */
        /* loaded from: classes.dex */
        public class C0543a implements c {
            @Override // w4.a.c
            public final void a(Throwable th2) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                }
            }
        }

        void a(Throwable th2);
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f29739a = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f29739a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f29739a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f29739a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f29739a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f29739a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f29739a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f29739a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f29739a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f29739a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f29739a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f29739a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f29739a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f29739a.submit(callable);
    }

    public final String toString() {
        return this.f29739a.toString();
    }
}
