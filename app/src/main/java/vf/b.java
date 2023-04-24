package vf;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;

/* loaded from: classes2.dex */
public final class b implements g {

    /* renamed from: a */
    public final Date f29262a;

    /* renamed from: b */
    public final int f29263b;

    /* renamed from: c */
    public final int f29264c;

    /* renamed from: d */
    public final Date f29265d;

    /* renamed from: e */
    public final float f29266e;

    /* renamed from: f */
    public final float f29267f;

    public b(int i10, int i11, Date date) {
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f29262a = date;
        this.f29263b = i10;
        this.f29264c = i11;
        this.f29265d = date;
        this.f29266e = i10;
        this.f29267f = i11;
    }

    @Override // vf.h
    public final Date a() {
        return this.f29265d;
    }

    @Override // vf.g
    public final float b() {
        return this.f29267f;
    }

    @Override // vf.g
    public final float c() {
        return this.f29266e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return gm.l.a(this.f29262a, bVar.f29262a) && this.f29263b == bVar.f29263b && this.f29264c == bVar.f29264c;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f29262a.hashCode() * 31) + this.f29263b) * 31) + this.f29264c;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("BloodPressureItem(time=");
        a10.append(this.f29262a);
        a10.append(", sbp=");
        a10.append(this.f29263b);
        a10.append(", dbp=");
        return a1.b.a(a10, this.f29264c, ')');
    }
}
