package ng;

import a0.a2;
import android.support.v4.media.d;
import gm.l;
import i2.t;
import t0.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final long f22350a;

    /* renamed from: b */
    public final String f22351b;

    /* renamed from: c */
    public final String f22352c;

    /* renamed from: d */
    public final int f22353d;

    /* renamed from: e */
    public final float f22354e;

    /* renamed from: f */
    public final float f22355f;

    /* renamed from: g */
    public final int f22356g;

    /* renamed from: h */
    public final float f22357h;

    /* renamed from: i */
    public final int f22358i;

    /* renamed from: j */
    public final int f22359j;

    /* renamed from: k */
    public final String f22360k;

    /* renamed from: l */
    public final String f22361l;

    public a(long j10, String str, String str2, int i10, float f10, float f11, int i11, float f12, int i12, int i13, String str3, String str4) {
        l.f(str, "sportId");
        this.f22350a = j10;
        this.f22351b = str;
        this.f22352c = str2;
        this.f22353d = i10;
        this.f22354e = f10;
        this.f22355f = f11;
        this.f22356g = i11;
        this.f22357h = f12;
        this.f22358i = i12;
        this.f22359j = i13;
        this.f22360k = str3;
        this.f22361l = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f22350a == aVar.f22350a && l.a(this.f22351b, aVar.f22351b) && l.a(this.f22352c, aVar.f22352c) && this.f22353d == aVar.f22353d && Float.compare(this.f22354e, aVar.f22354e) == 0 && Float.compare(this.f22355f, aVar.f22355f) == 0 && this.f22356g == aVar.f22356g && Float.compare(this.f22357h, aVar.f22357h) == 0 && this.f22358i == aVar.f22358i && this.f22359j == aVar.f22359j && l.a(this.f22360k, aVar.f22360k) && l.a(this.f22361l, aVar.f22361l);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j10 = this.f22350a;
        int a10 = t.a(this.f22351b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31);
        int b10 = e.b(this.f22354e, (t.a(this.f22352c, a10, 31) + this.f22353d) * 31, 31);
        int b11 = (((e.b(this.f22357h, (e.b(this.f22355f, b10, 31) + this.f22356g) * 31, 31) + this.f22358i) * 31) + this.f22359j) * 31;
        String str = this.f22360k;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (b11 + hashCode) * 31;
        String str2 = this.f22361l;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        StringBuilder a10 = d.a("SportRecordTemp(userId=");
        a10.append(this.f22350a);
        a10.append(", sportId=");
        a10.append(this.f22351b);
        a10.append(", time=");
        a10.append(this.f22352c);
        a10.append(", duration=");
        a10.append(this.f22353d);
        a10.append(", distance=");
        a10.append(this.f22354e);
        a10.append(", calorie=");
        a10.append(this.f22355f);
        a10.append(", step=");
        a10.append(this.f22356g);
        a10.append(", climb=");
        a10.append(this.f22357h);
        a10.append(", locationType=");
        a10.append(this.f22358i);
        a10.append(", sportType=");
        a10.append(this.f22359j);
        a10.append(", latLngs=");
        a10.append(this.f22360k);
        a10.append(", heartRates=");
        return a2.a(a10, this.f22361l, ')');
    }
}
