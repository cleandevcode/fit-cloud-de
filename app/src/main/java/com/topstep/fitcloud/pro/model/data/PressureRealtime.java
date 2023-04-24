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
public final class PressureRealtime {

    /* renamed from: a */
    public final Date f9590a;

    /* renamed from: b */
    public final int f9591b;

    public PressureRealtime(int i10, @TimeField Date date) {
        l.f(date, CrashHianalyticsData.TIME);
        this.f9590a = date;
        this.f9591b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PressureRealtime) {
            PressureRealtime pressureRealtime = (PressureRealtime) obj;
            return l.a(this.f9590a, pressureRealtime.f9590a) && this.f9591b == pressureRealtime.f9591b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9590a.hashCode() * 31) + this.f9591b;
    }

    public final String toString() {
        StringBuilder a10 = d.a("PressureRealtime(time=");
        a10.append(this.f9590a);
        a10.append(", avg=");
        return b.a(a10, this.f9591b, ')');
    }
}
