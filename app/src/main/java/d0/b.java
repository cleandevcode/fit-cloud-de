package d0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p0.c;

/* loaded from: classes.dex */
public final class b<I, O> extends d<O> implements Runnable {

    /* renamed from: c */
    public d0.a<? super I, ? extends O> f12569c;

    /* renamed from: d */
    public final LinkedBlockingQueue f12570d = new LinkedBlockingQueue(1);

    /* renamed from: e */
    public final CountDownLatch f12571e = new CountDownLatch(1);

    /* renamed from: f */
    public na.a<? extends I> f12572f;

    /* renamed from: g */
    public volatile na.a<? extends O> f12573g;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ na.a f12574a;

        public a(na.a aVar) {
            b.this = r1;
            this.f12574a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    b bVar = b.this;
                    Object d10 = f.d(this.f12574a);
                    c.a<V> aVar = bVar.f12577b;
                    if (aVar != 0) {
                        aVar.a(d10);
                    }
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                    b.this.f12573g = null;
                    return;
                } catch (ExecutionException e10) {
                    b.this.c(e10.getCause());
                }
                b.this.f12573g = null;
            } catch (Throwable th2) {
                b.this.f12573g = null;
                throw th2;
            }
        }
    }

    public b(d0.a<? super I, ? extends O> aVar, na.a<? extends I> aVar2) {
        this.f12569c = aVar;
        aVar2.getClass();
        this.f12572f = aVar2;
    }

    public static Object e(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z10 = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // d0.d, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11 = false;
        if (!super.cancel(z10)) {
            return false;
        }
        while (true) {
            try {
                this.f12570d.put(Boolean.valueOf(z10));
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        na.a<? extends I> aVar = this.f12572f;
        if (aVar != null) {
            aVar.cancel(z10);
        }
        na.a<? extends O> aVar2 = this.f12573g;
        if (aVar2 != null) {
            aVar2.cancel(z10);
        }
        return true;
    }

    @Override // d0.d, java.util.concurrent.Future
    public final O get() {
        if (!isDone()) {
            na.a<? extends I> aVar = this.f12572f;
            if (aVar != null) {
                aVar.get();
            }
            this.f12571e.await();
            na.a<? extends O> aVar2 = this.f12573g;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return (O) super.get();
    }

    @Override // d0.d, java.util.concurrent.Future
    public final O get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            na.a<? extends I> aVar = this.f12572f;
            if (aVar != null) {
                long nanoTime = System.nanoTime();
                aVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (!this.f12571e.await(j10, timeUnit)) {
                throw new TimeoutException();
            }
            j10 -= Math.max(0L, System.nanoTime() - nanoTime2);
            na.a<? extends O> aVar2 = this.f12573g;
            if (aVar2 != null) {
                aVar2.get(j10, timeUnit);
            }
        }
        return (O) super.get(j10, timeUnit);
    }

    @Override // java.lang.Runnable
    public final void run() {
        na.a<? extends O> apply;
        try {
            try {
                try {
                    apply = this.f12569c.apply(f.d(this.f12572f));
                    this.f12573g = apply;
                } catch (Error e10) {
                    e = e10;
                    c(e);
                    this.f12569c = null;
                    this.f12572f = null;
                    this.f12571e.countDown();
                    return;
                } catch (UndeclaredThrowableException e11) {
                    e = e11.getCause();
                    c(e);
                    this.f12569c = null;
                    this.f12572f = null;
                    this.f12571e.countDown();
                    return;
                } catch (Exception e12) {
                    e = e12;
                    c(e);
                    this.f12569c = null;
                    this.f12572f = null;
                    this.f12571e.countDown();
                    return;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e13) {
                c(e13.getCause());
            }
            if (!isCancelled()) {
                apply.a(new a(apply), o8.b.i());
                this.f12569c = null;
                this.f12572f = null;
                this.f12571e.countDown();
                return;
            }
            apply.cancel(((Boolean) e(this.f12570d)).booleanValue());
            this.f12573g = null;
            this.f12569c = null;
            this.f12572f = null;
            this.f12571e.countDown();
        } catch (Throwable th2) {
            this.f12569c = null;
            this.f12572f = null;
            this.f12571e.countDown();
            throw th2;
        }
    }
}
