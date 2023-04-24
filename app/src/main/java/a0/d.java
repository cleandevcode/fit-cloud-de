package a0;

import a0.l0;

/* loaded from: classes.dex */
public final class d<T> extends l0.a<T> {

    /* renamed from: a */
    public final String f33a;

    /* renamed from: b */
    public final Class<T> f34b;

    /* renamed from: c */
    public final Object f35c;

    public d(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f33a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.f34b = cls;
        this.f35c = obj;
    }

    @Override // a0.l0.a
    public final String b() {
        return this.f33a;
    }

    @Override // a0.l0.a
    public final Object c() {
        return this.f35c;
    }

    @Override // a0.l0.a
    public final Class<T> d() {
        return this.f34b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0.a) {
            l0.a aVar = (l0.a) obj;
            if (this.f33a.equals(aVar.b()) && this.f34b.equals(aVar.d())) {
                Object obj2 = this.f35c;
                Object c10 = aVar.c();
                if (obj2 == null) {
                    if (c10 == null) {
                        return true;
                    }
                } else if (obj2.equals(c10)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f33a.hashCode() ^ 1000003) * 1000003) ^ this.f34b.hashCode()) * 1000003;
        Object obj = this.f35c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Option{id=");
        a10.append(this.f33a);
        a10.append(", valueClass=");
        a10.append(this.f34b);
        a10.append(", token=");
        a10.append(this.f35c);
        a10.append("}");
        return a10.toString();
    }
}
