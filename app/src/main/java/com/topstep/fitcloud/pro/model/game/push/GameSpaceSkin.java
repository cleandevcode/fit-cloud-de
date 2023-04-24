package com.topstep.fitcloud.pro.model.game.push;

import a1.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import gm.l;
import kotlin.Metadata;

@Keep
@Metadata
/* loaded from: classes2.dex */
public final class GameSpaceSkin implements Parcelable {
    public static final a CREATOR = new a();
    private final byte binFlag;
    private final String imgUrl;
    private final String name;
    private final int skinNum;
    private final int spaceSize;
    private final int type;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<GameSpaceSkin> {
        @Override // android.os.Parcelable.Creator
        public final GameSpaceSkin createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new GameSpaceSkin(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GameSpaceSkin[] newArray(int i10) {
            return new GameSpaceSkin[i10];
        }
    }

    public GameSpaceSkin(int i10, int i11, String str, String str2, byte b10, int i12) {
        this.type = i10;
        this.skinNum = i11;
        this.name = str;
        this.imgUrl = str2;
        this.binFlag = b10;
        this.spaceSize = i12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameSpaceSkin(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readByte(), parcel.readInt());
        l.f(parcel, "parcel");
    }

    public static /* synthetic */ GameSpaceSkin copy$default(GameSpaceSkin gameSpaceSkin, int i10, int i11, String str, String str2, byte b10, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = gameSpaceSkin.type;
        }
        if ((i13 & 2) != 0) {
            i11 = gameSpaceSkin.skinNum;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            str = gameSpaceSkin.name;
        }
        String str3 = str;
        if ((i13 & 8) != 0) {
            str2 = gameSpaceSkin.imgUrl;
        }
        String str4 = str2;
        if ((i13 & 16) != 0) {
            b10 = gameSpaceSkin.binFlag;
        }
        byte b11 = b10;
        if ((i13 & 32) != 0) {
            i12 = gameSpaceSkin.spaceSize;
        }
        return gameSpaceSkin.copy(i10, i14, str3, str4, b11, i12);
    }

    public final int component1() {
        return this.type;
    }

    public final int component2() {
        return this.skinNum;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.imgUrl;
    }

    public final byte component5() {
        return this.binFlag;
    }

    public final int component6() {
        return this.spaceSize;
    }

    public final GameSpaceSkin copy(int i10, int i11, String str, String str2, byte b10, int i12) {
        return new GameSpaceSkin(i10, i11, str, str2, b10, i12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameSpaceSkin) {
            GameSpaceSkin gameSpaceSkin = (GameSpaceSkin) obj;
            return this.type == gameSpaceSkin.type && this.skinNum == gameSpaceSkin.skinNum && l.a(this.name, gameSpaceSkin.name) && l.a(this.imgUrl, gameSpaceSkin.imgUrl) && this.binFlag == gameSpaceSkin.binFlag && this.spaceSize == gameSpaceSkin.spaceSize;
        }
        return false;
    }

    public final byte getBinFlag() {
        return this.binFlag;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSkinNum() {
        return this.skinNum;
    }

    public final int getSpaceSize() {
        return this.spaceSize;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = ((this.type * 31) + this.skinNum) * 31;
        String str = this.name;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imgUrl;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.binFlag) * 31) + this.spaceSize;
    }

    public String toString() {
        StringBuilder a10 = d.a("GameSpaceSkin(type=");
        a10.append(this.type);
        a10.append(", skinNum=");
        a10.append(this.skinNum);
        a10.append(", name=");
        a10.append(this.name);
        a10.append(", imgUrl=");
        a10.append(this.imgUrl);
        a10.append(", binFlag=");
        a10.append((int) this.binFlag);
        a10.append(", spaceSize=");
        return b.a(a10, this.spaceSize, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeInt(this.type);
        parcel.writeInt(this.skinNum);
        parcel.writeString(this.name);
        parcel.writeString(this.imgUrl);
        parcel.writeByte(this.binFlag);
        parcel.writeInt(this.spaceSize);
    }
}
