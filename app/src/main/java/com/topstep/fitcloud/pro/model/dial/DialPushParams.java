package com.topstep.fitcloud.pro.model.dial;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import androidx.annotation.Keep;
import fb.b;
import gm.l;
import i2.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import no.nordicsemi.android.dfu.DfuBaseService;
import sj.e;
import ul.s;

@Keep
@Metadata
/* loaded from: classes2.dex */
public final class DialPushParams implements Parcelable {
    public static final a CREATOR = new a();
    private final int currentDialNum;
    private final int currentPosition;
    private final List<DialSpacePacket> dialSpacePackets;
    private final String hardwareInfo;
    private final boolean isSupportCustom;
    private final boolean isSupportGUI;
    private final int lcd;
    private final String projectNum;
    private final e shape;
    private final String toolVersion;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<DialPushParams> {
        @Override // android.os.Parcelable.Creator
        public final DialPushParams createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new DialPushParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DialPushParams[] newArray(int i10) {
            return new DialPushParams[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialPushParams(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.String r0 = "parcel"
            gm.l.f(r13, r0)
            java.lang.String r2 = r13.readString()
            gm.l.c(r2)
            java.lang.String r3 = r13.readString()
            gm.l.c(r3)
            byte r0 = r13.readByte()
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            byte r5 = r13.readByte()
            if (r5 == 0) goto L26
            r5 = 1
            goto L27
        L26:
            r5 = 0
        L27:
            int r6 = r13.readInt()
            java.lang.Class<sj.e> r1 = sj.e.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r4 < r7) goto L40
            java.lang.Class<sj.e> r4 = sj.e.class
            java.lang.Object r1 = r13.readParcelable(r1, r4)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L44
        L40:
            android.os.Parcelable r1 = r13.readParcelable(r1)
        L44:
            gm.l.c(r1)
            r7 = r1
            sj.e r7 = (sj.e) r7
            java.lang.String r8 = r13.readString()
            gm.l.c(r8)
            int r9 = r13.readInt()
            int r10 = r13.readInt()
            com.topstep.fitcloud.pro.model.dial.DialSpacePacket$a r1 = com.topstep.fitcloud.pro.model.dial.DialSpacePacket.CREATOR
            java.util.ArrayList r11 = r13.createTypedArrayList(r1)
            r1 = r12
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.model.dial.DialPushParams.<init>(android.os.Parcel):void");
    }

    public DialPushParams(String str, String str2, boolean z10, boolean z11, int i10, e eVar, String str3, int i11, int i12, List<DialSpacePacket> list) {
        l.f(str, "hardwareInfo");
        l.f(str2, "projectNum");
        l.f(eVar, "shape");
        l.f(str3, "toolVersion");
        this.hardwareInfo = str;
        this.projectNum = str2;
        this.isSupportGUI = z10;
        this.isSupportCustom = z11;
        this.lcd = i10;
        this.shape = eVar;
        this.toolVersion = str3;
        this.currentDialNum = i11;
        this.currentPosition = i12;
        this.dialSpacePackets = list;
    }

    public /* synthetic */ DialPushParams(String str, String str2, boolean z10, boolean z11, int i10, e eVar, String str3, int i11, int i12, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, z11, i10, eVar, str3, i11, i12, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE) != 0 ? null : list);
    }

    public final String component1() {
        return this.hardwareInfo;
    }

    public final List<DialSpacePacket> component10() {
        return this.dialSpacePackets;
    }

    public final String component2() {
        return this.projectNum;
    }

    public final boolean component3() {
        return this.isSupportGUI;
    }

    public final boolean component4() {
        return this.isSupportCustom;
    }

    public final int component5() {
        return this.lcd;
    }

    public final e component6() {
        return this.shape;
    }

    public final String component7() {
        return this.toolVersion;
    }

    public final int component8() {
        return this.currentDialNum;
    }

    public final int component9() {
        return this.currentPosition;
    }

