package il;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class l extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, uk.c {

    /* renamed from: b */
    public static final Object f17177b = new Object();

    /* renamed from: c */
    public static final Object f17178c = new Object();

    /* renamed from: d */
    public static final Object f17179d = new Object();

    /* renamed from: e */
    public static final Object f17180e = new Object();

    /* renamed from: a */
    public final Runnable f17181a;

    public l(Runnable runnable, uk.d dVar) {
        super(3);
        this.f17181a = runnable;
        lazySet(0, dVar);
    }

    public final void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f17180e) {
                return;
            }
            if (obj == f17178c) {
                future.cancel(false);
                return;
            } else if (obj == f17179d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // uk.c
    public final void c() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f17180e || obj5 == (obj3 = f17178c) || obj5 == (obj4 = f17179d)) {
                break;
            }
            boolean z10 = get(2) != Thread.currentThread();
            if (z10) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z10);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f17180e || obj == (obj2 = f17177b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((uk.d) obj).d(this);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f17181a.run();
            Object obj3 = get(0);
            if (obj3 != f17177b && compareAndSet(0, obj3, f17180e) && obj3 != null) {
                ((uk.d) obj3).d(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f17178c || obj2 == f17179d) {
                    break;
                }
            } while (!compareAndSet(1, obj2, f17180e));
            lazySet(2, null);
        } catch (Throwable th2) {
            try {
                ol.a.a(th2);
                throw th2;
            } catch (Throwable th3) {
                Object obj4 = get(0);
                if (obj4 != f17177b && compareAndSet(0, obj4, f17180e) && obj4 != null) {
                    ((uk.d) obj4).d(this);
                }
                do {
                    obj = get(1);
                    if (obj == f17178c || obj == f17179d) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f17180e));
                lazySet(2, null);
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public final String toString() {
        String a10;
        Object obj = get(1);
        if (obj == f17180e) {
            a10 = "Finished";
        } else if (obj == f17178c) {
            a10 = "Disposed(Sync)";
        } else if (obj == f17179d) {
            a10 = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            if (obj2 == null) {
                a10 = "Waiting";
            } else {
                a10 = g4.g.a("Running on ", obj2);
            }
        }
        return l.class.getSimpleName() + "[" + a10 + "]";
    }
}
