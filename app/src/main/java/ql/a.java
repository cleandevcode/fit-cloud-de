package ql;

import ij.c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kl.a;
import kl.d;
import kl.e;
import tk.n;

/* loaded from: classes2.dex */
public final class a<T> extends d<T> {

    /* renamed from: g */
    public static final C0452a[] f24948g = new C0452a[0];

    /* renamed from: h */
    public static final C0452a[] f24949h = new C0452a[0];

    /* renamed from: a */
    public final AtomicReference<Object> f24950a;

    /* renamed from: b */
    public final AtomicReference<C0452a<T>[]> f24951b;

    /* renamed from: c */
    public final Lock f24952c;

    /* renamed from: d */
    public final Lock f24953d;

    /* renamed from: e */
    public final AtomicReference<Throwable> f24954e;

    /* renamed from: f */
    public long f24955f;

    /* renamed from: ql.a$a */
    /* loaded from: classes2.dex */
    public static final class C0452a<T> implements uk.c, a.InterfaceC0322a<Object> {

        /* renamed from: a */
        public final n<? super T> f24956a;

        /* renamed from: b */
        public final a<T> f24957b;

        /* renamed from: c */
        public boolean f24958c;

        /* renamed from: d */
        public boolean f24959d;

        /* renamed from: e */
        public kl.a<Object> f24960e;

        /* renamed from: f */
        public boolean f24961f;

        /* renamed from: g */
        public volatile boolean f24962g;

        /* renamed from: h */
        public long f24963h;

        public C0452a(n<? super T> nVar, a<T> aVar) {
            this.f24956a = nVar;
            this.f24957b = aVar;
        }

        public final void a(long j10, Object obj) {
            if (this.f24962g) {
                return;
            }
            if (!this.f24961f) {
                synchronized (this) {
                    if (this.f24962g) {
                        return;
                    }
                    if (this.f24963h == j10) {
                        return;
                    }
                    if (this.f24959d) {
                        kl.a<Object> aVar = this.f24960e;
                        if (aVar == null) {
                            aVar = new kl.a<>();
                            this.f24960e = aVar;
                        }
                        aVar.a(obj);
                        return;
                    }
                    this.f24958c = true;
                    this.f24961f = true;
                }
            }
            test(obj);
        }

        @Override // uk.c
        public final void c() {
            if (this.f24962g) {
                return;
            }
            this.f24962g = true;
            this.f24957b.H(this);
        }

        @Override // kl.a.InterfaceC0322a, wk.f
        public final boolean test(Object obj) {
            return this.f24962g || kl.e.a(this.f24956a, obj);
        }
    }

    public a(c.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f24952c = reentrantReadWriteLock.readLock();
        this.f24953d = reentrantReadWriteLock.writeLock();
        this.f24951b = new AtomicReference<>(f24948g);
        this.f24950a = new AtomicReference<>(aVar);
        this.f24954e = new AtomicReference<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0042, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(ql.a.C0452a<T> r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<ql.a$a<T>[]> r0 = r7.f24951b
            java.lang.Object r0 = r0.get()
            ql.a$a[] r0 = (ql.a.C0452a[]) r0
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
            ql.a$a[] r1 = ql.a.f24948g
            goto L32
        L23:
            int r5 = r1 + (-1)
            ql.a$a[] r5 = new ql.a.C0452a[r5]
            java.lang.System.arraycopy(r0, r3, r5, r3, r2)
            int r6 = r2 + 1
            int r1 = r1 - r2
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r6, r5, r2, r1)
            r1 = r5
        L32:
            java.util.concurrent.atomic.AtomicReference<ql.a$a<T>[]> r2 = r7.f24951b
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
        throw new UnsupportedOperationException("Method not decompiled: ql.a.H(ql.a$a):void");
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        if (this.f24954e.get() != null) {
            cVar.c();
        }
    }

    @Override // tk.n
    public final void b(T t10) {
        kl.d.b(t10, "onNext called with a null value.");
        if (this.f24954e.get() != null) {
            return;
        }
        this.f24953d.lock();
        this.f24955f++;
        this.f24950a.lazySet(t10);
        this.f24953d.unlock();
        for (C0452a<T> c0452a : this.f24951b.get()) {
            c0452a.a(this.f24955f, t10);
        }
    }

