package il;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import yk.a;

/* loaded from: classes2.dex */
public abstract class a extends AtomicReference<Future<?>> implements uk.c {

    /* renamed from: d */
    public static final FutureTask<Void> f17104d;

    /* renamed from: e */
    public static final FutureTask<Void> f17105e;

    /* renamed from: a */
    public final Runnable f17106a;

    /* renamed from: b */
    public final boolean f17107b;

    /* renamed from: c */
    public Thread f17108c;

    static {
        a.e eVar = yk.a.f31787b;
        f17104d = new FutureTask<>(eVar, null);
        f17105e = new FutureTask<>(eVar, null);
    }

    public a(Runnable runnable, boolean z10) {
        this.f17106a = runnable;
        this.f17107b = z10;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        boolean z10;
        do {
            future2 = get();
            if (future2 != f17104d) {
                if (future2 == f17105e) {
                    if (this.f17108c == Thread.currentThread()) {
                        z10 = false;
                    } else {
                        z10 = this.f17107b;
                    }
                    future.cancel(z10);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // uk.c
    public final void c() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f17104d || future == (futureTask = f17105e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f17108c == Thread.currentThread() ? false : this.f17107b);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Future<?> future = get();
        if (future == f17104d) {
            str = "Finished";
        } else if (future == f17105e) {
            str = "Disposed";
        } else if (this.f17108c != null) {
            StringBuilder a10 = android.support.v4.media.d.a("Running on ");
            a10.append(this.f17108c);
            str = a10.toString();
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
