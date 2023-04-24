package qc;

import kc.v0;

/* loaded from: classes.dex */
public final class i implements wk.e<Throwable, tk.i<v0.d.a>> {

    /* renamed from: a */
    public final /* synthetic */ k f24717a;

    public i(k kVar) {
        this.f24717a = kVar;
    }

    @Override // wk.e
    public final tk.i<v0.d.a> apply(Throwable th2) {
        Throwable th3 = th2;
        if (!(th3 instanceof lc.j) && !(th3 instanceof lc.i)) {
            return tk.i.m(th3);
        }
        a aVar = (a) this.f24717a.f24727b;
        return tk.i.t(new v0.d.a(((int) Math.ceil(aVar.f24679a.position() / aVar.f24680b)) - 1, (lc.l) th3));
    }
}
