package fg;

import a1.b;
import android.support.v4.media.d;
import gm.l;
import i2.t;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final String f14259a;

    /* renamed from: b */
    public final String f14260b;

    /* renamed from: c */
    public final int f14261c;

    public a(String str, String str2, int i10) {
        l.f(str, "cid");
        l.f(str2, "locality");
        this.f14259a = str;
        this.f14260b = str2;
        this.f14261c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return l.a(this.f14259a, aVar.f14259a) && l.a(this.f14260b, aVar.f14260b) && this.f14261c == aVar.f14261c;
        }
        return false;
    }

    public final int hashCode() {
        return t.a(this.f14260b, this.f14259a.hashCode() * 31, 31) + this.f14261c;
    }

    public final String toString() {
        StringBuilder a10 = d.a("CityInfo(cid=");
        a10.append(this.f14259a);
        a10.append(", locality=");
        a10.append(this.f14260b);
        a10.append(", errorCount=");
        return b.a(a10, this.f14261c, ')');
    }
}
