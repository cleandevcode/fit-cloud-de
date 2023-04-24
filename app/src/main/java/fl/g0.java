package fl;

import fl.s0;

/* loaded from: classes2.dex */
public final class g0<T> extends tk.i<T> implements nl.d<T> {

    /* renamed from: a */
    public final T f14470a;

    public g0(T t10) {
        this.f14470a = t10;
    }

    @Override // nl.d, wk.g
    public final T get() {
        return this.f14470a;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        s0.a aVar = new s0.a(nVar, this.f14470a);
        nVar.a(aVar);
        aVar.run();
    }
}
