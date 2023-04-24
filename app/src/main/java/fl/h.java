package fl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class h<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final long f14471b;

    /* renamed from: c */
    public final TimeUnit f14472c;

    /* renamed from: d */
    public final tk.o f14473d;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<uk.c> implements Runnable, uk.c {

        /* renamed from: a */
        public final T f14474a;

        /* renamed from: b */
        public final long f14475b;

        /* renamed from: c */
        public final b<T> f14476c;

        /* renamed from: d */
        public final AtomicBoolean f14477d = new AtomicBoolean();

        public a(T t10, long j10, b<T> bVar) {
            this.f14474a = t10;
            this.f14475b = j10;
            this.f14476c = bVar;
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f14477d.compareAndSet(false, true)) {
                b<T> bVar = this.f14476c;
                long j10 = this.f14475b;
                T t10 = this.f14474a;
                if (j10 == bVar.f14484g) {
                    bVar.f14478a.b(t10);
                    xk.b.a(this);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14478a;

        /* renamed from: b */
        public final long f14479b;

        /* renamed from: c */
        public final TimeUnit f14480c;

        /* renamed from: d */
        public final o.c f14481d;

        /* renamed from: e */
        public uk.c f14482e;

        /* renamed from: f */
        public a f14483f;

        /* renamed from: g */
        public volatile long f14484g;

        /* renamed from: h */
        public boolean f14485h;

        public b(ml.c cVar, long j10, TimeUnit timeUnit, o.c cVar2) {
            this.f14478a = cVar;
            this.f14479b = j10;
            this.f14480c = timeUnit;
            this.f14481d = cVar2;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14482e, cVar)) {
                this.f14482e = cVar;
                this.f14478a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14485h) {
                return;
            }
            long j10 = this.f14484g + 1;
            this.f14484g = j10;
            a aVar = this.f14483f;
            if (aVar != null) {
                xk.b.a(aVar);
            }
            a aVar2 = new a(t10, j10, this);
            this.f14483f = aVar2;
            xk.b.e(aVar2, this.f14481d.b(aVar2, this.f14479b, this.f14480c));
        }

        @Override // uk.c
        public final void c() {
            this.f14482e.c();
            this.f14481d.c();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14485h) {
                return;
            }
            this.f14485h = true;
            a aVar = this.f14483f;
            if (aVar != null) {
                xk.b.a(aVar);
            }
            if (aVar != null) {
                aVar.run();
            }
            this.f14478a.onComplete();
            this.f14481d.c();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14485h) {
                ol.a.a(th2);
                return;
            }
            a aVar = this.f14483f;
            if (aVar != null) {
                xk.b.a(aVar);
            }
            this.f14485h = true;
            this.f14478a.onError(th2);
            this.f14481d.c();
        }
    }

    public h(long j10, tk.l lVar, tk.o oVar, TimeUnit timeUnit) {
        super(lVar);
        this.f14471b = j10;
        this.f14472c = timeUnit;
        this.f14473d = oVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new b(new ml.c(nVar), this.f14471b, this.f14472c, this.f14473d.b()));
    }
}
