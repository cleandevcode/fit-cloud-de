package vm;

import mf.a0;
import pm.i;
import pm.j;
import tk.r;

/* loaded from: classes2.dex */
public final class b implements r<Object> {

    /* renamed from: a */
    public final /* synthetic */ i<Object> f29472a;

    public b(j jVar) {
        this.f29472a = jVar;
    }

    @Override // tk.r, tk.b, tk.g
    public final void a(uk.c cVar) {
        this.f29472a.z(new c(cVar));
    }

    @Override // tk.r, tk.b, tk.g
    public final void onError(Throwable th2) {
        this.f29472a.l(a0.f(th2));
    }

    @Override // tk.r, tk.g
    public final void onSuccess(Object obj) {
        this.f29472a.l(obj);
    }
}
