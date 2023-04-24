package pg;

import i2.t;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final String f24024a;

    /* renamed from: b */
    public final String f24025b;

    /* renamed from: c */
    public final long f24026c;

    public c(String str, long j10, String str2) {
        gm.l.f(str, "key");
        gm.l.f(str2, "cid");
        this.f24024a = str;
        this.f24025b = str2;
        this.f24026c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return gm.l.a(this.f24024a, cVar.f24024a) && gm.l.a(this.f24025b, cVar.f24025b) && this.f24026c == cVar.f24026c;
        }
        return false;
    }

    public final int hashCode() {
        int a10 = t.a(this.f24025b, this.f24024a.hashCode() * 31, 31);
        long j10 = this.f24026c;
        return a10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CityKeyEntity(key=");
        a10.append(this.f24024a);
        a10.append(", cid=");
        a10.append(this.f24025b);
        a10.append(", time=");
        return d4.b.a(a10, this.f24026c, ')');
    }
}
