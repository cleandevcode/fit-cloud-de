package rg;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.shared.data.entity.data.HealthItemEntity;
import java.util.Date;

/* loaded from: classes2.dex */
public final class a extends HealthItemEntity {

    /* renamed from: f */
    public final int f25606f;

    /* renamed from: g */
    public final int f25607g;

    public /* synthetic */ a(long j10, Date date, int i10, int i11, int i12, int i13) {
        this(j10, date, i10, i11, (i13 & 16) != 0 ? 0 : i12, (i13 & 32) != 0 ? 1 : 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j10, Date date, int i10, int i11, int i12, int i13, int i14) {
        super(j10, date, i12, i13, i14);
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f25606f = i10;
        this.f25607g = i11;
    }
}
