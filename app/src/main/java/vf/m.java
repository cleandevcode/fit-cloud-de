package vf;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class m implements i {

    /* renamed from: a */
    public final Date f29295a;

    /* renamed from: b */
    public final int f29296b;

    /* renamed from: c */
    public final List<l> f29297c;

    /* renamed from: d */
    public final Date f29298d;

    public m(Date date, int i10, List<l> list) {
        gm.l.f(date, "date");
        this.f29295a = date;
        this.f29296b = i10;
        this.f29297c = list;
        this.f29298d = date;
    }

    @Override // vf.i
    public final Date a() {
        return this.f29298d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return gm.l.a(this.f29295a, mVar.f29295a) && this.f29296b == mVar.f29296b && gm.l.a(this.f29297c, mVar.f29297c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.f29295a.hashCode() * 31) + this.f29296b) * 31;
        List<l> list = this.f29297c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("PressureRecord(date=");
        a10.append(this.f29295a);
        a10.append(", avgPressure=");
        a10.append(this.f29296b);
        a10.append(", detail=");
        return fb.b.a(a10, this.f29297c, ')');
    }
}
