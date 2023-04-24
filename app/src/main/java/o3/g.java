package o3;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    public final String f22612a;

    /* renamed from: b */
    public final int f22613b;

    public g(String str, int i10) {
        this.f22612a = str;
        this.f22613b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f22613b != gVar.f22613b) {
                return false;
            }
            return this.f22612a.equals(gVar.f22612a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f22612a.hashCode() * 31) + this.f22613b;
    }
}
