package com.topstep.fitcloud.pro.model.version;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import cn.sharesdk.framework.InnerShareParams;
import gm.l;
import i2.t;
import kotlin.Metadata;
import l2.o0;

@Keep
@Metadata
/* loaded from: classes2.dex */
public final class HardwareUpgradeInfo implements Parcelable {
    public static final a CREATOR = new a();
    private final String hardwareInfo;
    private final boolean isForce;
    private final String remark;
    private final long size;
    private final eg.a type;
    private final String url;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<HardwareUpgradeInfo> {
        @Override // android.os.Parcelable.Creator
        public final HardwareUpgradeInfo createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new HardwareUpgradeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HardwareUpgradeInfo[] newArray(int i10) {
            return new HardwareUpgradeInfo[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HardwareUpgradeInfo(android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r10, r0)
            java.lang.String r2 = r10.readString()
            gm.l.c(r2)
            java.lang.String r3 = r10.readString()
            java.lang.String r4 = r10.readString()
            gm.l.c(r4)
            java.lang.String r0 = r10.readString()
            if (r0 == 0) goto L52
            int r1 = r0.hashCode()
            r5 = 65
            if (r1 == r5) goto L46
            r5 = 70
            if (r1 == r5) goto L3a
            r5 = 80
            if (r1 == r5) goto L2e
            goto L52
        L2e:
            java.lang.String r1 = "P"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            goto L52
        L37:
            eg.a r0 = eg.a.f13611c
            goto L53
        L3a:
            java.lang.String r1 = "F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L52
        L43:
            eg.a r0 = eg.a.f13612d
            goto L53
        L46:
            java.lang.String r1 = "A"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L52
        L4f:
            eg.a r0 = eg.a.f13613e
            goto L53
        L52:
            r0 = 0
        L53:
            r5 = r0
            gm.l.c(r5)
            long r6 = r10.readLong()
            byte r10 = r10.readByte()
            if (r10 == 0) goto L64
            r10 = 1
            r8 = 1
            goto L66
        L64:
            r10 = 0
            r8 = 0
        L66:
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.version.HardwareUpgradeInfo.<init>(android.os.Parcel):void");
    }

    public HardwareUpgradeInfo(String str, String str2, String str3, eg.a aVar, long j10, boolean z10) {
        l.f(str, "hardwareInfo");
        l.f(str3, InnerShareParams.URL);
        l.f(aVar, "type");
        this.hardwareInfo = str;
        this.remark = str2;
        this.url = str3;
        this.type = aVar;
        this.size = j10;
        this.isForce = z10;
    }

    public static /* synthetic */ HardwareUpgradeInfo copy$default(HardwareUpgradeInfo hardwareUpgradeInfo, String str, String str2, String str3, eg.a aVar, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hardwareUpgradeInfo.hardwareInfo;
        }
        if ((i10 & 2) != 0) {
            str2 = hardwareUpgradeInfo.remark;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = hardwareUpgradeInfo.url;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            aVar = hardwareUpgradeInfo.type;
        }
        eg.a aVar2 = aVar;
        if ((i10 & 16) != 0) {
            j10 = hardwareUpgradeInfo.size;
        }
        long j11 = j10;
        if ((i10 & 32) != 0) {
            z10 = hardwareUpgradeInfo.isForce;
        }
        return hardwareUpgradeInfo.copy(str, str4, str5, aVar2, j11, z10);
    }

    public final String component1() {
        return this.hardwareInfo;
    }

    public final String component2() {
        return this.remark;
    }

    public final String component3() {
        return this.url;
    }

    public final eg.a component4() {
        return this.type;
    }

    public final long component5() {
        return this.size;
    }

    public final boolean component6() {
        return this.isForce;
    }

    public final HardwareUpgradeInfo copy(String str, String str2, String str3, eg.a aVar, long j10, boolean z10) {
        l.f(str, "hardwareInfo");
        l.f(str3, InnerShareParams.URL);
        l.f(aVar, "type");
        return new HardwareUpgradeInfo(str, str2, str3, aVar, j10, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HardwareUpgradeInfo) {
            HardwareUpgradeInfo hardwareUpgradeInfo = (HardwareUpgradeInfo) obj;
            return l.a(this.hardwareInfo, hardwareUpgradeInfo.hardwareInfo) && l.a(this.remark, hardwareUpgradeInfo.remark) && l.a(this.url, hardwareUpgradeInfo.url) && this.type == hardwareUpgradeInfo.type && this.size == hardwareUpgradeInfo.size && this.isForce == hardwareUpgradeInfo.isForce;
        }
        return false;
    }

    public final String getHardwareInfo() {
        return this.hardwareInfo;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final long getSize() {
        return this.size;
    }

    public final eg.a getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.hardwareInfo.hashCode() * 31;
        String str = this.remark;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a10 = t.a(this.url, (hashCode2 + hashCode) * 31, 31);
        long j10 = this.size;
        int hashCode3 = (((this.type.hashCode() + a10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        boolean z10 = this.isForce;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode3 + i10;
    }

    public final boolean isForce() {
        return this.isForce;
    }

    public String toString() {
        StringBuilder a10 = d.a("HardwareUpgradeInfo(hardwareInfo=");
        a10.append(this.hardwareInfo);
        a10.append(", remark=");
        a10.append(this.remark);
        a10.append(", url=");
        a10.append(this.url);
        a10.append(", type=");
        a10.append(this.type);
        a10.append(", size=");
        a10.append(this.size);
        a10.append(", isForce=");
        return o0.a(a10, this.isForce, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeString(this.hardwareInfo);
        parcel.writeString(this.remark);
        parcel.writeString(this.url);
        parcel.writeString(this.type.f13615a);
        parcel.writeLong(this.size);
        parcel.writeByte(this.isForce ? (byte) 1 : (byte) 0);
    }
}
