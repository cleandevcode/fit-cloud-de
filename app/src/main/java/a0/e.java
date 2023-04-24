package a0;

/* loaded from: classes.dex */
public final class e extends u0 {

    /* renamed from: a */
    public final Object f47a;

    public e(Object obj) {
        this.f47a = obj;
    }

    @Override // a0.u0
    public final Object a() {
        return this.f47a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u0) {
            return this.f47a.equals(((u0) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f47a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Identifier{value=");
        a10.append(this.f47a);
        a10.append("}");
        return a10.toString();
    }
}
