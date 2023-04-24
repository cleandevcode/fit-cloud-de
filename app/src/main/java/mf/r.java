package mf;

/* loaded from: classes.dex */
public final class r extends t<Object> {

    /* renamed from: a */
    public final /* synthetic */ t f20625a;

    public r(t tVar) {
        this.f20625a = tVar;
    }

    @Override // mf.t
    public final Object b(y yVar) {
        boolean z10 = yVar.f20631e;
        yVar.f20631e = true;
        try {
            return this.f20625a.b(yVar);
        } finally {
            yVar.f20631e = z10;
        }
    }

    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        boolean z10 = e0Var.f20532e;
        e0Var.f20532e = true;
        try {
            this.f20625a.f(e0Var, obj);
        } finally {
            e0Var.f20532e = z10;
        }
    }

    public final String toString() {
        return this.f20625a + ".lenient()";
    }
}
