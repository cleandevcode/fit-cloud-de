package yb;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b */
    public static e0 f31289b;

    /* renamed from: c */
    public static e0 f31290c;

    /* renamed from: d */
    public static e0 f31291d;

    /* renamed from: a */
    public ThreadPoolExecutor f31292a = new ThreadPoolExecutor(0, 1, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(5000), new b());

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a */
        public Runnable f31293a;

        public a(Runnable runnable) {
            this.f31293a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Runnable runnable = this.f31293a;
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Exception unused) {
                    m2.f.e("hmsSdk", "InnerTask : Exception has happened,From internal operations!");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements ThreadFactory {

        /* renamed from: d */
        public static final AtomicInteger f31294d = new AtomicInteger(1);

        /* renamed from: a */
        public final ThreadGroup f31295a;

        /* renamed from: b */
        public final AtomicInteger f31296b = new AtomicInteger(1);

        /* renamed from: c */
        public final String f31297c;

        public b() {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.f31295a = threadGroup;
            StringBuilder a10 = android.support.v4.media.d.a("FormalHASDK-base-");
            a10.append(f31294d.getAndIncrement());
            this.f31297c = a10.toString();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f31295a;
            return new Thread(threadGroup, runnable, this.f31297c + this.f31296b.getAndIncrement(), 0L);
        }
    }

    static {
        new e0();
        new e0();
        f31289b = new e0();
        f31290c = new e0();
        f31291d = new e0();
    }

    public final void a(d0 d0Var) {
        try {
            this.f31292a.execute(new a(d0Var));
        } catch (RejectedExecutionException unused) {
            m2.f.e("hmsSdk", "addToQueue() Exception has happened!Form rejected execution");
        }
    }
}
