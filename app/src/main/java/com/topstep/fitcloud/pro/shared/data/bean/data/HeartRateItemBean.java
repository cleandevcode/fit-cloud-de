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
public final class HeartRateItemBean {

    /* renamed from: a */
    public final Date f9941a;

    /* renamed from: b */
    public final int f9942b;

    public HeartRateItemBean(int i10, @TimeField Date date) {
        this.f9941a = date;
        this.f9942b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeartRateItemBean) {
            HeartRateItemBean heartRateItemBean = (HeartRateItemBean) obj;
            return l.a(this.f9941a, heartRateItemBean.f9941a) && this.f9942b == heartRateItemBean.f9942b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9941a.hashCode() * 31) + this.f9942b;
    }

    public final String toString() {
        StringBuilder a10 = d.a("HeartRateItemBean(time=");
        a10.append(this.f9941a);
        a10.append(", heartRate=");
        return b.a(a10, this.f9942b, ')');
    }
}
