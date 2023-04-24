package vf;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class k implements i {

    /* renamed from: a */
    public final Date f29287a;

    /* renamed from: b */
    public final int f29288b;

    /* renamed from: c */
    public final List<j> f29289c;

    /* renamed from: d */
    public final Date f29290d;

    public k(Date date, int i10, List<j> list) {
        gm.l.f(date, "date");
        this.f29287a = date;
        this.f29288b = i10;
        this.f29289c = list;
        this.f29290d = date;
    }

    @Override // vf.i
    public final Date a() {
        return this.f29290d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return gm.l.a(this.f29287a, kVar.f29287a) && this.f29288b == kVar.f29288b && gm.l.a(this.f29289c, kVar.f29289c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.f29287a.hashCode() * 31) + this.f29288b) * 31;
        List<j> list = this.f29289c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("OxygenRecord(date=");
        a10.append(this.f29287a);
        a10.append(", avgOxygen=");
        a10.append(this.f29288b);
        a10.append(", detail=");
        return fb.b.a(a10, this.f29289c, ')');
    }
}
