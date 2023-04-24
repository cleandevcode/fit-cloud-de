package vf;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.SleepItem;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class n implements i {

    /* renamed from: a */
    public final Date f29299a;

    /* renamed from: b */
    public final int f29300b;

    /* renamed from: c */
    public final int f29301c;

    /* renamed from: d */
    public final int f29302d;

    /* renamed from: e */
    public final List<SleepItem> f29303e;

    /* renamed from: f */
    public final Date f29304f;

    public /* synthetic */ n(Date date, int i10, int i11, int i12, int i13) {
        this(date, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (List<SleepItem>) null);
    }

    public n(Date date, int i10, int i11, int i12, List<SleepItem> list) {
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f29299a = date;
        this.f29300b = i10;
        this.f29301c = i11;
        this.f29302d = i12;
        this.f29303e = list;
        this.f29304f = date;
    }

    @Override // vf.i
    public final Date a() {
        return this.f29304f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return gm.l.a(this.f29299a, nVar.f29299a) && this.f29300b == nVar.f29300b && this.f29301c == nVar.f29301c && this.f29302d == nVar.f29302d && gm.l.a(this.f29303e, nVar.f29303e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.f29299a.hashCode() * 31) + this.f29300b) * 31) + this.f29301c) * 31) + this.f29302d) * 31;
        List<SleepItem> list = this.f29303e;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SleepRecord(time=");
        a10.append(this.f29299a);
        a10.append(", deepSleep=");
        a10.append(this.f29300b);
        a10.append(", lightSleep=");
        a10.append(this.f29301c);
        a10.append(", soberSleep=");
        a10.append(this.f29302d);
        a10.append(", detail=");
        return fb.b.a(a10, this.f29303e, ')');
    }
}
