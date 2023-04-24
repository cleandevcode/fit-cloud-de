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
public final class OxygenRecordBean {

    /* renamed from: a */
    public final Date f9961a;

    /* renamed from: b */
    public final int f9962b;

    /* renamed from: c */
    public final long f9963c;

    /* renamed from: d */
    public final List<OxygenItemBean> f9964d;

    public OxygenRecordBean(@DateField Date date, int i10, long j10, List<OxygenItemBean> list) {
        l.f(date, "date");
        this.f9961a = date;
        this.f9962b = i10;
        this.f9963c = j10;
        this.f9964d = list;
    }

    public /* synthetic */ OxygenRecordBean(Date date, int i10, long j10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, i10, j10, (i11 & 8) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OxygenRecordBean) {
            OxygenRecordBean oxygenRecordBean = (OxygenRecordBean) obj;
            return l.a(this.f9961a, oxygenRecordBean.f9961a) && this.f9962b == oxygenRecordBean.f9962b && this.f9963c == oxygenRecordBean.f9963c && l.a(this.f9964d, oxygenRecordBean.f9964d);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9963c;
        int hashCode = ((((this.f9961a.hashCode() * 31) + this.f9962b) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        List<OxygenItemBean> list = this.f9964d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder a10 = d.a("OxygenRecordBean(date=");
        a10.append(this.f9961a);
        a10.append(", avgOxygen=");
        a10.append(this.f9962b);
        a10.append(", lastModifyTime=");
        a10.append(this.f9963c);
        a10.append(", detail=");
        return b.a(a10, this.f9964d, ')');
    }
}
