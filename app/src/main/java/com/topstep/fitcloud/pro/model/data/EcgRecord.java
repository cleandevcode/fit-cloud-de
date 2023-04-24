package com.topstep.fitcloud.pro.model.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import gm.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import ul.q;

@Keep
@Metadata
/* loaded from: classes2.dex */
public final class EcgRecord implements Parcelable {
    public static final int DEFAULT_SAMPLE_BASE = 100;
    public static final int DEFAULT_SCALE_VALUE = 20000;
    private final List<Integer> detail;
    private final String deviceAddress;
    private final UUID ecgId;
    private final List<EcgReport> reports;
    private final int sampleBase;
    private final int scaleValue;
    private final Date time;
    private final int type;
    public static final b Companion = new b();
    public static final Parcelable.Creator<EcgRecord> CREATOR = new a();

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<EcgRecord> {
        @Override // android.os.Parcelable.Creator
        public final EcgRecord createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new EcgRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EcgRecord[] newArray(int i10) {
            return new EcgRecord[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EcgRecord(android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r11, r0)
            java.lang.String r0 = r11.readString()
            java.util.UUID r2 = java.util.UUID.fromString(r0)
            java.lang.String r0 = "fromString(parcel.readString())"
            gm.l.e(r2, r0)
            java.lang.ThreadLocal<java.text.SimpleDateFormat> r0 = dg.a.f13029a
            java.lang.String r0 = r11.readString()
            gm.l.c(r0)
            java.util.Date r3 = dg.a.d(r0)
            int r4 = r11.readInt()
            int r5 = r11.readInt()
            int r6 = r11.readInt()
            java.lang.String r7 = r11.readString()
            int[] r0 = r11.createIntArray()
            if (r0 == 0) goto L3a
            java.util.List r0 = ul.i.F(r0)
            goto L3b
        L3a:
            r0 = 0
        L3b:
            r8 = r0
            android.os.Parcelable$Creator<com.topstep.fitcloud.pro.model.data.EcgReport> r0 = com.topstep.fitcloud.pro.model.data.EcgReport.CREATOR
            java.util.ArrayList r9 = r11.createTypedArrayList(r0)
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.data.EcgRecord.<init>(android.os.Parcel):void");
    }

    public EcgRecord(UUID uuid, Date date, int i10, int i11, int i12, String str, List<Integer> list, List<EcgReport> list2) {
        l.f(uuid, "ecgId");
        l.f(date, CrashHianalyticsData.TIME);
        this.ecgId = uuid;
        this.time = date;
        this.type = i10;
        this.sampleBase = i11;
        this.scaleValue = i12;
        this.deviceAddress = str;
        this.detail = list;
        this.reports = list2;
    }

    public final UUID component1() {
        return this.ecgId;
    }

    public final Date component2() {
        return this.time;
    }

    public final int component3() {
        return this.type;
    }

    public final int component4() {
        return this.sampleBase;
    }

    public final int component5() {
        return this.scaleValue;
    }

    public final String component6() {
        return this.deviceAddress;
    }

    public final List<Integer> component7() {
        return this.detail;
    }

    public final List<EcgReport> component8() {
        return this.reports;
    }

    public final EcgRecord copy(UUID uuid, Date date, int i10, int i11, int i12, String str, List<Integer> list, List<EcgReport> list2) {
        l.f(uuid, "ecgId");
        l.f(date, CrashHianalyticsData.TIME);
        return new EcgRecord(uuid, date, i10, i11, i12, str, list, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcgRecord) {
            EcgRecord ecgRecord = (EcgRecord) obj;
            return l.a(this.ecgId, ecgRecord.ecgId) && l.a(this.time, ecgRecord.time) && this.type == ecgRecord.type && this.sampleBase == ecgRecord.sampleBase && this.scaleValue == ecgRecord.scaleValue && l.a(this.deviceAddress, ecgRecord.deviceAddress) && l.a(this.detail, ecgRecord.detail) && l.a(this.reports, ecgRecord.reports);
        }
        return false;
    }

    public final List<Integer> getDetail() {
        return this.detail;
    }

    public final String getDeviceAddress() {
        return this.deviceAddress;
    }

    public final UUID getEcgId() {
        return this.ecgId;
    }

    public final int[] getIntArrays() {
        List<Integer> list = this.detail;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int[] iArr = new int[this.detail.size()];
        int size = this.detail.size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.detail.get(i10).intValue();
        }
        return iArr;
    }

    public final int[] getIntArraysForAlgorithm() {
        List<Integer> list = this.detail;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int[] iArr = new int[this.detail.size()];
        int size = this.detail.size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = (int) ((this.detail.get(i10).intValue() - 32768) / 13.98f);
        }
        return iArr;
    }

    public final List<EcgReport> getReports() {
        return this.reports;
    }

    public final int getSampleBase() {
        return this.sampleBase;
    }

    public final int getScaleValue() {
        return this.scaleValue;
    }

    public final Date getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (((((((this.time.hashCode() + (this.ecgId.hashCode() * 31)) * 31) + this.type) * 31) + this.sampleBase) * 31) + this.scaleValue) * 31;
        String str = this.deviceAddress;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Integer> list = this.detail;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<EcgReport> list2 = this.reports;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a10 = d.a("EcgRecord(ecgId=");
        a10.append(this.ecgId);
        a10.append(", time=");
        a10.append(this.time);
        a10.append(", type=");
        a10.append(this.type);
        a10.append(", sampleBase=");
        a10.append(this.sampleBase);
        a10.append(", scaleValue=");
        a10.append(this.scaleValue);
        a10.append(", deviceAddress=");
        a10.append(this.deviceAddress);
        a10.append(", detail=");
        a10.append(this.detail);
        a10.append(", reports=");
        return fb.b.a(a10, this.reports, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeString(this.ecgId.toString());
        ThreadLocal<SimpleDateFormat> threadLocal = dg.a.f13029a;
        parcel.writeString(dg.a.b(this.time));
        parcel.writeInt(this.type);
        parcel.writeInt(this.sampleBase);
        parcel.writeInt(this.scaleValue);
        parcel.writeString(this.deviceAddress);
        List<Integer> list = this.detail;
        parcel.writeIntArray(list != null ? q.X(list) : null);
        parcel.writeTypedList(this.reports);
    }
}