    public final DialPushParams copy(String str, String str2, boolean z10, boolean z11, int i10, e eVar, String str3, int i11, int i12, List<DialSpacePacket> list) {
        l.f(str, "hardwareInfo");
        l.f(str2, "projectNum");
        l.f(eVar, "shape");
        l.f(str3, "toolVersion");
        return new DialPushParams(str, str2, z10, z11, i10, eVar, str3, i11, i12, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DialPushParams) {
            DialPushParams dialPushParams = (DialPushParams) obj;
            return l.a(this.hardwareInfo, dialPushParams.hardwareInfo) && l.a(this.projectNum, dialPushParams.projectNum) && this.isSupportGUI == dialPushParams.isSupportGUI && this.isSupportCustom == dialPushParams.isSupportCustom && this.lcd == dialPushParams.lcd && l.a(this.shape, dialPushParams.shape) && l.a(this.toolVersion, dialPushParams.toolVersion) && this.currentDialNum == dialPushParams.currentDialNum && this.currentPosition == dialPushParams.currentPosition && l.a(this.dialSpacePackets, dialPushParams.dialSpacePackets);
        }
        return false;
    }

    public final List<DialSpacePacket> filterPushableSpacePackets() {
        List<DialSpacePacket> list = this.dialSpacePackets;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((DialSpacePacket) obj).getDialType() != 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return s.f28879a;
    }

    public final int getCurrentDialNum() {
        return this.currentDialNum;
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final List<DialSpacePacket> getDialSpacePackets() {
        return this.dialSpacePackets;
    }

    public final String getHardwareInfo() {
        return this.hardwareInfo;
    }

    public final int getLcd() {
        return this.lcd;
    }

    public final String getProjectNum() {
        return this.projectNum;
    }

    public final e getShape() {
        return this.shape;
    }

    public final String getToolVersion() {
        return this.toolVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int a10 = t.a(this.projectNum, this.hardwareInfo.hashCode() * 31, 31);
        boolean z10 = this.isSupportGUI;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (a10 + i11) * 31;
        boolean z11 = this.isSupportCustom;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        int hashCode2 = this.shape.hashCode();
        int a11 = (((t.a(this.toolVersion, (hashCode2 + ((((i12 + i10) * 31) + this.lcd) * 31)) * 31, 31) + this.currentDialNum) * 31) + this.currentPosition) * 31;
        List<DialSpacePacket> list = this.dialSpacePackets;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return a11 + hashCode;
    }

    public final boolean isSupportCustom() {
        return this.isSupportCustom;
    }

    public final boolean isSupportGUI() {
        return this.isSupportGUI;
    }

    public String toString() {
        StringBuilder a10 = d.a("DialPushParams(hardwareInfo=");
        a10.append(this.hardwareInfo);
        a10.append(", projectNum=");
        a10.append(this.projectNum);
        a10.append(", isSupportGUI=");
        a10.append(this.isSupportGUI);
        a10.append(", isSupportCustom=");
        a10.append(this.isSupportCustom);
        a10.append(", lcd=");
        a10.append(this.lcd);
        a10.append(", shape=");
        a10.append(this.shape);
        a10.append(", toolVersion=");
        a10.append(this.toolVersion);
        a10.append(", currentDialNum=");
        a10.append(this.currentDialNum);
        a10.append(", currentPosition=");
        a10.append(this.currentPosition);
        a10.append(", dialSpacePackets=");
        return b.a(a10, this.dialSpacePackets, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeString(this.hardwareInfo);
        parcel.writeString(this.projectNum);
        parcel.writeByte(this.isSupportGUI ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportCustom ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.lcd);
        parcel.writeParcelable(this.shape, i10);
        parcel.writeString(this.toolVersion);
        parcel.writeInt(this.currentDialNum);
        parcel.writeInt(this.currentPosition);
        parcel.writeTypedList(this.dialSpacePackets);
    }
}
