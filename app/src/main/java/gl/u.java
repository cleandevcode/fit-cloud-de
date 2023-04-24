package gl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class u extends tk.p<Long> {

    /* renamed from: a */
    public final long f15472a = 5;

    /* renamed from: b */
    public final TimeUnit f15473b;

    /* renamed from: c */
    public final tk.o f15474c;

    /* loaded from: classes2.dex */
    public static final class a extends AtomicReference<uk.c> implements uk.c, Runnable {

        /* renamed from: a */
        public final tk.r<? super Long> f15475a;

        public a(tk.r<? super Long> rVar) {
            this.f15475a = rVar;
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f15475a.onSuccess(0L);
        }
    }

    public u(TimeUnit timeUnit, tk.o oVar) {
        this.f15473b = timeUnit;
        this.f15474c = oVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super Long> rVar) {
        a aVar = new a(rVar);
        rVar.a(aVar);
        xk.b.e(aVar, this.f15474c.d(aVar, this.f15472a, this.f15473b));
    }
}
