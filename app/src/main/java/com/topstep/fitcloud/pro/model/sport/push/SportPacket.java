package com.topstep.fitcloud.pro.model.sport.push;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import d4.b;
import gm.l;
import i2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;

@Keep
@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SportPacket implements Parcelable {
    public static final a CREATOR = new a();
    private final long binSize;
    private final String binUrl;
    private final long createTime;
    private final String iconUrl;
    private final String sportUiName;
    private final String sportUiNameCn;
    private final int sportUiType;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<SportPacket> {
        @Override // android.os.Parcelable.Creator
        public final SportPacket createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new SportPacket(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SportPacket[] newArray(int i10) {
            return new SportPacket[i10];
        }
    }

    public SportPacket(int i10, String str, String str2, String str3, String str4, long j10, long j11) {
        l.f(str2, "binUrl");
        l.f(str3, "sportUiName");
        l.f(str4, "sportUiNameCn");
        this.sportUiType = i10;
        this.iconUrl = str;
        this.binUrl = str2;
        this.sportUiName = str3;
        this.sportUiNameCn = str4;
        this.createTime = j10;
        this.binSize = j11;
    }

    public /* synthetic */ SportPacket(int i10, String str, String str2, String str3, String str4, long j10, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, str2, str3, str4, (i11 & 32) != 0 ? 0L : j10, (i11 & 64) != 0 ? 0L : j11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SportPacket(android.os.Parcel r12) {
        /*
            r11 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r12, r0)
            int r2 = r12.readInt()
            java.lang.String r3 = r12.readString()
            java.lang.String r4 = r12.readString()
            gm.l.c(r4)
            java.lang.String r5 = r12.readString()
            gm.l.c(r5)
            java.lang.String r6 = r12.readString()
            gm.l.c(r6)
            long r7 = r12.readLong()
            long r9 = r12.readLong()
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.sport.push.SportPacket.<init>(android.os.Parcel):void");
    }

    public final int component1() {
        return this.sportUiType;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.binUrl;
    }

    public final String component4() {
        return this.sportUiName;
    }

    public final String component5() {
        return this.sportUiNameCn;
    }

    public final long component6() {
        return this.createTime;
    }

    public final long component7() {
        return this.binSize;
    }

    public final SportPacket copy(int i10, String str, String str2, String str3, String str4, long j10, long j11) {
        l.f(str2, "binUrl");
        l.f(str3, "sportUiName");
        l.f(str4, "sportUiNameCn");
        return new SportPacket(i10, str, str2, str3, str4, j10, j11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SportPacket) {
            SportPacket sportPacket = (SportPacket) obj;
            return this.sportUiType == sportPacket.sportUiType && l.a(this.iconUrl, sportPacket.iconUrl) && l.a(this.binUrl, sportPacket.binUrl) && l.a(this.sportUiName, sportPacket.sportUiName) && l.a(this.sportUiNameCn, sportPacket.sportUiNameCn) && this.createTime == sportPacket.createTime && this.binSize == sportPacket.binSize;
        }
        return false;
    }

    public final long getBinSize() {
        return this.binSize;
    }

    public final String getBinUrl() {
        return this.binUrl;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getSportUiName() {
        return this.sportUiName;
    }

    public final String getSportUiNameCn() {
        return this.sportUiNameCn;
    }

    public final int getSportUiType() {
        return this.sportUiType;
    }

    public int hashCode() {
        int hashCode;
        int i10 = this.sportUiType * 31;
        String str = this.iconUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a10 = t.a(this.sportUiNameCn, t.a(this.sportUiName, t.a(this.binUrl, (i10 + hashCode) * 31, 31), 31), 31);
        long j10 = this.createTime;
        long j11 = this.binSize;
        return ((a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        StringBuilder a10 = d.a("SportPacket(sportUiType=");
        a10.append(this.sportUiType);
        a10.append(", iconUrl=");
        a10.append(this.iconUrl);
        a10.append(", binUrl=");
        a10.append(this.binUrl);
        a10.append(", sportUiName=");
        a10.append(this.sportUiName);
        a10.append(", sportUiNameCn=");
        a10.append(this.sportUiNameCn);
        a10.append(", createTime=");
        a10.append(this.createTime);
        a10.append(", binSize=");
        return b.a(a10, this.binSize, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeInt(this.sportUiType);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.binUrl);
        parcel.writeString(this.sportUiName);
        parcel.writeString(this.sportUiNameCn);
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.binSize);
    }
}
