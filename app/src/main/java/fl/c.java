package fl;

import java.util.concurrent.atomic.AtomicInteger;
import yk.a;

/* loaded from: classes2.dex */
public final class c<T> extends tk.i<T> {

    /* renamed from: a */
    public final gc.d f14382a;

    /* renamed from: b */
    public final int f14383b;

    /* renamed from: c */
    public final wk.d<? super uk.c> f14384c;

    /* renamed from: d */
    public final AtomicInteger f14385d;

    public c(gc.d dVar, int i10) {
        a.d dVar2 = yk.a.f31789d;
        this.f14382a = dVar;
        this.f14383b = i10;
        this.f14384c = dVar2;
        this.f14385d = new AtomicInteger();
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14382a.d(nVar);
        if (this.f14385d.incrementAndGet() == this.f14383b) {
            this.f14382a.G(this.f14384c);
        }
    }
}
