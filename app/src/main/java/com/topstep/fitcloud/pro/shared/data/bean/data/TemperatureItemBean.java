package com.topstep.fitcloud.pro.shared.data.bean.data;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.u;
import t0.e;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class TemperatureItemBean {

    /* renamed from: a */
    public final Date f10010a;

    /* renamed from: b */
    public final float f10011b;

    /* renamed from: c */
    public final float f10012c;

    public TemperatureItemBean(@TimeField Date date, float f10, float f11) {
        this.f10010a = date;
        this.f10011b = f10;
        this.f10012c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TemperatureItemBean) {
            TemperatureItemBean temperatureItemBean = (TemperatureItemBean) obj;
            return l.a(this.f10010a, temperatureItemBean.f10010a) && Float.compare(this.f10011b, temperatureItemBean.f10011b) == 0 && Float.compare(this.f10012c, temperatureItemBean.f10012c) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f10012c) + e.b(this.f10011b, this.f10010a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("TemperatureItemBean(time=");
        a10.append(this.f10010a);
        a10.append(", body=");
        a10.append(this.f10011b);
        a10.append(", wrist=");
        a10.append(this.f10012c);
        a10.append(')');
        return a10.toString();
    }
}
