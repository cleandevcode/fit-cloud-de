package vf;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;

/* loaded from: classes2.dex */
public final class q implements g {

    /* renamed from: a */
    public final Date f29316a;

    /* renamed from: b */
    public final float f29317b;

    /* renamed from: c */
    public final float f29318c;

    /* renamed from: d */
    public final Date f29319d;

    /* renamed from: e */
    public final float f29320e;

    /* renamed from: f */
    public final float f29321f;

    public q(Date date, float f10, float f11) {
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f29316a = date;
        this.f29317b = f10;
        this.f29318c = f11;
        this.f29319d = date;
        this.f29320e = f10;
        this.f29321f = f11;
    }

    @Override // vf.h
    public final Date a() {
        return this.f29319d;
    }

    @Override // vf.g
    public final float b() {
        return this.f29321f;
    }

    @Override // vf.g
    public final float c() {
        return this.f29320e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return gm.l.a(this.f29316a, qVar.f29316a) && Float.compare(this.f29317b, qVar.f29317b) == 0 && Float.compare(this.f29318c, qVar.f29318c) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f29318c) + t0.e.b(this.f29317b, this.f29316a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("TemperatureItem(time=");
        a10.append(this.f29316a);
        a10.append(", body=");
        a10.append(this.f29317b);
        a10.append(", wrist=");
        a10.append(this.f29318c);
        a10.append(')');
        return a10.toString();
    }
}
