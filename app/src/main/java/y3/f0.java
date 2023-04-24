package y3;

/* loaded from: classes.dex */
public final class f0<A> {

    /* renamed from: a */
    public final A f30954a;

    public f0(A a10) {
        this.f30954a = a10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && gm.l.a(this.f30954a, ((f0) obj).f30954a);
    }

    public final int hashCode() {
        A a10 = this.f30954a;
        if (a10 == null) {
            return 0;
        }
        return a10.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("MavericksTuple1(a=");
        a10.append(this.f30954a);
        a10.append(')');
        return a10.toString();
    }
}
