package mf;

/* loaded from: classes.dex */
public final class s extends t<Object> {

    /* renamed from: a */
    public final /* synthetic */ t f20626a;

    public s(t tVar) {
        this.f20626a = tVar;
    }

    @Override // mf.t
    public final Object b(y yVar) {
        boolean z10 = yVar.f20632f;
        yVar.f20632f = true;
        try {
            return this.f20626a.b(yVar);
        } finally {
            yVar.f20632f = z10;
        }
    }

    @Override // mf.t
    public final boolean c() {
        return this.f20626a.c();
    }

    @Override // mf.t
    public final void f(e0 e0Var, Object obj) {
        this.f20626a.f(e0Var, obj);
    }

    public final String toString() {
        return this.f20626a + ".failOnUnknown()";
    }
}
