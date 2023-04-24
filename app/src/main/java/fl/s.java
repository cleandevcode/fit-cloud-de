package fl;

import yk.a;

/* loaded from: classes2.dex */
public final class s<T> extends tk.i<T> {

    /* renamed from: a */
    public final wk.g<? extends Throwable> f14663a;

    public s(a.g gVar) {
        this.f14663a = gVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        try {
            Throwable th2 = this.f14663a.get();
            kl.d.b(th2, "Supplier returned a null Throwable.");
            th = th2;
        } catch (Throwable th3) {
            th = th3;
            h7.a.y(th);
        }
        nVar.a(xk.c.INSTANCE);
        nVar.onError(th);
    }
}
