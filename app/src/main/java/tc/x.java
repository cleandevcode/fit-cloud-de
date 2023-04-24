package tc;

import fl.g;

/* loaded from: classes.dex */
public final class x extends ml.a<Object> {

    /* renamed from: b */
    public final /* synthetic */ tk.j f28026b;

    public x(g.a aVar) {
        this.f28026b = aVar;
    }

    @Override // tk.n
    public final void b(Object obj) {
        ((g.a) this.f28026b).d(obj);
    }

    @Override // tk.n
    public final void onComplete() {
        ((g.a) this.f28026b).b();
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        ((g.a) this.f28026b).f(th2);
    }
}
