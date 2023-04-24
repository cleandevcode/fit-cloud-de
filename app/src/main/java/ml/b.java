package ml;

import ih.v;
import java.util.concurrent.atomic.AtomicReference;
import tk.r;

/* loaded from: classes2.dex */
public abstract class b<T> implements r<T>, uk.c {

    /* renamed from: a */
    public final AtomicReference<uk.c> f21888a = new AtomicReference<>();

    @Override // tk.r, tk.b, tk.g
    public final void a(uk.c cVar) {
        v.p(this.f21888a, cVar, getClass());
    }

    @Override // uk.c
    public final void c() {
        xk.b.a(this.f21888a);
    }
}
