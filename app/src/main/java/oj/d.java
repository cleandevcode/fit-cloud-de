package oj;

import jh.v;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public final int f23574a;

    /* renamed from: b */
    public final int f23575b;

    /* renamed from: c */
    public final int f23576c;

    /* renamed from: d */
    public final int f23577d;

    /* renamed from: e */
    public final int f23578e;

    /* renamed from: f */
    public final float f23579f;

    /* renamed from: g */
    public final float f23580g;

    /* renamed from: h */
    public final int f23581h;

    public d(int i10, int i11, int i12, int i13, int i14, float f10, float f11, int i15) {
        this.f23574a = i10;
        this.f23575b = i11;
        this.f23576c = i12;
        this.f23577d = i13;
        this.f23578e = i14;
        this.f23579f = f10;
        this.f23580g = f11;
        this.f23581h = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f23574a == dVar.f23574a && this.f23575b == dVar.f23575b && this.f23576c == dVar.f23576c && this.f23577d == dVar.f23577d && this.f23578e == dVar.f23578e && Float.compare(this.f23579f, dVar.f23579f) == 0 && Float.compare(this.f23580g, dVar.f23580g) == 0 && this.f23581h == dVar.f23581h;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f23575b;
        int i11 = this.f23576c;
        int i12 = this.f23577d;
        int i13 = this.f23578e;
        return this.f23581h + t0.e.b(this.f23580g, t0.e.b(this.f23579f, (i13 + ((i12 + ((i11 + ((i10 + (this.f23574a * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcHealthDataResult(heartRate=");
        c10.append(this.f23574a);
        c10.append(", oxygen=");
        c10.append(this.f23575b);
        c10.append(", diastolicPressure=");
        c10.append(this.f23576c);
        c10.append(", systolicPressure=");
        c10.append(this.f23577d);
        c10.append(", respiratoryRate=");
        c10.append(this.f23578e);
        c10.append(", temperatureWrist=");
        c10.append(this.f23579f);
        c10.append(", temperatureBody=");
        c10.append(this.f23580g);
        c10.append(", pressure=");
        return v.b(c10, this.f23581h, ')');
    }
}
