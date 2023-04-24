package rg;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.shared.data.entity.data.HealthItemEntity;
import java.util.Date;

/* loaded from: classes2.dex */
public final class l extends HealthItemEntity {

    /* renamed from: f */
    public final int f25628f;

    public /* synthetic */ l(long j10, Date date, int i10, int i11, int i12) {
        this(j10, date, i10, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? 1 : 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j10, Date date, int i10, int i11, int i12, int i13) {
        super(j10, date, i11, i12, i13);
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f25628f = i10;
    }
}
