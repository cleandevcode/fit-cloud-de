package uf;

import a0.a2;
import gm.l;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public final String f28715a;

    /* renamed from: b */
    public final int f28716b;

    /* renamed from: c */
    public final String f28717c;

    /* renamed from: d */
    public final String f28718d;

    public d(String str, int i10, String str2, String str3) {
        l.f(str, "nickName");
        this.f28715a = str;
        this.f28716b = i10;
        this.f28717c = str2;
        this.f28718d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return l.a(this.f28715a, dVar.f28715a) && this.f28716b == dVar.f28716b && l.a(this.f28717c, dVar.f28717c) && l.a(this.f28718d, dVar.f28718d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.f28715a.hashCode() * 31) + this.f28716b) * 31;
        String str = this.f28717c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28718d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("UserSimpleInfo(nickName=");
        a10.append(this.f28715a);
        a10.append(", sex=");
        a10.append(this.f28716b);
        a10.append(", avatar=");
        a10.append(this.f28717c);
        a10.append(", identityId=");
        return a2.a(a10, this.f28718d, ')');
    }
}
