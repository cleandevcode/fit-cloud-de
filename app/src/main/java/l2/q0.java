package l2;

import l2.n0;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: d */
    public static final q0 f19199d;

    /* renamed from: a */
    public final n0 f19200a;

    /* renamed from: b */
    public final n0 f19201b;

    /* renamed from: c */
    public final n0 f19202c;

    static {
        n0.c cVar = n0.c.f19109c;
        f19199d = new q0(cVar, cVar, cVar);
    }

    public q0(n0 n0Var, n0 n0Var2, n0 n0Var3) {
        gm.l.f(n0Var, "refresh");
        gm.l.f(n0Var2, "prepend");
        gm.l.f(n0Var3, "append");
        this.f19200a = n0Var;
        this.f19201b = n0Var2;
        this.f19202c = n0Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [l2.n0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [l2.n0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l2.n0] */
    public static q0 a(q0 q0Var, n0.c cVar, n0.c cVar2, n0.c cVar3, int i10) {
        n0.c cVar4 = cVar;
        if ((i10 & 1) != 0) {
            cVar4 = q0Var.f19200a;
        }
        n0.c cVar5 = cVar2;
        if ((i10 & 2) != 0) {
            cVar5 = q0Var.f19201b;
        }
        n0.c cVar6 = cVar3;
        if ((i10 & 4) != 0) {
            cVar6 = q0Var.f19202c;
        }
        q0Var.getClass();
        gm.l.f(cVar4, "refresh");
        gm.l.f(cVar5, "prepend");
        gm.l.f(cVar6, "append");
        return new q0(cVar4, cVar5, cVar6);
    }

    public final q0 b(r0 r0Var) {
        int i10;
        n0.c cVar;
        n0.c cVar2 = n0.c.f19109c;
        int ordinal = r0Var.ordinal();
        if (ordinal == 0) {
            i10 = 6;
            cVar = null;
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return a(this, null, null, cVar2, 3);
            }
            throw new qa.p();
        } else {
            i10 = 5;
            cVar = cVar2;
            cVar2 = null;
        }
        return a(this, cVar2, cVar, null, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            return gm.l.a(this.f19200a, q0Var.f19200a) && gm.l.a(this.f19201b, q0Var.f19201b) && gm.l.a(this.f19202c, q0Var.f19202c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f19201b.hashCode();
        return this.f19202c.hashCode() + ((hashCode + (this.f19200a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("LoadStates(refresh=");
        a10.append(this.f19200a);
        a10.append(", prepend=");
        a10.append(this.f19201b);
        a10.append(", append=");
        a10.append(this.f19202c);
        a10.append(')');
        return a10.toString();
    }
}
