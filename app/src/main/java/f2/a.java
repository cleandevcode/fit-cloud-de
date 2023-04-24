package f2;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import e2.b;
import e8.f;
import f1.n;
import f2.b;
import g8.d;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.c0;

/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* renamed from: g */
    public final Executor f14039g;

    /* renamed from: h */
    public volatile a<D>.RunnableC0247a f14040h;

    /* renamed from: i */
    public volatile a<D>.RunnableC0247a f14041i;

    /* renamed from: f2.a$a */
    /* loaded from: classes.dex */
    public final class RunnableC0247a extends c<Void, Void, D> implements Runnable {

        /* renamed from: h */
        public final CountDownLatch f14042h = new CountDownLatch(1);

        public RunnableC0247a() {
            a.this = r2;
        }

        @Override // f2.c
        public final void a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                a.this.c();
            } catch (n e10) {
                if (this.f14055d.get()) {
                    return;
                }
                throw e10;
            }
        }

        @Override // f2.c
        public final void b(D d10) {
            try {
                a aVar = a.this;
                if (aVar.f14041i == this) {
                    SystemClock.uptimeMillis();
                    aVar.f14041i = null;
                    aVar.b();
                }
            } finally {
                this.f14042h.countDown();
            }
        }

        @Override // f2.c
        public final void c(D d10) {
            try {
                a aVar = a.this;
                if (aVar.f14040h != this) {
                    if (aVar.f14041i == this) {
                        SystemClock.uptimeMillis();
                        aVar.f14041i = null;
                        aVar.b();
                    }
                } else if (!aVar.f14047d) {
                    SystemClock.uptimeMillis();
                    aVar.f14040h = null;
                    b.a<D> aVar2 = aVar.f14045b;
                    if (aVar2 != null) {
                        b.a aVar3 = (b.a) aVar2;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            aVar3.j(d10);
                        } else {
                            aVar3.k(d10);
                        }
                    }
                }
            } finally {
                this.f14042h.countDown();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        ThreadPoolExecutor threadPoolExecutor = c.f14050f;
        this.f14039g = threadPoolExecutor;
    }

    public final void b() {
        if (this.f14041i == null && this.f14040h != null) {
            this.f14040h.getClass();
            a<D>.RunnableC0247a runnableC0247a = this.f14040h;
            Executor executor = this.f14039g;
            if (runnableC0247a.f14054c != 1) {
                int b10 = c0.b(runnableC0247a.f14054c);
                if (b10 != 1) {
                    if (b10 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            runnableC0247a.f14054c = 2;
            runnableC0247a.f14052a.f14062a = null;
            executor.execute(runnableC0247a.f14053b);
        }
    }

    public final void c() {
        f fVar = (f) this;
        Iterator it = fVar.f13496k.iterator();
        if (!it.hasNext()) {
            try {
                fVar.f13495j.tryAcquire(0, 5L, TimeUnit.SECONDS);
                return;
            } catch (InterruptedException e10) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
                Thread.currentThread().interrupt();
                return;
            }
        }
        ((d) it.next()).getClass();
        throw new UnsupportedOperationException();
    }
}
