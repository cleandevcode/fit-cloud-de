package com.topstep.fitcloud.pro.shared.data.bean.data;

import android.support.v4.media.d;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.SleepItem;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import fb.b;
import gm.l;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SleepRecordBean {

    /* renamed from: a */
    public final Date f9986a;

    /* renamed from: b */
    public final int f9987b;

    /* renamed from: c */
    public final int f9988c;

    /* renamed from: d */
    public final int f9989d;

    /* renamed from: e */
    public final long f9990e;

    /* renamed from: f */
    public final List<SleepItem> f9991f;

    public SleepRecordBean(@TimeField Date date, int i10, int i11, int i12, long j10, List<SleepItem> list) {
        l.f(date, CrashHianalyticsData.TIME);
        this.f9986a = date;
        this.f9987b = i10;
        this.f9988c = i11;
        this.f9989d = i12;
        this.f9990e = j10;
        this.f9991f = list;
    }

    public /* synthetic */ SleepRecordBean(Date date, int i10, int i11, int i12, long j10, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, i10, i11, i12, j10, (i13 & 32) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SleepRecordBean) {
            SleepRecordBean sleepRecordBean = (SleepRecordBean) obj;
            return l.a(this.f9986a, sleepRecordBean.f9986a) && this.f9987b == sleepRecordBean.f9987b && this.f9988c == sleepRecordBean.f9988c && this.f9989d == sleepRecordBean.f9989d && this.f9990e == sleepRecordBean.f9990e && l.a(this.f9991f, sleepRecordBean.f9991f);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9990e;
        int hashCode = ((((((((this.f9986a.hashCode() * 31) + this.f9987b) * 31) + this.f9988c) * 31) + this.f9989d) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        List<SleepItem> list = this.f9991f;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = d.a("SleepRecordBean(time=");
        a10.append(this.f9986a);
        a10.append(", deepSleep=");
        a10.append(this.f9987b);
        a10.append(", lightSleep=");
        a10.append(this.f9988c);
        a10.append(", soberSleep=");
        a10.append(this.f9989d);
        a10.append(", lastModifyTime=");
        a10.append(this.f9990e);
        a10.append(", detail=");
        return b.a(a10, this.f9991f, ')');
    }
}
