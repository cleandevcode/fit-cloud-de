package com.mob.commons;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a */
    public static final String f8514a;

    /* renamed from: b */
    public static final String f8515b;

    /* renamed from: c */
    public static final ThreadPoolExecutor f8516c;

    /* renamed from: d */
    public static final ThreadPoolExecutor f8517d;

    /* renamed from: e */
    public static final ExecutorService f8518e;

    /* renamed from: f */
    public static final ExecutorService f8519f;

    /* renamed from: g */
    public static final ExecutorService f8520g;

    /* loaded from: classes.dex */
    public static class a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            try {
                com.mob.commons.a.d.a().c(500L, runnable);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f8521a = new AtomicInteger(1);

        /* renamed from: b */
        private final ThreadGroup f8522b;

        /* renamed from: c */
        private final AtomicInteger f8523c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f8524d;

        public b(int i10) {
            String str;
            SecurityManager securityManager = System.getSecurityManager();
            this.f8522b = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            if (TextUtils.isEmpty("M-")) {
                str = n.b("005d8dbdbdcgh") + f8521a.getAndIncrement() + n.b("008*gh*cbVcg'hEce9g]gh");
            } else {
                str = u.f8515b + i10 + "-" + f8521a.getAndIncrement() + "-";
            }
            this.f8524d = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f8522b;
            Thread thread = new Thread(threadGroup, runnable, this.f8524d + this.f8523c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    static {
        StringBuilder a10 = android.support.v4.media.d.a("M-");
        a10.append(n.b("0020gcgh"));
        f8514a = a10.toString();
        StringBuilder a11 = android.support.v4.media.d.a("M-");
        a11.append(n.b("003 fgdjgh"));
        f8515b = a11.toString();
        int max = Math.max(2, 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f8516c = new ThreadPoolExecutor(2, max, 60L, timeUnit, new SynchronousQueue(), new b(0), new a());
        f8517d = new ThreadPoolExecutor(1, 1, 120L, timeUnit, new LinkedBlockingQueue(), new b(1));
        f8518e = Executors.newCachedThreadPool(new b(2));
        f8519f = Executors.newCachedThreadPool(new b(3));
        f8520g = Executors.newCachedThreadPool(new b(4));
    }
}
