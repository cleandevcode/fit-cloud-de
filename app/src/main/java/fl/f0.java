package fl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class f0 extends tk.i<Long> {

    /* renamed from: a */
    public final tk.o f14457a;

    /* renamed from: b */
    public final long f14458b = 0;

    /* renamed from: c */
    public final long f14459c;

    /* renamed from: d */
    public final long f14460d;

    /* renamed from: e */
    public final long f14461e;

    /* renamed from: f */
    public final TimeUnit f14462f;

    /* loaded from: classes2.dex */
    public static final class a extends AtomicReference<uk.c> implements uk.c, Runnable {

        /* renamed from: a */
        public final tk.n<? super Long> f14463a;

        /* renamed from: b */
        public final long f14464b;

        /* renamed from: c */
        public long f14465c;

        public a(tk.n<? super Long> nVar, long j10, long j11) {
            this.f14463a = nVar;
            this.f14465c = j10;
            this.f14464b = j11;
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
            long j10 = this.f14465c;
            this.f14463a.b(Long.valueOf(j10));
            if (j10 != this.f14464b) {
                this.f14465c = j10 + 1;
                return;
            }
            if (!a()) {
                this.f14463a.onComplete();
            }
            xk.b.a(this);
        }
    }

    public f0(long j10, long j11, long j12, TimeUnit timeUnit, il.b bVar) {
        this.f14460d = j11;
        this.f14461e = j12;
        this.f14462f = timeUnit;
        this.f14457a = bVar;
        this.f14459c = j10;
    }

    @Override // tk.i
    public final void z(tk.n<? super Long> nVar) {
        a aVar = new a(nVar, this.f14458b, this.f14459c);
        nVar.a(aVar);
        tk.o oVar = this.f14457a;
        if (oVar instanceof il.o) {
            o.c b10 = oVar.b();
            xk.b.h(aVar, b10);
            b10.d(aVar, this.f14460d, this.f14461e, this.f14462f);
            return;
        }
        xk.b.h(aVar, oVar.e(aVar, this.f14460d, this.f14461e, this.f14462f));
    }
}
