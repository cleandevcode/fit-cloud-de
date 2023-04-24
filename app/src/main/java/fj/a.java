package fj;

import gm.l;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* renamed from: a */
    public final String f14300a;

    /* renamed from: b */
    public final AtomicInteger f14301b = new AtomicInteger(1);

    public a(String str) {
        this.f14300a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        l.f(runnable, "r");
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Thread thread = new Thread(threadGroup, runnable, this.f14300a + "-thread-" + this.f14301b.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
