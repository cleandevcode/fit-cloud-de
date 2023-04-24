package com.topstep.fitcloud.pro.model.data;

import android.support.v4.media.d;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
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
import t0.e;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SportRecord {

    /* renamed from: a */
    public final UUID f9627a;

    /* renamed from: b */
    public final Date f9628b;

    /* renamed from: c */
    public final int f9629c;

    /* renamed from: d */
    public final float f9630d;

    /* renamed from: e */
    public final float f9631e;

    /* renamed from: f */
    public final int f9632f;

    /* renamed from: g */
    public final float f9633g;

    /* renamed from: h */
    public final int f9634h;

    /* renamed from: i */
    public final int f9635i;

    /* renamed from: j */
    public final List<SportLatLng> f9636j;

    /* renamed from: k */
    public final List<SportHeartRate> f9637k;

    /* loaded from: classes2.dex */
    public static final class a {
        public static int a(int i10) {
            int i11;
            int i12;
            int i13;
            if (i10 <= 0) {
                i11 = 0;
            } else {
                i11 = (i10 - 1) % 4;
            }
            if (i10 <= 0) {
                i13 = 0;
            } else {
                if (i10 <= 0) {
                    i12 = 0;
                } else {
                    i12 = (i10 - 1) % 4;
                }
                i13 = i10 - i12;
            }
            if (i13 == 5 || i13 == 9 || i13 == 13) {
                return 0;
            }
            if (i13 != 17) {
                return 2;
            }
            if (i11 == 2) {
                return 0;
            }
            return 1;
        }
    }

    public SportRecord(UUID uuid, @TimeField Date date, int i10, float f10, float f11, int i11, float f12, int i12, int i13, List<SportLatLng> list, List<SportHeartRate> list2) {
        l.f(uuid, "sportId");
        l.f(date, CrashHianalyticsData.TIME);
        this.f9627a = uuid;
        this.f9628b = date;
        this.f9629c = i10;
        this.f9630d = f10;
        this.f9631e = f11;
        this.f9632f = i11;
        this.f9633g = f12;
        this.f9634h = i12;
        this.f9635i = i13;
        this.f9636j = list;
        this.f9637k = list2;
    }

    public /* synthetic */ SportRecord(UUID uuid, Date date, int i10, float f10, float f11, int i11, float f12, int i12, int i13, List list, List list2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, date, i10, f10, f11, i11, f12, i12, i13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? null : list, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SportRecord) {
            SportRecord sportRecord = (SportRecord) obj;
            return l.a(this.f9627a, sportRecord.f9627a) && l.a(this.f9628b, sportRecord.f9628b) && this.f9629c == sportRecord.f9629c && Float.compare(this.f9630d, sportRecord.f9630d) == 0 && Float.compare(this.f9631e, sportRecord.f9631e) == 0 && this.f9632f == sportRecord.f9632f && Float.compare(this.f9633g, sportRecord.f9633g) == 0 && this.f9634h == sportRecord.f9634h && this.f9635i == sportRecord.f9635i && l.a(this.f9636j, sportRecord.f9636j) && l.a(this.f9637k, sportRecord.f9637k);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f9628b.hashCode();
        int b10 = e.b(this.f9630d, (((hashCode2 + (this.f9627a.hashCode() * 31)) * 31) + this.f9629c) * 31, 31);
        int b11 = (((e.b(this.f9633g, (e.b(this.f9631e, b10, 31) + this.f9632f) * 31, 31) + this.f9634h) * 31) + this.f9635i) * 31;
        List<SportLatLng> list = this.f9636j;
        int i10 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (b11 + hashCode) * 31;
        List<SportHeartRate> list2 = this.f9637k;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        StringBuilder a10 = d.a("SportRecord(sportId=");
        a10.append(this.f9627a);
        a10.append(", time=");
        a10.append(this.f9628b);
        a10.append(", duration=");
        a10.append(this.f9629c);
        a10.append(", distance=");
        a10.append(this.f9630d);
        a10.append(", calorie=");
        a10.append(this.f9631e);
        a10.append(", step=");
        a10.append(this.f9632f);
        a10.append(", climb=");
        a10.append(this.f9633g);
        a10.append(", locationType=");
        a10.append(this.f9634h);
        a10.append(", sportType=");
        a10.append(this.f9635i);
        a10.append(", latLngs=");
        a10.append(this.f9636j);
        a10.append(", heartRates=");
        return b.a(a10, this.f9637k, ')');
    }
}
