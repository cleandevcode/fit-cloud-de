package u6;

/* loaded from: classes.dex */
public final class l<T> extends a<T> {

    /* renamed from: c */
    public final T f28558c;

    public l() {
        this(null);
    }

    public l(T t10) {
        super(false, t10);
        this.f28558c = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && gm.l.a(this.f28558c, ((l) obj).f28558c);
    }

    public final int hashCode() {
        T t10 = this.f28558c;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Loading(value=");
        a10.append(this.f28558c);
        a10.append(')');
        return a10.toString();
    }
}
