package fl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class e0 extends tk.i<Long> {

    /* renamed from: a */
    public final tk.o f14432a;

    /* renamed from: b */
    public final long f14433b;

    /* renamed from: c */
    public final long f14434c;

    /* renamed from: d */
    public final TimeUnit f14435d;

    /* loaded from: classes2.dex */
    public static final class a extends AtomicReference<uk.c> implements uk.c, Runnable {

        /* renamed from: a */
        public final tk.n<? super Long> f14436a;

        /* renamed from: b */
        public long f14437b;

        public a(tk.n<? super Long> nVar) {
            this.f14436a = nVar;
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != xk.b.f30613a) {
                tk.n<? super Long> nVar = this.f14436a;
                long j10 = this.f14437b;
                this.f14437b = 1 + j10;
                nVar.b(Long.valueOf(j10));
            }
        }
    }

    public e0(long j10, long j11, TimeUnit timeUnit, tk.o oVar) {
        this.f14433b = j10;
        this.f14434c = j11;
        this.f14435d = timeUnit;
        this.f14432a = oVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super Long> nVar) {
        a aVar = new a(nVar);
        nVar.a(aVar);
        tk.o oVar = this.f14432a;
        if (oVar instanceof il.o) {
            o.c b10 = oVar.b();
            xk.b.h(aVar, b10);
            b10.d(aVar, this.f14433b, this.f14434c, this.f14435d);
            return;
        }
        xk.b.h(aVar, oVar.e(aVar, this.f14433b, this.f14434c, this.f14435d));
    }
}
