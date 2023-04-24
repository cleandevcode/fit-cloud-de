package pg;

import i2.t;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a */
    public final String f24060a;

    /* renamed from: b */
    public final int f24061b;

    /* renamed from: c */
    public final int f24062c;

    /* renamed from: d */
    public final String f24063d;

    /* renamed from: e */
    public final int f24064e;

    /* renamed from: f */
    public final String f24065f;

    /* renamed from: g */
    public final String f24066g;

    /* renamed from: h */
    public final String f24067h;

    /* renamed from: i */
    public final String f24068i;

    /* renamed from: j */
    public final long f24069j;

    public l(String str, int i10, int i11, String str2, int i12, String str3, String str4, String str5, String str6, long j10) {
        gm.l.f(str, "projectNum");
        gm.l.f(str2, "toolVersion");
        gm.l.f(str5, "binUrl");
        this.f24060a = str;
        this.f24061b = i10;
        this.f24062c = i11;
        this.f24063d = str2;
        this.f24064e = i12;
        this.f24065f = str3;
        this.f24066g = str4;
        this.f24067h = str5;
        this.f24068i = str6;
        this.f24069j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return gm.l.a(this.f24060a, lVar.f24060a) && this.f24061b == lVar.f24061b && this.f24062c == lVar.f24062c && gm.l.a(this.f24063d, lVar.f24063d) && this.f24064e == lVar.f24064e && gm.l.a(this.f24065f, lVar.f24065f) && gm.l.a(this.f24066g, lVar.f24066g) && gm.l.a(this.f24067h, lVar.f24067h) && gm.l.a(this.f24068i, lVar.f24068i) && this.f24069j == lVar.f24069j;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int a10 = (t.a(this.f24063d, ((((this.f24060a.hashCode() * 31) + this.f24061b) * 31) + this.f24062c) * 31, 31) + this.f24064e) * 31;
        String str = this.f24065f;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (a10 + hashCode) * 31;
        String str2 = this.f24066g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a11 = t.a(this.f24067h, (i11 + hashCode2) * 31, 31);
        String str3 = this.f24068i;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        long j10 = this.f24069j;
        return ((a11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("UsedDialEntity(projectNum=");
        a10.append(this.f24060a);
        a10.append(", dialNum=");
        a10.append(this.f24061b);
        a10.append(", lcd=");
        a10.append(this.f24062c);
        a10.append(", toolVersion=");
        a10.append(this.f24063d);
        a10.append(", binVersion=");
        a10.append(this.f24064e);
        a10.append(", imgUrl=");
        a10.append(this.f24065f);
        a10.append(", deviceImgUrl=");
        a10.append(this.f24066g);
        a10.append(", binUrl=");
        a10.append(this.f24067h);
        a10.append(", name=");
        a10.append(this.f24068i);
        a10.append(", binSize=");
        return d4.b.a(a10, this.f24069j, ')');
    }
}
