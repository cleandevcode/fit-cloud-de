package ql;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nl.h;
import tk.n;

/* loaded from: classes2.dex */
public final class e<T> extends d<T> {

    /* renamed from: a */
    public final h<T> f24974a;

    /* renamed from: c */
    public final AtomicReference<Runnable> f24976c;

    /* renamed from: e */
    public volatile boolean f24978e;

    /* renamed from: f */
    public volatile boolean f24979f;

    /* renamed from: g */
    public Throwable f24980g;

    /* renamed from: j */
    public boolean f24983j;

    /* renamed from: d */
    public final boolean f24977d = true;

    /* renamed from: b */
    public final AtomicReference<n<? super T>> f24975b = new AtomicReference<>();

    /* renamed from: h */
    public final AtomicBoolean f24981h = new AtomicBoolean();

    /* renamed from: i */
    public final a f24982i = new a();

    /* loaded from: classes2.dex */
    public final class a extends al.b<T> {
        public a() {
            e.this = r1;
        }

        @Override // uk.c
        public final void c() {
            if (e.this.f24978e) {
                return;
            }
            e.this.f24978e = true;
            e.this.H();
            e.this.f24975b.lazySet(null);
            if (e.this.f24982i.getAndIncrement() == 0) {
                e.this.f24975b.lazySet(null);
                e eVar = e.this;
                if (eVar.f24983j) {
                    return;
                }
                eVar.f24974a.clear();
            }
        }

        @Override // nl.f
        public final void clear() {
            e.this.f24974a.clear();
        }

        @Override // nl.c
        public final int d(int i10) {
            if ((i10 & 2) != 0) {
                e.this.f24983j = true;
                return 2;
            }
            return 0;
        }

        @Override // nl.f
        public final boolean isEmpty() {
            return e.this.f24974a.isEmpty();
        }

        @Override // nl.f
        public final T poll() {
            return e.this.f24974a.poll();
        }
    }

    public e(int i10, Runnable runnable) {
        this.f24974a = new h<>(i10);
        this.f24976c = new AtomicReference<>(runnable);
    }

    public final void H() {
        boolean z10;
        Runnable runnable = this.f24976c.get();
        if (runnable != null) {
            AtomicReference<Runnable> atomicReference = this.f24976c;
            while (true) {
                if (!atomicReference.compareAndSet(runnable, null)) {
                    if (atomicReference.get() != runnable) {
                        z10 = false;
                        break;
                    }
                } else {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                runnable.run();
            }
        }
    }

    public final void I() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f24982i.getAndIncrement() != 0) {
            return;
        }
        n<? super T> nVar = this.f24975b.get();
        int i10 = 1;
        while (nVar == null) {
            i10 = this.f24982i.addAndGet(-i10);
            if (i10 == 0) {
                return;
            }
            nVar = this.f24975b.get();
        }
        if (this.f24983j) {
            h<T> hVar = this.f24974a;
            boolean z13 = !this.f24977d;
            int i11 = 1;
            while (!this.f24978e) {
                boolean z14 = this.f24979f;
                if (z13 && z14) {
                    Throwable th2 = this.f24980g;
                    if (th2 != null) {
                        this.f24975b.lazySet(null);
                        hVar.clear();
                        nVar.onError(th2);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        return;
                    }
                }
                nVar.b(null);
                if (z14) {
                    this.f24975b.lazySet(null);
                    Throwable th3 = this.f24980g;
                    if (th3 != null) {
                        nVar.onError(th3);
                        return;
                    } else {
                        nVar.onComplete();
                        return;
                    }
                }
                i11 = this.f24982i.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
            this.f24975b.lazySet(null);
            return;
        }
        h<T> hVar2 = this.f24974a;
        boolean z15 = !this.f24977d;
        boolean z16 = true;
        int i12 = 1;
        while (!this.f24978e) {
            boolean z17 = this.f24979f;
            Object obj = (T) this.f24974a.poll();
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z17) {
                if (z15 && z16) {
                    Throwable th4 = this.f24980g;
                    if (th4 != null) {
                        this.f24975b.lazySet(null);
                        hVar2.clear();
                        nVar.onError(th4);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        z16 = false;
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f24975b.lazySet(null);
                    Throwable th5 = this.f24980g;
                    if (th5 != null) {
                        nVar.onError(th5);
                        return;
                    } else {
                        nVar.onComplete();
                        return;
                    }
                }
            }
            if (z10) {
                i12 = this.f24982i.addAndGet(-i12);
                if (i12 == 0) {
                    return;
                }
            } else {
                nVar.b(obj);
            }
        }
        this.f24975b.lazySet(null);
        hVar2.clear();
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        if (this.f24979f || this.f24978e) {
            cVar.c();
        }
    }

    @Override // tk.n
    public final void b(T t10) {
        kl.d.b(t10, "onNext called with a null value.");
        if (this.f24979f || this.f24978e) {
            return;
        }
        this.f24974a.offer(t10);
        I();
    }

    @Override // tk.n
    public final void onComplete() {
        if (this.f24979f || this.f24978e) {
            return;
        }
        this.f24979f = true;
        H();
        I();
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        kl.d.b(th2, "onError called with a null Throwable.");
        if (this.f24979f || this.f24978e) {
            ol.a.a(th2);
            return;
        }
        this.f24980g = th2;
        this.f24979f = true;
        H();
        I();
    }

    @Override // tk.i
    public final void z(n<? super T> nVar) {
        if (this.f24981h.get() || !this.f24981h.compareAndSet(false, true)) {
            IllegalStateException illegalStateException = new IllegalStateException("Only a single observer allowed.");
            nVar.a(xk.c.INSTANCE);
            nVar.onError(illegalStateException);
            return;
        }
        nVar.a(this.f24982i);
        this.f24975b.lazySet(nVar);
        if (this.f24978e) {
            this.f24975b.lazySet(null);
        } else {
            I();
        }
    }
}
