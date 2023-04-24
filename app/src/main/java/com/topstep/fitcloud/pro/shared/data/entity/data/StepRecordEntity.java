package com.topstep.fitcloud.pro.shared.data.entity.data;

import gm.l;
import java.util.Date;
import kotlin.Metadata;
import mf.p;
import rg.e;

@Metadata
/* loaded from: classes2.dex */
public final class StepRecordEntity extends e {

    /* renamed from: d */
    public final String f10095d;

    /* renamed from: e */
    public final int f10096e;

    /* renamed from: f */
    public final float f10097f;

    /* renamed from: g */
    public final float f10098g;

    /* renamed from: h */
    public final int f10099h;

    /* renamed from: i */
    public final int f10100i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepRecordEntity(long j10, Date date, String str, int i10, float f10, float f11, long j11, @p(ignore = true) int i11, @p(ignore = true) int i12) {
        super(j10, date, j11);
        l.f(date, "date");
        this.f10095d = str;
        this.f10096e = i10;
        this.f10097f = f10;
        this.f10098g = f11;
        this.f10099h = i11;
        this.f10100i = i12;
    }

    public /* synthetic */ StepRecordEntity(long j10, Date date, String str, int i10, float f10, float f11, long j11, int i11, int i12, int i13) {
        this(j10, date, str, i10, f10, f11, j11, (i12 & 128) != 0 ? 0 : i11, 0);
    }
}
