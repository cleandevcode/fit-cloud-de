package com.topstep.fitcloud.pro.model.data;

import android.support.v4.media.d;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.u;
import t0.e;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TemperatureRealtime {

    /* renamed from: a */
    public final Date f9652a;

    /* renamed from: b */
    public final float f9653b;

    /* renamed from: c */
    public final float f9654c;

    public TemperatureRealtime(@TimeField Date date, float f10, float f11) {
        l.f(date, CrashHianalyticsData.TIME);
        this.f9652a = date;
        this.f9653b = f10;
        this.f9654c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TemperatureRealtime) {
            TemperatureRealtime temperatureRealtime = (TemperatureRealtime) obj;
            return l.a(this.f9652a, temperatureRealtime.f9652a) && Float.compare(this.f9653b, temperatureRealtime.f9653b) == 0 && Float.compare(this.f9654c, temperatureRealtime.f9654c) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f9654c) + e.b(this.f9653b, this.f9652a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("TemperatureRealtime(time=");
        a10.append(this.f9652a);
        a10.append(", avgBody=");
        a10.append(this.f9653b);
        a10.append(", avgWrist=");
        a10.append(this.f9654c);
        a10.append(')');
        return a10.toString();
    }
}
