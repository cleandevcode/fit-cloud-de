package il;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class d extends tk.o {

    /* renamed from: c */
    public final boolean f17123c = false;

    /* renamed from: d */
    public final boolean f17124d = false;

    /* renamed from: e */
    public final Executor f17125e;

    /* loaded from: classes2.dex */
    public final class a implements Runnable {

        /* renamed from: a */
        public final b f17126a;

        public a(b bVar) {
            d.this = r1;
            this.f17126a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f17126a;
            xk.e eVar = bVar.f17129b;
            uk.c c10 = d.this.c(bVar);
            eVar.getClass();
            xk.b.e(eVar, c10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends AtomicReference<Runnable> implements Runnable, uk.c {

        /* renamed from: a */
        public final xk.e f17128a;

        /* renamed from: b */
        public final xk.e f17129b;

        public b(Runnable runnable) {
            super(runnable);
            this.f17128a = new xk.e();
            this.f17129b = new xk.e();
        }

        @Override // uk.c
        public final void c() {
            if (getAndSet(null) != null) {
                xk.e eVar = this.f17128a;
                eVar.getClass();
                xk.b.a(eVar);
                xk.e eVar2 = this.f17129b;
                eVar2.getClass();
                xk.b.a(eVar2);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            xk.b bVar = xk.b.f30613a;
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    this.f17128a.lazySet(bVar);
                    this.f17129b.lazySet(bVar);
                } catch (Throwable th2) {
                    ol.a.a(th2);
                    throw th2;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends o.c implements Runnable {

        /* renamed from: a */
        public final boolean f17130a;

        /* renamed from: b */
        public final boolean f17131b;

        /* renamed from: c */
        public final Executor f17132c;

        /* renamed from: e */
        public volatile boolean f17134e;

        /* renamed from: f */
        public final AtomicInteger f17135f = new AtomicInteger();

        /* renamed from: g */
        public final uk.b f17136g = new uk.b();

        /* renamed from: d */
        public final hl.a<Runnable> f17133d = new hl.a<>();

        /* loaded from: classes2.dex */
        public static final class a extends AtomicBoolean implements Runnable, uk.c {

            /* renamed from: a */
            public final Runnable f17137a;

            public a(Runnable runnable) {
                this.f17137a = runnable;
            }

            @Override // uk.c
            public final void c() {
                lazySet(true);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f17137a.run();
                } finally {
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends AtomicInteger implements Runnable, uk.c {

            /* renamed from: a */
            public final Runnable f17138a;

            /* renamed from: b */
            public final uk.d f17139b;

            /* renamed from: c */
            public volatile Thread f17140c;

            public b(Runnable runnable, uk.b bVar) {
                this.f17138a = runnable;
                this.f17139b = bVar;
            }

            public final void a() {
                uk.d dVar = this.f17139b;
                if (dVar != null) {
                    dVar.d(this);
                }
            }

            @Override // uk.c
            public final void c() {
                while (true) {
                    int i10 = get();
                    if (i10 >= 2) {
                        return;
                    }
                    if (i10 == 0) {
                        if (compareAndSet(0, 4)) {
                            break;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f17140c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f17140c = null;
                        }
                        set(4);
                    }
                }
                a();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (get() == 0) {
                    this.f17140c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f17140c = null;
                        return;
                    }
                    try {
                        this.f17138a.run();
                        this.f17140c = null;
                        if (compareAndSet(1, 2)) {
                            a();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th2) {
                        try {
                            ol.a.a(th2);
                            throw th2;
                        } catch (Throwable th3) {
                            this.f17140c = null;
                            if (compareAndSet(1, 2)) {
                                a();
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }

        /* renamed from: il.d$c$c */
        /* loaded from: classes2.dex */
        public final class RunnableC0301c implements Runnable {

            /* renamed from: a */
            public final xk.e f17141a;

            /* renamed from: b */
            public final Runnable f17142b;

            public RunnableC0301c(xk.e eVar, Runnable runnable) {
                c.this = r1;
                this.f17141a = eVar;
                this.f17142b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                xk.e eVar = this.f17141a;
                uk.c a10 = c.this.a(this.f17142b);
                eVar.getClass();
                xk.b.e(eVar, a10);
            }
        }

        public c(Executor executor, boolean z10, boolean z11) {
            this.f17132c = executor;
            this.f17130a = z10;
            this.f17131b = z11;
        }

        @Override // tk.o.c
        public final uk.c a(Runnable runnable) {
            uk.c aVar;
            xk.c cVar = xk.c.INSTANCE;
            if (this.f17134e) {
                return cVar;
            }
            Objects.requireNonNull(runnable, "run is null");
            if (this.f17130a) {
                aVar = new b(runnable, this.f17136g);
                this.f17136g.b(aVar);
            } else {
                aVar = new a(runnable);
            }
            this.f17133d.offer(aVar);
            if (this.f17135f.getAndIncrement() == 0) {
                try {
                    this.f17132c.execute(this);
                } catch (RejectedExecutionException e10) {
                    this.f17134e = true;
                    this.f17133d.clear();
                    ol.a.a(e10);
                    return cVar;
                }
            }
            return aVar;
        }

        @Override // tk.o.c
        public final uk.c b(Runnable runnable, long j10, TimeUnit timeUnit) {
            xk.c cVar = xk.c.INSTANCE;
            if (j10 <= 0) {
                return a(runnable);
            }
            if (this.f17134e) {
                return cVar;
            }
            xk.e eVar = new xk.e();
            xk.e eVar2 = new xk.e(eVar);
            Objects.requireNonNull(runnable, "run is null");
            l lVar = new l(new RunnableC0301c(eVar2, runnable), this.f17136g);
            this.f17136g.b(lVar);
            Executor executor = this.f17132c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    lVar.a(((ScheduledExecutorService) executor).schedule((Callable) lVar, j10, timeUnit));
                } catch (RejectedExecutionException e10) {
                    this.f17134e = true;
                    ol.a.a(e10);
                    return cVar;
                }
            } else {
                lVar.a(new il.c(C0302d.f17144a.d(lVar, j10, timeUnit)));
            }
            xk.b.e(eVar, lVar);
            return eVar2;
        }

        @Override // uk.c
        public final void c() {
            if (this.f17134e) {
                return;
            }
            this.f17134e = true;
            this.f17136g.c();
            if (this.f17135f.getAndIncrement() == 0) {
                this.f17133d.clear();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x003f, code lost:
            if (r3.f17134e == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0042, code lost:
            r1 = r3.f17135f.addAndGet(-r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0049, code lost:
            if (r1 != 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r3 = this;
                boolean r0 = r3.f17131b
                if (r0 == 0) goto L2a
                hl.a<java.lang.Runnable> r0 = r3.f17133d
                boolean r1 = r3.f17134e
                if (r1 == 0) goto Le
            La:
                r0.clear()
                goto L54
            Le:
                java.lang.Object r1 = r0.poll()
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r1.run()
                boolean r1 = r3.f17134e
                if (r1 == 0) goto L1c
                goto La
            L1c:
                java.util.concurrent.atomic.AtomicInteger r0 = r3.f17135f
                int r0 = r0.decrementAndGet()
                if (r0 == 0) goto L54
                java.util.concurrent.Executor r0 = r3.f17132c
                r0.execute(r3)
                goto L54
            L2a:
                hl.a<java.lang.Runnable> r0 = r3.f17133d
                r1 = 1
            L2d:
                boolean r2 = r3.f17134e
                if (r2 == 0) goto L35
            L31:
                r0.clear()
                goto L54
            L35:
                java.lang.Object r2 = r0.poll()
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                if (r2 != 0) goto L4c
                boolean r2 = r3.f17134e
                if (r2 == 0) goto L42
                goto L53
            L42:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.f17135f
                int r1 = -r1
                int r1 = r2.addAndGet(r1)
                if (r1 != 0) goto L2d
                goto L54
            L4c:
                r2.run()
                boolean r2 = r3.f17134e
                if (r2 == 0) goto L35
            L53:
                goto L31
            L54:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: il.d.c.run():void");
        }
    }

    /* renamed from: il.d$d */
    /* loaded from: classes2.dex */
    public static final class C0302d {

        /* renamed from: a */
        public static final tk.o f17144a = pl.a.f24279a;
    }

    public d(ExecutorService executorService) {
        this.f17125e = executorService;
    }

    @Override // tk.o
    public final o.c b() {
        return new c(this.f17125e, this.f17123c, this.f17124d);
    }

    @Override // tk.o
    public final uk.c c(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        try {
            if (this.f17125e instanceof ExecutorService) {
                k kVar = new k(runnable, this.f17123c);
                kVar.a(((ExecutorService) this.f17125e).submit(kVar));
                return kVar;
            } else if (this.f17123c) {
                c.b bVar = new c.b(runnable, null);
                this.f17125e.execute(bVar);
                return bVar;
            } else {
                c.a aVar = new c.a(runnable);
                this.f17125e.execute(aVar);
                return aVar;
            }
        } catch (RejectedExecutionException e10) {
            ol.a.a(e10);
            return xk.c.INSTANCE;
        }
    }

    @Override // tk.o
    public final uk.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        if (this.f17125e instanceof ScheduledExecutorService) {
            try {
                k kVar = new k(runnable, this.f17123c);
                kVar.a(((ScheduledExecutorService) this.f17125e).schedule(kVar, j10, timeUnit));
                return kVar;
            } catch (RejectedExecutionException e10) {
                ol.a.a(e10);
                return xk.c.INSTANCE;
            }
        }
        b bVar = new b(runnable);
        uk.c d10 = C0302d.f17144a.d(new a(bVar), j10, timeUnit);
        xk.e eVar = bVar.f17128a;
        eVar.getClass();
        xk.b.e(eVar, d10);
        return bVar;
    }

    @Override // tk.o
    public final uk.c e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        if (this.f17125e instanceof ScheduledExecutorService) {
            try {
                j jVar = new j(runnable, this.f17123c);
                jVar.a(((ScheduledExecutorService) this.f17125e).scheduleAtFixedRate(jVar, j10, j11, timeUnit));
                return jVar;
            } catch (RejectedExecutionException e10) {
                ol.a.a(e10);
                return xk.c.INSTANCE;
            }
        }
        return super.e(runnable, j10, j11, timeUnit);
    }
}
