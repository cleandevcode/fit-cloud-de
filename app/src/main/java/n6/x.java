package n6;

import java.util.Set;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    public final o5.a f22183a;

    /* renamed from: b */
    public final o5.h f22184b;

    /* renamed from: c */
    public final Set<String> f22185c;

    /* renamed from: d */
    public final Set<String> f22186d;

    public x(o5.a aVar, o5.h hVar, Set<String> set, Set<String> set2) {
        this.f22183a = aVar;
        this.f22184b = hVar;
        this.f22185c = set;
        this.f22186d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return gm.l.a(this.f22183a, xVar.f22183a) && gm.l.a(this.f22184b, xVar.f22184b) && gm.l.a(this.f22185c, xVar.f22185c) && gm.l.a(this.f22186d, xVar.f22186d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f22183a.hashCode() * 31;
        o5.h hVar = this.f22184b;
        int hashCode2 = hVar == null ? 0 : hVar.hashCode();
        return this.f22186d.hashCode() + ((this.f22185c.hashCode() + ((hashCode + hashCode2) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("LoginResult(accessToken=");
        a10.append(this.f22183a);
        a10.append(", authenticationToken=");
        a10.append(this.f22184b);
        a10.append(", recentlyGrantedPermissions=");
        a10.append(this.f22185c);
        a10.append(", recentlyDeniedPermissions=");
        a10.append(this.f22186d);
        a10.append(')');
        return a10.toString();
    }
}
