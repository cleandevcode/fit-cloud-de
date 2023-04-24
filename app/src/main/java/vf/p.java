package vf;

import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class p implements i {

    /* renamed from: a */
    public final Date f29310a;

    /* renamed from: b */
    public final int f29311b;

    /* renamed from: c */
    public final float f29312c;

    /* renamed from: d */
    public final float f29313d;

    /* renamed from: e */
    public final List<o> f29314e;

    /* renamed from: f */
    public final Date f29315f;

    public /* synthetic */ p(Date date, int i10, float f10, float f11, int i11) {
        this(date, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? 0.0f : f10, (i11 & 8) != 0 ? 0.0f : f11, (List<o>) null);
    }

    public p(Date date, int i10, float f10, float f11, List<o> list) {
        gm.l.f(date, "date");
        this.f29310a = date;
        this.f29311b = i10;
        this.f29312c = f10;
        this.f29313d = f11;
        this.f29314e = list;
        this.f29315f = date;
    }

    @Override // vf.i
    public final Date a() {
        return this.f29315f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return gm.l.a(this.f29310a, pVar.f29310a) && this.f29311b == pVar.f29311b && Float.compare(this.f29312c, pVar.f29312c) == 0 && Float.compare(this.f29313d, pVar.f29313d) == 0 && gm.l.a(this.f29314e, pVar.f29314e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = t0.e.b(this.f29313d, t0.e.b(this.f29312c, ((this.f29310a.hashCode() * 31) + this.f29311b) * 31, 31), 31);
        List<o> list = this.f29314e;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return b10 + hashCode;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("StepRecord(date=");
        a10.append(this.f29310a);
        a10.append(", step=");
        a10.append(this.f29311b);
        a10.append(", distance=");
        a10.append(this.f29312c);
        a10.append(", calorie=");
        a10.append(this.f29313d);
        a10.append(", detail=");
        return fb.b.a(a10, this.f29314e, ')');
    }
}
