package tc;

import fl.g;

/* loaded from: classes.dex */
public final class y extends ml.b<Object> {

    /* renamed from: b */
    public final /* synthetic */ tk.j f28027b;

    public y(g.a aVar) {
        this.f28027b = aVar;
    }

    @Override // tk.r, tk.b, tk.g
    public final void onError(Throwable th2) {
        ((g.a) this.f28027b).f(th2);
    }

    @Override // tk.r, tk.g
    public final void onSuccess(Object obj) {
        ((g.a) this.f28027b).d(obj);
        ((g.a) this.f28027b).b();
    }
}
