package vf;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;

/* loaded from: classes2.dex */
public final class l implements g {

    /* renamed from: a */
    public final Date f29291a;

    /* renamed from: b */
    public final int f29292b;

    /* renamed from: c */
    public final Date f29293c;

    /* renamed from: d */
    public final float f29294d;

    public l(int i10, Date date) {
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f29291a = date;
        this.f29292b = i10;
        this.f29293c = date;
        this.f29294d = i10;
    }

    @Override // vf.h
    public final Date a() {
        return this.f29293c;
    }

    @Override // vf.g
    public final float b() {
        return 0.0f;
    }

    @Override // vf.g
    public final float c() {
        return this.f29294d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return gm.l.a(this.f29291a, lVar.f29291a) && this.f29292b == lVar.f29292b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f29291a.hashCode() * 31) + this.f29292b;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("PressureItem(time=");
        a10.append(this.f29291a);
        a10.append(", pressure=");
        return a1.b.a(a10, this.f29292b, ')');
    }
}
