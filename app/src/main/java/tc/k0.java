package tc;

import fl.g;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class k0<T> implements tk.n<T>, wk.c {

    /* renamed from: a */
    public final AtomicBoolean f27995a = new AtomicBoolean(false);

    /* renamed from: b */
    public final tk.j<T> f27996b;

    /* renamed from: c */
    public final w.d f27997c;

    public k0(g.a aVar, w.d dVar) {
        this.f27996b = aVar;
        this.f27997c = dVar;
        aVar.e(this);
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
    }

    @Override // tk.n
    public final void b(T t10) {
        ((g.a) this.f27996b).d(t10);
    }

    @Override // wk.c
    public final synchronized void cancel() {
        this.f27995a.set(true);
    }

    @Override // tk.n
    public final void onComplete() {
        this.f27997c.e();
        ((g.a) this.f27996b).b();
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        this.f27997c.e();
        ((g.a) this.f27996b).f(th2);
    }
}
