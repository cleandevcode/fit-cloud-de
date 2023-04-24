package pg;

import a0.a2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public final String f24033a;

    /* renamed from: b */
    public final long f24034b;

    /* renamed from: c */
    public final String f24035c;

    public e(String str, long j10, String str2) {
        gm.l.f(str, "projectNum");
        this.f24033a = str;
        this.f24034b = j10;
        this.f24035c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return gm.l.a(this.f24033a, eVar.f24033a) && this.f24034b == eVar.f24034b && gm.l.a(this.f24035c, eVar.f24035c);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24034b;
        int hashCode = ((this.f24033a.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.f24035c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DeviceShellEntity(projectNum=");
        a10.append(this.f24033a);
        a10.append(", time=");
        a10.append(this.f24034b);
        a10.append(", url=");
        return a2.a(a10, this.f24035c, ')');
    }
}
