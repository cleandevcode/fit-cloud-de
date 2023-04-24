package y3;

/* loaded from: classes.dex */
public final class c1<T> extends b<T> {

    /* renamed from: b */
    public final T f30937b;

    public c1(T t10) {
        super(t10);
        this.f30937b = t10;
    }

    @Override // y3.b
    public final T a() {
        return this.f30937b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && gm.l.a(this.f30937b, ((c1) obj).f30937b);
    }

    public final int hashCode() {
        T t10 = this.f30937b;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Success(value=");
        a10.append(this.f30937b);
        a10.append(')');
        return a10.toString();
    }
}
