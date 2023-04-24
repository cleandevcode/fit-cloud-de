package com.topstep.fitcloud.pro.model.data;

import android.support.v4.media.d;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.o0;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class BloodPressureRealtime {

    /* renamed from: a */
    public final Date f9569a;

    /* renamed from: b */
    public final int f9570b;

    /* renamed from: c */
    public final int f9571c;

    /* renamed from: d */
    public final boolean f9572d;

    public BloodPressureRealtime(@TimeField Date date, int i10, int i11, boolean z10) {
        l.f(date, CrashHianalyticsData.TIME);
        this.f9569a = date;
        this.f9570b = i10;
        this.f9571c = i11;
        this.f9572d = z10;
    }

    public /* synthetic */ BloodPressureRealtime(Date date, int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, i10, i11, (i12 & 8) != 0 ? false : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BloodPressureRealtime) {
            BloodPressureRealtime bloodPressureRealtime = (BloodPressureRealtime) obj;
            return l.a(this.f9569a, bloodPressureRealtime.f9569a) && this.f9570b == bloodPressureRealtime.f9570b && this.f9571c == bloodPressureRealtime.f9571c && this.f9572d == bloodPressureRealtime.f9572d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((((this.f9569a.hashCode() * 31) + this.f9570b) * 31) + this.f9571c) * 31;
        boolean z10 = this.f9572d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder a10 = d.a("BloodPressureRealtime(time=");
        a10.append(this.f9569a);
        a10.append(", avgSbp=");
        a10.append(this.f9570b);
        a10.append(", avgDbp=");
        a10.append(this.f9571c);
        a10.append(", privateModel=");
        return o0.a(a10, this.f9572d, ')');
    }
}
