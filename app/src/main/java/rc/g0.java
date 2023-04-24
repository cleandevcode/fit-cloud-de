package rc;

import qc.j0;
import tc.l0;

/* loaded from: classes.dex */
public final class g0 implements d0 {

    /* renamed from: a */
    public final l0 f25479a;

    /* renamed from: b */
    public final h f25480b;

    /* renamed from: c */
    public final y f25481c;

    /* renamed from: d */
    public final d f25482d;

    public g0(l0 l0Var, h hVar, y yVar, d dVar) {
        this.f25479a = l0Var;
        this.f25480b = hVar;
        this.f25481c = yVar;
        this.f25482d = dVar;
    }

    @Override // rc.d0
    public final d6.b0 a(uc.f fVar, uc.c... cVarArr) {
        return new d6.b0(new j0(this.f25479a, this.f25480b, this.f25482d, fVar, new g(cVarArr), null), this.f25481c.a(fVar.f28675b));
    }
}
