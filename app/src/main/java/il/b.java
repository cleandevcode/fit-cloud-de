package il;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class b extends tk.o {

    /* renamed from: d */
    public static final C0300b f17109d;

    /* renamed from: e */
    public static final i f17110e;

    /* renamed from: f */
    public static final int f17111f;

    /* renamed from: g */
    public static final c f17112g;

    /* renamed from: c */
    public final AtomicReference<C0300b> f17113c;

    /* loaded from: classes2.dex */
    public static final class a extends o.c {

        /* renamed from: a */
        public final xk.d f17114a;

        /* renamed from: b */
        public final uk.b f17115b;

        /* renamed from: c */
        public final xk.d f17116c;

        /* renamed from: d */
        public final c f17117d;

        /* renamed from: e */
        public volatile boolean f17118e;

        public a(c cVar) {
            this.f17117d = cVar;
            xk.d dVar = new xk.d();
            this.f17114a = dVar;
            uk.b bVar = new uk.b();
            this.f17115b = bVar;
            xk.d dVar2 = new xk.d();
            this.f17116c = dVar2;
            dVar2.b(dVar);
            dVar2.b(bVar);
        }

        @Override // tk.o.c
        public final uk.c a(Runnable runnable) {
            return this.f17118e ? xk.c.INSTANCE : this.f17117d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f17114a);
        }

        @Override // tk.o.c
        public final uk.c b(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f17118e ? xk.c.INSTANCE : this.f17117d.e(runnable, j10, timeUnit, this.f17115b);
        }

        @Override // uk.c
        public final void c() {
            if (this.f17118e) {
                return;
            }
            this.f17118e = true;
            this.f17116c.c();
        }
    }

    /* renamed from: il.b$b */
    /* loaded from: classes2.dex */
    public static final class C0300b {

        /* renamed from: a */
        public final int f17119a;

        /* renamed from: b */
        public final c[] f17120b;

        /* renamed from: c */
        public long f17121c;

        public C0300b(int i10, ThreadFactory threadFactory) {
            this.f17119a = i10;
            this.f17120b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f17120b[i11] = new c(threadFactory);
            }
        }

        public final c a() {
            int i10 = this.f17119a;
            if (i10 == 0) {
                return b.f17112g;
            }
            c[] cVarArr = this.f17120b;
            long j10 = this.f17121c;
            this.f17121c = 1 + j10;
            return cVarArr[(int) (j10 % i10)];
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f17111f = availableProcessors;
        c cVar = new c(new i("RxComputationShutdown"));
        f17112g = cVar;
        cVar.c();
        i iVar = new i(true, "RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())));
        f17110e = iVar;
        C0300b c0300b = new C0300b(0, iVar);
        f17109d = c0300b;
        for (c cVar2 : c0300b.f17120b) {
            cVar2.c();
        }
    }

    public b() {
        int i10;
        boolean z10;
        i iVar = f17110e;
        C0300b c0300b = f17109d;
        AtomicReference<C0300b> atomicReference = new AtomicReference<>(c0300b);
        this.f17113c = atomicReference;
        C0300b c0300b2 = new C0300b(f17111f, iVar);
        while (true) {
            if (atomicReference.compareAndSet(c0300b, c0300b2)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != c0300b) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            for (c cVar : c0300b2.f17120b) {
                cVar.c();
            }
        }
    }

    @Override // tk.o
    public final o.c b() {
        return new a(this.f17113c.get().a());
    }

    @Override // tk.o
    public final uk.c d(Runnable runnable, long j10, TimeUnit timeUnit) {
        Future<?> schedule;
        c a10 = this.f17113c.get().a();
        a10.getClass();
        Objects.requireNonNull(runnable, "run is null");
        k kVar = new k(runnable, true);
        try {
            if (j10 <= 0) {
                schedule = a10.f17172a.submit(kVar);
            } else {
                schedule = a10.f17172a.schedule(kVar, j10, timeUnit);
            }
            kVar.a(schedule);
            return kVar;
        } catch (RejectedExecutionException e10) {
            ol.a.a(e10);
            return xk.c.INSTANCE;
        }
    }

    @Override // tk.o
    public final uk.c e(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Future<?> schedule;
        c a10 = this.f17113c.get().a();
        a10.getClass();
        xk.c cVar = xk.c.INSTANCE;
        try {
            if (j11 <= 0) {
                e eVar = new e(runnable, a10.f17172a);
                if (j10 <= 0) {
                    schedule = a10.f17172a.submit(eVar);
                } else {
                    schedule = a10.f17172a.schedule(eVar, j10, timeUnit);
                }
                eVar.a(schedule);
                return eVar;
            }
            j jVar = new j(runnable, true);
            jVar.a(a10.f17172a.scheduleAtFixedRate(jVar, j10, j11, timeUnit));
            return jVar;
        } catch (RejectedExecutionException e10) {
            ol.a.a(e10);
            return cVar;
        }
    }

    @Override // tk.o
    public final void f() {
        AtomicReference<C0300b> atomicReference = this.f17113c;
        C0300b c0300b = f17109d;
        C0300b andSet = atomicReference.getAndSet(c0300b);
        if (andSet != c0300b) {
            for (c cVar : andSet.f17120b) {
                cVar.c();
            }
        }
    }
}
