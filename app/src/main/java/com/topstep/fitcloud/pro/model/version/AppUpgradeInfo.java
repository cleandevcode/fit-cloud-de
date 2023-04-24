package com.topstep.fitcloud.pro.model.version;

import a0.a2;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import gm.l;
import kotlin.Metadata;

@Keep
@Metadata
/* loaded from: classes2.dex */
public final class AppUpgradeInfo implements Parcelable {
    public static final a CREATOR = new a();
    private final String remark;
    private final String version;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<AppUpgradeInfo> {
        @Override // android.os.Parcelable.Creator
        public final AppUpgradeInfo createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new AppUpgradeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AppUpgradeInfo[] newArray(int i10) {
            return new AppUpgradeInfo[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppUpgradeInfo(android.os.Parcel r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r2, r0)
            java.lang.String r0 = r2.readString()
            gm.l.c(r0)
            java.lang.String r2 = r2.readString()
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.version.AppUpgradeInfo.<init>(android.os.Parcel):void");
    }

    public AppUpgradeInfo(String str, String str2) {
        l.f(str, WiseOpenHianalyticsData.UNION_VERSION);
        this.version = str;
        this.remark = str2;
    }

    public static /* synthetic */ AppUpgradeInfo copy$default(AppUpgradeInfo appUpgradeInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appUpgradeInfo.version;
        }
        if ((i10 & 2) != 0) {
            str2 = appUpgradeInfo.remark;
        }
        return appUpgradeInfo.copy(str, str2);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.remark;
    }

    public final AppUpgradeInfo copy(String str, String str2) {
        l.f(str, WiseOpenHianalyticsData.UNION_VERSION);
        return new AppUpgradeInfo(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppUpgradeInfo) {
            AppUpgradeInfo appUpgradeInfo = (AppUpgradeInfo) obj;
            return l.a(this.version, appUpgradeInfo.version) && l.a(this.remark, appUpgradeInfo.remark);
        }
        return false;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = this.version.hashCode() * 31;
        String str = this.remark;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder a10 = d.a("AppUpgradeInfo(version=");
        a10.append(this.version);
        a10.append(", remark=");
        return a2.a(a10, this.remark, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeString(this.version);
        parcel.writeString(this.remark);
    }
}
