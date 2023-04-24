package com.topstep.fitcloud.pro.model.friend;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import d4.b;
import gm.l;
import i2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.u;
import no.nordicsemi.android.dfu.DfuBaseService;
import t0.e;

@Keep
@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class Friend implements Parcelable {
    public static final a CREATOR = new a();
    private final String avatar;
    private final String birthday;
    private final float height;
    private final String identityId;
    private final long lastUpdateTime;
    private final String mark;
    private final String nickName;
    private final int sex;
    private final long userId;
    private final float weight;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<Friend> {
        @Override // android.os.Parcelable.Creator
        public final Friend createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new Friend(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Friend[] newArray(int i10) {
            return new Friend[i10];
        }
    }

    public Friend(long j10, String str, int i10, String str2, float f10, float f11, String str3, String str4, String str5, long j11) {
        l.f(str2, "birthday");
        l.f(str4, "identityId");
        this.userId = j10;
        this.nickName = str;
        this.sex = i10;
        this.birthday = str2;
        this.height = f10;
        this.weight = f11;
        this.avatar = str3;
        this.identityId = str4;
        this.mark = str5;
        this.lastUpdateTime = j11;
    }

    public /* synthetic */ Friend(long j10, String str, int i10, String str2, float f10, float f11, String str3, String str4, String str5, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? 0.0f : f10, (i11 & 32) != 0 ? 0.0f : f11, (i11 & 64) != 0 ? null : str3, str4, (i11 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? null : str5, (i11 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? 0L : j11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Friend(android.os.Parcel r15) {
        /*
            r14 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r15, r0)
            long r2 = r15.readLong()
            java.lang.String r4 = r15.readString()
            int r5 = r15.readInt()
            java.lang.String r6 = r15.readString()
            gm.l.c(r6)
            float r7 = r15.readFloat()
            float r8 = r15.readFloat()
            java.lang.String r9 = r15.readString()
            java.lang.String r10 = r15.readString()
            gm.l.c(r10)
            java.lang.String r11 = r15.readString()
            long r12 = r15.readLong()
            r1 = r14
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.friend.Friend.<init>(android.os.Parcel):void");
    }

    public final long component1() {
        return this.userId;
    }

    public final long component10() {
        return this.lastUpdateTime;
    }

    public final String component2() {
        return this.nickName;
    }

    public final int component3() {
        return this.sex;
    }

    public final String component4() {
        return this.birthday;
    }

    public final float component5() {
        return this.height;
    }

    public final float component6() {
        return this.weight;
    }

    public final String component7() {
        return this.avatar;
    }

    public final String component8() {
        return this.identityId;
    }

    public final String component9() {
        return this.mark;
    }

    public final Friend copy(long j10, String str, int i10, String str2, float f10, float f11, String str3, String str4, String str5, long j11) {
        l.f(str2, "birthday");
        l.f(str4, "identityId");
        return new Friend(j10, str, i10, str2, f10, f11, str3, str4, str5, j11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Friend) {
            Friend friend = (Friend) obj;
            return this.userId == friend.userId && l.a(this.nickName, friend.nickName) && this.sex == friend.sex && l.a(this.birthday, friend.birthday) && Float.compare(this.height, friend.height) == 0 && Float.compare(this.weight, friend.weight) == 0 && l.a(this.avatar, friend.avatar) && l.a(this.identityId, friend.identityId) && l.a(this.mark, friend.mark) && this.lastUpdateTime == friend.lastUpdateTime;
        }
        return false;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getDisplayName() {
        String str = this.mark;
        return str == null || str.length() == 0 ? this.nickName : this.mark;
    }

    public final float getHeight() {
        return this.height;
    }

    public final String getIdentityId() {
        return this.identityId;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public final String getMark() {
        return this.mark;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final int getSex() {
        return this.sex;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.userId;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.nickName;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b10 = e.b(this.weight, e.b(this.height, t.a(this.birthday, (((i10 + hashCode) * 31) + this.sex) * 31, 31), 31), 31);
        String str2 = this.avatar;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a10 = t.a(this.identityId, (b10 + hashCode2) * 31, 31);
        String str3 = this.mark;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        long j11 = this.lastUpdateTime;
        return ((a10 + i11) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public String toString() {
        StringBuilder a10 = d.a("Friend(userId=");
        a10.append(this.userId);
        a10.append(", nickName=");
        a10.append(this.nickName);
        a10.append(", sex=");
        a10.append(this.sex);
        a10.append(", birthday=");
        a10.append(this.birthday);
        a10.append(", height=");
        a10.append(this.height);
        a10.append(", weight=");
        a10.append(this.weight);
        a10.append(", avatar=");
        a10.append(this.avatar);
        a10.append(", identityId=");
        a10.append(this.identityId);
        a10.append(", mark=");
        a10.append(this.mark);
        a10.append(", lastUpdateTime=");
        return b.a(a10, this.lastUpdateTime, ')');
    }

    public final UserInfo toUserInfo() {
        long j10 = this.userId;
        String str = this.nickName;
        if (str == null) {
            str = "";
        }
        return new UserInfo(j10, null, null, str, this.sex, this.birthday, this.height, this.weight, this.avatar, this.identityId, false, false);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeLong(this.userId);
        parcel.writeString(this.nickName);
        parcel.writeInt(this.sex);
        parcel.writeString(this.birthday);
        parcel.writeFloat(this.height);
        parcel.writeFloat(this.weight);
        parcel.writeString(this.avatar);
        parcel.writeString(this.identityId);
        parcel.writeString(this.mark);
        parcel.writeLong(this.lastUpdateTime);
    }
}
