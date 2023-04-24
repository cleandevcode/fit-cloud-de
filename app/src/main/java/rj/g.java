package rj;

import jh.v;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a */
    public final int f25778a;

    /* renamed from: b */
    public final int f25779b;

    /* renamed from: c */
    public final int f25780c;

    /* renamed from: d */
    public final int f25781d;

    /* renamed from: e */
    public final int f25782e;

    /* renamed from: f */
    public final int f25783f;

    /* renamed from: g */
    public final int f25784g;

    public g(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f25778a = i10;
        this.f25779b = i11;
        this.f25780c = i12;
        this.f25781d = i13;
        this.f25782e = i14;
        this.f25783f = i15;
        this.f25784g = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f25778a == gVar.f25778a && this.f25779b == gVar.f25779b && this.f25780c == gVar.f25780c && this.f25781d == gVar.f25781d && this.f25782e == gVar.f25782e && this.f25783f == gVar.f25783f && this.f25784g == gVar.f25784g;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f25779b;
        int i11 = this.f25780c;
        int i12 = this.f25781d;
        int i13 = this.f25782e;
        int i14 = this.f25783f;
        return this.f25784g + ((i14 + ((i13 + ((i12 + ((i11 + ((i10 + (this.f25778a * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcWeatherToday(lowTemperature=");
        c10.append(this.f25778a);
        c10.append(", highTemperature=");
        c10.append(this.f25779b);
        c10.append(", weatherCode=");
        c10.append(this.f25780c);
        c10.append(", currentTemperature=");
        c10.append(this.f25781d);
        c10.append(", pressure=");
        c10.append(this.f25782e);
        c10.append(", windForce=");
        c10.append(this.f25783f);
        c10.append(", visibility=");
        return v.b(c10, this.f25784g, ')');
    }
}
