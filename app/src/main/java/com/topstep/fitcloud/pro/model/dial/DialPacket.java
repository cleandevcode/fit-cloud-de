package com.topstep.fitcloud.pro.model.dial;

import a1.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import gm.l;
import i2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;
import no.nordicsemi.android.dfu.DfuBaseService;

@Keep
@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class DialPacket implements Parcelable {
    public static final a CREATOR = new a();
    private final long binSize;
    private final String binUrl;
    private final int binVersion;
    private final String deviceImgUrl;
    private final int dialNum;
    private final int downloadCount;
    private final String imgUrl;
    private final int lcd;
    private final String name;
    private final String toolVersion;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<DialPacket> {
        @Override // android.os.Parcelable.Creator
        public final DialPacket createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new DialPacket(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DialPacket[] newArray(int i10) {
            return new DialPacket[i10];
        }
    }

    public DialPacket(int i10, int i11, String str, int i12, String str2, String str3, String str4, String str5, long j10, int i13) {
        l.f(str, "toolVersion");
        l.f(str4, "binUrl");
        this.dialNum = i10;
        this.lcd = i11;
        this.toolVersion = str;
        this.binVersion = i12;
        this.imgUrl = str2;
        this.deviceImgUrl = str3;
        this.binUrl = str4;
        this.name = str5;
        this.binSize = j10;
        this.downloadCount = i13;
    }

    public /* synthetic */ DialPacket(int i10, int i11, String str, int i12, String str2, String str3, String str4, String str5, long j10, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, str, i12, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : str3, str4, (i14 & 128) != 0 ? null : str5, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? 0L : j10, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? 0 : i13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialPacket(android.os.Parcel r14) {
        /*
            r13 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r14, r0)
            int r2 = r14.readInt()
            int r3 = r14.readInt()
            java.lang.String r4 = r14.readString()
            gm.l.c(r4)
            int r5 = r14.readInt()
            java.lang.String r6 = r14.readString()
            java.lang.String r7 = r14.readString()
            java.lang.String r8 = r14.readString()
            gm.l.c(r8)
            java.lang.String r9 = r14.readString()
            long r10 = r14.readLong()
            int r12 = r14.readInt()
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.dial.DialPacket.<init>(android.os.Parcel):void");
    }

    public final int component1() {
        return this.dialNum;
    }

    public final int component10() {
        return this.downloadCount;
    }

    public final int component2() {
        return this.lcd;
    }

    public final String component3() {
        return this.toolVersion;
    }

    public final int component4() {
        return this.binVersion;
    }

    public final String component5() {
        return this.imgUrl;
    }

    public final String component6() {
        return this.deviceImgUrl;
    }

    public final String component7() {
        return this.binUrl;
    }

    public final String component8() {
        return this.name;
    }

    public final long component9() {
        return this.binSize;
    }

    public final DialPacket copy(int i10, int i11, String str, int i12, String str2, String str3, String str4, String str5, long j10, int i13) {
        l.f(str, "toolVersion");
        l.f(str4, "binUrl");
        return new DialPacket(i10, i11, str, i12, str2, str3, str4, str5, j10, i13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialPacket) {
            DialPacket dialPacket = (DialPacket) obj;
            return this.dialNum == dialPacket.dialNum && this.lcd == dialPacket.lcd && l.a(this.toolVersion, dialPacket.toolVersion) && this.binVersion == dialPacket.binVersion && l.a(this.imgUrl, dialPacket.imgUrl) && l.a(this.deviceImgUrl, dialPacket.deviceImgUrl) && l.a(this.binUrl, dialPacket.binUrl) && l.a(this.name, dialPacket.name) && this.binSize == dialPacket.binSize && this.downloadCount == dialPacket.downloadCount;
        }
        return false;
    }

    public final long getBinSize() {
        return this.binSize;
    }

    public final String getBinUrl() {
        return this.binUrl;
    }

    public final int getBinVersion() {
        return this.binVersion;
    }

    public final String getDeviceImgUrl() {
        return this.deviceImgUrl;
    }

    public final int getDialNum() {
        return this.dialNum;
    }

    public final int getDownloadCount() {
        return this.downloadCount;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final int getLcd() {
        return this.lcd;
    }

    public final String getName() {
        return this.name;
    }

    public final String getToolVersion() {
        return this.toolVersion;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a10 = (t.a(this.toolVersion, ((this.dialNum * 31) + this.lcd) * 31, 31) + this.binVersion) * 31;
        String str = this.imgUrl;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (a10 + hashCode) * 31;
        String str2 = this.deviceImgUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a11 = t.a(this.binUrl, (i11 + hashCode2) * 31, 31);
        String str3 = this.name;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        long j10 = this.binSize;
        return ((((a11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.downloadCount;
    }

    public String toString() {
        StringBuilder a10 = d.a("DialPacket(dialNum=");
        a10.append(this.dialNum);
        a10.append(", lcd=");
        a10.append(this.lcd);
        a10.append(", toolVersion=");
        a10.append(this.toolVersion);
        a10.append(", binVersion=");
        a10.append(this.binVersion);
        a10.append(", imgUrl=");
        a10.append(this.imgUrl);
        a10.append(", deviceImgUrl=");
        a10.append(this.deviceImgUrl);
        a10.append(", binUrl=");
        a10.append(this.binUrl);
        a10.append(", name=");
        a10.append(this.name);
        a10.append(", binSize=");
        a10.append(this.binSize);
        a10.append(", downloadCount=");
        return b.a(a10, this.downloadCount, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeInt(this.dialNum);
        parcel.writeInt(this.lcd);
        parcel.writeString(this.toolVersion);
        parcel.writeInt(this.binVersion);
        parcel.writeString(this.imgUrl);
        parcel.writeString(this.deviceImgUrl);
        parcel.writeString(this.binUrl);
        parcel.writeString(this.name);
        parcel.writeLong(this.binSize);
        parcel.writeInt(this.downloadCount);
    }
}
