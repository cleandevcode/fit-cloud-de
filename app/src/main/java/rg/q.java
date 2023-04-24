package rg;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.SportHeartRate;
import com.topstep.fitcloud.pro.model.data.SportLatLng;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a */
    public final UUID f25645a;

    /* renamed from: b */
    public final Date f25646b;

    /* renamed from: c */
    public final List<SportLatLng> f25647c;

    /* renamed from: d */
    public final List<SportHeartRate> f25648d;

    public q(UUID uuid, Date date, List<SportLatLng> list, List<SportHeartRate> list2) {
        gm.l.f(uuid, "sportId");
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f25645a = uuid;
        this.f25646b = date;
        this.f25647c = list;
        this.f25648d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return gm.l.a(this.f25645a, qVar.f25645a) && gm.l.a(this.f25646b, qVar.f25646b) && gm.l.a(this.f25647c, qVar.f25647c) && gm.l.a(this.f25648d, qVar.f25648d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f25646b.hashCode() + (this.f25645a.hashCode() * 31)) * 31;
        List<SportLatLng> list = this.f25647c;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SportHeartRate> list2 = this.f25648d;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SportDetailEntity(sportId=");
        a10.append(this.f25645a);
        a10.append(", time=");
        a10.append(this.f25646b);
        a10.append(", latLngs=");
        a10.append(this.f25647c);
        a10.append(", heartRates=");
        return fb.b.a(a10, this.f25648d, ')');
    }
}
