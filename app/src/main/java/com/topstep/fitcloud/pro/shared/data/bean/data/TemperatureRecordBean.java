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
import t0.e;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TemperatureRecordBean {

    /* renamed from: a */
    public final Date f10016a;

    /* renamed from: b */
    public final float f10017b;

    /* renamed from: c */
    public final float f10018c;

    /* renamed from: d */
    public final long f10019d;

    /* renamed from: e */
    public final List<TemperatureItemBean> f10020e;

    public TemperatureRecordBean(@DateField Date date, float f10, float f11, long j10, List<TemperatureItemBean> list) {
        l.f(date, "date");
        this.f10016a = date;
        this.f10017b = f10;
        this.f10018c = f11;
        this.f10019d = j10;
        this.f10020e = list;
    }

    public /* synthetic */ TemperatureRecordBean(Date date, float f10, float f11, long j10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, f10, f11, j10, (i10 & 16) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TemperatureRecordBean) {
            TemperatureRecordBean temperatureRecordBean = (TemperatureRecordBean) obj;
            return l.a(this.f10016a, temperatureRecordBean.f10016a) && Float.compare(this.f10017b, temperatureRecordBean.f10017b) == 0 && Float.compare(this.f10018c, temperatureRecordBean.f10018c) == 0 && this.f10019d == temperatureRecordBean.f10019d && l.a(this.f10020e, temperatureRecordBean.f10020e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = e.b(this.f10018c, e.b(this.f10017b, this.f10016a.hashCode() * 31, 31), 31);
        long j10 = this.f10019d;
        int i10 = (b10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        List<TemperatureItemBean> list = this.f10020e;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return i10 + hashCode;
    }

    public final String toString() {
        StringBuilder a10 = d.a("TemperatureRecordBean(date=");
        a10.append(this.f10016a);
        a10.append(", avgBody=");
        a10.append(this.f10017b);
        a10.append(", avgWrist=");
        a10.append(this.f10018c);
        a10.append(", lastModifyTime=");
        a10.append(this.f10019d);
        a10.append(", detail=");
        return b.a(a10, this.f10020e, ')');
    }
}
