package l2;

/* loaded from: classes.dex */
public final class t2 extends gm.m implements fm.l<g3<Object>, Boolean> {

    /* renamed from: b */
    public final /* synthetic */ lm.j f19268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(lm.j jVar) {
        super(1);
        this.f19268b = jVar;
    }

    @Override // fm.l
    public final Boolean k(g3<Object> g3Var) {
        g3<Object> g3Var2 = g3Var;
        gm.l.f(g3Var2, "stash");
        int[] iArr = g3Var2.f18900a;
        lm.j jVar = this.f19268b;
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (jVar.k(iArr[i10])) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }
}
