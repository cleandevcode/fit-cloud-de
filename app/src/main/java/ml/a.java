package ml;

import ih.v;
import java.util.concurrent.atomic.AtomicReference;
import tk.n;

/* loaded from: classes2.dex */
public abstract class a<T> implements n<T>, uk.c {

    /* renamed from: a */
    public final AtomicReference<uk.c> f21887a = new AtomicReference<>();

    @Override // tk.n
    public final void a(uk.c cVar) {
        v.p(this.f21887a, cVar, getClass());
    }

    @Override // uk.c
    public final void c() {
        xk.b.a(this.f21887a);
    }
}
