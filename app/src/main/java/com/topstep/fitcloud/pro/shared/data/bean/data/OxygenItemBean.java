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
public final class OxygenItemBean {

    /* renamed from: a */
    public final Date f9956a;

    /* renamed from: b */
    public final int f9957b;

    public OxygenItemBean(int i10, @TimeField Date date) {
        this.f9956a = date;
        this.f9957b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OxygenItemBean) {
            OxygenItemBean oxygenItemBean = (OxygenItemBean) obj;
            return l.a(this.f9956a, oxygenItemBean.f9956a) && this.f9957b == oxygenItemBean.f9957b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9956a.hashCode() * 31) + this.f9957b;
    }

    public final String toString() {
        StringBuilder a10 = d.a("OxygenItemBean(time=");
        a10.append(this.f9956a);
        a10.append(", oxygen=");
        return b.a(a10, this.f9957b, ')');
    }
}
