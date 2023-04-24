package com.topstep.fitcloud.pro.shared.data.bean.data;

import android.support.v4.media.d;
import com.topstep.fitcloud.pro.model.utils.moshi.DateField;
import fb.b;
import gm.l;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class UploadTemperatureRecordBean {

    /* renamed from: a */
    public final Date f10047a;

    /* renamed from: b */
    public final List<TemperatureItemBean> f10048b;

    public UploadTemperatureRecordBean(@DateField Date date, List<TemperatureItemBean> list) {
        l.f(date, "date");
        l.f(list, "detail");
        this.f10047a = date;
        this.f10048b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadTemperatureRecordBean) {
            UploadTemperatureRecordBean uploadTemperatureRecordBean = (UploadTemperatureRecordBean) obj;
            return l.a(this.f10047a, uploadTemperatureRecordBean.f10047a) && l.a(this.f10048b, uploadTemperatureRecordBean.f10048b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10048b.hashCode() + (this.f10047a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("UploadTemperatureRecordBean(date=");
        a10.append(this.f10047a);
        a10.append(", detail=");
        return b.a(a10, this.f10048b, ')');
    }
}
