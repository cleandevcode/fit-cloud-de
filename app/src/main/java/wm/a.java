package wm;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import pm.g0;
import s.c0;
import s.p1;
import um.u;
import um.x;

/* loaded from: classes2.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a */
    public final int f30028a;

    /* renamed from: b */
    public final int f30029b;

    /* renamed from: c */
    public final long f30030c;
    public volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final String f30031d;

    /* renamed from: e */
    public final d f30032e;

    /* renamed from: f */
    public final d f30033f;

    /* renamed from: g */
    public final u<C0547a> f30034g;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: k */
    public static final x f30027k = new x("NOT_IN_STACK");

    /* renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f30024h = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f30025i = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f30026j = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: wm.a$a */
    /* loaded from: classes2.dex */
    public final class C0547a extends Thread {

        /* renamed from: h */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f30035h = AtomicIntegerFieldUpdater.newUpdater(C0547a.class, "workerCtl");

        /* renamed from: a */
        public final m f30036a;

        /* renamed from: b */
        public int f30037b;

        /* renamed from: c */
        public long f30038c;

        /* renamed from: d */
        public long f30039d;

        /* renamed from: e */
        public int f30040e;

        /* renamed from: f */
        public boolean f30041f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public C0547a() {
            throw null;
        }

        public C0547a(int i10) {
            a.this = r1;
            setDaemon(true);
            this.f30036a = new m();
            this.f30037b = 4;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f30027k;
            this.f30040e = jm.c.f17996a.b();
            f(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:104:0x008f, code lost:
            if (r0 == null) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final wm.g a(boolean r10) {
            /*
                r9 = this;
                int r0 = r9.f30037b
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L7
                goto L2e
            L7:
                wm.a r0 = wm.a.this
            L9:
                long r5 = r0.controlState
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r4 = (int) r3
                if (r4 != 0) goto L19
                r0 = 0
                goto L2a
            L19:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = wm.a.f30025i
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L9
                r0 = 1
            L2a:
                if (r0 == 0) goto L30
                r9.f30037b = r2
            L2e:
                r0 = 1
                goto L31
            L30:
                r0 = 0
            L31:
                r3 = 0
                if (r0 == 0) goto L7a
                if (r10 == 0) goto L6e
                wm.a r10 = wm.a.this
                int r10 = r10.f30028a
                int r10 = r10 * 2
                int r10 = r9.d(r10)
                if (r10 != 0) goto L43
                goto L44
            L43:
                r2 = 0
            L44:
                if (r2 == 0) goto L4d
                wm.g r10 = r9.e()
                if (r10 == 0) goto L4d
                goto L79
            L4d:
                wm.m r10 = r9.f30036a
                r10.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = wm.m.f30060b
                java.lang.Object r0 = r0.getAndSet(r10, r3)
                wm.g r0 = (wm.g) r0
                if (r0 != 0) goto L61
                wm.g r10 = r10.d()
                goto L62
            L61:
                r10 = r0
            L62:
                if (r10 == 0) goto L65
                goto L79
            L65:
                if (r2 != 0) goto L75
                wm.g r10 = r9.e()
                if (r10 == 0) goto L75
                goto L79
            L6e:
                wm.g r10 = r9.e()
                if (r10 == 0) goto L75
                goto L79
            L75:
                wm.g r10 = r9.i(r1)
            L79:
                return r10
            L7a:
                if (r10 == 0) goto L91
                wm.m r10 = r9.f30036a
                r10.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = wm.m.f30060b
                java.lang.Object r0 = r0.getAndSet(r10, r3)
                wm.g r0 = (wm.g) r0
                if (r0 != 0) goto L8f
                wm.g r0 = r10.d()
            L8f:
                if (r0 != 0) goto L9c
            L91:
                wm.a r10 = wm.a.this
                wm.d r10 = r10.f30033f
                java.lang.Object r10 = r10.d()
                r0 = r10
                wm.g r0 = (wm.g) r0
            L9c:
                if (r0 != 0) goto La2
                wm.g r0 = r9.i(r2)
            La2:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wm.a.C0547a.a(boolean):wm.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f30040e;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f30040e = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final g e() {
            d dVar;
            if (d(2) == 0) {
                g d10 = a.this.f30032e.d();
                if (d10 != null) {
                    return d10;
                }
                dVar = a.this.f30033f;
            } else {
                g d11 = a.this.f30033f.d();
                if (d11 != null) {
                    return d11;
                }
                dVar = a.this.f30032e;
            }
            return dVar.d();
        }

        public final void f(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f30031d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i10) {
            int i11 = this.f30037b;
            boolean z10 = i11 == 1;
            if (z10) {
                a.f30025i.addAndGet(a.this, 4398046511104L);
            }
            if (i11 != i10) {
                this.f30037b = i10;
            }
            return z10;
        }

        public final g i(boolean z10) {
            long f10;
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int d10 = d(i10);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                d10++;
                if (d10 > i10) {
                    d10 = 1;
                }
                C0547a b10 = aVar.f30034g.b(d10);
                if (b10 != null && b10 != this) {
                    m mVar = this.f30036a;
                    m mVar2 = b10.f30036a;
                    if (z10) {
                        f10 = mVar.e(mVar2);
                    } else {
                        mVar.getClass();
                        g d11 = mVar2.d();
                        if (d11 != null) {
                            mVar.a(d11, false);
                            f10 = -1;
                        } else {
                            f10 = mVar.f(mVar2, false);
                        }
                    }
                    if (f10 == -1) {
                        m mVar3 = this.f30036a;
                        mVar3.getClass();
                        g gVar = (g) m.f30060b.getAndSet(mVar3, null);
                        if (gVar == null) {
                            return mVar3.d();
                        }
                        return gVar;
                    } else if (f10 > 0) {
                        j10 = Math.min(j10, f10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f30039d = j10;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:224:0x0065 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0002 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: wm.a.C0547a.run():void");
        }
    }

    public a(int i10, int i11, long j10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f30028a = i10;
        this.f30029b = i11;
        this.f30030c = j10;
        this.f30031d = str;
        if (i10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= 2097150) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (j10 > 0) {
                        this.f30032e = new d();
                        this.f30033f = new d();
                        this.parkedWorkersStack = 0L;
                        this.f30034g = new u<>(i10 + 1);
                        this.controlState = i10 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(androidx.activity.i.a("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(p1.a("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        throw new IllegalArgumentException(androidx.activity.i.a("Core pool size ", i10, " should be at least 1").toString());
    }

    public final int a() {
        boolean z10;
        int i10;
        synchronized (this.f30034g) {
            if (this._isTerminated != 0) {
                i10 = -1;
            } else {
                long j10 = this.controlState;
                int i11 = (int) (j10 & 2097151);
                int i12 = i11 - ((int) ((j10 & 4398044413952L) >> 21));
                boolean z11 = false;
                if (i12 < 0) {
                    i12 = 0;
                }
                if (i12 >= this.f30028a) {
                    return 0;
                }
                if (i11 >= this.f30029b) {
                    return 0;
                }
                int i13 = ((int) (this.controlState & 2097151)) + 1;
                if (i13 > 0 && this.f30034g.b(i13) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    C0547a c0547a = new C0547a(i13);
                    this.f30034g.c(i13, c0547a);
                    if (i13 == ((int) (2097151 & f30025i.incrementAndGet(this)))) {
                        z11 = true;
                    }
                    if (z11) {
                        c0547a.start();
                        i10 = i12 + 1;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            return i10;
        }
    }

    public final void b(Runnable runnable, h hVar, boolean z10) {
        g jVar;
        C0547a c0547a;
        g gVar;
        boolean z11;
        d dVar;
        k.f30056e.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            jVar = (g) runnable;
            jVar.f30048a = nanoTime;
            jVar.f30049b = hVar;
        } else {
            jVar = new j(runnable, nanoTime, hVar);
        }
        Thread currentThread = Thread.currentThread();
        C0547a c0547a2 = null;
        if (currentThread instanceof C0547a) {
            c0547a = (C0547a) currentThread;
        } else {
            c0547a = null;
        }
        if (c0547a != null && gm.l.a(a.this, this)) {
            c0547a2 = c0547a;
        }
        boolean z12 = true;
        if (c0547a2 == null || c0547a2.f30037b == 5 || (jVar.f30049b.b() == 0 && c0547a2.f30037b == 2)) {
            gVar = jVar;
        } else {
            c0547a2.f30041f = true;
            gVar = c0547a2.f30036a.a(jVar, z10);
        }
        if (gVar != null) {
            if (gVar.f30049b.b() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                dVar = this.f30033f;
            } else {
                dVar = this.f30032e;
            }
            if (!dVar.a(gVar)) {
                throw new RejectedExecutionException(androidx.activity.e.b(new StringBuilder(), this.f30031d, " was terminated"));
            }
        }
        z12 = (!z10 || c0547a2 == null) ? false : false;
        if (jVar.f30049b.b() == 0) {
            if (!z12 && !q() && !k(this.controlState)) {
                q();
                return;
            }
            return;
        }
        long addAndGet = f30025i.addAndGet(this, 2097152L);
        if (!z12 && !q() && !k(addAndGet)) {
            q();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0086, code lost:
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0073 A[LOOP:0: B:96:0x0033->B:110:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0076 A[EDGE_INSN: B:139:0x0076->B:111:0x0076 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = wm.a.f30026j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto La8
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof wm.a.C0547a
            r4 = 0
            if (r3 == 0) goto L18
            wm.a$a r0 = (wm.a.C0547a) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L24
            wm.a r3 = wm.a.this
            boolean r3 = gm.l.a(r3, r9)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            um.u<wm.a$a> r3 = r9.f30034g
            monitor-enter(r3)
            long r5 = r9.controlState     // Catch: java.lang.Throwable -> Lbc
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r6 = (int) r5
            monitor-exit(r3)
            if (r2 > r6) goto L76
            r3 = 1
        L33:
            um.u<wm.a$a> r5 = r9.f30034g
            java.lang.Object r5 = r5.b(r3)
            gm.l.c(r5)
            wm.a$a r5 = (wm.a.C0547a) r5
            if (r5 == r0) goto L71
        L40:
            boolean r7 = r5.isAlive()
            if (r7 == 0) goto L4f
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r7 = 10000(0x2710, double:4.9407E-320)
            r5.join(r7)
            goto L40
        L4f:
            wm.m r5 = r5.f30036a
            wm.d r7 = r9.f30033f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = wm.m.f30060b
            java.lang.Object r8 = r8.getAndSet(r5, r4)
            wm.g r8 = (wm.g) r8
            if (r8 == 0) goto L63
            r7.a(r8)
        L63:
            wm.g r8 = r5.d()
            if (r8 != 0) goto L6b
            r8 = 0
            goto L6f
        L6b:
            r7.a(r8)
            r8 = 1
        L6f:
            if (r8 != 0) goto L63
        L71:
            if (r3 == r6) goto L76
            int r3 = r3 + 1
            goto L33
        L76:
            wm.d r1 = r9.f30033f
            r1.b()
            wm.d r1 = r9.f30032e
            r1.b()
        L80:
            if (r0 == 0) goto L88
            wm.g r1 = r0.a(r2)
            if (r1 != 0) goto La9
        L88:
            wm.d r1 = r9.f30032e
            java.lang.Object r1 = r1.d()
            wm.g r1 = (wm.g) r1
            if (r1 != 0) goto La9
            wm.d r1 = r9.f30033f
            java.lang.Object r1 = r1.d()
            wm.g r1 = (wm.g) r1
            if (r1 != 0) goto La9
            if (r0 == 0) goto La2
            r1 = 5
            r0.h(r1)
        La2:
            r0 = 0
            r9.parkedWorkersStack = r0
            r9.controlState = r0
        La8:
            return
        La9:
            r1.run()     // Catch: java.lang.Throwable -> Lad
            goto L80
        Lad:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lba
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> Lba
            r4.uncaughtException(r3, r1)     // Catch: java.lang.Throwable -> Lba
            goto L80
        Lba:
            r0 = move-exception
            throw r0
        Lbc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.a.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, k.f30057f, false);
    }

    public final void h(C0547a c0547a) {
        long j10;
        int b10;
        if (c0547a.c() != f30027k) {
            return;
        }
        do {
            j10 = this.parkedWorkersStack;
            b10 = c0547a.b();
            c0547a.g(this.f30034g.b((int) (2097151 & j10)));
        } while (!f30024h.compareAndSet(this, j10, b10 | ((2097152 + j10) & (-2097152))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(C0547a c0547a, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    C0547a c0547a2 = c0547a;
                    while (true) {
                        Object c10 = c0547a2.c();
                        if (c10 == f30027k) {
                            i12 = -1;
                            break;
                        } else if (c10 == null) {
                            i12 = 0;
                            break;
                        } else {
                            c0547a2 = (C0547a) c10;
                            i12 = c0547a2.b();
                            if (i12 != 0) {
                                break;
                            }
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f30024h.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    public final boolean k(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 < this.f30028a) {
            int a10 = a();
            if (a10 == 1 && this.f30028a > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        x xVar;
        int i10;
        while (true) {
            long j10 = this.parkedWorkersStack;
            C0547a b10 = this.f30034g.b((int) (2097151 & j10));
            if (b10 == null) {
                b10 = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                C0547a c0547a = b10;
                while (true) {
                    Object c10 = c0547a.c();
                    xVar = f30027k;
                    if (c10 == xVar) {
                        i10 = -1;
                        break;
                    } else if (c10 == null) {
                        i10 = 0;
                        break;
                    } else {
                        c0547a = (C0547a) c10;
                        i10 = c0547a.b();
                        if (i10 != 0) {
                            break;
                        }
                    }
                }
                if (i10 >= 0 && f30024h.compareAndSet(this, j10, i10 | j11)) {
                    b10.g(xVar);
                }
            }
            if (b10 == null) {
                return false;
            }
            if (C0547a.f30035h.compareAndSet(b10, -1, 0)) {
                LockSupport.unpark(b10);
                return true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2;
        char c10;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f30034g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            C0547a b10 = this.f30034g.b(i15);
            if (b10 != null) {
                int c11 = b10.f30036a.c();
                int b11 = c0.b(b10.f30037b);
                if (b11 == 0) {
                    i10++;
                    sb2 = new StringBuilder();
                    sb2.append(c11);
                    c10 = 'c';
                } else if (b11 == 1) {
                    i11++;
                    sb2 = new StringBuilder();
                    sb2.append(c11);
                    c10 = 'b';
                } else if (b11 == 2) {
                    i12++;
                } else if (b11 == 3) {
                    i13++;
                    if (c11 > 0) {
                        sb2 = new StringBuilder();
                        sb2.append(c11);
                        c10 = 'd';
                    }
                } else if (b11 == 4) {
                    i14++;
                }
                sb2.append(c10);
                arrayList.add(sb2.toString());
            }
        }
        long j10 = this.controlState;
        return this.f30031d + '@' + g0.j(this) + "[Pool Size {core = " + this.f30028a + ", max = " + this.f30029b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f30032e.c() + ", global blocking queue size = " + this.f30033f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f30028a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }
}
