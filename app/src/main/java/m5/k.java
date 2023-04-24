package m5;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public Class<?> f20379a;

    /* renamed from: b */
    public Class<?> f20380b;

    /* renamed from: c */
    public Class<?> f20381c;

    public k() {
    }

    public k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f20379a = cls;
        this.f20380b = cls2;
        this.f20381c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f20379a.equals(kVar.f20379a) && this.f20380b.equals(kVar.f20380b) && l.b(this.f20381c, kVar.f20381c);
    }

    public final int hashCode() {
        int hashCode = (this.f20380b.hashCode() + (this.f20379a.hashCode() * 31)) * 31;
        Class<?> cls = this.f20381c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("MultiClassKey{first=");
        a10.append(this.f20379a);
        a10.append(", second=");
        a10.append(this.f20380b);
        a10.append('}');
        return a10.toString();
    }
}
