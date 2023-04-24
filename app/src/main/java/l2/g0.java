package l2;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    public final int f18896a;

    /* renamed from: b */
    public final j3 f18897b;

    public g0(int i10, j3 j3Var) {
        gm.l.f(j3Var, "hint");
        this.f18896a = i10;
        this.f18897b = j3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return this.f18896a == g0Var.f18896a && gm.l.a(this.f18897b, g0Var.f18897b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18897b.hashCode() + (this.f18896a * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("GenerationalViewportHint(generationId=");
        a10.append(this.f18896a);
        a10.append(", hint=");
        a10.append(this.f18897b);
        a10.append(')');
        return a10.toString();
    }
}
