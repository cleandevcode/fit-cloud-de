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
public final class PressureRecordBean {

    /* renamed from: a */
    public final Date f9976a;

    /* renamed from: b */
    public final int f9977b;

    /* renamed from: c */
    public final long f9978c;

    /* renamed from: d */
    public final List<PressureItemBean> f9979d;

    public PressureRecordBean(@DateField Date date, int i10, long j10, List<PressureItemBean> list) {
        l.f(date, "date");
        this.f9976a = date;
        this.f9977b = i10;
        this.f9978c = j10;
        this.f9979d = list;
    }

    public /* synthetic */ PressureRecordBean(Date date, int i10, long j10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, i10, j10, (i11 & 8) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PressureRecordBean) {
            PressureRecordBean pressureRecordBean = (PressureRecordBean) obj;
            return l.a(this.f9976a, pressureRecordBean.f9976a) && this.f9977b == pressureRecordBean.f9977b && this.f9978c == pressureRecordBean.f9978c && l.a(this.f9979d, pressureRecordBean.f9979d);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9978c;
        int hashCode = ((((this.f9976a.hashCode() * 31) + this.f9977b) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        List<PressureItemBean> list = this.f9979d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = d.a("PressureRecordBean(date=");
        a10.append(this.f9976a);
        a10.append(", avgPressure=");
        a10.append(this.f9977b);
        a10.append(", lastModifyTime=");
        a10.append(this.f9978c);
        a10.append(", detail=");
        return b.a(a10, this.f9979d, ')');
    }
}
