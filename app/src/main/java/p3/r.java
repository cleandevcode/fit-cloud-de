package p3;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e */
    public static final String f23843e = f3.m.e("WorkTimer");

    /* renamed from: a */
    public final ScheduledExecutorService f23844a;

    /* renamed from: b */
    public final HashMap f23845b;

    /* renamed from: c */
    public final HashMap f23846c;

    /* renamed from: d */
    public final Object f23847d;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public int f23848a = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder a10 = android.support.v4.media.d.a("WorkManager-WorkTimer-thread-");
            a10.append(this.f23848a);
            newThread.setName(a10.toString());
            this.f23848a++;
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a */
        public final r f23849a;

        /* renamed from: b */
        public final String f23850b;

        public c(r rVar, String str) {
            this.f23849a = rVar;
            this.f23850b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f23849a.f23847d) {
                if (((c) this.f23849a.f23845b.remove(this.f23850b)) != null) {
                    b bVar = (b) this.f23849a.f23846c.remove(this.f23850b);
                    if (bVar != null) {
                        bVar.a(this.f23850b);
                    }
                } else {
                    f3.m.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f23850b), new Throwable[0]);
                }
            }
        }
    }

    public r() {
        a aVar = new a();
        this.f23845b = new HashMap();
        this.f23846c = new HashMap();
        this.f23847d = new Object();
        this.f23844a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public final void a(String str, b bVar) {
        synchronized (this.f23847d) {
            f3.m.c().a(f23843e, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f23845b.put(str, cVar);
            this.f23846c.put(str, bVar);
            this.f23844a.schedule(cVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f23847d) {
            if (((c) this.f23845b.remove(str)) != null) {
                f3.m.c().a(f23843e, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f23846c.remove(str);
            }
        }
    }
}
