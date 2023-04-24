package com.topstep.fitcloud.pro.shared.data.bean.data;

import android.support.v4.media.d;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.EcgReport;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import fb.b;
import gm.l;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;
import no.nordicsemi.android.dfu.DfuBaseService;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class EcgRecordBean {

    /* renamed from: a */
    public final UUID f9903a;

    /* renamed from: b */
    public final Date f9904b;

    /* renamed from: c */
    public final int f9905c;

    /* renamed from: d */
    public final int f9906d;

    /* renamed from: e */
    public final int f9907e;

    /* renamed from: f */
    public final long f9908f;

    /* renamed from: g */
    public final String f9909g;

    /* renamed from: h */
    public final List<Integer> f9910h;

    /* renamed from: i */
    public final List<EcgReport> f9911i;

    public EcgRecordBean(UUID uuid, @TimeField Date date, int i10, int i11, int i12, long j10, String str, List<Integer> list, List<EcgReport> list2) {
        l.f(uuid, "ecgId");
        l.f(date, CrashHianalyticsData.TIME);
        this.f9903a = uuid;
        this.f9904b = date;
        this.f9905c = i10;
        this.f9906d = i11;
        this.f9907e = i12;
        this.f9908f = j10;
        this.f9909g = str;
        this.f9910h = list;
        this.f9911i = list2;
    }

    public /* synthetic */ EcgRecordBean(UUID uuid, Date date, int i10, int i11, int i12, long j10, String str, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, date, i10, i11, i12, j10, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? null : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? null : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcgRecordBean) {
            EcgRecordBean ecgRecordBean = (EcgRecordBean) obj;
            return l.a(this.f9903a, ecgRecordBean.f9903a) && l.a(this.f9904b, ecgRecordBean.f9904b) && this.f9905c == ecgRecordBean.f9905c && this.f9906d == ecgRecordBean.f9906d && this.f9907e == ecgRecordBean.f9907e && this.f9908f == ecgRecordBean.f9908f && l.a(this.f9909g, ecgRecordBean.f9909g) && l.a(this.f9910h, ecgRecordBean.f9910h) && l.a(this.f9911i, ecgRecordBean.f9911i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f9904b.hashCode();
        long j10 = this.f9908f;
        int hashCode2 = (((((((((hashCode + (this.f9903a.hashCode() * 31)) * 31) + this.f9905c) * 31) + this.f9906d) * 31) + this.f9907e) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.f9909g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list = this.f9910h;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<EcgReport> list2 = this.f9911i;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a10 = d.a("EcgRecordBean(ecgId=");
        a10.append(this.f9903a);
        a10.append(", time=");
        a10.append(this.f9904b);
        a10.append(", type=");
        a10.append(this.f9905c);
        a10.append(", sampleBase=");
        a10.append(this.f9906d);
        a10.append(", scaleValue=");
        a10.append(this.f9907e);
        a10.append(", lastModifyTime=");
        a10.append(this.f9908f);
        a10.append(", deviceAddress=");
        a10.append(this.f9909g);
        a10.append(", detail=");
        a10.append(this.f9910h);
        a10.append(", reports=");
        return b.a(a10, this.f9911i, ')');
    }
}
