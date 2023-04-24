package u6;

/* loaded from: classes.dex */
public final class q<A> {

    /* renamed from: a */
    public final A f28603a;

    public q(A a10) {
        this.f28603a = a10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && gm.l.a(this.f28603a, ((q) obj).f28603a);
    }

    public final int hashCode() {
        A a10 = this.f28603a;
        if (a10 == null) {
            return 0;
        }
        return a10.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("MavericksTuple1(a=");
        a10.append(this.f28603a);
        a10.append(')');
        return a10.toString();
    }
}
