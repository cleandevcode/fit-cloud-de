package u6;

/* loaded from: classes.dex */
public final class a0<T> extends a<T> {

    /* renamed from: c */
    public final T f28523c;

    public a0(T t10) {
        super(true, t10);
        this.f28523c = t10;
    }

    @Override // u6.a
    public final T a() {
        return this.f28523c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && gm.l.a(this.f28523c, ((a0) obj).f28523c);
    }

    public final int hashCode() {
        T t10 = this.f28523c;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Success(value=");
        a10.append(this.f28523c);
        a10.append(')');
        return a10.toString();
    }
}
