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
public final class UploadOxygenRecordBean {

    /* renamed from: a */
    public final Date f10037a;

    /* renamed from: b */
    public final List<OxygenItemBean> f10038b;

    public UploadOxygenRecordBean(@DateField Date date, List<OxygenItemBean> list) {
        l.f(date, "date");
        l.f(list, "detail");
        this.f10037a = date;
        this.f10038b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadOxygenRecordBean) {
            UploadOxygenRecordBean uploadOxygenRecordBean = (UploadOxygenRecordBean) obj;
            return l.a(this.f10037a, uploadOxygenRecordBean.f10037a) && l.a(this.f10038b, uploadOxygenRecordBean.f10038b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10038b.hashCode() + (this.f10037a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("UploadOxygenRecordBean(date=");
        a10.append(this.f10037a);
        a10.append(", detail=");
        return b.a(a10, this.f10038b, ')');
    }
}
