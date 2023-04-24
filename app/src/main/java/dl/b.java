package dl;

import lc.n;

/* loaded from: classes2.dex */
public final class b<T> extends tk.f<T> {

    /* renamed from: a */
    public final Throwable f13127a;

    public b(n nVar) {
        this.f13127a = nVar;
    }

    @Override // tk.f
    public final void c(tk.g<? super T> gVar) {
        gVar.a(xk.c.INSTANCE);
        gVar.onError(this.f13127a);
    }
}
