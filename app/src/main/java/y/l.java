package y;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: c */
    public static final a f30728c = new a();

    /* renamed from: a */
    public final Object f30729a = new Object();

    /* renamed from: b */
    public ThreadPoolExecutor f30730b;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f30731a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f30731a.getAndIncrement())));
            return thread;
        }
    }

    public l() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f30728c);
        threadPoolExecutor.setRejectedExecutionHandler(new k());
        this.f30730b = threadPoolExecutor;
    }

    public final void a(a0.z zVar) {
        ThreadPoolExecutor threadPoolExecutor;
        zVar.getClass();
        synchronized (this.f30729a) {
            try {
                if (this.f30730b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f30728c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new k());
                    this.f30730b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f30730b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int max = Math.max(1, zVar.a().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f30729a) {
            this.f30730b.execute(runnable);
        }
    }
}
