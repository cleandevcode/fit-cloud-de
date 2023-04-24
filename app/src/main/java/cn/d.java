package cn;

import gm.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: h */
    public static final d f4967h;

    /* renamed from: i */
    public static final Logger f4968i;

    /* renamed from: j */
    public static final b f4969j = new b();

    /* renamed from: b */
    public boolean f4971b;

    /* renamed from: c */
    public long f4972c;

    /* renamed from: g */
    public final a f4976g;

    /* renamed from: a */
    public int f4970a = 10000;

    /* renamed from: d */
    public final ArrayList f4973d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f4974e = new ArrayList();

    /* renamed from: f */
    public final e f4975f = new e(this);

    /* loaded from: classes2.dex */
    public interface a {
        void a(d dVar);

        long b();

        void c(d dVar, long j10);

        void execute(Runnable runnable);
    }

    /* loaded from: classes2.dex */
    public static final class b {
    }

    /* loaded from: classes2.dex */
    public static final class c implements a {

        /* renamed from: a */
        public final ThreadPoolExecutor f4977a;

        public c(an.b bVar) {
            this.f4977a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
        }

        @Override // cn.d.a
        public final void a(d dVar) {
            l.f(dVar, "taskRunner");
            dVar.notify();
        }

        @Override // cn.d.a
        public final long b() {
            return System.nanoTime();
        }

        @Override // cn.d.a
        public final void c(d dVar, long j10) {
            l.f(dVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                dVar.wait(j11, (int) j12);
            }
        }

        @Override // cn.d.a
        public final void execute(Runnable runnable) {
            l.f(runnable, "runnable");
            this.f4977a.execute(runnable);
        }
    }

    static {
        String str = an.c.f640f + " TaskRunner";
        l.f(str, "name");
        f4967h = new d(new c(new an.b(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        l.e(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f4968i = logger;
    }

    public d(c cVar) {
        this.f4976g = cVar;
    }

    public static final void a(d dVar, cn.a aVar) {
        dVar.getClass();
        byte[] bArr = an.c.f635a;
        Thread currentThread = Thread.currentThread();
        l.e(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f4958c);
        try {
            long a10 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a10);
                tl.l lVar = tl.l.f28297a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                tl.l lVar2 = tl.l.f28297a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    public final void b(cn.a aVar, long j10) {
        boolean z10;
        byte[] bArr = an.c.f635a;
        cn.c cVar = aVar.f4956a;
        l.c(cVar);
        if (cVar.f4962b == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            boolean z11 = cVar.f4964d;
            cVar.f4964d = false;
            cVar.f4962b = null;
            this.f4973d.remove(cVar);
            if (j10 != -1 && !z11 && !cVar.f4961a) {
                cVar.d(aVar, j10, true);
            }
            if (!cVar.f4963c.isEmpty()) {
                this.f4974e.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final cn.a c() {
        boolean z10;
        byte[] bArr = an.c.f635a;
        while (!this.f4974e.isEmpty()) {
            long b10 = this.f4976g.b();
            long j10 = Long.MAX_VALUE;
            Iterator it = this.f4974e.iterator();
            cn.a aVar = null;
            while (true) {
                if (it.hasNext()) {
                    cn.a aVar2 = (cn.a) ((cn.c) it.next()).f4963c.get(0);
                    long max = Math.max(0L, aVar2.f4957b - b10);
                    if (max > 0) {
                        j10 = Math.min(max, j10);
                    } else if (aVar != null) {
                        z10 = true;
                        break;
                    } else {
                        aVar = aVar2;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = an.c.f635a;
                aVar.f4957b = -1L;
                cn.c cVar = aVar.f4956a;
                l.c(cVar);
                cVar.f4963c.remove(aVar);
                this.f4974e.remove(cVar);
                cVar.f4962b = aVar;
                this.f4973d.add(cVar);
                if (z10 || (!this.f4971b && (!this.f4974e.isEmpty()))) {
                    this.f4976g.execute(this.f4975f);
                }
                return aVar;
            } else if (this.f4971b) {
                if (j10 < this.f4972c - b10) {
                    this.f4976g.a(this);
                }
                return null;
            } else {
                this.f4971b = true;
                this.f4972c = b10 + j10;
                try {
                    try {
                        this.f4976g.c(this, j10);
                    } catch (InterruptedException unused) {
                        d();
                    }
                } finally {
                    this.f4971b = false;
                }
            }
        }
        return null;
    }

    public final void d() {
        int size = this.f4973d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((cn.c) this.f4973d.get(size)).b();
        }
        int size2 = this.f4974e.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                cn.c cVar = (cn.c) this.f4974e.get(size2);
                cVar.b();
                if (cVar.f4963c.isEmpty()) {
                    this.f4974e.remove(size2);
                }
            } else {
                return;
            }
        }
    }

    public final void e(cn.c cVar) {
        l.f(cVar, "taskQueue");
        byte[] bArr = an.c.f635a;
        if (cVar.f4962b == null) {
            if (!cVar.f4963c.isEmpty()) {
                ArrayList arrayList = this.f4974e;
                l.f(arrayList, "$this$addIfAbsent");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                this.f4974e.remove(cVar);
            }
        }
        if (this.f4971b) {
            this.f4976g.a(this);
        } else {
            this.f4976g.execute(this.f4975f);
        }
    }

    public final cn.c f() {
        int i10;
        synchronized (this) {
            i10 = this.f4970a;
            this.f4970a = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new cn.c(this, sb2.toString());
    }
}
