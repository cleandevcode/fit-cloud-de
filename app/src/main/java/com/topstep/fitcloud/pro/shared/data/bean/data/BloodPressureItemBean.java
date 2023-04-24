package com.topstep.fitcloud.pro.shared.data.bean.data;

import a1.b;
import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class BloodPressureItemBean {

    /* renamed from: a */
    public final Date f9886a;

    /* renamed from: b */
    public final int f9887b;

    /* renamed from: c */
    public final int f9888c;

    public BloodPressureItemBean(int i10, int i11, @TimeField Date date) {
        this.f9886a = date;
        this.f9887b = i10;
        this.f9888c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BloodPressureItemBean) {
            BloodPressureItemBean bloodPressureItemBean = (BloodPressureItemBean) obj;
            return l.a(this.f9886a, bloodPressureItemBean.f9886a) && this.f9887b == bloodPressureItemBean.f9887b && this.f9888c == bloodPressureItemBean.f9888c;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f9886a.hashCode() * 31) + this.f9887b) * 31) + this.f9888c;
    }

    public final String toString() {
        StringBuilder a10 = d.a("BloodPressureItemBean(time=");
        a10.append(this.f9886a);
        a10.append(", sbp=");
        a10.append(this.f9887b);
        a10.append(", dbp=");
        return b.a(a10, this.f9888c, ')');
    }
}
