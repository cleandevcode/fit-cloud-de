package il;

import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tk.o;

/* loaded from: classes2.dex */
public final class o extends tk.o {

    /* renamed from: c */
    public static final o f17189c = new o();

    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: a */
        public final Runnable f17190a;

        /* renamed from: b */
        public final c f17191b;

        /* renamed from: c */
        public final long f17192c;

        public a(Runnable runnable, c cVar, long j10) {
            this.f17190a = runnable;
            this.f17191b = cVar;
            this.f17192c = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f17191b.f17200d) {
                c cVar = this.f17191b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cVar.getClass();
                long a10 = tk.o.a(timeUnit);
                long j10 = this.f17192c;
                if (j10 > a10) {
                    try {
                        Thread.sleep(j10 - a10);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        ol.a.a(e10);
                        return;
                    }
                }
                if (!this.f17191b.f17200d) {
                    this.f17190a.run();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        public final Runnable f17193a;

        /* renamed from: b */
        public final long f17194b;

        /* renamed from: c */
        public final int f17195c;

        /* renamed from: d */
        public volatile boolean f17196d;

        public b(Runnable runnable, Long l10, int i10) {
            this.f17193a = runnable;
            this.f17194b = l10.longValue();
            this.f17195c = i10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            int compare = Long.compare(this.f17194b, bVar2.f17194b);
            return compare == 0 ? Integer.compare(this.f17195c, bVar2.f17195c) : compare;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends o.c {

        /* renamed from: a */
        public final PriorityBlockingQueue<b> f17197a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        public final AtomicInteger f17198b = new AtomicInteger();

        /* renamed from: c */
        public final AtomicInteger f17199c = new AtomicInteger();

        /* renamed from: d */
        public volatile boolean f17200d;

        /* loaded from: classes2.dex */
        public final class a implements Runnable {

            /* renamed from: a */
            public final b f17201a;

            public a(b bVar) {
                c.this = r1;
                this.f17201a = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f17201a.f17196d = true;
                c.this.f17197a.remove(this.f17201a);
            }
        }

        @Override // tk.o.c
        public final uk.c a(Runnable runnable) {
            return e(tk.o.a(TimeUnit.MILLISECONDS), runnable);
        }

        @Override // tk.o.c
        public final uk.c b(Runnable runnable, long j10, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j10) + tk.o.a(TimeUnit.MILLISECONDS);
            return e(millis, new a(runnable, this, millis));
        }

        @Override // uk.c
        public final void c() {
            this.f17200d = true;
        }

        public final uk.c e(long j10, Runnable runnable) {
            xk.c cVar = xk.c.INSTANCE;
            if (this.f17200d) {
                return cVar;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f17199c.incrementAndGet());
            this.f17197a.add(bVar);
            if (this.f17198b.getAndIncrement() == 0) {
                int i10 = 1;
                while (!this.f17200d) {
                    b poll = this.f17197a.poll();
                    if (poll == null) {
                        i10 = this.f17198b.addAndGet(-i10);
                        if (i10 == 0) {
                            return cVar;
                        }
                    } else if (!poll.f17196d) {
                        poll.f17193a.run();
                    }
                }
                this.f17197a.clear();
                return cVar;
            }
            return new uk.f(new a(bVar));
        }
    }

    @Override // tk.o
    public final o.c b() {
        return new c();
    }

    @Override // tk.o
    public final uk.c c(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return xk.c.INSTANCE;
    }

    @Override // tk.o
    public final uk.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            ol.a.a(e10);
        }
        return xk.c.INSTANCE;
    }
}
