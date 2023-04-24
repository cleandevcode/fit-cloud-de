package l2;

import l2.n0;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a */
    public n0 f19334a;

    /* renamed from: b */
    public n0 f19335b;

    /* renamed from: c */
    public n0 f19336c;

    public w0() {
        n0.c cVar = n0.c.f19109c;
        this.f19334a = cVar;
        this.f19335b = cVar;
        this.f19336c = cVar;
    }

    public final n0 a(r0 r0Var) {
        gm.l.f(r0Var, "loadType");
        int ordinal = r0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return this.f19336c;
                }
                throw new qa.p();
            }
            return this.f19335b;
        }
        return this.f19334a;
    }

    public final void b(q0 q0Var) {
        gm.l.f(q0Var, "states");
        this.f19334a = q0Var.f19200a;
        this.f19336c = q0Var.f19202c;
        this.f19335b = q0Var.f19201b;
    }

    public final void c(r0 r0Var, n0 n0Var) {
        gm.l.f(r0Var, "type");
        gm.l.f(n0Var, "state");
        int ordinal = r0Var.ordinal();
        if (ordinal == 0) {
            this.f19334a = n0Var;
        } else if (ordinal == 1) {
            this.f19335b = n0Var;
        } else if (ordinal != 2) {
            throw new qa.p();
        } else {
            this.f19336c = n0Var;
        }
    }

    public final q0 d() {
        return new q0(this.f19334a, this.f19335b, this.f19336c);
    }
}
