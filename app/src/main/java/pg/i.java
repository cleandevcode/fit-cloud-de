package pg;

import a0.a2;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a */
    public final long f24049a;

    /* renamed from: b */
    public final int f24050b;

    /* renamed from: c */
    public final String f24051c;

    public i(int i10, long j10, String str) {
        this.f24049a = j10;
        this.f24050b = i10;
        this.f24051c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f24049a == iVar.f24049a && this.f24050b == iVar.f24050b && gm.l.a(this.f24051c, iVar.f24051c);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24049a;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + this.f24050b) * 31;
        String str = this.f24051c;
        return i10 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("StringTypedEntity(userId=");
        a10.append(this.f24049a);
        a10.append(", type=");
        a10.append(this.f24050b);
        a10.append(", data=");
        return a2.a(a10, this.f24051c, ')');
    }
}
