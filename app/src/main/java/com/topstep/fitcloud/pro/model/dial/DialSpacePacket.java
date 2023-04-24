package com.topstep.fitcloud.pro.model.dial;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import fb.b;
import gm.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import no.nordicsemi.android.dfu.DfuBaseService;

@Keep
@Metadata
/* loaded from: classes2.dex */
public final class DialSpacePacket implements Parcelable {
    public static final a CREATOR = new a();
    private final byte binFlag;
    private final List<DialComponent> components;
    private final String deviceImgUrl;
    private final int dialBinVersion;
    private final int dialNum;
    private final byte dialType;
    private final String imgUrl;
    private final String previewImgUrl;
    private final int spaceSize;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<DialSpacePacket> {
        @Override // android.os.Parcelable.Creator
        public final DialSpacePacket createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new DialSpacePacket(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DialSpacePacket[] newArray(int i10) {
            return new DialSpacePacket[i10];
        }
    }

    public DialSpacePacket(byte b10, int i10, int i11, byte b11, int i12, String str, String str2, String str3, List<DialComponent> list) {
        this.dialType = b10;
        this.dialNum = i10;
        this.dialBinVersion = i11;
        this.binFlag = b11;
        this.spaceSize = i12;
        this.imgUrl = str;
        this.deviceImgUrl = str2;
        this.previewImgUrl = str3;
        this.components = list;
    }

    public /* synthetic */ DialSpacePacket(byte b10, int i10, int i11, byte b11, int i12, String str, String str2, String str3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, i10, i11, b11, i12, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? null : str2, (i13 & 128) != 0 ? null : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 ? null : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialSpacePacket(Parcel parcel) {
        this(parcel.readByte(), parcel.readInt(), parcel.readInt(), parcel.readByte(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createTypedArrayList(DialComponent.CREATOR));
        l.f(parcel, "parcel");
    }

    public final byte component1() {
        return this.dialType;
    }

    public final int component2() {
        return this.dialNum;
    }

    public final int component3() {
        return this.dialBinVersion;
    }

    public final byte component4() {
        return this.binFlag;
    }

    public final int component5() {
        return this.spaceSize;
    }

    public final String component6() {
        return this.imgUrl;
    }

    public final String component7() {
        return this.deviceImgUrl;
    }

    public final String component8() {
        return this.previewImgUrl;
    }

    public final List<DialComponent> component9() {
        return this.components;
    }

    public final DialSpacePacket copy(byte b10, int i10, int i11, byte b11, int i12, String str, String str2, String str3, List<DialComponent> list) {
        return new DialSpacePacket(b10, i10, i11, b11, i12, str, str2, str3, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialSpacePacket) {
            DialSpacePacket dialSpacePacket = (DialSpacePacket) obj;
            return this.dialType == dialSpacePacket.dialType && this.dialNum == dialSpacePacket.dialNum && this.dialBinVersion == dialSpacePacket.dialBinVersion && this.binFlag == dialSpacePacket.binFlag && this.spaceSize == dialSpacePacket.spaceSize && l.a(this.imgUrl, dialSpacePacket.imgUrl) && l.a(this.deviceImgUrl, dialSpacePacket.deviceImgUrl) && l.a(this.previewImgUrl, dialSpacePacket.previewImgUrl) && l.a(this.components, dialSpacePacket.components);
        }
        return false;
    }

    public final byte getBinFlag() {
        return this.binFlag;
    }

    public final List<DialComponent> getComponents() {
        return this.components;
    }

    public final String getDeviceImgUrl() {
        return this.deviceImgUrl;
    }

    public final int getDialBinVersion() {
        return this.dialBinVersion;
    }

    public final int getDialNum() {
        return this.dialNum;
    }

    public final byte getDialType() {
        return this.dialType;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getPreviewImgUrl() {
        return this.previewImgUrl;
    }

    public final int getSpaceSize() {
        return this.spaceSize;
    }

    public int hashCode() {
        int i10 = ((((((((this.dialType * 31) + this.dialNum) * 31) + this.dialBinVersion) * 31) + this.binFlag) * 31) + this.spaceSize) * 31;
        String str = this.imgUrl;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceImgUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.previewImgUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<DialComponent> list = this.components;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a10 = d.a("DialSpacePacket(dialType=");
        a10.append((int) this.dialType);
        a10.append(", dialNum=");
        a10.append(this.dialNum);
        a10.append(", dialBinVersion=");
        a10.append(this.dialBinVersion);
        a10.append(", binFlag=");
        a10.append((int) this.binFlag);
        a10.append(", spaceSize=");
        a10.append(this.spaceSize);
        a10.append(", imgUrl=");
        a10.append(this.imgUrl);
        a10.append(", deviceImgUrl=");
        a10.append(this.deviceImgUrl);
        a10.append(", previewImgUrl=");
        a10.append(this.previewImgUrl);
        a10.append(", components=");
        return b.a(a10, this.components, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeByte(this.dialType);
        parcel.writeInt(this.dialNum);
        parcel.writeInt(this.dialBinVersion);
        parcel.writeByte(this.binFlag);
        parcel.writeInt(this.spaceSize);
        parcel.writeString(this.imgUrl);
        parcel.writeString(this.deviceImgUrl);
        parcel.writeString(this.previewImgUrl);
        parcel.writeTypedList(this.components);
    }
}
