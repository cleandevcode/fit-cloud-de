package fl;

import java.util.concurrent.atomic.AtomicInteger;
import oc.n0;

/* loaded from: classes2.dex */
public final class q0<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.f<? super Throwable> f14645b;

    /* renamed from: c */
    public final long f14646c;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicInteger implements tk.n<T> {

        /* renamed from: a */
        public final tk.n<? super T> f14647a;

        /* renamed from: b */
        public final xk.e f14648b;

        /* renamed from: c */
        public final tk.l<? extends T> f14649c;

        /* renamed from: d */
        public final wk.f<? super Throwable> f14650d;

        /* renamed from: e */
        public long f14651e;

        public a(tk.n<? super T> nVar, long j10, wk.f<? super Throwable> fVar, xk.e eVar, tk.l<? extends T> lVar) {
            this.f14647a = nVar;
            this.f14648b = eVar;
            this.f14649c = lVar;
            this.f14650d = fVar;
            this.f14651e = j10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.e eVar = this.f14648b;
            eVar.getClass();
            xk.b.e(eVar, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            this.f14647a.b(t10);
        }

        public final void c() {
            if (getAndIncrement() == 0) {
                int i10 = 1;
                while (!this.f14648b.a()) {
                    this.f14649c.d(this);
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14647a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            long j10 = this.f14651e;
            if (j10 != Long.MAX_VALUE) {
                this.f14651e = j10 - 1;
            }
            if (j10 == 0) {
                this.f14647a.onError(th2);
                return;
            }
            try {
                if (this.f14650d.test(th2)) {
                    c();
                } else {
                    this.f14647a.onError(th2);
                }
            } catch (Throwable th3) {
                h7.a.y(th3);
                this.f14647a.onError(new vk.a(th2, th3));
            }
        }
    }

    public q0(tk.i iVar, n0.a aVar) {
        super(iVar);
        this.f14645b = aVar;
        this.f14646c = Long.MAX_VALUE;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        xk.e eVar = new xk.e();
        nVar.a(eVar);
        new a(nVar, this.f14646c, this.f14645b, eVar, this.f14315a).c();
    }
}
