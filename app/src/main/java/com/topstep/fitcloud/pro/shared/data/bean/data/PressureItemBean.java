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
public final class PressureItemBean {

    /* renamed from: a */
    public final Date f9971a;

    /* renamed from: b */
    public final int f9972b;

    public PressureItemBean(int i10, @TimeField Date date) {
        this.f9971a = date;
        this.f9972b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PressureItemBean) {
            PressureItemBean pressureItemBean = (PressureItemBean) obj;
            return l.a(this.f9971a, pressureItemBean.f9971a) && this.f9972b == pressureItemBean.f9972b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9971a.hashCode() * 31) + this.f9972b;
    }

    public final String toString() {
        StringBuilder a10 = d.a("PressureItemBean(time=");
        a10.append(this.f9971a);
        a10.append(", pressure=");
        return b.a(a10, this.f9972b, ')');
    }
}
