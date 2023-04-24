package com.topstep.fitcloud.pro.shared.data.entity.data;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.p;

@Metadata
/* loaded from: classes2.dex */
public abstract class HealthItemEntity {

    /* renamed from: a */
    public final long f10067a;

    /* renamed from: b */
    public final Date f10068b;

    /* renamed from: c */
    public final int f10069c;

    /* renamed from: d */
    public final int f10070d;

    /* renamed from: e */
    public final int f10071e;

    public HealthItemEntity(long j10, @TimeField Date date, @p(ignore = true) int i10, @p(ignore = true) int i11, @p(ignore = true) int i12) {
        l.f(date, CrashHianalyticsData.TIME);
        this.f10067a = j10;
        this.f10068b = date;
        this.f10069c = i10;
        this.f10070d = i11;
        this.f10071e = i12;
    }
}
