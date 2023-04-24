package pg;

/* loaded from: classes2.dex */
public final class d extends j {

    /* renamed from: d */
    public final long f24027d;

    /* renamed from: e */
    public final String f24028e;

    /* renamed from: f */
    public final String f24029f;

    /* renamed from: g */
    public final String f24030g;

    /* renamed from: h */
    public final int f24031h;

    /* renamed from: i */
    public final long f24032i;

    public d(long j10, String str, String str2, String str3, int i10, long j11) {
        super(j11);
        this.f24027d = j10;
        this.f24028e = str;
        this.f24029f = str2;
        this.f24030g = str3;
        this.f24031h = i10;
        this.f24032i = j11;
    }

    @Override // pg.j
    public final long a() {
        return this.f24032i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f24027d == dVar.f24027d && gm.l.a(this.f24028e, dVar.f24028e) && gm.l.a(this.f24029f, dVar.f24029f) && gm.l.a(this.f24030g, dVar.f24030g) && this.f24031h == dVar.f24031h && this.f24032i == dVar.f24032i;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24027d;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f24028e;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24029f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24030g;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long j11 = this.f24032i;
        return ((((hashCode2 + hashCode3) * 31) + this.f24031h) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("DeviceBindEntity(userId=");
        a10.append(this.f24027d);
        a10.append(", address=");
        a10.append(this.f24028e);
        a10.append(", name=");
        a10.append(this.f24029f);
        a10.append(", hardwareInfo=");
        a10.append(this.f24030g);
        a10.append(", isUnBind=");
        a10.append(this.f24031h);
        a10.append(", lastModifyTime=");
        return d4.b.a(a10, this.f24032i, ')');
    }
}
