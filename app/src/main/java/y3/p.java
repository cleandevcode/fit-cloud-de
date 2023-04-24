package y3;

/* loaded from: classes.dex */
public final class p<T> extends b<T> {

    /* renamed from: b */
    public final T f31007b;

    public p() {
        this(null);
    }

    public p(T t10) {
        super(t10);
        this.f31007b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && gm.l.a(this.f31007b, ((p) obj).f31007b);
    }

    public final int hashCode() {
        T t10 = this.f31007b;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Loading(value=");
        a10.append(this.f31007b);
        a10.append(')');
        return a10.toString();
    }
}
