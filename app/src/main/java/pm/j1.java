package pm;

/* loaded from: classes2.dex */
public class j1 extends l1 implements s {

    /* renamed from: b */
    public final boolean f24355b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(g1 g1Var) {
        super(true);
        o oVar;
        boolean z10 = true;
        j0(g1Var);
        n c02 = c0();
        if (c02 instanceof o) {
            oVar = (o) c02;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            do {
                l1 S = oVar.S();
                if (S.V()) {
                    break;
                }
                n c03 = S.c0();
                if (c03 instanceof o) {
                    oVar = (o) c03;
                    continue;
                } else {
                    oVar = null;
                    continue;
                }
            } while (oVar != null);
            z10 = false;
        } else {
            z10 = false;
        }
        this.f24355b = z10;
    }

    @Override // pm.l1
    public final boolean V() {
        return this.f24355b;
    }

    @Override // pm.l1
    public final boolean Y() {
        return true;
    }
}
