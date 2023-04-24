package com.mob.tools.utils;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mob.tools.MobLog;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ExecutorDispatcher implements com.mob.tools.utils.a {

    /* renamed from: b */
    private static volatile ExecutorDispatcher f9317b;

    /* renamed from: a */
    private final com.mob.tools.utils.a f9318a = new a();

    /* loaded from: classes.dex */
    public static abstract class SafeRunnable implements Runnable {
        public void afterRun() {
        }

        public void beforeRun() {
        }

        public void handleException(Throwable th2) {
        }

        public String name() {
            return "";
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String name = name();
                if (!TextUtils.isEmpty(name)) {
                    Thread.currentThread().setName(name);
                }
                beforeRun();
                safeRun();
                afterRun();
            } catch (Throwable th2) {
                try {
                    handleException(th2);
                } catch (Throwable unused) {
                }
            }
        }

        public abstract void safeRun();
    }

    /* loaded from: classes.dex */
    public static final class a implements com.mob.tools.utils.a {

        /* renamed from: a */
        private final ExecutorService f9319a;

        /* renamed from: b */
        private final ExecutorService f9320b;

        /* renamed from: c */
        private final ExecutorService f9321c;

        /* renamed from: d */
        private final Handler f9322d;

        private a() {
            this.f9322d = new Handler(Looper.getMainLooper());
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.f9319a = threadPoolExecutor;
            this.f9320b = new ThreadPoolExecutor(2, 2, 10L, timeUnit, new LinkedBlockingQueue());
            this.f9321c = Executors.newSingleThreadExecutor();
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeDelayed(final T t10, long j10) {
            if (t10 == null) {
                return;
            }
            try {
                this.f9322d.postDelayed(new SafeRunnable() { // from class: com.mob.tools.utils.ExecutorDispatcher.a.1
                    @Override // com.mob.tools.utils.ExecutorDispatcher.SafeRunnable
                    public void safeRun() {
                        a.this.executeImmediately(t10);
                    }
                }, j10);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeDuctile(T t10) {
            try {
                this.f9320b.execute(t10);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeImmediately(T t10) {
            try {
                this.f9319a.execute(t10);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }

        @Override // com.mob.tools.utils.a
        public <T extends SafeRunnable> void executeSerial(T t10) {
            try {
                this.f9321c.execute(t10);
            } catch (Throwable th2) {
                MobLog.getInstance().d(th2);
            }
        }
    }

    public static com.mob.tools.utils.a getInstance() {
        if (f9317b == null) {
            synchronized (ExecutorDispatcher.class) {
                if (f9317b == null) {
                    f9317b = new ExecutorDispatcher();
                }
            }
        }
        return f9317b;
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeDelayed(T t10, long j10) {
        if (t10 == null) {
            return;
        }
        try {
            if (j10 <= 0) {
                this.f9318a.executeDuctile(t10);
            } else {
                this.f9318a.executeDelayed(t10, j10);
            }
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeDuctile(T t10) {
        if (t10 == null) {
            return;
        }
        try {
            this.f9318a.executeDuctile(t10);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeImmediately(T t10) {
        if (t10 == null) {
            return;
        }
        try {
            this.f9318a.executeImmediately(t10);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    @Override // com.mob.tools.utils.a
    public <T extends SafeRunnable> void executeSerial(T t10) {
        if (t10 == null) {
            return;
        }
        try {
            this.f9318a.executeSerial(t10);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }
}
