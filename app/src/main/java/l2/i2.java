package l2;

import l2.n0;

/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a */
    public final /* synthetic */ j2<Object> f19002a;

    public i2(j2<Object> j2Var) {
        this.f19002a = j2Var;
    }

    public final void a(r0 r0Var) {
        n0 n0Var;
        n0.c cVar = n0.c.f19109c;
        v0 v0Var = this.f19002a.f19023e;
        v0Var.getClass();
        q0 q0Var = v0Var.f19321f;
        if (q0Var == null) {
            n0Var = null;
        } else {
            int ordinal = r0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        n0Var = q0Var.f19202c;
                    } else {
                        throw new qa.p();
                    }
                } else {
                    n0Var = q0Var.f19201b;
                }
            } else {
                n0Var = q0Var.f19200a;
            }
        }
        if (gm.l.a(n0Var, cVar)) {
            return;
        }
        v0 v0Var2 = this.f19002a.f19023e;
        v0Var2.getClass();
        v0Var2.f19316a = true;
        q0 q0Var2 = v0Var2.f19321f;
        q0 b10 = q0Var2.b(r0Var);
        v0Var2.f19321f = b10;
        gm.l.a(b10, q0Var2);
        v0Var2.b();
    }
}
