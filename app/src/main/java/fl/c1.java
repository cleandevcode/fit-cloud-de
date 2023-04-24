package fl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class c1 extends tk.i<Long> {

    /* renamed from: a */
    public final tk.o f14388a;

    /* renamed from: b */
    public final long f14389b;

    /* renamed from: c */
    public final TimeUnit f14390c;

    /* loaded from: classes2.dex */
    public static final class a extends AtomicReference<uk.c> implements uk.c, Runnable {

        /* renamed from: a */
        public final tk.n<? super Long> f14391a;

        public a(tk.n<? super Long> nVar) {
            this.f14391a = nVar;
        }

        public final boolean a() {
            return get() == xk.b.f30613a;
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (a()) {
                return;
            }
            this.f14391a.b(0L);
            lazySet(xk.c.INSTANCE);
            this.f14391a.onComplete();
        }
    }

    public c1(long j10, TimeUnit timeUnit, tk.o oVar) {
        this.f14389b = j10;
        this.f14390c = timeUnit;
        this.f14388a = oVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super Long> nVar) {
        boolean z10;
        a aVar = new a(nVar);
        nVar.a(aVar);
        uk.c d10 = this.f14388a.d(aVar, this.f14389b, this.f14390c);
        while (true) {
            if (!aVar.compareAndSet(null, d10)) {
                if (aVar.get() != null) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (z10 || aVar.get() != xk.b.f30613a) {
            return;
        }
        d10.c();
    }
}
