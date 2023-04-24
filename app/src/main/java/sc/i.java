package sc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class i extends AtomicLong implements ThreadFactory {

    /* loaded from: classes.dex */
    public static final class a extends Thread {
        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder a10 = android.support.v4.media.d.a("RxBleThread-");
        a10.append(incrementAndGet());
        a aVar = new a(runnable, a10.toString());
        aVar.setPriority(5);
        aVar.setDaemon(true);
        return aVar;
    }
}
