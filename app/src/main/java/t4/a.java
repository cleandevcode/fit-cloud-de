package t4;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: t4.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0493a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f27564a;

        public RunnableC0493a(Runnable runnable) {
            this.f27564a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            this.f27564a.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0493a(runnable), "glide-active-resources");
    }
}
