package com.topstep.fitcloud.pro.model.game.push;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import gm.l;
import i2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.o0;
import mf.u;

@Keep
@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class GameSkin implements Parcelable {
    public static final a CREATOR = new a();
    private final long binSize;
    private final String binUrl;
    private boolean existLocally;
    private final String imgUrl;
    private final int skinNum;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<GameSkin> {
        @Override // android.os.Parcelable.Creator
        public final GameSkin createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new GameSkin(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GameSkin[] newArray(int i10) {
            return new GameSkin[i10];
        }
    }

    public GameSkin(int i10, String str, long j10, String str2, boolean z10) {
        l.f(str, "binUrl");
        this.skinNum = i10;
        this.binUrl = str;
        this.binSize = j10;
        this.imgUrl = str2;
        this.existLocally = z10;
    }

    public /* synthetic */ GameSkin(int i10, String str, long j10, String str2, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, (i11 & 4) != 0 ? 0L : j10, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? false : z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GameSkin(android.os.Parcel r9) {
        /*
            r8 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r9, r0)
            int r2 = r9.readInt()
            java.lang.String r3 = r9.readString()
            gm.l.c(r3)
            long r4 = r9.readLong()
            java.lang.String r6 = r9.readString()
            byte r9 = r9.readByte()
            if (r9 == 0) goto L21
            r9 = 1
            r7 = 1
            goto L23
        L21:
            r9 = 0
            r7 = 0
        L23:
            r1 = r8
            r1.<init>(r2, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.game.push.GameSkin.<init>(android.os.Parcel):void");
    }

    public static /* synthetic */ GameSkin copy$default(GameSkin gameSkin, int i10, String str, long j10, String str2, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = gameSkin.skinNum;
        }
        if ((i11 & 2) != 0) {
            str = gameSkin.binUrl;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            j10 = gameSkin.binSize;
        }
        long j11 = j10;
        if ((i11 & 8) != 0) {
            str2 = gameSkin.imgUrl;
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            z10 = gameSkin.existLocally;
        }
        return gameSkin.copy(i10, str3, j11, str4, z10);
    }

    public final int component1() {
        return this.skinNum;
    }

    public final String component2() {
        return this.binUrl;
    }

    public final long component3() {
        return this.binSize;
    }

    public final String component4() {
        return this.imgUrl;
    }

    public final boolean component5() {
        return this.existLocally;
    }

    public final GameSkin copy(int i10, String str, long j10, String str2, boolean z10) {
        l.f(str, "binUrl");
        return new GameSkin(i10, str, j10, str2, z10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameSkin) {
            GameSkin gameSkin = (GameSkin) obj;
            return this.skinNum == gameSkin.skinNum && l.a(this.binUrl, gameSkin.binUrl) && this.binSize == gameSkin.binSize && l.a(this.imgUrl, gameSkin.imgUrl) && this.existLocally == gameSkin.existLocally;
        }
        return false;
    }

    public final long getBinSize() {
        return this.binSize;
    }

    public final String getBinUrl() {
        return this.binUrl;
    }

    public final boolean getExistLocally() {
        return this.existLocally;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final int getSkinNum() {
        return this.skinNum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int a10 = t.a(this.binUrl, this.skinNum * 31, 31);
        long j10 = this.binSize;
        int i10 = (a10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.imgUrl;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i10 + hashCode) * 31;
        boolean z10 = this.existLocally;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        return i11 + i12;
    }

    public final void setExistLocally(boolean z10) {
        this.existLocally = z10;
    }

    public String toString() {
        StringBuilder a10 = d.a("GameSkin(skinNum=");
        a10.append(this.skinNum);
        a10.append(", binUrl=");
        a10.append(this.binUrl);
        a10.append(", binSize=");
        a10.append(this.binSize);
        a10.append(", imgUrl=");
        a10.append(this.imgUrl);
        a10.append(", existLocally=");
        return o0.a(a10, this.existLocally, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeInt(this.skinNum);
        parcel.writeString(this.binUrl);
        parcel.writeLong(this.binSize);
        parcel.writeString(this.imgUrl);
        parcel.writeByte(this.existLocally ? (byte) 1 : (byte) 0);
    }
}
