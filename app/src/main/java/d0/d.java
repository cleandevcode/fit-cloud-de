package d0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p0.c;
import s.h1;

/* loaded from: classes.dex */
public class d<V> implements na.a<V> {

    /* renamed from: a */
    public final na.a<V> f12576a;

    /* renamed from: b */
    public c.a<V> f12577b;

    /* loaded from: classes.dex */
    public class a implements c.InterfaceC0425c<V> {
        public a() {
            d.this = r1;
        }

        @Override // p0.c.InterfaceC0425c
        public final String g(c.a aVar) {
            boolean z10;
            if (d.this.f12577b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            h1.k("The result can only set once!", z10);
            d.this.f12577b = aVar;
            StringBuilder a10 = android.support.v4.media.d.a("FutureChain[");
            a10.append(d.this);
            a10.append("]");
            return a10.toString();
        }
    }

    public d() {
        this.f12576a = p0.c.a(new a());
    }

    public d(na.a<V> aVar) {
        aVar.getClass();
        this.f12576a = aVar;
    }

    public static <V> d<V> b(na.a<V> aVar) {
        return aVar instanceof d ? (d) aVar : new d<>(aVar);
    }

    @Override // na.a
    public final void a(Runnable runnable, Executor executor) {
        this.f12576a.a(runnable, executor);
    }

    public final boolean c(Throwable th2) {
        c.a<V> aVar = this.f12577b;
        if (aVar != null) {
            return aVar.b(th2);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f12576a.cancel(z10);
    }

    public final <T> d<T> d(d0.a<? super V, T> aVar, Executor executor) {
        b bVar = new b(aVar, this);
        a(bVar, executor);
        return bVar;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f12576a.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f12576a.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12576a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12576a.isDone();
    }
}
