package bl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tk.o;

/* loaded from: classes2.dex */
public final class j extends tk.a {

    /* renamed from: a */
    public final long f4477a;

    /* renamed from: b */
    public final TimeUnit f4478b;

    /* renamed from: c */
    public final o f4479c;

    /* loaded from: classes2.dex */
    public static final class a extends AtomicReference<uk.c> implements uk.c, Runnable {

        /* renamed from: a */
        public final tk.b f4480a;

        public a(tk.b bVar) {
            this.f4480a = bVar;
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4480a.onComplete();
        }
    }

    public j(long j10, TimeUnit timeUnit, il.b bVar) {
        this.f4477a = j10;
        this.f4478b = timeUnit;
        this.f4479c = bVar;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        a aVar = new a(bVar);
        bVar.a(aVar);
        xk.b.e(aVar, this.f4479c.d(aVar, this.f4477a, this.f4478b));
    }
}
