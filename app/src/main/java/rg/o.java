package rg;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.SleepItem;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a */
    public final long f25630a;

    /* renamed from: b */
    public final Date f25631b;

    /* renamed from: c */
    public final int f25632c;

    /* renamed from: d */
    public final int f25633d;

    /* renamed from: e */
    public final int f25634e;

    /* renamed from: f */
    public long f25635f;

    /* renamed from: g */
    public final List<SleepItem> f25636g;

    /* renamed from: h */
    public final int f25637h;

    /* renamed from: i */
    public final int f25638i;

    public o(long j10, Date date, int i10, int i11, int i12, long j11, List<SleepItem> list, int i13, int i14) {
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f25630a = j10;
        this.f25631b = date;
        this.f25632c = i10;
        this.f25633d = i11;
        this.f25634e = i12;
        this.f25635f = j11;
        this.f25636g = list;
        this.f25637h = i13;
        this.f25638i = i14;
    }

    public /* synthetic */ o(long j10, Date date, int i10, int i11, int i12, long j11, List list, int i13, int i14, int i15) {
        this(j10, date, i10, i11, i12, j11, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? 0 : i13, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f25630a == oVar.f25630a && gm.l.a(this.f25631b, oVar.f25631b) && this.f25632c == oVar.f25632c && this.f25633d == oVar.f25633d && this.f25634e == oVar.f25634e && this.f25635f == oVar.f25635f && gm.l.a(this.f25636g, oVar.f25636g) && this.f25637h == oVar.f25637h && this.f25638i == oVar.f25638i;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f25630a;
        int hashCode = this.f25631b.hashCode();
        long j11 = this.f25635f;
        int i10 = (((((((((hashCode + (((int) (j10 ^ (j10 >>> 32))) * 31)) * 31) + this.f25632c) * 31) + this.f25633d) * 31) + this.f25634e) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        List<SleepItem> list = this.f25636g;
        return ((((i10 + (list == null ? 0 : list.hashCode())) * 31) + this.f25637h) * 31) + this.f25638i;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SleepDetailEntity(userId=");
        a10.append(this.f25630a);
        a10.append(", time=");
        a10.append(this.f25631b);
        a10.append(", deepSleep=");
        a10.append(this.f25632c);
        a10.append(", lightSleep=");
        a10.append(this.f25633d);
        a10.append(", soberSleep=");
        a10.append(this.f25634e);
        a10.append(", lastModifyTime=");
        a10.append(this.f25635f);
        a10.append(", detail=");
        a10.append(this.f25636g);
        a10.append(", uploadFlag=");
        a10.append(this.f25637h);
        a10.append(", uploadAttempts=");
        return a1.b.a(a10, this.f25638i, ')');
    }
}
