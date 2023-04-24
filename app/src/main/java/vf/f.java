package vf;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a */
    public final Date f29279a;

    /* renamed from: b */
    public final int f29280b;

    /* renamed from: c */
    public final List<e> f29281c;

    /* renamed from: d */
    public final Date f29282d;

    public f(Date date, int i10, List<e> list) {
        gm.l.f(date, "date");
        this.f29279a = date;
        this.f29280b = i10;
        this.f29281c = list;
        this.f29282d = date;
    }

    @Override // vf.i
    public final Date a() {
        return this.f29282d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return gm.l.a(this.f29279a, fVar.f29279a) && this.f29280b == fVar.f29280b && gm.l.a(this.f29281c, fVar.f29281c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.f29279a.hashCode() * 31) + this.f29280b) * 31;
        List<e> list = this.f29281c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("HeartRateRecord(date=");
        a10.append(this.f29279a);
        a10.append(", avgHeartRate=");
        a10.append(this.f29280b);
        a10.append(", detail=");
        return fb.b.a(a10, this.f29281c, ')');
    }
}
