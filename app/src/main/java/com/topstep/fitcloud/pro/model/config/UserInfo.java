package com.topstep.fitcloud.pro.model.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import gm.l;
import i2.t;
import kotlin.Metadata;
import l2.o0;
import t0.e;

@Keep
@Metadata
/* loaded from: classes2.dex */
public final class UserInfo implements Parcelable {
    public static final a CREATOR = new a();
    private final String avatar;
    private final String birthday;
    private final String email;
    private final boolean hasIdentity;
    private final boolean hasPassword;
    private final float height;
    private final String identityId;
    private final String nickName;
    private final String phone;
    private final int sex;
    private final long userId;
    private final float weight;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<UserInfo> {
        @Override // android.os.Parcelable.Creator
        public final UserInfo createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new UserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UserInfo[] newArray(int i10) {
            return new UserInfo[i10];
        }
    }

    public UserInfo(long j10, String str, String str2, String str3, int i10, String str4, float f10, float f11, String str5, String str6, boolean z10, boolean z11) {
        l.f(str3, "nickName");
        l.f(str4, "birthday");
        this.userId = j10;
        this.phone = str;
        this.email = str2;
        this.nickName = str3;
        this.sex = i10;
        this.birthday = str4;
        this.height = f10;
        this.weight = f11;
        this.avatar = str5;
        this.identityId = str6;
        this.hasPassword = z10;
        this.hasIdentity = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UserInfo(android.os.Parcel r16) {
        /*
            r15 = this;
            java.lang.String r0 = "parcel"
            r1 = r16
            gm.l.f(r1, r0)
            long r2 = r16.readLong()
            java.lang.String r4 = r16.readString()
            java.lang.String r5 = r16.readString()
            java.lang.String r6 = r16.readString()
            gm.l.c(r6)
            int r7 = r16.readInt()
            java.lang.String r8 = r16.readString()
            gm.l.c(r8)
            float r9 = r16.readFloat()
            float r10 = r16.readFloat()
            java.lang.String r11 = r16.readString()
            java.lang.String r12 = r16.readString()
            byte r0 = r16.readByte()
            r13 = 1
            r14 = 0
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            byte r1 = r16.readByte()
            if (r1 == 0) goto L47
            r14 = 1
        L47:
            r1 = r15
            r13 = r0
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.config.UserInfo.<init>(android.os.Parcel):void");
    }

    public final long component1() {
        return this.userId;
    }

    public final String component10() {
        return this.identityId;
    }

    public final boolean component11() {
        return this.hasPassword;
    }

    public final boolean component12() {
        return this.hasIdentity;
    }

    public final String component2() {
        return this.phone;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.nickName;
    }

    public final int component5() {
        return this.sex;
    }

    public final String component6() {
        return this.birthday;
    }

    public final float component7() {
        return this.height;
    }

    public final float component8() {
        return this.weight;
    }

    public final String component9() {
        return this.avatar;
    }

    public final UserInfo copy(long j10, String str, String str2, String str3, int i10, String str4, float f10, float f11, String str5, String str6, boolean z10, boolean z11) {
        l.f(str3, "nickName");
        l.f(str4, "birthday");
        return new UserInfo(j10, str, str2, str3, i10, str4, f10, f11, str5, str6, z10, z11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserInfo) {
            UserInfo userInfo = (UserInfo) obj;
            return this.userId == userInfo.userId && l.a(this.phone, userInfo.phone) && l.a(this.email, userInfo.email) && l.a(this.nickName, userInfo.nickName) && this.sex == userInfo.sex && l.a(this.birthday, userInfo.birthday) && Float.compare(this.height, userInfo.height) == 0 && Float.compare(this.weight, userInfo.weight) == 0 && l.a(this.avatar, userInfo.avatar) && l.a(this.identityId, userInfo.identityId) && this.hasPassword == userInfo.hasPassword && this.hasIdentity == userInfo.hasIdentity;
        }
        return false;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getHasIdentity() {
        return this.hasIdentity;
    }

    public final boolean getHasPassword() {
        return this.hasPassword;
    }

    public final float getHeight() {
        return this.height;
    }

    public final String getIdentityId() {
        return this.identityId;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPhone() {
        return this.phone;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j10 = this.userId;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        String str = this.phone;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        String str2 = this.email;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        String str3 = this.nickName;
        int b10 = e.b(this.weight, e.b(this.height, t.a(this.birthday, (t.a(str3, (i12 + hashCode2) * 31, 31) + this.sex) * 31, 31), 31), 31);
        String str4 = this.avatar;
        if (str4 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str4.hashCode();
        }
        int i13 = (b10 + hashCode3) * 31;
        String str5 = this.identityId;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        int i14 = (i13 + i11) * 31;
        boolean z10 = this.hasPassword;
        int i15 = 1;
        int i16 = z10;
        if (z10 != 0) {
            i16 = 1;
        }
        int i17 = (i14 + i16) * 31;
        boolean z11 = this.hasIdentity;
        if (!z11) {
            i15 = z11 ? 1 : 0;
        }
        return i17 + i15;
    }

    public String toString() {
        StringBuilder a10 = d.a("UserInfo(userId=");
        a10.append(this.userId);
        a10.append(", phone=");
        a10.append(this.phone);
        a10.append(", email=");
        a10.append(this.email);
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
        a10.append(", hasPassword=");
        a10.append(this.hasPassword);
        a10.append(", hasIdentity=");
        return o0.a(a10, this.hasIdentity, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeLong(this.userId);
        parcel.writeString(this.phone);
        parcel.writeString(this.email);
        parcel.writeString(this.nickName);
        parcel.writeInt(this.sex);
        parcel.writeString(this.birthday);
        parcel.writeFloat(this.height);
        parcel.writeFloat(this.weight);
        parcel.writeString(this.avatar);
        parcel.writeString(this.identityId);
        parcel.writeByte(this.hasPassword ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasIdentity ? (byte) 1 : (byte) 0);
    }
}
