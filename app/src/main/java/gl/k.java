package gl;

import yk.a;

/* loaded from: classes2.dex */
public final class k<T> extends tk.p<T> {

    /* renamed from: a */
    public final wk.g<? extends Throwable> f15427a;

    public k(a.g gVar) {
        this.f15427a = gVar;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        try {
            Throwable th2 = this.f15427a.get();
            kl.d.b(th2, "Supplier returned a null Throwable.");
            th = th2;
        } catch (Throwable th3) {
            th = th3;
            h7.a.y(th);
        }
        rVar.a(xk.c.INSTANCE);
        rVar.onError(th);
    }
}
