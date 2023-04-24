package fl;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class y0<T, U> extends fl.a<T, T> {

    /* renamed from: b */
    public final tk.l<? extends U> f14763b;

    /* loaded from: classes2.dex */
    public static final class a<T, U> extends AtomicInteger implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14764a;

        /* renamed from: b */
        public final AtomicReference<uk.c> f14765b = new AtomicReference<>();

        /* renamed from: c */
        public final a<T, U>.C0265a f14766c = new C0265a();

        /* renamed from: d */
        public final kl.b f14767d = new kl.b();

        /* renamed from: fl.y0$a$a */
        /* loaded from: classes2.dex */
        public final class C0265a extends AtomicReference<uk.c> implements tk.n<U> {
            public C0265a() {
                a.this = r1;
            }

            @Override // tk.n
            public final void a(uk.c cVar) {
                xk.b.h(this, cVar);
            }

            @Override // tk.n
            public final void b(U u10) {
                xk.b.a(this);
                a aVar = a.this;
                xk.b.a(aVar.f14765b);
                bi.r.F(aVar.f14764a, aVar, aVar.f14767d);
            }

            @Override // tk.n
            public final void onComplete() {
                a aVar = a.this;
                xk.b.a(aVar.f14765b);
                bi.r.F(aVar.f14764a, aVar, aVar.f14767d);
            }

            @Override // tk.n
            public final void onError(Throwable th2) {
                a aVar = a.this;
                xk.b.a(aVar.f14765b);
                bi.r.G(aVar.f14764a, th2, aVar, aVar.f14767d);
            }
        }

        public a(tk.n<? super T> nVar) {
            this.f14764a = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.h(this.f14765b, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            bi.r.H(this.f14764a, t10, this, this.f14767d);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this.f14765b);
            xk.b.a(this.f14766c);
        }

        @Override // tk.n
        public final void onComplete() {
            xk.b.a(this.f14766c);
            bi.r.F(this.f14764a, this, this.f14767d);
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            xk.b.a(this.f14766c);
            bi.r.G(this.f14764a, th2, this, this.f14767d);
        }
    }

    public y0(tk.l lVar, tk.i iVar) {
        super(lVar);
        this.f14763b = iVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        a aVar = new a(nVar);
        nVar.a(aVar);
        this.f14763b.d(aVar.f14766c);
        this.f14315a.d(aVar);
    }
}
