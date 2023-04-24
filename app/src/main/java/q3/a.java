package q3;

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
public abstract class a<V> implements na.a<V> {

    /* renamed from: d */
    public static final boolean f24514d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f24515e = Logger.getLogger(a.class.getName());

    /* renamed from: f */
    public static final AbstractC0443a f24516f;

    /* renamed from: g */
    public static final Object f24517g;

    /* renamed from: a */
    public volatile Object f24518a;

    /* renamed from: b */
    public volatile d f24519b;

    /* renamed from: c */
    public volatile h f24520c;

    /* renamed from: q3.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0443a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c */
        public static final b f24521c;

        /* renamed from: d */
        public static final b f24522d;

        /* renamed from: a */
        public final boolean f24523a;

        /* renamed from: b */
        public final Throwable f24524b;

        static {
            if (a.f24514d) {
                f24522d = null;
                f24521c = null;
                return;
            }
            f24522d = new b(null, false);
            f24521c = new b(null, true);
        }

        public b(Throwable th2, boolean z10) {
            this.f24523a = z10;
            this.f24524b = th2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f24525b = new c(new C0444a());

        /* renamed from: a */
        public final Throwable f24526a;

        /* renamed from: q3.a$c$a */
        /* loaded from: classes.dex */
        public class C0444a extends Throwable {
            public C0444a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th2) {
            boolean z10 = a.f24514d;
            th2.getClass();
            this.f24526a = th2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: d */
        public static final d f24527d = new d(null, null);

        /* renamed from: a */
        public final Runnable f24528a;

        /* renamed from: b */
        public final Executor f24529b;

        /* renamed from: c */
        public d f24530c;

        public d(Runnable runnable, Executor executor) {
            this.f24528a = runnable;
            this.f24529b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends AbstractC0443a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<h, Thread> f24531a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<h, h> f24532b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<a, h> f24533c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<a, d> f24534d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<a, Object> f24535e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f24531a = atomicReferenceFieldUpdater;
            this.f24532b = atomicReferenceFieldUpdater2;
            this.f24533c = atomicReferenceFieldUpdater3;
            this.f24534d = atomicReferenceFieldUpdater4;
            this.f24535e = atomicReferenceFieldUpdater5;
        }

        @Override // q3.a.AbstractC0443a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater = this.f24534d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // q3.a.AbstractC0443a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater = this.f24535e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // q3.a.AbstractC0443a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater = this.f24533c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != hVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // q3.a.AbstractC0443a
        public final void d(h hVar, h hVar2) {
            this.f24532b.lazySet(hVar, hVar2);
        }

        @Override // q3.a.AbstractC0443a
        public final void e(h hVar, Thread thread) {
            this.f24531a.lazySet(hVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class f<V> implements Runnable {

        /* renamed from: a */
        public final a<V> f24536a;

        /* renamed from: b */
        public final na.a<? extends V> f24537b;

        public f(a<V> aVar, na.a<? extends V> aVar2) {
            this.f24536a = aVar;
            this.f24537b = aVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f24536a.f24518a != this) {
                return;
            }
            if (a.f24516f.b(this.f24536a, this, a.f(this.f24537b))) {
                a.c(this.f24536a);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends AbstractC0443a {
        @Override // q3.a.AbstractC0443a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f24519b == dVar) {
                    aVar.f24519b = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // q3.a.AbstractC0443a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f24518a == obj) {
                    aVar.f24518a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // q3.a.AbstractC0443a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f24520c == hVar) {
                    aVar.f24520c = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // q3.a.AbstractC0443a
        public final void d(h hVar, h hVar2) {
            hVar.f24540b = hVar2;
        }

        @Override // q3.a.AbstractC0443a
        public final void e(h hVar, Thread thread) {
            hVar.f24539a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: c */
        public static final h f24538c = new h(0);

        /* renamed from: a */
        public volatile Thread f24539a;

        /* renamed from: b */
        public volatile h f24540b;

        public h() {
            a.f24516f.e(this, Thread.currentThread());
        }

        public h(int i10) {
        }
    }

    static {
        AbstractC0443a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f24516f = gVar;
        if (th != null) {
            f24515e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f24517g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [q3.a$a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [q3.a<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [q3.a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [q3.a, q3.a<V>] */
    public static void c(a<?> aVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = ((a) aVar).f24520c;
            if (f24516f.c((a) aVar, hVar, h.f24538c)) {
                while (hVar != null) {
                    Thread thread = hVar.f24539a;
                    if (thread != null) {
                        hVar.f24539a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f24540b;
                }
                do {
                    dVar = ((a) aVar).f24519b;
                } while (!f24516f.a((a) aVar, dVar, d.f24527d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f24530c;
                    dVar3.f24530c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f24530c;
                    Runnable runnable = dVar2.f24528a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar = fVar.f24536a;
                        if (aVar.f24518a == fVar) {
                            if (f24516f.b(aVar, fVar, f(fVar.f24537b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f24529b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f24515e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object f(na.a<?> aVar) {
        Object obj;
        if (aVar instanceof a) {
            Object obj2 = ((a) aVar).f24518a;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.f24523a) {
                    if (bVar.f24524b != null) {
                        return new b(bVar.f24524b, false);
                    }
                    return b.f24522d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f24514d) & isCancelled) {
            return b.f24522d;
        }
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (CancellationException e10) {
                    if (!isCancelled) {
                        return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
                    }
                    return new b(e10, false);
                } catch (ExecutionException e11) {
                    return new c(e11.getCause());
                } catch (Throwable th2) {
                    return new c(th2);
                }
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th3) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return f24517g;
        }
        return obj;
    }

    @Override // na.a
    public final void a(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        d dVar = this.f24519b;
        if (dVar != d.f24527d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f24530c = dVar;
                if (f24516f.a(this, dVar, dVar2)) {
                    return;
                }
                dVar = this.f24519b;
            } while (dVar != d.f24527d);
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
        Object obj = this.f24518a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = f24514d ? new b(new CancellationException("Future.cancel() was called."), z10) : z10 ? b.f24521c : b.f24522d;
        boolean z11 = false;
        a<V> aVar = this;
        while (true) {
            if (f24516f.b(aVar, obj, bVar)) {
                c(aVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                na.a<? extends V> aVar2 = ((f) obj).f24537b;
                if (!(aVar2 instanceof a)) {
                    aVar2.cancel(z10);
                    return true;
                }
                aVar = (a) aVar2;
                obj = aVar.f24518a;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = aVar.f24518a;
                if (!(obj instanceof f)) {
                    return z11;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V e(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == f24517g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f24526a);
        }
        Throwable th2 = ((b) obj).f24524b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public final String g() {
        String valueOf;
        Object obj = this.f24518a;
        if (obj instanceof f) {
            StringBuilder a10 = android.support.v4.media.d.a("setFuture=[");
            na.a<? extends V> aVar = ((f) obj).f24537b;
            if (aVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(aVar);
            }
            return androidx.activity.e.b(a10, valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            StringBuilder a11 = android.support.v4.media.d.a("remaining delay=[");
            a11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            a11.append(" ms]");
            return a11.toString();
        } else {
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f24518a;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return e(obj2);
        }
        h hVar = this.f24520c;
        if (hVar != h.f24538c) {
            h hVar2 = new h();
            do {
                AbstractC0443a abstractC0443a = f24516f;
                abstractC0443a.d(hVar2, hVar);
                if (abstractC0443a.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f24518a;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return e(obj);
                }
                hVar = this.f24520c;
            } while (hVar != h.f24538c);
            return e(this.f24518a);
        }
        return e(this.f24518a);
    }

    public final void h(h hVar) {
        hVar.f24539a = null;
        while (true) {
            h hVar2 = this.f24520c;
            if (hVar2 == h.f24538c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f24540b;
                if (hVar2.f24539a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f24540b = hVar4;
                    if (hVar3.f24539a == null) {
                        break;
                    }
                } else if (!f24516f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24518a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f24518a;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String sb2;
        String str;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("[status=");
        if (this.f24518a instanceof b) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    sb2 = g();
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
        Object obj = this.f24518a;
        if ((obj != null) && (!(obj instanceof f))) {
            return e(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f24520c;
            if (hVar != h.f24538c) {
                h hVar2 = new h();
                do {
                    AbstractC0443a abstractC0443a = f24516f;
                    abstractC0443a.d(hVar2, hVar);
                    if (abstractC0443a.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f24518a;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return e(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(hVar2);
                    } else {
                        hVar = this.f24520c;
                    }
                } while (hVar != h.f24538c);
                return e(this.f24518a);
            }
            return e(this.f24518a);
        }
        while (nanos > 0) {
            Object obj3 = this.f24518a;
            if ((obj3 != null) && (!(obj3 instanceof f))) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
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
        throw new TimeoutException(android.support.v4.media.a.a(str, " for ", aVar));
    }
}
