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
public final class OxygenRealtime {

    /* renamed from: a */
    public final Date f9585a;

    /* renamed from: b */
    public final int f9586b;

    public OxygenRealtime(int i10, @TimeField Date date) {
        l.f(date, CrashHianalyticsData.TIME);
        this.f9585a = date;
        this.f9586b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OxygenRealtime) {
            OxygenRealtime oxygenRealtime = (OxygenRealtime) obj;
            return l.a(this.f9585a, oxygenRealtime.f9585a) && this.f9586b == oxygenRealtime.f9586b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9585a.hashCode() * 31) + this.f9586b;
    }

    public final String toString() {
        StringBuilder a10 = d.a("OxygenRealtime(time=");
        a10.append(this.f9585a);
        a10.append(", avg=");
        return b.a(a10, this.f9586b, ')');
    }
}
