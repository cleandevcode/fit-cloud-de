package p0;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class b<V> implements na.a<V> {

    /* renamed from: d */
    public static final boolean f23730d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f23731e = Logger.getLogger(b.class.getName());

    /* renamed from: f */
    public static final a f23732f;

    /* renamed from: g */
    public static final Object f23733g;

    /* renamed from: a */
    public volatile Object f23734a;

    /* renamed from: b */
    public volatile d f23735b;

    /* renamed from: c */
    public volatile h f23736c;

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract boolean a(b<?> bVar, d dVar, d dVar2);

        public abstract boolean b(b<?> bVar, Object obj, Object obj2);

        public abstract boolean c(b<?> bVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* renamed from: p0.b$b */
    /* loaded from: classes.dex */
    public static final class C0424b {

        /* renamed from: b */
        public static final C0424b f23737b;

        /* renamed from: c */
        public static final C0424b f23738c;

        /* renamed from: a */
        public final Throwable f23739a;

        static {
            if (b.f23730d) {
                f23738c = null;
                f23737b = null;
                return;
            }
            f23738c = new C0424b(null, false);
            f23737b = new C0424b(null, true);
        }

        public C0424b(Throwable th2, boolean z10) {
            this.f23739a = th2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final Throwable f23740a;

        /* loaded from: classes.dex */
        public static class a extends Throwable {
            public a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new a());
        }

        public c(Throwable th2) {
            boolean z10 = b.f23730d;
            th2.getClass();
            this.f23740a = th2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: d */
        public static final d f23741d = new d(null, null);

        /* renamed from: a */
        public final Runnable f23742a;

        /* renamed from: b */
        public final Executor f23743b;

        /* renamed from: c */
        public d f23744c;

        public d(Runnable runnable, Executor executor) {
            this.f23742a = runnable;
            this.f23743b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<h, Thread> f23745a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<h, h> f23746b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<b, h> f23747c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<b, d> f23748d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<b, Object> f23749e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<b, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<b, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater5) {
            this.f23745a = atomicReferenceFieldUpdater;
            this.f23746b = atomicReferenceFieldUpdater2;
            this.f23747c = atomicReferenceFieldUpdater3;
            this.f23748d = atomicReferenceFieldUpdater4;
            this.f23749e = atomicReferenceFieldUpdater5;
        }

        @Override // p0.b.a
        public final boolean a(b<?> bVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<b, d> atomicReferenceFieldUpdater = this.f23748d;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // p0.b.a
        public final boolean b(b<?> bVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<b, Object> atomicReferenceFieldUpdater = this.f23749e;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // p0.b.a
        public final boolean c(b<?> bVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<b, h> atomicReferenceFieldUpdater = this.f23747c;
            while (!atomicReferenceFieldUpdater.compareAndSet(bVar, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(bVar) != hVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // p0.b.a
        public final void d(h hVar, h hVar2) {
            this.f23746b.lazySet(hVar, hVar2);
        }

        @Override // p0.b.a
        public final void e(h hVar, Thread thread) {
            this.f23745a.lazySet(hVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends a {
        @Override // p0.b.a
        public final boolean a(b<?> bVar, d dVar, d dVar2) {
            synchronized (bVar) {
                if (bVar.f23735b == dVar) {
                    bVar.f23735b = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // p0.b.a
        public final boolean b(b<?> bVar, Object obj, Object obj2) {
            synchronized (bVar) {
                if (bVar.f23734a == obj) {
                    bVar.f23734a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // p0.b.a
        public final boolean c(b<?> bVar, h hVar, h hVar2) {
            synchronized (bVar) {
                if (bVar.f23736c == hVar) {
                    bVar.f23736c = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // p0.b.a
        public final void d(h hVar, h hVar2) {
            hVar.f23752b = hVar2;
        }

        @Override // p0.b.a
        public final void e(h hVar, Thread thread) {
            hVar.f23751a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: c */
        public static final h f23750c = new h(0);

        /* renamed from: a */
        public volatile Thread f23751a;

        /* renamed from: b */
        public volatile h f23752b;

        public h() {
            b.f23732f.e(this, Thread.currentThread());
        }

        public h(int i10) {
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(b.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f23732f = gVar;
        if (th != null) {
            f23731e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f23733g = new Object();
    }

    public static void c(b<?> bVar) {
        h hVar;
        d dVar;
        do {
            hVar = bVar.f23736c;
        } while (!f23732f.c(bVar, hVar, h.f23750c));
        while (hVar != null) {
            Thread thread = hVar.f23751a;
            if (thread != null) {
                hVar.f23751a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f23752b;
        }
        do {
            dVar = bVar.f23735b;
        } while (!f23732f.a(bVar, dVar, d.f23741d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f23744c;
            dVar.f23744c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.f23744c;
            Runnable runnable = dVar2.f23742a;
            if (!(runnable instanceof f)) {
                d(runnable, dVar2.f23743b);
                dVar2 = dVar4;
            } else {
                ((f) runnable).getClass();
                throw null;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f23731e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // na.a
    public final void a(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f23735b;
        if (dVar != d.f23741d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f23744c = dVar;
                if (f23732f.a(this, dVar, dVar2)) {
                    return;
                }
                dVar = this.f23735b;
            } while (dVar != d.f23741d);
            d(runnable, executor);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        V v10;
        String valueOf;
        String str = "]";
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v10 = get();
                    break;
                } catch (CancellationException unused) {
                    str = "CANCELLED";
                    sb2.append(str);
                    return;
                } catch (RuntimeException e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    str = " thrown from get()]";
                    sb2.append(str);
                    return;
                } catch (ExecutionException e11) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e11.getCause());
                    sb2.append(str);
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb2.append("SUCCESS, result=[");
        if (v10 == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(v10);
        }
        sb2.append(valueOf);
        sb2.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f23734a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        C0424b c0424b = f23730d ? new C0424b(new CancellationException("Future.cancel() was called."), z10) : z10 ? C0424b.f23737b : C0424b.f23738c;
        while (!f23732f.b(this, obj, c0424b)) {
            obj = this.f23734a;
            if (!(obj instanceof f)) {
                return false;
            }
        }
        c(this);
        if (obj instanceof f) {
            ((f) obj).getClass();
            throw null;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V e(Object obj) {
        if (!(obj instanceof C0424b)) {
            if (!(obj instanceof c)) {
                if (obj == f23733g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f23740a);
        }
        Throwable th2 = ((C0424b) obj).f23739a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public String f() {
        Object obj = this.f23734a;
        if (obj instanceof f) {
            StringBuilder a10 = android.support.v4.media.d.a("setFuture=[");
            ((f) obj).getClass();
            a10.append("null");
            a10.append("]");
            return a10.toString();
        } else if (this instanceof ScheduledFuture) {
            StringBuilder a11 = android.support.v4.media.d.a("remaining delay=[");
            a11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            a11.append(" ms]");
            return a11.toString();
        } else {
            return null;
        }
    }

    public final void g(h hVar) {
        hVar.f23751a = null;
        while (true) {
            h hVar2 = this.f23736c;
            if (hVar2 == h.f23750c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f23752b;
                if (hVar2.f23751a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f23752b = hVar4;
                    if (hVar3.f23751a == null) {
                        break;
                    }
                } else if (!f23732f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f23734a;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return e(obj2);
        }
        h hVar = this.f23736c;
        if (hVar != h.f23750c) {
            h hVar2 = new h();
            do {
                a aVar = f23732f;
                aVar.d(hVar2, hVar);
                if (aVar.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f23734a;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return e(obj);
                }
                hVar = this.f23736c;
            } while (hVar != h.f23750c);
            return e(this.f23734a);
        }
        return e(this.f23734a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23734a instanceof C0424b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f23734a;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String sb2;
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("[status=");
        if (this.f23734a instanceof C0424b) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    sb2 = f();
                } catch (RuntimeException e10) {
                    StringBuilder a10 = android.support.v4.media.d.a("Exception thrown from implementation: ");
                    a10.append(e10.getClass());
                    sb2 = a10.toString();
                }
                if (sb2 != null && !sb2.isEmpty()) {
                    p0.a.a(sb3, "PENDING, info=[", sb2, "]");
                    sb3.append("]");
                    return sb3.toString();
                }
                str = isDone() ? "PENDING" : "PENDING";
            }
            b(sb3);
            sb3.append("]");
            return sb3.toString();
        }
        sb3.append(str);
        sb3.append("]");
        return sb3.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f23734a;
        if ((obj != null) && (!(obj instanceof f))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f23736c;
            if (hVar != h.f23750c) {
                h hVar2 = new h();
                do {
                    a aVar = f23732f;
                    aVar.d(hVar2, hVar);
                    if (aVar.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f23734a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(hVar2);
                    } else {
                        hVar = this.f23736c;
                    }
                } while (hVar != h.f23750c);
                return e(this.f23734a);
            }
            return e(this.f23734a);
        }
        while (nanos > 0) {
            Object obj3 = this.f23734a;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String bVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String b10 = a.b.b(str, " (plus ");
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            boolean z10 = i10 == 0 || nanos2 > 1000;
            if (i10 > 0) {
                String str2 = b10 + convert + " " + lowerCase;
                if (z10) {
                    str2 = a.b.b(str2, ",");
                }
                b10 = a.b.b(str2, " ");
            }
            if (z10) {
                b10 = b10 + nanos2 + " nanoseconds ";
            }
            str = a.b.b(b10, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(a.b.b(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(android.support.v4.media.a.a(str, " for ", bVar));
    }
}
