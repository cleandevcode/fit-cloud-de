package rg;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.shared.data.entity.data.HealthItemEntity;
import java.util.Date;

/* loaded from: classes2.dex */
public final class s extends HealthItemEntity {

    /* renamed from: f */
    public final float f25660f;

    /* renamed from: g */
    public final float f25661g;

    public /* synthetic */ s(long j10, Date date, float f10, float f11, int i10, int i11) {
        this(j10, date, f10, f11, (i11 & 16) != 0 ? 0 : i10, (i11 & 32) != 0 ? 1 : 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j10, Date date, float f10, float f11, int i10, int i11, int i12) {
        super(j10, date, i10, i11, i12);
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f25660f = f10;
        this.f25661g = f11;
    }
}
