package vf;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a */
    public final Date f29268a;

    /* renamed from: b */
    public final int f29269b;

    /* renamed from: c */
    public final int f29270c;

    /* renamed from: d */
    public final List<b> f29271d;

    /* renamed from: e */
    public final Date f29272e;

    public c(Date date, int i10, int i11, List<b> list) {
        gm.l.f(date, "date");
        this.f29268a = date;
        this.f29269b = i10;
        this.f29270c = i11;
        this.f29271d = list;
        this.f29272e = date;
    }

    @Override // vf.i
    public final Date a() {
        return this.f29272e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return gm.l.a(this.f29268a, cVar.f29268a) && this.f29269b == cVar.f29269b && this.f29270c == cVar.f29270c && gm.l.a(this.f29271d, cVar.f29271d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f29268a.hashCode() * 31) + this.f29269b) * 31) + this.f29270c) * 31;
        List<b> list = this.f29271d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("BloodPressureRecord(date=");
        a10.append(this.f29268a);
        a10.append(", avgSbp=");
        a10.append(this.f29269b);
        a10.append(", avgDbp=");
        a10.append(this.f29270c);
        a10.append(", detail=");
        return fb.b.a(a10, this.f29271d, ')');
    }
}
