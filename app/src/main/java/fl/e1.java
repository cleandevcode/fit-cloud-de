package fl;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e1<T, B> extends fl.a<T, tk.i<T>> {

    /* renamed from: b */
    public final tk.l<B> f14438b;

    /* renamed from: c */
    public final int f14439c;

    /* loaded from: classes2.dex */
    public static final class a<T, B> extends ml.a<B> {

        /* renamed from: b */
        public final b<T, B> f14440b;

        /* renamed from: c */
        public boolean f14441c;

        public a(b<T, B> bVar) {
            this.f14440b = bVar;
        }

        @Override // tk.n
        public final void b(B b10) {
            if (this.f14441c) {
                return;
            }
            b<T, B> bVar = this.f14440b;
            bVar.f14448f.offer(b.f14442k);
            bVar.d();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14441c) {
                return;
            }
            this.f14441c = true;
            b<T, B> bVar = this.f14440b;
            xk.b.a(bVar.f14446d);
            bVar.f14451i = true;
            bVar.d();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14441c) {
                ol.a.a(th2);
                return;
            }
            this.f14441c = true;
            b<T, B> bVar = this.f14440b;
            xk.b.a(bVar.f14446d);
            if (bVar.f14449g.c(th2)) {
                bVar.f14451i = true;
                bVar.d();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T, B> extends AtomicInteger implements tk.n<T>, uk.c, Runnable {

        /* renamed from: k */
        public static final Object f14442k = new Object();

        /* renamed from: a */
        public final tk.n<? super tk.i<T>> f14443a;

        /* renamed from: b */
        public final int f14444b;

        /* renamed from: c */
        public final a<T, B> f14445c = new a<>(this);

        /* renamed from: d */
        public final AtomicReference<uk.c> f14446d = new AtomicReference<>();

        /* renamed from: e */
        public final AtomicInteger f14447e = new AtomicInteger(1);

        /* renamed from: f */
        public final hl.a<Object> f14448f = new hl.a<>();

        /* renamed from: g */
        public final kl.b f14449g = new kl.b();

        /* renamed from: h */
        public final AtomicBoolean f14450h = new AtomicBoolean();

        /* renamed from: i */
        public volatile boolean f14451i;

        /* renamed from: j */
        public ql.e<T> f14452j;

        public b(tk.n<? super tk.i<T>> nVar, int i10) {
            this.f14443a = nVar;
            this.f14444b = i10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.h(this.f14446d, cVar)) {
                this.f14448f.offer(f14442k);
                d();
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            this.f14448f.offer(t10);
            d();
        }

        @Override // uk.c
        public final void c() {
            if (this.f14450h.compareAndSet(false, true)) {
                this.f14445c.c();
                if (this.f14447e.decrementAndGet() == 0) {
                    xk.b.a(this.f14446d);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            tk.n<? super tk.i<T>> nVar = this.f14443a;
            hl.a<Object> aVar = this.f14448f;
            kl.b bVar = this.f14449g;
            int i10 = 1;
            while (this.f14447e.get() != 0) {
                ql.e<T> eVar = this.f14452j;
                boolean z11 = this.f14451i;
                if (z11 && bVar.get() != null) {
                    aVar.clear();
                    Throwable a10 = bVar.a();
                    if (eVar != 0) {
                        this.f14452j = null;
                        eVar.onError(a10);
                    }
                    nVar.onError(a10);
                    return;
                }
                Object poll = aVar.poll();
                boolean z12 = false;
                if (poll == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z11 && z10) {
                    Throwable a11 = bVar.a();
                    if (a11 == null) {
                        if (eVar != 0) {
                            this.f14452j = null;
                            eVar.onComplete();
                        }
                        nVar.onComplete();
                        return;
                    }
                    if (eVar != 0) {
                        this.f14452j = null;
                        eVar.onError(a11);
                    }
                    nVar.onError(a11);
                    return;
                } else if (z10) {
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else if (poll != f14442k) {
                    eVar.b(poll);
                } else {
                    if (eVar != 0) {
                        this.f14452j = null;
                        eVar.onComplete();
                    }
                    if (!this.f14450h.get()) {
                        int i11 = this.f14444b;
                        yk.b.a(i11, "capacityHint");
                        ql.e<T> eVar2 = new ql.e<>(i11, this);
                        this.f14452j = eVar2;
                        this.f14447e.getAndIncrement();
                        f1 f1Var = new f1(eVar2);
                        nVar.b(f1Var);
                        if (!f1Var.f14467b.get() && f1Var.f14467b.compareAndSet(false, true)) {
                            z12 = true;
                        }
                        if (z12) {
                            eVar2.onComplete();
                        }
                    }
                }
            }
            aVar.clear();
            this.f14452j = null;
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14445c.c();
            this.f14451i = true;
            d();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14445c.c();
            if (this.f14449g.c(th2)) {
                this.f14451i = true;
                d();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f14447e.decrementAndGet() == 0) {
                xk.b.a(this.f14446d);
            }
        }
    }

    public e1(tk.l lVar, tk.i iVar, int i10) {
        super(lVar);
        this.f14438b = iVar;
        this.f14439c = i10;
    }

    @Override // tk.i
    public final void z(tk.n<? super tk.i<T>> nVar) {
        b bVar = new b(nVar, this.f14439c);
        nVar.a(bVar);
        this.f14438b.d(bVar.f14445c);
        this.f14315a.d(bVar);
    }
}
