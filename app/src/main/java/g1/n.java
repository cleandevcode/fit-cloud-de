package g1;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class n implements ThreadFactory {

    /* renamed from: a */
    public String f14837a = "fonts-androidx";

    /* renamed from: b */
    public int f14838b = 10;

    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: a */
        public final int f14839a;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f14839a = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f14839a);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f14837a, this.f14838b);
    }
}
