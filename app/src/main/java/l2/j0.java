package l2;

import l2.h0;

/* loaded from: classes.dex */
public final class j0 extends gm.m implements fm.p<h0.a, h0.a, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ j3 f19016b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(j3 j3Var) {
        super(2);
        this.f19016b = j3Var;
    }

    @Override // fm.p
    public final tl.l A(h0.a aVar, h0.a aVar2) {
        h0.a aVar3 = aVar;
        h0.a aVar4 = aVar2;
        gm.l.f(aVar3, "prependHint");
        gm.l.f(aVar4, "appendHint");
        if (b0.c.t(this.f19016b, aVar3.f18916a, r0.PREPEND)) {
            j3 j3Var = this.f19016b;
            aVar3.f18916a = j3Var;
            if (j3Var != null) {
                aVar3.f18917b.d(j3Var);
            }
        }
        if (b0.c.t(this.f19016b, aVar4.f18916a, r0.APPEND)) {
            j3 j3Var2 = this.f19016b;
            aVar4.f18916a = j3Var2;
            if (j3Var2 != null) {
                aVar4.f18917b.d(j3Var2);
            }
        }
        return tl.l.f28297a;
    }
}
