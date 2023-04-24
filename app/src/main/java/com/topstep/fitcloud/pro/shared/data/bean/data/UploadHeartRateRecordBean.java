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
public final class UploadHeartRateRecordBean {

    /* renamed from: a */
    public final Date f10032a;

    /* renamed from: b */
    public final List<HeartRateItemBean> f10033b;

    public UploadHeartRateRecordBean(@DateField Date date, List<HeartRateItemBean> list) {
        l.f(date, "date");
        l.f(list, "detail");
        this.f10032a = date;
        this.f10033b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadHeartRateRecordBean) {
            UploadHeartRateRecordBean uploadHeartRateRecordBean = (UploadHeartRateRecordBean) obj;
            return l.a(this.f10032a, uploadHeartRateRecordBean.f10032a) && l.a(this.f10033b, uploadHeartRateRecordBean.f10033b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10033b.hashCode() + (this.f10032a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("UploadHeartRateRecordBean(date=");
        a10.append(this.f10032a);
        a10.append(", detail=");
        return b.a(a10, this.f10033b, ')');
    }
}
