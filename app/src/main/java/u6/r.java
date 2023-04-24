package u6;

/* loaded from: classes.dex */
public final class r<A, B> {

    /* renamed from: a */
    public final A f28604a;

    /* renamed from: b */
    public final B f28605b;

    public r(A a10, B b10) {
        this.f28604a = a10;
        this.f28605b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return gm.l.a(this.f28604a, rVar.f28604a) && gm.l.a(this.f28605b, rVar.f28605b);
        }
        return false;
    }

    public final int hashCode() {
        A a10 = this.f28604a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f28605b;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("MavericksTuple2(a=");
        a10.append(this.f28604a);
        a10.append(", b=");
        a10.append(this.f28605b);
        a10.append(')');
        return a10.toString();
    }
}
