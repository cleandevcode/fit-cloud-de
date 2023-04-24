package rg;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.model.data.EcgReport;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public final long f25610a;

    /* renamed from: b */
    public final UUID f25611b;

    /* renamed from: c */
    public final Date f25612c;

    /* renamed from: d */
    public final int f25613d;

    /* renamed from: e */
    public final int f25614e;

    /* renamed from: f */
    public final int f25615f;

    /* renamed from: g */
    public final long f25616g;

    /* renamed from: h */
    public final String f25617h;

    /* renamed from: i */
    public final List<Integer> f25618i;

    /* renamed from: j */
    public final List<EcgReport> f25619j;

    /* renamed from: k */
    public final int f25620k;

    public d(long j10, UUID uuid, Date date, int i10, int i11, int i12, long j11, String str, List<Integer> list, List<EcgReport> list2, int i13) {
        gm.l.f(uuid, "ecgId");
        gm.l.f(date, CrashHianalyticsData.TIME);
        this.f25610a = j10;
        this.f25611b = uuid;
        this.f25612c = date;
        this.f25613d = i10;
        this.f25614e = i11;
        this.f25615f = i12;
        this.f25616g = j11;
        this.f25617h = str;
        this.f25618i = list;
        this.f25619j = list2;
        this.f25620k = i13;
    }

    public /* synthetic */ d(long j10, UUID uuid, Date date, int i10, int i11, int i12, long j11, String str, List list, List list2, int i13, int i14) {
        this(j10, uuid, date, (i14 & 8) != 0 ? 0 : i10, (i14 & 16) != 0 ? 0 : i11, (i14 & 32) != 0 ? 0 : i12, (i14 & 64) != 0 ? 0L : j11, (i14 & 128) != 0 ? null : str, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? null : list, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? null : list2, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i13);
    }
}
