package fl;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class i0<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final tk.c f14503b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicInteger implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14504a;

        /* renamed from: b */
        public final AtomicReference<uk.c> f14505b = new AtomicReference<>();

        /* renamed from: c */
        public final C0259a f14506c = new C0259a(this);

        /* renamed from: d */
        public final kl.b f14507d = new kl.b();

        /* renamed from: e */
        public volatile boolean f14508e;

        /* renamed from: f */
        public volatile boolean f14509f;

        /* renamed from: fl.i0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0259a extends AtomicReference<uk.c> implements tk.b {

            /* renamed from: a */
            public final a<?> f14510a;

            public C0259a(a<?> aVar) {
                this.f14510a = aVar;
            }

            @Override // tk.b, tk.g
            public final void a(uk.c cVar) {
                xk.b.h(this, cVar);
            }

            @Override // tk.b, tk.g
            public final void onComplete() {
                a<?> aVar = this.f14510a;
                aVar.f14509f = true;
                if (aVar.f14508e) {
                    bi.r.F(aVar.f14504a, aVar, aVar.f14507d);
                }
            }

            @Override // tk.b, tk.g
            public final void onError(Throwable th2) {
                a<?> aVar = this.f14510a;
                xk.b.a(aVar.f14505b);
                bi.r.G(aVar.f14504a, th2, aVar, aVar.f14507d);
            }
        }

        public a(tk.n<? super T> nVar) {
            this.f14504a = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.h(this.f14505b, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            bi.r.H(this.f14504a, t10, this, this.f14507d);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this.f14505b);
            xk.b.a(this.f14506c);
            this.f14507d.d();
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14508e = true;
            if (this.f14509f) {
                bi.r.F(this.f14504a, this, this.f14507d);
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            xk.b.a(this.f14506c);
            bi.r.G(this.f14504a, th2, this, this.f14507d);
        }
    }

    public i0(tk.i iVar, tk.a aVar) {
        super(iVar);
        this.f14503b = aVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        a aVar = new a(nVar);
        nVar.a(aVar);
        this.f14315a.d(aVar);
        this.f14503b.a(aVar.f14506c);
    }
}
