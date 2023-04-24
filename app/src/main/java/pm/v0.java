package pm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import pm.j0;

/* loaded from: classes2.dex */
public abstract class v0 extends w0 implements j0 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24403g = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue");

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24404h = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes2.dex */
    public final class a extends c {

        /* renamed from: c */
        public final i<tl.l> f24405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, j jVar) {
            super(j10);
            v0.this = r1;
            this.f24405c = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24405c.H(v0.this, tl.l.f28297a);
        }

        @Override // pm.v0.c
        public final String toString() {
            return super.toString() + this.f24405c;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: c */
        public final Runnable f24407c;

        public b(long j10, e2 e2Var) {
            super(j10);
            this.f24407c = e2Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24407c.run();
        }

        @Override // pm.v0.c
        public final String toString() {
            return super.toString() + this.f24407c;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c implements Runnable, Comparable<c>, q0, um.d0 {
        private volatile Object _heap;

        /* renamed from: a */
        public long f24408a;

        /* renamed from: b */
        public int f24409b = -1;

        public c(long j10) {
            this.f24408a = j10;
        }

        @Override // um.d0
        public final void a(d dVar) {
            if (!(this._heap != bk.m.f4440a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = dVar;
        }

        @Override // pm.q0
        public final synchronized void c() {
            d dVar;
            Object obj = this._heap;
            um.x xVar = bk.m.f4440a;
            if (obj == xVar) {
                return;
            }
            um.c0 c0Var = null;
            if (obj instanceof d) {
                dVar = (d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                synchronized (dVar) {
                    Object obj2 = this._heap;
                    if (obj2 instanceof um.c0) {
                        c0Var = (um.c0) obj2;
                    }
                    if (c0Var != null) {
                        dVar.c(this.f24409b);
                    }
                }
            }
            this._heap = xVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            int i10 = ((this.f24408a - cVar.f24408a) > 0L ? 1 : ((this.f24408a - cVar.f24408a) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:66:0x0034, code lost:
            if ((r8 - r10.f24410b) > 0) goto L32;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [T extends um.d0 & java.lang.Comparable<? super T>[]] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized int d(long r8, pm.v0.d r10, pm.v0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4c
                um.x r1 = bk.m.f4440a     // Catch: java.lang.Throwable -> L4c
                r2 = 0
                if (r0 != r1) goto La
                r2 = 2
                goto L47
            La:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4c
                T extends um.d0 & java.lang.Comparable<? super T>[] r0 = r10.f28894a     // Catch: java.lang.Throwable -> L49
                if (r0 == 0) goto L12
                r0 = r0[r2]     // Catch: java.lang.Throwable -> L49
                goto L13
            L12:
                r0 = 0
            L13:
                pm.v0$c r0 = (pm.v0.c) r0     // Catch: java.lang.Throwable -> L49
                boolean r11 = pm.v0.E0(r11)     // Catch: java.lang.Throwable -> L49
                if (r11 == 0) goto L1f
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
                monitor-exit(r7)
                return r8
            L1f:
                r3 = 0
                if (r0 != 0) goto L24
                goto L36
            L24:
                long r0 = r0.f24408a     // Catch: java.lang.Throwable -> L49
                long r5 = r0 - r8
                int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r0
            L2e:
                long r0 = r10.f24410b     // Catch: java.lang.Throwable -> L49
                long r0 = r8 - r0
                int r11 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r11 <= 0) goto L38
            L36:
                r10.f24410b = r8     // Catch: java.lang.Throwable -> L49
            L38:
                long r8 = r7.f24408a     // Catch: java.lang.Throwable -> L49
                long r0 = r10.f24410b     // Catch: java.lang.Throwable -> L49
                long r8 = r8 - r0
                int r11 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r11 >= 0) goto L43
                r7.f24408a = r0     // Catch: java.lang.Throwable -> L49
            L43:
                r10.a(r7)     // Catch: java.lang.Throwable -> L49
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
            L47:
                monitor-exit(r7)
                return r2
            L49:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4c
                throw r8     // Catch: java.lang.Throwable -> L4c
            L4c:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pm.v0.c.d(long, pm.v0$d, pm.v0):int");
        }

        @Override // um.d0
        public final void setIndex(int i10) {
            this.f24409b = i10;
        }

        public String toString() {
            return d4.b.a(android.support.v4.media.d.a("Delayed[nanos="), this.f24408a, ']');
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends um.c0<c> {

        /* renamed from: b */
        public long f24410b;

        public d(long j10) {
            this.f24410b = j10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean E0(v0 v0Var) {
        return v0Var._isCompleted;
    }

    @Override // pm.j0
    public final void D(long j10, j jVar) {
        long j11 = j10 > 0 ? j10 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j10 : 0L;
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j11 + nanoTime, jVar);
            M0(nanoTime, aVar);
            jVar.z(new r0(aVar));
        }
    }

    public q0 E(long j10, e2 e2Var, xl.f fVar) {
        return j0.a.a(j10, e2Var, fVar);
    }

    public void G0(Runnable runnable) {
        if (I0(runnable)) {
            Thread z02 = z0();
            if (Thread.currentThread() != z02) {
                LockSupport.unpark(z02);
                return;
            }
            return;
        }
        h0.f24343i.G0(runnable);
    }

    public final boolean I0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z10 = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24403g;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof um.n) {
                um.n nVar = (um.n) obj;
                int a10 = nVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    if (a10 == 2) {
                        return false;
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24403g;
                    um.n e10 = nVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e10) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                }
            } else if (obj == bk.m.f4441b) {
                return false;
            } else {
                um.n nVar2 = new um.n(8, true);
                nVar2.a((Runnable) obj);
                nVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f24403g;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, nVar2)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
    }

    public final boolean K0() {
        boolean z10;
        um.a<m0<?>> aVar = this.f24400e;
        if (aVar != null && aVar.f28885b != aVar.f28886c) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        d dVar = (d) this._delayed;
        if (dVar != null && !dVar.b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof um.n) {
                return ((um.n) obj).d();
            }
            if (obj != bk.m.f4441b) {
                return false;
            }
        }
        return true;
    }

    public final void L0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void M0(long j10, c cVar) {
        int d10;
        Thread z02;
        boolean z10 = true;
        um.d0 d0Var = null;
        if (this._isCompleted != 0) {
            d10 = 1;
        } else {
            d dVar = (d) this._delayed;
            if (dVar == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24404h;
                d dVar2 = new d(j10);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                gm.l.c(obj);
                dVar = (d) obj;
            }
            d10 = cVar.d(j10, dVar, this);
        }
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            A0(j10, cVar);
            return;
        }
        d dVar3 = (d) this._delayed;
        if (dVar3 != null) {
            synchronized (dVar3) {
                um.d0[] d0VarArr = dVar3.f28894a;
                if (d0VarArr != null) {
                    d0Var = d0VarArr[0];
                }
            }
            d0Var = (c) d0Var;
        }
        if (d0Var != cVar) {
            z10 = false;
        }
        if (z10 && Thread.currentThread() != (z02 = z0())) {
            LockSupport.unpark(z02);
        }
    }

    @Override // pm.b0
    public final void l0(xl.f fVar, Runnable runnable) {
        G0(runnable);
    }

    @Override // pm.u0
    public void shutdown() {
        c d10;
        ThreadLocal<u0> threadLocal = c2.f24328a;
        c2.f24328a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            boolean z10 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24403g;
                um.x xVar = bk.m.f4441b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, xVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            } else if (obj instanceof um.n) {
                ((um.n) obj).b();
                break;
            } else if (obj == bk.m.f4441b) {
                break;
            } else {
                um.n nVar = new um.n(8, true);
                nVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f24403g;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, nVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        do {
        } while (x0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar != null && (d10 = dVar.d()) != null) {
                A0(nanoTime, d10);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x007f A[EDGE_INSN: B:247:0x007f->B:186:0x007f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [pm.u0, pm.v0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T extends um.d0 & java.lang.Comparable<? super T>[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v7, types: [T extends um.d0 & java.lang.Comparable<? super T>[]] */
    @Override // pm.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long x0() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pm.v0.x0():long");
    }
}
