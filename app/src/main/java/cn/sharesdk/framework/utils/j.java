package cn.sharesdk.framework.utils;

import android.text.TextUtils;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    public static ThreadPoolExecutor f5317a;

    /* renamed from: b */
    private static ScheduledExecutorService f5318b = Executors.newSingleThreadScheduledExecutor();

    /* loaded from: classes.dex */
    public static abstract class a implements Runnable {
        public abstract void a();

        public void a(Throwable th2) {
        }

        public String b() {
            return "";
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!TextUtils.isEmpty(b())) {
                    Thread.currentThread().setName(b());
                }
                a();
            } catch (Throwable th2) {
                try {
                    a(th2);
                } catch (Throwable unused) {
                }
                SSDKLog.b().d(th2);
            }
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 3L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        f5317a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static <T extends a> void a(T t10) {
        try {
            f5318b.execute(t10);
        } catch (Throwable th2) {
            SSDKLog.b().d(th2);
        }
    }

    public static void a(Runnable runnable) {
        try {
            f5317a.execute(runnable);
        } catch (Throwable th2) {
            SSDKLog.b().d(th2);
        }
    }
}
