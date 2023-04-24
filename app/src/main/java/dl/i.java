package dl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class i extends tk.f<Long> {

    /* renamed from: a */
    public final long f13160a;

    /* renamed from: b */
    public final TimeUnit f13161b;

    /* renamed from: c */
    public final o f13162c;

    /* loaded from: classes2.dex */
    public static final class a extends AtomicReference<uk.c> implements uk.c, Runnable {

        /* renamed from: a */
        public final tk.g<? super Long> f13163a;

        public a(tk.g<? super Long> gVar) {
            this.f13163a = gVar;
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13163a.onSuccess(0L);
        }
    }

    public i(long j10, TimeUnit timeUnit, il.b bVar) {
        this.f13160a = j10;
        this.f13161b = timeUnit;
        this.f13162c = bVar;
    }

    @Override // tk.f
    public final void c(tk.g<? super Long> gVar) {
        a aVar = new a(gVar);
        gVar.a(aVar);
        xk.b.e(aVar, this.f13162c.d(aVar, this.f13160a, this.f13161b));
    }
}
