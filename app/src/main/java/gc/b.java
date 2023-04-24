package gc;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tk.n;
import wk.f;

/* loaded from: classes.dex */
public final class b<T> extends d {

    /* renamed from: f */
    public static final Object[] f15197f = new Object[0];

    /* renamed from: g */
    public static final a[] f15198g = new a[0];

    /* renamed from: a */
    public final AtomicReference<T> f15199a;

    /* renamed from: b */
    public final AtomicReference<a<T>[]> f15200b;

    /* renamed from: c */
    public final Lock f15201c;

    /* renamed from: d */
    public final Lock f15202d;

    /* renamed from: e */
    public long f15203e;

    /* loaded from: classes.dex */
    public static final class a<T> implements uk.c, f {

        /* renamed from: a */
        public final n<? super T> f15204a;

        /* renamed from: b */
        public final b<T> f15205b;

        /* renamed from: c */
        public boolean f15206c;

        /* renamed from: d */
        public boolean f15207d;

        /* renamed from: e */
        public gc.a<T> f15208e;

        /* renamed from: f */
        public boolean f15209f;

        /* renamed from: g */
        public volatile boolean f15210g;

        /* renamed from: h */
        public long f15211h;

        public a(n<? super T> nVar, b<T> bVar) {
            this.f15204a = nVar;
            this.f15205b = bVar;
        }

        @Override // uk.c
        public final void c() {
            if (this.f15210g) {
                return;
            }
            this.f15210g = true;
            this.f15205b.J(this);
        }

        @Override // wk.f
        public final boolean test(T t10) {
            if (this.f15210g) {
                return false;
            }
            this.f15204a.b(t10);
            return false;
        }
    }

