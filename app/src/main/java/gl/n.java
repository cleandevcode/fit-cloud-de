package gl;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class n<T> extends tk.p<T> {

    /* renamed from: a */
    public final Callable<? extends T> f15438a;

    public n(Callable<? extends T> callable) {
        this.f15438a = callable;
    }

    @Override // tk.p
    public final void f(tk.r<? super T> rVar) {
        uk.f fVar = new uk.f(yk.a.f31787b);
        rVar.a(fVar);
        if (fVar.a()) {
            return;
        }
        try {
            Object obj = (T) this.f15438a.call();
            Objects.requireNonNull(obj, "The callable returned a null value");
            if (fVar.a()) {
                return;
            }
            rVar.onSuccess(obj);
        } catch (Throwable th2) {
            h7.a.y(th2);
            if (fVar.a()) {
                ol.a.a(th2);
            } else {
                rVar.onError(th2);
            }
        }
    }
}
