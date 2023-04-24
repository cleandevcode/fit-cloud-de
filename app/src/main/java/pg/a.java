package pg;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final long f24014a;

    /* renamed from: b */
    public final long f24015b;

    /* renamed from: c */
    public final String f24016c;

    /* renamed from: d */
    public final String f24017d;

    /* renamed from: e */
    public final long f24018e;

    public a(long j10, long j11, String str, String str2, long j12) {
        this.f24014a = j10;
        this.f24015b = j11;
        this.f24016c = str;
        this.f24017d = str2;
        this.f24018e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f24014a == aVar.f24014a && this.f24015b == aVar.f24015b && gm.l.a(this.f24016c, aVar.f24016c) && gm.l.a(this.f24017d, aVar.f24017d) && this.f24018e == aVar.f24018e;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24014a;
        long j11 = this.f24015b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        String str = this.f24016c;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24017d;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j12 = this.f24018e;
        return ((hashCode + hashCode2) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AuthInfo(userId=");
        a10.append(this.f24014a);
        a10.append(", tokenAuthTime=");
        a10.append(this.f24015b);
        a10.append(", accessToken=");
        a10.append(this.f24016c);
        a10.append(", refreshToken=");
        a10.append(this.f24017d);
        a10.append(", tokenExpiresTime=");
        return d4.b.a(a10, this.f24018e, ')');
    }
}
