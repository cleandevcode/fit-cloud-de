package pg;

import i2.t;

/* loaded from: classes2.dex */
public final class m extends j {

    /* renamed from: d */
    public final long f24070d;

    /* renamed from: e */
    public final String f24071e;

    /* renamed from: f */
    public final String f24072f;

    /* renamed from: g */
    public String f24073g;

    /* renamed from: h */
    public int f24074h;

    /* renamed from: i */
    public String f24075i;

    /* renamed from: j */
    public float f24076j;

    /* renamed from: k */
    public float f24077k;

    /* renamed from: l */
    public String f24078l;

    /* renamed from: m */
    public String f24079m;

    /* renamed from: n */
    public final int f24080n;

    /* renamed from: o */
    public final int f24081o;

    /* renamed from: p */
    public final int f24082p;

    /* renamed from: q */
    public final long f24083q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j10, String str, String str2, String str3, int i10, String str4, float f10, float f11, String str5, String str6, int i11, int i12, int i13, long j11) {
        super(j11);
        gm.l.f(str3, "nickName");
        gm.l.f(str4, "birthday");
        this.f24070d = j10;
        this.f24071e = str;
        this.f24072f = str2;
        this.f24073g = str3;
        this.f24074h = i10;
        this.f24075i = str4;
        this.f24076j = f10;
        this.f24077k = f11;
        this.f24078l = str5;
        this.f24079m = str6;
        this.f24080n = i11;
        this.f24081o = i12;
        this.f24082p = i13;
        this.f24083q = j11;
    }

    @Override // pg.j
    public final long a() {
        return this.f24083q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f24070d == mVar.f24070d && gm.l.a(this.f24071e, mVar.f24071e) && gm.l.a(this.f24072f, mVar.f24072f) && gm.l.a(this.f24073g, mVar.f24073g) && this.f24074h == mVar.f24074h && gm.l.a(this.f24075i, mVar.f24075i) && Float.compare(this.f24076j, mVar.f24076j) == 0 && Float.compare(this.f24077k, mVar.f24077k) == 0 && gm.l.a(this.f24078l, mVar.f24078l) && gm.l.a(this.f24079m, mVar.f24079m) && this.f24080n == mVar.f24080n && this.f24081o == mVar.f24081o && this.f24082p == mVar.f24082p && this.f24083q == mVar.f24083q;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j10 = this.f24070d;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.f24071e;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        String str2 = this.f24072f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        String str3 = this.f24073g;
        int b10 = t0.e.b(this.f24077k, t0.e.b(this.f24076j, t.a(this.f24075i, (t.a(str3, (i12 + hashCode2) * 31, 31) + this.f24074h) * 31, 31), 31), 31);
        String str4 = this.f24078l;
        if (str4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str4.hashCode();
        }
        int i13 = (b10 + hashCode3) * 31;
        String str5 = this.f24079m;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        long j11 = this.f24083q;
        return ((((((((i13 + i11) * 31) + this.f24080n) * 31) + this.f24081o) * 31) + this.f24082p) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("UserEntity(userId=");
        a10.append(this.f24070d);
        a10.append(", phone=");
        a10.append(this.f24071e);
        a10.append(", email=");
        a10.append(this.f24072f);
        a10.append(", nickName=");
        a10.append(this.f24073g);
        a10.append(", sex=");
        a10.append(this.f24074h);
        a10.append(", birthday=");
        a10.append(this.f24075i);
        a10.append(", height=");
        a10.append(this.f24076j);
        a10.append(", weight=");
        a10.append(this.f24077k);
        a10.append(", avatar=");
        a10.append(this.f24078l);
        a10.append(", identityId=");
        a10.append(this.f24079m);
        a10.append(", hasProfile=");
        a10.append(this.f24080n);
        a10.append(", hasPassword=");
        a10.append(this.f24081o);
        a10.append(", hasIdentity=");
        a10.append(this.f24082p);
        a10.append(", lastModifyTime=");
        return d4.b.a(a10, this.f24083q, ')');
    }
}
