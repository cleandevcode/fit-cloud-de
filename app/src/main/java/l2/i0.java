package l2;

import l2.h0;

/* loaded from: classes.dex */
public final class i0 extends gm.m implements fm.p<h0.a, h0.a, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ r0 f18972b;

    /* renamed from: c */
    public final /* synthetic */ j3 f18973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r0 r0Var, j3 j3Var) {
        super(2);
        this.f18972b = r0Var;
        this.f18973c = j3Var;
    }

    @Override // fm.p
    public final tl.l A(h0.a aVar, h0.a aVar2) {
        h0.a aVar3 = aVar;
        h0.a aVar4 = aVar2;
        gm.l.f(aVar3, "prependHint");
        gm.l.f(aVar4, "appendHint");
        if (this.f18972b == r0.PREPEND) {
            j3 j3Var = this.f18973c;
            aVar3.f18916a = j3Var;
            if (j3Var != null) {
                aVar3.f18917b.d(j3Var);
            }
        } else {
            j3 j3Var2 = this.f18973c;
            aVar4.f18916a = j3Var2;
            if (j3Var2 != null) {
                aVar4.f18917b.d(j3Var2);
            }
        }
        return tl.l.f28297a;
    }
}
