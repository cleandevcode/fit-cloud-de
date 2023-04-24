package gl;

import java.util.Objects;
import qc.k0;

/* loaded from: classes2.dex */
public final class c<T> extends tk.p<T> {

    /* renamed from: a */
    public final wk.g<? extends tk.t<? extends T>> f15387a;

    public c(k0 k0Var) {
        this.f15387a = k0Var;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        try {
            tk.t<? extends T> tVar = this.f15387a.get();
            Objects.requireNonNull(tVar, "The singleSupplier returned a null SingleSource");
            tVar.c(rVar);
        } catch (Throwable th2) {
            h7.a.y(th2);
            rVar.a(xk.c.INSTANCE);
            rVar.onError(th2);
        }
    }
}
