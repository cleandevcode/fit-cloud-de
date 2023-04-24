package qc;

/* loaded from: classes.dex */
public final class g implements wk.f<Object> {

    /* renamed from: a */
    public final /* synthetic */ tc.k0 f24709a;

    public g(tc.k0 k0Var) {
        this.f24709a = k0Var;
    }

    @Override // wk.f
    public final boolean test(Object obj) {
        boolean z10;
        tc.k0 k0Var = this.f24709a;
        synchronized (k0Var) {
            z10 = k0Var.f27995a.get();
        }
        return !z10;
    }
}
