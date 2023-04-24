package ul;

/* loaded from: classes2.dex */
public final class v<T> {

    /* renamed from: a */
    public final int f28882a;

    /* renamed from: b */
    public final T f28883b;

    public v(int i10, T t10) {
        this.f28882a = i10;
        this.f28883b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return this.f28882a == vVar.f28882a && gm.l.a(this.f28883b, vVar.f28883b);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f28882a * 31;
        T t10 = this.f28883b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("IndexedValue(index=");
        a10.append(this.f28882a);
        a10.append(", value=");
        a10.append(this.f28883b);
        a10.append(')');
        return a10.toString();
    }
}
