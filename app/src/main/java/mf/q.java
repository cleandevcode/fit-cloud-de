package mf;

/* loaded from: classes.dex */
public final class q extends t<Object> {

    /* renamed from: a */
    public final /* synthetic */ t f20624a;

    public q(t tVar) {
        this.f20624a = tVar;
    }

    @Override // mf.t
    public final Object b(y yVar) {
        return this.f20624a.b(yVar);
    }

    @Override // mf.t
    public final boolean c() {
        return this.f20624a.c();
    }

    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        boolean z10 = e0Var.f20533f;
        e0Var.f20533f = true;
        try {
            this.f20624a.f(e0Var, obj);
        } finally {
            e0Var.f20533f = z10;
        }
    }

    public final String toString() {
        return this.f20624a + ".serializeNulls()";
    }
}
