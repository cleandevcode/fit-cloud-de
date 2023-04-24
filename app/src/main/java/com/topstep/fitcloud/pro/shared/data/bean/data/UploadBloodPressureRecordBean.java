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
public final class UploadBloodPressureRecordBean {

    /* renamed from: a */
    public final Date f10027a;

    /* renamed from: b */
    public final List<BloodPressureItemBean> f10028b;

    public UploadBloodPressureRecordBean(@DateField Date date, List<BloodPressureItemBean> list) {
        l.f(date, "date");
        l.f(list, "detail");
        this.f10027a = date;
        this.f10028b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadBloodPressureRecordBean) {
            UploadBloodPressureRecordBean uploadBloodPressureRecordBean = (UploadBloodPressureRecordBean) obj;
            return l.a(this.f10027a, uploadBloodPressureRecordBean.f10027a) && l.a(this.f10028b, uploadBloodPressureRecordBean.f10028b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10028b.hashCode() + (this.f10027a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("UploadBloodPressureRecordBean(date=");
        a10.append(this.f10027a);
        a10.append(", detail=");
        return b.a(a10, this.f10028b, ')');
    }
}
