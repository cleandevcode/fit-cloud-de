package com.topstep.fitcloud.pro.model.data;

import android.support.v4.media.d;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SimpleEcgRecord {

    /* renamed from: a */
    public final UUID f9595a;

    /* renamed from: b */
    public final Date f9596b;

    public SimpleEcgRecord(UUID uuid, @TimeField Date date) {
        l.f(uuid, "ecgId");
        l.f(date, CrashHianalyticsData.TIME);
        this.f9595a = uuid;
        this.f9596b = date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleEcgRecord) {
            SimpleEcgRecord simpleEcgRecord = (SimpleEcgRecord) obj;
            return l.a(this.f9595a, simpleEcgRecord.f9595a) && l.a(this.f9596b, simpleEcgRecord.f9596b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9596b.hashCode() + (this.f9595a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a10 = d.a("SimpleEcgRecord(ecgId=");
        a10.append(this.f9595a);
        a10.append(", time=");
        a10.append(this.f9596b);
        a10.append(')');
        return a10.toString();
    }
}
