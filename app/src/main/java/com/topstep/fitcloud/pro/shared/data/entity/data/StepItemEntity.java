package com.topstep.fitcloud.pro.shared.data.entity.data;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.utils.moshi.TimeField;
import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.p;

@Metadata
/* loaded from: classes2.dex */
public final class StepItemEntity {

    /* renamed from: a */
    public final long f10088a;

    /* renamed from: b */
    public final Date f10089b;

    /* renamed from: c */
    public final String f10090c;

    /* renamed from: d */
    public final int f10091d;

    /* renamed from: e */
    public final float f10092e;

    /* renamed from: f */
    public final float f10093f;

    /* renamed from: g */
    public final int f10094g;

    public /* synthetic */ StepItemEntity(long j10, Date date, String str, int i10, float f10, float f11) {
        this(j10, date, str, i10, f10, f11, 1);
    }

    public StepItemEntity(long j10, @TimeField Date date, String str, int i10, float f10, float f11, @p(ignore = true) int i11) {
        l.f(date, CrashHianalyticsData.TIME);
        l.f(str, "device");
        this.f10088a = j10;
        this.f10089b = date;
        this.f10090c = str;
        this.f10091d = i10;
        this.f10092e = f10;
        this.f10093f = f11;
        this.f10094g = i11;
    }
}
