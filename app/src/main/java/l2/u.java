package l2;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    public final n0 f19269a;

    /* renamed from: b */
    public final n0 f19270b;

    /* renamed from: c */
    public final n0 f19271c;

    /* renamed from: d */
    public final q0 f19272d;

    /* renamed from: e */
    public final q0 f19273e;

    public u(n0 n0Var, n0 n0Var2, n0 n0Var3, q0 q0Var, q0 q0Var2) {
        gm.l.f(n0Var, "refresh");
        gm.l.f(n0Var2, "prepend");
        gm.l.f(n0Var3, "append");
        gm.l.f(q0Var, "source");
        this.f19269a = n0Var;
        this.f19270b = n0Var2;
        this.f19271c = n0Var3;
        this.f19272d = q0Var;
        this.f19273e = q0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (gm.l.a(u.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                u uVar = (u) obj;
                return gm.l.a(this.f19269a, uVar.f19269a) && gm.l.a(this.f19270b, uVar.f19270b) && gm.l.a(this.f19271c, uVar.f19271c) && gm.l.a(this.f19272d, uVar.f19272d) && gm.l.a(this.f19273e, uVar.f19273e);
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f19270b.hashCode();
        int hashCode2 = (this.f19272d.hashCode() + ((this.f19271c.hashCode() + ((hashCode + (this.f19269a.hashCode() * 31)) * 31)) * 31)) * 31;
        q0 q0Var = this.f19273e;
        return hashCode2 + (q0Var == null ? 0 : q0Var.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CombinedLoadStates(refresh=");
        a10.append(this.f19269a);
        a10.append(", prepend=");
        a10.append(this.f19270b);
        a10.append(", append=");
        a10.append(this.f19271c);
        a10.append(", source=");
        a10.append(this.f19272d);
        a10.append(", mediator=");
        a10.append(this.f19273e);
        a10.append(')');
        return a10.toString();
    }
}
