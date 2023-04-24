package y3;

import y3.b0;
import y3.k0;

/* loaded from: classes.dex */
public final class b1<VM extends k0<S>, S extends b0> {

    /* renamed from: a */
    public final f1 f30930a;

    /* renamed from: b */
    public final Class<? extends VM> f30931b;

    /* renamed from: c */
    public final Class<? extends S> f30932c;

    /* renamed from: d */
    public final fm.l<S, S> f30933d;

    public b1(f1 f1Var, Class cls, Class cls2, u0 u0Var) {
        this.f30930a = f1Var;
        this.f30931b = cls;
        this.f30932c = cls2;
        this.f30933d = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            b1 b1Var = (b1) obj;
            return gm.l.a(this.f30930a, b1Var.f30930a) && gm.l.a(this.f30931b, b1Var.f30931b) && gm.l.a(this.f30932c, b1Var.f30932c) && gm.l.a(this.f30933d, b1Var.f30933d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f30931b.hashCode();
        int hashCode2 = this.f30932c.hashCode();
        return this.f30933d.hashCode() + ((hashCode2 + ((hashCode + (this.f30930a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("StateRestorer(viewModelContext=");
        a10.append(this.f30930a);
        a10.append(", viewModelClass=");
        a10.append(this.f30931b);
        a10.append(", stateClass=");
        a10.append(this.f30932c);
        a10.append(", toRestoredState=");
        a10.append(this.f30933d);
        a10.append(')');
        return a10.toString();
    }
}
