package bl;

import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class f extends tk.a {

    /* renamed from: a */
    public final tk.c f4453a;

    /* renamed from: b */
    public final o f4454b;

    /* loaded from: classes2.dex */
    public static final class a extends AtomicReference<uk.c> implements tk.b, uk.c, Runnable {

        /* renamed from: a */
        public final tk.b f4455a;

        /* renamed from: b */
        public final o f4456b;

        /* renamed from: c */
        public Throwable f4457c;

        public a(tk.b bVar, o oVar) {
            this.f4455a = bVar;
            this.f4456b = oVar;
        }

        @Override // tk.b, tk.g
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar)) {
                this.f4455a.a(this);
            }
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.b, tk.g
        public final void onComplete() {
            xk.b.e(this, this.f4456b.c(this));
        }

        @Override // tk.b, tk.g
        public final void onError(Throwable th2) {
            this.f4457c = th2;
            xk.b.e(this, this.f4456b.c(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f4457c;
            if (th2 == null) {
                this.f4455a.onComplete();
                return;
            }
            this.f4457c = null;
            this.f4455a.onError(th2);
        }
    }

    public f(tk.c cVar, o oVar) {
        this.f4453a = cVar;
        this.f4454b = oVar;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        this.f4453a.a(new a(bVar, this.f4454b));
    }
}
