package pg;

/* loaded from: classes2.dex */
public final class k extends j {

    /* renamed from: d */
    public final long f24055d;

    /* renamed from: e */
    public final int f24056e;

    /* renamed from: f */
    public final int f24057f;

    /* renamed from: g */
    public final int f24058g;

    /* renamed from: h */
    public final long f24059h;

    public k(long j10, int i10, int i11, int i12, long j11) {
        super(j11);
        this.f24055d = j10;
        this.f24056e = i10;
        this.f24057f = i11;
        this.f24058g = i12;
        this.f24059h = j11;
    }

    @Override // pg.j
    public final long a() {
        return this.f24059h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f24055d == kVar.f24055d && this.f24056e == kVar.f24056e && this.f24057f == kVar.f24057f && this.f24058g == kVar.f24058g && this.f24059h == kVar.f24059h;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24055d;
        long j11 = this.f24059h;
        return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + this.f24056e) * 31) + this.f24057f) * 31) + this.f24058g) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("UnitConfigEntity(userId=");
        a10.append(this.f24055d);
        a10.append(", length=");
        a10.append(this.f24056e);
        a10.append(", weight=");
        a10.append(this.f24057f);
        a10.append(", temperature=");
        a10.append(this.f24058g);
        a10.append(", lastModifyTime=");
        return d4.b.a(a10, this.f24059h, ')');
    }
}
