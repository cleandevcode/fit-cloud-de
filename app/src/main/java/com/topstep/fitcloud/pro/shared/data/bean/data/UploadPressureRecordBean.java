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
public final class UploadPressureRecordBean {

    /* renamed from: a */
    public final Date f10042a;

    /* renamed from: b */
    public final List<PressureItemBean> f10043b;

    public UploadPressureRecordBean(@DateField Date date, List<PressureItemBean> list) {
        l.f(date, "date");
        l.f(list, "detail");
        this.f10042a = date;
        this.f10043b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadPressureRecordBean) {
            UploadPressureRecordBean uploadPressureRecordBean = (UploadPressureRecordBean) obj;
            return l.a(this.f10042a, uploadPressureRecordBean.f10042a) && l.a(this.f10043b, uploadPressureRecordBean.f10043b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10043b.hashCode() + (this.f10042a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("UploadPressureRecordBean(date=");
        a10.append(this.f10042a);
        a10.append(", detail=");
        return b.a(a10, this.f10043b, ')');
    }
}
