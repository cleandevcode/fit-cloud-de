package vf;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;

/* loaded from: classes2.dex */
public final class j implements g {

    /* renamed from: a */
    public final Date f29283a;

    /* renamed from: b */
    public final int f29284b;

    /* renamed from: c */
    public final Date f29285c;

    /* renamed from: d */
    public final float f29286d;

    public j(int i10, Date date) {
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f29283a = date;
        this.f29284b = i10;
        this.f29285c = date;
        this.f29286d = i10;
    }

    @Override // vf.h
    public final Date a() {
        return this.f29285c;
    }

    @Override // vf.g
    public final float b() {
        return 0.0f;
    }

    @Override // vf.g
    public final float c() {
        return this.f29286d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return gm.l.a(this.f29283a, jVar.f29283a) && this.f29284b == jVar.f29284b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f29283a.hashCode() * 31) + this.f29284b;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("OxygenItem(time=");
        a10.append(this.f29283a);
        a10.append(", oxygen=");
        return a1.b.a(a10, this.f29284b, ')');
    }
}
