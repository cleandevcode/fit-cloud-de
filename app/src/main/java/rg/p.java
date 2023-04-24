package rg;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a */
    public final long f25639a;

    /* renamed from: b */
    public final Date f25640b;

    /* renamed from: c */
    public final int f25641c;

    /* renamed from: d */
    public final int f25642d;

    /* renamed from: e */
    public final int f25643e;

    /* renamed from: f */
    public long f25644f;

    public p(long j10, Date date, int i10, int i11, int i12, long j11) {
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f25639a = j10;
        this.f25640b = date;
        this.f25641c = i10;
        this.f25642d = i11;
        this.f25643e = i12;
        this.f25644f = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f25639a == pVar.f25639a && gm.l.a(this.f25640b, pVar.f25640b) && this.f25641c == pVar.f25641c && this.f25642d == pVar.f25642d && this.f25643e == pVar.f25643e && this.f25644f == pVar.f25644f;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f25639a;
        int hashCode = this.f25640b.hashCode();
        long j11 = this.f25644f;
        return ((((((((hashCode + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31) + this.f25641c) * 31) + this.f25642d) * 31) + this.f25643e) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SleepRecordEntity(userId=");
        a10.append(this.f25639a);
        a10.append(", time=");
        a10.append(this.f25640b);
        a10.append(", deepSleep=");
        a10.append(this.f25641c);
        a10.append(", lightSleep=");
        a10.append(this.f25642d);
        a10.append(", soberSleep=");
        a10.append(this.f25643e);
        a10.append(", lastModifyTime=");
        return d4.b.a(a10, this.f25644f, ')');
    }
}
