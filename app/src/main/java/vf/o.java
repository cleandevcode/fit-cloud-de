package vf;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;

/* loaded from: classes2.dex */
public final class o implements h {

    /* renamed from: a */
    public final Date f29305a;

    /* renamed from: b */
    public final int f29306b;

    /* renamed from: c */
    public final float f29307c;

    /* renamed from: d */
    public final float f29308d;

    /* renamed from: e */
    public final Date f29309e;

    public o(Date date, int i10, float f10, float f11) {
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f29305a = date;
        this.f29306b = i10;
        this.f29307c = f10;
        this.f29308d = f11;
        this.f29309e = date;
    }

    @Override // vf.h
    public final Date a() {
        return this.f29309e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return gm.l.a(this.f29305a, oVar.f29305a) && this.f29306b == oVar.f29306b && Float.compare(this.f29307c, oVar.f29307c) == 0 && Float.compare(this.f29308d, oVar.f29308d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f29308d) + t0.e.b(this.f29307c, ((this.f29305a.hashCode() * 31) + this.f29306b) * 31, 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("StepItem(time=");
        a10.append(this.f29305a);
        a10.append(", step=");
        a10.append(this.f29306b);
        a10.append(", distance=");
        a10.append(this.f29307c);
        a10.append(", calorie=");
        a10.append(this.f29308d);
        a10.append(')');
        return a10.toString();
    }
}
