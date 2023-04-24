package fl;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class u<T, U> extends fl.a<T, U> {

    /* renamed from: b */
    public final wk.e<? super T, ? extends tk.l<? extends U>> f14677b;

    /* renamed from: c */
    public final boolean f14678c;

    /* renamed from: d */
    public final int f14679d;

    /* renamed from: e */
    public final int f14680e;

    /* loaded from: classes2.dex */
    public static final class a<T, U> extends AtomicReference<uk.c> implements tk.n<U> {

        /* renamed from: a */
        public final b<T, U> f14681a;

        /* renamed from: b */
        public volatile boolean f14682b;

        /* renamed from: c */
        public volatile nl.f<U> f14683c;

        /* renamed from: d */
        public int f14684d;

        public a(b bVar) {
            this.f14681a = bVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar) && (cVar instanceof nl.b)) {
                nl.b bVar = (nl.b) cVar;
                int d10 = bVar.d(7);
                if (d10 == 1) {
                    this.f14684d = d10;
                    this.f14683c = bVar;
                    this.f14682b = true;
                    this.f14681a.f();
                } else if (d10 == 2) {
                    this.f14684d = d10;
                    this.f14683c = bVar;
                }
            }
        }

        @Override // tk.n
        public final void b(U u10) {
            if (this.f14684d == 0) {
                b<T, U> bVar = this.f14681a;
                if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                    bVar.f14687a.b(u10);
                    if (bVar.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    nl.f fVar = this.f14683c;
                    if (fVar == null) {
                        fVar = new nl.h(bVar.f14691e);
                        this.f14683c = fVar;
                    }
                    fVar.offer(u10);
                    if (bVar.getAndIncrement() != 0) {
                        return;
                    }
                }
                bVar.g();
                return;
            }
            this.f14681a.f();
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14682b = true;
            this.f14681a.f();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14681a.f14694h.c(th2)) {
                b<T, U> bVar = this.f14681a;
                if (!bVar.f14689c) {
                    bVar.e();
                }
                this.f14682b = true;
                this.f14681a.f();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T, U> extends AtomicInteger implements uk.c, tk.n<T> {

        /* renamed from: p */
        public static final a<?, ?>[] f14685p = new a[0];

        /* renamed from: q */
        public static final a<?, ?>[] f14686q = new a[0];

        /* renamed from: a */
        public final tk.n<? super U> f14687a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends tk.l<? extends U>> f14688b;

        /* renamed from: c */
        public final boolean f14689c;

        /* renamed from: d */
        public final int f14690d;

        /* renamed from: e */
        public final int f14691e;

        /* renamed from: f */
        public volatile nl.e<U> f14692f;

        /* renamed from: g */
        public volatile boolean f14693g;

        /* renamed from: h */
        public final kl.b f14694h = new kl.b();

        /* renamed from: i */
        public volatile boolean f14695i;

        /* renamed from: j */
        public final AtomicReference<a<?, ?>[]> f14696j;

        /* renamed from: k */
        public uk.c f14697k;

        /* renamed from: l */
        public long f14698l;

        /* renamed from: m */
        public int f14699m;

        /* renamed from: n */
        public ArrayDeque f14700n;

        /* renamed from: o */
        public int f14701o;

        public b(tk.n<? super U> nVar, wk.e<? super T, ? extends tk.l<? extends U>> eVar, boolean z10, int i10, int i11) {
            this.f14687a = nVar;
            this.f14688b = eVar;
            this.f14689c = z10;
            this.f14690d = i10;
            this.f14691e = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f14700n = new ArrayDeque(i10);
            }
            this.f14696j = new AtomicReference<>(f14685p);
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14697k, cVar)) {
                this.f14697k = cVar;
                this.f14687a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14693g) {
                return;
            }
            try {
                tk.l<? extends U> apply = this.f14688b.apply(t10);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                tk.l<? extends U> lVar = apply;
                if (this.f14690d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i10 = this.f14701o;
                        if (i10 == this.f14690d) {
                            this.f14700n.offer(lVar);
                            return;
                        }
                        this.f14701o = i10 + 1;
                    }
                }
                i(lVar);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f14697k.c();
                onError(th2);
            }
        }

        @Override // uk.c
        public final void c() {
            this.f14695i = true;
            if (e()) {
                this.f14694h.d();
            }
        }

        public final boolean d() {
            if (this.f14695i) {
                return true;
            }
            Throwable th2 = this.f14694h.get();
            if (this.f14689c || th2 == null) {
                return false;
            }
            e();
            this.f14694h.f(this.f14687a);
            return true;
        }

        public final boolean e() {
            this.f14697k.c();
            AtomicReference<a<?, ?>[]> atomicReference = this.f14696j;
            a<?, ?>[] aVarArr = f14686q;
            a<?, ?>[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet != aVarArr) {
                for (a<?, ?> aVar : andSet) {
                    aVar.getClass();
                    xk.b.a(aVar);
                }
                return true;
            }
            return false;
        }

        public final void f() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        public final void g() {
            int i10;
            tk.n<? super U> nVar = this.f14687a;
            int i11 = 1;
            while (!d()) {
                nl.e<U> eVar = this.f14692f;
                int i12 = 0;
                if (eVar != null) {
                    while (!d()) {
                        Object obj = (U) eVar.poll();
                        if (obj != null) {
                            nVar.b(obj);
                            i12++;
                        }
                    }
                    return;
                }
                if (i12 != 0) {
                    if (this.f14690d != Integer.MAX_VALUE) {
                        j(i12);
                    }
                } else {
                    boolean z10 = this.f14693g;
                    nl.e<U> eVar2 = this.f14692f;
                    a<?, ?>[] aVarArr = this.f14696j.get();
                    int length = aVarArr.length;
                    if (this.f14690d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            i10 = this.f14700n.size();
                        }
                    } else {
                        i10 = 0;
                    }
                    if (z10 && ((eVar2 == null || eVar2.isEmpty()) && length == 0 && i10 == 0)) {
                        this.f14694h.f(this.f14687a);
                        return;
                    }
                    if (length != 0) {
                        int min = Math.min(length - 1, this.f14699m);
                        for (int i13 = 0; i13 < length; i13++) {
                            if (d()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[min];
                            nl.f<U> fVar = aVar.f14683c;
                            if (fVar != null) {
                                while (true) {
                                    try {
                                        Object obj2 = (U) fVar.poll();
                                        if (obj2 == null) {
                                            break;
                                        }
                                        nVar.b(obj2);
                                        if (d()) {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        h7.a.y(th2);
                                        xk.b.a(aVar);
                                        this.f14694h.c(th2);
                                        if (d()) {
                                            return;
                                        }
                                        h(aVar);
                                        i12++;
                                        min++;
                                        if (min != length) {
                                        }
                                    }
                                }
                            }
                            boolean z11 = aVar.f14682b;
                            nl.f<U> fVar2 = aVar.f14683c;
                            if (z11 && (fVar2 == null || fVar2.isEmpty())) {
                                h(aVar);
                                i12++;
                            }
                            min++;
                            if (min != length) {
                            }
                            min = 0;
                        }
                        this.f14699m = min;
                    }
                    if (i12 != 0) {
                        if (this.f14690d != Integer.MAX_VALUE) {
                            j(i12);
                        }
                    } else {
                        i11 = addAndGet(-i11);
                        if (i11 == 0) {
                            return;
                        }
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x003e, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(fl.u.a<T, U> r8) {
            /*
                r7 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<fl.u$a<?, ?>[]> r0 = r7.f14696j
                java.lang.Object r0 = r0.get()
                fl.u$a[] r0 = (fl.u.a[]) r0
                int r1 = r0.length
                r2 = 0
                r3 = 0
            Lb:
                if (r3 >= r1) goto L15
                r4 = r0[r3]
                if (r4 != r8) goto L12
                goto L16
            L12:
                int r3 = r3 + 1
                goto Lb
            L15:
                r3 = -1
            L16:
                if (r3 >= 0) goto L19
                return
            L19:
                r4 = 1
                if (r1 != r4) goto L1f
                fl.u$a<?, ?>[] r1 = fl.u.b.f14685p
                goto L2e
            L1f:
                int r5 = r1 + (-1)
                fl.u$a[] r5 = new fl.u.a[r5]
                java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                int r6 = r3 + 1
                int r1 = r1 - r3
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r6, r5, r3, r1)
                r1 = r5
            L2e:
                java.util.concurrent.atomic.AtomicReference<fl.u$a<?, ?>[]> r3 = r7.f14696j
            L30:
                boolean r5 = r3.compareAndSet(r0, r1)
                if (r5 == 0) goto L38
                r2 = 1
                goto L3e
            L38:
                java.lang.Object r5 = r3.get()
                if (r5 == r0) goto L30
            L3e:
                if (r2 == 0) goto L0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fl.u.b.h(fl.u$a):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:89:0x0027, code lost:
            if (decrementAndGet() == 0) goto L46;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v11, types: [nl.f] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void i(tk.l<? extends U> r8) {
            /*
                r7 = this;
            L0:
                boolean r0 = r8 instanceof wk.g
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L80
                wk.g r8 = (wk.g) r8
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L52
                if (r8 != 0) goto L12
                goto L5e
            L12:
                int r3 = r7.get()
                if (r3 != 0) goto L2a
                boolean r3 = r7.compareAndSet(r1, r2)
                if (r3 == 0) goto L2a
                tk.n<? super U> r3 = r7.f14687a
                r3.b(r8)
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L4e
                goto L5e
            L2a:
                nl.e<U> r3 = r7.f14692f
                if (r3 != 0) goto L43
                int r3 = r7.f14690d
                if (r3 != r0) goto L3a
                nl.h r3 = new nl.h
                int r4 = r7.f14691e
                r3.<init>(r4)
                goto L41
            L3a:
                nl.g r3 = new nl.g
                int r4 = r7.f14690d
                r3.<init>(r4)
            L41:
                r7.f14692f = r3
            L43:
                r3.offer(r8)
                int r8 = r7.getAndIncrement()
                if (r8 == 0) goto L4e
                r8 = 0
                goto L5f
            L4e:
                r7.g()
                goto L5e
            L52:
                r8 = move-exception
                h7.a.y(r8)
                kl.b r3 = r7.f14694h
                r3.c(r8)
                r7.f()
            L5e:
                r8 = 1
            L5f:
                if (r8 == 0) goto Lbf
                int r8 = r7.f14690d
                if (r8 == r0) goto Lbf
                monitor-enter(r7)
                java.util.ArrayDeque r8 = r7.f14700n     // Catch: java.lang.Throwable -> L7d
                java.lang.Object r8 = r8.poll()     // Catch: java.lang.Throwable -> L7d
                tk.l r8 = (tk.l) r8     // Catch: java.lang.Throwable -> L7d
                if (r8 != 0) goto L76
                int r0 = r7.f14701o     // Catch: java.lang.Throwable -> L7d
                int r0 = r0 - r2
                r7.f14701o = r0     // Catch: java.lang.Throwable -> L7d
                r1 = 1
            L76:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7d
                if (r1 == 0) goto L0
                r7.f()
                goto Lbf
            L7d:
                r8 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L7d
                throw r8
            L80:
                fl.u$a r0 = new fl.u$a
                long r3 = r7.f14698l
                r5 = 1
                long r3 = r3 + r5
                r7.f14698l = r3
                r0.<init>(r7)
            L8c:
                java.util.concurrent.atomic.AtomicReference<fl.u$a<?, ?>[]> r3 = r7.f14696j
                java.lang.Object r3 = r3.get()
                fl.u$a[] r3 = (fl.u.a[]) r3
                fl.u$a<?, ?>[] r4 = fl.u.b.f14686q
                if (r3 != r4) goto L9c
                xk.b.a(r0)
                goto Lba
            L9c:
                int r4 = r3.length
                int r5 = r4 + 1
                fl.u$a[] r5 = new fl.u.a[r5]
                java.lang.System.arraycopy(r3, r1, r5, r1, r4)
                r5[r4] = r0
                java.util.concurrent.atomic.AtomicReference<fl.u$a<?, ?>[]> r4 = r7.f14696j
            La8:
                boolean r6 = r4.compareAndSet(r3, r5)
                if (r6 == 0) goto Lb0
                r3 = 1
                goto Lb7
            Lb0:
                java.lang.Object r6 = r4.get()
                if (r6 == r3) goto La8
                r3 = 0
            Lb7:
                if (r3 == 0) goto L8c
                r1 = 1
            Lba:
                if (r1 == 0) goto Lbf
                r8.d(r0)
            Lbf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fl.u.b.i(tk.l):void");
        }

        public final void j(int i10) {
            while (true) {
                int i11 = i10 - 1;
                if (i10 == 0) {
                    return;
                }
                synchronized (this) {
                    tk.l<? extends U> lVar = (tk.l) this.f14700n.poll();
                    if (lVar == null) {
                        this.f14701o--;
                    } else {
                        i(lVar);
                    }
                }
                i10 = i11;
            }
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14693g) {
                return;
            }
            this.f14693g = true;
            f();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14693g) {
                ol.a.a(th2);
            } else if (this.f14694h.c(th2)) {
                this.f14693g = true;
                f();
            }
        }
    }

    public u(tk.l lVar, wk.e eVar, int i10, int i11) {
        super(lVar);
        this.f14677b = eVar;
        this.f14678c = false;
        this.f14679d = i10;
        this.f14680e = i11;
    }

    @Override // tk.i
    public final void z(tk.n<? super U> nVar) {
        if (s0.a(this.f14315a, nVar, this.f14677b)) {
            return;
        }
        this.f14315a.d(new b(nVar, this.f14677b, this.f14678c, this.f14679d, this.f14680e));
    }
}
