package tk;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a */
    public static boolean f28270a = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* renamed from: b */
    public static final long f28271b;

    /* loaded from: classes2.dex */
    public static final class a implements uk.c, Runnable {

        /* renamed from: a */
        public final Runnable f28272a;

        /* renamed from: b */
        public final c f28273b;

        /* renamed from: c */
        public Thread f28274c;

        public a(Runnable runnable, c cVar) {
            this.f28272a = runnable;
            this.f28273b = cVar;
        }

        @Override // uk.c
        public final void c() {
            if (this.f28274c == Thread.currentThread()) {
                c cVar = this.f28273b;
                if (cVar instanceof il.h) {
                    il.h hVar = (il.h) cVar;
                    if (!hVar.f17173b) {
                        hVar.f17173b = true;
                        hVar.f17172a.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f28273b.c();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f28274c = Thread.currentThread();
            try {
                this.f28272a.run();
            } finally {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements uk.c, Runnable {

        /* renamed from: a */
        public final Runnable f28275a;

        /* renamed from: b */
        public final c f28276b;

        /* renamed from: c */
        public volatile boolean f28277c;

        public b(Runnable runnable, c cVar) {
            this.f28275a = runnable;
            this.f28276b = cVar;
        }

        @Override // uk.c
        public final void c() {
            this.f28277c = true;
            this.f28276b.c();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f28277c) {
                return;
            }
            try {
                this.f28275a.run();
            } catch (Throwable th2) {
                c();
                ol.a.a(th2);
                throw th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c implements uk.c {

        /* loaded from: classes2.dex */
        public final class a implements Runnable {

            /* renamed from: a */
            public final Runnable f28278a;

            /* renamed from: b */
            public final xk.e f28279b;

            /* renamed from: c */
            public final long f28280c;

            /* renamed from: d */
            public long f28281d;

            /* renamed from: e */
            public long f28282e;

            /* renamed from: f */
            public long f28283f;

            public a(long j10, Runnable runnable, long j11, xk.e eVar, long j12) {
                c.this = r1;
                this.f28278a = runnable;
                this.f28279b = eVar;
                this.f28280c = j12;
                this.f28282e = j11;
                this.f28283f = j10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j10;
                this.f28278a.run();
                if (!this.f28279b.a()) {
                    c cVar = c.this;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    cVar.getClass();
                    long a10 = o.a(timeUnit);
                    long j11 = o.f28271b;
                    long j12 = this.f28282e;
                    if (a10 + j11 >= j12) {
                        long j13 = this.f28280c;
                        if (a10 < j12 + j13 + j11) {
                            long j14 = this.f28283f;
                            long j15 = this.f28281d + 1;
                            this.f28281d = j15;
                            j10 = (j15 * j13) + j14;
                            this.f28282e = a10;
                            xk.e eVar = this.f28279b;
                            uk.c b10 = c.this.b(this, j10 - a10, timeUnit);
                            eVar.getClass();
                            xk.b.e(eVar, b10);
                        }
                    }
                    long j16 = this.f28280c;
                    j10 = a10 + j16;
                    long j17 = this.f28281d + 1;
                    this.f28281d = j17;
                    this.f28283f = j10 - (j16 * j17);
                    this.f28282e = a10;
                    xk.e eVar2 = this.f28279b;
                    uk.c b102 = c.this.b(this, j10 - a10, timeUnit);
                    eVar2.getClass();
                    xk.b.e(eVar2, b102);
                }
            }
        }

        public uk.c a(Runnable runnable) {
            return b(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract uk.c b(Runnable runnable, long j10, TimeUnit timeUnit);

        public final uk.c d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            xk.e eVar = new xk.e();
            xk.e eVar2 = new xk.e(eVar);
            long nanos = timeUnit.toNanos(j11);
            long a10 = o.a(TimeUnit.NANOSECONDS);
            uk.c b10 = b(new a(timeUnit.toNanos(j10) + a10, runnable, a10, eVar2, nanos), j10, timeUnit);
            if (b10 == xk.c.INSTANCE) {
                return b10;
            }
            xk.b.e(eVar, b10);
            return eVar2;
        }
    }

    static {
        TimeUnit timeUnit;
        long longValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        if ("seconds".equalsIgnoreCase(property)) {
            timeUnit = TimeUnit.SECONDS;
        } else if ("milliseconds".equalsIgnoreCase(property)) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = TimeUnit.MINUTES;
        }
        f28271b = timeUnit.toNanos(longValue);
    }

    public static long a(TimeUnit timeUnit) {
        long nanoTime;
        TimeUnit timeUnit2;
        if (f28270a) {
            nanoTime = System.nanoTime();
            timeUnit2 = TimeUnit.NANOSECONDS;
        } else {
            nanoTime = System.currentTimeMillis();
            timeUnit2 = TimeUnit.MILLISECONDS;
        }
        return timeUnit.convert(nanoTime, timeUnit2);
    }

    public abstract c b();

    public uk.c c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public uk.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        c b10 = b();
        Objects.requireNonNull(runnable, "run is null");
        a aVar = new a(runnable, b10);
        b10.b(aVar, j10, timeUnit);
        return aVar;
    }

    public uk.c e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c b10 = b();
        b bVar = new b(runnable, b10);
        uk.c d10 = b10.d(bVar, j10, j11, timeUnit);
        return d10 == xk.c.INSTANCE ? d10 : bVar;
    }

    public void f() {
    }
}
