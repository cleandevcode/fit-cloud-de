package pg;

import i2.t;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final String f24019a;

    /* renamed from: b */
    public final String f24020b;

    /* renamed from: c */
    public final Double f24021c;

    /* renamed from: d */
    public final Double f24022d;

    /* renamed from: e */
    public final int f24023e;

    public b(String str, String str2, Double d10, Double d11, int i10) {
        gm.l.f(str, "cid");
        gm.l.f(str2, "locality");
        this.f24019a = str;
        this.f24020b = str2;
        this.f24021c = d10;
        this.f24022d = d11;
        this.f24023e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return gm.l.a(this.f24019a, bVar.f24019a) && gm.l.a(this.f24020b, bVar.f24020b) && gm.l.a(this.f24021c, bVar.f24021c) && gm.l.a(this.f24022d, bVar.f24022d) && this.f24023e == bVar.f24023e;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a10 = t.a(this.f24020b, this.f24019a.hashCode() * 31, 31);
        Double d10 = this.f24021c;
        int i10 = 0;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        int i11 = (a10 + hashCode) * 31;
        Double d11 = this.f24022d;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return ((i11 + i10) * 31) + this.f24023e;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CityEntity(cid=");
        a10.append(this.f24019a);
        a10.append(", locality=");
        a10.append(this.f24020b);
        a10.append(", lat=");
        a10.append(this.f24021c);
        a10.append(", lng=");
        a10.append(this.f24022d);
        a10.append(", errorCount=");
        return a1.b.a(a10, this.f24023e, ')');
    }
}
