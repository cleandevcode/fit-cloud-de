package com.topstep.fitcloud.pro.model.data;

import a1.b;
import android.support.v4.media.d;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class HeartRateRealtime {

    /* renamed from: a */
    public final Date f9580a;

    /* renamed from: b */
    public final int f9581b;

    public HeartRateRealtime(int i10, @TimeField Date date) {
        l.f(date, CrashHianalyticsData.TIME);
        this.f9580a = date;
        this.f9581b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeartRateRealtime) {
            HeartRateRealtime heartRateRealtime = (HeartRateRealtime) obj;
            return l.a(this.f9580a, heartRateRealtime.f9580a) && this.f9581b == heartRateRealtime.f9581b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9580a.hashCode() * 31) + this.f9581b;
    }

    public final String toString() {
        StringBuilder a10 = d.a("HeartRateRealtime(time=");
        a10.append(this.f9580a);
        a10.append(", avg=");
        return b.a(a10, this.f9581b, ')');
    }
}
