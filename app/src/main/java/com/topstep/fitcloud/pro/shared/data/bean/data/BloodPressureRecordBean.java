package com.topstep.fitcloud.pro.shared.data.bean.data;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.utils.moshi.DateField;
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
public final class BloodPressureRecordBean {

    /* renamed from: a */
    public final Date f9892a;

    /* renamed from: b */
    public final int f9893b;

    /* renamed from: c */
    public final int f9894c;

    /* renamed from: d */
    public final long f9895d;

    /* renamed from: e */
    public final List<BloodPressureItemBean> f9896e;

    public BloodPressureRecordBean(@DateField Date date, int i10, int i11, long j10, List<BloodPressureItemBean> list) {
        l.f(date, "date");
        this.f9892a = date;
        this.f9893b = i10;
        this.f9894c = i11;
        this.f9895d = j10;
        this.f9896e = list;
    }

    public /* synthetic */ BloodPressureRecordBean(Date date, int i10, int i11, long j10, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, i10, i11, j10, (i12 & 16) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BloodPressureRecordBean) {
            BloodPressureRecordBean bloodPressureRecordBean = (BloodPressureRecordBean) obj;
            return l.a(this.f9892a, bloodPressureRecordBean.f9892a) && this.f9893b == bloodPressureRecordBean.f9893b && this.f9894c == bloodPressureRecordBean.f9894c && this.f9895d == bloodPressureRecordBean.f9895d && l.a(this.f9896e, bloodPressureRecordBean.f9896e);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9895d;
        int hashCode = ((((((this.f9892a.hashCode() * 31) + this.f9893b) * 31) + this.f9894c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        List<BloodPressureItemBean> list = this.f9896e;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = d.a("BloodPressureRecordBean(date=");
        a10.append(this.f9892a);
        a10.append(", avgSbp=");
        a10.append(this.f9893b);
        a10.append(", avgDbp=");
        a10.append(this.f9894c);
        a10.append(", lastModifyTime=");
        a10.append(this.f9895d);
        a10.append(", detail=");
        return b.a(a10, this.f9896e, ')');
    }
}
