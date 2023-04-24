package f3;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import pm.g1;
import pm.j1;
import q3.a;

/* loaded from: classes.dex */
public final class l<R> implements na.a<R> {

    /* renamed from: a */
    public final g1 f14091a;

    /* renamed from: b */
    public final q3.c<R> f14092b;

    public l(j1 j1Var) {
        q3.c<R> cVar = new q3.c<>();
        this.f14091a = j1Var;
        this.f14092b = cVar;
        j1Var.k(new k(this));
    }

    @Override // na.a
    public final void a(Runnable runnable, Executor executor) {
        this.f14092b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f14092b.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        return this.f14092b.get();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j10, TimeUnit timeUnit) {
        return this.f14092b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14092b.f24518a instanceof a.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14092b.isDone();
    }
}
