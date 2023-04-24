package fl;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class y<T> extends tk.i<T> implements wk.g<T> {

    /* renamed from: a */
    public final Callable<? extends T> f14762a;

    public y(oc.o oVar) {
        this.f14762a = oVar;
    }

    @Override // wk.g
    public final T get() {
        T call = this.f14762a.call();
        kl.d.b(call, "The Callable returned a null value.");
        return call;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        al.g gVar = new al.g(nVar);
        nVar.a(gVar);
        if (gVar.f()) {
            return;
        }
        try {
            T call = this.f14762a.call();
            kl.d.b(call, "Callable returned a null value.");
            gVar.e(call);
        } catch (Throwable th2) {
            h7.a.y(th2);
            if (gVar.f()) {
                ol.a.a(th2);
            } else {
                nVar.onError(th2);
            }
        }
    }
}