    @Override // tk.n
    public final void onComplete() {
        int i10;
        boolean z10;
        AtomicReference<Throwable> atomicReference = this.f24954e;
        d.a aVar = kl.d.f18620a;
        while (true) {
            if (atomicReference.compareAndSet(null, aVar)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != null) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            return;
        }
        kl.e eVar = kl.e.f18621a;
        this.f24953d.lock();
        this.f24955f++;
        this.f24950a.lazySet(eVar);
        this.f24953d.unlock();
        for (C0452a<T> c0452a : this.f24951b.getAndSet(f24949h)) {
            c0452a.a(this.f24955f, eVar);
        }
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        int i10;
        boolean z10;
        kl.d.b(th2, "onError called with a null Throwable.");
        AtomicReference<Throwable> atomicReference = this.f24954e;
        while (true) {
            if (atomicReference.compareAndSet(null, th2)) {
                z10 = true;
                break;
            } else if (atomicReference.get() != null) {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            ol.a.a(th2);
            return;
        }
        e.b bVar = new e.b(th2);
        this.f24953d.lock();
        this.f24955f++;
        this.f24950a.lazySet(bVar);
        this.f24953d.unlock();
        for (C0452a<T> c0452a : this.f24951b.getAndSet(f24949h)) {
            c0452a.a(this.f24955f, bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x008b, code lost:
        r8.b(r0);
     */
    @Override // tk.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(tk.n<? super T> r8) {
        /*
            r7 = this;
            ql.a$a r0 = new ql.a$a
            r0.<init>(r8, r7)
            r8.a(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<ql.a$a<T>[]> r1 = r7.f24951b
            java.lang.Object r1 = r1.get()
            ql.a$a[] r1 = (ql.a.C0452a[]) r1
            ql.a$a[] r2 = ql.a.f24949h
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L18
            r1 = 0
            goto L36
        L18:
            int r2 = r1.length
            int r5 = r2 + 1
            ql.a$a[] r5 = new ql.a.C0452a[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<ql.a$a<T>[]> r2 = r7.f24951b
        L24:
            boolean r6 = r2.compareAndSet(r1, r5)
            if (r6 == 0) goto L2c
            r1 = 1
            goto L33
        L2c:
            java.lang.Object r6 = r2.get()
            if (r6 == r1) goto L24
            r1 = 0
        L33:
            if (r1 == 0) goto L8
            r1 = 1
        L36:
            if (r1 == 0) goto L95
            boolean r8 = r0.f24962g
            if (r8 == 0) goto L41
            r7.H(r0)
            goto La8
        L41:
            boolean r8 = r0.f24962g
            if (r8 == 0) goto L46
            goto La8
        L46:
            monitor-enter(r0)
            boolean r8 = r0.f24962g     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L4c
            goto L50
        L4c:
            boolean r8 = r0.f24958c     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L52
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L92
            goto La8
        L52:
            ql.a<T> r8 = r0.f24957b     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.locks.Lock r1 = r8.f24952c     // Catch: java.lang.Throwable -> L92
            r1.lock()     // Catch: java.lang.Throwable -> L92
            long r5 = r8.f24955f     // Catch: java.lang.Throwable -> L92
            r0.f24963h = r5     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.f24950a     // Catch: java.lang.Throwable -> L92
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L92
            r1.unlock()     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L6a
            r1 = 1
            goto L6b
        L6a:
            r1 = 0
        L6b:
            r0.f24959d = r1     // Catch: java.lang.Throwable -> L92
            r0.f24958c = r4     // Catch: java.lang.Throwable -> L92
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto La8
            boolean r8 = r0.test(r8)
            if (r8 == 0) goto L79
            goto La8
        L79:
            boolean r8 = r0.f24962g
            if (r8 == 0) goto L7e
            goto La8
        L7e:
            monitor-enter(r0)
            kl.a<java.lang.Object> r8 = r0.f24960e     // Catch: java.lang.Throwable -> L8f
            if (r8 != 0) goto L87
            r0.f24959d = r3     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            goto La8
        L87:
            r1 = 0
            r0.f24960e = r1     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            r8.b(r0)
            goto L79
        L8f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8
        L92:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L92
            throw r8
        L95:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.f24954e
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kl.d$a r1 = kl.d.f18620a
            if (r0 != r1) goto La5
            r8.onComplete()
            goto La8
        La5:
            r8.onError(r0)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.a.z(tk.n):void");
    }
}
