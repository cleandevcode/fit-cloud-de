package rj;

import jh.v;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    public final int f25775a;

    /* renamed from: b */
    public final int f25776b;

    /* renamed from: c */
    public final int f25777c;

    public f(int i10, int i11, int i12) {
        this.f25775a = i10;
        this.f25776b = i11;
        this.f25777c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f25775a == fVar.f25775a && this.f25776b == fVar.f25776b && this.f25777c == fVar.f25777c;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f25776b;
        return this.f25777c + ((i10 + (this.f25775a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcWeatherForecast(lowTemperature=");
        c10.append(this.f25775a);
        c10.append(", highTemperature=");
        c10.append(this.f25776b);
        c10.append(", weatherCode=");
        return v.b(c10, this.f25777c, ')');
    }
}
