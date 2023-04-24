package rg;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.SportHeartRate;
import com.topstep.fitcloud.pro.model.data.SportLatLng;
import com.topstep.fitcloud.pro.model.data.SportRecord;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a */
    public final long f25649a;

    /* renamed from: b */
    public final UUID f25650b;

    /* renamed from: c */
    public final Date f25651c;

    /* renamed from: d */
    public final int f25652d;

    /* renamed from: e */
    public final float f25653e;

    /* renamed from: f */
    public final float f25654f;

    /* renamed from: g */
    public final int f25655g;

    /* renamed from: h */
    public final float f25656h;

    /* renamed from: i */
    public final int f25657i;

    /* renamed from: j */
    public final int f25658j;

    /* renamed from: k */
    public final int f25659k;

    public r(long j10, UUID uuid, Date date, int i10, float f10, float f11, int i11, float f12, int i12, int i13, int i14) {
        gm.l.f(uuid, "sportId");
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f25649a = j10;
        this.f25650b = uuid;
        this.f25651c = date;
        this.f25652d = i10;
        this.f25653e = f10;
        this.f25654f = f11;
        this.f25655g = i11;
        this.f25656h = f12;
        this.f25657i = i12;
        this.f25658j = i13;
        this.f25659k = i14;
    }

    public final SportRecord a(q qVar) {
        List<SportLatLng> list;
        List<SportHeartRate> list2;
        UUID uuid = this.f25650b;
        Date date = this.f25651c;
        int i10 = this.f25652d;
        float f10 = this.f25653e;
        float f11 = this.f25654f;
        int i11 = this.f25655g;
        float f12 = this.f25656h;
        int i12 = this.f25657i;
        int i13 = this.f25658j;
        if (qVar != null) {
            list = qVar.f25647c;
        } else {
            list = null;
        }
        if (qVar != null) {
            list2 = qVar.f25648d;
        } else {
            list2 = null;
        }
        return new SportRecord(uuid, date, i10, f10, f11, i11, f12, i12, i13, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f25649a == rVar.f25649a && gm.l.a(this.f25650b, rVar.f25650b) && gm.l.a(this.f25651c, rVar.f25651c) && this.f25652d == rVar.f25652d && Float.compare(this.f25653e, rVar.f25653e) == 0 && Float.compare(this.f25654f, rVar.f25654f) == 0 && this.f25655g == rVar.f25655g && Float.compare(this.f25656h, rVar.f25656h) == 0 && this.f25657i == rVar.f25657i && this.f25658j == rVar.f25658j && this.f25659k == rVar.f25659k;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f25649a;
        int hashCode = this.f25650b.hashCode();
        int hashCode2 = this.f25651c.hashCode();
        int b10 = t0.e.b(this.f25653e, (((hashCode2 + ((hashCode + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31)) * 31) + this.f25652d) * 31, 31);
        return ((((t0.e.b(this.f25656h, (t0.e.b(this.f25654f, b10, 31) + this.f25655g) * 31, 31) + this.f25657i) * 31) + this.f25658j) * 31) + this.f25659k;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SportRecordEntity(userId=");
        a10.append(this.f25649a);
        a10.append(", sportId=");
        a10.append(this.f25650b);
        a10.append(", time=");
        a10.append(this.f25651c);
        a10.append(", duration=");
        a10.append(this.f25652d);
        a10.append(", distance=");
        a10.append(this.f25653e);
        a10.append(", calorie=");
        a10.append(this.f25654f);
        a10.append(", step=");
        a10.append(this.f25655g);
        a10.append(", climb=");
        a10.append(this.f25656h);
        a10.append(", locationType=");
        a10.append(this.f25657i);
        a10.append(", sportType=");
        a10.append(this.f25658j);
        a10.append(", uploadFlag=");
        return a1.b.a(a10, this.f25659k, ')');
    }
}
