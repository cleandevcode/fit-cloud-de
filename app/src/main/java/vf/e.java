package vf;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;

/* loaded from: classes2.dex */
public final class e implements g {

    /* renamed from: a */
    public final Date f29275a;

    /* renamed from: b */
    public final int f29276b;

    /* renamed from: c */
    public final Date f29277c;

    /* renamed from: d */
    public final float f29278d;

    public e(int i10, Date date) {
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f29275a = date;
        this.f29276b = i10;
        this.f29277c = date;
        this.f29278d = i10;
    }

    @Override // vf.h
    public final Date a() {
        return this.f29277c;
    }

    @Override // vf.g
    public final float b() {
        return 0.0f;
    }

    @Override // vf.g
    public final float c() {
        return this.f29278d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return gm.l.a(this.f29275a, eVar.f29275a) && this.f29276b == eVar.f29276b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f29275a.hashCode() * 31) + this.f29276b;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("HeartRateItem(time=");
        a10.append(this.f29275a);
        a10.append(", heartRate=");
        return a1.b.a(a10, this.f29276b, ')');
    }
}
