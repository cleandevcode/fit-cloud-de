package vf;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class r implements i {

    /* renamed from: a */
    public final Date f29322a;

    /* renamed from: b */
    public final float f29323b;

    /* renamed from: c */
    public final float f29324c;

    /* renamed from: d */
    public final List<q> f29325d;

    /* renamed from: e */
    public final Date f29326e;

    public r(Date date, float f10, float f11, List<q> list) {
        gm.l.f(date, "date");
        this.f29322a = date;
        this.f29323b = f10;
        this.f29324c = f11;
        this.f29325d = list;
        this.f29326e = date;
    }

    @Override // vf.i
    public final Date a() {
        return this.f29326e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return gm.l.a(this.f29322a, rVar.f29322a) && Float.compare(this.f29323b, rVar.f29323b) == 0 && Float.compare(this.f29324c, rVar.f29324c) == 0 && gm.l.a(this.f29325d, rVar.f29325d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = t0.e.b(this.f29324c, t0.e.b(this.f29323b, this.f29322a.hashCode() * 31, 31), 31);
        List<q> list = this.f29325d;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return b10 + hashCode;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("TemperatureRecord(date=");
        a10.append(this.f29322a);
        a10.append(", avgBody=");
        a10.append(this.f29323b);
        a10.append(", avgWrist=");
        a10.append(this.f29324c);
        a10.append(", detail=");
        return fb.b.a(a10, this.f29325d, ')');
    }
}
