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
public final class HeartRateRecordBean {

    /* renamed from: a */
    public final Date f9946a;

    /* renamed from: b */
    public final int f9947b;

    /* renamed from: c */
    public final long f9948c;

    /* renamed from: d */
    public final List<HeartRateItemBean> f9949d;

    public HeartRateRecordBean(@DateField Date date, int i10, long j10, List<HeartRateItemBean> list) {
        l.f(date, "date");
        this.f9946a = date;
        this.f9947b = i10;
        this.f9948c = j10;
        this.f9949d = list;
    }

    public /* synthetic */ HeartRateRecordBean(Date date, int i10, long j10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, i10, j10, (i11 & 8) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeartRateRecordBean) {
            HeartRateRecordBean heartRateRecordBean = (HeartRateRecordBean) obj;
            return l.a(this.f9946a, heartRateRecordBean.f9946a) && this.f9947b == heartRateRecordBean.f9947b && this.f9948c == heartRateRecordBean.f9948c && l.a(this.f9949d, heartRateRecordBean.f9949d);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9948c;
        int hashCode = ((((this.f9946a.hashCode() * 31) + this.f9947b) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        List<HeartRateItemBean> list = this.f9949d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = d.a("HeartRateRecordBean(date=");
        a10.append(this.f9946a);
        a10.append(", avgHeartRate=");
        a10.append(this.f9947b);
        a10.append(", lastModifyTime=");
        a10.append(this.f9948c);
        a10.append(", detail=");
        return b.a(a10, this.f9949d, ')');
    }
}
