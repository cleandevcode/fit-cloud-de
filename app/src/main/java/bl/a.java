package bl;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a extends tk.a {

    /* renamed from: a */
    public final tk.c f4442a;

    /* renamed from: b */
    public final tk.c f4443b;

    /* renamed from: bl.a$a */
    /* loaded from: classes2.dex */
    public static final class C0060a implements tk.b {

        /* renamed from: a */
        public final AtomicReference<uk.c> f4444a;

        /* renamed from: b */
        public final tk.b f4445b;

        public C0060a(AtomicReference<uk.c> atomicReference, tk.b bVar) {
            this.f4444a = atomicReference;
            this.f4445b = bVar;
        }

        @Override // tk.b, tk.g
        public final void a(uk.c cVar) {
            xk.b.e(this.f4444a, cVar);
        }

        @Override // tk.b, tk.g
        public final void onComplete() {
            this.f4445b.onComplete();
        }

        @Override // tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f4445b.onError(th2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends AtomicReference<uk.c> implements tk.b, uk.c {

        /* renamed from: a */
        public final tk.b f4446a;

        /* renamed from: b */
        public final tk.c f4447b;

        public b(tk.b bVar, tk.c cVar) {
            this.f4446a = bVar;
            this.f4447b = cVar;
        }

        @Override // tk.b, tk.g
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar)) {
                this.f4446a.a(this);
            }
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.b, tk.g
        public final void onComplete() {
            this.f4447b.a(new C0060a(this, this.f4446a));
        }

        @Override // tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f4446a.onError(th2);
        }
    }

    public a(tk.c cVar, tk.c cVar2) {
        this.f4442a = cVar;
        this.f4443b = cVar2;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        this.f4442a.a(new b(bVar, this.f4443b));
    }
}
