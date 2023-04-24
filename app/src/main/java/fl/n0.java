package fl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class n0<T> extends tk.i<T> {

    /* renamed from: a */
    public final gc.d f14572a;

    /* renamed from: b */
    public final int f14573b;

    /* renamed from: c */
    public a f14574c;

    /* loaded from: classes2.dex */
    public static final class a extends AtomicReference<uk.c> implements Runnable, wk.d<uk.c> {

        /* renamed from: a */
        public final n0<?> f14575a;

        /* renamed from: b */
        public long f14576b;

        /* renamed from: c */
        public boolean f14577c;

        /* renamed from: d */
        public boolean f14578d;

        public a(n0<?> n0Var) {
            this.f14575a = n0Var;
        }

        @Override // wk.d
        public final void accept(uk.c cVar) {
            xk.b.e(this, cVar);
            synchronized (this.f14575a) {
                if (this.f14578d) {
                    this.f14575a.f14572a.I();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f14575a.H(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends AtomicBoolean implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14579a;

        /* renamed from: b */
        public final n0<T> f14580b;

        /* renamed from: c */
        public final a f14581c;

        /* renamed from: d */
        public uk.c f14582d;

        public b(tk.n<? super T> nVar, n0<T> n0Var, a aVar) {
            this.f14579a = nVar;
            this.f14580b = n0Var;
            this.f14581c = aVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14582d, cVar)) {
                this.f14582d = cVar;
                this.f14579a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            this.f14579a.b(t10);
        }

        @Override // uk.c
        public final void c() {
            this.f14582d.c();
            if (compareAndSet(false, true)) {
                n0<T> n0Var = this.f14580b;
                a aVar = this.f14581c;
                synchronized (n0Var) {
                    a aVar2 = n0Var.f14574c;
                    if (aVar2 != null && aVar2 == aVar) {
                        long j10 = aVar.f14576b - 1;
                        aVar.f14576b = j10;
                        if (j10 == 0 && aVar.f14577c) {
                            n0Var.H(aVar);
                        }
                    }
                }
            }
        }

        @Override // tk.n
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f14580b.G(this.f14581c);
                this.f14579a.onComplete();
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                ol.a.a(th2);
                return;
            }
            this.f14580b.G(this.f14581c);
            this.f14579a.onError(th2);
        }
    }

    public n0(gc.d dVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f14572a = dVar;
        this.f14573b = 1;
    }

    public final void G(a aVar) {
        synchronized (this) {
            if (this.f14574c == aVar) {
                aVar.getClass();
                long j10 = aVar.f14576b - 1;
                aVar.f14576b = j10;
                if (j10 == 0) {
                    this.f14574c = null;
                    this.f14572a.I();
                }
            }
        }
    }

    public final void H(a aVar) {
        synchronized (this) {
            if (aVar.f14576b == 0 && aVar == this.f14574c) {
                this.f14574c = null;
                uk.c cVar = aVar.get();
                xk.b.a(aVar);
                if (cVar == null) {
                    aVar.f14578d = true;
                } else {
                    this.f14572a.I();
                }
            }
        }
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        a aVar;
        boolean z10;
        synchronized (this) {
            aVar = this.f14574c;
            if (aVar == null) {
                aVar = new a(this);
                this.f14574c = aVar;
            }
            long j10 = aVar.f14576b;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            long j11 = j10 + 1;
            aVar.f14576b = j11;
            z10 = true;
            if (aVar.f14577c || j11 != this.f14573b) {
                z10 = false;
            } else {
                aVar.f14577c = true;
            }
        }
        this.f14572a.d(new b(nVar, this, aVar));
        if (z10) {
            this.f14572a.G(aVar);
        }
    }
}
