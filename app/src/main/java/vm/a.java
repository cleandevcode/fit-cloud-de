package vm;

import mf.a0;
import pm.i;
import pm.j;
import tl.l;

/* loaded from: classes2.dex */
public final class a implements tk.b {

    /* renamed from: a */
    public final /* synthetic */ i<l> f29471a;

    public a(j jVar) {
        this.f29471a = jVar;
    }

    @Override // tk.b, tk.g
    public final void a(uk.c cVar) {
        this.f29471a.z(new c(cVar));
    }

    @Override // tk.b, tk.g
    public final void onComplete() {
        this.f29471a.l(l.f28297a);
    }

    @Override // tk.b, tk.g
    public final void onError(Throwable th2) {
        this.f29471a.l(a0.f(th2));
    }
}
