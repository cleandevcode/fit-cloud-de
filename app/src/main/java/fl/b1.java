package fl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class b1<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final long f14360b;

    /* renamed from: c */
    public final TimeUnit f14361c;

    /* renamed from: d */
    public final tk.o f14362d;

    /* renamed from: e */
    public final tk.l<? extends T> f14363e;

    /* loaded from: classes2.dex */
    public static final class a<T> implements tk.n<T> {

        /* renamed from: a */
        public final tk.n<? super T> f14364a;

        /* renamed from: b */
        public final AtomicReference<uk.c> f14365b;

        public a(tk.n<? super T> nVar, AtomicReference<uk.c> atomicReference) {
            this.f14364a = nVar;
            this.f14365b = atomicReference;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.e(this.f14365b, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            this.f14364a.b(t10);
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14364a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f14364a.onError(th2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends AtomicReference<uk.c> implements tk.n<T>, uk.c, d {

        /* renamed from: a */
        public final tk.n<? super T> f14366a;

        /* renamed from: b */
        public final long f14367b;

        /* renamed from: c */
        public final TimeUnit f14368c;

        /* renamed from: d */
        public final o.c f14369d;

        /* renamed from: e */
        public final xk.e f14370e = new xk.e();

        /* renamed from: f */
        public final AtomicLong f14371f = new AtomicLong();

        /* renamed from: g */
        public final AtomicReference<uk.c> f14372g = new AtomicReference<>();

        /* renamed from: h */
        public tk.l<? extends T> f14373h;

        public b(tk.n<? super T> nVar, long j10, TimeUnit timeUnit, o.c cVar, tk.l<? extends T> lVar) {
            this.f14366a = nVar;
            this.f14367b = j10;
            this.f14368c = timeUnit;
            this.f14369d = cVar;
            this.f14373h = lVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.h(this.f14372g, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            long j10 = this.f14371f.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f14371f.compareAndSet(j10, j11)) {
                    this.f14370e.get().c();
                    this.f14366a.b(t10);
                    xk.e eVar = this.f14370e;
                    uk.c b10 = this.f14369d.b(new e(j11, this), this.f14367b, this.f14368c);
                    eVar.getClass();
                    xk.b.e(eVar, b10);
                }
            }
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this.f14372g);
            xk.b.a(this);
            this.f14369d.c();
        }

        @Override // fl.b1.d
        public final void d(long j10) {
            if (this.f14371f.compareAndSet(j10, Long.MAX_VALUE)) {
                xk.b.a(this.f14372g);
                tk.l<? extends T> lVar = this.f14373h;
                this.f14373h = null;
                lVar.d(new a(this.f14366a, this));
                this.f14369d.c();
            }
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14371f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                xk.e eVar = this.f14370e;
                eVar.getClass();
                xk.b.a(eVar);
                this.f14366a.onComplete();
                this.f14369d.c();
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14371f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                xk.e eVar = this.f14370e;
                eVar.getClass();
                xk.b.a(eVar);
                this.f14366a.onError(th2);
                this.f14369d.c();
                return;
            }
            ol.a.a(th2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> extends AtomicLong implements tk.n<T>, uk.c, d {

        /* renamed from: a */
        public final tk.n<? super T> f14374a;

        /* renamed from: b */
        public final long f14375b;

        /* renamed from: c */
        public final TimeUnit f14376c;

        /* renamed from: d */
        public final o.c f14377d;

        /* renamed from: e */
        public final xk.e f14378e = new xk.e();

        /* renamed from: f */
        public final AtomicReference<uk.c> f14379f = new AtomicReference<>();

        public c(tk.n<? super T> nVar, long j10, TimeUnit timeUnit, o.c cVar) {
            this.f14374a = nVar;
            this.f14375b = j10;
            this.f14376c = timeUnit;
            this.f14377d = cVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.h(this.f14379f, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    this.f14378e.get().c();
                    this.f14374a.b(t10);
                    xk.e eVar = this.f14378e;
                    uk.c b10 = this.f14377d.b(new e(j11, this), this.f14375b, this.f14376c);
                    eVar.getClass();
                    xk.b.e(eVar, b10);
                }
            }
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this.f14379f);
            this.f14377d.c();
        }

        @Override // fl.b1.d
        public final void d(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                xk.b.a(this.f14379f);
                this.f14374a.onError(new TimeoutException(kl.d.c(this.f14375b, this.f14376c)));
                this.f14377d.c();
            }
        }

        @Override // tk.n
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                xk.e eVar = this.f14378e;
                eVar.getClass();
                xk.b.a(eVar);
                this.f14374a.onComplete();
                this.f14377d.c();
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                xk.e eVar = this.f14378e;
                eVar.getClass();
                xk.b.a(eVar);
                this.f14374a.onError(th2);
                this.f14377d.c();
                return;
            }
            ol.a.a(th2);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void d(long j10);
    }

    /* loaded from: classes2.dex */
    public static final class e implements Runnable {

        /* renamed from: a */
        public final d f14380a;

        /* renamed from: b */
        public final long f14381b;

        public e(long j10, d dVar) {
            this.f14381b = j10;
            this.f14380a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f14380a.d(this.f14381b);
        }
    }

    public b1(tk.i iVar, long j10, TimeUnit timeUnit, tk.o oVar, tk.i iVar2) {
        super(iVar);
        this.f14360b = j10;
        this.f14361c = timeUnit;
        this.f14362d = oVar;
        this.f14363e = iVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        b bVar;
        if (this.f14363e == null) {
            c cVar = new c(nVar, this.f14360b, this.f14361c, this.f14362d.b());
            nVar.a(cVar);
            xk.e eVar = cVar.f14378e;
            uk.c b10 = cVar.f14377d.b(new e(0L, cVar), cVar.f14375b, cVar.f14376c);
            eVar.getClass();
            xk.b.e(eVar, b10);
            bVar = cVar;
        } else {
            b bVar2 = new b(nVar, this.f14360b, this.f14361c, this.f14362d.b(), this.f14363e);
            nVar.a(bVar2);
            xk.e eVar2 = bVar2.f14370e;
            uk.c b11 = bVar2.f14369d.b(new e(0L, bVar2), bVar2.f14367b, bVar2.f14368c);
            eVar2.getClass();
            xk.b.e(eVar2, b11);
            bVar = bVar2;
        }
        this.f14315a.d(bVar);
    }
}