    public b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f15201c = reentrantReadWriteLock.readLock();
        this.f15202d = reentrantReadWriteLock.writeLock();
        this.f15200b = new AtomicReference<>(f15198g);
        this.f15199a = new AtomicReference<>();
    }

    @Override // gc.d
    public final boolean H() {
        return this.f15200b.get().length != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0042, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(gc.b.a<T> r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<gc.b$a<T>[]> r0 = r7.f15200b
            java.lang.Object r0 = r0.get()
            gc.b$a[] r0 = (gc.b.a[]) r0
            int r1 = r0.length
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = -1
            r3 = 0
            r4 = 0
        Lf:
            if (r4 >= r1) goto L1a
            r5 = r0[r4]
            if (r5 != r8) goto L17
            r2 = r4
            goto L1a
        L17:
            int r4 = r4 + 1
            goto Lf
        L1a:
            if (r2 >= 0) goto L1d
            return
        L1d:
            r4 = 1
            if (r1 != r4) goto L23
            gc.b$a[] r1 = gc.b.f15198g
            goto L32
        L23:
            int r5 = r1 + (-1)
            gc.b$a[] r5 = new gc.b.a[r5]
            java.lang.System.arraycopy(r0, r3, r5, r3, r2)
            int r6 = r2 + 1
            int r1 = r1 - r2
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r6, r5, r2, r1)
            r1 = r5
        L32:
            java.util.concurrent.atomic.AtomicReference<gc.b$a<T>[]> r2 = r7.f15200b
        L34:
            boolean r5 = r2.compareAndSet(r0, r1)
            if (r5 == 0) goto L3c
            r3 = 1
            goto L42
        L3c:
            java.lang.Object r5 = r2.get()
            if (r5 == r0) goto L34
        L42:
            if (r3 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.b.J(gc.b$a):void");
    }

    @Override // gc.d, wk.d
    public final void accept(T t10) {
        a<T>[] aVarArr;
        if (t10 != null) {
            this.f15202d.lock();
            this.f15203e++;
            this.f15199a.lazySet(t10);
            this.f15202d.unlock();
            for (a<T> aVar : this.f15200b.get()) {
                long j10 = this.f15203e;
                if (!aVar.f15210g) {
                    if (!aVar.f15209f) {
                        synchronized (aVar) {
                            try {
                                if (!aVar.f15210g && aVar.f15211h != j10) {
                                    if (aVar.f15207d) {
                                        gc.a<T> aVar2 = aVar.f15208e;
                                        if (aVar2 == null) {
                                            aVar2 = new gc.a<>();
                                            aVar.f15208e = aVar2;
                                        }
                                        int i10 = aVar2.f15196c;
                                        if (i10 == 4) {
                                            Object[] objArr = new Object[5];
                                            aVar2.f15195b[4] = objArr;
                                            aVar2.f15195b = objArr;
                                            i10 = 0;
                                        }
                                        aVar2.f15195b[i10] = t10;
                                        aVar2.f15196c = i10 + 1;
                                    } else {
                                        aVar.f15206c = true;
                                        aVar.f15209f = true;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    aVar.test(t10);
                }
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x007e, code lost:
        r9 = r9.f15194a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0081, code lost:
        if (r9 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0083, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0084, code lost:
        if (r2 >= 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0086, code lost:
        r4 = r9[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0088, code lost:
        if (r4 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x008b, code lost:
        r0.test(r4);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0091, code lost:
        r9 = r9[4];
     */
    @Override // tk.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(tk.n<? super T> r9) {
        /*
            r8 = this;
            gc.b$a r0 = new gc.b$a
            r0.<init>(r9, r8)
            r9.a(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<gc.b$a<T>[]> r9 = r8.f15200b
            java.lang.Object r9 = r9.get()
            gc.b$a[] r9 = (gc.b.a[]) r9
            int r1 = r9.length
            int r2 = r1 + 1
            gc.b$a[] r2 = new gc.b.a[r2]
            r3 = 0
            java.lang.System.arraycopy(r9, r3, r2, r3, r1)
            r2[r1] = r0
            java.util.concurrent.atomic.AtomicReference<gc.b$a<T>[]> r1 = r8.f15200b
        L1d:
            boolean r4 = r1.compareAndSet(r9, r2)
            r5 = 1
            if (r4 == 0) goto L26
            r9 = 1
            goto L2d
        L26:
            java.lang.Object r4 = r1.get()
            if (r4 == r9) goto L1d
            r9 = 0
        L2d:
            if (r9 == 0) goto L8
            boolean r9 = r0.f15210g
            if (r9 == 0) goto L38
            r8.J(r0)
            goto L99
        L38:
            boolean r9 = r0.f15210g
            if (r9 == 0) goto L3d
            goto L99
        L3d:
            monitor-enter(r0)
            boolean r9 = r0.f15210g     // Catch: java.lang.Throwable -> L9a
            if (r9 == 0) goto L43
            goto L47
        L43:
            boolean r9 = r0.f15206c     // Catch: java.lang.Throwable -> L9a
            if (r9 == 0) goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            goto L99
        L49:
            gc.b<T> r9 = r0.f15205b     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.locks.Lock r1 = r9.f15201c     // Catch: java.lang.Throwable -> L9a
            r1.lock()     // Catch: java.lang.Throwable -> L9a
            long r6 = r9.f15203e     // Catch: java.lang.Throwable -> L9a
            r0.f15211h = r6     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.atomic.AtomicReference<T> r9 = r9.f15199a     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r9 = r9.get()     // Catch: java.lang.Throwable -> L9a
            r1.unlock()     // Catch: java.lang.Throwable -> L9a
            if (r9 == 0) goto L61
            r1 = 1
            goto L62
        L61:
            r1 = 0
        L62:
            r0.f15207d = r1     // Catch: java.lang.Throwable -> L9a
            r0.f15206c = r5     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            if (r9 == 0) goto L99
            r0.test(r9)
        L6c:
            boolean r9 = r0.f15210g
            if (r9 == 0) goto L71
            goto L99
        L71:
            monitor-enter(r0)
            gc.a<T> r9 = r0.f15208e     // Catch: java.lang.Throwable -> L96
            if (r9 != 0) goto L7a
            r0.f15207d = r3     // Catch: java.lang.Throwable -> L96
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            goto L99
        L7a:
            r1 = 0
            r0.f15208e = r1     // Catch: java.lang.Throwable -> L96
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            java.lang.Object[] r9 = r9.f15194a
            r1 = 4
        L81:
            if (r9 == 0) goto L6c
            r2 = 0
        L84:
            if (r2 >= r1) goto L91
            r4 = r9[r2]
            if (r4 != 0) goto L8b
            goto L91
        L8b:
            r0.test(r4)
            int r2 = r2 + 1
            goto L84
        L91:
            r9 = r9[r1]
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            goto L81
        L96:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L96
            throw r9
        L99:
            return
        L9a:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9a
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.b.z(tk.n):void");
    }
}
