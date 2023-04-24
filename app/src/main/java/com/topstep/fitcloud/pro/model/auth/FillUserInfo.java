package com.topstep.fitcloud.pro.model.auth;

import a0.a2;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import gm.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata
/* loaded from: classes2.dex */
public final class FillUserInfo implements Parcelable {
    public static final a CREATOR = new a();
    private String avatar;
    private final String nickName;
    private final String processId;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<FillUserInfo> {
        @Override // android.os.Parcelable.Creator
        public final FillUserInfo createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new FillUserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FillUserInfo[] newArray(int i10) {
            return new FillUserInfo[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FillUserInfo(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r3, r0)
            java.lang.String r0 = r3.readString()
            gm.l.c(r0)
            java.lang.String r1 = r3.readString()
            java.lang.String r3 = r3.readString()
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.auth.FillUserInfo.<init>(android.os.Parcel):void");
    }

    public FillUserInfo(String str, String str2, String str3) {
        l.f(str, "processId");
        this.processId = str;
        this.nickName = str2;
        this.avatar = str3;
    }

    public /* synthetic */ FillUserInfo(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ FillUserInfo copy$default(FillUserInfo fillUserInfo, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fillUserInfo.processId;
        }
        if ((i10 & 2) != 0) {
            str2 = fillUserInfo.nickName;
        }
        if ((i10 & 4) != 0) {
            str3 = fillUserInfo.avatar;
        }
        return fillUserInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.processId;
    }

    public final String component2() {
        return this.nickName;
    }

    public final String component3() {
        return this.avatar;
    }

    public final FillUserInfo copy(String str, String str2, String str3) {
        l.f(str, "processId");
        return new FillUserInfo(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillUserInfo) {
            FillUserInfo fillUserInfo = (FillUserInfo) obj;
            return l.a(this.processId, fillUserInfo.processId) && l.a(this.nickName, fillUserInfo.nickName) && l.a(this.avatar, fillUserInfo.avatar);
        }
        return false;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public int hashCode() {
        int hashCode = this.processId.hashCode() * 31;
        String str = this.nickName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAvatar(String str) {
        this.avatar = str;
    }

    public String toString() {
        StringBuilder a10 = d.a("FillUserInfo(processId=");
        a10.append(this.processId);
        a10.append(", nickName=");
        a10.append(this.nickName);
        a10.append(", avatar=");
        return a2.a(a10, this.avatar, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeString(this.processId);
        parcel.writeString(this.nickName);
        parcel.writeString(this.avatar);
    }
}
