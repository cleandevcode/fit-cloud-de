package al;

import java.util.concurrent.atomic.AtomicReference;
import tk.r;

/* loaded from: classes2.dex */
public final class k<T> implements r<T> {

    /* renamed from: a */
    public final AtomicReference<uk.c> f628a;

    /* renamed from: b */
    public final r<? super T> f629b;

    public k(r rVar, AtomicReference atomicReference) {
        this.f628a = atomicReference;
        this.f629b = rVar;
    }

    @Override // tk.r, tk.b, tk.g
    public final void a(uk.c cVar) {
        xk.b.e(this.f628a, cVar);
    }

    @Override // tk.r, tk.b, tk.g
    public final void onError(Throwable th2) {
        this.f629b.onError(th2);
    }

    @Override // tk.r, tk.g
    public final void onSuccess(T t10) {
        this.f629b.onSuccess(t10);
    }
}
