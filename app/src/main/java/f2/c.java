package f2;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c<Params, Progress, Result> {

    /* renamed from: f */
    public static final ThreadPoolExecutor f14050f;

    /* renamed from: g */
    public static e f14051g;

    /* renamed from: a */
    public final b f14052a;

    /* renamed from: b */
    public final C0248c f14053b;

    /* renamed from: c */
    public volatile int f14054c = 1;

    /* renamed from: d */
    public final AtomicBoolean f14055d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f14056e = new AtomicBoolean();

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f14057a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            StringBuilder a10 = android.support.v4.media.d.a("ModernAsyncTask #");
            a10.append(this.f14057a.getAndIncrement());
            return new Thread(runnable, a10.toString());
        }
    }

    /* loaded from: classes.dex */
    public class b extends f<Params, Result> {
        public b() {
            c.this = r1;
        }

        @Override // java.util.concurrent.Callable
        public final Result call() {
            c.this.f14056e.set(true);
            try {
                Process.setThreadPriority(10);
                c.this.a(this.f14062a);
                Binder.flushPendingCommands();
                return null;
            } finally {
            }
        }
    }

    /* renamed from: f2.c$c */
    /* loaded from: classes.dex */
    public class C0248c extends FutureTask<Result> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0248c(b bVar) {
            super(bVar);
            c.this = r1;
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            try {
                Result result = get();
                c cVar = c.this;
                if (!cVar.f14056e.get()) {
                    cVar.d(result);
                }
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c cVar2 = c.this;
                if (!cVar2.f14056e.get()) {
                    cVar2.d(null);
                }
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d<Data> {

        /* renamed from: a */
        public final c f14060a;

        /* renamed from: b */
        public final Data[] f14061b;

        public d(c cVar, Data... dataArr) {
            this.f14060a = cVar;
            this.f14061b = dataArr;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    dVar.f14060a.getClass();
                    return;
                }
                return;
            }
            c cVar = dVar.f14060a;
            Object obj = dVar.f14061b[0];
            if (cVar.f14055d.get()) {
                cVar.b(obj);
            } else {
                cVar.c(obj);
            }
            cVar.f14054c = 3;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        public Params[] f14062a;
    }

    static {
        a aVar = new a();
        f14050f = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
    }

    public c() {
        b bVar = new b();
        this.f14052a = bVar;
        this.f14053b = new C0248c(bVar);
    }

    public abstract void a(Object... objArr);

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public final void d(Object obj) {
        e eVar;
        synchronized (c.class) {
            if (f14051g == null) {
                f14051g = new e();
            }
            eVar = f14051g;
        }
        eVar.obtainMessage(1, new d(this, obj)).sendToTarget();
    }
}
